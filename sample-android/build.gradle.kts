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

import care.data4life.gradle.fhir.dependency.Dependency
import care.data4life.gradle.fhir.config.AppConfig

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

group = AppConfig.group

android {
    compileSdkVersion(AppConfig.android.compileSdkVersion)

    defaultConfig {
        applicationId = AppConfig.android.applicationId

        minSdkVersion(AppConfig.android.minSdkVersion)
        targetSdkVersion(AppConfig.android.targetSdkVersion)

        versionCode = AppConfig.android.versionCode
        versionName = AppConfig.android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments(
            mapOf(
                "clearPackageData" to "true"
            )
        )
    }

    compileOptions {
        // Flag to enable support for the new language APIs
        isCoreLibraryDesugaringEnabled = false

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lintOptions {
        isAbortOnError = false
    }

    buildFeatures {
        compose = false
    }

    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/NOTICE")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/*.kotlin_module")
    }

    useLibrary("android.test.runner")
    useLibrary("android.test.base")
    useLibrary("android.test.mock")

    testOptions {
        animationsDisabled = true

        unitTests.all {
            it.testLogging {
                events("passed", "skipped", "failed", "standardOut", "standardError")
            }
        }

        // FIXME Test Orchestrator is currently broken and results in no tests found
        // execution = "ANDROIDX_TEST_ORCHESTRATOR"
    }
}

dependencies {
    coreLibraryDesugaring(Dependency.android.desugar)

    implementation(project(":fhir"))

    implementation(Dependency.android.kotlinStdLib)
    implementation(Dependency.android.kotlinCoroutinesCore)

    implementation(Dependency.android.androidX.ktx)
    implementation(Dependency.android.androidX.appCompat)
    implementation(Dependency.android.androidX.constraintLayout)

    testImplementation(Dependency.jvmTest.junit)
    androidTestImplementation(Dependency.androidTest.junit)
    androidTestImplementation(Dependency.androidTest.espressoCore)
}
