buildscript {
    repositories {
        mavenCentral()
        google()
        jcenter()
        maven("https://dl.bintray.com/data4life/maven")
    }
    dependencies {
        classpath(GradlePlugins.kotlin)
        classpath(GradlePlugins.android)
    }
}

plugins {
    kotlinMultiplatform(false)
    kotlinSerialization(false)

    dependencyUpdates()

    id("scripts.versioning")
    id("scripts.publishing")
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
    }
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "6.7.1"
    distributionType = Wrapper.DistributionType.ALL
}
