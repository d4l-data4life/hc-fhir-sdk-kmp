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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirProcessResponse
 *
 * This resource provides processing status, errors and notes from the processing of a resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessResponse">ProcessResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessResponse)
 */
interface FhirProcessResponse : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Authoring Organization.
     */
    val organization: Reference?

    /**
     * Request reference.
     */
    val request: Reference?

    /**
     * Processing outcome.
     */
    val outcome: CodeableConcept?

    /**
     * Disposition Message.
     */
    val disposition: String?

    /**
     * Responsible Practitioner.
     */
    val requestProvider: Reference?

    /**
     * Responsible organization.
     */
    val requestOrganization: Reference?

    /**
     * Printed Form Identifier.
     */
    val form: CodeableConcept?

    /**
     * Processing comments or additional requirements.
     */
    val processNote: kotlin.collections.List<ProcessResponseProcessNote>?

    /**
     * Error code.
     */
    val error: kotlin.collections.List<CodeableConcept>?

    /**
     * Request for additional information.
     */
    val communicationRequest: kotlin.collections.List<Reference>?
}

/**
 * ProcessResponse
 *
 * This resource provides processing status, errors and notes from the processing of a resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessResponse">ProcessResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessResponse)
 */
@Serializable
@SerialName("ProcessResponse")
data class ProcessResponse(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("requestProvider")
    override val requestProvider: Reference? = null,

    @SerialName("requestOrganization")
    override val requestOrganization: Reference? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("processNote")
    override val processNote: kotlin.collections.List<ProcessResponseProcessNote>? = null,

    @SerialName("error")
    override val error: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("communicationRequest")
    override val communicationRequest: kotlin.collections.List<Reference>? = null,

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
) : FhirProcessResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcessResponse"
    }
}

/**
 * FhirProcessResponseProcessNote
 *
 * Suite of processing notes or additional requirements if the processing has been held.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessResponse">ProcessResponseProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessResponse)
 */
interface FhirProcessResponseProcessNote : FhirBackboneElement {

    /**
     * display | print | printoper.
     */
    val type: CodeableConcept?

    /**
     * Comment on the processing.
     */
    val text: String?
}

/**
 * ProcessResponseProcessNote
 *
 * Suite of processing notes or additional requirements if the processing has been held.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessResponse">ProcessResponseProcessNote</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessResponse)
 */
@Serializable
@SerialName("ProcessResponseProcessNote")
data class ProcessResponseProcessNote(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("text")
    override val text: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirProcessResponseProcessNote {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcessResponseProcessNote"
    }
}
