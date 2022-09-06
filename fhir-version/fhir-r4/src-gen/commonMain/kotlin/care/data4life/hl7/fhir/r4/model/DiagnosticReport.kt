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

import care.data4life.hl7.fhir.r4.codesystem.DiagnosticReportStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Instant
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
interface FhirDiagnosticReport : FhirDomainResource {

    /**
     * Business identifier for report.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * What was requested.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * The status of the diagnostic report.
     */
    val status: DiagnosticReportStatus

    /**
     * Service category.
     */
    val category: kotlin.collections.List<CodeableConcept>?

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
    val encounter: Reference?

    /**
     * Clinically relevant time/time-period for report.
     */
    val effectiveDateTime: DateTime?

    /**
     * Clinically relevant time/time-period for report.
     */
    val effectivePeriod: Period?

    /**
     * DateTime this version was made.
     */
    val issued: Instant?

    /**
     * Responsible Diagnostic Service.
     */
    val performer: kotlin.collections.List<Reference>?

    /**
     * Primary result interpreter.
     */
    val resultsInterpreter: kotlin.collections.List<Reference>?

    /**
     * Specimens this report is based on.
     */
    val specimen: kotlin.collections.List<Reference>?

    /**
     * Observations.
     */
    val result: kotlin.collections.List<Reference>?

    /**
     * Reference to full details of imaging associated with the diagnostic report.
     */
    val imagingStudy: kotlin.collections.List<Reference>?

    /**
     * Key images associated with this report.
     */
    val media: kotlin.collections.List<DiagnosticReportMedia>?

    /**
     * Clinical conclusion (interpretation) of test results.
     */
    val conclusion: String?

    /**
     * Codes for the clinical conclusion of test results.
     */
    val conclusionCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Entire report as issued.
     */
    val presentedForm: kotlin.collections.List<Attachment>?
}

/**
 * DiagnosticReport
 *
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
 * devices, and locations, and/or specimens derived from these. The report includes clinical context
 * such as requesting and provider information, and some mix of atomic results, images, textual and
 * coded interpretations, and formatted representation of diagnostic reports.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReport</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReport")
data class DiagnosticReport(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: DiagnosticReportStatus,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("issued")
    override val issued: Instant? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<Reference>? = null,

    @SerialName("resultsInterpreter")
    override val resultsInterpreter: kotlin.collections.List<Reference>? = null,

    @SerialName("specimen")
    override val specimen: kotlin.collections.List<Reference>? = null,

    @SerialName("result")
    override val result: kotlin.collections.List<Reference>? = null,

    @SerialName("imagingStudy")
    override val imagingStudy: kotlin.collections.List<Reference>? = null,

    @SerialName("media")
    override val media: kotlin.collections.List<DiagnosticReportMedia>? = null,

    @SerialName("conclusion")
    override val conclusion: String? = null,

    @SerialName("conclusionCode")
    override val conclusionCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("presentedForm")
    override val presentedForm: kotlin.collections.List<Attachment>? = null,

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
) : FhirDiagnosticReport {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DiagnosticReport"
    }
}

/**
 * FhirDiagnosticReportMedia
 *
 * A list of key images associated with this report. The images are generally created during the
 * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
 * interest).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportMedia</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
interface FhirDiagnosticReportMedia : FhirBackboneElement {

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
 * DiagnosticReportMedia
 *
 * A list of key images associated with this report. The images are generally created during the
 * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
 * interest).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DiagnosticReport">DiagnosticReportMedia</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DiagnosticReport)
 */
@Serializable
@SerialName("DiagnosticReportMedia")
data class DiagnosticReportMedia(

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("link")
    override val link: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDiagnosticReportMedia {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DiagnosticReportMedia"
    }
}
