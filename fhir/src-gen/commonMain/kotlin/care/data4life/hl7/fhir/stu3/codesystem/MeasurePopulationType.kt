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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The type of population
 *
 * @see <a href="http://hl7.org/fhir/measure-population">MeasurePopulationType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/measure-population">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class MeasurePopulationType {

    /**
     * The initial population refers to all patients or events to be evaluated by a
     * quality measure involving patients who share a common set of specified
     * characterstics. All patients or events counted (for example, as numerator, as
     * denominator) are drawn from the initial population
     */
    @SerialName("initial-population")
    INITIAL_POPULATION,

    /**
     * The upper portion of a fraction used to calculate a rate, proportion, or ratio.
     * Also called the measure focus, it is the target process, condition, event, or
     * outcome. Numerator criteria are the processes or outcomes expected for each
     * patient, or event defined in the denominator. A numerator statement describes
     * the clinical action that satisfies the conditions of the measure
     */
    @SerialName("numerator")
    NUMERATOR,

    /**
     * Numerator exclusion criteria define patients or events to be removed from the
     * numerator. Numerator exclusions are used in proportion and ratio measures to
     * help narrow the numerator (for inverted measures)
     */
    @SerialName("numerator-exclusion")
    NUMERATOR_EXCLUSION,

    /**
     * The lower portion of a fraction used to calculate a rate, proportion, or ratio.
     * The denominator can be the same as the initial population, or a subset of the
     * initial population to further constrain the population for the purpose of the
     * measure
     */
    @SerialName("denominator")
    DENOMINATOR,

    /**
     * Denominator exclusion criteria define patients or events that should be removed
     * from the denominator before determining if numerator criteria are met.
     * Denominator exclusions are used in proportion and ratio measures to help narrow
     * the denominator. For example, patients with bilateral lower extremity
     * amputations would be listed as a denominator exclusion for a measure requiring
     * foot exams
     */
    @SerialName("denominator-exclusion")
    DENOMINATOR_EXCLUSION,

    /**
     * Denominator exceptions are conditions that should remove a patient or event from
     * the denominator of a measure only if the numerator criteria are not met.
     * Denominator exception allows for adjustment of the calculated score for those
     * providers with higher risk populations. Denominator exception criteria are only
     * used in proportion measures
     */
    @SerialName("denominator-exception")
    DENOMINATOR_EXCEPTION,

    /**
     * Measure population criteria define the patients or events for which the
     * individual observation for the measure should be taken. Measure populations are
     * used for continuous variable measures rather than numerator and denominator
     * criteria
     */
    @SerialName("measure-population")
    MEASURE_POPULATION,

    /**
     * Measure population criteria define the patients or events that should be removed
     * from the measure population before determining the outcome of one or more
     * continuous variables defined for the measure observation. Measure population
     * exclusion criteria are used within continuous variable measures to help narrow
     * the measure population
     */
    @SerialName("measure-population-exclusion")
    MEASURE_POPULATION_EXCLUSION,

    /**
     * Defines the individual observation to be performed for each patient or event in
     * the measure population. Measure observations for each case in the population are
     * aggregated to determine the overall measure score for the population
     */
    @SerialName("measure-observation")
    MEASURE_OBSERVATION
}
