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

import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirProcedure
 *
 * An action that is or was performed on or for a patient. This can be a physical intervention like an
 * operation, or less invasive like long term services, counseling, or hypnotherapy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
interface FhirProcedure : FhirDomainResource {

    /**
     * External Identifiers for this procedure.
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
     * A request for this procedure.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Part of referenced event.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * A code specifying the state of the procedure. Generally, this will be the in-
     * progress or completed state.
     */
    val status: EventStatus

    /**
     * Reason for current status.
     */
    val statusReason: CodeableConcept?

    /**
     * Classification of the procedure.
     */
    val category: CodeableConcept?

    /**
     * Identification of the procedure.
     */
    val code: CodeableConcept?

    /**
     * Who the procedure was performed on.
     */
    val subject: Reference

    /**
     * Encounter created as part of.
     */
    val encounter: Reference?

    /**
     * When the procedure was performed.
     */
    val performedDateTime: DateTime?

    /**
     * When the procedure was performed.
     */
    val performedPeriod: Period?

    /**
     * When the procedure was performed.
     */
    val performedString: String?

    /**
     * When the procedure was performed.
     */
    val performedAge: Age?

    /**
     * When the procedure was performed.
     */
    val performedRange: Range?

    /**
     * Who recorded the procedure.
     */
    val recorder: Reference?

    /**
     * Person who asserts this procedure.
     */
    val asserter: Reference?

    /**
     * The people who performed the procedure.
     */
    val performer: kotlin.collections.List<ProcedurePerformer>?

    /**
     * Where the procedure happened.
     */
    val location: Reference?

    /**
     * Coded reason procedure performed.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * The justification that the procedure was performed.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Target body sites.
     */
    val bodySite: kotlin.collections.List<CodeableConcept>?

    /**
     * The result of procedure.
     */
    val outcome: CodeableConcept?

    /**
     * Any report resulting from the procedure.
     */
    val report: kotlin.collections.List<Reference>?

    /**
     * Complication following the procedure.
     */
    val complication: kotlin.collections.List<CodeableConcept>?

    /**
     * A condition that is a result of the procedure.
     */
    val complicationDetail: kotlin.collections.List<Reference>?

    /**
     * Instructions for follow up.
     */
    val followUp: kotlin.collections.List<CodeableConcept>?

    /**
     * Additional information about the procedure.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Manipulated, implanted, or removed device.
     */
    val focalDevice: kotlin.collections.List<ProcedureFocalDevice>?

    /**
     * Items used during procedure.
     */
    val usedReference: kotlin.collections.List<Reference>?

    /**
     * Coded items used during the procedure.
     */
    val usedCode: kotlin.collections.List<CodeableConcept>?
}

/**
 * Procedure
 *
 * An action that is or was performed on or for a patient. This can be a physical intervention like an
 * operation, or less invasive like long term services, counseling, or hypnotherapy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
@Serializable
@SerialName("Procedure")
data class Procedure(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: kotlin.collections.List<String>? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: kotlin.collections.List<String>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: EventStatus,

    @SerialName("statusReason")
    override val statusReason: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("performedDateTime")
    override val performedDateTime: DateTime? = null,

    @SerialName("performedPeriod")
    override val performedPeriod: Period? = null,

    @SerialName("performedString")
    override val performedString: String? = null,

    @SerialName("performedAge")
    override val performedAge: Age? = null,

    @SerialName("performedRange")
    override val performedRange: Range? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("asserter")
    override val asserter: Reference? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<ProcedurePerformer>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("report")
    override val report: kotlin.collections.List<Reference>? = null,

    @SerialName("complication")
    override val complication: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("complicationDetail")
    override val complicationDetail: kotlin.collections.List<Reference>? = null,

    @SerialName("followUp")
    override val followUp: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("focalDevice")
    override val focalDevice: kotlin.collections.List<ProcedureFocalDevice>? = null,

    @SerialName("usedReference")
    override val usedReference: kotlin.collections.List<Reference>? = null,

    @SerialName("usedCode")
    override val usedCode: kotlin.collections.List<CodeableConcept>? = null,

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
) : FhirProcedure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Procedure"
    }
}

/**
 * FhirProcedureFocalDevice
 *
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement,
 * fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedureFocalDevice</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
interface FhirProcedureFocalDevice : FhirBackboneElement {

    /**
     * Kind of change to device.
     */
    val action: CodeableConcept?

    /**
     * Device that was changed.
     */
    val manipulated: Reference
}

/**
 * ProcedureFocalDevice
 *
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement,
 * fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedureFocalDevice</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
@Serializable
@SerialName("ProcedureFocalDevice")
data class ProcedureFocalDevice(

    @SerialName("action")
    override val action: CodeableConcept? = null,

    @SerialName("manipulated")
    override val manipulated: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirProcedureFocalDevice {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ProcedureFocalDevice"
    }
}

/**
 * FhirProcedurePerformer
 *
 * Limited to "real" people rather than equipment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedurePerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
interface FhirProcedurePerformer : FhirBackboneElement {

    /**
     * Type of performance.
     */
    val function: CodeableConcept?

    /**
     * The reference to the practitioner.
     */
    val actor: Reference

    /**
     * Organization the device or practitioner was acting for.
     */
    val onBehalfOf: Reference?
}

/**
 * ProcedurePerformer
 *
 * Limited to "real" people rather than equipment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedurePerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
@Serializable
@SerialName("ProcedurePerformer")
data class ProcedurePerformer(

    @SerialName("function")
    override val function: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirProcedurePerformer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ProcedurePerformer"
    }
}
