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

import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicinalProduct
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g.
 * regulatory use)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProduct</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
interface FhirMedicinalProduct : FhirDomainResource {

    /**
     * Business identifier for this product. Could be an MPID.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Regulatory type, e.g. Investigational or Authorized.
     */
    val type: CodeableConcept?

    /**
     * If this medicine applies to human or veterinary uses.
     */
    val domain: Coding?

    /**
     * The dose form for a single part product, or combined form of a multiple part
     * product.
     */
    val combinedPharmaceuticalDoseForm: CodeableConcept?

    /**
     * The legal status of supply of the medicinal product as classified by the
     * regulator.
     */
    val legalStatusOfSupply: CodeableConcept?

    /**
     * Whether the Medicinal Product is subject to additional monitoring for regulatory
     * reasons.
     */
    val additionalMonitoringIndicator: CodeableConcept?

    /**
     * Whether the Medicinal Product is subject to special measures for regulatory
     * reasons.
     */
    val specialMeasures: kotlin.collections.List<String>?

    /**
     * If authorised for use in children.
     */
    val paediatricUseIndicator: CodeableConcept?

    /**
     * Allows the product to be classified by various systems.
     */
    val productClassification: kotlin.collections.List<CodeableConcept>?

    /**
     * Marketing status of the medicinal product, in contrast to marketing authorizaton.
     */
    val marketingStatus: kotlin.collections.List<MarketingStatus>?

    /**
     * Pharmaceutical aspects of product.
     */
    val pharmaceuticalProduct: kotlin.collections.List<Reference>?

    /**
     * Package representation for the product.
     */
    val packagedMedicinalProduct: kotlin.collections.List<Reference>?

    /**
     * Supporting documentation, typically for regulatory submission.
     */
    val attachedDocument: kotlin.collections.List<Reference>?

    /**
     * A master file for to the medicinal product (e.g. Pharmacovigilance System Master
     * File).
     */
    val masterFile: kotlin.collections.List<Reference>?

    /**
     * A product specific contact, person (in a role), or an organization.
     */
    val contact: kotlin.collections.List<Reference>?

    /**
     * Clinical trials or studies that this product is involved in.
     */
    val clinicalTrial: kotlin.collections.List<Reference>?

    /**
     * The product's name, including full name and possibly coded parts.
     */
    val name: kotlin.collections.List<MedicinalProductName>

    /**
     * Reference to another product, e.g. for linking authorised to investigational
     * product.
     */
    val crossReference: kotlin.collections.List<Identifier>?

    /**
     * An operation applied to the product, for manufacturing or adminsitrative purpose.
     */
    val manufacturingBusinessOperation: kotlin.collections.List<MedicinalProductManufacturingBusinessOperation>?

    /**
     * Indicates if the medicinal product has an orphan designation for the treatment
     * of a rare disease.
     */
    val specialDesignation: kotlin.collections.List<MedicinalProductSpecialDesignation>?
}

/**
 * MedicinalProduct
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g.
 * regulatory use)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProduct</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
@Serializable
@SerialName("MedicinalProduct")
data class MedicinalProduct(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("domain")
    override val domain: Coding? = null,

    @SerialName("combinedPharmaceuticalDoseForm")
    override val combinedPharmaceuticalDoseForm: CodeableConcept? = null,

    @SerialName("legalStatusOfSupply")
    override val legalStatusOfSupply: CodeableConcept? = null,

    @SerialName("additionalMonitoringIndicator")
    override val additionalMonitoringIndicator: CodeableConcept? = null,

    @SerialName("specialMeasures")
    override val specialMeasures: kotlin.collections.List<String>? = null,

    @SerialName("paediatricUseIndicator")
    override val paediatricUseIndicator: CodeableConcept? = null,

    @SerialName("productClassification")
    override val productClassification: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("marketingStatus")
    override val marketingStatus: kotlin.collections.List<MarketingStatus>? = null,

    @SerialName("pharmaceuticalProduct")
    override val pharmaceuticalProduct: kotlin.collections.List<Reference>? = null,

    @SerialName("packagedMedicinalProduct")
    override val packagedMedicinalProduct: kotlin.collections.List<Reference>? = null,

    @SerialName("attachedDocument")
    override val attachedDocument: kotlin.collections.List<Reference>? = null,

    @SerialName("masterFile")
    override val masterFile: kotlin.collections.List<Reference>? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<Reference>? = null,

    @SerialName("clinicalTrial")
    override val clinicalTrial: kotlin.collections.List<Reference>? = null,

    @SerialName("name")
    override val name: kotlin.collections.List<MedicinalProductName>,

    @SerialName("crossReference")
    override val crossReference: kotlin.collections.List<Identifier>? = null,

    @SerialName("manufacturingBusinessOperation")
    override val manufacturingBusinessOperation: kotlin.collections.List<MedicinalProductManufacturingBusinessOperation>? = null,

    @SerialName("specialDesignation")
    override val specialDesignation: kotlin.collections.List<MedicinalProductSpecialDesignation>? = null,

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
) : FhirMedicinalProduct {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProduct"
    }
}

/**
 * FhirMedicinalProductManufacturingBusinessOperation
 *
 * An operation applied to the product, for manufacturing or adminsitrative purpose
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductManufacturingBusinessOperation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
interface FhirMedicinalProductManufacturingBusinessOperation : FhirBackboneElement {

    /**
     * The type of manufacturing operation.
     */
    val operationType: CodeableConcept?

    /**
     * Regulatory authorization reference number.
     */
    val authorisationReferenceNumber: Identifier?

    /**
     * Regulatory authorization date.
     */
    val effectiveDate: DateTime?

    /**
     * To indicate if this proces is commercially confidential.
     */
    val confidentialityIndicator: CodeableConcept?

    /**
     * The manufacturer or establishment associated with the process.
     */
    val manufacturer: kotlin.collections.List<Reference>?

    /**
     * A regulator which oversees the operation.
     */
    val regulator: Reference?
}

/**
 * MedicinalProductManufacturingBusinessOperation
 *
 * An operation applied to the product, for manufacturing or adminsitrative purpose
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductManufacturingBusinessOperation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
@Serializable
@SerialName("MedicinalProductManufacturingBusinessOperation")
data class MedicinalProductManufacturingBusinessOperation(

    @SerialName("operationType")
    override val operationType: CodeableConcept? = null,

    @SerialName("authorisationReferenceNumber")
    override val authorisationReferenceNumber: Identifier? = null,

    @SerialName("effectiveDate")
    override val effectiveDate: DateTime? = null,

    @SerialName("confidentialityIndicator")
    override val confidentialityIndicator: CodeableConcept? = null,

    @SerialName("manufacturer")
    override val manufacturer: kotlin.collections.List<Reference>? = null,

    @SerialName("regulator")
    override val regulator: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductManufacturingBusinessOperation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductManufacturingBusinessOperation"
    }
}

/**
 * FhirMedicinalProductName
 *
 * The product's name, including full name and possibly coded parts
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
interface FhirMedicinalProductName : FhirBackboneElement {

    /**
     * The full product name.
     */
    val productName: String

    /**
     * Coding words or phrases of the name.
     */
    val namePart: kotlin.collections.List<MedicinalProductNameNamePart>?

    /**
     * Country where the name applies.
     */
    val countryLanguage: kotlin.collections.List<MedicinalProductNameCountryLanguage>?
}

/**
 * MedicinalProductName
 *
 * The product's name, including full name and possibly coded parts
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
@Serializable
@SerialName("MedicinalProductName")
data class MedicinalProductName(

    @SerialName("productName")
    override val productName: String,

    @SerialName("namePart")
    override val namePart: kotlin.collections.List<MedicinalProductNameNamePart>? = null,

    @SerialName("countryLanguage")
    override val countryLanguage: kotlin.collections.List<MedicinalProductNameCountryLanguage>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductName {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductName"
    }
}

/**
 * FhirMedicinalProductNameCountryLanguage
 *
 * Country where the name applies
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductNameCountryLanguage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
interface FhirMedicinalProductNameCountryLanguage : FhirBackboneElement {

    /**
     * Country code for where this name applies.
     */
    val country: CodeableConcept

    /**
     * Jurisdiction code for where this name applies.
     */
    val jurisdiction: CodeableConcept?

    /**
     * Language code for this name.
     */
    val language: CodeableConcept
}

/**
 * MedicinalProductNameCountryLanguage
 *
 * Country where the name applies
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductNameCountryLanguage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
@Serializable
@SerialName("MedicinalProductNameCountryLanguage")
data class MedicinalProductNameCountryLanguage(

    @SerialName("country")
    override val country: CodeableConcept,

    @SerialName("jurisdiction")
    override val jurisdiction: CodeableConcept? = null,

    @SerialName("language")
    override val language: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductNameCountryLanguage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductNameCountryLanguage"
    }
}

/**
 * FhirMedicinalProductNameNamePart
 *
 * Coding words or phrases of the name
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductNameNamePart</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
interface FhirMedicinalProductNameNamePart : FhirBackboneElement {

    /**
     * A fragment of a product name.
     */
    val part: String

    /**
     * Idenifying type for this part of the name (e.g. strength part).
     */
    val type: Coding
}

/**
 * MedicinalProductNameNamePart
 *
 * Coding words or phrases of the name
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductNameNamePart</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
@Serializable
@SerialName("MedicinalProductNameNamePart")
data class MedicinalProductNameNamePart(

    @SerialName("part")
    override val part: String,

    @SerialName("type")
    override val type: Coding,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductNameNamePart {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductNameNamePart"
    }
}

/**
 * FhirMedicinalProductSpecialDesignation
 *
 * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductSpecialDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
interface FhirMedicinalProductSpecialDesignation : FhirBackboneElement {

    /**
     * Identifier for the designation, or procedure number.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The type of special designation, e.g. orphan drug, minor use.
     */
    val type: CodeableConcept?

    /**
     * The intended use of the product, e.g. prevention, treatment.
     */
    val intendedUse: CodeableConcept?

    /**
     * Condition for which the medicinal use applies.
     */
    val indicationCodeableConcept: CodeableConcept?

    /**
     * Condition for which the medicinal use applies.
     */
    val indicationReference: Reference?

    /**
     * For example granted, pending, expired or withdrawn.
     */
    val status: CodeableConcept?

    /**
     * Date when the designation was granted.
     */
    val date: DateTime?

    /**
     * Animal species for which this applies.
     */
    val species: CodeableConcept?
}

/**
 * MedicinalProductSpecialDesignation
 *
 * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProduct">MedicinalProductSpecialDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProduct)
 */
@Serializable
@SerialName("MedicinalProductSpecialDesignation")
data class MedicinalProductSpecialDesignation(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("intendedUse")
    override val intendedUse: CodeableConcept? = null,

    @SerialName("indicationCodeableConcept")
    override val indicationCodeableConcept: CodeableConcept? = null,

    @SerialName("indicationReference")
    override val indicationReference: Reference? = null,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("species")
    override val species: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductSpecialDesignation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductSpecialDesignation"
    }
}
