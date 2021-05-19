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

import care.data4life.hl7.fhir.stu3.codesystem.EpisodeOfCareStatus
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirEpisodeOfCare
 *
 * An association between a patient and an organization / healthcare provider(s) during which time
 * encounters may occur. The managing organization assumes a level of responsibility for the patient
 * during this time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EpisodeOfCare">EpisodeOfCare</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EpisodeOfCare)
 */
interface FhirEpisodeOfCare : FhirDomainResource {

    /**
     * Business Identifier(s) relevant for this EpisodeOfCare.
     */
    val identifier: List<Identifier>?

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    val status: EpisodeOfCareStatus

    /**
     * Past list of status codes (the current status may be included to cover the start
     * date of the status).
     */
    val statusHistory: List<EpisodeOfCareStatusHistory>?

    /**
     * Type/class - e.g. specialist referral, disease management.
     */
    val type: List<CodeableConcept>?

    /**
     * The list of diagnosis relevant to this episode of care.
     */
    val diagnosis: List<EpisodeOfCareDiagnosis>?

    /**
     * The patient who is the focus of this episode of care.
     */
    val patient: Reference

    /**
     * Organization that assumes care.
     */
    val managingOrganization: Reference?

    /**
     * Interval during responsibility is assumed.
     */
    val period: Period?

    /**
     * Originating Referral Request(s).
     */
    val referralRequest: List<Reference>?

    /**
     * Care manager/care co-ordinator for the patient.
     */
    val careManager: Reference?

    /**
     * Other practitioners facilitating this episode of care.
     */
    val team: List<Reference>?

    /**
     * The set of accounts that may be used for billing for this EpisodeOfCare.
     */
    val account: List<Reference>?
}

/**
 * EpisodeOfCare
 *
 * SourceFileName: EpisodeOfCare.kt
 *
 * An association between a patient and an organization / healthcare provider(s) during which time
 * encounters may occur. The managing organization assumes a level of responsibility for the patient
 * during this time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EpisodeOfCare">EpisodeOfCare</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EpisodeOfCare)
 */
@Serializable
@SerialName("EpisodeOfCare")
data class EpisodeOfCare(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: EpisodeOfCareStatus,

    @SerialName("statusHistory")
    override val statusHistory: List<EpisodeOfCareStatusHistory>? = null,

    @SerialName("type")
    override val type: List<CodeableConcept>? = null,

    @SerialName("diagnosis")
    override val diagnosis: List<EpisodeOfCareDiagnosis>? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("referralRequest")
    override val referralRequest: List<Reference>? = null,

    @SerialName("careManager")
    override val careManager: Reference? = null,

    @SerialName("team")
    override val team: List<Reference>? = null,

    @SerialName("account")
    override val account: List<Reference>? = null,

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
) : FhirEpisodeOfCare {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EpisodeOfCare"
    }
}

/**
 * FhirEpisodeOfCareDiagnosis
 *
 * The list of diagnosis relevant to this episode of care
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EpisodeOfCare">EpisodeOfCareDiagnosis</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EpisodeOfCare)
 */
interface FhirEpisodeOfCareDiagnosis : FhirBackboneElement {

    /**
     * Conditions/problems/diagnoses this episode of care is for.
     */
    val condition: Reference

    /**
     * Role that this diagnosis has within the episode of care (e.g. admission,
     * billing, discharge …).
     */
    val role: CodeableConcept?

    /**
     * Ranking of the diagnosis (for each role type).
     */
    val rank: PositiveInteger?
}

/**
 * EpisodeOfCareDiagnosis
 *
 * SourceFileName: EpisodeOfCare.kt
 *
 * The list of diagnosis relevant to this episode of care
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EpisodeOfCare">EpisodeOfCareDiagnosis</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EpisodeOfCare)
 */
@Serializable
@SerialName("EpisodeOfCareDiagnosis")
data class EpisodeOfCareDiagnosis(

    @SerialName("condition")
    override val condition: Reference,

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("rank")
    override val rank: PositiveInteger? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEpisodeOfCareDiagnosis {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EpisodeOfCareDiagnosis"
    }
}

/**
 * FhirEpisodeOfCareStatusHistory
 *
 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the
 * history of the resource).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EpisodeOfCare">EpisodeOfCareStatusHistory</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EpisodeOfCare)
 */
interface FhirEpisodeOfCareStatusHistory : FhirBackboneElement {

    /**
     * planned | waitlist | active | onhold | finished | cancelled.
     */
    val status: EpisodeOfCareStatus

    /**
     * Duration the EpisodeOfCare was in the specified status.
     */
    val period: Period
}

/**
 * EpisodeOfCareStatusHistory
 *
 * SourceFileName: EpisodeOfCare.kt
 *
 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the
 * history of the resource).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EpisodeOfCare">EpisodeOfCareStatusHistory</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EpisodeOfCare)
 */
@Serializable
@SerialName("EpisodeOfCareStatusHistory")
data class EpisodeOfCareStatusHistory(

    @SerialName("status")
    override val status: EpisodeOfCareStatus,

    @SerialName("period")
    override val period: Period,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEpisodeOfCareStatusHistory {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EpisodeOfCareStatusHistory"
    }
}
