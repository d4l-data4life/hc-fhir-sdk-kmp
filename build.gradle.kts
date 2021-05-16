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

    id("scripts.dependency-updates")
    id("scripts.download-scripts")
    id("scripts.publishing")
    id("scripts.quality-spotless")
    id("scripts.versioning")
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "7.0.2"
    distributionType = Wrapper.DistributionType.ALL
}
