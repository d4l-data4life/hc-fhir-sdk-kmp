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

import care.data4life.hl7.fhir.dependency.Dependency
import care.data4life.hl7.fhir.LibraryConfig
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.kotlin.plugin.serialization")

    // Android
    id("com.android.library")

    // Publish
    id("care.data4life.hl7.fhir.publishing-config")
}

group = LibraryConfig.group

kotlin {
    android {
        publishLibraryVariants("release", "debug")
    }

    jvm { }

    ios {
        binaries {
            framework {
                baseName = LibraryConfig.name
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("src-gen/commonMain/kotlin")

            dependencies {
                implementation(Dependency.multiplatform.kotlin.stdLib.common)

                implementation(Dependency.multiplatform.kotlin.serialization.json)

                implementation(Dependency.multiplatform.kotlin.dateTime)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(Dependency.multiplatformTest.kotlin.common)
                implementation(Dependency.multiplatformTest.kotlin.commonAnnotations)

                implementation(Dependency.multiplatformTest.mockK.common)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(Dependency.multiplatform.kotlin.stdLib.android)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(Dependency.multiplatformTest.kotlin.jvm)
                implementation(Dependency.multiplatformTest.kotlin.jvmJunit)

                implementation(Dependency.multiplatformTest.mockK.junit)

                implementation(Dependency.androidTest.robolectric)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(Dependency.multiplatform.kotlin.stdLib.jdk8)
            }
        }
        val jvmTest by getting {
            kotlin.srcDir("src-gen/jvmTest/kotlin")
            resources.srcDir("src-gen/jvmTest/resources")

            dependencies {
                implementation(Dependency.multiplatformTest.kotlin.jvm)
                implementation(Dependency.multiplatformTest.kotlin.jvmJunit)

                implementation(Dependency.multiplatformTest.mockK.junit)

                implementation(Dependency.jvmTest.jsonAssert)
            }
        }

        val iosMain by getting {
            dependencies {
            }
        }
        val iosTest by getting
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}

android {
    compileSdkVersion(LibraryConfig.android.compileSdkVersion)

    defaultConfig {
        minSdkVersion(LibraryConfig.android.minSdkVersion)
        targetSdkVersion(LibraryConfig.android.targetSdkVersion)

        versionCode = 1
        versionName = "${project.version}"

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

val xcodeMode = System.getenv("CONFIGURATION") ?: "DEBUG"
val sdkName = System.getenv("SDK_NAME") ?: "iphonesimulator"
val targetName = "ios" + if (sdkName.startsWith("iphoneos")) "Arm64" else "X64"
val framework = kotlin.targets.getByName<KotlinNativeTarget>(targetName).binaries.getFramework(xcodeMode)
val frameworkFile = framework.outputFile

val xcodeFrameworksDirectory: File? = run {
    val xcodeTargetBuildDir = System.getenv("TARGET_BUILD_DIR") ?: return@run null
    val xcodeFrameworksFolderPath = System.getenv("FRAMEWORKS_FOLDER_PATH") ?: return@run null
    file("$xcodeTargetBuildDir/$xcodeFrameworksFolderPath")
}

val frameworksDirectory = File(buildDir, "xcode-frameworks")

val packForXcode by tasks.creating(Sync::class) {
    group = "build"
    dependsOn(framework.linkTask)

    inputs.property("mode", xcodeMode)

    from({ framework.outputDirectory })
    into(frameworksDirectory)
}
tasks.getByName("build").dependsOn(packForXcode)


val embedAndSignForXcode by tasks.creating(Sync::class) {
    group = "build"
    dependsOn(packForXcode)

    if (xcodeFrameworksDirectory == null) {
        enabled = false
        return@creating
    }

    destinationDir = xcodeFrameworksDirectory.resolve(frameworkFile.name)
    from(frameworksDirectory.resolve(frameworkFile.name))

    // Sign the framework.
    val codeSignIdentity = System.getenv("EXPANDED_CODE_SIGN_IDENTITY")
    inputs.property("codeSignIdentity", codeSignIdentity)

    doLast {
        if (codeSignIdentity.isNullOrEmpty()) {
            return@doLast
        }

        project.exec {
            commandLine(
                "codesign",
                "--force",
                "--sign", codeSignIdentity,
                "--",
                xcodeFrameworksDirectory
                    .resolve(frameworkFile.name)
                    .resolve(frameworkFile.nameWithoutExtension)
            )
        }
    }
}
