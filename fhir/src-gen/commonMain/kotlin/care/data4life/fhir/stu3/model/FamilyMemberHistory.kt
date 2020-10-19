/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model

import care.data4life.fhir.stu3.codesystem.AdministrativeGender
import care.data4life.fhir.stu3.codesystem.FamilyHistoryStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirFamilyMemberHistory : FhirDomainResource {

    // External Id(s) for this record.
    val identifier: List<Identifier>?

    // Instantiates protocol or definition.
    val definition: List<Reference>?

    // A code specifying the status of the record of the family history of a specific family member.
    val status: FamilyHistoryStatus

    // The taking of a family member's history did not occur.
    val notDone: String?

    // subject-unknown | withheld | unable-to-obtain | deferred.
    val notDoneReason: CodeableConcept?

    // Patient history is about.
    val patient: Reference

    // When history was captured/updated.
    val date: String?

    // The family member described.
    val name: String?

    // Relationship to the subject.
    val relationship: CodeableConcept

    // Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
    val gender: AdministrativeGender?

    // (approximate) date of birth.
    val bornPeriod: Period?

    // (approximate) date of birth.
    val bornDate: String?

    // (approximate) date of birth.
    val bornString: String?

    // (approximate) age.
    val ageAge: Age?

    // (approximate) age.
    val ageRange: Range?

    // (approximate) age.
    val ageString: String?

    // Age is estimated?.
    val estimatedAge: String?

    // Dead? How old/when?.
    val deceasedBoolean: String?

    // Dead? How old/when?.
    val deceasedAge: Age?

    // Dead? How old/when?.
    val deceasedRange: Range?

    // Dead? How old/when?.
    val deceasedDate: String?

    // Dead? How old/when?.
    val deceasedString: String?

    // Why was family member history performed?.
    val reasonCode: List<CodeableConcept>?

    // Why was family member history performed?.
    val reasonReference: List<Reference>?

    // General note about related person.
    val note: List<Annotation>?

    // Condition that the related person had.
    val condition: List<FamilyMemberHistoryCondition>?
}


/**
 * ClassName: FamilyMemberHistory
 *
 * SourceFileName: FamilyMemberHistory.kt
 *
 *
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistory</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory) on 2020-10-01
 */
@Serializable
@SerialName("FamilyMemberHistory")
data class FamilyMemberHistory(

    // External Id(s) for this record.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Instantiates protocol or definition.
    @SerialName("definition")
    override val definition: List<Reference>? = null,
    // A code specifying the status of the record of the family history of a specific family member.
    @SerialName("status")
    override val status: FamilyHistoryStatus,
    // The taking of a family member's history did not occur.
    @SerialName("notDone")
    override val notDone: String? = null,
    // subject-unknown | withheld | unable-to-obtain | deferred.
    @SerialName("notDoneReason")
    override val notDoneReason: CodeableConcept? = null,
    // Patient history is about.
    @SerialName("patient")
    override val patient: Reference,
    // When history was captured/updated.
    @SerialName("date")
    override val date: String? = null,
    // The family member described.
    @SerialName("name")
    override val name: String? = null,
    // Relationship to the subject.
    @SerialName("relationship")
    override val relationship: CodeableConcept,
    // Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
    @SerialName("gender")
    override val gender: AdministrativeGender? = null,
    // (approximate) date of birth.
    @SerialName("bornPeriod")
    override val bornPeriod: Period? = null,
    // (approximate) date of birth.
    @SerialName("bornDate")
    override val bornDate: String? = null,
    // (approximate) date of birth.
    @SerialName("bornString")
    override val bornString: String? = null,
    // (approximate) age.
    @SerialName("ageAge")
    override val ageAge: Age? = null,
    // (approximate) age.
    @SerialName("ageRange")
    override val ageRange: Range? = null,
    // (approximate) age.
    @SerialName("ageString")
    override val ageString: String? = null,
    // Age is estimated?.
    @SerialName("estimatedAge")
    override val estimatedAge: String? = null,
    // Dead? How old/when?.
    @SerialName("deceasedBoolean")
    override val deceasedBoolean: String? = null,
    // Dead? How old/when?.
    @SerialName("deceasedAge")
    override val deceasedAge: Age? = null,
    // Dead? How old/when?.
    @SerialName("deceasedRange")
    override val deceasedRange: Range? = null,
    // Dead? How old/when?.
    @SerialName("deceasedDate")
    override val deceasedDate: String? = null,
    // Dead? How old/when?.
    @SerialName("deceasedString")
    override val deceasedString: String? = null,
    // Why was family member history performed?.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,
    // Why was family member history performed?.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,
    // General note about related person.
    @SerialName("note")
    override val note: List<Annotation>? = null,
    // Condition that the related person had.
    @SerialName("condition")
    override val condition: List<FamilyMemberHistoryCondition>? = null,


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
) : FhirFamilyMemberHistory {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "FamilyMemberHistory"
    }
}


interface FhirFamilyMemberHistoryCondition : FhirBackboneElement {

    // Condition suffered by relation.
    val code: CodeableConcept

    // deceased | permanent disability | etc..
    val outcome: CodeableConcept?

    // When condition first manifested.
    val onsetAge: Age?

    // When condition first manifested.
    val onsetRange: Range?

    // When condition first manifested.
    val onsetPeriod: Period?

    // When condition first manifested.
    val onsetString: String?

    // Extra information about condition.
    val note: List<Annotation>?
}


/**
 * ClassName: FamilyMemberHistoryCondition
 *
 * SourceFileName: FamilyMemberHistory.kt
 *
 *
 * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory">FamilyMemberHistoryCondition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/FamilyMemberHistory) on 2020-10-01
 */
@Serializable
@SerialName("FamilyMemberHistoryCondition")
data class FamilyMemberHistoryCondition(

    // Condition suffered by relation.
    @SerialName("code")
    override val code: CodeableConcept,
    // deceased | permanent disability | etc..
    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,
    // When condition first manifested.
    @SerialName("onsetAge")
    override val onsetAge: Age? = null,
    // When condition first manifested.
    @SerialName("onsetRange")
    override val onsetRange: Range? = null,
    // When condition first manifested.
    @SerialName("onsetPeriod")
    override val onsetPeriod: Period? = null,
    // When condition first manifested.
    @SerialName("onsetString")
    override val onsetString: String? = null,
    // Extra information about condition.
    @SerialName("note")
    override val note: List<Annotation>? = null,


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
) : FhirFamilyMemberHistoryCondition {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "FamilyMemberHistoryCondition"
    }
}

