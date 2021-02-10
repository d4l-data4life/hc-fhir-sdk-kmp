/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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
 * The status of the endpoint
 *
 * @see <a href="http://hl7.org/fhir/endpoint-status">EndpointStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/endpoint-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class EndpointStatus {
    /**
     * This endpoint is expected to be active and can be used
     */
    @SerialName("active")
    ACTIVE,

    /**
     * This endpoint is temporarily unavailable
     */
    @SerialName("suspended")
    SUSPENDED,

    /**
     * This endpoint has exceeded connectivity thresholds and is considered in an error state and should no longer be attempted to connect to until corrective action is taken
     */
    @SerialName("error")
    ERROR,

    /**
     * This endpoint is no longer to be used
     */
    @SerialName("off")
    OFF,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * This endpoint is not intended for production usage.
     */
    @SerialName("test")
    TEST
}
