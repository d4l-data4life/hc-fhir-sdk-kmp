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

/**
 * FhirEncounter
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare
 * service(s) or assessing the health status of a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">Encounter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
interface FhirEncounter : FhirDomainResource {

    /**
     * Identifier(s) by which this encounter is known.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * None
     */
    val status: EncounterStatus

    /**
     * List of past encounter statuses.
     */
    val statusHistory: kotlin.collections.List<EncounterStatusHistory>?

    /**
     * Classification of patient encounter.
     */
    val clazz: Coding

    /**
     * List of past encounter classes.
     */
    val classHistory: kotlin.collections.List<EncounterClassHistory>?

    /**
     * Specific type of encounter.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Specific type of service.
     */
    val serviceType: CodeableConcept?

    /**
     * Indicates the urgency of the encounter.
     */
    val priority: CodeableConcept?

    /**
     * The patient or group present at the encounter.
     */
    val subject: Reference?

    /**
     * Episode(s) of care that this encounter should be recorded against.
     */
    val episodeOfCare: kotlin.collections.List<Reference>?

    /**
     * The ServiceRequest that initiated this encounter.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * List of participants involved in the encounter.
     */
    val participant: kotlin.collections.List<EncounterParticipant>?

    /**
     * The appointment that scheduled this encounter.
     */
    val appointment: kotlin.collections.List<Reference>?

    /**
     * The start and end time of the encounter.
     */
    val period: Period?

    /**
     * Quantity of time the encounter lasted (less time absent).
     */
    val length: Duration?

    /**
     * Coded reason the encounter takes place.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Reason the encounter takes place (reference).
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * The list of diagnosis relevant to this encounter.
     */
    val diagnosis: kotlin.collections.List<EncounterDiagnosis>?

    /**
     * The set of accounts that may be used for billing for this Encounter.
     */
    val account: kotlin.collections.List<Reference>?

    /**
     * Details about the admission to a healthcare service.
     */
    val hospitalization: EncounterHospitalization?

    /**
     * List of locations where the patient has been.
     */
    val location: kotlin.collections.List<EncounterLocation>?

    /**
     * The organization (facility) responsible for this encounter.
     */
    val serviceProvider: Reference?

    /**
     * Another Encounter this encounter is part of.
     */
    val partOf: Reference?
}

/**
 * Encounter
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

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: EncounterStatus,

    @SerialName("statusHistory")
    override val statusHistory: kotlin.collections.List<EncounterStatusHistory>? = null,

    @SerialName("class")
    override val clazz: Coding,

    @SerialName("classHistory")
    override val classHistory: kotlin.collections.List<EncounterClassHistory>? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("serviceType")
    override val serviceType: CodeableConcept? = null,

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("episodeOfCare")
    override val episodeOfCare: kotlin.collections.List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<EncounterParticipant>? = null,

    @SerialName("appointment")
    override val appointment: kotlin.collections.List<Reference>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("length")
    override val length: Duration? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("diagnosis")
    override val diagnosis: kotlin.collections.List<EncounterDiagnosis>? = null,

    @SerialName("account")
    override val account: kotlin.collections.List<Reference>? = null,

    @SerialName("hospitalization")
    override val hospitalization: EncounterHospitalization? = null,

    @SerialName("location")
    override val location: kotlin.collections.List<EncounterLocation>? = null,

    @SerialName("serviceProvider")
    override val serviceProvider: Reference? = null,

    @SerialName("partOf")
    override val partOf: Reference? = null,

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
) : FhirEncounter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Encounter"
    }
}

/**
 * FhirEncounterClassHistory
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
interface FhirEncounterClassHistory : FhirBackboneElement {

    /**
     * inpatient | outpatient | ambulatory | emergency +.
     */
    val clazz: Coding

    /**
     * The time that the episode was in the specified class.
     */
    val period: Period
}

/**
 * EncounterClassHistory
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

    @SerialName("class")
    override val clazz: Coding,

    @SerialName("period")
    override val period: Period,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEncounterClassHistory {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EncounterClassHistory"
    }
}

/**
 * FhirEncounterDiagnosis
 *
 * The list of diagnosis relevant to this encounter
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
interface FhirEncounterDiagnosis : FhirBackboneElement {

    /**
     * The diagnosis or procedure relevant to the encounter.
     */
    val condition: Reference

    /**
     * Role that this diagnosis has within the encounter (e.g. admission, billing,
     * discharge …).
     */
    val use: CodeableConcept?

    /**
     * Ranking of the diagnosis (for each role type).
     */
    val rank: PositiveInteger?
}

/**
 * EncounterDiagnosis
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

    @SerialName("condition")
    override val condition: Reference,

    @SerialName("use")
    override val use: CodeableConcept? = null,

    @SerialName("rank")
    override val rank: PositiveInteger? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEncounterDiagnosis {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EncounterDiagnosis"
    }
}

/**
 * FhirEncounterHospitalization
 *
 * Details about the admission to a healthcare service
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterHospitalization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
interface FhirEncounterHospitalization : FhirBackboneElement {

    /**
     * Pre-admission identifier.
     */
    val preAdmissionIdentifier: Identifier?

    /**
     * The location/organization from which the patient came before admission.
     */
    val origin: Reference?

    /**
     * From where patient was admitted (physician referral, transfer).
     */
    val admitSource: CodeableConcept?

    /**
     * The type of hospital re-admission that has occurred (if any). If the value is
     * absent, then this is not identified as a readmission.
     */
    val reAdmission: CodeableConcept?

    /**
     * Diet preferences reported by the patient.
     */
    val dietPreference: kotlin.collections.List<CodeableConcept>?

    /**
     * Special courtesies (VIP, board member).
     */
    val specialCourtesy: kotlin.collections.List<CodeableConcept>?

    /**
     * Wheelchair, translator, stretcher, etc..
     */
    val specialArrangement: kotlin.collections.List<CodeableConcept>?

    /**
     * Location/organization to which the patient is discharged.
     */
    val destination: Reference?

    /**
     * Category or kind of location after discharge.
     */
    val dischargeDisposition: CodeableConcept?
}

/**
 * EncounterHospitalization
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

    @SerialName("preAdmissionIdentifier")
    override val preAdmissionIdentifier: Identifier? = null,

    @SerialName("origin")
    override val origin: Reference? = null,

    @SerialName("admitSource")
    override val admitSource: CodeableConcept? = null,

    @SerialName("reAdmission")
    override val reAdmission: CodeableConcept? = null,

    @SerialName("dietPreference")
    override val dietPreference: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialCourtesy")
    override val specialCourtesy: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialArrangement")
    override val specialArrangement: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("destination")
    override val destination: Reference? = null,

    @SerialName("dischargeDisposition")
    override val dischargeDisposition: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEncounterHospitalization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EncounterHospitalization"
    }
}

/**
 * FhirEncounterLocation
 *
 * List of locations where the patient has been during this encounter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterLocation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
interface FhirEncounterLocation : FhirBackboneElement {

    /**
     * Location the encounter takes place.
     */
    val location: Reference

    /**
     * The status of the participants' presence at the specified location during the
     * period specified. If the participant is no longer at the location, then the
     * period will have an end date/time.
     */
    val status: EncounterLocationStatus?

    /**
     * The physical type of the location (usually the level in the location hierachy -
     * bed room ward etc.).
     */
    val physicalType: CodeableConcept?

    /**
     * Time period during which the patient was present at the location.
     */
    val period: Period?
}

/**
 * EncounterLocation
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

    @SerialName("location")
    override val location: Reference,

    @SerialName("status")
    override val status: EncounterLocationStatus? = null,

    @SerialName("physicalType")
    override val physicalType: CodeableConcept? = null,

    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEncounterLocation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EncounterLocation"
    }
}

/**
 * FhirEncounterParticipant
 *
 * The list of people responsible for providing the service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
interface FhirEncounterParticipant : FhirBackboneElement {

    /**
     * Role of participant in encounter.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Period of time during the encounter that the participant participated.
     */
    val period: Period?

    /**
     * Persons involved in the encounter other than the patient.
     */
    val individual: Reference?
}

/**
 * EncounterParticipant
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

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("individual")
    override val individual: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEncounterParticipant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EncounterParticipant"
    }
}

/**
 * FhirEncounterStatusHistory
 *
 * The status history permits the encounter resource to contain the status history without needing to
 * read through the historical versions of the resource, or even have the server store them.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Encounter">EncounterStatusHistory</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Encounter)
 */
interface FhirEncounterStatusHistory : FhirBackboneElement {

    /**
     * None
     */
    val status: EncounterStatus

    /**
     * The time that the episode was in the specified status.
     */
    val period: Period
}

/**
 * EncounterStatusHistory
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

    @SerialName("status")
    override val status: EncounterStatus,

    @SerialName("period")
    override val period: Period,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEncounterStatusHistory {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EncounterStatusHistory"
    }
}
