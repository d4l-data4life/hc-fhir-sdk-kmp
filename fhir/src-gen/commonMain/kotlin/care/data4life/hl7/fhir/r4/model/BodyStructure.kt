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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirBodyStructure
 *
 * Record details about an anatomical structure. This resource may be used when a coded concept does
 * not provide the necessary detail needed for the use case.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BodyStructure">BodyStructure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BodyStructure)
 */
interface FhirBodyStructure : FhirDomainResource {

    /**
     * Bodystructure identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether this record is in active use.
     */
    val active: Bool?

    /**
     * Kind of Structure.
     */
    val morphology: CodeableConcept?

    /**
     * Body site.
     */
    val location: CodeableConcept?

    /**
     * Body site modifier.
     */
    val locationQualifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Text description.
     */
    val description: String?

    /**
     * Attached images.
     */
    val image: kotlin.collections.List<Attachment>?

    /**
     * Who this is about.
     */
    val patient: Reference
}

/**
 * BodyStructure
 *
 * Record details about an anatomical structure. This resource may be used when a coded concept does
 * not provide the necessary detail needed for the use case.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BodyStructure">BodyStructure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BodyStructure)
 */
@Serializable
@SerialName("BodyStructure")
data class BodyStructure(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("morphology")
    override val morphology: CodeableConcept? = null,

    @SerialName("location")
    override val location: CodeableConcept? = null,

    @SerialName("locationQualifier")
    override val locationQualifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("image")
    override val image: kotlin.collections.List<Attachment>? = null,

    @SerialName("patient")
    override val patient: Reference,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirBodyStructure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BodyStructure"
    }
}
