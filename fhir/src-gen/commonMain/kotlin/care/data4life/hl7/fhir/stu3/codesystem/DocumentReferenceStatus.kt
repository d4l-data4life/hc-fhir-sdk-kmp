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
 * Code System: DocumentReferenceStatus
 *
 * The status of the document reference.
 *
 * @see <a href="http://hl7.org/fhir/document-reference-status">DocumentReferenceStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/document-reference-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DocumentReferenceStatus {

    /**
     * This is the current reference for this document.
     */
    @SerialName("current")
    CURRENT,

    /**
     * This reference has been superseded by another reference.
     */
    @SerialName("superseded")
    SUPERSEDED,

    /**
     * This reference was created in error.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
