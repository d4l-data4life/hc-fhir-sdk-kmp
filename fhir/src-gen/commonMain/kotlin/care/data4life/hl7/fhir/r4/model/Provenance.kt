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

import care.data4life.hl7.fhir.r4.codesystem.ProvenanceEntityRole
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirProvenance : FhirDomainResource {

    // Target Reference(s) (usually version specific).
    val target: List<Reference>

    // When the activity occurred.
    val occurredPeriod: Period?

    // When the activity occurred.
    val occurredDateTime: DateTime?

    // When the activity was recorded / updated.
    val recorded: Instant

    // Policy or plan the activity was defined by.
    val policy: List<String>?

    // Where the activity occurred, if relevant.
    val location: Reference?

    // Reason the activity is occurring.
    val reason: List<CodeableConcept>?

    // Activity that occurred.
    val activity: CodeableConcept?

    // Actor involved.
    val agent: List<ProvenanceAgent>

    // An entity used in this activity.
    val entity: List<ProvenanceEntity>?

    // Signature on target.
    val signature: List<Signature>?
}

/**
 * ClassName: Provenance
 *
 * SourceFileName: Provenance.kt
 *
 *
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Provenance">Provenance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Provenance)
 */
@Serializable
@SerialName("Provenance")
data class Provenance(

    // Target Reference(s) (usually version specific).
    @SerialName("target")
    override val target: List<Reference>,
    // When the activity occurred.
    @SerialName("occurredPeriod")
    override val occurredPeriod: Period? = null,
    // When the activity occurred.
    @SerialName("occurredDateTime")
    override val occurredDateTime: DateTime? = null,
    // When the activity was recorded / updated.
    @SerialName("recorded")
    override val recorded: Instant,
    // Policy or plan the activity was defined by.
    @SerialName("policy")
    override val policy: List<String>? = null,
    // Where the activity occurred, if relevant.
    @SerialName("location")
    override val location: Reference? = null,
    // Reason the activity is occurring.
    @SerialName("reason")
    override val reason: List<CodeableConcept>? = null,
    // Activity that occurred.
    @SerialName("activity")
    override val activity: CodeableConcept? = null,
    // Actor involved.
    @SerialName("agent")
    override val agent: List<ProvenanceAgent>,
    // An entity used in this activity.
    @SerialName("entity")
    override val entity: List<ProvenanceEntity>? = null,
    // Signature on target.
    @SerialName("signature")
    override val signature: List<Signature>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional content defined by implementations.
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
) : FhirProvenance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Provenance"
    }
}

interface FhirProvenanceAgent : FhirBackboneElement {

    // How the agent participated.
    val type: CodeableConcept?

    // What the agents role was.
    val role: List<CodeableConcept>?

    // Who participated.
    val who: Reference

    // Who the agent is representing.
    val onBehalfOf: Reference?
}

/**
 * ClassName: ProvenanceAgent
 *
 * SourceFileName: Provenance.kt
 *
 *
 * An actor taking a role in an activity  for which it can be assigned some degree of responsibility for the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Provenance">ProvenanceAgent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Provenance)
 */
@Serializable
@SerialName("ProvenanceAgent")
data class ProvenanceAgent(

    // How the agent participated.
    @SerialName("type")
    override val type: CodeableConcept? = null,
    // What the agents role was.
    @SerialName("role")
    override val role: List<CodeableConcept>? = null,
    // Who participated.
    @SerialName("who")
    override val who: Reference,
    // Who the agent is representing.
    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirProvenanceAgent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProvenanceAgent"
    }
}

interface FhirProvenanceEntity : FhirBackboneElement {

    // How the entity was used during the activity.
    val role: ProvenanceEntityRole

    // Identity of entity.
    val what: Reference

    // Entity is attributed to this agent.
    val agent: List<ProvenanceAgent>?
}

/**
 * ClassName: ProvenanceEntity
 *
 * SourceFileName: Provenance.kt
 *
 *
 * An entity used in this activity
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Provenance">ProvenanceEntity</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Provenance)
 */
@Serializable
@SerialName("ProvenanceEntity")
data class ProvenanceEntity(

    // How the entity was used during the activity.
    @SerialName("role")
    override val role: ProvenanceEntityRole,
    // Identity of entity.
    @SerialName("what")
    override val what: Reference,
    // Entity is attributed to this agent.
    @SerialName("agent")
    override val agent: List<ProvenanceAgent>? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirProvenanceEntity {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProvenanceEntity"
    }
}