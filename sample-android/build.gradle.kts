plugins {
    androidApp()
    androidKotlin()
    androidKotlinExtensions()
}

version = AppConfig.version
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
        coreLibraryDesugaringEnabled = false

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

        unitTests.all(KotlinClosure1<Any, Test>({
            (this as Test).also { testTask ->
                testTask.testLogging {
                    events("passed", "skipped", "failed", "standardOut", "standardError")
                }
            }
        }, unitTests))

        // FIXME Test Orchestrator is currently broken and results in no tests found
        // execution = "ANDROIDX_TEST_ORCHESTRATOR"
    }
}

dependencies {
    coreLibraryDesugaring(Dependencies.android.desugar)

    implementation(project(":fhir"))

    implementation(Dependencies.android.kotlinStdLib)
    implementation(Dependencies.android.kotlinCoroutinesCore)

    implementation(Dependencies.android.androidX.ktx)
    implementation(Dependencies.android.androidX.appCompat)
    implementation(Dependencies.android.androidX.constraintLayout)

    testImplementation(Dependencies.test.junit)
    androidTestImplementation(Dependencies.androidTest.junit)
    androidTestImplementation(Dependencies.androidTest.espressoCore)
}
