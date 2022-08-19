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

import care.data4life.hl7.fhir.r4.codesystem.MedicationKnowledgeStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMedicationKnowledge
 *
 * Information about a medication that is used to support knowledge.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledge</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledge : FhirDomainResource {

    /**
     * Code that identifies this medication.
     */
    val code: CodeableConcept?

    /**
     * A code to indicate if the medication is in active use. The status refers to the
     * validity about the information of the medication and not to its medicinal
     * properties.
     */
    val status: MedicationKnowledgeStatusCodes?

    /**
     * Manufacturer of the item.
     */
    val manufacturer: Reference?

    /**
     * powder | tablets | capsule +.
     */
    val doseForm: CodeableConcept?

    /**
     * Amount of drug in package.
     */
    val amount: Quantity?

    /**
     * Additional names for a medication.
     */
    val synonym: kotlin.collections.List<String>?

    /**
     * Associated or related medication information.
     */
    val relatedMedicationKnowledge: kotlin.collections.List<MedicationKnowledgeRelatedMedicationKnowledge>?

    /**
     * A medication resource that is associated with this medication.
     */
    val associatedMedication: kotlin.collections.List<Reference>?

    /**
     * Category of the medication or product.
     */
    val productType: kotlin.collections.List<CodeableConcept>?

    /**
     * Associated documentation about the medication.
     */
    val monograph: kotlin.collections.List<MedicationKnowledgeMonograph>?

    /**
     * Active or inactive ingredient.
     */
    val ingredient: kotlin.collections.List<MedicationKnowledgeIngredient>?

    /**
     * The instructions for preparing the medication.
     */
    val preparationInstruction: String?

    /**
     * The intended or approved route of administration.
     */
    val intendedRoute: kotlin.collections.List<CodeableConcept>?

    /**
     * The pricing of the medication.
     */
    val cost: kotlin.collections.List<MedicationKnowledgeCost>?

    /**
     * Program under which a medication is reviewed.
     */
    val monitoringProgram: kotlin.collections.List<MedicationKnowledgeMonitoringProgram>?

    /**
     * Guidelines for administration of the medication.
     */
    val administrationGuidelines: kotlin.collections.List<MedicationKnowledgeAdministrationGuidelines>?

    /**
     * Categorization of the medication within a formulary or classification system.
     */
    val medicineClassification: kotlin.collections.List<MedicationKnowledgeMedicineClassification>?

    /**
     * Details about packaged medications.
     */
    val packaging: MedicationKnowledgePackaging?

    /**
     * Specifies descriptive properties of the medicine.
     */
    val drugCharacteristic: kotlin.collections.List<MedicationKnowledgeDrugCharacteristic>?

    /**
     * Potential clinical issue with or between medication(s).
     */
    val contraindication: kotlin.collections.List<Reference>?

    /**
     * Regulatory information about a medication.
     */
    val regulatory: kotlin.collections.List<MedicationKnowledgeRegulatory>?

    /**
     * The time course of drug absorption, distribution, metabolism and excretion of a
     * medication from the body.
     */
    val kinetics: kotlin.collections.List<MedicationKnowledgeKinetics>?
}

/**
 * MedicationKnowledge
 *
 * Information about a medication that is used to support knowledge.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledge</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledge")
data class MedicationKnowledge(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("status")
    override val status: MedicationKnowledgeStatusCodes? = null,

    @SerialName("manufacturer")
    override val manufacturer: Reference? = null,

    @SerialName("doseForm")
    override val doseForm: CodeableConcept? = null,

    @SerialName("amount")
    override val amount: Quantity? = null,

    @SerialName("synonym")
    override val synonym: kotlin.collections.List<String>? = null,

    @SerialName("relatedMedicationKnowledge")
    override val relatedMedicationKnowledge: kotlin.collections.List<MedicationKnowledgeRelatedMedicationKnowledge>? = null,

    @SerialName("associatedMedication")
    override val associatedMedication: kotlin.collections.List<Reference>? = null,

    @SerialName("productType")
    override val productType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("monograph")
    override val monograph: kotlin.collections.List<MedicationKnowledgeMonograph>? = null,

    @SerialName("ingredient")
    override val ingredient: kotlin.collections.List<MedicationKnowledgeIngredient>? = null,

    @SerialName("preparationInstruction")
    override val preparationInstruction: String? = null,

    @SerialName("intendedRoute")
    override val intendedRoute: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("cost")
    override val cost: kotlin.collections.List<MedicationKnowledgeCost>? = null,

    @SerialName("monitoringProgram")
    override val monitoringProgram: kotlin.collections.List<MedicationKnowledgeMonitoringProgram>? = null,

    @SerialName("administrationGuidelines")
    override val administrationGuidelines: kotlin.collections.List<MedicationKnowledgeAdministrationGuidelines>? = null,

    @SerialName("medicineClassification")
    override val medicineClassification: kotlin.collections.List<MedicationKnowledgeMedicineClassification>? = null,

    @SerialName("packaging")
    override val packaging: MedicationKnowledgePackaging? = null,

    @SerialName("drugCharacteristic")
    override val drugCharacteristic: kotlin.collections.List<MedicationKnowledgeDrugCharacteristic>? = null,

    @SerialName("contraindication")
    override val contraindication: kotlin.collections.List<Reference>? = null,

    @SerialName("regulatory")
    override val regulatory: kotlin.collections.List<MedicationKnowledgeRegulatory>? = null,

    @SerialName("kinetics")
    override val kinetics: kotlin.collections.List<MedicationKnowledgeKinetics>? = null,

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
) : FhirMedicationKnowledge {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledge"
    }
}

/**
 * FhirMedicationKnowledgeAdministrationGuidelines
 *
 * Guidelines for the administration of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeAdministrationGuidelines</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeAdministrationGuidelines : FhirBackboneElement {

    /**
     * Dosage for the medication for the specific guidelines.
     */
    val dosage: kotlin.collections.List<MedicationKnowledgeAdministrationGuidelinesDosage>?

    /**
     * Indication for use that apply to the specific administration guidelines.
     */
    val indicationCodeableConcept: CodeableConcept?

    /**
     * Indication for use that apply to the specific administration guidelines.
     */
    val indicationReference: Reference?

    /**
     * Characteristics of the patient that are relevant to the administration
     * guidelines.
     */
    val patientCharacteristics: kotlin.collections.List<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics>?
}

/**
 * MedicationKnowledgeAdministrationGuidelines
 *
 * Guidelines for the administration of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeAdministrationGuidelines</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeAdministrationGuidelines")
data class MedicationKnowledgeAdministrationGuidelines(

    @SerialName("dosage")
    override val dosage: kotlin.collections.List<MedicationKnowledgeAdministrationGuidelinesDosage>? = null,

    @SerialName("indicationCodeableConcept")
    override val indicationCodeableConcept: CodeableConcept? = null,

    @SerialName("indicationReference")
    override val indicationReference: Reference? = null,

    @SerialName("patientCharacteristics")
    override val patientCharacteristics: kotlin.collections.List<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeAdministrationGuidelines {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeAdministrationGuidelines"
    }
}

/**
 * FhirMedicationKnowledgeAdministrationGuidelinesDosage
 *
 * Dosage for the medication for the specific guidelines
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeAdministrationGuidelinesDosage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeAdministrationGuidelinesDosage : FhirBackboneElement {

    /**
     * Type of dosage.
     */
    val type: CodeableConcept

    /**
     * Dosage for the medication for the specific guidelines.
     */
    val dosage: kotlin.collections.List<Dosage>
}

/**
 * MedicationKnowledgeAdministrationGuidelinesDosage
 *
 * Dosage for the medication for the specific guidelines
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeAdministrationGuidelinesDosage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeAdministrationGuidelinesDosage")
data class MedicationKnowledgeAdministrationGuidelinesDosage(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("dosage")
    override val dosage: kotlin.collections.List<Dosage>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeAdministrationGuidelinesDosage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeAdministrationGuidelinesDosage"
    }
}

/**
 * FhirMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics
 *
 * Characteristics of the patient that are relevant to the administration guidelines (for example,
 * height, weight, gender, etc.).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics : FhirBackboneElement {

    /**
     * Specific characteristic that is relevant to the administration guideline.
     */
    val characteristicCodeableConcept: CodeableConcept?

    /**
     * Specific characteristic that is relevant to the administration guideline.
     */
    val characteristicQuantity: Quantity?

    /**
     * The specific characteristic.
     */
    val value: kotlin.collections.List<String>?
}

/**
 * MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics
 *
 * Characteristics of the patient that are relevant to the administration guidelines (for example,
 * height, weight, gender, etc.).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics")
data class MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics(

    @SerialName("characteristicCodeableConcept")
    override val characteristicCodeableConcept: CodeableConcept? = null,

    @SerialName("characteristicQuantity")
    override val characteristicQuantity: Quantity? = null,

    @SerialName("value")
    override val value: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics"
    }
}

/**
 * FhirMedicationKnowledgeCost
 *
 * The price of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeCost : FhirBackboneElement {

    /**
     * The category of the cost information.
     */
    val type: CodeableConcept

    /**
     * The source or owner for the price information.
     */
    val source: String?

    /**
     * The price of the medication.
     */
    val cost: Money
}

/**
 * MedicationKnowledgeCost
 *
 * The price of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeCost")
data class MedicationKnowledgeCost(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("source")
    override val source: String? = null,

    @SerialName("cost")
    override val cost: Money,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeCost {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeCost"
    }
}

/**
 * FhirMedicationKnowledgeDrugCharacteristic
 *
 * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeDrugCharacteristic</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeDrugCharacteristic : FhirBackboneElement {

    /**
     * Code specifying the type of characteristic of medication.
     */
    val type: CodeableConcept?

    /**
     * Description of the characteristic.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Description of the characteristic.
     */
    val valueString: String?

    /**
     * Description of the characteristic.
     */
    val valueQuantity: Quantity?

    /**
     * Description of the characteristic.
     */
    val valueBase64Binary: String?
}

/**
 * MedicationKnowledgeDrugCharacteristic
 *
 * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeDrugCharacteristic</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeDrugCharacteristic")
data class MedicationKnowledgeDrugCharacteristic(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueBase64Binary")
    override val valueBase64Binary: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeDrugCharacteristic {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeDrugCharacteristic"
    }
}

/**
 * FhirMedicationKnowledgeIngredient
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeIngredient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeIngredient : FhirBackboneElement {

    /**
     * Medication(s) or substance(s) contained in the medication.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * Medication(s) or substance(s) contained in the medication.
     */
    val itemReference: Reference?

    /**
     * Active ingredient indicator.
     */
    val isActive: Bool?

    /**
     * Quantity of ingredient present.
     */
    val strength: Ratio?
}

/**
 * MedicationKnowledgeIngredient
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeIngredient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeIngredient")
data class MedicationKnowledgeIngredient(

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    @SerialName("isActive")
    override val isActive: Bool? = null,

    @SerialName("strength")
    override val strength: Ratio? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeIngredient {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeIngredient"
    }
}

/**
 * FhirMedicationKnowledgeKinetics
 *
 * The time course of drug absorption, distribution, metabolism and excretion of a medication from the
 * body
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeKinetics</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeKinetics : FhirBackboneElement {

    /**
     * The drug concentration measured at certain discrete points in time.
     */
    val areaUnderCurve: kotlin.collections.List<Quantity>?

    /**
     * The median lethal dose of a drug.
     */
    val lethalDose50: kotlin.collections.List<Quantity>?

    /**
     * Time required for concentration in the body to decrease by half.
     */
    val halfLifePeriod: Duration?
}

/**
 * MedicationKnowledgeKinetics
 *
 * The time course of drug absorption, distribution, metabolism and excretion of a medication from the
 * body
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeKinetics</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeKinetics")
data class MedicationKnowledgeKinetics(

    @SerialName("areaUnderCurve")
    override val areaUnderCurve: kotlin.collections.List<Quantity>? = null,

    @SerialName("lethalDose50")
    override val lethalDose50: kotlin.collections.List<Quantity>? = null,

    @SerialName("halfLifePeriod")
    override val halfLifePeriod: Duration? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeKinetics {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeKinetics"
    }
}

/**
 * FhirMedicationKnowledgeMedicineClassification
 *
 * Categorization of the medication within a formulary or classification system
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeMedicineClassification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeMedicineClassification : FhirBackboneElement {

    /**
     * The type of category for the medication (for example, therapeutic
     * classification, therapeutic sub-classification).
     */
    val type: CodeableConcept

    /**
     * Specific category assigned to the medication.
     */
    val classification: kotlin.collections.List<CodeableConcept>?
}

/**
 * MedicationKnowledgeMedicineClassification
 *
 * Categorization of the medication within a formulary or classification system
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeMedicineClassification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeMedicineClassification")
data class MedicationKnowledgeMedicineClassification(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("classification")
    override val classification: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeMedicineClassification {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeMedicineClassification"
    }
}

/**
 * FhirMedicationKnowledgeMonitoringProgram
 *
 * The program under which the medication is reviewed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeMonitoringProgram</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeMonitoringProgram : FhirBackboneElement {

    /**
     * Type of program under which the medication is monitored.
     */
    val type: CodeableConcept?

    /**
     * Name of the reviewing program.
     */
    val name: String?
}

/**
 * MedicationKnowledgeMonitoringProgram
 *
 * The program under which the medication is reviewed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeMonitoringProgram</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeMonitoringProgram")
data class MedicationKnowledgeMonitoringProgram(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("name")
    override val name: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeMonitoringProgram {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeMonitoringProgram"
    }
}

/**
 * FhirMedicationKnowledgeMonograph
 *
 * Associated documentation about the medication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeMonograph</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeMonograph : FhirBackboneElement {

    /**
     * The category of medication document.
     */
    val type: CodeableConcept?

    /**
     * Associated documentation about the medication.
     */
    val source: Reference?
}

/**
 * MedicationKnowledgeMonograph
 *
 * Associated documentation about the medication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeMonograph</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeMonograph")
data class MedicationKnowledgeMonograph(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("source")
    override val source: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeMonograph {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeMonograph"
    }
}

/**
 * FhirMedicationKnowledgePackaging
 *
 * Information that only applies to packages (not products).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgePackaging</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgePackaging : FhirBackboneElement {

    /**
     * A code that defines the specific type of packaging that the medication can be
     * found in.
     */
    val type: CodeableConcept?

    /**
     * The number of product units the package would contain if fully loaded.
     */
    val quantity: Quantity?
}

/**
 * MedicationKnowledgePackaging
 *
 * Information that only applies to packages (not products).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgePackaging</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgePackaging")
data class MedicationKnowledgePackaging(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgePackaging {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgePackaging"
    }
}

/**
 * FhirMedicationKnowledgeRegulatory
 *
 * Regulatory information about a medication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatory</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeRegulatory : FhirBackboneElement {

    /**
     * Specifies the authority of the regulation.
     */
    val regulatoryAuthority: Reference

    /**
     * Specifies if changes are allowed when dispensing a medication from a regulatory
     * perspective.
     */
    val substitution: kotlin.collections.List<MedicationKnowledgeRegulatorySubstitution>?

    /**
     * Specifies the schedule of a medication in jurisdiction.
     */
    val schedule: kotlin.collections.List<MedicationKnowledgeRegulatorySchedule>?

    /**
     * The maximum number of units of the medication that can be dispensed in a period.
     */
    val maxDispense: MedicationKnowledgeRegulatoryMaxDispense?
}

/**
 * MedicationKnowledgeRegulatory
 *
 * Regulatory information about a medication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatory</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeRegulatory")
data class MedicationKnowledgeRegulatory(

    @SerialName("regulatoryAuthority")
    override val regulatoryAuthority: Reference,

    @SerialName("substitution")
    override val substitution: kotlin.collections.List<MedicationKnowledgeRegulatorySubstitution>? = null,

    @SerialName("schedule")
    override val schedule: kotlin.collections.List<MedicationKnowledgeRegulatorySchedule>? = null,

    @SerialName("maxDispense")
    override val maxDispense: MedicationKnowledgeRegulatoryMaxDispense? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeRegulatory {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeRegulatory"
    }
}

/**
 * FhirMedicationKnowledgeRegulatoryMaxDispense
 *
 * The maximum number of units of the medication that can be dispensed in a period
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatoryMaxDispense</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeRegulatoryMaxDispense : FhirBackboneElement {

    /**
     * The maximum number of units of the medication that can be dispensed.
     */
    val quantity: Quantity

    /**
     * The period that applies to the maximum number of units.
     */
    val period: Duration?
}

/**
 * MedicationKnowledgeRegulatoryMaxDispense
 *
 * The maximum number of units of the medication that can be dispensed in a period
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatoryMaxDispense</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeRegulatoryMaxDispense")
data class MedicationKnowledgeRegulatoryMaxDispense(

    @SerialName("quantity")
    override val quantity: Quantity,

    @SerialName("period")
    override val period: Duration? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeRegulatoryMaxDispense {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeRegulatoryMaxDispense"
    }
}

/**
 * FhirMedicationKnowledgeRegulatorySchedule
 *
 * Specifies the schedule of a medication in jurisdiction
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatorySchedule</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeRegulatorySchedule : FhirBackboneElement {

    /**
     * Specifies the specific drug schedule.
     */
    val schedule: CodeableConcept
}

/**
 * MedicationKnowledgeRegulatorySchedule
 *
 * Specifies the schedule of a medication in jurisdiction
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatorySchedule</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeRegulatorySchedule")
data class MedicationKnowledgeRegulatorySchedule(

    @SerialName("schedule")
    override val schedule: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeRegulatorySchedule {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeRegulatorySchedule"
    }
}

/**
 * FhirMedicationKnowledgeRegulatorySubstitution
 *
 * Specifies if changes are allowed when dispensing a medication from a regulatory perspective
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatorySubstitution</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeRegulatorySubstitution : FhirBackboneElement {

    /**
     * Specifies the type of substitution allowed.
     */
    val type: CodeableConcept

    /**
     * Specifies if regulation allows for changes in the medication when dispensing.
     */
    val allowed: Bool
}

/**
 * MedicationKnowledgeRegulatorySubstitution
 *
 * Specifies if changes are allowed when dispensing a medication from a regulatory perspective
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRegulatorySubstitution</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeRegulatorySubstitution")
data class MedicationKnowledgeRegulatorySubstitution(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("allowed")
    override val allowed: Bool,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeRegulatorySubstitution {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeRegulatorySubstitution"
    }
}

/**
 * FhirMedicationKnowledgeRelatedMedicationKnowledge
 *
 * Associated or related knowledge about a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRelatedMedicationKnowledge</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
interface FhirMedicationKnowledgeRelatedMedicationKnowledge : FhirBackboneElement {

    /**
     * Category of medicationKnowledge.
     */
    val type: CodeableConcept

    /**
     * Associated documentation about the associated medication knowledge.
     */
    val reference: kotlin.collections.List<Reference>
}

/**
 * MedicationKnowledgeRelatedMedicationKnowledge
 *
 * Associated or related knowledge about a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationKnowledge">MedicationKnowledgeRelatedMedicationKnowledge</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationKnowledge)
 */
@Serializable
@SerialName("MedicationKnowledgeRelatedMedicationKnowledge")
data class MedicationKnowledgeRelatedMedicationKnowledge(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("reference")
    override val reference: kotlin.collections.List<Reference>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationKnowledgeRelatedMedicationKnowledge {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationKnowledgeRelatedMedicationKnowledge"
    }
}
