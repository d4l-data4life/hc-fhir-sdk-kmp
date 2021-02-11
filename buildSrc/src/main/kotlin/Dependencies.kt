/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

object Dependencies {

    val kotlin = Kotlin

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
    }

    val multiplatform = Multiplatform
    object Multiplatform {

        val kotlin = Kotlin
        object Kotlin {
            const val stdlibCommon = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
            const val stdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
            const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
            const val stdlibJs = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
            const val stdlibNative = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
            const val stdlibAndroid = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

            const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
            const val testCommonAnnotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
            const val testJvm = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
            const val testJvmJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
        }

        val coroutines = Coroutines

        object Coroutines {
            // https://github.com/Kotlin/kotlinx.coroutines
            const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
        }

        val coroutinesIO = CoroutinesIO

        object CoroutinesIO {
            //https://github.com/Kotlin/kotlinx-io
            const val common =
                "org.jetbrains.kotlinx:kotlinx-coroutines-io:${Versions.kotlinCoroutinesIO}"
            const val java =
                "org.jetbrains.kotlinx:kotlinx-coroutines-io-jvm:${Versions.kotlinCoroutinesIO}"
            const val native =
                "org.jetbrains.kotlinx:kotlinx-coroutines-io-native:${Versions.kotlinCoroutinesIO}"
        }

        val serialization = Serialization

        object Serialization {
            // https://github.com/Kotlin/kotlinx.serialization
            const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinSerialization}"
        }

        val koin = Koin

        object Koin {
            // https://github.com/InsertKoinIO/koin
            const val commonCore = "org.koin:koin-core:${Versions.koin}"
            const val commonCoreExt = "org.koin:koin-core-ext:${Versions.koin}"
            const val test = "org.koin:koin-test:${Versions.koin}"
            const val androidScope = "org.koin:koin-androidx-scope:${Versions.koin}"
            const val androidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
            const val androidFragment = "org.koin:koin-androidx-fragment:${Versions.koin}"
            const val androidExt = "org.koin:koin-androidx-ext:${Versions.koin}"
            const val tor = "org.koin:koin-tor:${Versions.koin}"
        }

        const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.dateTime}"

        //Test
        val mockk = Mockk

        object Mockk {
            const val common = "io.mockk:mockk-common:${Versions.testMockk}"
            const val junit = "io.mockk:mockk:${Versions.testMockk}"
            const val androidTestInstrumentation = "io.mockk:mockk-android:${Versions.testMockk}"
        }

        val hamkrest = Hamkrest

        object Hamkrest {
            //https://jitpack.io/com/github/npryce/hamkrest/63c8e84dd1/build.log
            const val common = "com.github.npryce.hamkrest:hamkrest-metadata:${Versions.testHamkrest}"
            const val android = "com.github.npryce.hamkrest:hamkrest-jvm:${Versions.testHamkrest}"
        }
    }


    val test = Test

    object Test {
        const val junit = "junit:junit:${Versions.testJUnit}"

        const val jsonAssert = "org.skyscreamer:jsonassert:${Versions.jsonAssert}"
    }

    val android = Android
    object Android {
        // Kotlin
        const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"

        // Android
        const val desugar = "com.android.tools:desugar_jdk_libs:${Versions.androidDesugar}"

        val androidX = AndroidX
        object AndroidX {
            // AndroidX
            const val ktx = "androidx.core:core-ktx:${Versions.androidXKtx}"
            const val appCompat = "androidx.appcompat:appcompat:${Versions.androidXAppCompat}"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidXConstraintLayout}"

            // Lifecylce
            const val lifecylceCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.androidXLifecycle}"
            const val lifecylceExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidXLifecycle}"

            // Navigation
            const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.androidXNavigation}"
            const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.androidXNavigation}"
        }

        // Material
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    val androidTest = AndroidTest
    object AndroidTest {
        const val core = "androidx.test:core:${Versions.androidXTest}"
        const val runner = "androidx.test:runner:${Versions.androidXTest}"
        const val rules = "androidx.test:rules:${Versions.androidXTest}"

        const val junit = "androidx.test.ext:junit:${Versions.androidXTest}"

        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.androidXEspresso}"
        const val espressoIntents =
            "androidx.test.espresso:espresso-intents:${Versions.androidXEspresso}"
        const val espressoWeb = "androidx.test.espresso:espresso-web:${Versions.androidXEspresso}"

        const val uiAutomator =
            "androidx.test.uiautomator:uiautomator:${Versions.androidXUiAutomator}"
    }
}
