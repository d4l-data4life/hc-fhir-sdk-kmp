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
 * A code that specifies a type of context being specified by a usage context.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/usage-context-type">UsageContextType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/usage-context-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class UsageContextType {

    /**
     * The gender of the patient. For this context type, appropriate values can be found in the http://hl7.org/fhir/ValueSet/administrative-gender value set.
     */
    @SerialName("gender")
    GENDER,

    /**
     * The age of the patient. For this context type, the value could be a range that specifies the applicable ages or a code from an appropriate value set such as the MeSH value set http://terminology.hl7.org/ValueSet/v3-AgeGroupObservationValue.
     */
    @SerialName("age")
    AGE,

    /**
     * The clinical concept(s) addressed by the artifact. For example, disease, diagnostic test interpretation, medication ordering as in http://hl7.org/fhir/ValueSet/condition-code.
     */
    @SerialName("focus")
    FOCUS,

    /**
     * The clinical specialty of the context in which the patient is being treated - For example, PCP, Patient, Cardiologist, Behavioral Professional, Oral Health Professional, Prescriber, etc... taken from a specialty value set such as the NUCC Health Care provider taxonomy value set http://hl7.org/fhir/ValueSet/provider-taxonomy.
     */
    @SerialName("user")
    USER,

    /**
     * The settings in which the artifact is intended for use. For example, admission, pre-op, etc. For example, the ActEncounterCode value set http://terminology.hl7.org/ValueSet/v3-ActEncounterCode.
     */
    @SerialName("workflow")
    WORKFLOW,

    /**
     * The context for the clinical task(s) represented by this artifact. For example, this could be any task context represented by the HL7 ActTaskCode value set http://terminology.hl7.org/ValueSet/v3-ActTaskCode. General categories include: order entry, patient documentation and patient information review.
     */
    @SerialName("task")
    TASK,

    /**
     * The venue in which an artifact could be used. For example, Outpatient, Inpatient, Home, Nursing home. The code value may originate from the HL7 ServiceDeliveryLocationRoleType value set (http://terminology.hl7.org/ValueSet/v3-ServiceDeliveryLocationRoleType).
     */
    @SerialName("venue")
    VENUE,

    /**
     * The species to which an artifact applies. For example, SNOMED - 387961004 | Kingdom Animalia (organism).
     */
    @SerialName("species")
    SPECIES,

    /**
     * A program/project of work for which this artifact is applicable.
     */
    @SerialName("program")
    PROGRAM
}
