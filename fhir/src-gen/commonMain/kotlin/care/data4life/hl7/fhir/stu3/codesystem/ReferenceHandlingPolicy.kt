/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
 * A set of flags that defines how references are supported.
 *
 * @see <a href="http://hl7.org/fhir/reference-handling-policy">ReferenceHandlingPolicy</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/reference-handling-policy">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ReferenceHandlingPolicy {
    /**
     * The server supports and populates Literal references where they are known (this code does not guarantee that all references are literal; see 'enforced')
     */
    @SerialName("literal")
    LITERAL,

    /**
     * The server allows logical references
     */
    @SerialName("logical")
    LOGICAL,

    /**
     * The server will attempt to resolve logical references to literal references (if resolution fails, the server may still accept resources; see logical)
     */
    @SerialName("resolves")
    RESOLVES,

    /**
     * The server enforces that references have integrity - e.g. it ensures that references can always be resolved. This is typically the case for clinical record systems, but often not the case for middleware/proxy systems
     */
    @SerialName("enforced")
    ENFORCED,

    /**
     * The server does not support references that point to other servers
     */
    @SerialName("local")
    LOCAL
}
