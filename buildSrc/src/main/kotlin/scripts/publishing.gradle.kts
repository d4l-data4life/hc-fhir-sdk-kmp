/*
 * Copyright (c) 2021 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package scripts

import LibraryConfig
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.api.ResetCommand
import org.eclipse.jgit.transport.PushResult
import org.eclipse.jgit.transport.RemoteRefUpdate
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider

/**
 * Usage:
 *
 * You need to add following dependencies to the buildSrc/build.gradle.kts
 *
 * dependencies {
 *     implementation("org.eclipse.jgit:org.eclipse.jgit:5.11.0.202103091610-r")
 * }
 *
 * and ensure that the mavenCentral repository is available
 *
 * repositories {
 *     mavenCentral()
 * }
 *
 * Now just add id("scripts.publishing") to your rootProject build.gradle.kts plugins
 *
 * plugins {
 *     id("scripts.publishing")
 * }
 *
 * To publish to to https://github.com/d4l-data4life/maven-features/ just run:
 * - ./gradlew publishFeature
 * To publish to to https://github.com/d4l-data4life/maven-snapshots/ just run:
 * - ./gradlew publishSnapshot
 * To publish to to https://github.com/d4l-data4life/maven-releases/ just run:
 * - ./gradlew publishRelease
 *
 * This requires publishing-config.gradle.kts!
 */

val taskGroup = "publishing"

val featureRepoName = "maven-features"
val snapshotRepoName = "maven-snapshots"
val releaseRepoName = "maven-releases"

val basePath = "${rootProject.buildDir}/gitPublish"

val gitHubToken = (project.findProperty("gpr.key")
    ?: System.getenv("PACKAGE_REGISTRY_TOKEN")).toString()

// Git Checkout
val gitPublishCheckoutFeature: Task by tasks.creating() {
    group = taskGroup
    doLast { gitClone(featureRepoName) }
}

val gitPublishCheckoutSnapshot: Task by tasks.creating() {
    group = taskGroup
    doLast { gitClone(snapshotRepoName) }
}

val gitPublishCheckoutRelease: Task by tasks.creating() {
    group = taskGroup
    doLast { gitClone(releaseRepoName) }
}

// Git Update
val gitPublishUpdateFeature: Task by tasks.creating() {
    group = taskGroup
    doLast { gitUpdate(featureRepoName) }
    mustRunAfter(gitPublishCheckoutFeature)
}

val gitPublishUpdateSnapshot: Task by tasks.creating() {
    group = taskGroup
    doLast { gitUpdate(snapshotRepoName) }
    mustRunAfter(gitPublishCheckoutSnapshot)
}

val gitPublishUpdateRelease: Task by tasks.creating() {
    group = taskGroup
    doLast { gitUpdate(releaseRepoName) }
    mustRunAfter(gitPublishCheckoutRelease)
}

// Publish tasks
val publishToPackagesRepositoryFeature: Task by tasks.creating() {
    dependsOn(":fhir:publishAllPublicationsToFeaturePackagesRepository")
    mustRunAfter(gitPublishCheckoutFeature, gitPublishUpdateFeature)
}

val publishToPackagesRepositorySnapshot: Task by tasks.creating() {
    dependsOn(":fhir:publishAllPublicationsToSnaphotPackagesRepository")
    mustRunAfter(gitPublishCheckoutSnapshot, gitPublishUpdateSnapshot)
}

val publishToPackagesRepositoryRelease: Task by tasks.creating() {
    dependsOn(":fhir:publishAllPublicationsToReleasePackagesRepository")
    mustRunAfter(gitPublishCheckoutRelease, gitPublishUpdateRelease)
}

// Git Commit
val gitPublishCommitFeature: Task by tasks.creating() {
    group = taskGroup
    doLast { gitCommit(featureRepoName) }
    mustRunAfter(
        gitPublishCheckoutFeature,
        gitPublishUpdateFeature,
        publishToPackagesRepositoryFeature,
    )
}

val gitPublishCommitSnapshot: Task by tasks.creating() {
    group = taskGroup
    doLast { gitCommit(snapshotRepoName) }
    mustRunAfter(
        gitPublishCheckoutSnapshot,
        gitPublishUpdateSnapshot,
        publishToPackagesRepositorySnapshot,
    )
}

val gitPublishCommitRelease: Task by tasks.creating() {
    group = taskGroup
    doLast { gitCommit(releaseRepoName) }
    mustRunAfter(
        gitPublishCheckoutRelease,
        gitPublishUpdateRelease,
        publishToPackagesRepositoryRelease,
    )
}

// Git Push
val gitPublishPushFeature: Task by tasks.creating() {
    group = taskGroup
    doLast { gitPush(featureRepoName) }
    mustRunAfter(
        gitPublishCheckoutFeature,
        gitPublishUpdateFeature,
        publishToPackagesRepositoryFeature,
        gitPublishCommitFeature,
    )
}

val gitPublishPushSnapshot: Task by tasks.creating() {
    group = taskGroup
    doLast { gitPush(snapshotRepoName) }
    mustRunAfter(
        gitPublishCheckoutSnapshot,
        gitPublishUpdateSnapshot,
        publishToPackagesRepositorySnapshot,
        gitPublishCommitSnapshot,
    )
}

val gitPublishPushRelease: Task by tasks.creating() {
    group = taskGroup
    doLast { gitPush(releaseRepoName) }
    mustRunAfter(
        gitPublishCheckoutRelease,
        gitPublishUpdateRelease,
        publishToPackagesRepositoryRelease,
        gitPublishCommitFeature,
    )
}

// Git calls
fun gitClone(repositoryName: String) {
    try {
        gitUpdate(repositoryName)
    } catch (exception: Exception) {
        Git.cloneRepository()
            .setURI("https://github.com/d4l-data4life/$repositoryName.git")
            .setCredentialsProvider(UsernamePasswordCredentialsProvider(gitHubToken, ""))
            .setDirectory(File("$basePath/$repositoryName"))
            .call()
    }
}

fun gitUpdate(repositoryName: String) {
    val git = Git.open(File("$basePath/$repositoryName"))

    git.fetch()
        .setForceUpdate(true)
        .setCredentialsProvider(UsernamePasswordCredentialsProvider(gitHubToken, ""))
        .call()

    git.reset()
        .setMode(ResetCommand.ResetType.HARD)
        .setRef("origin/main")
        .call()
}

fun gitCommit(repositoryName: String) {
    val git = Git.open(File("$basePath/$repositoryName"))

    git.add().addFilepattern(".").call()

    git.commit()
        .setMessage("Publish ${LibraryConfig.name} ${project.version}")
        .call()
}

fun gitPush(repositoryName: String) {
    val git = Git.open(File("$basePath/$repositoryName"))

    val results: Iterable<PushResult> = git.push()
        .setCredentialsProvider(UsernamePasswordCredentialsProvider(gitHubToken, ""))
        .call()

    results.forEach { result ->
        (result.remoteUpdates as Collection<RemoteRefUpdate>).forEach { update ->
            if (
                update.status == RemoteRefUpdate.Status.REJECTED_NONFASTFORWARD
                || update.status == RemoteRefUpdate.Status.REJECTED_REMOTE_CHANGED
                || update.status == RemoteRefUpdate.Status.REJECTED_NODELETE
                || update.status == RemoteRefUpdate.Status.REJECTED_OTHER_REASON
            ) {
                println(update.status)
                throw IllegalStateException("Remote advanced! Please update first")
            }
        }
    }
}

// Publish Tasks

val publishFeature: Task by tasks.creating() {
    group = taskGroup
    dependsOn(
        gitPublishCheckoutFeature,
        gitPublishUpdateFeature,
        publishToPackagesRepositoryFeature,
        gitPublishCommitFeature,
        gitPublishPushFeature
    )
}

val publishSnapshot: Task by tasks.creating() {
    group = taskGroup
    dependsOn(
        gitPublishCheckoutSnapshot,
        gitPublishUpdateSnapshot,
        publishToPackagesRepositorySnapshot,
        gitPublishCommitSnapshot,
        gitPublishPushSnapshot
    )
}

val publishRelease: Task by tasks.creating() {
    group = taskGroup
    dependsOn(
        gitPublishCheckoutRelease,
        gitPublishUpdateRelease,
        publishToPackagesRepositoryRelease,
        gitPublishCommitRelease,
        gitPublishPushRelease
    )
}
