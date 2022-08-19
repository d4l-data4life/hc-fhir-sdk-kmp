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

import care.data4life.hl7.fhir.stu3.codesystem.AdministrativeGender
import care.data4life.hl7.fhir.stu3.codesystem.FamilyHistoryStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirFamilyMemberHistory
 *
 * Significant health events and conditions for a person related to the patient relevant in the context
 * of care for the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistory</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
 */
interface FhirFamilyMemberHistory : FhirDomainResource {

    /**
     * External Id(s) for this record.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Instantiates protocol or definition.
     */
    val definition: kotlin.collections.List<Reference>?

    /**
     * A code specifying the status of the record of the family history of a specific
     * family member.
     */
    val status: FamilyHistoryStatus

    /**
     * The taking of a family member's history did not occur.
     */
    val notDone: Bool?

    /**
     * subject-unknown | withheld | unable-to-obtain | deferred.
     */
    val notDoneReason: CodeableConcept?

    /**
     * Patient history is about.
     */
    val patient: Reference

    /**
     * When history was captured/updated.
     */
    val date: DateTime?

    /**
     * The family member described.
     */
    val name: String?

    /**
     * Relationship to the subject.
     */
    val relationship: CodeableConcept

    /**
     * Administrative Gender - the gender that the relative is considered to have for
     * administration and record keeping purposes.
     */
    val gender: AdministrativeGender?

    /**
     * (approximate) date of birth.
     */
    val bornPeriod: Period?

    /**
     * (approximate) date of birth.
     */
    val bornDate: Date?

    /**
     * (approximate) date of birth.
     */
    val bornString: String?

    /**
     * (approximate) age.
     */
    val ageAge: Age?

    /**
     * (approximate) age.
     */
    val ageRange: Range?

    /**
     * (approximate) age.
     */
    val ageString: String?

    /**
     * Age is estimated?.
     */
    val estimatedAge: Bool?

    /**
     * Dead? How old/when?.
     */
    val deceasedBoolean: Bool?

    /**
     * Dead? How old/when?.
     */
    val deceasedAge: Age?

    /**
     * Dead? How old/when?.
     */
    val deceasedRange: Range?

    /**
     * Dead? How old/when?.
     */
    val deceasedDate: Date?

    /**
     * Dead? How old/when?.
     */
    val deceasedString: String?

    /**
     * Why was family member history performed?.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why was family member history performed?.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * General note about related person.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Condition that the related person had.
     */
    val condition: kotlin.collections.List<FamilyMemberHistoryCondition>?
}

/**
 * FamilyMemberHistory
 *
 * Significant health events and conditions for a person related to the patient relevant in the context
 * of care for the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistory</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
 */
@Serializable
@SerialName("FamilyMemberHistory")
data class FamilyMemberHistory(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("definition")
    override val definition: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: FamilyHistoryStatus,

    @SerialName("notDone")
    override val notDone: Bool? = null,

    @SerialName("notDoneReason")
    override val notDoneReason: CodeableConcept? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("relationship")
    override val relationship: CodeableConcept,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("bornPeriod")
    override val bornPeriod: Period? = null,

    @SerialName("bornDate")
    override val bornDate: Date? = null,

    @SerialName("bornString")
    override val bornString: String? = null,

    @SerialName("ageAge")
    override val ageAge: Age? = null,

    @SerialName("ageRange")
    override val ageRange: Range? = null,

    @SerialName("ageString")
    override val ageString: String? = null,

    @SerialName("estimatedAge")
    override val estimatedAge: Bool? = null,

    @SerialName("deceasedBoolean")
    override val deceasedBoolean: Bool? = null,

    @SerialName("deceasedAge")
    override val deceasedAge: Age? = null,

    @SerialName("deceasedRange")
    override val deceasedRange: Range? = null,

    @SerialName("deceasedDate")
    override val deceasedDate: Date? = null,

    @SerialName("deceasedString")
    override val deceasedString: String? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("condition")
    override val condition: kotlin.collections.List<FamilyMemberHistoryCondition>? = null,

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
) : FhirFamilyMemberHistory {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "FamilyMemberHistory"
    }
}

/**
 * FhirFamilyMemberHistoryCondition
 *
 * The significant Conditions (or condition) that the family member had. This is a repeating section to
 * allow a system to represent more than one condition per resource, though there is nothing stopping
 * multiple resources - one per condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistoryCondition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
 */
interface FhirFamilyMemberHistoryCondition : FhirBackboneElement {

    /**
     * Condition suffered by relation.
     */
    val code: CodeableConcept

    /**
     * deceased | permanent disability | etc..
     */
    val outcome: CodeableConcept?

    /**
     * When condition first manifested.
     */
    val onsetAge: Age?

    /**
     * When condition first manifested.
     */
    val onsetRange: Range?

    /**
     * When condition first manifested.
     */
    val onsetPeriod: Period?

    /**
     * When condition first manifested.
     */
    val onsetString: String?

    /**
     * Extra information about condition.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * FamilyMemberHistoryCondition
 *
 * The significant Conditions (or condition) that the family member had. This is a repeating section to
 * allow a system to represent more than one condition per resource, though there is nothing stopping
 * multiple resources - one per condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistoryCondition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory)
 */
@Serializable
@SerialName("FamilyMemberHistoryCondition")
data class FamilyMemberHistoryCondition(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("onsetAge")
    override val onsetAge: Age? = null,

    @SerialName("onsetRange")
    override val onsetRange: Range? = null,

    @SerialName("onsetPeriod")
    override val onsetPeriod: Period? = null,

    @SerialName("onsetString")
    override val onsetString: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirFamilyMemberHistoryCondition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "FamilyMemberHistoryCondition"
    }
}
