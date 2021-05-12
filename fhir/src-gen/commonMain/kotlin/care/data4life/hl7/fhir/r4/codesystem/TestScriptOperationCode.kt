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
 * This value set defines a set of codes that are used to indicate the supported operations of a
 * testing engine or tool.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/testscript-operation-codes">TestScriptOperationCode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/testscript-operation-codes">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TestScriptOperationCode {

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
     * Update an existing resource by its id.
     */
    @SerialName("update")
    UPDATE,

    /**
     * Update an existing resource by its id (or create it if it is new).
     */
    @SerialName("updateCreate")
    UPDATECREATE,

    /**
     * Patch an existing resource by its id.
     */
    @SerialName("patch")
    PATCH,

    /**
     * Delete a resource.
     */
    @SerialName("delete")
    DELETE,

    /**
     * Conditionally delete a single resource based on search parameters.
     */
    @SerialName("deleteCondSingle")
    DELETECONDSINGLE,

    /**
     * Conditionally delete one or more resources based on search parameters.
     */
    @SerialName("deleteCondMultiple")
    DELETECONDMULTIPLE,

    /**
     * Retrieve the change history for a particular resource or resource type.
     */
    @SerialName("history")
    HISTORY,

    /**
     * Create a new resource with a server assigned id.
     */
    @SerialName("create")
    CREATE,

    /**
     * Search based on some filter criteria.
     */
    @SerialName("search")
    SEARCH,

    /**
     * Update, create or delete a set of resources as independent actions.
     */
    @SerialName("batch")
    BATCH,

    /**
     * Update, create or delete a set of resources as a single transaction.
     */
    @SerialName("transaction")
    TRANSACTION,

    /**
     * Get a capability statement for the system.
     */
    @SerialName("capabilities")
    CAPABILITIES,

    /**
     * Realizes an ActivityDefinition in a specific context
     */
    @SerialName("apply")
    APPLY,

    /**
     * Closure Table Maintenance
     */
    @SerialName("closure")
    CLOSURE,

    /**
     * Finding Codes based on supplied properties
     */
    @SerialName("find-matches")
    FIND_MATCHES,

    /**
     * Compare two systems CapabilityStatements
     */
    @SerialName("conforms")
    CONFORMS,

    /**
     * Aggregates and returns the parameters and data requirements for a resource and all its dependencies as a single module definition
     */
    @SerialName("data-requirements")
    DATA_REQUIREMENTS,

    /**
     * Generate a Document
     */
    @SerialName("document")
    DOCUMENT,

    /**
     * Request clinical decision support guidance based on a specific decision support module
     */
    @SerialName("evaluate")
    EVALUATE,

    /**
     * Invoke an eMeasure and obtain the results
     */
    @SerialName("evaluate-measure")
    EVALUATE_MEASURE,

    /**
     * Return all the related information as described in the Encounter or Patient
     */
    @SerialName("everything")
    EVERYTHING,

    /**
     * Value Set Expansion
     */
    @SerialName("expand")
    EXPAND,

    /**
     * Find a functional list
     */
    @SerialName("find")
    FIND,

    /**
     * Invoke a GraphQL query
     */
    @SerialName("graphql")
    GRAPHQL,

    /**
     * Test if a server implements a client's required operations
     */
    @SerialName("implements")
    IMPLEMENTS,

    /**
     * Last N Observations Query
     */
    @SerialName("lastn")
    LASTN,

    /**
     * Concept Look Up and Decomposition
     */
    @SerialName("lookup")
    LOOKUP,

    /**
     * Find patient matches using MPI based logic
     */
    @SerialName("match")
    MATCH,

    /**
     * Access a list of profiles, tags, and security labels
     */
    @SerialName("meta")
    META,

    /**
     * Add profiles, tags, and security labels to a resource
     */
    @SerialName("meta-add")
    META_ADD,

    /**
     * Delete profiles, tags, and security labels for a resource
     */
    @SerialName("meta-delete")
    META_DELETE,

    /**
     * Populate Questionnaire
     */
    @SerialName("populate")
    POPULATE,

    /**
     * Generate HTML for Questionnaire
     */
    @SerialName("populatehtml")
    POPULATEHTML,

    /**
     * Generate a link to a Questionnaire completion webpage
     */
    @SerialName("populatelink")
    POPULATELINK,

    /**
     * Process a message according to the defined event
     */
    @SerialName("process-message")
    PROCESS_MESSAGE,

    /**
     * Build Questionnaire
     */
    @SerialName("questionnaire")
    QUESTIONNAIRE,

    /**
     * Observation Statistics
     */
    @SerialName("stats")
    STATS,

    /**
     * Fetch a subset of the CapabilityStatement resource
     */
    @SerialName("subset")
    SUBSET,

    /**
     * CodeSystem Subsumption Testing
     */
    @SerialName("subsumes")
    SUBSUMES,

    /**
     * Model Instance Transformation
     */
    @SerialName("transform")
    TRANSFORM,

    /**
     * Concept Translation
     */
    @SerialName("translate")
    TRANSLATE,

    /**
     * Validate a resource
     */
    @SerialName("validate")
    VALIDATE,

    /**
     * ValueSet based Validation
     */
    @SerialName("validate-code")
    VALIDATE_CODE
}
