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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * A coded concept indicating the current status of a MedicationStatement.
 *
 * @see <a href="http://hl7.org/fhir/medication-statement-status">MedicationStatementStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medication-statement-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class MedicationStatementStatus {
    /**
     * The medication is still being taken.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The medication is no longer being taken.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The statement was recorded incorrectly.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The medication may be taken at some time in the future.
     */
    @SerialName("intended")
    INTENDED,

    /**
     * Actions implied by the statement have been permanently halted, before all of them occurred.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * Actions implied by the statement have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    @SerialName("on-hold")
    ON_HOLD
}
