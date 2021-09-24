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
 * Code System: ImagingStudyStatus
 *
 * The status of the ImagingStudy.
 *
 * @see <a href="http://hl7.org/fhir/imagingstudy-status">ImagingStudyStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/imagingstudy-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ImagingStudyStatus {

    /**
     * The existence of the imaging study is registered, but there is nothing yet
     * available.
     */
    @SerialName("registered")
    REGISTERED,

    /**
     * At least one instance has been associated with this imaging study.
     */
    @SerialName("available")
    AVAILABLE,

    /**
     * The imaging study is unavailable because the imaging study was not started or
     * not completed (also sometimes called "aborted").
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The imaging study has been withdrawn following a previous final release. This
     * electronic record should never have existed, though it is possible that real-
     * world decisions were based on it. (If real-world activity has occurred, the
     * status should be "cancelled" rather than "entered-in-error".).
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The system does not know which of the status values currently applies for this
     * request. Note: This concept is not to be used for "other" - one of the listed
     * statuses is presumed to apply, it's just not known which one.
     */
    @SerialName("unknown")
    UNKNOWN,
}
