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
 * Code System: InvoicePriceComponentType
 *
 * Codes indicating the kind of the price component.
 *
 * @see <a href="http://hl7.org/fhir/invoice-priceComponentType">InvoicePriceComponentType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/invoice-priceComponentType">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class InvoicePriceComponentType {

    /**
     * the amount is the base price used for calculating the total price before
     * applying surcharges, discount or taxes.
     */
    @SerialName("base")
    BASE,

    /**
     * the amount is a surcharge applied on the base price.
     */
    @SerialName("surcharge")
    SURCHARGE,

    /**
     * the amount is a deduction applied on the base price.
     */
    @SerialName("deduction")
    DEDUCTION,

    /**
     * the amount is a discount applied on the base price.
     */
    @SerialName("discount")
    DISCOUNT,

    /**
     * the amount is the tax component of the total price.
     */
    @SerialName("tax")
    TAX,

    /**
     * the amount is of informational character, it has not been applied in the
     * calculation of the total price.
     */
    @SerialName("informational")
    INFORMATIONAL,
}
