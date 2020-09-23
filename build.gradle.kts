buildscript {
    repositories {
        mavenCentral()
        google()
        jcenter()
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
    gradleVersion = "6.6.1"
    distributionType = Wrapper.DistributionType.ALL
}
