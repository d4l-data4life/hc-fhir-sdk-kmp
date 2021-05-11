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
 * A code that describes the type of issue.
 *
 * @see <a href="http://hl7.org/fhir/issue-type">IssueType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/issue-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class IssueType {
    /**
     * Content invalid against the specification or a profile.
     */
    @SerialName("invalid")
    INVALID,

    /**
     * A structural issue in the content such as wrong namespace, or unable to parse the content completely, or invalid json syntax.
     */
    @SerialName("structure")
    STRUCTURE,

    /**
     * A required element is missing.
     */
    @SerialName("required")
    REQUIRED,

    /**
     * An element value is invalid.
     */
    @SerialName("value")
    VALUE,

    /**
     * A content validation rule failed - e.g. a schematron rule.
     */
    @SerialName("invariant")
    INVARIANT,

    /**
     * An authentication/authorization/permissions issue of some kind.
     */
    @SerialName("security")
    SECURITY,

    /**
     * The client needs to initiate an authentication process.
     */
    @SerialName("login")
    LOGIN,

    /**
     * The user or system was not able to be authenticated (either there is no process, or the proferred token is unacceptable).
     */
    @SerialName("unknown")
    UNKNOWN,

    /**
     * User session expired; a login may be required.
     */
    @SerialName("expired")
    EXPIRED,

    /**
     * The user does not have the rights to perform this action.
     */
    @SerialName("forbidden")
    FORBIDDEN,

    /**
     * Some information was not or may not have been returned due to business rules, consent or privacy rules, or access permission constraints.  This information may be accessible through alternate processes.
     */
    @SerialName("suppressed")
    SUPPRESSED,

    /**
     * Processing issues. These are expected to be final e.g. there is no point resubmitting the same content unchanged.
     */
    @SerialName("processing")
    PROCESSING,

    /**
     * The resource or profile is not supported.
     */
    @SerialName("not-supported")
    NOT_SUPPORTED,

    /**
     * An attempt was made to create a duplicate record.
     */
    @SerialName("duplicate")
    DUPLICATE,

    /**
     * The reference provided was not found. In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the content is not found further into the application architecture.
     */
    @SerialName("not-found")
    NOT_FOUND,

    /**
     * Provided content is too long (typically, this is a denial of service protection type of error).
     */
    @SerialName("too-long")
    TOO_LONG,

    /**
     * The code or system could not be understood, or it was not valid in the context of a particular ValueSet.code.
     */
    @SerialName("code-invalid")
    CODE_INVALID,

    /**
     * An extension was found that was not acceptable, could not be resolved, or a modifierExtension was not recognized.
     */
    @SerialName("extension")
    EXTENSION,

    /**
     * The operation was stopped to protect server resources; e.g. a request for a value set expansion on all of SNOMED CT.
     */
    @SerialName("too-costly")
    TOO_COSTLY,

    /**
     * The content/operation failed to pass some business rule, and so could not proceed.
     */
    @SerialName("business-rule")
    BUSINESS_RULE,

    /**
     * Content could not be accepted because of an edit conflict (i.e. version aware updates) (In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the conflict is discovered further into the application architecture.)
     */
    @SerialName("conflict")
    CONFLICT,

    /**
     * Not all data sources typically accessed could be reached, or responded in time, so the returned information may not be complete.
     */
    @SerialName("incomplete")
    INCOMPLETE,

    /**
     * Transient processing issues. The system receiving the error may be able to resubmit the same content once an underlying issue is resolved.
     */
    @SerialName("transient")
    TRANSIENT,

    /**
     * A resource/record locking failure (usually in an underlying database).
     */
    @SerialName("lock-error")
    LOCK_ERROR,

    /**
     * The persistent store is unavailable; e.g. the database is down for maintenance or similar action.
     */
    @SerialName("no-store")
    NO_STORE,

    /**
     * An unexpected internal error has occurred.
     */
    @SerialName("exception")
    EXCEPTION,

    /**
     * An internal timeout has occurred.
     */
    @SerialName("timeout")
    TIMEOUT,

    /**
     * The system is not prepared to handle this request due to load management.
     */
    @SerialName("throttled")
    THROTTLED,

    /**
     * A message unrelated to the processing success of the completed operation (examples of the latter include things like reminders of password expiry, system maintenance times, etc.).
     */
    @SerialName("informational")
    INFORMATIONAL
}
