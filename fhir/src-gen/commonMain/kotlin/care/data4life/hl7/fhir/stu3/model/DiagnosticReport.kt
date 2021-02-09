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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.DiagnosticReportStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirDiagnosticReport : FhirDomainResource {

    // Business identifier for report.
    val identifier: List<Identifier>?

    // What was requested.
    val basedOn: List<Reference>?

    // The status of the diagnostic report as a whole.
    val status: DiagnosticReportStatus

    // Service category.
    val category: CodeableConcept?

    // Name/Code for this diagnostic report.
    val code: CodeableConcept

    // The subject of the report - usually, but not always, the patient.
    val subject: Reference?

    // Health care event when test ordered.
    val context: Reference?

    // Clinically relevant time/time-period for report.
    val effectiveDateTime: String?

    // Clinically relevant time/time-period for report.
    val effectivePeriod: Period?

    // DateTime this version was released.
    val issued: String?

    // Participants in producing the report.
    val performer: List<DiagnosticReportPerformer>?

    // Specimens this report is based on.
    val specimen: List<Reference>?

    // Observations - simple, or complex nested groups.
    val result: List<Reference>?

    // Reference to full details of imaging associated with the diagnostic report.
    val imagingStudy: List<Reference>?

    // Key images associated with this report.
    val image: List<DiagnosticReportImage>?

    // Clinical Interpretation of test results.
    val conclusion: String?

    // Codes for the conclusion.
    val codedDiagnosis: List<CodeableConcept>?

    // Entire report as issued.
    val presentedForm: List<Attachment>?
}


/**
 * ClassName: DiagnosticReport
 *
 * SourceFileName: DiagnosticReport.kt
 *
 *
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReport")
data class DiagnosticReport(

    // Business identifier for report.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // What was requested.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,
    // The status of the diagnostic report as a whole.
    @SerialName("status")
    override val status: DiagnosticReportStatus,
    // Service category.
    @SerialName("category")
    override val category: CodeableConcept? = null,
    // Name/Code for this diagnostic report.
    @SerialName("code")
    override val code: CodeableConcept,
    // The subject of the report - usually, but not always, the patient.
    @SerialName("subject")
    override val subject: Reference? = null,
    // Health care event when test ordered.
    @SerialName("context")
    override val context: Reference? = null,
    // Clinically relevant time/time-period for report.
    @SerialName("effectiveDateTime")
    override val effectiveDateTime: String? = null,
    // Clinically relevant time/time-period for report.
    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,
    // DateTime this version was released.
    @SerialName("issued")
    override val issued: String? = null,
    // Participants in producing the report.
    @SerialName("performer")
    override val performer: List<DiagnosticReportPerformer>? = null,
    // Specimens this report is based on.
    @SerialName("specimen")
    override val specimen: List<Reference>? = null,
    // Observations - simple, or complex nested groups.
    @SerialName("result")
    override val result: List<Reference>? = null,
    // Reference to full details of imaging associated with the diagnostic report.
    @SerialName("imagingStudy")
    override val imagingStudy: List<Reference>? = null,
    // Key images associated with this report.
    @SerialName("image")
    override val image: List<DiagnosticReportImage>? = null,
    // Clinical Interpretation of test results.
    @SerialName("conclusion")
    override val conclusion: String? = null,
    // Codes for the conclusion.
    @SerialName("codedDiagnosis")
    override val codedDiagnosis: List<CodeableConcept>? = null,
    // Entire report as issued.
    @SerialName("presentedForm")
    override val presentedForm: List<Attachment>? = null,


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
) : FhirDiagnosticReport {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DiagnosticReport"
    }
}


interface FhirDiagnosticReportImage : FhirBackboneElement {

    // Comment about the image (e.g. explanation).
    val comment: String?

    // Reference to the image source.
    val link: Reference
}


/**
 * ClassName: DiagnosticReportImage
 *
 * SourceFileName: DiagnosticReport.kt
 *
 *
 * A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportImage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReportImage")
data class DiagnosticReportImage(

    // Comment about the image (e.g. explanation).
    @SerialName("comment")
    override val comment: String? = null,
    // Reference to the image source.
    @SerialName("link")
    override val link: Reference,


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
) : FhirDiagnosticReportImage {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DiagnosticReportImage"
    }
}


interface FhirDiagnosticReportPerformer : FhirBackboneElement {

    // Type of performer.
    val role: CodeableConcept?

    // Practitioner or Organization  participant.
    val actor: Reference
}


/**
 * ClassName: DiagnosticReportPerformer
 *
 * SourceFileName: DiagnosticReport.kt
 *
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

    // Type of performer.
    @SerialName("role")
    override val role: CodeableConcept? = null,
    // Practitioner or Organization  participant.
    @SerialName("actor")
    override val actor: Reference,


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
) : FhirDiagnosticReportPerformer {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DiagnosticReportPerformer"
    }
}

