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

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "6.8.2"
    distributionType = Wrapper.DistributionType.ALL
}
