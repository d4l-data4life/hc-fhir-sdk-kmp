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
 * Telecommunications form for contact point
 *
 * @see <a href="http://hl7.org/fhir/contact-point-system">ContactPointSystem</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/contact-point-system">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ContactPointSystem {

    /**
     * The value is a telephone number used for voice calls. Use of full international
     * numbers starting with + is recommended to enable automatic dialing support but
     * not required.
     */
    @SerialName("phone")
    PHONE,

    /**
     * The value is a fax machine. Use of full international numbers starting with + is
     * recommended to enable automatic dialing support but not required.
     */
    @SerialName("fax")
    FAX,

    /**
     * The value is an email address.
     */
    @SerialName("email")
    EMAIL,

    /**
     * The value is a pager number. These may be local pager numbers that are only
     * usable on a particular pager system.
     */
    @SerialName("pager")
    PAGER,

    /**
     * A contact that is not a phone, fax, pager or email address and is expressed as a
     * URL.  This is intended for various personal contacts including blogs, Skype,
     * Twitter, Facebook, etc. Do not use for email addresses.
     */
    @SerialName("url")
    URL,

    /**
     * A contact that can be used for sending an sms message (e.g. mobide phones, some
     * landlines)
     */
    @SerialName("sms")
    SMS,

    /**
     * A contact that is not a phone, fax, page or email address and is not expressible
     * as a URL.  E.g. Internal mail address.  This SHOULD NOT be used for contacts
     * that are expressible as a URL (e.g. Skype, Twitter, Facebook, etc.)  Extensions
     * may be used to distinguish "other" contact types.
     */
    @SerialName("other")
    OTHER
}
