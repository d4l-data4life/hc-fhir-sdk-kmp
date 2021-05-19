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

import care.data4life.hl7.fhir.stu3.codesystem.GuidanceResponseStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirGuidanceResponse
 *
 * A guidance response is the formal response to a guidance request, including any output parameters
 * returned by the evaluation, as well as the description of any proposed actions to be taken.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GuidanceResponse">GuidanceResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GuidanceResponse)
 */
interface FhirGuidanceResponse : FhirDomainResource {

    /**
     * The id of the request associated with this response, if any.
     */
    val requestId: String?

    /**
     * Business identifier.
     */
    val identifier: Identifier?

    /**
     * A reference to a knowledge module.
     */
    val module: Reference

    /**
     * The status of the response. If the evaluation is completed successfully, the
     * status will indicate success. However, in order to complete the evaluation, the
     * engine may require more information. In this case, the status will be data-
     * required, and the response will contain a description of the additional required
     * information. If the evaluation completed successfully, but the engine determines
     * that a potentially more accurate response could be provided if more data was
     * available, the status will be data-requested, and the response will contain a
     * description of the additional requested information.
     */
    val status: GuidanceResponseStatus

    /**
     * Patient the request was performed for.
     */
    val subject: Reference?

    /**
     * Encounter or Episode during which the response was returned.
     */
    val context: Reference?

    /**
     * When the guidance response was processed.
     */
    val occurrenceDateTime: DateTime?

    /**
     * Device returning the guidance.
     */
    val performer: Reference?

    /**
     * Reason for the response.
     */
    val reasonCodeableConcept: CodeableConcept?

    /**
     * Reason for the response.
     */
    val reasonReference: Reference?

    /**
     * Additional notes about the response.
     */
    val note: List<Annotation>?

    /**
     * Messages resulting from the evaluation of the artifact or artifacts.
     */
    val evaluationMessage: List<Reference>?

    /**
     * The output parameters of the evaluation, if any.
     */
    val outputParameters: Reference?

    /**
     * Proposed actions, if any.
     */
    val result: Reference?

    /**
     * Additional required data.
     */
    val dataRequirement: List<DataRequirement>?
}

/**
 * GuidanceResponse
 *
 * SourceFileName: GuidanceResponse.kt
 *
 * A guidance response is the formal response to a guidance request, including any output parameters
 * returned by the evaluation, as well as the description of any proposed actions to be taken.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GuidanceResponse">GuidanceResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GuidanceResponse)
 */
@Serializable
@SerialName("GuidanceResponse")
data class GuidanceResponse(

    @SerialName("requestId")
    override val requestId: String? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("module")
    override val module: Reference,

    @SerialName("status")
    override val status: GuidanceResponseStatus,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("reasonCodeableConcept")
    override val reasonCodeableConcept: CodeableConcept? = null,

    @SerialName("reasonReference")
    override val reasonReference: Reference? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("evaluationMessage")
    override val evaluationMessage: List<Reference>? = null,

    @SerialName("outputParameters")
    override val outputParameters: Reference? = null,

    @SerialName("result")
    override val result: Reference? = null,

    @SerialName("dataRequirement")
    override val dataRequirement: List<DataRequirement>? = null,

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
) : FhirGuidanceResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GuidanceResponse"
    }
}
