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

/**
 * FhirProcedureRequest
 *
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcedureRequest">ProcedureRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcedureRequest)
 */
interface FhirProcedureRequest : FhirDomainResource {

    /**
     * Identifiers assigned to this order.
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
    val replaces: List<Reference>?

    /**
     * Composite Request ID.
     */
    val requisition: Identifier?

    /**
     * The status of the order.
     */
    val status: RequestStatus

    /**
     * Whether the request is a proposal, plan, an original order or a reflex order.
     */
    val intent: RequestIntent

    /**
     * Indicates how quickly the ProcedureRequest should be addressed with respect to
     * other requests.
     */
    val priority: RequestPriority?

    /**
     * True if procedure should not be performed.
     */
    val doNotPerform: Bool?

    /**
     * Classification of procedure.
     */
    val category: List<CodeableConcept>?

    /**
     * What is being requested/ordered.
     */
    val code: CodeableConcept

    /**
     * Individual the service is ordered for.
     */
    val subject: Reference

    /**
     * Encounter or Episode during which request was created.
     */
    val context: Reference?

    /**
     * When procedure should occur.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When procedure should occur.
     */
    val occurrencePeriod: Period?

    /**
     * When procedure should occur.
     */
    val occurrenceTiming: Timing?

    /**
     * Preconditions for procedure or diagnostic.
     */
    val asNeededBoolean: Bool?

    /**
     * Preconditions for procedure or diagnostic.
     */
    val asNeededCodeableConcept: CodeableConcept?

    /**
     * Date request signed.
     */
    val authoredOn: DateTime?

    /**
     * Who/what is requesting procedure or diagnostic.
     */
    val requester: ProcedureRequestRequester?

    /**
     * Performer role.
     */
    val performerType: CodeableConcept?

    /**
     * Requested perfomer.
     */
    val performer: Reference?

    /**
     * Explanation/Justification for test.
     */
    val reasonCode: List<CodeableConcept>?

    /**
     * Explanation/Justification for test.
     */
    val reasonReference: List<Reference>?

    /**
     * Additional clinical information.
     */
    val supportingInfo: List<Reference>?

    /**
     * Procedure Samples.
     */
    val specimen: List<Reference>?

    /**
     * Location on Body.
     */
    val bodySite: List<CodeableConcept>?

    /**
     * Comments.
     */
    val note: List<Annotation>?

    /**
     * Request provenance.
     */
    val relevantHistory: List<Reference>?
}

/**
 * ProcedureRequest
 *
 * SourceFileName: ProcedureRequest.kt
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

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("definition")
    override val definition: List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: List<Reference>? = null,

    @SerialName("requisition")
    override val requisition: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus,

    @SerialName("intent")
    override val intent: RequestIntent,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

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

    @SerialName("asNeededBoolean")
    override val asNeededBoolean: Bool? = null,

    @SerialName("asNeededCodeableConcept")
    override val asNeededCodeableConcept: CodeableConcept? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: ProcedureRequestRequester? = null,

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

    @SerialName("specimen")
    override val specimen: List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,

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
) : FhirProcedureRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcedureRequest"
    }
}

/**
 * FhirProcedureRequestRequester
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcedureRequest">ProcedureRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcedureRequest)
 */
interface FhirProcedureRequestRequester : FhirBackboneElement {

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
 * ProcedureRequestRequester
 *
 * SourceFileName: ProcedureRequest.kt
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
) : FhirProcedureRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcedureRequestRequester"
    }
}
