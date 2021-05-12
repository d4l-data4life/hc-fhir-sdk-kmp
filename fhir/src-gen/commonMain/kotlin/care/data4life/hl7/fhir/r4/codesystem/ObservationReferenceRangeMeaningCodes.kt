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
 * This value set defines a set of codes that can be used to indicate the meaning/use of a reference
 * range for a particular target population.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/referencerange-meaning">ObservationReferenceRangeMeaningCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/referencerange-meaning">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ObservationReferenceRangeMeaningCodes {

    /**
     * General types of reference range.
     */
    @SerialName("type")
    TYPE,

    /**
     * Values expected for a normal member of the relevant control population being
     * measured. Typically each results producer such as a laboratory has specific
     * normal ranges and they are usually defined as within two standard deviations
     * from the mean and account for 95.45% of this population.
     */
    @SerialName("normal")
    NORMAL,

    /**
     * The range that is recommended by a relevant professional body.
     */
    @SerialName("recommended")
    RECOMMENDED,

    /**
     * The range at which treatment would/should be considered.
     */
    @SerialName("treatment")
    TREATMENT,

    /**
     * The optimal range for best therapeutic outcomes.
     */
    @SerialName("therapeutic")
    THERAPEUTIC,

    /**
     * The optimal range for best therapeutic outcomes for a specimen taken immediately
     * before administration.
     */
    @SerialName("pre")
    PRE,

    /**
     * The optimal range for best therapeutic outcomes for a specimen taken immediately
     * after administration.
     */
    @SerialName("post")
    POST,

    /**
     * Endocrine related states that change the expected value.
     */
    @SerialName("endocrine")
    ENDOCRINE,

    /**
     * An expected range in an individual prior to puberty.
     */
    @SerialName("pre-puberty")
    PRE_PUBERTY,

    /**
     * An expected range in an individual during the follicular stage of the cycle.
     */
    @SerialName("follicular")
    FOLLICULAR,

    /**
     * An expected range in an individual during the midcycle stage of the cycle.
     */
    @SerialName("midcycle")
    MIDCYCLE,

    /**
     * An expected range in an individual during the luteal stage of the cycle.
     */
    @SerialName("luteal")
    LUTEAL,

    /**
     * An expected range in an individual post-menopause.
     */
    @SerialName("postmenopausal")
    POSTMENOPAUSAL
}
