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

import care.data4life.hl7.fhir.r4.codesystem.EncounterLocationStatus
import care.data4life.hl7.fhir.r4.codesystem.EncounterStatus
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirEncounter : FhirDomainResource {

    // Identifier(s) by which this encounter is known.
    val identifier: List<Identifier>?

    // None
    val status: EncounterStatus

    // List of past encounter statuses.
    val statusHistory: List<EncounterStatusHistory>?

    // Classification of patient encounter.
    val clazz: Coding

    // List of past encounter classes.
    val classHistory: List<EncounterClassHistory>?

    // Specific type of encounter.
    val type: List<CodeableConcept>?

    // Specific type of service.
    val serviceType: CodeableConcept?

    // Indicates the urgency of the encounter.
    val priority: CodeableConcept?

    // The patient or group present at the encounter.
    val subject: Reference?

    // Episode(s) of care that this encounter should be recorded against.
    val episodeOfCare: List<Reference>?

    // The ServiceRequest that initiated this encounter.
    val basedOn: List<Reference>?

    // List of participants involved in the encounter.
    val participant: List<EncounterParticipant>?

    // The appointment that scheduled this encounter.
    val appointment: List<Reference>?

    // The start and end time of the encounter.
    val period: Period?

    // Quantity of time the encounter lasted (less time absent).
    val length: Duration?

    // Coded reason the encounter takes place.
    val reasonCode: List<CodeableConcept>?

    // Reason the encounter takes place (reference).
    val reasonReference: List<Reference>?

    // The list of diagnosis relevant to this encounter.
    val diagnosis: List<EncounterDiagnosis>?

    // The set of accounts that may be used for billing for this Encounter.
    val account: List<Reference>?

    // Details about the admission to a healthcare service.
    val hospitalization: EncounterHospitalization?

    // List of locations where the patient has been.
    val location: List<EncounterLocation>?

    // The organization (facility) responsible for this encounter.
    val serviceProvider: Reference?

    // Another Encounter this encounter is part of.
    val partOf: Reference?
}

/**
 * ClassName: Encounter
 *
 * SourceFileName: Encounter.kt
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare
 * service(s) or assessing the health status of a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("Encounter")
data class Encounter(

    // Identifier(s) by which this encounter is known.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // None
    @SerialName("status")
    override val status: EncounterStatus,

    // List of past encounter statuses.
    @SerialName("statusHistory")
    override val statusHistory: List<EncounterStatusHistory>? = null,

    // Classification of patient encounter.
    @SerialName("class")
    override val clazz: Coding,

    // List of past encounter classes.
    @SerialName("classHistory")
    override val classHistory: List<EncounterClassHistory>? = null,

    // Specific type of encounter.
    @SerialName("type")
    override val type: List<CodeableConcept>? = null,

    // Specific type of service.
    @SerialName("serviceType")
    override val serviceType: CodeableConcept? = null,

    // Indicates the urgency of the encounter.
    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    // The patient or group present at the encounter.
    @SerialName("subject")
    override val subject: Reference? = null,

    // Episode(s) of care that this encounter should be recorded against.
    @SerialName("episodeOfCare")
    override val episodeOfCare: List<Reference>? = null,

    // The ServiceRequest that initiated this encounter.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    // List of participants involved in the encounter.
    @SerialName("participant")
    override val participant: List<EncounterParticipant>? = null,

    // The appointment that scheduled this encounter.
    @SerialName("appointment")
    override val appointment: List<Reference>? = null,

    // The start and end time of the encounter.
    @SerialName("period")
    override val period: Period? = null,

    // Quantity of time the encounter lasted (less time absent).
    @SerialName("length")
    override val length: Duration? = null,

    // Coded reason the encounter takes place.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    // Reason the encounter takes place (reference).
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    // The list of diagnosis relevant to this encounter.
    @SerialName("diagnosis")
    override val diagnosis: List<EncounterDiagnosis>? = null,

    // The set of accounts that may be used for billing for this Encounter.
    @SerialName("account")
    override val account: List<Reference>? = null,

    // Details about the admission to a healthcare service.
    @SerialName("hospitalization")
    override val hospitalization: EncounterHospitalization? = null,

    // List of locations where the patient has been.
    @SerialName("location")
    override val location: List<EncounterLocation>? = null,

    // The organization (facility) responsible for this encounter.
    @SerialName("serviceProvider")
    override val serviceProvider: Reference? = null,

    // Another Encounter this encounter is part of.
    @SerialName("partOf")
    override val partOf: Reference? = null,

    // # DomainResource

    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,

    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    // Additional content defined by implementations.
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
) : FhirEncounter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Encounter"
    }
}

interface FhirEncounterClassHistory : FhirBackboneElement {

    // inpatient | outpatient | ambulatory | emergency +.
    val clazz: Coding

    // The time that the episode was in the specified class.
    val period: Period
}

/**
 * ClassName: EncounterClassHistory
 *
 * SourceFileName: Encounter.kt
 *
 * The class history permits the tracking of the encounters transitions without needing to go through
 * the resource history. This would be used for a case where an admission starts of as an emergency
 * encounter, then transitions into an inpatient scenario. Doing this and not restarting a new
 * encounter ensures that any lab/diagnostic results can more easily follow the patient and not require
 * re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterClassHistory</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("EncounterClassHistory")
data class EncounterClassHistory(

    // inpatient | outpatient | ambulatory | emergency +.
    @SerialName("class")
    override val clazz: Coding,

    // The time that the episode was in the specified class.
    @SerialName("period")
    override val period: Period,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEncounterClassHistory {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EncounterClassHistory"
    }
}

interface FhirEncounterDiagnosis : FhirBackboneElement {

    // The diagnosis or procedure relevant to the encounter.
    val condition: Reference

    // Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
    val use: CodeableConcept?

    // Ranking of the diagnosis (for each role type).
    val rank: PositiveInteger?
}

/**
 * ClassName: EncounterDiagnosis
 *
 * SourceFileName: Encounter.kt
 *
 * The list of diagnosis relevant to this encounter
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("EncounterDiagnosis")
data class EncounterDiagnosis(

    // The diagnosis or procedure relevant to the encounter.
    @SerialName("condition")
    override val condition: Reference,

    // Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
    @SerialName("use")
    override val use: CodeableConcept? = null,

    // Ranking of the diagnosis (for each role type).
    @SerialName("rank")
    override val rank: PositiveInteger? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEncounterDiagnosis {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EncounterDiagnosis"
    }
}

interface FhirEncounterHospitalization : FhirBackboneElement {

    // Pre-admission identifier.
    val preAdmissionIdentifier: Identifier?

    // The location/organization from which the patient came before admission.
    val origin: Reference?

    // From where patient was admitted (physician referral, transfer).
    val admitSource: CodeableConcept?

    // The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission.
    val reAdmission: CodeableConcept?

    // Diet preferences reported by the patient.
    val dietPreference: List<CodeableConcept>?

    // Special courtesies (VIP, board member).
    val specialCourtesy: List<CodeableConcept>?

    // Wheelchair, translator, stretcher, etc..
    val specialArrangement: List<CodeableConcept>?

    // Location/organization to which the patient is discharged.
    val destination: Reference?

    // Category or kind of location after discharge.
    val dischargeDisposition: CodeableConcept?
}

/**
 * ClassName: EncounterHospitalization
 *
 * SourceFileName: Encounter.kt
 *
 * Details about the admission to a healthcare service
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterHospitalization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("EncounterHospitalization")
data class EncounterHospitalization(

    // Pre-admission identifier.
    @SerialName("preAdmissionIdentifier")
    override val preAdmissionIdentifier: Identifier? = null,

    // The location/organization from which the patient came before admission.
    @SerialName("origin")
    override val origin: Reference? = null,

    // From where patient was admitted (physician referral, transfer).
    @SerialName("admitSource")
    override val admitSource: CodeableConcept? = null,

    // The type of hospital re-admission that has occurred (if any). If the value is absent, then this is not identified as a readmission.
    @SerialName("reAdmission")
    override val reAdmission: CodeableConcept? = null,

    // Diet preferences reported by the patient.
    @SerialName("dietPreference")
    override val dietPreference: List<CodeableConcept>? = null,

    // Special courtesies (VIP, board member).
    @SerialName("specialCourtesy")
    override val specialCourtesy: List<CodeableConcept>? = null,

    // Wheelchair, translator, stretcher, etc..
    @SerialName("specialArrangement")
    override val specialArrangement: List<CodeableConcept>? = null,

    // Location/organization to which the patient is discharged.
    @SerialName("destination")
    override val destination: Reference? = null,

    // Category or kind of location after discharge.
    @SerialName("dischargeDisposition")
    override val dischargeDisposition: CodeableConcept? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEncounterHospitalization {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EncounterHospitalization"
    }
}

interface FhirEncounterLocation : FhirBackboneElement {

    // Location the encounter takes place.
    val location: Reference

    // The status of the participants' presence at the specified location during the period specified. If the participant is no longer at the location, then the period will have an end date/time.
    val status: EncounterLocationStatus?

    // The physical type of the location (usually the level in the location hierachy - bed room ward etc.).
    val physicalType: CodeableConcept?

    // Time period during which the patient was present at the location.
    val period: Period?
}

/**
 * ClassName: EncounterLocation
 *
 * SourceFileName: Encounter.kt
 *
 * List of locations where the patient has been during this encounter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterLocation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("EncounterLocation")
data class EncounterLocation(

    // Location the encounter takes place.
    @SerialName("location")
    override val location: Reference,

    // The status of the participants' presence at the specified location during the period specified. If the participant is no longer at the location, then the period will have an end date/time.
    @SerialName("status")
    override val status: EncounterLocationStatus? = null,

    // The physical type of the location (usually the level in the location hierachy - bed room ward etc.).
    @SerialName("physicalType")
    override val physicalType: CodeableConcept? = null,

    // Time period during which the patient was present at the location.
    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEncounterLocation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EncounterLocation"
    }
}

interface FhirEncounterParticipant : FhirBackboneElement {

    // Role of participant in encounter.
    val type: List<CodeableConcept>?

    // Period of time during the encounter that the participant participated.
    val period: Period?

    // Persons involved in the encounter other than the patient.
    val individual: Reference?
}

/**
 * ClassName: EncounterParticipant
 *
 * SourceFileName: Encounter.kt
 *
 * The list of people responsible for providing the service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("EncounterParticipant")
data class EncounterParticipant(

    // Role of participant in encounter.
    @SerialName("type")
    override val type: List<CodeableConcept>? = null,

    // Period of time during the encounter that the participant participated.
    @SerialName("period")
    override val period: Period? = null,

    // Persons involved in the encounter other than the patient.
    @SerialName("individual")
    override val individual: Reference? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEncounterParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EncounterParticipant"
    }
}

interface FhirEncounterStatusHistory : FhirBackboneElement {

    // None
    val status: EncounterStatus

    // The time that the episode was in the specified status.
    val period: Period
}

/**
 * ClassName: EncounterStatusHistory
 *
 * SourceFileName: Encounter.kt
 *
 * The status history permits the encounter resource to contain the status history without needing to
 * read through the historical versions of the resource, or even have the server store them.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterStatusHistory</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
@Serializable
@SerialName("EncounterStatusHistory")
data class EncounterStatusHistory(

    // None
    @SerialName("status")
    override val status: EncounterStatus,

    // The time that the episode was in the specified status.
    @SerialName("period")
    override val period: Period,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEncounterStatusHistory {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EncounterStatusHistory"
    }
}
