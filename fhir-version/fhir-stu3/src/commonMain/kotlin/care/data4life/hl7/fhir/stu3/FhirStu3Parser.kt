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

package care.data4life.hl7.fhir.stu3

import care.data4life.hl7.fhir.parser.FhirParser
import care.data4life.hl7.fhir.stu3.json.FhirStu3JsonParser
import care.data4life.hl7.fhir.stu3.model.FhirStu3
import kotlin.reflect.KClass

class FhirStu3Parser(
    private val jsonParser: FhirStu3JsonParser
) : FhirParser<FhirStu3> {

    override fun <T : FhirStu3> toFhir(fhirType: KClass<T>, fhirData: String): T {
        return jsonParser.fromJson(fhirType, fhirData)
    }

    override fun <T : FhirStu3> fromFhir(fhirObject: T): String {
        return jsonParser.toJson(fhirObject)
    }
}
