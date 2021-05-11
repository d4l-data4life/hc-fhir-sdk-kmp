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

import kotlinx.serialization.*



/**
 * Attested information may be validated by process that are manual or automated. For automated processes it may accomplished by the system of record reaching out through another system's API or information may be sent to the system of record. This value set defines a set of codes to describing the process, the how, a resource or data element is validated.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/verificationresult-communication-method">VerificationresultCommunicationMethod</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/verificationresult-communication-method">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class VerificationresultCommunicationMethod {
    /**
     * The information is submitted/retrieved manually (e.g. by phone, fax, paper-based)
     */
    @SerialName("manual")
    MANUAL,
    /**
     * The information is submitted/retrieved via a portal
     */
    @SerialName("portal")
    PORTAL,
    /**
     * The information is retrieved (i.e. pulled) from a source (e.g. over an API)
     */
    @SerialName("pull")
    PULL,
    /**
     * The information is sent (i.e. pushed) from a source (e.g. over an API, asynchronously, secure messaging)
     */
    @SerialName("push")
    PUSH
}
