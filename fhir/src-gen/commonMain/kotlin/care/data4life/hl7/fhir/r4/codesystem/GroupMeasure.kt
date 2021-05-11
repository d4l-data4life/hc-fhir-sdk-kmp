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
 * Possible group measure aggregates (E.g. Mean, Median).
 *
 * @see <a href="http://hl7.org/fhir/group-measure">GroupMeasure</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/group-measure">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class GroupMeasure {
    /**
     * Aggregated using Mean of participant values.
     */
    @SerialName("mean")
    MEAN,

    /**
     * Aggregated using Median of participant values.
     */
    @SerialName("median")
    MEDIAN,

    /**
     * Aggregated using Mean of study mean values.
     */
    @SerialName("mean-of-mean")
    MEAN_OF_MEAN,

    /**
     * Aggregated using Mean of study median values.
     */
    @SerialName("mean-of-median")
    MEAN_OF_MEDIAN,

    /**
     * Aggregated using Median of study mean values.
     */
    @SerialName("median-of-mean")
    MEDIAN_OF_MEAN,

    /**
     * Aggregated using Median of study median values.
     */
    @SerialName("median-of-median")
    MEDIAN_OF_MEDIAN
}
