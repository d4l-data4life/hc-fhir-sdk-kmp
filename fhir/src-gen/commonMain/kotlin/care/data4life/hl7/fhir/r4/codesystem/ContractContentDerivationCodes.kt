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
 * This is an example set of Content Derivative type codes, which represent the minimal content derived
 * from the basal information source at a specific stage in its lifecycle, which is sufficient to
 * manage that source information, for example, in a repository, registry, processes and workflows, for
 * making access control decisions, and providing query responses.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/contract-content-derivative">ContractContentDerivationCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/contract-content-derivative">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ContractContentDerivationCodes {

    /**
     * Content derivative that conveys sufficient information needed to register the
     * source basal content from which it is derived.  This derivative content may be
     * used to register the basal content as it changes status in its lifecycle.  For
     * example, content registration may occur when the basal content is created,
     * updated, inactive, or deleted.
     */
    @SerialName("registration")
    REGISTRATION,

    /**
     * A content derivative that conveys sufficient information to locate and retrieve
     * the content.
     */
    @SerialName("retrieval")
    RETRIEVAL,

    /**
     * Content derivative that has less than full fidelity to the basal information
     * source from which it was 'transcribed'. It provides recipients with the full
     * content representation they may require for compliance purposes, and typically
     * include a reference to or an attached unstructured representation for recipients
     * needing an exact copy of the legal agreement.
     */
    @SerialName("statement")
    STATEMENT,

    /**
     * A Content Derivative that conveys sufficient information to determine the
     * authorized entities with which the content may be shared.
     */
    @SerialName("shareable")
    SHAREABLE
}
