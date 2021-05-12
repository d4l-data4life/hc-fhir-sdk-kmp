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
 * The kind of response to a message.
 *
 * @see <a href="http://hl7.org/fhir/response-code">ResponseType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/response-code">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ResponseType {

    /**
     * The message was accepted and processed without error.
     */
    @SerialName("ok")
    OK,

    /**
     * Some internal unexpected error occurred - wait and try again. Note - this is usually used for things like database unavailable, which may be expected to resolve, though human intervention may be required.
     */
    @SerialName("transient-error")
    TRANSIENT_ERROR,

    /**
     * The message was rejected because of a problem with the content. There is no point in re-sending without change. The response narrative SHALL describe the issue.
     */
    @SerialName("fatal-error")
    FATAL_ERROR
}
