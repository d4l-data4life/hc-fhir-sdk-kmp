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

package care.data4life.gradle.fhir.dependency

object Version {

    val gradlePlugin = GradlePlugin
    val multiplatform = Multiplatform
    val multiplatformTest = MultiplatformTest
    val jvm = Jvm
    val jvmTest = JvmTest
    val android = Android
    val androidTest = AndroidTest

    /**
     * [Kotlin](https://github.com/JetBrains/kotlin)
     */
    const val kotlin = "1.7.10"

    object GradlePlugin {
        const val kotlin = Version.kotlin
        const val android = "7.2.2"
    }

    object Multiplatform {

        val kotlin = Kotlin

        object Kotlin {
            /**
             * [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
             */
            const val coroutines = "1.6.3-native-mt"

            /**
             * [Serialization](https://github.com/Kotlin/kotlinx.serialization)
             */
            const val serialization = "1.3.3"

            /**
             * [DateTime](https://github.com/Kotlin/kotlinx-datetime)
             */
            const val dateTime = "0.4.0"
        }

        /**
         * [Koin](https://github.com/InsertKoinIO/koin)
         */
        const val koin = "3.1.6"
    }

    object MultiplatformTest {
        /**
         * [mockk](http://mockk.io)
         */
        const val mockK = "1.12.5"
    }

    object Jvm {
        // Crypto
        /**
         * [BouncyCastle](http://www.bouncycastle.org/java.html)
         */
        const val bouncyCastle = "1.71"
    }

    object JvmTest {
        const val jUnit = "4.13.2"

        const val jsonAssert = "1.5.1"
    }

    object Android {

        val androidX = AndroidX

        /**
         * [Android Desugar](https://developer.android.com/studio/write/java8-support)
         */
        const val androidDesugar = "1.1.5"

        object AndroidX {
            /**
             * [AndroidX](https://developer.android.com/jetpack/androidx)
             */
            const val ktx = "1.8.0"
            const val appCompat = "1.5.0"
            const val browser = "1.4.0"

            const val constraintLayout = "2.1.4"

            const val lifecycle = "2.5.1"
            const val navigation = "2.5.1"
        }

        /**
         * [Material Android](https://github.com/material-components/material-components-android)
         */
        const val material = "1.6.1"
    }

    object AndroidTest {
        /**
         * [Android Testing](https://developer.android.com/testing)
         */
        const val androidXTestCore = "1.4.0"
        const val androidXTestJunit = "1.1.3"
        const val androidXEspresso = "3.4.0"
        const val androidXUiAutomator = "2.2.0"

        /**
         * [Robolectric](https://github.com/robolectric/robolectric)
         */
        const val robolectric = "4.8.1"
    }
}
