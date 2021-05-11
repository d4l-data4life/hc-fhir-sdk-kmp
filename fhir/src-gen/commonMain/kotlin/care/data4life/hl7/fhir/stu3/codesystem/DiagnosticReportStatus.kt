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
 * The status of the diagnostic report as a whole.
 *
 * @see <a href="http://hl7.org/fhir/diagnostic-report-status">DiagnosticReportStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/diagnostic-report-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DiagnosticReportStatus {
    /**
     * The existence of the report is registered, but there is nothing yet available.
     */
    @SerialName("registered")
    REGISTERED,

    /**
     * This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     */
    @SerialName("partial")
    PARTIAL,

    /**
     * Verified early results are available, but not all  results are final.
     */
    @SerialName("preliminary")
    PRELIMINARY,

    /**
     * The report is complete and verified by an authorized person.
     */
    @SerialName("final")
    FINAL,

    /**
     * Subsequent to being final, the report has been modified.  This includes any change in the results, diagnosis, narrative text, or other content of a report that has been issued.
     */
    @SerialName("amended")
    AMENDED,

    /**
     * Subsequent to being final, the report has been modified  to correct an error in the report or referenced results.
     */
    @SerialName("corrected")
    CORRECTED,

    /**
     * Subsequent to being final, the report has been modified by adding new content. The existing content is unchanged.
     */
    @SerialName("appended")
    APPENDED,

    /**
     * The report is unavailable because the measurement was not started or not completed (also sometimes called "aborted").
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The report has been withdrawn following a previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies for this request. Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @SerialName("unknown")
    UNKNOWN
}
