buildscript {
    repositories {
        mavenCentral()
        google()
        jcenter()
    }
    dependencies {
        classpath(GradlePlugins.kotlin)
        classpath(GradlePlugins.android)

        classpath(Dependencies.GradlePlugin.sqlDelight)
        classpath(Dependencies.kotlin.serialization)
    }
}

plugins {
    kotlinMultiplatform(false)
    kotlinSerialization(false)

    dependencyUpdates()
}

allprojects {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        jcenter()

        maven("https://kotlin.bintray.com/kotlin")
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://jitpack.io")
        maven(url = "https://dl.bintray.com/touchlabpublic/kotlin")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "6.6.1"
    distributionType = Wrapper.DistributionType.ALL
}
