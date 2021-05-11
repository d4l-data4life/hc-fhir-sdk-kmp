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
 * Operation Outcome codes used by FHIR test servers (see Implementation file translations.xml)
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/operation-outcome">OperationOutcomeCodes</a>
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class OperationOutcomeCodes {
    /**
     * DELETE_MULTIPLE_MATCHES
     */
    @SerialName("DELETE_MULTIPLE_MATCHES")
    DELETE_MULTIPLE_MATCHES,

    /**
     * MSG_AUTH_REQUIRED
     */
    @SerialName("MSG_AUTH_REQUIRED")
    MSG_AUTH_REQUIRED,

    /**
     * MSG_BAD_FORMAT
     */
    @SerialName("MSG_BAD_FORMAT")
    MSG_BAD_FORMAT,

    /**
     * MSG_BAD_SYNTAX
     */
    @SerialName("MSG_BAD_SYNTAX")
    MSG_BAD_SYNTAX,

    /**
     * MSG_CANT_PARSE_CONTENT
     */
    @SerialName("MSG_CANT_PARSE_CONTENT")
    MSG_CANT_PARSE_CONTENT,

    /**
     * MSG_CANT_PARSE_ROOT
     */
    @SerialName("MSG_CANT_PARSE_ROOT")
    MSG_CANT_PARSE_ROOT,

    /**
     * MSG_CREATED
     */
    @SerialName("MSG_CREATED")
    MSG_CREATED,

    /**
     * MSG_DATE_FORMAT
     */
    @SerialName("MSG_DATE_FORMAT")
    MSG_DATE_FORMAT,

    /**
     * MSG_DELETED
     */
    @SerialName("MSG_DELETED")
    MSG_DELETED,

    /**
     * MSG_DELETED_DONE
     */
    @SerialName("MSG_DELETED_DONE")
    MSG_DELETED_DONE,

    /**
     * MSG_DELETED_ID
     */
    @SerialName("MSG_DELETED_ID")
    MSG_DELETED_ID,

    /**
     * MSG_DUPLICATE_ID
     */
    @SerialName("MSG_DUPLICATE_ID")
    MSG_DUPLICATE_ID,

    /**
     * MSG_ERROR_PARSING
     */
    @SerialName("MSG_ERROR_PARSING")
    MSG_ERROR_PARSING,

    /**
     * MSG_ID_INVALID
     */
    @SerialName("MSG_ID_INVALID")
    MSG_ID_INVALID,

    /**
     * MSG_ID_TOO_LONG
     */
    @SerialName("MSG_ID_TOO_LONG")
    MSG_ID_TOO_LONG,

    /**
     * MSG_INVALID_ID
     */
    @SerialName("MSG_INVALID_ID")
    MSG_INVALID_ID,

    /**
     * MSG_JSON_OBJECT
     */
    @SerialName("MSG_JSON_OBJECT")
    MSG_JSON_OBJECT,

    /**
     * MSG_LOCAL_FAIL
     */
    @SerialName("MSG_LOCAL_FAIL")
    MSG_LOCAL_FAIL,

    /**
     * MSG_NO_EXIST
     */
    @SerialName("MSG_NO_EXIST")
    MSG_NO_EXIST,

    /**
     * MSG_NO_MATCH
     */
    @SerialName("MSG_NO_MATCH")
    MSG_NO_MATCH,

    /**
     * MSG_NO_MODULE
     */
    @SerialName("MSG_NO_MODULE")
    MSG_NO_MODULE,

    /**
     * MSG_NO_SUMMARY
     */
    @SerialName("MSG_NO_SUMMARY")
    MSG_NO_SUMMARY,

    /**
     * MSG_OP_NOT_ALLOWED
     */
    @SerialName("MSG_OP_NOT_ALLOWED")
    MSG_OP_NOT_ALLOWED,

    /**
     * MSG_PARAM_CHAINED
     */
    @SerialName("MSG_PARAM_CHAINED")
    MSG_PARAM_CHAINED,

    /**
     * MSG_PARAM_INVALID
     */
    @SerialName("MSG_PARAM_INVALID")
    MSG_PARAM_INVALID,

    /**
     * MSG_PARAM_MODIFIER_INVALID
     */
    @SerialName("MSG_PARAM_MODIFIER_INVALID")
    MSG_PARAM_MODIFIER_INVALID,

    /**
     * MSG_PARAM_NO_REPEAT
     */
    @SerialName("MSG_PARAM_NO_REPEAT")
    MSG_PARAM_NO_REPEAT,

    /**
     * MSG_PARAM_UNKNOWN
     */
    @SerialName("MSG_PARAM_UNKNOWN")
    MSG_PARAM_UNKNOWN,

    /**
     * MSG_RESOURCE_EXAMPLE_PROTECTED
     */
    @SerialName("MSG_RESOURCE_EXAMPLE_PROTECTED")
    MSG_RESOURCE_EXAMPLE_PROTECTED,

    /**
     * MSG_RESOURCE_ID_FAIL
     */
    @SerialName("MSG_RESOURCE_ID_FAIL")
    MSG_RESOURCE_ID_FAIL,

    /**
     * MSG_RESOURCE_ID_MISMATCH
     */
    @SerialName("MSG_RESOURCE_ID_MISMATCH")
    MSG_RESOURCE_ID_MISMATCH,

    /**
     * MSG_RESOURCE_ID_MISSING
     */
    @SerialName("MSG_RESOURCE_ID_MISSING")
    MSG_RESOURCE_ID_MISSING,

    /**
     * MSG_RESOURCE_NOT_ALLOWED
     */
    @SerialName("MSG_RESOURCE_NOT_ALLOWED")
    MSG_RESOURCE_NOT_ALLOWED,

    /**
     * MSG_RESOURCE_REQUIRED
     */
    @SerialName("MSG_RESOURCE_REQUIRED")
    MSG_RESOURCE_REQUIRED,

    /**
     * MSG_RESOURCE_TYPE_MISMATCH
     */
    @SerialName("MSG_RESOURCE_TYPE_MISMATCH")
    MSG_RESOURCE_TYPE_MISMATCH,

    /**
     * MSG_SORT_UNKNOWN
     */
    @SerialName("MSG_SORT_UNKNOWN")
    MSG_SORT_UNKNOWN,

    /**
     * MSG_TRANSACTION_DUPLICATE_ID
     */
    @SerialName("MSG_TRANSACTION_DUPLICATE_ID")
    MSG_TRANSACTION_DUPLICATE_ID,

    /**
     * MSG_TRANSACTION_MISSING_ID
     */
    @SerialName("MSG_TRANSACTION_MISSING_ID")
    MSG_TRANSACTION_MISSING_ID,

    /**
     * MSG_UNHANDLED_NODE_TYPE
     */
    @SerialName("MSG_UNHANDLED_NODE_TYPE")
    MSG_UNHANDLED_NODE_TYPE,

    /**
     * MSG_UNKNOWN_CONTENT
     */
    @SerialName("MSG_UNKNOWN_CONTENT")
    MSG_UNKNOWN_CONTENT,

    /**
     * MSG_UNKNOWN_OPERATION
     */
    @SerialName("MSG_UNKNOWN_OPERATION")
    MSG_UNKNOWN_OPERATION,

    /**
     * MSG_UNKNOWN_TYPE
     */
    @SerialName("MSG_UNKNOWN_TYPE")
    MSG_UNKNOWN_TYPE,

    /**
     * MSG_UPDATED
     */
    @SerialName("MSG_UPDATED")
    MSG_UPDATED,

    /**
     * MSG_VERSION_AWARE
     */
    @SerialName("MSG_VERSION_AWARE")
    MSG_VERSION_AWARE,

    /**
     * MSG_VERSION_AWARE_CONFLICT
     */
    @SerialName("MSG_VERSION_AWARE_CONFLICT")
    MSG_VERSION_AWARE_CONFLICT,

    /**
     * MSG_VERSION_AWARE_URL
     */
    @SerialName("MSG_VERSION_AWARE_URL")
    MSG_VERSION_AWARE_URL,

    /**
     * MSG_WRONG_NS
     */
    @SerialName("MSG_WRONG_NS")
    MSG_WRONG_NS,

    /**
     * SEARCH_MULTIPLE
     */
    @SerialName("SEARCH_MULTIPLE")
    SEARCH_MULTIPLE,

    /**
     * SEARCH_NONE
     */
    @SerialName("SEARCH_NONE")
    SEARCH_NONE,

    /**
     * UPDATE_MULTIPLE_MATCHES
     */
    @SerialName("UPDATE_MULTIPLE_MATCHES")
    UPDATE_MULTIPLE_MATCHES
}
