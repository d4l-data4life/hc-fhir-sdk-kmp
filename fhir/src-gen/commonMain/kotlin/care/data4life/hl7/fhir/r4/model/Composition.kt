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

import care.data4life.hl7.fhir.r4.codesystem.CompositionAttestationMode
import care.data4life.hl7.fhir.r4.codesystem.CompositionStatus
import care.data4life.hl7.fhir.r4.codesystem.DocumentRelationshipType
import care.data4life.hl7.fhir.r4.codesystem.ListMode
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirComposition
 *
 * A set of healthcare-related information that is assembled together into a single logical package
 * that provides a single coherent statement of meaning, establishes its own context and that has
 * clinical attestation with regard to who is making the statement. A Composition defines the structure
 * and narrative content necessary for a document. However, a Composition alone does not constitute a
 * document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document,
 * and any other resources referenced from Composition must be included as subsequent entries in the
 * Bundle (for example Patient, Practitioner, Encounter, etc.).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">Composition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
interface FhirComposition : FhirDomainResource {

    /**
     * Version-independent identifier for the Composition.
     */
    val identifier: Identifier?

    /**
     * The workflow/clinical status of this composition. The status is a marker for the
     * clinical standing of the document.
     */
    val status: CompositionStatus

    /**
     * Kind of composition (LOINC if possible).
     */
    val type: CodeableConcept

    /**
     * Categorization of Composition.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Who and/or what the composition is about.
     */
    val subject: Reference?

    /**
     * Context of the Composition.
     */
    val encounter: Reference?

    /**
     * Composition editing time.
     */
    val date: DateTime

    /**
     * Who and/or what authored the composition.
     */
    val author: kotlin.collections.List<Reference>

    /**
     * Human Readable name/title.
     */
    val title: String

    /**
     * As defined by affinity domain.
     */
    val confidentiality: String?

    /**
     * Attests to accuracy of composition.
     */
    val attester: kotlin.collections.List<CompositionAttester>?

    /**
     * Organization which maintains the composition.
     */
    val custodian: Reference?

    /**
     * Relationships to other compositions/documents.
     */
    val relatesTo: kotlin.collections.List<CompositionRelatesTo>?

    /**
     * The clinical service(s) being documented.
     */
    val event: kotlin.collections.List<CompositionEvent>?

    /**
     * Composition is broken into sections.
     */
    val section: kotlin.collections.List<CompositionSection>?
}

/**
 * Composition
 *
 * A set of healthcare-related information that is assembled together into a single logical package
 * that provides a single coherent statement of meaning, establishes its own context and that has
 * clinical attestation with regard to who is making the statement. A Composition defines the structure
 * and narrative content necessary for a document. However, a Composition alone does not constitute a
 * document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document,
 * and any other resources referenced from Composition must be included as subsequent entries in the
 * Bundle (for example Patient, Practitioner, Encounter, etc.).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">Composition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
@Serializable
@SerialName("Composition")
data class Composition(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("status")
    override val status: CompositionStatus,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("date")
    override val date: DateTime,

    @SerialName("author")
    override val author: kotlin.collections.List<Reference>,

    @SerialName("title")
    override val title: String,

    @SerialName("confidentiality")
    override val confidentiality: String? = null,

    @SerialName("attester")
    override val attester: kotlin.collections.List<CompositionAttester>? = null,

    @SerialName("custodian")
    override val custodian: Reference? = null,

    @SerialName("relatesTo")
    override val relatesTo: kotlin.collections.List<CompositionRelatesTo>? = null,

    @SerialName("event")
    override val event: kotlin.collections.List<CompositionEvent>? = null,

    @SerialName("section")
    override val section: kotlin.collections.List<CompositionSection>? = null,

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
) : FhirComposition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Composition"
    }
}

/**
 * FhirCompositionAttester
 *
 * A participant who has attested to the accuracy of the composition/document.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionAttester</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
interface FhirCompositionAttester : FhirBackboneElement {

    /**
     * The type of attestation the authenticator offers.
     */
    val mode: CompositionAttestationMode

    /**
     * When the composition was attested.
     */
    val time: DateTime?

    /**
     * Who attested the composition.
     */
    val party: Reference?
}

/**
 * CompositionAttester
 *
 * A participant who has attested to the accuracy of the composition/document.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionAttester</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
@Serializable
@SerialName("CompositionAttester")
data class CompositionAttester(

    @SerialName("mode")
    override val mode: CompositionAttestationMode,

    @SerialName("time")
    override val time: DateTime? = null,

    @SerialName("party")
    override val party: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCompositionAttester {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CompositionAttester"
    }
}

/**
 * FhirCompositionEvent
 *
 * The clinical service, such as a colonoscopy or an appendectomy, being documented.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionEvent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
interface FhirCompositionEvent : FhirBackboneElement {

    /**
     * Code(s) that apply to the event being documented.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * The period covered by the documentation.
     */
    val period: Period?

    /**
     * The event(s) being documented.
     */
    val detail: kotlin.collections.List<Reference>?
}

/**
 * CompositionEvent
 *
 * The clinical service, such as a colonoscopy or an appendectomy, being documented.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionEvent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
@Serializable
@SerialName("CompositionEvent")
data class CompositionEvent(

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("detail")
    override val detail: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCompositionEvent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CompositionEvent"
    }
}

/**
 * FhirCompositionRelatesTo
 *
 * Relationships that this composition has with other compositions or documents that already exist.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionRelatesTo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
interface FhirCompositionRelatesTo : FhirBackboneElement {

    /**
     * The type of relationship that this composition has with anther composition or
     * document.
     */
    val code: DocumentRelationshipType

    /**
     * Target of the relationship.
     */
    val targetIdentifier: Identifier?

    /**
     * Target of the relationship.
     */
    val targetReference: Reference?
}

/**
 * CompositionRelatesTo
 *
 * Relationships that this composition has with other compositions or documents that already exist.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionRelatesTo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
@Serializable
@SerialName("CompositionRelatesTo")
data class CompositionRelatesTo(

    @SerialName("code")
    override val code: DocumentRelationshipType,

    @SerialName("targetIdentifier")
    override val targetIdentifier: Identifier? = null,

    @SerialName("targetReference")
    override val targetReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCompositionRelatesTo {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CompositionRelatesTo"
    }
}

/**
 * FhirCompositionSection
 *
 * The root of the sections that make up the composition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionSection</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
interface FhirCompositionSection : FhirBackboneElement {

    /**
     * Label for section (e.g. for ToC).
     */
    val title: String?

    /**
     * Classification of section (recommended).
     */
    val code: CodeableConcept?

    /**
     * Who and/or what authored the section.
     */
    val author: kotlin.collections.List<Reference>?

    /**
     * Who/what the section is about, when it is not about the subject of composition.
     */
    val focus: Reference?

    /**
     * Text summary of the section, for human interpretation.
     */
    val text: Narrative?

    /**
     * How the entry list was prepared - whether it is a working list that is suitable
     * for being maintained on an ongoing basis, or if it represents a snapshot of a
     * list of items from another source, or whether it is a prepared list where items
     * may be marked as added, modified or deleted.
     */
    val mode: ListMode?

    /**
     * Order of section entries.
     */
    val orderedBy: CodeableConcept?

    /**
     * A reference to data that supports this section.
     */
    val entry: kotlin.collections.List<Reference>?

    /**
     * Why the section is empty.
     */
    val emptyReason: CodeableConcept?

    /**
     * Nested Section.
     */
    val section: kotlin.collections.List<CompositionSection>?
}

/**
 * CompositionSection
 *
 * The root of the sections that make up the composition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Composition">CompositionSection</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Composition)
 */
@Serializable
@SerialName("CompositionSection")
data class CompositionSection(

    @SerialName("title")
    override val title: String? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("author")
    override val author: kotlin.collections.List<Reference>? = null,

    @SerialName("focus")
    override val focus: Reference? = null,

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("mode")
    override val mode: ListMode? = null,

    @SerialName("orderedBy")
    override val orderedBy: CodeableConcept? = null,

    @SerialName("entry")
    override val entry: kotlin.collections.List<Reference>? = null,

    @SerialName("emptyReason")
    override val emptyReason: CodeableConcept? = null,

    @SerialName("section")
    override val section: kotlin.collections.List<CompositionSection>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCompositionSection {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CompositionSection"
    }
}
