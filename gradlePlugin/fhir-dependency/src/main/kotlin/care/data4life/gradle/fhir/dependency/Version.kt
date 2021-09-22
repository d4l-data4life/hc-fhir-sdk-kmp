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
    const val kotlin = "1.5.21"

    object GradlePlugin {
        const val kotlin = Version.kotlin
        const val android = "7.0.2"
    }

    object Multiplatform {

        val kotlin = Kotlin
        val d4l = D4L

        object Kotlin {
            /**
             * [Coroutines](https://github.com/Kotlin/kotlinx.coroutines)
             */
            const val coroutines = "1.4.3-native-mt"

            /**
             * [Serialization](https://github.com/Kotlin/kotlinx.serialization)
             */
            const val serialization = "1.0.1"

            /**
             * [DateTime](https://github.com/Kotlin/kotlinx-datetime)
             */
            const val dateTime = "0.1.1"
        }

        object D4L {
            /**
             * [hc-util-kmp](https://github.com/d4l-data4life/hc-util-kmp)
             */
            const val utilSdk = "1.8.0"
        }

        /**
         * [Koin](https://github.com/InsertKoinIO/koin)
         */
        const val koin = "3.0.1"
    }

    object MultiplatformTest {
        /**
         * [mockk](http://mockk.io)
         */
        const val mockK = "1.10.6"
    }

    object Jvm {
        // Crypto
        /**
         * [BouncyCastle](http://www.bouncycastle.org/java.html)
         */
        const val bouncyCastle = "1.64"
    }

    object JvmTest {
        const val jUnit = "4.13.2"

        const val jsonAssert = "1.5.0"
    }

    object Android {

        val androidX = AndroidX

        /**
         * [Android Desugar](https://developer.android.com/studio/write/java8-support)
         */
        const val androidDesugar = "1.0.9"

        object AndroidX {
            /**
             * [AndroidX](https://developer.android.com/jetpack/androidx)
             */
            const val core = "1.1.0"
            const val ktx = "1.3.2"
            const val appCompat = "1.3.0"
            const val browser = "1.2.0"

            const val constraintLayout = "2.0.1"

            const val lifecycle = "2.1.0"
            const val navigation = "2.2.0"
        }

        /**
         * [Material Android](https://github.com/material-components/material-components-android)
         */
        const val material = "1.3.0"
    }

    object AndroidTest {
        /**
         * [Android Testing](https://developer.android.com/testing)
         */
        const val androidXTestCore = "1.4.0"
        const val androidXTestJunit = "1.1.2"
        const val androidXEspresso = "3.4.0"
        const val androidXUiAutomator = "2.2.0"

        /**
         * [Robolectric](https://github.com/robolectric/robolectric)
         */
        const val robolectric = "4.5.1"
    }
}
