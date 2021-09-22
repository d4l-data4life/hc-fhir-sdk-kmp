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
 * FhirMedicinalProductInteraction
 *
 * The interactions of the medicinal product with other medicinal products, or other forms of
 * interactions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction">MedicinalProductInteraction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction)
 */
interface FhirMedicinalProductInteraction : FhirDomainResource {

    /**
     * The medication for which this is a described interaction.
     */
    val subject: kotlin.collections.List<Reference>?

    /**
     * The interaction described.
     */
    val description: String?

    /**
     * The specific medication, food or laboratory test that interacts.
     */
    val interactant: kotlin.collections.List<MedicinalProductInteractionInteractant>?

    /**
     * The type of the interaction e.g. drug-drug interaction, drug-food interaction,
     * drug-lab test interaction.
     */
    val type: CodeableConcept?

    /**
     * The effect of the interaction, for example "reduced gastric absorption of
     * primary medication".
     */
    val effect: CodeableConcept?

    /**
     * The incidence of the interaction, e.g. theoretical, observed.
     */
    val incidence: CodeableConcept?

    /**
     * Actions for managing the interaction.
     */
    val management: CodeableConcept?
}

/**
 * MedicinalProductInteraction
 *
 * The interactions of the medicinal product with other medicinal products, or other forms of
 * interactions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction">MedicinalProductInteraction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction)
 */
@Serializable
@SerialName("MedicinalProductInteraction")
data class MedicinalProductInteraction(

    @SerialName("subject")
    override val subject: kotlin.collections.List<Reference>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("interactant")
    override val interactant: kotlin.collections.List<MedicinalProductInteractionInteractant>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("effect")
    override val effect: CodeableConcept? = null,

    @SerialName("incidence")
    override val incidence: CodeableConcept? = null,

    @SerialName("management")
    override val management: CodeableConcept? = null,

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
) : FhirMedicinalProductInteraction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductInteraction"
    }
}

/**
 * FhirMedicinalProductInteractionInteractant
 *
 * The specific medication, food or laboratory test that interacts
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction">MedicinalProductInteractionInteractant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction)
 */
interface FhirMedicinalProductInteractionInteractant : FhirBackboneElement {

    /**
     * The specific medication, food or laboratory test that interacts.
     */
    val itemReference: Reference?

    /**
     * The specific medication, food or laboratory test that interacts.
     */
    val itemCodeableConcept: CodeableConcept?
}

/**
 * MedicinalProductInteractionInteractant
 *
 * The specific medication, food or laboratory test that interacts
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction">MedicinalProductInteractionInteractant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductInteraction)
 */
@Serializable
@SerialName("MedicinalProductInteractionInteractant")
data class MedicinalProductInteractionInteractant(

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductInteractionInteractant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductInteractionInteractant"
    }
}
