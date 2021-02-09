/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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
 * The kind of medication order
 *
 * @see <a href="http://hl7.org/fhir/medication-request-intent">MedicationRequestIntent</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medication-request-intent">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class MedicationRequestIntent {
    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @SerialName("proposal")
    PROPOSAL,

    /**
     * The request represents an intension to ensure something occurs without providing an authorization for others to act
     */
    @SerialName("plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @SerialName("order")
    ORDER,

    /**
     * The request represents an instance for the particular order, for example a medication administration record.
     */
    @SerialName("instance-order")
    INSTANCE_ORDER
}
