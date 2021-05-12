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

import care.data4life.hl7.fhir.r4.codesystem.MedicationStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirMedication : FhirDomainResource {

    // Business identifier for this medication.
    val identifier: List<Identifier>?

    // Codes that identify this medication.
    val code: CodeableConcept?

    // A code to indicate if the medication is in active use.
    val status: MedicationStatusCodes?

    // Manufacturer of the item.
    val manufacturer: Reference?

    // powder | tablets | capsule +.
    val form: CodeableConcept?

    // Amount of drug in package.
    val amount: Ratio?

    // Active or inactive ingredient.
    val ingredient: List<MedicationIngredient>?

    // Details about packaged medications.
    val batch: MedicationBatch?
}

/**
 * ClassName: Medication
 *
 * SourceFileName: Medication.kt
 *
 * This resource is primarily used for the identification and definition of a medication for the
 * purposes of prescribing, dispensing, and administering a medication as well as for making statements
 * about medication use.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">Medication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("Medication")
data class Medication(

    // Business identifier for this medication.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // Codes that identify this medication.
    @SerialName("code")
    override val code: CodeableConcept? = null,

    // A code to indicate if the medication is in active use.
    @SerialName("status")
    override val status: MedicationStatusCodes? = null,

    // Manufacturer of the item.
    @SerialName("manufacturer")
    override val manufacturer: Reference? = null,

    // powder | tablets | capsule +.
    @SerialName("form")
    override val form: CodeableConcept? = null,

    // Amount of drug in package.
    @SerialName("amount")
    override val amount: Ratio? = null,

    // Active or inactive ingredient.
    @SerialName("ingredient")
    override val ingredient: List<MedicationIngredient>? = null,

    // Details about packaged medications.
    @SerialName("batch")
    override val batch: MedicationBatch? = null,

    // # DomainResource

    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,

    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    // Additional content defined by implementations.
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

interface FhirMedicationBatch : FhirBackboneElement {

    // Identifier assigned to batch.
    val lotNumber: String?

    // When batch will expire.
    val expirationDate: DateTime?
}

/**
 * ClassName: MedicationBatch
 *
 * SourceFileName: Medication.kt
 *
 * Information that only applies to packages (not products).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationBatch</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("MedicationBatch")
data class MedicationBatch(

    // Identifier assigned to batch.
    @SerialName("lotNumber")
    override val lotNumber: String? = null,

    // When batch will expire.
    @SerialName("expirationDate")
    override val expirationDate: DateTime? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationBatch {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationBatch"
    }
}

interface FhirMedicationIngredient : FhirBackboneElement {

    // The actual ingredient or content.
    val itemCodeableConcept: CodeableConcept?

    // The actual ingredient or content.
    val itemReference: Reference?

    // Active ingredient indicator.
    val isActive: Bool?

    // Quantity of ingredient present.
    val strength: Ratio?
}

/**
 * ClassName: MedicationIngredient
 *
 * SourceFileName: Medication.kt
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Medication">MedicationIngredient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Medication)
 */
@Serializable
@SerialName("MedicationIngredient")
data class MedicationIngredient(

    // The actual ingredient or content.
    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    // The actual ingredient or content.
    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    // Active ingredient indicator.
    @SerialName("isActive")
    override val isActive: Bool? = null,

    // Quantity of ingredient present.
    @SerialName("strength")
    override val strength: Ratio? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
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
