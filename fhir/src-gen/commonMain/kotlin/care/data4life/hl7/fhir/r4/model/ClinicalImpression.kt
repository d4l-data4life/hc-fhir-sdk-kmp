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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirClinicalImpression
 *
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and
 * before planning the treatments or management strategies that are best to manage a patient's
 * condition. Assessments are often 1:1 with a clinical consultation / encounter, but this varies
 * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than
 * "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClinicalImpression">ClinicalImpression</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClinicalImpression)
 */
interface FhirClinicalImpression : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Identifies the workflow status of the assessment.
     *
     * Only use: ['in-progress', 'completed', 'entered-in-error']
     */
    val status: EventStatus

    /**
     * Reason for current status.
     */
    val statusReason: CodeableConcept?

    /**
     * Kind of assessment performed.
     */
    val code: CodeableConcept?

    /**
     * Why/how the assessment was performed.
     */
    val description: String?

    /**
     * Patient or group assessed.
     */
    val subject: Reference

    /**
     * Encounter created as part of.
     */
    val encounter: Reference?

    /**
     * Time of assessment.
     */
    val effectiveDateTime: DateTime?

    /**
     * Time of assessment.
     */
    val effectivePeriod: Period?

    /**
     * When the assessment was documented.
     */
    val date: DateTime?

    /**
     * The clinician performing the assessment.
     */
    val assessor: Reference?

    /**
     * Reference to last assessment.
     */
    val previous: Reference?

    /**
     * Relevant impressions of patient state.
     */
    val problem: kotlin.collections.List<Reference>?

    /**
     * One or more sets of investigations (signs, symptoms, etc.).
     */
    val investigation: kotlin.collections.List<ClinicalImpressionInvestigation>?

    /**
     * Clinical Protocol followed.
     */
    val protocol: kotlin.collections.List<String>?

    /**
     * Summary of the assessment.
     */
    val summary: String?

    /**
     * Possible or likely findings and diagnoses.
     */
    val finding: kotlin.collections.List<ClinicalImpressionFinding>?

    /**
     * Estimate of likely outcome.
     */
    val prognosisCodeableConcept: kotlin.collections.List<CodeableConcept>?

    /**
     * RiskAssessment expressing likely outcome.
     */
    val prognosisReference: kotlin.collections.List<Reference>?

    /**
     * Information supporting the clinical impression.
     */
    val supportingInfo: kotlin.collections.List<Reference>?

    /**
     * Comments made about the ClinicalImpression.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * ClinicalImpression
 *
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and
 * before planning the treatments or management strategies that are best to manage a patient's
 * condition. Assessments are often 1:1 with a clinical consultation / encounter, but this varies
 * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than
 * "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClinicalImpression">ClinicalImpression</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClinicalImpression)
 */
@Serializable
@SerialName("ClinicalImpression")
data class ClinicalImpression(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: EventStatus,

    @SerialName("statusReason")
    override val statusReason: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("assessor")
    override val assessor: Reference? = null,

    @SerialName("previous")
    override val previous: Reference? = null,

    @SerialName("problem")
    override val problem: kotlin.collections.List<Reference>? = null,

    @SerialName("investigation")
    override val investigation: kotlin.collections.List<ClinicalImpressionInvestigation>? = null,

    @SerialName("protocol")
    override val protocol: kotlin.collections.List<String>? = null,

    @SerialName("summary")
    override val summary: String? = null,

    @SerialName("finding")
    override val finding: kotlin.collections.List<ClinicalImpressionFinding>? = null,

    @SerialName("prognosisCodeableConcept")
    override val prognosisCodeableConcept: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("prognosisReference")
    override val prognosisReference: kotlin.collections.List<Reference>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

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
) : FhirClinicalImpression {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClinicalImpression"
    }
}

/**
 * FhirClinicalImpressionFinding
 *
 * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClinicalImpression">ClinicalImpressionFinding</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClinicalImpression)
 */
interface FhirClinicalImpressionFinding : FhirBackboneElement {

    /**
     * What was found.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * What was found.
     */
    val itemReference: Reference?

    /**
     * Which investigations support finding.
     */
    val basis: String?
}

/**
 * ClinicalImpressionFinding
 *
 * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClinicalImpression">ClinicalImpressionFinding</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClinicalImpression)
 */
@Serializable
@SerialName("ClinicalImpressionFinding")
data class ClinicalImpressionFinding(

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    @SerialName("basis")
    override val basis: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClinicalImpressionFinding {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClinicalImpressionFinding"
    }
}

/**
 * FhirClinicalImpressionInvestigation
 *
 * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations
 * varies greatly depending on the type and context of the assessment. These investigations may include
 * data generated during the assessment process, or data previously generated and recorded that is
 * pertinent to the outcomes.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClinicalImpression">ClinicalImpressionInvestigation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClinicalImpression)
 */
interface FhirClinicalImpressionInvestigation : FhirBackboneElement {

    /**
     * A name/code for the set.
     */
    val code: CodeableConcept

    /**
     * Record of a specific investigation.
     */
    val item: kotlin.collections.List<Reference>?
}

/**
 * ClinicalImpressionInvestigation
 *
 * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations
 * varies greatly depending on the type and context of the assessment. These investigations may include
 * data generated during the assessment process, or data previously generated and recorded that is
 * pertinent to the outcomes.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ClinicalImpression">ClinicalImpressionInvestigation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ClinicalImpression)
 */
@Serializable
@SerialName("ClinicalImpressionInvestigation")
data class ClinicalImpressionInvestigation(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("item")
    override val item: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirClinicalImpressionInvestigation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ClinicalImpressionInvestigation"
    }
}
