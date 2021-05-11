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
 * Example use codes for the List resource - typical kinds of use.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/list-example-use-codes">ExampleUseCodesForList</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/list-example-codes">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ExampleUseCodesForList {
    /**
     * A list of alerts for the patient.
     */
    @SerialName("alerts")
    ALERTS,

    /**
     * A list of part adverse reactions.
     */
    @SerialName("adverserxns")
    ADVERSERXNS,

    /**
     * A list of Allergies for the patient.
     */
    @SerialName("allergies")
    ALLERGIES,

    /**
     * A list of medication statements for the patient.
     */
    @SerialName("medications")
    MEDICATIONS,

    /**
     * A list of problems that the patient is known of have (or have had in the past).
     */
    @SerialName("problems")
    PROBLEMS,

    /**
     * A list of items that constitute a set of work to be performed (typically this code would be specialized for more specific uses, such as a ward round list).
     */
    @SerialName("worklist")
    WORKLIST,

    /**
     * A list of items waiting for an event (perhaps a surgical patient waiting list).
     */
    @SerialName("waiting")
    WAITING,

    /**
     * A set of protocols to be followed.
     */
    @SerialName("protocols")
    PROTOCOLS,

    /**
     * A set of care plans that apply in a particular context of care.
     */
    @SerialName("plans")
    PLANS
}
