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
 * How a capability statement is intended to be used.
 *
 * @see <a href="http://hl7.org/fhir/capability-statement-kind">CapabilityStatementKind</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/capability-statement-kind">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class CapabilityStatementKind {

    /**
     * The CapabilityStatement instance represents the present capabilities of a
     * specific system instance.  This is the kind returned by /metadata for a FHIR
     * server end-point.
     */
    @SerialName("instance")
    INSTANCE,

    /**
     * The CapabilityStatement instance represents the capabilities of a system or
     * piece of software, independent of a particular installation.
     */
    @SerialName("capability")
    CAPABILITY,

    /**
     * The CapabilityStatement instance represents a set of requirements for other
     * systems to meet; e.g. as part of an implementation guide or 'request for
     * proposal'.
     */
    @SerialName("requirements")
    REQUIREMENTS
}
