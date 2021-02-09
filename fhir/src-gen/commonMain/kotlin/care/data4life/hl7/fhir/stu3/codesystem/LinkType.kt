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
 * The type of link between this patient resource and another patient resource.
 *
 * @see <a href="http://hl7.org/fhir/link-type">LinkType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/link-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class LinkType {
    /**
     * The patient resource containing this link must no longer be used. The link points forward to another patient resource that must be used in lieu of the patient resource that contains this link.
     */
    @SerialName("replaced-by")
    REPLACED_BY,

    /**
     * The patient resource containing this link is the current active patient record. The link points back to an inactive patient resource that has been merged into this resource, and should be consulted to retrieve additional referenced information.
     */
    @SerialName("replaces")
    REPLACES,

    /**
     * The patient resource containing this link is in use and valid but not considered the main source of information about a patient. The link points forward to another patient resource that should be consulted to retrieve additional patient information.
     */
    @SerialName("refer")
    REFER,

    /**
     * The patient resource containing this link is in use and valid, but points to another patient resource that is known to contain data about the same person. Data in this resource might overlap or contradict information found in the other patient resource. This link does not indicate any relative importance of the resources concerned, and both should be regarded as equally valid.
     */
    @SerialName("seealso")
    SEEALSO
}
