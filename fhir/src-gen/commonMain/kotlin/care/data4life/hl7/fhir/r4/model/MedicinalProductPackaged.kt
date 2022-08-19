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

import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMedicinalProductPackaged
 *
 * A medicinal product in a container or package
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged">MedicinalProductPackaged</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged)
 */
interface FhirMedicinalProductPackaged : FhirDomainResource {

    /**
     * Unique identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The product with this is a pack for.
     */
    val subject: kotlin.collections.List<Reference>?

    /**
     * Textual description.
     */
    val description: String?

    /**
     * The legal status of supply of the medicinal product as classified by the
     * regulator.
     */
    val legalStatusOfSupply: CodeableConcept?

    /**
     * Marketing information.
     */
    val marketingStatus: kotlin.collections.List<MarketingStatus>?

    /**
     * Manufacturer of this Package Item.
     */
    val marketingAuthorization: Reference?

    /**
     * Manufacturer of this Package Item.
     */
    val manufacturer: kotlin.collections.List<Reference>?

    /**
     * Batch numbering.
     */
    val batchIdentifier: kotlin.collections.List<MedicinalProductPackagedBatchIdentifier>?

    /**
     * A packaging item, as a contained for medicine, possibly with other packaging
     * items within.
     */
    val packageItem: kotlin.collections.List<MedicinalProductPackagedPackageItem>
}

/**
 * MedicinalProductPackaged
 *
 * A medicinal product in a container or package
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged">MedicinalProductPackaged</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged)
 */
@Serializable
@SerialName("MedicinalProductPackaged")
data class MedicinalProductPackaged(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("subject")
    override val subject: kotlin.collections.List<Reference>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("legalStatusOfSupply")
    override val legalStatusOfSupply: CodeableConcept? = null,

    @SerialName("marketingStatus")
    override val marketingStatus: kotlin.collections.List<MarketingStatus>? = null,

    @SerialName("marketingAuthorization")
    override val marketingAuthorization: Reference? = null,

    @SerialName("manufacturer")
    override val manufacturer: kotlin.collections.List<Reference>? = null,

    @SerialName("batchIdentifier")
    override val batchIdentifier: kotlin.collections.List<MedicinalProductPackagedBatchIdentifier>? = null,

    @SerialName("packageItem")
    override val packageItem: kotlin.collections.List<MedicinalProductPackagedPackageItem>,

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
) : FhirMedicinalProductPackaged {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPackaged"
    }
}

/**
 * FhirMedicinalProductPackagedBatchIdentifier
 *
 * Batch numbering
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged">MedicinalProductPackagedBatchIdentifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged)
 */
interface FhirMedicinalProductPackagedBatchIdentifier : FhirBackboneElement {

    /**
     * A number appearing on the outer packaging of a specific batch.
     */
    val outerPackaging: Identifier

    /**
     * A number appearing on the immediate packaging (and not the outer packaging).
     */
    val immediatePackaging: Identifier?
}

/**
 * MedicinalProductPackagedBatchIdentifier
 *
 * Batch numbering
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged">MedicinalProductPackagedBatchIdentifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged)
 */
@Serializable
@SerialName("MedicinalProductPackagedBatchIdentifier")
data class MedicinalProductPackagedBatchIdentifier(

    @SerialName("outerPackaging")
    override val outerPackaging: Identifier,

    @SerialName("immediatePackaging")
    override val immediatePackaging: Identifier? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductPackagedBatchIdentifier {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPackagedBatchIdentifier"
    }
}

/**
 * FhirMedicinalProductPackagedPackageItem
 *
 * A packaging item, as a contained for medicine, possibly with other packaging items within
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged">MedicinalProductPackagedPackageItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged)
 */
interface FhirMedicinalProductPackagedPackageItem : FhirBackboneElement {

    /**
     * Including possibly Data Carrier Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The physical type of the container of the medicine.
     */
    val type: CodeableConcept

    /**
     * The quantity of this package in the medicinal product, at the current level of
     * packaging. The outermost is always 1.
     */
    val quantity: Quantity

    /**
     * Material type of the package item.
     */
    val material: kotlin.collections.List<CodeableConcept>?

    /**
     * A possible alternate material for the packaging.
     */
    val alternateMaterial: kotlin.collections.List<CodeableConcept>?

    /**
     * A device accompanying a medicinal product.
     */
    val device: kotlin.collections.List<Reference>?

    /**
     * The manufactured item as contained in the packaged medicinal product.
     */
    val manufacturedItem: kotlin.collections.List<Reference>?

    /**
     * Allows containers within containers.
     */
    val packageItem: kotlin.collections.List<MedicinalProductPackagedPackageItem>?

    /**
     * Dimensions, color etc..
     */
    val physicalCharacteristics: ProdCharacteristic?

    /**
     * Other codeable characteristics.
     */
    val otherCharacteristics: kotlin.collections.List<CodeableConcept>?

    /**
     * Shelf Life and storage information.
     */
    val shelfLifeStorage: kotlin.collections.List<ProductShelfLife>?

    /**
     * Manufacturer of this Package Item.
     */
    val manufacturer: kotlin.collections.List<Reference>?
}

/**
 * MedicinalProductPackagedPackageItem
 *
 * A packaging item, as a contained for medicine, possibly with other packaging items within
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged">MedicinalProductPackagedPackageItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPackaged)
 */
@Serializable
@SerialName("MedicinalProductPackagedPackageItem")
data class MedicinalProductPackagedPackageItem(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("quantity")
    override val quantity: Quantity,

    @SerialName("material")
    override val material: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("alternateMaterial")
    override val alternateMaterial: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("device")
    override val device: kotlin.collections.List<Reference>? = null,

    @SerialName("manufacturedItem")
    override val manufacturedItem: kotlin.collections.List<Reference>? = null,

    @SerialName("packageItem")
    override val packageItem: kotlin.collections.List<MedicinalProductPackagedPackageItem>? = null,

    @SerialName("physicalCharacteristics")
    override val physicalCharacteristics: ProdCharacteristic? = null,

    @SerialName("otherCharacteristics")
    override val otherCharacteristics: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("shelfLifeStorage")
    override val shelfLifeStorage: kotlin.collections.List<ProductShelfLife>? = null,

    @SerialName("manufacturer")
    override val manufacturer: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductPackagedPackageItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPackagedPackageItem"
    }
}
