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
 * Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
 *
 * @see <a href="http://hl7.org/fhir/care-plan-status">CarePlanStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/care-plan-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class CarePlanStatus {
    /**
     * The plan is in development or awaiting use but is not yet intended to be acted upon.
     */
    @SerialName("draft")
    DRAFT,

    /**
     * The plan is intended to be followed and used as part of patient care.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The plan has been temporarily stopped but is expected to resume in the future.
     */
    @SerialName("suspended")
    SUSPENDED,

    /**
     * The plan is no longer in use and is not expected to be followed or used in patient care.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The plan was entered in error and voided.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The plan has been terminated prior to reaching completion (though it may have been replaced by a new plan).
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The authoring system doesn't know the current state of the care plan.
     */
    @SerialName("unknown")
    UNKNOWN
}
