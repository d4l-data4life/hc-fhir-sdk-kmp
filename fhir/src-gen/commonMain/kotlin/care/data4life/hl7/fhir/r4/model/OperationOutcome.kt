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

import care.data4life.hl7.fhir.r4.codesystem.IssueSeverity
import care.data4life.hl7.fhir.r4.codesystem.IssueType
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirOperationOutcome
 *
 * A collection of error, warning, or information messages that result from a system action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationOutcome">OperationOutcome</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/OperationOutcome)
 */
interface FhirOperationOutcome : FhirDomainResource {

    /**
     * A single issue associated with the action.
     */
    val issue: kotlin.collections.List<OperationOutcomeIssue>
}

/**
 * OperationOutcome
 *
 * A collection of error, warning, or information messages that result from a system action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationOutcome">OperationOutcome</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/OperationOutcome)
 */
@Serializable
@SerialName("OperationOutcome")
data class OperationOutcome(

    @SerialName("issue")
    override val issue: kotlin.collections.List<OperationOutcomeIssue>,

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
) : FhirOperationOutcome {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "OperationOutcome"
    }
}

/**
 * FhirOperationOutcomeIssue
 *
 * An error, warning, or information message that results from a system action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationOutcome">OperationOutcomeIssue</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/OperationOutcome)
 */
interface FhirOperationOutcomeIssue : FhirBackboneElement {

    /**
     * Indicates whether the issue indicates a variation from successful processing.
     */
    val severity: IssueSeverity

    /**
     * Describes the type of the issue. The system that creates an OperationOutcome
     * SHALL choose the most applicable code from the IssueType value set, and may
     * additional provide its own code for the error in the details element.
     */
    val code: IssueType

    /**
     * Additional details about the error.
     */
    val details: CodeableConcept?

    /**
     * Additional diagnostic information about the issue.
     */
    val diagnostics: String?

    /**
     * Deprecated: Path of element(s) related to issue.
     */
    val location: kotlin.collections.List<String>?

    /**
     * FHIRPath of element(s) related to issue.
     */
    val expression: kotlin.collections.List<String>?
}

/**
 * OperationOutcomeIssue
 *
 * An error, warning, or information message that results from a system action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationOutcome">OperationOutcomeIssue</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/OperationOutcome)
 */
@Serializable
@SerialName("OperationOutcomeIssue")
data class OperationOutcomeIssue(

    @SerialName("severity")
    override val severity: IssueSeverity,

    @SerialName("code")
    override val code: IssueType,

    @SerialName("details")
    override val details: CodeableConcept? = null,

    @SerialName("diagnostics")
    override val diagnostics: String? = null,

    @SerialName("location")
    override val location: kotlin.collections.List<String>? = null,

    @SerialName("expression")
    override val expression: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirOperationOutcomeIssue {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "OperationOutcomeIssue"
    }
}
