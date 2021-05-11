/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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

package care.data4life.hl7.fhir.stu3.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirCodeableConcept : FhirElement {

    // Code defined by a terminology system.
    val coding: List<Coding>?

    // Plain text representation of the concept.
    val text: String?
}


/**
 * ClassName: CodeableConcept
 *
 * SourceFileName: CodeableConcept.kt
 *
 *
 * A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeableConcept">CodeableConcept</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CodeableConcept)
 */
@Serializable
@SerialName("CodeableConcept")
data class CodeableConcept(

    // Code defined by a terminology system.
    @SerialName("coding")
    override val coding: List<Coding>? = null,
    // Plain text representation of the concept.
    @SerialName("text")
    override val text: String? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCodeableConcept {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeableConcept"
    }
}

