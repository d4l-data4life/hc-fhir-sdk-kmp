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

import care.data4life.hl7.fhir.r4.codesystem.CatalogEntryRelationType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirCatalogEntry
 *
 * Catalog entries are wrappers that contextualize items included in a catalog.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CatalogEntry">CatalogEntry</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CatalogEntry)
 */
interface FhirCatalogEntry : FhirDomainResource {

    /**
     * Unique identifier of the catalog item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The type of item - medication, device, service, protocol or other.
     */
    val type: CodeableConcept?

    /**
     * Whether the entry represents an orderable item.
     */
    val orderable: Bool

    /**
     * The item that is being defined.
     */
    val referencedItem: Reference

    /**
     * Any additional identifier(s) for the catalog item, in the same granularity or
     * concept.
     */
    val additionalIdentifier: kotlin.collections.List<Identifier>?

    /**
     * Classification (category or class) of the item entry.
     */
    val classification: kotlin.collections.List<CodeableConcept>?

    /**
     * Used to support catalog exchange even for unsupported products, e.g. getting
     * list of medications even if not prescribable.
     */
    val status: PublicationStatus?

    /**
     * The time period in which this catalog entry is expected to be active.
     */
    val validityPeriod: Period?

    /**
     * The date until which this catalog entry is expected to be active.
     */
    val validTo: DateTime?

    /**
     * When was this catalog last updated.
     */
    val lastUpdated: DateTime?

    /**
     * Additional characteristics of the catalog entry.
     */
    val additionalCharacteristic: kotlin.collections.List<CodeableConcept>?

    /**
     * Additional classification of the catalog entry.
     */
    val additionalClassification: kotlin.collections.List<CodeableConcept>?

    /**
     * An item that this catalog entry is related to.
     */
    val relatedEntry: kotlin.collections.List<CatalogEntryRelatedEntry>?
}

/**
 * CatalogEntry
 *
 * Catalog entries are wrappers that contextualize items included in a catalog.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CatalogEntry">CatalogEntry</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CatalogEntry)
 */
@Serializable
@SerialName("CatalogEntry")
data class CatalogEntry(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("orderable")
    override val orderable: Bool,

    @SerialName("referencedItem")
    override val referencedItem: Reference,

    @SerialName("additionalIdentifier")
    override val additionalIdentifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("classification")
    override val classification: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("status")
    override val status: PublicationStatus? = null,

    @SerialName("validityPeriod")
    override val validityPeriod: Period? = null,

    @SerialName("validTo")
    override val validTo: DateTime? = null,

    @SerialName("lastUpdated")
    override val lastUpdated: DateTime? = null,

    @SerialName("additionalCharacteristic")
    override val additionalCharacteristic: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("additionalClassification")
    override val additionalClassification: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("relatedEntry")
    override val relatedEntry: kotlin.collections.List<CatalogEntryRelatedEntry>? = null,

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
) : FhirCatalogEntry {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CatalogEntry"
    }
}

/**
 * FhirCatalogEntryRelatedEntry
 *
 * Used for example, to point to a substance, or to a device used to administer a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CatalogEntry">CatalogEntryRelatedEntry</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CatalogEntry)
 */
interface FhirCatalogEntryRelatedEntry : FhirBackboneElement {

    /**
     * The type of relation to the related item: child, parent, packageContent,
     * containerPackage, usedIn, uses, requires, etc.
     */
    val relationtype: CatalogEntryRelationType

    /**
     * The reference to the related item.
     */
    val item: Reference
}

/**
 * CatalogEntryRelatedEntry
 *
 * Used for example, to point to a substance, or to a device used to administer a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CatalogEntry">CatalogEntryRelatedEntry</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CatalogEntry)
 */
@Serializable
@SerialName("CatalogEntryRelatedEntry")
data class CatalogEntryRelatedEntry(

    @SerialName("relationtype")
    override val relationtype: CatalogEntryRelationType,

    @SerialName("item")
    override val item: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCatalogEntryRelatedEntry {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CatalogEntryRelatedEntry"
    }
}
