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
 * Codes identifying the lifecycle stage of a definition
 *
 * @see <a href="http://hl7.org/fhir/definition-status">DefinitionStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/definition-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DefinitionStatus {
    /**
     * The definition is in the design stage and is not yet considered to be "ready for use"
     */
    @SerialName("draft")
    DRAFT,

    /**
     * The definition is considered ready for use
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The definition should no longer be used
     */
    @SerialName("withdrawn")
    WITHDRAWN,

    /**
     * The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    @SerialName("unknown")
    UNKNOWN
}
