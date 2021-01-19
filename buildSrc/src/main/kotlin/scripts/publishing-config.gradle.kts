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
import org.gradle.api.publish.maven.MavenPublication

plugins {
    `maven-publish`
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url =
                uri("https://maven.pkg.github.com/${LibraryConfig.githubOwner}/${LibraryConfig.githubRepository}")
            credentials {
                username = (project.findProperty("gpr.user")
                    ?: System.getenv("PACKAGE_REGISTRY_USERNAME")).toString()
                password = (project.findProperty("gpr.key")
                    ?: System.getenv("PACKAGE_REGISTRY_TOKEN")).toString()
            }
        }

        val target = "file://${project.buildDir}/gitPublish"

        maven {
            name = "ReleasePackages"
            url = uri("$target/releases")
        }

        maven {
            name = "SnapshotPackages"
            url = uri("$target/snapshots")
        }

        maven {
            name = "FeaturePackages"
            url = uri("$target/features")
        }
    }

    publications {
        withType<MavenPublication> {
            groupId = LibraryConfig.publish.groupId

            pom {
                name.set(LibraryConfig.publish.name)
                description.set(LibraryConfig.publish.description)
                url.set(LibraryConfig.publish.url)
                inceptionYear.set(LibraryConfig.publish.year)

                licenses {
                    license {
                        name.set(LibraryConfig.publish.licenseName)
                        url.set(LibraryConfig.publish.licenseUrl)
                        distribution.set(LibraryConfig.publish.licenseDistribution)
                    }
                }

                developers {
                    developer {
                        id.set(LibraryConfig.publish.developerId)
                        name.set(LibraryConfig.publish.developerName)
                        email.set(LibraryConfig.publish.developerEmail)
                    }
                }

                scm {
                    connection.set(LibraryConfig.publish.scmConnection)
                    developerConnection.set(LibraryConfig.publish.scmDeveloperConnection)
                    url.set(LibraryConfig.publish.scmUrl)
                }
            }
        }
    }
}
