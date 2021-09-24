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
 * Code System: DischargeDisposition
 *
 * This value set defines a set of codes that can be used to where the patient left the hospital.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/discharge-disposition">DischargeDisposition</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/encounter-discharge-disposition">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class DischargeDisposition {

    /**
     * The patient was dicharged and has indicated that they are going to return home
     * afterwards.
     */
    @SerialName("home")
    HOME,

    /**
     * The patient was discharged and has indicated that they are going to return home
     * afterwards, but not the patient's home - e.g. a family member's home.
     */
    @SerialName("alt-home")
    ALT_HOME,

    /**
     * The patient was transferred to another healthcare facility.
     */
    @SerialName("other-hcf")
    OTHER_HCF,

    /**
     * The patient has been discharged into palliative care.
     */
    @SerialName("hosp")
    HOSP,

    /**
     * The patient has been discharged into long-term care where is likely to be
     * monitored through an ongoing episode-of-care.
     */
    @SerialName("long")
    LONG,

    /**
     * The patient self discharged against medical advice.
     */
    @SerialName("aadvice")
    AADVICE,

    /**
     * The patient has deceased during this encounter.
     */
    @SerialName("exp")
    EXP,

    /**
     * The patient has been transferred to a psychiatric facility.
     */
    @SerialName("psy")
    PSY,

    /**
     * The patient was discharged and is to receive post acute care rehabilitation
     * services.
     */
    @SerialName("rehab")
    REHAB,

    /**
     * The patient has been discharged to a skilled nursing facility for the patient to
     * receive additional care.
     */
    @SerialName("snf")
    SNF,

    /**
     * The discharge disposition has not otherwise defined.
     */
    @SerialName("oth")
    OTH,
}
