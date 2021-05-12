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
 * This value set includes Financial Task codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/financialtaskcode">FinancialTaskCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/financial-taskcode">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class FinancialTaskCodes {

    /**
     * Cancel or reverse a resource, such as a claim or preauthorization, which is in-
     * process or complete.
     */
    @SerialName("cancel")
    CANCEL,

    /**
     * Retrieve selected or all queued resources or messages.
     */
    @SerialName("poll")
    POLL,

    /**
     * Release any reserved funds or material obligations associated with a resource.
     * For example, any unused but reserved funds or treatment allowance associated
     * with a preauthorization once treatment is complete.
     */
    @SerialName("release")
    RELEASE,

    /**
     * Indication that the processing of a resource, such as a claim, for some or all
     * of the required work is now being requested.
     */
    @SerialName("reprocess")
    REPROCESS,

    /**
     * Check on the processing status of a resource such as the adjudication of a
     * claim.
     */
    @SerialName("status")
    STATUS
}
