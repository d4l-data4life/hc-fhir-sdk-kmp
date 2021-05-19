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

import care.data4life.hl7.fhir.stu3.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirBodySite
 *
 * Record details about the anatomical location of a specimen or body part. This resource may be used
 * when a coded concept does not provide the necessary detail needed for the use case.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BodySite">BodySite</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/BodySite)
 */
interface FhirBodySite : FhirDomainResource {

    /**
     * Bodysite identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Whether this body site record is in active use.
     */
    val active: Bool?

    /**
     * Named anatomical location.
     */
    val code: CodeableConcept?

    /**
     * Modification to location code.
     */
    val qualifier: List<CodeableConcept>?

    /**
     * Anatomical location description.
     */
    val description: String?

    /**
     * Attached images.
     */
    val image: List<Attachment>?

    /**
     * Who this is about.
     */
    val patient: Reference
}

/**
 * BodySite
 *
 * SourceFileName: BodySite.kt
 *
 * Record details about the anatomical location of a specimen or body part. This resource may be used
 * when a coded concept does not provide the necessary detail needed for the use case.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BodySite">BodySite</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/BodySite)
 */
@Serializable
@SerialName("BodySite")
data class BodySite(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("qualifier")
    override val qualifier: List<CodeableConcept>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("image")
    override val image: List<Attachment>? = null,

    @SerialName("patient")
    override val patient: Reference,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirBodySite {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "BodySite"
    }
}
