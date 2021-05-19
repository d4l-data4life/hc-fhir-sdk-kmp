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

import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDeviceRequest
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
interface FhirDeviceRequest : FhirDomainResource {

    /**
     * External Request identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Protocol or definition.
     */
    val definition: List<Reference>?

    /**
     * What request fulfills.
     */
    val basedOn: List<Reference>?

    /**
     * What request replaces.
     */
    val priorRequest: List<Reference>?

    /**
     * Identifier of composite request.
     */
    val groupIdentifier: Identifier?

    /**
     * The status of the request.
     */
    val status: RequestStatus?

    /**
     * proposal | plan | original-order | encoded | reflex-order.
     */
    val intent: CodeableConcept

    /**
     * None
     */
    val priority: RequestPriority?

    /**
     * Device requested.
     */
    val codeReference: Reference?

    /**
     * Device requested.
     */
    val codeCodeableConcept: CodeableConcept?

    /**
     * Focus of request.
     */
    val subject: Reference

    /**
     * Encounter or Episode motivating request.
     */
    val context: Reference?

    /**
     * Desired time or schedule for use.
     */
    val occurrenceDateTime: DateTime?

    /**
     * Desired time or schedule for use.
     */
    val occurrencePeriod: Period?

    /**
     * Desired time or schedule for use.
     */
    val occurrenceTiming: Timing?

    /**
     * When recorded.
     */
    val authoredOn: DateTime?

    /**
     * Who/what is requesting diagnostics.
     */
    val requester: DeviceRequestRequester?

    /**
     * Fille role.
     */
    val performerType: CodeableConcept?

    /**
     * Requested Filler.
     */
    val performer: Reference?

    /**
     * Coded Reason for request.
     */
    val reasonCode: List<CodeableConcept>?

    /**
     * Linked Reason for request.
     */
    val reasonReference: List<Reference>?

    /**
     * Additional clinical information.
     */
    val supportingInfo: List<Reference>?

    /**
     * Notes or comments.
     */
    val note: List<Annotation>?

    /**
     * Request provenance.
     */
    val relevantHistory: List<Reference>?
}

/**
 * DeviceRequest
 *
 * SourceFileName: DeviceRequest.kt
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
@Serializable
@SerialName("DeviceRequest")
data class DeviceRequest(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("definition")
    override val definition: List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("priorRequest")
    override val priorRequest: List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus? = null,

    @SerialName("intent")
    override val intent: CodeableConcept,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("codeReference")
    override val codeReference: Reference? = null,

    @SerialName("codeCodeableConcept")
    override val codeCodeableConcept: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: DeviceRequestRequester? = null,

    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: List<Reference>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("relevantHistory")
    override val relevantHistory: List<Reference>? = null,

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
) : FhirDeviceRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceRequest"
    }
}

/**
 * FhirDeviceRequestRequester
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
interface FhirDeviceRequestRequester : FhirBackboneElement {

    /**
     * Individual making the request.
     */
    val agent: Reference

    /**
     * Organization agent is acting for.
     */
    val onBehalfOf: Reference?
}

/**
 * DeviceRequestRequester
 *
 * SourceFileName: DeviceRequest.kt
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
@Serializable
@SerialName("DeviceRequestRequester")
data class DeviceRequestRequester(

    @SerialName("agent")
    override val agent: Reference,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDeviceRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceRequestRequester"
    }
}
