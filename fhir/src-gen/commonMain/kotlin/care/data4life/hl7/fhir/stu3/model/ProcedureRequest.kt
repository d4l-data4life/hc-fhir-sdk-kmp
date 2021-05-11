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

import care.data4life.hl7.fhir.stu3.codesystem.RequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirProcedureRequest : FhirDomainResource {

    // Identifiers assigned to this order.
    val identifier: List<Identifier>?

    // Protocol or definition.
    val definition: List<Reference>?

    // What request fulfills.
    val basedOn: List<Reference>?

    // What request replaces.
    val replaces: List<Reference>?

    // Composite Request ID.
    val requisition: Identifier?

    // The status of the order.
    val status: RequestStatus

    // Whether the request is a proposal, plan, an original order or a reflex order.
    val intent: RequestIntent

    // Indicates how quickly the ProcedureRequest should be addressed with respect to other requests.
    val priority: RequestPriority?

    // True if procedure should not be performed.
    val doNotPerform: Bool?

    // Classification of procedure.
    val category: List<CodeableConcept>?

    // What is being requested/ordered.
    val code: CodeableConcept

    // Individual the service is ordered for.
    val subject: Reference

    // Encounter or Episode during which request was created.
    val context: Reference?

    // When procedure should occur.
    val occurrenceDateTime: DateTime?

    // When procedure should occur.
    val occurrencePeriod: Period?

    // When procedure should occur.
    val occurrenceTiming: Timing?

    // Preconditions for procedure or diagnostic.
    val asNeededBoolean: Bool?

    // Preconditions for procedure or diagnostic.
    val asNeededCodeableConcept: CodeableConcept?

    // Date request signed.
    val authoredOn: DateTime?

    // Who/what is requesting procedure or diagnostic.
    val requester: ProcedureRequestRequester?

    // Performer role.
    val performerType: CodeableConcept?

    // Requested perfomer.
    val performer: Reference?

    // Explanation/Justification for test.
    val reasonCode: List<CodeableConcept>?

    // Explanation/Justification for test.
    val reasonReference: List<Reference>?

    // Additional clinical information.
    val supportingInfo: List<Reference>?

    // Procedure Samples.
    val specimen: List<Reference>?

    // Location on Body.
    val bodySite: List<CodeableConcept>?

    // Comments.
    val note: List<Annotation>?

    // Request provenance.
    val relevantHistory: List<Reference>?
}


/**
 * ClassName: ProcedureRequest
 *
 * SourceFileName: ProcedureRequest.kt
 *
 *
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcedureRequest">ProcedureRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcedureRequest)
 */
@Serializable
@SerialName("ProcedureRequest")
data class ProcedureRequest(

    // Identifiers assigned to this order.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Protocol or definition.
    @SerialName("definition")
    override val definition: List<Reference>? = null,
    // What request fulfills.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,
    // What request replaces.
    @SerialName("replaces")
    override val replaces: List<Reference>? = null,
    // Composite Request ID.
    @SerialName("requisition")
    override val requisition: Identifier? = null,
    // The status of the order.
    @SerialName("status")
    override val status: RequestStatus,
    // Whether the request is a proposal, plan, an original order or a reflex order.
    @SerialName("intent")
    override val intent: RequestIntent,
    // Indicates how quickly the ProcedureRequest should be addressed with respect to other requests.
    @SerialName("priority")
    override val priority: RequestPriority? = null,
    // True if procedure should not be performed.
    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,
    // Classification of procedure.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // What is being requested/ordered.
    @SerialName("code")
    override val code: CodeableConcept,
    // Individual the service is ordered for.
    @SerialName("subject")
    override val subject: Reference,
    // Encounter or Episode during which request was created.
    @SerialName("context")
    override val context: Reference? = null,
    // When procedure should occur.
    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,
    // When procedure should occur.
    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,
    // When procedure should occur.
    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,
    // Preconditions for procedure or diagnostic.
    @SerialName("asNeededBoolean")
    override val asNeededBoolean: Bool? = null,
    // Preconditions for procedure or diagnostic.
    @SerialName("asNeededCodeableConcept")
    override val asNeededCodeableConcept: CodeableConcept? = null,
    // Date request signed.
    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,
    // Who/what is requesting procedure or diagnostic.
    @SerialName("requester")
    override val requester: ProcedureRequestRequester? = null,
    // Performer role.
    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,
    // Requested perfomer.
    @SerialName("performer")
    override val performer: Reference? = null,
    // Explanation/Justification for test.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,
    // Explanation/Justification for test.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,
    // Additional clinical information.
    @SerialName("supportingInfo")
    override val supportingInfo: List<Reference>? = null,
    // Procedure Samples.
    @SerialName("specimen")
    override val specimen: List<Reference>? = null,
    // Location on Body.
    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,
    // Comments.
    @SerialName("note")
    override val note: List<Annotation>? = null,
    // Request provenance.
    @SerialName("relevantHistory")
    override val relevantHistory: List<Reference>? = null,


    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
    @SerialName("language")
    override val language: String? = null
) : FhirProcedureRequest {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcedureRequest"
    }
}


interface FhirProcedureRequestRequester : FhirBackboneElement {

    // Individual making the request.
    val agent: Reference

    // Organization agent is acting for.
    val onBehalfOf: Reference?
}


/**
 * ClassName: ProcedureRequestRequester
 *
 * SourceFileName: ProcedureRequest.kt
 *
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcedureRequest">ProcedureRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcedureRequest)
 */
@Serializable
@SerialName("ProcedureRequestRequester")
data class ProcedureRequestRequester(

    // Individual making the request.
    @SerialName("agent")
    override val agent: Reference,
    // Organization agent is acting for.
    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirProcedureRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcedureRequestRequester"
    }
}

