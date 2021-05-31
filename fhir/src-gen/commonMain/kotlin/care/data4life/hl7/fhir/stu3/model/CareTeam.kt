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

import care.data4life.hl7.fhir.stu3.codesystem.CareTeamStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCareTeam
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination
 * and delivery of care for a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam)
 */
interface FhirCareTeam : FhirDomainResource {

    /**
     * External Ids for this team.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates the current state of the care team.
     */
    val status: CareTeamStatus?

    /**
     * Type of team.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Name of the team, such as crisis assessment team.
     */
    val name: String?

    /**
     * Who care team is for.
     */
    val subject: Reference?

    /**
     * Encounter or episode associated with CareTeam.
     */
    val context: Reference?

    /**
     * Time period team covers.
     */
    val period: Period?

    /**
     * Members of the team.
     */
    val participant: kotlin.collections.List<CareTeamParticipant>?

    /**
     * Why the care team exists.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why the care team exists.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Organization responsible for the care team.
     */
    val managingOrganization: kotlin.collections.List<Reference>?

    /**
     * Comments made about the CareTeam.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * CareTeam
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination
 * and delivery of care for a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam)
 */
@Serializable
@SerialName("CareTeam")
data class CareTeam(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: CareTeamStatus? = null,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<CareTeamParticipant>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("managingOrganization")
    override val managingOrganization: kotlin.collections.List<Reference>? = null,

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
) : FhirCareTeam {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CareTeam"
    }
}

/**
 * FhirCareTeamParticipant
 *
 * Identifies all people and organizations who are expected to be involved in the care team.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeamParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam)
 */
interface FhirCareTeamParticipant : FhirBackboneElement {

    /**
     * Type of involvement.
     */
    val role: CodeableConcept?

    /**
     * Who is involved.
     */
    val member: Reference?

    /**
     * Organization of the practitioner.
     */
    val onBehalfOf: Reference?

    /**
     * Time period of participant.
     */
    val period: Period?
}

/**
 * CareTeamParticipant
 *
 * Identifies all people and organizations who are expected to be involved in the care team.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeamParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam)
 */
@Serializable
@SerialName("CareTeamParticipant")
data class CareTeamParticipant(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("member")
    override val member: Reference? = null,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCareTeamParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CareTeamParticipant"
    }
}
