rootProject.name = "hc-fhir-sdk-kmp"

enableFeaturePreview("GRADLE_METADATA")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        jcenter()

        maven("https://kotlin.bintray.com/kotlin")
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://jitpack.io")
    }
}

include(
    ":sample-android",

    ":fhir",

    ":docs"
)
