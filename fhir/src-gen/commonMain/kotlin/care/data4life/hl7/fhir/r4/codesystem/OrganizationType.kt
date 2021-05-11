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
 * This example value set defines a set of codes that can be used to indicate a type of organization.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/organization-type">OrganizationType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/organization-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class OrganizationType {
    /**
     * An organization that provides healthcare services.
     */
    @SerialName("prov")
    PROV,

    /**
     * A department or ward within a hospital (Generally is not applicable to top level organizations)
     */
    @SerialName("dept")
    DEPT,

    /**
     * An organizational team is usually a grouping of practitioners that perform a specific function within an organization (which could be a top level organization, or a department).
     */
    @SerialName("team")
    TEAM,

    /**
     * A political body, often used when including organization records for government bodies such as a Federal Government, State or Local Government.
     */
    @SerialName("govt")
    GOVT,

    /**
     * A company that provides insurance to its subscribers that may include healthcare related policies.
     */
    @SerialName("ins")
    INS,

    /**
     * A company, charity, or governmental organization, which processes claims and/or issues payments to providers on behalf of patients or groups of patients.
     */
    @SerialName("pay")
    PAY,

    /**
     * An educational institution that provides education or research facilities.
     */
    @SerialName("edu")
    EDU,

    /**
     * An organization that is identified as a part of a religious institution.
     */
    @SerialName("reli")
    RELI,

    /**
     * An organization that is identified as a Pharmaceutical/Clinical Research Sponsor.
     */
    @SerialName("crs")
    CRS,

    /**
     * An un-incorporated community group.
     */
    @SerialName("cg")
    CG,

    /**
     * An organization that is a registered business or corporation but not identified by other types.
     */
    @SerialName("bus")
    BUS,

    /**
     * Other type of organization not already specified.
     */
    @SerialName("other")
    OTHER
}
