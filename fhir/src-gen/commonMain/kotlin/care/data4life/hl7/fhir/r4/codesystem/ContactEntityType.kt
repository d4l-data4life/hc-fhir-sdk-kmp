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
 * This example value set defines a set of codes that can be used to indicate the purpose for which you
 * would contact a contact party.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/contactentity-type">ContactEntityType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/contactentity-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ContactEntityType {

    /**
     * Contact details for information regarding to billing/general finance enquiries.
     */
    @SerialName("BILL")
    BILL,

    /**
     * Contact details for administrative enquiries.
     */
    @SerialName("ADMIN")
    ADMIN,

    /**
     * Contact details for issues related to Human Resources, such as staff matters,
     * OH&S etc.
     */
    @SerialName("HR")
    HR,

    /**
     * Contact details for dealing with issues related to insurance
     * claims/adjudication/payment.
     */
    @SerialName("PAYOR")
    PAYOR,

    /**
     * Generic information contact for patients.
     */
    @SerialName("PATINF")
    PATINF,

    /**
     * Dedicated contact point for matters relating to press enquiries.
     */
    @SerialName("PRESS")
    PRESS
}
