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

import care.data4life.hl7.fhir.stu3.codesystem.DocumentReferenceStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDocumentManifest
 *
 * A collection of documents compiled for a purpose together with metadata that applies to the
 * collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentManifest">DocumentManifest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentManifest)
 */
interface FhirDocumentManifest : FhirDomainResource {

    /**
     * Unique Identifier for the set of documents.
     */
    val masterIdentifier: Identifier?

    /**
     * Other identifiers for the manifest.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of this document manifest.
     */
    val status: DocumentReferenceStatus

    /**
     * Kind of document set.
     */
    val type: CodeableConcept?

    /**
     * The subject of the set of documents.
     */
    val subject: Reference?

    /**
     * When this document manifest created.
     */
    val created: DateTime?

    /**
     * Who and/or what authored the manifest.
     */
    val author: kotlin.collections.List<Reference>?

    /**
     * Intended to get notified about this set of documents.
     */
    val recipient: kotlin.collections.List<Reference>?

    /**
     * The source system/application/software.
     */
    val source: String?

    /**
     * Human-readable description (title).
     */
    val description: String?

    /**
     * The items included.
     */
    val content: kotlin.collections.List<DocumentManifestContent>

    /**
     * Related things.
     */
    val related: kotlin.collections.List<DocumentManifestRelated>?
}

/**
 * DocumentManifest
 *
 * A collection of documents compiled for a purpose together with metadata that applies to the
 * collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentManifest">DocumentManifest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentManifest)
 */
@Serializable
@SerialName("DocumentManifest")
data class DocumentManifest(

    @SerialName("masterIdentifier")
    override val masterIdentifier: Identifier? = null,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: DocumentReferenceStatus,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("author")
    override val author: kotlin.collections.List<Reference>? = null,

    @SerialName("recipient")
    override val recipient: kotlin.collections.List<Reference>? = null,

    @SerialName("source")
    override val source: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("content")
    override val content: kotlin.collections.List<DocumentManifestContent>,

    @SerialName("related")
    override val related: kotlin.collections.List<DocumentManifestRelated>? = null,

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
) : FhirDocumentManifest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DocumentManifest"
    }
}

/**
 * FhirDocumentManifestContent
 *
 * The list of Documents included in the manifest.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentManifest">DocumentManifestContent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentManifest)
 */
interface FhirDocumentManifestContent : FhirBackboneElement {

    /**
     * Contents of this set of documents.
     */
    val pAttachment: Attachment?

    /**
     * Contents of this set of documents.
     */
    val pReference: Reference?
}

/**
 * DocumentManifestContent
 *
 * The list of Documents included in the manifest.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentManifest">DocumentManifestContent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentManifest)
 */
@Serializable
@SerialName("DocumentManifestContent")
data class DocumentManifestContent(

    @SerialName("pAttachment")
    override val pAttachment: Attachment? = null,

    @SerialName("pReference")
    override val pReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDocumentManifestContent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DocumentManifestContent"
    }
}

/**
 * FhirDocumentManifestRelated
 *
 * Related identifiers or resources associated with the DocumentManifest.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentManifest">DocumentManifestRelated</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentManifest)
 */
interface FhirDocumentManifestRelated : FhirBackboneElement {

    /**
     * Identifiers of things that are related.
     */
    val identifier: Identifier?

    /**
     * Related Resource.
     */
    val ref: Reference?
}

/**
 * DocumentManifestRelated
 *
 * Related identifiers or resources associated with the DocumentManifest.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DocumentManifest">DocumentManifestRelated</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DocumentManifest)
 */
@Serializable
@SerialName("DocumentManifestRelated")
data class DocumentManifestRelated(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("ref")
    override val ref: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDocumentManifestRelated {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DocumentManifestRelated"
    }
}
