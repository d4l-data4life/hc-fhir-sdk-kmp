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
 * Indicates the purpose of a bundle - how it was intended to be used.
 *
 * @see <a href="http://hl7.org/fhir/bundle-type">BundleType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/bundle-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class BundleType {
    /**
     * The bundle is a document. The first resource is a Composition.
     */
    @SerialName("document")
    DOCUMENT,

    /**
     * The bundle is a message. The first resource is a MessageHeader.
     */
    @SerialName("message")
    MESSAGE,

    /**
     * The bundle is a transaction - intended to be processed by a server as an atomic commit.
     */
    @SerialName("transaction")
    TRANSACTION,

    /**
     * The bundle is a transaction response. Because the response is a transaction response, the transaction has succeeded, and all responses are error free.
     */
    @SerialName("transaction-response")
    TRANSACTION_RESPONSE,

    /**
     * The bundle is a transaction - intended to be processed by a server as a group of actions.
     */
    @SerialName("batch")
    BATCH,

    /**
     * The bundle is a batch response. Note that as a batch, some responses may indicate failure and others success.
     */
    @SerialName("batch-response")
    BATCH_RESPONSE,

    /**
     * The bundle is a list of resources from a history interaction on a server.
     */
    @SerialName("history")
    HISTORY,

    /**
     * The bundle is a list of resources returned as a result of a search/query interaction, operation, or message.
     */
    @SerialName("searchset")
    SEARCHSET,

    /**
     * The bundle is a set of resources collected into a single package for ease of distribution.
     */
    @SerialName("collection")
    COLLECTION
}
