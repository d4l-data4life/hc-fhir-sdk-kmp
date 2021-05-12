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
 * Overall categorization of the event, e.g. product-related or situational.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/adverse-event-category">AdverseEventCategory</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/adverse-event-category">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AdverseEventCategory {

    /**
     * The adverse event pertains to a product problem.
     */
    @SerialName("product-problem")
    PRODUCT_PROBLEM,

    /**
     * The adverse event pertains to product quality.
     */
    @SerialName("product-quality")
    PRODUCT_QUALITY,

    /**
     * The adverse event pertains to a product use error.
     */
    @SerialName("product-use-error")
    PRODUCT_USE_ERROR,

    /**
     * The adverse event pertains to a wrong dose.
     */
    @SerialName("wrong-dose")
    WRONG_DOSE,

    /**
     * The adverse event pertains to incorrect perscribing information.
     */
    @SerialName("incorrect-prescribing-information")
    INCORRECT_PRESCRIBING_INFORMATION,

    /**
     * The adverse event pertains to a wrong technique.
     */
    @SerialName("wrong-technique")
    WRONG_TECHNIQUE,

    /**
     * The adverse event pertains to a wrong route of administration.
     */
    @SerialName("wrong-route-of-administration")
    WRONG_ROUTE_OF_ADMINISTRATION,

    /**
     * The adverse event pertains to a wrong rate.
     */
    @SerialName("wrong-rate")
    WRONG_RATE,

    /**
     * The adverse event pertains to a wrong duration.
     */
    @SerialName("wrong-duration")
    WRONG_DURATION,

    /**
     * The adverse event pertains to a wrong time.
     */
    @SerialName("wrong-time")
    WRONG_TIME,

    /**
     * The adverse event pertains to an expired drug.
     */
    @SerialName("expired-drug")
    EXPIRED_DRUG,

    /**
     * The adverse event pertains to a medical device use error.
     */
    @SerialName("medical-device-use-error")
    MEDICAL_DEVICE_USE_ERROR,

    /**
     * The adverse event pertains to a problem with a different manufacturer of the
     * same medication.
     */
    @SerialName("problem-different-manufacturer")
    PROBLEM_DIFFERENT_MANUFACTURER,

    /**
     * The adverse event pertains to an unsafe physical environment.
     */
    @SerialName("unsafe-physical-environment")
    UNSAFE_PHYSICAL_ENVIRONMENT
}
