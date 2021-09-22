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
                const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.multiplatform.kotlin.coroutines}"
                const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.multiplatform.kotlin.coroutines}"
                const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.multiplatform.kotlin.coroutines}"
            }

            object Serialization {
                const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Version.multiplatform.kotlin.serialization}"
            }

            const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Version.multiplatform.kotlin.dateTime}"
        }

        object D4L {

            val util = Util

            object Util {
                const val common = "care.data4life.hc-util-sdk-kmp:util:${Version.multiplatform.d4l.utilSdk}"
                const val android = "care.data4life.hc-util-sdk-kmp:util-android:${Version.multiplatform.d4l.utilSdk}"
                const val jvm = "care.data4life.hc-util-sdk-kmp:util-jvm:${Version.multiplatform.d4l.utilSdk}"
            }
        }

        object Koin {
            // https://github.com/InsertKoinIO/koin
            const val commonCore = "org.koin:koin-core:${Version.multiplatform.koin}"
            const val commonCoreExt = "org.koin:koin-core-ext:${Version.multiplatform.koin}"
            const val test = "org.koin:koin-test:${Version.multiplatform.koin}"
            const val androidScope = "org.koin:koin-androidx-scope:${Version.multiplatform.koin}"
            const val androidViewModel = "org.koin:koin-androidx-viewmodel:${Version.multiplatform.koin}"
            const val androidFragment = "org.koin:koin-androidx-fragment:${Version.multiplatform.koin}"
            const val androidExt = "org.koin:koin-androidx-ext:${Version.multiplatform.koin}"
            const val tor = "org.koin:koin-tor:${Version.multiplatform.koin}"
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
            const val common = "io.mockk:mockk-common:${Version.multiplatformTest.mockK}"
            const val junit = "io.mockk:mockk:${Version.multiplatformTest.mockK}"
            const val androidTestInstrumentation = "io.mockk:mockk-android:${Version.multiplatformTest.mockK}"
        }
    }

    object Jvm {
        // Crypto
        const val bouncyCastleJdk15 = "org.bouncycastle:bcprov-jdk15on:${Version.jvm.bouncyCastle}"
    }

    object JvmTest {
        const val junit = "junit:junit:${Version.jvmTest.jUnit}"

        const val jsonAssert = "org.skyscreamer:jsonassert:${Version.jvmTest.jsonAssert}"
    }

    object Android {

        val androidX = AndroidX

        // Kotlin
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
        const val kotlinCoroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.multiplatform.kotlin.coroutines}"

        // Android
        const val desugar = "com.android.tools:desugar_jdk_libs:${Version.android.androidDesugar}"

        object AndroidX {
            const val ktx = "androidx.core:core-ktx:${Version.android.androidX.ktx}"
            const val appCompat = "androidx.appcompat:appcompat:${Version.android.androidX.appCompat}"
            const val browser = "androidx.browser:browser:${Version.android.androidX.browser}"

            // Layout
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.android.androidX.constraintLayout}"

            // Lifecylce
            const val lifecylceCommonJava8 =
                "androidx.lifecycle:lifecycle-common-java8:${Version.android.androidX.lifecycle}"
            const val lifecylceExtensions =
                "androidx.lifecycle:lifecycle-extensions:${Version.android.androidX.lifecycle}"

            // Navigation
            const val navigationFragmentKtx =
                "androidx.navigation:navigation-fragment-ktx:${Version.android.androidX.navigation}"
            const val navigationUiKtx =
                "androidx.navigation:navigation-ui-ktx:${Version.android.androidX.navigation}"
        }

        // Material
        const val material = "com.google.android.material:material:${Version.android.material}"
    }

    object AndroidTest {
        const val core = "androidx.test:core:${Version.androidTest.androidXTestCore}"
        const val runner = "androidx.test:runner:${Version.androidTest.androidXTestCore}"
        const val rules = "androidx.test:rules:${Version.androidTest.androidXTestCore}"

        const val junit = "androidx.test.ext:junit:${Version.androidTest.androidXTestJunit}"

        const val espressoCore = "androidx.test.espresso:espresso-core:${Version.androidTest.androidXEspresso}"
        const val espressoIntents = "androidx.test.espresso:espresso-intents:${Version.androidTest.androidXEspresso}"
        const val espressoWeb = "androidx.test.espresso:espresso-web:${Version.androidTest.androidXEspresso}"

        const val uiAutomator = "androidx.test.uiautomator:uiautomator:${Version.androidTest.androidXUiAutomator}"

        const val robolectric = "org.robolectric:robolectric:${Version.androidTest.robolectric}"
    }
}
