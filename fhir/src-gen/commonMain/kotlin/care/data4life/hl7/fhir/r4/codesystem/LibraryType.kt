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
 * Code System: LibraryType
 *
 * The type of knowledge asset this library contains.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/library-type">LibraryType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/library-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class LibraryType {

    /**
     * The resource is a shareable library of formalized knowledge.
     */
    @SerialName("logic-library")
    LOGIC_LIBRARY,

    /**
     * The resource is a definition of an information model.
     */
    @SerialName("model-definition")
    MODEL_DEFINITION,

    /**
     * The resource is a collection of knowledge assets.
     */
    @SerialName("asset-collection")
    ASSET_COLLECTION,

    /**
     * The resource defines the dependencies, parameters, and data requirements for a
     * particular module or evaluation context.
     */
    @SerialName("module-definition")
    MODULE_DEFINITION,
}
