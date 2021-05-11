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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirAnnotation : FhirElement {

    // Individual responsible for the annotation.
    val authorReference: Reference?

    // Individual responsible for the annotation.
    val authorString: String?

    // When the annotation was made.
    val time: DateTime?

    // The annotation  - text content.
    val text: String
}

/**
 * ClassName: Annotation
 *
 * SourceFileName: Annotation.kt
 *
 *
 * A  text note which also  contains information about who made the statement and when.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Annotation">Annotation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Annotation)
 */
@Serializable
@SerialName("Annotation")
data class Annotation(

    // Individual responsible for the annotation.
    @SerialName("authorReference")
    override val authorReference: Reference? = null,
    // Individual responsible for the annotation.
    @SerialName("authorString")
    override val authorString: String? = null,
    // When the annotation was made.
    @SerialName("time")
    override val time: DateTime? = null,
    // The annotation  - text content.
    @SerialName("text")
    override val text: String,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAnnotation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Annotation"
    }
}
