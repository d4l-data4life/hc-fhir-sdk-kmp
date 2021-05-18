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

import care.data4life.hl7.fhir.r4.codesystem.CompositionStatus
import care.data4life.hl7.fhir.r4.codesystem.DocumentReferenceStatus
import care.data4life.hl7.fhir.r4.codesystem.DocumentRelationshipType
import care.data4life.hl7.fhir.r4.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDocumentReference
 *
 * A reference to a document of any kind for any purpose. Provides metadata about the document so that
 * the document can be discovered and managed. The scope of a document is any seralized object with a
 * mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and
 * non-patient specific documents like policy text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
interface FhirDocumentReference : FhirDomainResource {

    /**
     * Master Version Specific Identifier.
     */
    val masterIdentifier: Identifier?

    /**
     * Other identifiers for the document.
     */
    val identifier: List<Identifier>?

    /**
     * The status of this document reference.
     */
    val status: DocumentReferenceStatus

    /**
     * The status of the underlying document.
     */
    val docStatus: CompositionStatus?

    /**
     * Kind of document (LOINC if possible).
     */
    val type: CodeableConcept?

    /**
     * Categorization of document.
     */
    val category: List<CodeableConcept>?

    /**
     * Who/what is the subject of the document.
     */
    val subject: Reference?

    /**
     * When this document reference was created.
     */
    val date: Instant?

    /**
     * Who and/or what authored the document.
     */
    val author: List<Reference>?

    /**
     * Who/what authenticated the document.
     */
    val authenticator: Reference?

    /**
     * Organization which maintains the document.
     */
    val custodian: Reference?

    /**
     * Relationships to other documents.
     */
    val relatesTo: List<DocumentReferenceRelatesTo>?

    /**
     * Human-readable description.
     */
    val description: String?

    /**
     * Document security-tags.
     */
    val securityLabel: List<CodeableConcept>?

    /**
     * Document referenced.
     */
    val content: List<DocumentReferenceContent>

    /**
     * Clinical context of document.
     */
    val context: DocumentReferenceContext?
}

/**
 * DocumentReference
 *
 * A reference to a document of any kind for any purpose. Provides metadata about the document so that
 * the document can be discovered and managed. The scope of a document is any seralized object with a
 * mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and
 * non-patient specific documents like policy text.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReference</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
@Serializable
@SerialName("DocumentReference")
data class DocumentReference(

    @SerialName("masterIdentifier")
    override val masterIdentifier: Identifier? = null,

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: DocumentReferenceStatus,

    @SerialName("docStatus")
    override val docStatus: CompositionStatus? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("date")
    override val date: Instant? = null,

    @SerialName("author")
    override val author: List<Reference>? = null,

    @SerialName("authenticator")
    override val authenticator: Reference? = null,

    @SerialName("custodian")
    override val custodian: Reference? = null,

    @SerialName("relatesTo")
    override val relatesTo: List<DocumentReferenceRelatesTo>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("securityLabel")
    override val securityLabel: List<CodeableConcept>? = null,

    @SerialName("content")
    override val content: List<DocumentReferenceContent>,

    @SerialName("context")
    override val context: DocumentReferenceContext? = null,

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
) : FhirDocumentReference {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DocumentReference"
    }
}

/**
 * FhirDocumentReferenceContent
 *
 * The document and format referenced. There may be multiple content element repetitions, each with a
 * different format.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReferenceContent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
interface FhirDocumentReferenceContent : FhirBackboneElement {

    /**
     * Where to access the document.
     */
    val attachment: Attachment

    /**
     * Format/content rules for the document.
     */
    val format: Coding?
}

/**
 * DocumentReferenceContent
 *
 * The document and format referenced. There may be multiple content element repetitions, each with a
 * different format.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReferenceContent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
@Serializable
@SerialName("DocumentReferenceContent")
data class DocumentReferenceContent(

    @SerialName("attachment")
    override val attachment: Attachment,

    @SerialName("format")
    override val format: Coding? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDocumentReferenceContent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DocumentReferenceContent"
    }
}

/**
 * FhirDocumentReferenceContext
 *
 * The clinical context in which the document was prepared.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReferenceContext</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
interface FhirDocumentReferenceContext : FhirBackboneElement {

    /**
     * Context of the document content.
     */
    val encounter: List<Reference>?

    /**
     * Main clinical acts documented.
     */
    val event: List<CodeableConcept>?

    /**
     * Time of service that is being documented.
     */
    val period: Period?

    /**
     * Kind of facility where patient was seen.
     */
    val facilityType: CodeableConcept?

    /**
     * Additional details about where the content was created (e.g. clinical specialty).
     */
    val practiceSetting: CodeableConcept?

    /**
     * Patient demographics from source.
     */
    val sourcePatientInfo: Reference?

    /**
     * Related identifiers or resources.
     */
    val related: List<Reference>?
}

/**
 * DocumentReferenceContext
 *
 * The clinical context in which the document was prepared.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReferenceContext</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
@Serializable
@SerialName("DocumentReferenceContext")
data class DocumentReferenceContext(

    @SerialName("encounter")
    override val encounter: List<Reference>? = null,

    @SerialName("event")
    override val event: List<CodeableConcept>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("facilityType")
    override val facilityType: CodeableConcept? = null,

    @SerialName("practiceSetting")
    override val practiceSetting: CodeableConcept? = null,

    @SerialName("sourcePatientInfo")
    override val sourcePatientInfo: Reference? = null,

    @SerialName("related")
    override val related: List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDocumentReferenceContext {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DocumentReferenceContext"
    }
}

/**
 * FhirDocumentReferenceRelatesTo
 *
 * Relationships that this document has with other document references that already exist.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReferenceRelatesTo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
interface FhirDocumentReferenceRelatesTo : FhirBackboneElement {

    /**
     * The type of relationship that this document has with anther document.
     */
    val code: DocumentRelationshipType

    /**
     * Target of the relationship.
     */
    val target: Reference
}

/**
 * DocumentReferenceRelatesTo
 *
 * Relationships that this document has with other document references that already exist.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentReference">DocumentReferenceRelatesTo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DocumentReference)
 */
@Serializable
@SerialName("DocumentReferenceRelatesTo")
data class DocumentReferenceRelatesTo(

    @SerialName("code")
    override val code: DocumentRelationshipType,

    @SerialName("target")
    override val target: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDocumentReferenceRelatesTo {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DocumentReferenceRelatesTo"
    }
}
