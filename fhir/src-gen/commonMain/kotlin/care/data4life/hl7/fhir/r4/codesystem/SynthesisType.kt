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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Types of combining results from a body of evidence (eg. summary data meta-analysis).
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/synthesis-type">SynthesisType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/synthesis-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class SynthesisType {

    /**
     * A meta-analysis of the summary data of estimates from individual studies or data sets.
     */
    @SerialName("std-MA")
    STD_MA,

    /**
     * A meta-analysis of the individual participant data from individual studies or data sets.
     */
    @SerialName("IPD-MA")
    IPD_MA,

    /**
     * An indirect meta-analysis derived from 2 or more direct comparisons in a network meta-analysis.
     */
    @SerialName("indirect-NMA")
    INDIRECT_NMA,

    /**
     * An composite meta-analysis derived from direct comparisons and indirect comparisons in a network meta-analysis.
     */
    @SerialName("combined-NMA")
    COMBINED_NMA,

    /**
     * A range of results across a body of evidence.
     */
    @SerialName("range")
    RANGE,

    /**
     * An approach describing a body of evidence by categorically classifying individual studies (eg 3 studies showed beneft and 2 studied found no effect).
     */
    @SerialName("classification")
    CLASSIFICATION
}
