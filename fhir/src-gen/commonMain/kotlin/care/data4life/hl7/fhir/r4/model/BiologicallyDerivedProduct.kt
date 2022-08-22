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

import care.data4life.hl7.fhir.r4.codesystem.BiologicallyDerivedProductCategory
import care.data4life.hl7.fhir.r4.codesystem.BiologicallyDerivedProductStatus
import care.data4life.hl7.fhir.r4.codesystem.BiologicallyDerivedProductStorageScale
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirBiologicallyDerivedProduct
 *
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProduct</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
interface FhirBiologicallyDerivedProduct : FhirDomainResource {

    /**
     * External ids for this item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Broad category of this product.
     */
    val productCategory: BiologicallyDerivedProductCategory?

    /**
     * What this biologically derived product is.
     */
    val productCode: CodeableConcept?

    /**
     * Whether the product is currently available.
     */
    val status: BiologicallyDerivedProductStatus?

    /**
     * Procedure request.
     */
    val request: kotlin.collections.List<Reference>?

    /**
     * The amount of this biologically derived product.
     */
    val quantity: Integer?

    /**
     * BiologicallyDerivedProduct parent.
     */
    val parent: kotlin.collections.List<Reference>?

    /**
     * How this product was collected.
     */
    val collection: BiologicallyDerivedProductCollection?

    /**
     * Any processing of the product during collection.
     */
    val processing: kotlin.collections.List<BiologicallyDerivedProductProcessing>?

    /**
     * Any manipulation of product post-collection.
     */
    val manipulation: BiologicallyDerivedProductManipulation?

    /**
     * Product storage.
     */
    val storage: kotlin.collections.List<BiologicallyDerivedProductStorage>?
}

/**
 * BiologicallyDerivedProduct
 *
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProduct</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
@Serializable
@SerialName("BiologicallyDerivedProduct")
data class BiologicallyDerivedProduct(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("productCategory")
    override val productCategory: BiologicallyDerivedProductCategory? = null,

    @SerialName("productCode")
    override val productCode: CodeableConcept? = null,

    @SerialName("status")
    override val status: BiologicallyDerivedProductStatus? = null,

    @SerialName("request")
    override val request: kotlin.collections.List<Reference>? = null,

    @SerialName("quantity")
    override val quantity: Integer? = null,

    @SerialName("parent")
    override val parent: kotlin.collections.List<Reference>? = null,

    @SerialName("collection")
    override val collection: BiologicallyDerivedProductCollection? = null,

    @SerialName("processing")
    override val processing: kotlin.collections.List<BiologicallyDerivedProductProcessing>? = null,

    @SerialName("manipulation")
    override val manipulation: BiologicallyDerivedProductManipulation? = null,

    @SerialName("storage")
    override val storage: kotlin.collections.List<BiologicallyDerivedProductStorage>? = null,

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
) : FhirBiologicallyDerivedProduct {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BiologicallyDerivedProduct"
    }
}

/**
 * FhirBiologicallyDerivedProductCollection
 *
 * How this product was collected
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductCollection</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
interface FhirBiologicallyDerivedProductCollection : FhirBackboneElement {

    /**
     * Individual performing collection.
     */
    val collector: Reference?

    /**
     * Who is product from.
     */
    val source: Reference?

    /**
     * Time of product collection.
     */
    val collectedDateTime: DateTime?

    /**
     * Time of product collection.
     */
    val collectedPeriod: Period?
}

/**
 * BiologicallyDerivedProductCollection
 *
 * How this product was collected
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductCollection</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
@Serializable
@SerialName("BiologicallyDerivedProductCollection")
data class BiologicallyDerivedProductCollection(

    @SerialName("collector")
    override val collector: Reference? = null,

    @SerialName("source")
    override val source: Reference? = null,

    @SerialName("collectedDateTime")
    override val collectedDateTime: DateTime? = null,

    @SerialName("collectedPeriod")
    override val collectedPeriod: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBiologicallyDerivedProductCollection {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BiologicallyDerivedProductCollection"
    }
}

/**
 * FhirBiologicallyDerivedProductManipulation
 *
 * Any manipulation of product post-collection that is intended to alter the product. For example a
 * buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for
 * infusion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductManipulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
interface FhirBiologicallyDerivedProductManipulation : FhirBackboneElement {

    /**
     * Description of manipulation.
     */
    val description: String?

    /**
     * Time of manipulation.
     */
    val timeDateTime: DateTime?

    /**
     * Time of manipulation.
     */
    val timePeriod: Period?
}

/**
 * BiologicallyDerivedProductManipulation
 *
 * Any manipulation of product post-collection that is intended to alter the product. For example a
 * buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for
 * infusion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductManipulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
@Serializable
@SerialName("BiologicallyDerivedProductManipulation")
data class BiologicallyDerivedProductManipulation(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("timeDateTime")
    override val timeDateTime: DateTime? = null,

    @SerialName("timePeriod")
    override val timePeriod: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBiologicallyDerivedProductManipulation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BiologicallyDerivedProductManipulation"
    }
}

/**
 * FhirBiologicallyDerivedProductProcessing
 *
 * Any processing of the product during collection that does not change the fundamental nature of the
 * product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductProcessing</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
interface FhirBiologicallyDerivedProductProcessing : FhirBackboneElement {

    /**
     * Description of of processing.
     */
    val description: String?

    /**
     * Procesing code.
     */
    val procedure: CodeableConcept?

    /**
     * Substance added during processing.
     */
    val additive: Reference?

    /**
     * Time of processing.
     */
    val timeDateTime: DateTime?

    /**
     * Time of processing.
     */
    val timePeriod: Period?
}

/**
 * BiologicallyDerivedProductProcessing
 *
 * Any processing of the product during collection that does not change the fundamental nature of the
 * product. For example adding anti-coagulants during the collection of Peripheral Blood Stem Cells.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductProcessing</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
@Serializable
@SerialName("BiologicallyDerivedProductProcessing")
data class BiologicallyDerivedProductProcessing(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("procedure")
    override val procedure: CodeableConcept? = null,

    @SerialName("additive")
    override val additive: Reference? = null,

    @SerialName("timeDateTime")
    override val timeDateTime: DateTime? = null,

    @SerialName("timePeriod")
    override val timePeriod: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBiologicallyDerivedProductProcessing {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BiologicallyDerivedProductProcessing"
    }
}

/**
 * FhirBiologicallyDerivedProductStorage
 *
 * Product storage
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductStorage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
interface FhirBiologicallyDerivedProductStorage : FhirBackboneElement {

    /**
     * Description of storage.
     */
    val description: String?

    /**
     * Storage temperature.
     */
    val temperature: Decimal?

    /**
     * Temperature scale used.
     */
    val scale: BiologicallyDerivedProductStorageScale?

    /**
     * Storage timeperiod.
     */
    val duration: Period?
}

/**
 * BiologicallyDerivedProductStorage
 *
 * Product storage
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct">BiologicallyDerivedProductStorage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BiologicallyDerivedProduct)
 */
@Serializable
@SerialName("BiologicallyDerivedProductStorage")
data class BiologicallyDerivedProductStorage(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("temperature")
    override val temperature: Decimal? = null,

    @SerialName("scale")
    override val scale: BiologicallyDerivedProductStorageScale? = null,

    @SerialName("duration")
    override val duration: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBiologicallyDerivedProductStorage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BiologicallyDerivedProductStorage"
    }
}
