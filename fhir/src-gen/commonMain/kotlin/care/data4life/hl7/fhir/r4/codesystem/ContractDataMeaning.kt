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
 * Code System: ContractDataMeaning
 *
 * How a resource reference is interpreted when evaluating contract offers.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/contract-data-meaning">ContractDataMeaning</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/contract-data-meaning">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ContractDataMeaning {

    /**
     * The consent applies directly to the instance of the resource.
     */
    @SerialName("instance")
    INSTANCE,

    /**
     * The consent applies directly to the instance of the resource and instances it
     * refers to.
     */
    @SerialName("related")
    RELATED,

    /**
     * The consent applies directly to the instance of the resource and instances that
     * refer to it.
     */
    @SerialName("dependents")
    DEPENDENTS,

    /**
     * The consent applies to instances of resources that are authored by.
     */
    @SerialName("authoredby")
    AUTHOREDBY,
}
