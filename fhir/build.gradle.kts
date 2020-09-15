import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")

    // Android
    id("com.android.library")

    // iOS
    id("co.touchlab.native.cocoapods")
    id("kotlin-android-extensions")

    // DB
    id("com.squareup.sqldelight")
}

version = LibraryConfig.version
group = LibraryConfig.group


kotlin {
    android("android") {
        publishLibraryVariants("release")
    }
    jvm("jvm")

    // Add a platform switching to have an IDE support. Revert to just ios() when gradle plugin can properly resolve it
    val buildForDevice = project.findProperty("kotlin.native.cocoapods.target") == "ios_arm"
    if (buildForDevice) {
        iosArm64("ios") {
            binaries {
                framework { }
            }
        }
    } else {
        iosX64("ios")
    }

    targets.getByName<KotlinNativeTarget>("ios").compilations["main"].kotlinOptions.freeCompilerArgs +=
        listOf("-Xobjc-generics", "-Xg0")

    sourceSets {
        all {
            languageSettings.apply {
                useExperimentalAnnotation("kotlinx.coroutines.ExperimentalCoroutinesApi")
            }
        }

        val commonMain by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.stdlibCommon)

                implementation(Dependencies.multiplatform.coroutines.common)

                implementation(Dependencies.multiplatform.ktor.commonCore)
                implementation(Dependencies.multiplatform.ktor.commonJson)
                implementation(Dependencies.multiplatform.ktor.commonSerialization)

                implementation(Dependencies.multiplatform.sqlDelight.runtime)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.testCommon)
                implementation(Dependencies.multiplatform.kotlin.testCommonAnnotations)

                implementation(Dependencies.multiplatform.mockk.common)
                implementation(Dependencies.multiplatform.hamkrest.common)
            }
        }

        val androidMain by getting {
            dependencies {
                //Kotlin
                implementation(Dependencies.multiplatform.kotlin.stdlibAndroid)
                implementation(Dependencies.multiplatform.coroutines.android)
                implementation(Dependencies.multiplatform.ktor.androidSerialization)
                implementation(Dependencies.multiplatform.sqlDelight.driverAndroid)

                implementation(Dependencies.android.material)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.testJvm)
                implementation(Dependencies.multiplatform.kotlin.testJvmJunit)

                implementation(Dependencies.multiplatform.coroutines.test)
                implementation(Dependencies.multiplatform.mockk.android)
                implementation(Dependencies.multiplatform.hamkrest.android)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.stdlibJdk8)
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(Dependencies.multiplatform.kotlin.testJvm)
                implementation(Dependencies.multiplatform.kotlin.testJvmJunit)
            }
        }

        val iosMain by getting {
            dependencies {
                implementation(Dependencies.multiplatform.coroutines.common) {
                    version {
                        strictly(Versions.kotlinCoroutines)
                    }
                }

                implementation(Dependencies.multiplatform.ktor.ios)
                implementation(Dependencies.multiplatform.ktor.io)

                implementation(Dependencies.multiplatform.sqlDelight.driverIos)
            }
        }
    }

    cocoapodsext {
        summary = "Kotlin multiplatforn library template"
        homepage = "https://github.com/gesundheitscloud/d4l-kotlin-mpp-library-template"

        framework {
            isStatic = false
            baseName = "Library"
        }
    }
}

android {
    compileSdkVersion(LibraryConfig.android.compileSdkVersion)

    defaultConfig {
        minSdkVersion(LibraryConfig.android.minSdkVersion)
        targetSdkVersion(LibraryConfig.android.targetSdkVersion)

        versionCode = LibraryConfig.android.versionCode
        versionName = LibraryConfig.android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArguments(
            mapOf(
                "clearPackageData" to "true"
            )
        )
    }

    resourcePrefix(LibraryConfig.android.resourcePrefix)

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            java.setSrcDirs(setOf("src/androidMain/kotlin"))
            res.setSrcDirs(setOf("src/androidMain/res"))
        }

        getByName("test") {
            java.setSrcDirs(setOf("src/androidTest/kotlin"))
            res.setSrcDirs(setOf("src/androidTest/res"))
        }
    }
}

sqldelight {
    database("LibraryDatabase") {
        packageName = "care.data4life.library"
        schemaOutputDirectory = file("src/commonMain/sqldelight")
    }
}
