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
 * Code System: ChargeItemStatus
 *
 * Codes identifying the lifecycle stage of a ChargeItem.
 *
 * @see <a href="http://hl7.org/fhir/chargeitem-status">ChargeItemStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/chargeitem-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ChargeItemStatus {

    /**
     * The charge item has been entered, but the charged service is not yet complete,
     * so it shall not be billed yet but might be used in the context of pre-
     * authorization.
     */
    @SerialName("planned")
    PLANNED,

    /**
     * The charge item is ready for billing.
     */
    @SerialName("billable")
    BILLABLE,

    /**
     * The charge item has been determined to be not billable (e.g. due to rules
     * associated with the billing code).
     */
    @SerialName("not-billable")
    NOT_BILLABLE,

    /**
     * The processing of the charge was aborted.
     */
    @SerialName("aborted")
    ABORTED,

    /**
     * The charge item has been billed (e.g. a billing engine has generated financial
     * transactions by applying the associated ruled for the charge item to the context
     * of the Encounter, and placed them into Claims/Invoices.
     */
    @SerialName("billed")
    BILLED,

    /**
     * The charge item has been entered in error and should not be processed for
     * billing.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring system does not know which of the status values currently applies
     * for this charge item Note: This concept is not to be used for "other" - one of
     * the listed statuses is presumed to apply, it's just not known which one.
     */
    @SerialName("unknown")
    UNKNOWN,
}
