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
 * Code System: ConceptSubsumptionOutcome
 *
 * The subsumption relationship between code/Coding "A" and code/Coding "B". There are 4 possible codes
 * to be returned: equivalent, subsumes, subsumed-by, and not-subsumed. If the server is unable to
 * determine the relationship between the codes/Codings, then it returns an error (i.e. an
 * OperationOutcome).
 *
 * @see <a href="http://hl7.org/fhir/concept-subsumption-outcome">ConceptSubsumptionOutcome</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/concept-subsumption-outcome">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ConceptSubsumptionOutcome {

    /**
     * The two concepts are equivalent (have the same properties).
     */
    @SerialName("equivalent")
    EQUIVALENT,

    /**
     * Coding/code "A" subsumes Coding/code "B" (e.g. B has all the properties A has,
     * and some of it's own).
     */
    @SerialName("subsumes")
    SUBSUMES,

    /**
     * Coding/code "A" is subsumed by Coding/code "B" (e.g. A has all the properties B
     * has, and some of it's own).
     */
    @SerialName("subsumed-by")
    SUBSUMED_BY,

    /**
     * Coding/code "A" and Coding/code "B" are disjoint (e.g. each has propeties that
     * the other doesn't have).
     */
    @SerialName("not-subsumed")
    NOT_SUBSUMED,
}
