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
 * Code System: PerformerRoleCodes
 *
 * This value set includes sample Performer Role codes.
 *
 * @see <a href="http://hl7.org/fhir/consentperformer">PerformerRoleCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/consent-performer">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class PerformerRoleCodes {

    /**
     * An entity or an entity's delegatee who is the grantee in an agreement such as a
     * consent for services, advanced directive, or a privacy consent directive in
     * accordance with jurisdictional, organizational, or patient policy.
     */
    @SerialName("consenter")
    CONSENTER,

    /**
     * An entity which accepts certain rights or authority from a grantor.
     */
    @SerialName("grantee")
    GRANTEE,

    /**
     * An entity which agrees to confer certain rights or authority to a grantee.
     */
    @SerialName("grantor")
    GRANTOR,

    /**
     * A party to whom some right or authority is granted by a delegator.
     */
    @SerialName("delegatee")
    DELEGATEE,

    /**
     * A party that grants all or some portion its right or authority to another party.
     */
    @SerialName("delegator")
    DELEGATOR,
}
