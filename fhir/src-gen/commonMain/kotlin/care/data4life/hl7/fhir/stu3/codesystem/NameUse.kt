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
 * The use of a human name
 *
 * @see <a href="http://hl7.org/fhir/name-use">NameUse</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/name-use">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class NameUse {

    /**
     * Known as/conventional/the one you normally use
     */
    @SerialName("usual")
    USUAL,

    /**
     * The formal name as registered in an official (government) registry, but which name might not be commonly used. May be called "legal name".
     */
    @SerialName("official")
    OFFICIAL,

    /**
     * A temporary name. Name.period can provide more detailed information. This may also be used for temporary names assigned at birth or in emergency situations.
     */
    @SerialName("temp")
    TEMP,

    /**
     * A name that is used to address the person in an informal manner, but is not part of their formal or usual name
     */
    @SerialName("nickname")
    NICKNAME,

    /**
     * Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons)
     */
    @SerialName("anonymous")
    ANONYMOUS,

    /**
     * This name is no longer in use (or was never correct, but retained for records)
     */
    @SerialName("old")
    OLD,

    /**
     * A name used prior to changing name because of marriage. This name use is for use by applications that collect and store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are constantly changing. This term is not gender specific. The use of this term does not imply any particular history for a person's name
     */
    @SerialName("maiden")
    MAIDEN
}
