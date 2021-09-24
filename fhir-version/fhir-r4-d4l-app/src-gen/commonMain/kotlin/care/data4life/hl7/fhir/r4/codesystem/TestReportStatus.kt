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
 * Code System: TestReportStatus
 *
 * The current status of the test report.
 *
 * @see <a href="http://hl7.org/fhir/report-status-codes">TestReportStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/report-status-codes">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TestReportStatus {

    /**
     * All test operations have completed.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * A test operations is currently executing.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * A test operation is waiting for an external client request.
     */
    @SerialName("waiting")
    WAITING,

    /**
     * The test script execution was manually stopped.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * This test report was entered or created in error.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
