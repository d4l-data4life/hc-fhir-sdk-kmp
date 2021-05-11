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
 * Indicates the status of the care team.
 *
 * @see <a href="http://hl7.org/fhir/care-team-status">CareTeamStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/care-team-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class CareTeamStatus {
    /**
     * The care team has been drafted and proposed, but not yet participating in the coordination and delivery of care.
     */
    @SerialName("proposed")
    PROPOSED,

    /**
     * The care team is currently participating in the coordination and delivery of care.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The care team is temporarily on hold or suspended and not participating in the coordination and delivery of care.
     */
    @SerialName("suspended")
    SUSPENDED,

    /**
     * The care team was, but is no longer, participating in the coordination and delivery of care.
     */
    @SerialName("inactive")
    INACTIVE,

    /**
     * The care team should have never existed.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR
}
