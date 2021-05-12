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
 * This value set includes sample Consent Directive Type codes, including several consent directive
 * related LOINC codes; HL7 VALUE SET: ActConsentType(2.16.840.1.113883.1.11.19897); examples of US
 * realm consent directive legal descriptions and references to online and/or downloadable forms such
 * as the SSA-827 Authorization to Disclose Information to the Social Security Administration; and
 * other anticipated consent directives related to participation in a clinical trial, medical
 * procedures, reproductive procedures; health care directive (Living Will); advance directive, do not
 * resuscitate (DNR); Physician Orders for Life-Sustaining Treatment (POLST)
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/consentcategorycodes">ConsentCategoryCodes</a>
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ConsentCategoryCodes {

    /**
     * Any instructions, written or given verbally by a patient to a health care provider in anticipation of potential need for medical treatment. [2005 Honor My Wishes]
     */
    @SerialName("acd")
    ACD,

    /**
     * A legal document, signed by both the patient and their provider, stating a desire not to have CPR initiated in case of a cardiac event. Note: This form was replaced in 2003 with the Physician Orders for Life-Sustaining Treatment [POLST].
     */
    @SerialName("dnr")
    DNR,

    /**
     * Opt-in to disclosure of health information for emergency only consent directive. Comment: This general consent directive specifically limits disclosure of health information for purpose of emergency treatment. Additional parameters may further limit the disclosure to specific users, roles, duration, types of information, and impose uses obligations. [ActConsentDirective (2.16.840.1.113883.1.11.20425)]
     */
    @SerialName("emrgonly")
    EMRGONLY,

    /**
     * Patient's document telling patient's health care provider what the patient wants or does not want if the patient is diagnosed as being terminally ill and in a persistent vegetative state or in a permanently unconscious condition.[2005 Honor My Wishes]
     */
    @SerialName("hcd")
    HCD,

    /**
     * Acknowledgement of custodian notice of privacy practices. Usage Notes: This type of consent directive acknowledges a custodian's notice of privacy practices including its permitted collection, access, use and disclosure of health information to users and for purposes of use specified. [ActConsentDirective (2.16.840.1.113883.1.11.20425)]
     */
    @SerialName("npp")
    NPP,

    /**
     * The Physician Order for Life-Sustaining Treatment form records a person's health care wishes for end of life emergency treatment and translates them into an order by the physician. It must be reviewed and signed by both the patient and the physician, Advanced Registered Nurse Practitioner or Physician Assistant. [2005 Honor My Wishes] Comment: Opt-in Consent Directive with restrictions.
     */
    @SerialName("polst")
    POLST,

    /**
     * Consent to have healthcare information in an electronic health record accessed for research purposes. [VALUE SET: ActConsentType (2.16.840.1.113883.1.11.19897)]
     */
    @SerialName("research")
    RESEARCH,

    /**
     * Consent to have de-identified healthcare information in an electronic health record that is accessed for research purposes, but without consent to re-identify the information under any circumstance. [VALUE SET: ActConsentType (2.16.840.1.113883.1.11.19897)
     */
    @SerialName("rsdid")
    RSDID,

    /**
     * Consent to have de-identified healthcare information in an electronic health record that is accessed for research purposes re-identified under specific circumstances outlined in the consent. [VALUE SET: ActConsentType (2.16.840.1.113883.1.11.19897)]
     */
    @SerialName("rsreid")
    RSREID
}
