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

import care.data4life.hl7.fhir.stu3.codesystem.EventStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirProcedure
 *
 * An action that is or was performed on a patient. This can be a physical intervention like an
 * operation, or less invasive like counseling or hypnotherapy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
interface FhirProcedure : FhirDomainResource {

    /**
     * External Identifiers for this procedure.
     */
    val identifier: List<Identifier>?

    /**
     * Instantiates protocol or definition.
     */
    val definition: List<Reference>?

    /**
     * A request for this procedure.
     */
    val basedOn: List<Reference>?

    /**
     * Part of referenced event.
     */
    val partOf: List<Reference>?

    /**
     * A code specifying the state of the procedure. Generally this will be in-progress
     * or completed state.
     */
    val status: EventStatus

    /**
     * True if procedure was not performed as scheduled.
     */
    val notDone: Bool?

    /**
     * Reason procedure was not performed.
     */
    val notDoneReason: CodeableConcept?

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
     * Encounter or episode associated with the procedure.
     */
    val context: Reference?

    /**
     * Date/Period the procedure was performed.
     */
    val performedDateTime: DateTime?

    /**
     * Date/Period the procedure was performed.
     */
    val performedPeriod: Period?

    /**
     * The people who performed the procedure.
     */
    val performer: List<ProcedurePerformer>?

    /**
     * Where the procedure happened.
     */
    val location: Reference?

    /**
     * Coded reason procedure performed.
     */
    val reasonCode: List<CodeableConcept>?

    /**
     * Condition that is the reason the procedure performed.
     */
    val reasonReference: List<Reference>?

    /**
     * Target body sites.
     */
    val bodySite: List<CodeableConcept>?

    /**
     * The result of procedure.
     */
    val outcome: CodeableConcept?

    /**
     * Any report resulting from the procedure.
     */
    val report: List<Reference>?

    /**
     * Complication following the procedure.
     */
    val complication: List<CodeableConcept>?

    /**
     * A condition that is a result of the procedure.
     */
    val complicationDetail: List<Reference>?

    /**
     * Instructions for follow up.
     */
    val followUp: List<CodeableConcept>?

    /**
     * Additional information about the procedure.
     */
    val note: List<Annotation>?

    /**
     * Device changed in procedure.
     */
    val focalDevice: List<ProcedureFocalDevice>?

    /**
     * Items used during procedure.
     */
    val usedReference: List<Reference>?

    /**
     * Coded items used during the procedure.
     */
    val usedCode: List<CodeableConcept>?
}

/**
 * Procedure
 *
 * SourceFileName: Procedure.kt
 *
 * An action that is or was performed on a patient. This can be a physical intervention like an
 * operation, or less invasive like counseling or hypnotherapy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">Procedure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
@Serializable
@SerialName("Procedure")
data class Procedure(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("definition")
    override val definition: List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("status")
    override val status: EventStatus,

    @SerialName("notDone")
    override val notDone: Bool? = null,

    @SerialName("notDoneReason")
    override val notDoneReason: CodeableConcept? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("performedDateTime")
    override val performedDateTime: DateTime? = null,

    @SerialName("performedPeriod")
    override val performedPeriod: Period? = null,

    @SerialName("performer")
    override val performer: List<ProcedurePerformer>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("report")
    override val report: List<Reference>? = null,

    @SerialName("complication")
    override val complication: List<CodeableConcept>? = null,

    @SerialName("complicationDetail")
    override val complicationDetail: List<Reference>? = null,

    @SerialName("followUp")
    override val followUp: List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("focalDevice")
    override val focalDevice: List<ProcedureFocalDevice>? = null,

    @SerialName("usedReference")
    override val usedReference: List<Reference>? = null,

    @SerialName("usedCode")
    override val usedCode: List<CodeableConcept>? = null,

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
) : FhirProcedure {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Procedure"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Procedure)
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
 * SourceFileName: Procedure.kt
 *
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement,
 * fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedureFocalDevice</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Procedure)
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
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirProcedureFocalDevice {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcedureFocalDevice"
    }
}

/**
 * FhirProcedurePerformer
 *
 * Limited to 'real' people rather than equipment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedurePerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
interface FhirProcedurePerformer : FhirBackboneElement {

    /**
     * The role the actor was in.
     */
    val role: CodeableConcept?

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
 * SourceFileName: Procedure.kt
 *
 * Limited to 'real' people rather than equipment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Procedure">ProcedurePerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Procedure)
 */
@Serializable
@SerialName("ProcedurePerformer")
data class ProcedurePerformer(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

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
) : FhirProcedurePerformer {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcedurePerformer"
    }
}
