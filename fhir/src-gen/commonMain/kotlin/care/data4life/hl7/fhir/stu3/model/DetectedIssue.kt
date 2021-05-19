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

import care.data4life.hl7.fhir.stu3.codesystem.DetectedIssueSeverity
import care.data4life.hl7.fhir.stu3.codesystem.ObservationStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDetectedIssue
 *
 * Indicates an actual or potential clinical issue with or between one or more active or proposed
 * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
 * Procedure-condition conflict, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DetectedIssue">DetectedIssue</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DetectedIssue)
 */
interface FhirDetectedIssue : FhirDomainResource {

    /**
     * Unique id for the detected issue.
     */
    val identifier: Identifier?

    /**
     * Indicates the status of the detected issue.
     */
    val status: ObservationStatus

    /**
     * Issue Category, e.g. drug-drug, duplicate therapy, etc..
     */
    val category: CodeableConcept?

    /**
     * Indicates the degree of importance associated with the identified issue based on
     * the potential impact on the patient.
     */
    val severity: DetectedIssueSeverity?

    /**
     * Associated patient.
     */
    val patient: Reference?

    /**
     * When identified.
     */
    val date: DateTime?

    /**
     * The provider or device that identified the issue.
     */
    val author: Reference?

    /**
     * Problem resource.
     */
    val implicated: List<Reference>?

    /**
     * Description and context.
     */
    val detail: String?

    /**
     * Authority for issue.
     */
    val reference: String?

    /**
     * Step taken to address.
     */
    val mitigation: List<DetectedIssueMitigation>?
}

/**
 * DetectedIssue
 *
 * SourceFileName: DetectedIssue.kt
 *
 * Indicates an actual or potential clinical issue with or between one or more active or proposed
 * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
 * Procedure-condition conflict, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DetectedIssue">DetectedIssue</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DetectedIssue)
 */
@Serializable
@SerialName("DetectedIssue")
data class DetectedIssue(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("status")
    override val status: ObservationStatus,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("severity")
    override val severity: DetectedIssueSeverity? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("implicated")
    override val implicated: List<Reference>? = null,

    @SerialName("detail")
    override val detail: String? = null,

    @SerialName("reference")
    override val reference: String? = null,

    @SerialName("mitigation")
    override val mitigation: List<DetectedIssueMitigation>? = null,

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
) : FhirDetectedIssue {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DetectedIssue"
    }
}

/**
 * FhirDetectedIssueMitigation
 *
 * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of
 * the risk identified by the detected issue from manifesting. Can also reflect an observation of known
 * mitigating factors that may reduce/eliminate the need for any action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DetectedIssue">DetectedIssueMitigation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DetectedIssue)
 */
interface FhirDetectedIssueMitigation : FhirBackboneElement {

    /**
     * What mitigation?.
     */
    val action: CodeableConcept

    /**
     * Date committed.
     */
    val date: DateTime?

    /**
     * Who is committing?.
     */
    val author: Reference?
}

/**
 * DetectedIssueMitigation
 *
 * SourceFileName: DetectedIssue.kt
 *
 * Indicates an action that has been taken or is committed to to reduce or eliminate the likelihood of
 * the risk identified by the detected issue from manifesting. Can also reflect an observation of known
 * mitigating factors that may reduce/eliminate the need for any action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DetectedIssue">DetectedIssueMitigation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DetectedIssue)
 */
@Serializable
@SerialName("DetectedIssueMitigation")
data class DetectedIssueMitigation(

    @SerialName("action")
    override val action: CodeableConcept,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("author")
    override val author: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDetectedIssueMitigation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DetectedIssueMitigation"
    }
}
