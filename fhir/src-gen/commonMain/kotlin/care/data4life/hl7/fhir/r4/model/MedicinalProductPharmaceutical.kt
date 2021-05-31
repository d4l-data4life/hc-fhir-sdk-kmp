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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicinalProductPharmaceutical
 *
 * A pharmaceutical product described in terms of its composition and dose form
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceutical</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
interface FhirMedicinalProductPharmaceutical : FhirDomainResource {

    /**
     * An identifier for the pharmaceutical medicinal product.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The administrable dose form, after necessary reconstitution.
     */
    val administrableDoseForm: CodeableConcept

    /**
     * Todo.
     */
    val unitOfPresentation: CodeableConcept?

    /**
     * Ingredient.
     */
    val ingredient: kotlin.collections.List<Reference>?

    /**
     * Accompanying device.
     */
    val device: kotlin.collections.List<Reference>?

    /**
     * Characteristics e.g. a products onset of action.
     */
    val characteristics: kotlin.collections.List<MedicinalProductPharmaceuticalCharacteristics>?

    /**
     * The path by which the pharmaceutical product is taken into or makes contact with
     * the body.
     */
    val routeOfAdministration: kotlin.collections.List<MedicinalProductPharmaceuticalRouteOfAdministration>
}

/**
 * MedicinalProductPharmaceutical
 *
 * A pharmaceutical product described in terms of its composition and dose form
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceutical</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
@Serializable
@SerialName("MedicinalProductPharmaceutical")
data class MedicinalProductPharmaceutical(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("administrableDoseForm")
    override val administrableDoseForm: CodeableConcept,

    @SerialName("unitOfPresentation")
    override val unitOfPresentation: CodeableConcept? = null,

    @SerialName("ingredient")
    override val ingredient: kotlin.collections.List<Reference>? = null,

    @SerialName("device")
    override val device: kotlin.collections.List<Reference>? = null,

    @SerialName("characteristics")
    override val characteristics: kotlin.collections.List<MedicinalProductPharmaceuticalCharacteristics>? = null,

    @SerialName("routeOfAdministration")
    override val routeOfAdministration: kotlin.collections.List<MedicinalProductPharmaceuticalRouteOfAdministration>,

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
) : FhirMedicinalProductPharmaceutical {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPharmaceutical"
    }
}

/**
 * FhirMedicinalProductPharmaceuticalCharacteristics
 *
 * Characteristics e.g. a products onset of action
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalCharacteristics</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
interface FhirMedicinalProductPharmaceuticalCharacteristics : FhirBackboneElement {

    /**
     * A coded characteristic.
     */
    val code: CodeableConcept

    /**
     * The status of characteristic e.g. assigned or pending.
     */
    val status: CodeableConcept?
}

/**
 * MedicinalProductPharmaceuticalCharacteristics
 *
 * Characteristics e.g. a products onset of action
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalCharacteristics</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
@Serializable
@SerialName("MedicinalProductPharmaceuticalCharacteristics")
data class MedicinalProductPharmaceuticalCharacteristics(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductPharmaceuticalCharacteristics {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPharmaceuticalCharacteristics"
    }
}

/**
 * FhirMedicinalProductPharmaceuticalRouteOfAdministration
 *
 * The path by which the pharmaceutical product is taken into or makes contact with the body
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalRouteOfAdministration</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
interface FhirMedicinalProductPharmaceuticalRouteOfAdministration : FhirBackboneElement {

    /**
     * Coded expression for the route.
     */
    val code: CodeableConcept

    /**
     * The first dose (dose quantity) administered in humans can be specified, for a
     * product under investigation, using a numerical value and its unit of measurement.
     */
    val firstDose: Quantity?

    /**
     * The maximum single dose that can be administered as per the protocol of a
     * clinical trial can be specified using a numerical value and its unit of
     * measurement.
     */
    val maxSingleDose: Quantity?

    /**
     * The maximum dose per day (maximum dose quantity to be administered in any one
     * 24-h period) that can be administered as per the protocol referenced in the
     * clinical trial authorisation.
     */
    val maxDosePerDay: Quantity?

    /**
     * The maximum dose per treatment period that can be administered as per the
     * protocol referenced in the clinical trial authorisation.
     */
    val maxDosePerTreatmentPeriod: Ratio?

    /**
     * The maximum treatment period during which an Investigational Medicinal Product
     * can be administered as per the protocol referenced in the clinical trial
     * authorisation.
     */
    val maxTreatmentPeriod: Duration?

    /**
     * A species for which this route applies.
     */
    val targetSpecies: kotlin.collections.List<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies>?
}

/**
 * MedicinalProductPharmaceuticalRouteOfAdministration
 *
 * The path by which the pharmaceutical product is taken into or makes contact with the body
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalRouteOfAdministration</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
@Serializable
@SerialName("MedicinalProductPharmaceuticalRouteOfAdministration")
data class MedicinalProductPharmaceuticalRouteOfAdministration(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("firstDose")
    override val firstDose: Quantity? = null,

    @SerialName("maxSingleDose")
    override val maxSingleDose: Quantity? = null,

    @SerialName("maxDosePerDay")
    override val maxDosePerDay: Quantity? = null,

    @SerialName("maxDosePerTreatmentPeriod")
    override val maxDosePerTreatmentPeriod: Ratio? = null,

    @SerialName("maxTreatmentPeriod")
    override val maxTreatmentPeriod: Duration? = null,

    @SerialName("targetSpecies")
    override val targetSpecies: kotlin.collections.List<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductPharmaceuticalRouteOfAdministration {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPharmaceuticalRouteOfAdministration"
    }
}

/**
 * FhirMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies
 *
 * A species for which this route applies
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
interface FhirMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies : FhirBackboneElement {

    /**
     * Coded expression for the species.
     */
    val code: CodeableConcept

    /**
     * A species specific time during which consumption of animal product is not
     * appropriate.
     */
    val withdrawalPeriod: kotlin.collections.List<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod>?
}

/**
 * MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies
 *
 * A species for which this route applies
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
@Serializable
@SerialName("MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies")
data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("withdrawalPeriod")
    override val withdrawalPeriod: kotlin.collections.List<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies"
    }
}

/**
 * FhirMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod
 *
 * A species specific time during which consumption of animal product is not appropriate
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
interface FhirMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod : FhirBackboneElement {

    /**
     * Coded expression for the type of tissue for which the withdrawal period applues,
     * e.g. meat, milk.
     */
    val tissue: CodeableConcept

    /**
     * A value for the time.
     */
    val value: Quantity

    /**
     * Extra information about the withdrawal period.
     */
    val supportingInformation: String?
}

/**
 * MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod
 *
 * A species specific time during which consumption of animal product is not appropriate
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical">MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductPharmaceutical)
 */
@Serializable
@SerialName("MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod")
data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod(

    @SerialName("tissue")
    override val tissue: CodeableConcept,

    @SerialName("value")
    override val value: Quantity,

    @SerialName("supportingInformation")
    override val supportingInformation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod"
    }
}
