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
 * Indicates the potential degree of impact of the identified issue on the patient.
 *
 * @see <a href="http://hl7.org/fhir/detectedissue-severity">DetectedIssueSeverity</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/detectedissue-severity">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DetectedIssueSeverity {
    /**
     * Indicates the issue may be life-threatening or has the potential to cause permanent injury.
     */
    @SerialName("high")
    HIGH,

    /**
     * Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.
     */
    @SerialName("moderate")
    MODERATE,

    /**
     * Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.
     */
    @SerialName("low")
    LOW
}
