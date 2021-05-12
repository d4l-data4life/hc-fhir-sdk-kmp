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
 * This example value set defines a set of codes that can be used to indicate the role of one
 * Organization in relation to another.
 *
 * @see <a href="http://hl7.org/fhir/organization-role">OrganizationAffiliationRole</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/organization-role">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class OrganizationAffiliationRole {

    /**
     * provider
     */
    @SerialName("provider")
    PROVIDER,

    /**
     * An organization such as a public health agency, community/social services provider, etc.
     */
    @SerialName("agency")
    AGENCY,

    /**
     * An organization providing research-related services such as conducting research, recruiting research participants, analyzing data, etc.
     */
    @SerialName("research")
    RESEARCH,

    /**
     * An organization providing reimbursement, payment, or related services
     */
    @SerialName("payer")
    PAYER,

    /**
     * An organization providing diagnostic testing/laboratory services
     */
    @SerialName("diagnostics")
    DIAGNOSTICS,

    /**
     * An organization that provides medical supplies (e.g. medical devices, equipment, pharmaceutical products, etc.)
     */
    @SerialName("supplier")
    SUPPLIER,

    /**
     * An organization that facilitates electronic clinical data exchange between entities
     */
    @SerialName("HIE/HIO")
    HIE_HIO,

    /**
     * A type of non-ownership relationship between entities (encompasses partnerships, collaboration, joint ventures, etc.)
     */
    @SerialName("member")
    MEMBER
}
