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
 * How an extension context is interpreted.
 *
 * @see <a href="http://hl7.org/fhir/extension-context">ExtensionContext</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/extension-context">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ExtensionContext {
    /**
     * The context is all elements matching a particular resource element path.
     */
    @SerialName("resource")
    RESOURCE,

    /**
     * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
     */
    @SerialName("datatype")
    DATATYPE,

    /**
     * The context is a particular extension from a particular profile, a uri that identifies the extension definition.
     */
    @SerialName("extension")
    EXTENSION
}
