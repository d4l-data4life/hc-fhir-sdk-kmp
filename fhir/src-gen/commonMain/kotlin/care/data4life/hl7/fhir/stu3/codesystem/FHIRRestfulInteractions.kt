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
 * The set of interactions defined by the RESTful part of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/restful-interaction">FHIRRestfulInteractions</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/restful-interaction">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class FHIRRestfulInteractions {

    /**
     * Read the current state of the resource.
     */
    @SerialName("read")
    READ,

    /**
     * Read the state of a specific version of the resource.
     */
    @SerialName("vread")
    VREAD,

    /**
     * Update an existing resource by its id (or create it if it is new).
     */
    @SerialName("update")
    UPDATE,

    /**
     * Update an existing resource by posting a set of changes to it.
     */
    @SerialName("patch")
    PATCH,

    /**
     * Delete a resource.
     */
    @SerialName("delete")
    DELETE,

    /**
     * Retrieve the change history for a particular resource, type of resource, or the entire system.
     */
    @SerialName("history")
    HISTORY,

    /**
     * Retrieve the change history for a particular resource.
     */
    @SerialName("history-instance")
    HISTORY_INSTANCE,

    /**
     * Retrieve the change history for all resources of a particular type.
     */
    @SerialName("history-type")
    HISTORY_TYPE,

    /**
     * Retrieve the change history for all resources on a system.
     */
    @SerialName("history-system")
    HISTORY_SYSTEM,

    /**
     * Create a new resource with a server assigned id.
     */
    @SerialName("create")
    CREATE,

    /**
     * Search a resource type or all resources based on some filter criteria.
     */
    @SerialName("search")
    SEARCH,

    /**
     * Search all resources of the specified type based on some filter criteria.
     */
    @SerialName("search-type")
    SEARCH_TYPE,

    /**
     * Search all resources based on some filter criteria.
     */
    @SerialName("search-system")
    SEARCH_SYSTEM,

    /**
     * Get a Capability Statement for the system.
     */
    @SerialName("capabilities")
    CAPABILITIES,

    /**
     * Update, create or delete a set of resources as a single transaction.
     */
    @SerialName("transaction")
    TRANSACTION,

    /**
     * perform a set of a separate interactions in a single http operation
     */
    @SerialName("batch")
    BATCH,

    /**
     * Perform an operation as defined by an OperationDefinition.
     */
    @SerialName("operation")
    OPERATION
}
