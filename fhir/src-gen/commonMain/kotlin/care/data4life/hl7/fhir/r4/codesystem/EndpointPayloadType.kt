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
 * Code System: EndpointPayloadType
 *
 * This is an example value set defined by the FHIR project, that could be used to represent possible
 * payload document types.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/endpoint-payload-type">EndpointPayloadType</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EndpointPayloadType {

    /**
     * Any payload type can be used with this endpoint, it is either a payload agnostic
     * infrastructure (such as a storage repository), or some other type of endpoint
     * where payload considerations are internally handled, and not available
     */
    @SerialName("any")
    ANY,

    /**
     * This endpoint does not require any content to be sent; simply connecting to the
     * endpoint is enough notification. This can be used as a 'ping' to wakeup a
     * service to retrieve content, which could be to ensure security considerations
     * are correctly handled
     */
    @SerialName("none")
    NONE,
}
