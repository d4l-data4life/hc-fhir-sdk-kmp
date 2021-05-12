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
 * HL7 Ballot/Standards status of artifact.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/standards-status">StandardsStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/standards-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class StandardsStatus {

    /**
     * This portion of the specification is not considered to be complete enough or sufficiently reviewed to be safe for implementation. It may have known issues or still be in the "in development" stage. It is included in the publication as a place-holder, to solicit feedback from the implementation community and/or to give implementers some insight as to functionality likely to be included in future versions of the specification. Content at this level should only be implemented by the brave or desperate and is very much "use at your own risk". The content that is Draft that will usually be elevated to Trial Use once review and correction is complete after it has been subjected to ballot.
     */
    @SerialName("draft")
    DRAFT,

    /**
     * This content has been subject to review and production implementation in a wide variety of environments. The content is considered to be stable and has been 'locked', subjecting it to FHIR Inter-version Compatibility Rules. While changes are possible, they are expected to be infrequent and are tightly constrained. Compatibility Rules.
     */
    @SerialName("normative")
    NORMATIVE,

    /**
     * This content has been well reviewed and is considered by the authors to be ready for use in production systems. It has been subjected to ballot and approved as an official standard. However, it has not yet seen widespread use in production across the full spectrum of environments it is intended to be used in. In some cases, there may be documented known issues that require implementation experience to determine appropriate resolutions for.

Future versions of FHIR may make significant changes to Trial Use content that are not compatible with previously published content.
     */
    @SerialName("trial-use")
    TRIAL_USE,

    /**
     * This portion of the specification is provided for implementer assistance, and does not make rules that implementers are required to follow. Typical examples of this content in the FHIR specification are tables of contents, registries, examples, and implementer advice.
     */
    @SerialName("informative")
    INFORMATIVE,

    /**
     * This portion of the specification is provided for implementer assistance, and does not make rules that implementers are required to follow. Typical examples of this content in the FHIR specification are tables of contents, registries, examples, and implementer advice.
     */
    @SerialName("deprecated")
    DEPRECATED,

    /**
     * This is content that is managed outside the FHIR Specification, but included for implementer convenience.
     */
    @SerialName("external")
    EXTERNAL
}
