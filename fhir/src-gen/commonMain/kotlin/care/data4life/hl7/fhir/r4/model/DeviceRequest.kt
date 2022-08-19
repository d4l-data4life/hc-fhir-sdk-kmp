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

import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirDeviceRequest
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
interface FhirDeviceRequest : FhirDomainResource {

    /**
     * External Request identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Instantiates FHIR protocol or definition.
     */
    val instantiatesCanonical: kotlin.collections.List<String>?

    /**
     * Instantiates external protocol or definition.
     */
    val instantiatesUri: kotlin.collections.List<String>?

    /**
     * What request fulfills.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * What request replaces.
     */
    val priorRequest: kotlin.collections.List<Reference>?

    /**
     * Identifier of composite request.
     */
    val groupIdentifier: Identifier?

    /**
     * The status of the request.
     */
    val status: RequestStatus?

    /**
     * Whether the request is a proposal, plan, an original order or a reflex order.
     */
    val intent: RequestIntent

    /**
     * Indicates how quickly the {{title}} should be addressed with respect to other
     * requests.
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
     * Device details.
     */
    val parameter: kotlin.collections.List<DeviceRequestParameter>?

    /**
     * Focus of request.
     */
    val subject: Reference

    /**
     * Encounter motivating request.
     */
    val encounter: Reference?

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
    val requester: Reference?

    /**
     * Filler role.
     */
    val performerType: CodeableConcept?

    /**
     * Requested Filler.
     */
    val performer: Reference?

    /**
     * Coded Reason for request.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Linked Reason for request.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Associated insurance coverage.
     */
    val insurance: kotlin.collections.List<Reference>?

    /**
     * Additional clinical information.
     */
    val supportingInfo: kotlin.collections.List<Reference>?

    /**
     * Notes or comments.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Request provenance.
     */
    val relevantHistory: kotlin.collections.List<Reference>?
}

/**
 * DeviceRequest
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
@Serializable
@SerialName("DeviceRequest")
data class DeviceRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: kotlin.collections.List<String>? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: kotlin.collections.List<String>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("priorRequest")
    override val priorRequest: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus? = null,

    @SerialName("intent")
    override val intent: RequestIntent,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("codeReference")
    override val codeReference: Reference? = null,

    @SerialName("codeCodeableConcept")
    override val codeCodeableConcept: CodeableConcept? = null,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<DeviceRequestParameter>? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: Reference? = null,

    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<Reference>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("relevantHistory")
    override val relevantHistory: kotlin.collections.List<Reference>? = null,

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
) : FhirDeviceRequest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceRequest"
    }
}

/**
 * FhirDeviceRequestParameter
 *
 * Specific parameters for the ordered item. For example, the prism value for lenses.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequestParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
interface FhirDeviceRequestParameter : FhirBackboneElement {

    /**
     * Device detail.
     */
    val code: CodeableConcept?

    /**
     * Value of detail.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Value of detail.
     */
    val valueQuantity: Quantity?

    /**
     * Value of detail.
     */
    val valueRange: Range?

    /**
     * Value of detail.
     */
    val valueBoolean: Bool?
}

/**
 * DeviceRequestParameter
 *
 * Specific parameters for the ordered item. For example, the prism value for lenses.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceRequest">DeviceRequestParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceRequest)
 */
@Serializable
@SerialName("DeviceRequestParameter")
data class DeviceRequestParameter(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceRequestParameter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceRequestParameter"
    }
}
