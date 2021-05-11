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

object Versions {

    // Gradle Plugin
    object GradlePlugins {
        const val kotlin = Versions.kotlin
        const val android = "4.2.0"
    }

    // Kotlin
    // https://github.com/JetBrains/kotlin
    const val kotlin = "1.4.32"
    const val kotlinGradlePlugin = kotlin

    // https://github.com/Kotlin/kotlinx.coroutines
    const val kotlinCoroutines = "1.4.3-native-mt"

    // https://github.com/Kotlin/kotlinx.serialization
    const val kotlinSerialization = "1.1.0"

    // https://github.com/Kotlin/kotlinx-datetime
    const val dateTime = "0.2.0"

    // Android
    // https://developer.android.com/studio/write/java8-support
    const val androidDesugar = "1.0.4"

    // AndroidX
    // https://developer.android.com/jetpack/androidx
    const val androidX = "1.1.0"
    const val androidXKtx = "1.3.2"
    const val androidXAppCompat = "1.2.0"

    const val androidXConstraintLayout = "2.0.4"

    const val androidXLifecycle = "2.1.0"
    const val androidXNavigation = "2.2.0"

    // https://developer.android.com/testing
    const val androidXTest = "1.1.2"
    const val androidXEspresso = "3.3.0"
    const val androidXUiAutomator = "2.2.0"

    // Material
    /**
     * [Material Android](https://github.com/material-components/material-components-android)
     */
    const val material = "1.2.0"

    // Injection
    /**
     * [Koin](https://github.com/InsertKoinIO/koin)
     */
    const val koin = "3.0.0-alpha-9"

    // Junit Test
    const val testJUnit = "4.13.2"

    const val jsonAssert = "1.5.0"

    /**
     * [mockk](http://mockk.io)
     */
    const val testMockk = "1.11.0"

    /**
     * [Hamkrest](https://github.com/npryce/hamkrest)
     *
     * there is no official multi platform release yet
     */
    const val testHamkrest = "63c8e84dd1"
}
