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

import care.data4life.hl7.fhir.stu3.codesystem.DiagnosticReportStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDiagnosticReport
 *
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
 * devices, and locations, and/or specimens derived from these. The report includes clinical context
 * such as requesting and provider information, and some mix of atomic results, images, textual and
 * coded interpretations, and formatted representation of diagnostic reports.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
interface FhirDiagnosticReport : FhirDomainResource {

    /**
     * Business identifier for report.
     */
    val identifier: List<Identifier>?

    /**
     * What was requested.
     */
    val basedOn: List<Reference>?

    /**
     * The status of the diagnostic report as a whole.
     */
    val status: DiagnosticReportStatus

    /**
     * Service category.
     */
    val category: CodeableConcept?

    /**
     * Name/Code for this diagnostic report.
     */
    val code: CodeableConcept

    /**
     * The subject of the report - usually, but not always, the patient.
     */
    val subject: Reference?

    /**
     * Health care event when test ordered.
     */
    val context: Reference?

    /**
     * Clinically relevant time/time-period for report.
     */
    val effectiveDateTime: DateTime?

    /**
     * Clinically relevant time/time-period for report.
     */
    val effectivePeriod: Period?

    /**
     * DateTime this version was released.
     */
    val issued: Instant?

    /**
     * Participants in producing the report.
     */
    val performer: List<DiagnosticReportPerformer>?

    /**
     * Specimens this report is based on.
     */
    val specimen: List<Reference>?

    /**
     * Observations - simple, or complex nested groups.
     */
    val result: List<Reference>?

    /**
     * Reference to full details of imaging associated with the diagnostic report.
     */
    val imagingStudy: List<Reference>?

    /**
     * Key images associated with this report.
     */
    val image: List<DiagnosticReportImage>?

    /**
     * Clinical Interpretation of test results.
     */
    val conclusion: String?

    /**
     * Codes for the conclusion.
     */
    val codedDiagnosis: List<CodeableConcept>?

    /**
     * Entire report as issued.
     */
    val presentedForm: List<Attachment>?
}

/**
 * DiagnosticReport
 *
 * SourceFileName: DiagnosticReport.kt
 *
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
 * devices, and locations, and/or specimens derived from these. The report includes clinical context
 * such as requesting and provider information, and some mix of atomic results, images, textual and
 * coded interpretations, and formatted representation of diagnostic reports.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReport")
data class DiagnosticReport(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("status")
    override val status: DiagnosticReportStatus,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("issued")
    override val issued: Instant? = null,

    @SerialName("performer")
    override val performer: List<DiagnosticReportPerformer>? = null,

    @SerialName("specimen")
    override val specimen: List<Reference>? = null,

    @SerialName("result")
    override val result: List<Reference>? = null,

    @SerialName("imagingStudy")
    override val imagingStudy: List<Reference>? = null,

    @SerialName("image")
    override val image: List<DiagnosticReportImage>? = null,

    @SerialName("conclusion")
    override val conclusion: String? = null,

    @SerialName("codedDiagnosis")
    override val codedDiagnosis: List<CodeableConcept>? = null,

    @SerialName("presentedForm")
    override val presentedForm: List<Attachment>? = null,

    // # DomainResource@SerialName("text")
    override val text: Narrative? = null,
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource@SerialName("id")
    override val id: String? = null,
    @SerialName("meta")
    override val meta: Meta? = null,
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    @SerialName("language")
    override val language: String? = null
) : FhirDiagnosticReport {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DiagnosticReport"
    }
}

/**
 * FhirDiagnosticReportImage
 *
 * A list of key images associated with this report. The images are generally created during the
 * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
 * interest).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportImage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
interface FhirDiagnosticReportImage : FhirBackboneElement {

    /**
     * Comment about the image (e.g. explanation).
     */
    val comment: String?

    /**
     * Reference to the image source.
     */
    val link: Reference
}

/**
 * DiagnosticReportImage
 *
 * SourceFileName: DiagnosticReport.kt
 *
 * A list of key images associated with this report. The images are generally created during the
 * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
 * interest).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportImage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReportImage")
data class DiagnosticReportImage(

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("link")
    override val link: Reference,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDiagnosticReportImage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DiagnosticReportImage"
    }
}

/**
 * FhirDiagnosticReportPerformer
 *
 * Indicates who or what participated in producing the report.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportPerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
interface FhirDiagnosticReportPerformer : FhirBackboneElement {

    /**
     * Type of performer.
     */
    val role: CodeableConcept?

    /**
     * Practitioner or Organization participant.
     */
    val actor: Reference
}

/**
 * DiagnosticReportPerformer
 *
 * SourceFileName: DiagnosticReport.kt
 *
 * Indicates who or what participated in producing the report.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportPerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReportPerformer")
data class DiagnosticReportPerformer(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDiagnosticReportPerformer {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DiagnosticReportPerformer"
    }
}
