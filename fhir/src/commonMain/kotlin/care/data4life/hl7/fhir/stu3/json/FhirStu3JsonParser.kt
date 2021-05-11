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

package care.data4life.hl7.fhir.stu3.json

import care.data4life.hl7.fhir.parser.json.FhirJsonParser
import care.data4life.hl7.fhir.stu3.model.FhirSerializationModule
import care.data4life.hl7.fhir.stu3.model.FhirStu3
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlin.reflect.KClass

class FhirStu3JsonParser(
    private val reader: Json = defaultJsonReader()
) : FhirJsonParser<FhirStu3> {

    @Suppress("UNCHECKED_CAST")
    override fun <T : FhirStu3> fromJson(fhirType: KClass<T>, fhirJson: String): T {
        return reader.decodeFromString(PolymorphicSerializer(FhirStu3::class), fhirJson) as T
    }

    override fun <T : FhirStu3> toJson(fhirObject: T): String {
        return reader.encodeToString(PolymorphicSerializer(FhirStu3::class), fhirObject)
    }


    companion object {

        private val fhirStu3SerializersModule = FhirSerializationModule.module()

        fun defaultJsonReader(module: SerializersModule = fhirStu3SerializersModule): Json {
            return Json {
                encodeDefaults = false
                isLenient = false
                ignoreUnknownKeys = true
                allowSpecialFloatingPointValues = false
                allowStructuredMapKeys = true
                prettyPrint = false
                useArrayPolymorphism = false
                classDiscriminator = "resourceType"

                serializersModule = module
            }
        }
    }
}
