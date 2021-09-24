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

package care.data4life.hl7.fhir.r4

import care.data4life.hl7.fhir.parser.FhirParser
import care.data4life.hl7.fhir.r4.json.FhirR4JsonParser
import care.data4life.hl7.fhir.r4.model.FhirR4
import kotlin.reflect.KClass

class FhirR4Parser(
    private val jsonParser: FhirR4JsonParser = defaultJsonParser()
) : FhirParser<FhirR4> {

    override fun <T : FhirR4> toFhir(fhirType: KClass<T>, fhirData: String): T {
        return jsonParser.fromJson(fhirType, fhirData)
    }

    override fun <T : FhirR4> fromFhir(fhirObject: T): String {
        return jsonParser.toJson(fhirObject)
    }

    companion object {
        fun defaultJsonParser() = FhirR4JsonParser()
    }
}
