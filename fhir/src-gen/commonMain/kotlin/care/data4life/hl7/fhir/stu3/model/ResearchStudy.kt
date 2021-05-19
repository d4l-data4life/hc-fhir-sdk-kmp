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

import care.data4life.hl7.fhir.stu3.codesystem.ResearchStudyStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirResearchStudy
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to
 * increase the field of healthcare-related knowledge. This includes studies of safety, efficacy,
 * comparative effectiveness and other information about medications, devices, therapies and other
 * interventional and investigative techniques. A ResearchStudy involves the gathering of information
 * about human or animal subjects.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchStudy">ResearchStudy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ResearchStudy)
 */
interface FhirResearchStudy : FhirDomainResource {

    /**
     * Business Identifier for study.
     */
    val identifier: List<Identifier>?

    /**
     * Name for this study.
     */
    val title: String?

    /**
     * Steps followed in executing study.
     */
    val protocol: List<Reference>?

    /**
     * Part of larger study.
     */
    val partOf: List<Reference>?

    /**
     * The current state of the study.
     */
    val status: ResearchStudyStatus

    /**
     * Classifications for the study.
     */
    val category: List<CodeableConcept>?

    /**
     * Drugs, devices, conditions, etc. under study.
     */
    val focus: List<CodeableConcept>?

    /**
     * Contact details for the study.
     */
    val contact: List<ContactDetail>?

    /**
     * References and dependencies.
     */
    val relatedArtifact: List<RelatedArtifact>?

    /**
     * Used to search for the study.
     */
    val keyword: List<CodeableConcept>?

    /**
     * Geographic region(s) for study.
     */
    val jurisdiction: List<CodeableConcept>?

    /**
     * What this is study doing.
     */
    val description: String?

    /**
     * Inclusion & exclusion criteria.
     */
    val enrollment: List<Reference>?

    /**
     * When the study began and ended.
     */
    val period: Period?

    /**
     * Organization responsible for the study.
     */
    val sponsor: Reference?

    /**
     * The individual responsible for the study.
     */
    val principalInvestigator: Reference?

    /**
     * Location involved in study execution.
     */
    val site: List<Reference>?

    /**
     * Reason for terminating study early.
     */
    val reasonStopped: CodeableConcept?

    /**
     * Comments made about the event.
     */
    val note: List<Annotation>?

    /**
     * Defined path through the study for a subject.
     */
    val arm: List<ResearchStudyArm>?
}

/**
 * ResearchStudy
 *
 * SourceFileName: ResearchStudy.kt
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to
 * increase the field of healthcare-related knowledge. This includes studies of safety, efficacy,
 * comparative effectiveness and other information about medications, devices, therapies and other
 * interventional and investigative techniques. A ResearchStudy involves the gathering of information
 * about human or animal subjects.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchStudy">ResearchStudy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ResearchStudy)
 */
@Serializable
@SerialName("ResearchStudy")
data class ResearchStudy(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("protocol")
    override val protocol: List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("status")
    override val status: ResearchStudyStatus,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("focus")
    override val focus: List<CodeableConcept>? = null,

    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,

    @SerialName("relatedArtifact")
    override val relatedArtifact: List<RelatedArtifact>? = null,

    @SerialName("keyword")
    override val keyword: List<CodeableConcept>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("enrollment")
    override val enrollment: List<Reference>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("sponsor")
    override val sponsor: Reference? = null,

    @SerialName("principalInvestigator")
    override val principalInvestigator: Reference? = null,

    @SerialName("site")
    override val site: List<Reference>? = null,

    @SerialName("reasonStopped")
    override val reasonStopped: CodeableConcept? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("arm")
    override val arm: List<ResearchStudyArm>? = null,

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
) : FhirResearchStudy {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ResearchStudy"
    }
}

/**
 * FhirResearchStudyArm
 *
 * Describes an expected sequence of events for one of the participants of a study. E.g. Exposure to
 * drug A, wash-out, exposure to drug B, wash-out, follow-up.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchStudy">ResearchStudyArm</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ResearchStudy)
 */
interface FhirResearchStudyArm : FhirBackboneElement {

    /**
     * Label for study arm.
     */
    val name: String

    /**
     * Categorization of study arm.
     */
    val code: CodeableConcept?

    /**
     * Short explanation of study path.
     */
    val description: String?
}

/**
 * ResearchStudyArm
 *
 * SourceFileName: ResearchStudy.kt
 *
 * Describes an expected sequence of events for one of the participants of a study. E.g. Exposure to
 * drug A, wash-out, exposure to drug B, wash-out, follow-up.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchStudy">ResearchStudyArm</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ResearchStudy)
 */
@Serializable
@SerialName("ResearchStudyArm")
data class ResearchStudyArm(

    @SerialName("name")
    override val name: String,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirResearchStudyArm {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ResearchStudyArm"
    }
}
