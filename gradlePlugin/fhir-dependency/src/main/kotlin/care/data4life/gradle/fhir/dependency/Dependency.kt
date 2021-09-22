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

import care.data4life.gradle.fhir.dependency.Version

object Dependency {

    val kotlin = Kotlin
    val multiplatform = Multiplatform
    val multiplatformTest = MultiplatformTest
    val jvm = Jvm
    val jvmTest = JvmTest
    val android = Android
    val androidTest = AndroidTest

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin}"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Version.kotlin}"
    }

    object Multiplatform {

        val kotlin = Kotlin
        val d4l = D4L
        val koin = Koin

        object Kotlin {

            val stdLib = StdLib
            val coroutines = Coroutines
            val serialization = Serialization

            object StdLib {
                const val common = "org.jetbrains.kotlin:kotlin-stdlib-common:${Version.kotlin}"
                const val jdk = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
                const val jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
                const val js = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
                const val native = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
                const val android = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
            }

            object Coroutines {
                const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Multiplatform.Kotlin.coroutines}"
                const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.Multiplatform.Kotlin.coroutines}"
                const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.Multiplatform.Kotlin.coroutines}"
            }

            object Serialization {
                const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Version.Multiplatform.Kotlin.serialization}"
            }

            const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Version.Multiplatform.Kotlin.dateTime}"
        }

        object D4L {

            val util = Util

            object Util {
                const val common = "care.data4life.hc-util-sdk-kmp:util:${Version.Multiplatform.D4L.utilSdk}"
                const val android = "care.data4life.hc-util-sdk-kmp:util-android:${Version.Multiplatform.D4L.utilSdk}"
                const val jvm = "care.data4life.hc-util-sdk-kmp:util-jvm:${Version.Multiplatform.D4L.utilSdk}"
            }
        }

        object Koin {
            // https://github.com/InsertKoinIO/koin
            const val commonCore = "org.koin:koin-core:${Version.Multiplatform.koin}"
            const val commonCoreExt = "org.koin:koin-core-ext:${Version.Multiplatform.koin}"
            const val test = "org.koin:koin-test:${Version.Multiplatform.koin}"
            const val androidScope = "org.koin:koin-androidx-scope:${Version.Multiplatform.koin}"
            const val androidViewModel = "org.koin:koin-androidx-viewmodel:${Version.Multiplatform.koin}"
            const val androidFragment = "org.koin:koin-androidx-fragment:${Version.Multiplatform.koin}"
            const val androidExt = "org.koin:koin-androidx-ext:${Version.Multiplatform.koin}"
            const val tor = "org.koin:koin-tor:${Version.Multiplatform.koin}"
        }
    }

    object MultiplatformTest {

        val kotlin = Kotlin
        val mockK = MockK

        object Kotlin {
            const val common = "org.jetbrains.kotlin:kotlin-test-common:${Version.kotlin}"
            const val commonAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Version.kotlin}"
            const val jvm = "org.jetbrains.kotlin:kotlin-test:${Version.kotlin}"
            const val jvmJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}"
        }

        object MockK {
            const val common = "io.mockk:mockk-common:${Version.MultiplatformTest.mockK}"
            const val junit = "io.mockk:mockk:${Version.MultiplatformTest.mockK}"
            const val androidTestInstrumentation = "io.mockk:mockk-android:${Version.MultiplatformTest.mockK}"
        }
    }

    object Jvm {
        // Crypto
        const val bouncyCastleJdk15 = "org.bouncycastle:bcprov-jdk15on:${Version.Jvm.bouncyCastle}"
    }

    object JvmTest {
        const val junit = "junit:junit:${Version.JvmTest.jUnit}"

        const val jsonAssert = "org.skyscreamer:jsonassert:${Version.JvmTest.jsonAssert}"
    }

    object Android {

        val androidX = AndroidX

        // Kotlin
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
        const val kotlinCoroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.Multiplatform.Kotlin.coroutines}"

        // Android
        const val desugar = "com.android.tools:desugar_jdk_libs:${Version.Android.androidDesugar}"

        object AndroidX {
            const val ktx = "androidx.core:core-ktx:${Version.Android.AndroidX.ktx}"
            const val appCompat = "androidx.appcompat:appcompat:${Version.Android.AndroidX.appCompat}"
            const val browser = "androidx.browser:browser:${Version.Android.AndroidX.browser}"

            // Layout
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.Android.AndroidX.constraintLayout}"

            // Lifecylce
            const val lifecylceCommonJava8 =
                "androidx.lifecycle:lifecycle-common-java8:${Version.Android.AndroidX.lifecycle}"
            const val lifecylceExtensions =
                "androidx.lifecycle:lifecycle-extensions:${Version.Android.AndroidX.lifecycle}"

            // Navigation
            const val navigationFragmentKtx =
                "androidx.navigation:navigation-fragment-ktx:${Version.Android.AndroidX.navigation}"
            const val navigationUiKtx =
                "androidx.navigation:navigation-ui-ktx:${Version.Android.AndroidX.navigation}"
        }

        // Material
        const val material = "com.google.android.material:material:${Version.Android.material}"
    }

    object AndroidTest {
        const val core = "androidx.test:core:${Version.AndroidTest.androidXTestCore}"
        const val runner = "androidx.test:runner:${Version.AndroidTest.androidXTestCore}"
        const val rules = "androidx.test:rules:${Version.AndroidTest.androidXTestCore}"

        const val junit = "androidx.test.ext:junit:${Version.AndroidTest.androidXTestJunit}"

        const val espressoCore = "androidx.test.espresso:espresso-core:${Version.AndroidTest.androidXEspresso}"
        const val espressoIntents = "androidx.test.espresso:espresso-intents:${Version.AndroidTest.androidXEspresso}"
        const val espressoWeb = "androidx.test.espresso:espresso-web:${Version.AndroidTest.androidXEspresso}"

        const val uiAutomator = "androidx.test.uiautomator:uiautomator:${Version.AndroidTest.androidXUiAutomator}"

        const val robolectric = "org.robolectric:robolectric:${Version.AndroidTest.robolectric}"
    }
}
