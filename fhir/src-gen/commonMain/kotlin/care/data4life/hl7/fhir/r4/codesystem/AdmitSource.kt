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
 * This value set defines a set of codes that can be used to indicate from where the patient came in.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/admit-source">AdmitSource</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/encounter-admit-source">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AdmitSource {

    /**
     * The Patient has been transferred from another hospital for this encounter.
     */
    @SerialName("hosp-trans")
    HOSP_TRANS,

    /**
     * The patient has been transferred from the emergency department within the hospital. This is typically used in the transition to an inpatient encounter
     */
    @SerialName("emd")
    EMD,

    /**
     * The patient has been transferred from an outpatient department within the hospital.
     */
    @SerialName("outp")
    OUTP,

    /**
     * The patient is a newborn and the encounter will track the baby related activities (as opposed to the Mothers encounter - that may be associated using the newborn encounters partof property)
     */
    @SerialName("born")
    BORN,

    /**
     * The patient has been admitted due to a referred from a General Practitioner.
     */
    @SerialName("gp")
    GP,

    /**
     * The patient has been admitted due to a referred from a Specialist (as opposed to a General Practitioner).
     */
    @SerialName("mp")
    MP,

    /**
     * The patient has been transferred from a nursing home.
     */
    @SerialName("nursing")
    NURSING,

    /**
     * The patient has been transferred from a psychiatric facility.
     */
    @SerialName("psych")
    PSYCH,

    /**
     * The patient has been transferred from a rehabilitation facility or clinic.
     */
    @SerialName("rehab")
    REHAB,

    /**
     * The patient has been admitted from a source otherwise not specified here.
     */
    @SerialName("other")
    OTHER
}
