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

import care.data4life.hl7.fhir.stu3.codesystem.MedicationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedication
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the
 * ingredients and the packaging for a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
interface FhirMedication : FhirDomainResource {

    /**
     * Codes that identify this medication.
     */
    val code: CodeableConcept?

    /**
     * A code to indicate if the medication is in active use.
     */
    val status: MedicationStatus?

    /**
     * True if a brand.
     */
    val isBrand: Bool?

    /**
     * True if medication does not require a prescription.
     */
    val isOverTheCounter: Bool?

    /**
     * Manufacturer of the item.
     */
    val manufacturer: Reference?

    /**
     * powder | tablets | capsule +.
     */
    val form: CodeableConcept?

    /**
     * Active or inactive ingredient.
     */
    val ingredient: List<MedicationIngredient>?

    /**
     * Details about packaged medications.
     */
    val pakkage: MedicationPackage?

    /**
     * Picture of the medication.
     */
    val image: List<Attachment>?
}

/**
 * Medication
 *
 * SourceFileName: Medication.kt
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the
 * ingredients and the packaging for a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("Medication")
data class Medication(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("status")
    override val status: MedicationStatus? = null,

    @SerialName("isBrand")
    override val isBrand: Bool? = null,

    @SerialName("isOverTheCounter")
    override val isOverTheCounter: Bool? = null,

    @SerialName("manufacturer")
    override val manufacturer: Reference? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("ingredient")
    override val ingredient: List<MedicationIngredient>? = null,

    @SerialName("package")
    override val pakkage: MedicationPackage? = null,

    @SerialName("image")
    override val image: List<Attachment>? = null,

    // # DomainResource@SerialName("text")
    override val text: Narrative? = null,
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource@SerialName("id")
    override val id: String? = null,
    @SerialName("meta")
    override val meta: Meta? = null,
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    @SerialName("language")
    override val language: String? = null
) : FhirMedication {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Medication"
    }
}

/**
 * FhirMedicationIngredient
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationIngredient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
interface FhirMedicationIngredient : FhirBackboneElement {

    /**
     * The product contained.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * The product contained.
     */
    val itemReference: Reference?

    /**
     * Active ingredient indicator.
     */
    val isActive: Bool?

    /**
     * Quantity of ingredient present.
     */
    val amount: Ratio?
}

/**
 * MedicationIngredient
 *
 * SourceFileName: Medication.kt
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationIngredient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("MedicationIngredient")
data class MedicationIngredient(

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    @SerialName("isActive")
    override val isActive: Bool? = null,

    @SerialName("amount")
    override val amount: Ratio? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationIngredient {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationIngredient"
    }
}

/**
 * FhirMedicationPackage
 *
 * Information that only applies to packages (not products).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationPackage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
interface FhirMedicationPackage : FhirBackboneElement {

    /**
     * E.g. box, vial, blister-pack.
     */
    val container: CodeableConcept?

    /**
     * What is in the package.
     */
    val content: List<MedicationPackageContent>?

    /**
     * Identifies a single production run.
     */
    val batch: List<MedicationPackageBatch>?
}

/**
 * MedicationPackage
 *
 * SourceFileName: Medication.kt
 *
 * Information that only applies to packages (not products).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationPackage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("MedicationPackage")
data class MedicationPackage(

    @SerialName("container")
    override val container: CodeableConcept? = null,

    @SerialName("content")
    override val content: List<MedicationPackageContent>? = null,

    @SerialName("batch")
    override val batch: List<MedicationPackageBatch>? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationPackage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationPackage"
    }
}

/**
 * FhirMedicationPackageBatch
 *
 * Information about a group of medication produced or packaged from one production run.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationPackageBatch</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
interface FhirMedicationPackageBatch : FhirBackboneElement {

    /**
     * Identifier assigned to batch.
     */
    val lotNumber: String?

    /**
     * When batch will expire.
     */
    val expirationDate: DateTime?
}

/**
 * MedicationPackageBatch
 *
 * SourceFileName: Medication.kt
 *
 * Information about a group of medication produced or packaged from one production run.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationPackageBatch</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("MedicationPackageBatch")
data class MedicationPackageBatch(

    @SerialName("lotNumber")
    override val lotNumber: String? = null,

    @SerialName("expirationDate")
    override val expirationDate: DateTime? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationPackageBatch {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationPackageBatch"
    }
}

/**
 * FhirMedicationPackageContent
 *
 * A set of components that go to make up the described item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationPackageContent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
interface FhirMedicationPackageContent : FhirBackboneElement {

    /**
     * The item in the package.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * The item in the package.
     */
    val itemReference: Reference?

    /**
     * Quantity present in the package.
     */
    val amount: Quantity?
}

/**
 * MedicationPackageContent
 *
 * SourceFileName: Medication.kt
 *
 * A set of components that go to make up the described item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationPackageContent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("MedicationPackageContent")
data class MedicationPackageContent(

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    @SerialName("amount")
    override val amount: Quantity? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationPackageContent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationPackageContent"
    }
}
