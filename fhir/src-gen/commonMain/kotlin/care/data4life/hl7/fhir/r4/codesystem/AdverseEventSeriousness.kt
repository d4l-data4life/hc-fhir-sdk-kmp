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
 * Overall seriousness of this event for the patient.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/adverse-event-seriousness">AdverseEventSeriousness</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/adverse-event-seriousness">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AdverseEventSeriousness {

    /**
     * Non-serious.
     */
    @SerialName("Non-serious")
    NON_SERIOUS,

    /**
     * Serious.
     */
    @SerialName("Serious")
    SERIOUS,

    /**
     * Results in death.
     */
    @SerialName("SeriousResultsInDeath")
    SERIOUSRESULTSINDEATH,

    /**
     * Is Life-threatening.
     */
    @SerialName("SeriousIsLifeThreatening")
    SERIOUSISLIFETHREATENING,

    /**
     * Requires inpatient hospitalization or causes prolongation of existing
     * hospitalization.
     */
    @SerialName("SeriousResultsInHospitalization")
    SERIOUSRESULTSINHOSPITALIZATION,

    /**
     * Results in persistent or significant disability/incapacity.
     */
    @SerialName("SeriousResultsInDisability")
    SERIOUSRESULTSINDISABILITY,

    /**
     * Is a congenital anomaly/birth defect.
     */
    @SerialName("SeriousIsBirthDefect")
    SERIOUSISBIRTHDEFECT,

    /**
     * Requires intervention to prevent permanent impairment or damage (i.e., an
     * important medical event that requires medical judgement).
     */
    @SerialName("SeriousRequiresPreventImpairment")
    SERIOUSREQUIRESPREVENTIMPAIRMENT
}
