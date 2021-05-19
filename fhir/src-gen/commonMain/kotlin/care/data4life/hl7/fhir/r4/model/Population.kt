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
 * FhirPopulation
 *
 * A populatioof people with some set of grouping criteria.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Population">Population</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Population)
 */
interface FhirPopulation : FhirBackboneElement {

    /**
     * The age of the specific population.
     */
    val ageRange: Range?

    /**
     * The age of the specific population.
     */
    val ageCodeableConcept: CodeableConcept?

    /**
     * The gender of the specific population.
     */
    val gender: CodeableConcept?

    /**
     * Race of the specific population.
     */
    val race: CodeableConcept?

    /**
     * The existing physiological conditions of the specific population to which this
     * applies.
     */
    val physiologicalCondition: CodeableConcept?
}

/**
 * Population
 *
 * A populatioof people with some set of grouping criteria.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Population">Population</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Population)
 */
@Serializable
@SerialName("Population")
data class Population(

    @SerialName("ageRange")
    override val ageRange: Range? = null,

    @SerialName("ageCodeableConcept")
    override val ageCodeableConcept: CodeableConcept? = null,

    @SerialName("gender")
    override val gender: CodeableConcept? = null,

    @SerialName("race")
    override val race: CodeableConcept? = null,

    @SerialName("physiologicalCondition")
    override val physiologicalCondition: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPopulation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Population"
    }
}
