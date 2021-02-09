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

import care.data4life.hl7.fhir.stu3.codesystem.CareTeamStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirCareTeam : FhirDomainResource {

    // External Ids for this team.
    val identifier: List<Identifier>?

    // Indicates the current state of the care team.
    val status: CareTeamStatus?

    // Type of team.
    val category: List<CodeableConcept>?

    // Name of the team, such as crisis assessment team.
    val name: String?

    // Who care team is for.
    val subject: Reference?

    // Encounter or episode associated with CareTeam.
    val context: Reference?

    // Time period team covers.
    val period: Period?

    // Members of the team.
    val participant: List<CareTeamParticipant>?

    // Why the care team exists.
    val reasonCode: List<CodeableConcept>?

    // Why the care team exists.
    val reasonReference: List<Reference>?

    // Organization responsible for the care team.
    val managingOrganization: List<Reference>?

    // Comments made about the CareTeam.
    val note: List<Annotation>?
}


/**
 * ClassName: CareTeam
 *
 * SourceFileName: CareTeam.kt
 *
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam) on 2020-10-01
 */
@Serializable
@SerialName("CareTeam")
data class CareTeam(

    // External Ids for this team.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Indicates the current state of the care team.
    @SerialName("status")
    override val status: CareTeamStatus? = null,
    // Type of team.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // Name of the team, such as crisis assessment team.
    @SerialName("name")
    override val name: String? = null,
    // Who care team is for.
    @SerialName("subject")
    override val subject: Reference? = null,
    // Encounter or episode associated with CareTeam.
    @SerialName("context")
    override val context: Reference? = null,
    // Time period team covers.
    @SerialName("period")
    override val period: Period? = null,
    // Members of the team.
    @SerialName("participant")
    override val participant: List<CareTeamParticipant>? = null,
    // Why the care team exists.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,
    // Why the care team exists.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,
    // Organization responsible for the care team.
    @SerialName("managingOrganization")
    override val managingOrganization: List<Reference>? = null,
    // Comments made about the CareTeam.
    @SerialName("note")
    override val note: List<Annotation>? = null,


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
) : FhirCareTeam {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CareTeam"
    }
}


interface FhirCareTeamParticipant : FhirBackboneElement {

    // Type of involvement.
    val role: CodeableConcept?

    // Who is involved.
    val member: Reference?

    // Organization of the practitioner.
    val onBehalfOf: Reference?

    // Time period of participant.
    val period: Period?
}


/**
 * ClassName: CareTeamParticipant
 *
 * SourceFileName: CareTeam.kt
 *
 *
 * Identifies all people and organizations who are expected to be involved in the care team.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CareTeam">CareTeamParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CareTeam) on 2020-10-01
 */
@Serializable
@SerialName("CareTeamParticipant")
data class CareTeamParticipant(

    // Type of involvement.
    @SerialName("role")
    override val role: CodeableConcept? = null,
    // Who is involved.
    @SerialName("member")
    override val member: Reference? = null,
    // Organization of the practitioner.
    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,
    // Time period of participant.
    @SerialName("period")
    override val period: Period? = null,


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
) : FhirCareTeamParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CareTeamParticipant"
    }
}

