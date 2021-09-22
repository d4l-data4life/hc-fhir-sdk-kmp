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
 * Code System: DataAbsentReason
 *
 * Used to specify why the normally expected content of the data element is missing.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/data-absent-reason">DataAbsentReason</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/data-absent-reason">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class DataAbsentReason {

    /**
     * The value is expected to exist but is not known.
     */
    @SerialName("unknown")
    UNKNOWN,

    /**
     * The source was asked but does not know the value.
     */
    @SerialName("asked-unknown")
    ASKED_UNKNOWN,

    /**
     * There is reason to expect (from the workflow) that the value may become known.
     */
    @SerialName("temp-unknown")
    TEMP_UNKNOWN,

    /**
     * The workflow didn't lead to this value being known.
     */
    @SerialName("not-asked")
    NOT_ASKED,

    /**
     * The source was asked but declined to answer.
     */
    @SerialName("asked-declined")
    ASKED_DECLINED,

    /**
     * The information is not available due to security, privacy or related reasons.
     */
    @SerialName("masked")
    MASKED,

    /**
     * There is no proper value for this element (e.g. last menstrual period for a
     * male).
     */
    @SerialName("not-applicable")
    NOT_APPLICABLE,

    /**
     * The source system wasn't capable of supporting this element.
     */
    @SerialName("unsupported")
    UNSUPPORTED,

    /**
     * The content of the data is represented in the resource narrative.
     */
    @SerialName("as-text")
    AS_TEXT,

    /**
     * Some system or workflow process error means that the information is not
     * available.
     */
    @SerialName("error")
    ERROR,

    /**
     * The numeric value is undefined or unrepresentable due to a floating point
     * processing error.
     */
    @SerialName("not-a-number")
    NOT_A_NUMBER,

    /**
     * The numeric value is excessively low and unrepresentable due to a floating point
     * processing error.
     */
    @SerialName("negative-infinity")
    NEGATIVE_INFINITY,

    /**
     * The numeric value is excessively high and unrepresentable due to a floating
     * point processing error.
     */
    @SerialName("positive-infinity")
    POSITIVE_INFINITY,

    /**
     * The value is not available because the observation procedure (test, etc.) was
     * not performed.
     */
    @SerialName("not-performed")
    NOT_PERFORMED,

    /**
     * The value is not permitted in this context (e.g. due to profiles, or the base
     * data types).
     */
    @SerialName("not-permitted")
    NOT_PERMITTED,
}
