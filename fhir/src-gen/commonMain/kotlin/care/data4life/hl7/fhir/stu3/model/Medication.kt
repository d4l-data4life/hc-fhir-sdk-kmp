/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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

interface FhirMedication : FhirDomainResource {

    // Codes that identify this medication.
    val code: CodeableConcept?

    // A code to indicate if the medication is in active use.
    val status: MedicationStatus?

    // True if a brand.
    val isBrand: Bool?

    // True if medication does not require a prescription.
    val isOverTheCounter: Bool?

    // Manufacturer of the item.
    val manufacturer: Reference?

    // powder | tablets | capsule +.
    val form: CodeableConcept?

    // Active or inactive ingredient.
    val ingredient: List<MedicationIngredient>?

    // Details about packaged medications.
    val `package`: MedicationPackage?

    // Picture of the medication.
    val image: List<Attachment>?
}

/**
 * ClassName: Medication
 *
 * SourceFileName: Medication.kt
 *
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("Medication")
data class Medication(

    // Codes that identify this medication.
    @SerialName("code")
    override val code: CodeableConcept? = null,
    // A code to indicate if the medication is in active use.
    @SerialName("status")
    override val status: MedicationStatus? = null,
    // True if a brand.
    @SerialName("isBrand")
    override val isBrand: Bool? = null,
    // True if medication does not require a prescription.
    @SerialName("isOverTheCounter")
    override val isOverTheCounter: Bool? = null,
    // Manufacturer of the item.
    @SerialName("manufacturer")
    override val manufacturer: Reference? = null,
    // powder | tablets | capsule +.
    @SerialName("form")
    override val form: CodeableConcept? = null,
    // Active or inactive ingredient.
    @SerialName("ingredient")
    override val ingredient: List<MedicationIngredient>? = null,
    // Details about packaged medications.
    @SerialName("package")
    override val `package`: MedicationPackage? = null,
    // Picture of the medication.
    @SerialName("image")
    override val image: List<Attachment>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
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
) : FhirMedication {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Medication"
    }
}

interface FhirMedicationIngredient : FhirBackboneElement {

    // The product contained.
    val itemCodeableConcept: CodeableConcept?

    // The product contained.
    val itemReference: Reference?

    // Active ingredient indicator.
    val isActive: Bool?

    // Quantity of ingredient present.
    val amount: Ratio?
}

/**
 * ClassName: MedicationIngredient
 *
 * SourceFileName: Medication.kt
 *
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

    // The product contained.
    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,
    // The product contained.
    @SerialName("itemReference")
    override val itemReference: Reference? = null,
    // Active ingredient indicator.
    @SerialName("isActive")
    override val isActive: Bool? = null,
    // Quantity of ingredient present.
    @SerialName("amount")
    override val amount: Ratio? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
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

interface FhirMedicationPackage : FhirBackboneElement {

    // E.g. box, vial, blister-pack.
    val container: CodeableConcept?

    // What is  in the package.
    val content: List<MedicationPackageContent>?

    // Identifies a single production run.
    val batch: List<MedicationPackageBatch>?
}

/**
 * ClassName: MedicationPackage
 *
 * SourceFileName: Medication.kt
 *
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

    // E.g. box, vial, blister-pack.
    @SerialName("container")
    override val container: CodeableConcept? = null,
    // What is  in the package.
    @SerialName("content")
    override val content: List<MedicationPackageContent>? = null,
    // Identifies a single production run.
    @SerialName("batch")
    override val batch: List<MedicationPackageBatch>? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
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

interface FhirMedicationPackageBatch : FhirBackboneElement {

    // Identifier assigned to batch.
    val lotNumber: String?

    // When batch will expire.
    val expirationDate: DateTime?
}

/**
 * ClassName: MedicationPackageBatch
 *
 * SourceFileName: Medication.kt
 *
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

    // Identifier assigned to batch.
    @SerialName("lotNumber")
    override val lotNumber: String? = null,
    // When batch will expire.
    @SerialName("expirationDate")
    override val expirationDate: DateTime? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
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

interface FhirMedicationPackageContent : FhirBackboneElement {

    // The item in the package.
    val itemCodeableConcept: CodeableConcept?

    // The item in the package.
    val itemReference: Reference?

    // Quantity present in the package.
    val amount: Quantity?
}

/**
 * ClassName: MedicationPackageContent
 *
 * SourceFileName: Medication.kt
 *
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

    // The item in the package.
    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,
    // The item in the package.
    @SerialName("itemReference")
    override val itemReference: Reference? = null,
    // Quantity present in the package.
    @SerialName("amount")
    override val amount: Quantity? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
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
