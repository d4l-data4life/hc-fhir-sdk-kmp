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
 * FhirMedicinalProductUndesirableEffect
 *
 * Describe the undesirable effects of the medicinal product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect">MedicinalProductUndesirableEffect</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect)
 */
interface FhirMedicinalProductUndesirableEffect : FhirDomainResource {

    /**
     * The medication for which this is an indication.
     */
    val subject: kotlin.collections.List<Reference>?

    /**
     * The symptom, condition or undesirable effect.
     */
    val symptomConditionEffect: CodeableConcept?

    /**
     * Classification of the effect.
     */
    val classification: CodeableConcept?

    /**
     * The frequency of occurrence of the effect.
     */
    val frequencyOfOccurrence: CodeableConcept?

    /**
     * The population group to which this applies.
     */
    val population: kotlin.collections.List<Population>?
}

/**
 * MedicinalProductUndesirableEffect
 *
 * Describe the undesirable effects of the medicinal product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect">MedicinalProductUndesirableEffect</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductUndesirableEffect)
 */
@Serializable
@SerialName("MedicinalProductUndesirableEffect")
data class MedicinalProductUndesirableEffect(

    @SerialName("subject")
    override val subject: kotlin.collections.List<Reference>? = null,

    @SerialName("symptomConditionEffect")
    override val symptomConditionEffect: CodeableConcept? = null,

    @SerialName("classification")
    override val classification: CodeableConcept? = null,

    @SerialName("frequencyOfOccurrence")
    override val frequencyOfOccurrence: CodeableConcept? = null,

    @SerialName("population")
    override val population: kotlin.collections.List<Population>? = null,

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
) : FhirMedicinalProductUndesirableEffect {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductUndesirableEffect"
    }
}
