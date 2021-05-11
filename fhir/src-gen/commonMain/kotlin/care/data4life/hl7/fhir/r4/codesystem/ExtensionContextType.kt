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
 * How an extension context is interpreted.
 *
 * @see <a href="http://hl7.org/fhir/extension-context-type">ExtensionContextType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/extension-context-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ExtensionContextType {
    /**
     * The context is all elements that match the FHIRPath query found in the expression.
     */
    @SerialName("fhirpath")
    FHIRPATH,

    /**
     * The context is any element that has an ElementDefinition.id that matches that found in the expression. This includes ElementDefinition Ids that have slicing identifiers. The full path for the element is [url]#[elementid]. If there is no #, the Element id is one defined in the base specification.
     */
    @SerialName("element")
    ELEMENT,

    /**
     * The context is a particular extension from a particular StructureDefinition, and the expression is just a uri that identifies the extension.
     */
    @SerialName("extension")
    EXTENSION
}
