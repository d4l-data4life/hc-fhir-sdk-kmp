rootProject.name = "hc-fhir-sdk-kmp"


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
