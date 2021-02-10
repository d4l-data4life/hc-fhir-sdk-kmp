/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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
 * How to manage the intersection between a fixed version in a value set, and a fixed version of the system in the expansion profile
 *
 * @see <a href="http://hl7.org/fhir/system-version-processing-mode">SystemVersionProcessingMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/system-version-processing-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class SystemVersionProcessingMode {
    /**
     * Use this version of the code system if a value set doesn't specify a version
     */
    @SerialName("default")
    DEFAULT,

    /**
     * Use this version of the code system. If a value set specifies a different version, the expansion operation should fail
     */
    @SerialName("check")
    CHECK,

    /**
     * Use this version of the code system irrespective of which version is specified by a value set. Note that this has obvious safety issues, in that it may result in a value set expansion giving a different list of codes that is both wrong and unsafe, and implementers should only use this capability reluctantly. It primarily exists to deal with situations where specifications have fallen into decay as time passes. If a  version is override, the version used SHALL explicitly be represented in the expansion parameters
     */
    @SerialName("override")
    OVERRIDE
}
