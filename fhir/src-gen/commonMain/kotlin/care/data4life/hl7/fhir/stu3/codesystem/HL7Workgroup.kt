/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
 * An HL7 administrative unit that owns artifacts in the FHIR specification
 *
 * @see <a href="http://hl7.org/fhir/hl7-work-group">HL7Workgroup</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/hl7-work-group">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class HL7Workgroup {
    /**
     * Community Based Collaborative Care (http://www.hl7.org/Special/committees/cbcc/index.cfm)
     */
    @SerialName("cbcc")
    CBCC,

    /**
     * Clinical Decision Support (http://www.hl7.org/Special/committees/dss/index.cfm)
     */
    @SerialName("cds")
    CDS,

    /**
     * Clinical Quality Information (http://www.hl7.org/Special/committees/cqi/index.cfm)
     */
    @SerialName("cqi")
    CQI,

    /**
     * Clinical Genomics (http://www.hl7.org/Special/committees/clingenomics/index.cfm)
     */
    @SerialName("cg")
    CG,

    /**
     * Health Care Devices (http://www.hl7.org/Special/committees/healthcaredevices/index.cfm)
     */
    @SerialName("dev")
    DEV,

    /**
     * Electronic Health Records (http://www.hl7.org/special/committees/ehr/index.cfm)
     */
    @SerialName("ehr")
    EHR,

    /**
     * FHIR Infrastructure (http://www.hl7.org/Special/committees/fiwg/index.cfm)
     */
    @SerialName("fhir")
    FHIR,

    /**
     * Financial Management (http://www.hl7.org/Special/committees/fm/index.cfm)
     */
    @SerialName("fm")
    FM,

    /**
     * Health Standards Integration (http://www.hl7.org/Special/committees/hsi/index.cfm)
     */
    @SerialName("hsi")
    HSI,

    /**
     * Imaging Integration (http://www.hl7.org/Special/committees/imagemgt/index.cfm)
     */
    @SerialName("ii")
    II,

    /**
     * Infrastructure And Messaging (http://www.hl7.org/special/committees/inm/index.cfm)
     */
    @SerialName("inm")
    INM,

    /**
     * Implementable Technology Specifications (http://www.hl7.org/special/committees/xml/index.cfm)
     */
    @SerialName("its")
    ITS,

    /**
     * Orders and Observations (http://www.hl7.org/Special/committees/orders/index.cfm)
     */
    @SerialName("oo")
    OO,

    /**
     * Patient Administration (http://www.hl7.org/Special/committees/pafm/index.cfm)
     */
    @SerialName("pa")
    PA,

    /**
     * Patient Care (http://www.hl7.org/Special/committees/patientcare/index.cfm)
     */
    @SerialName("pc")
    PC,

    /**
     * Public Health and Emergency Response (http://www.hl7.org/Special/committees/pher/index.cfm)
     */
    @SerialName("pher")
    PHER,

    /**
     * Pharmacy (http://www.hl7.org/Special/committees/medication/index.cfm)
     */
    @SerialName("phx")
    PHX,

    /**
     * Regulated Clinical Research Information Management (http://www.hl7.org/Special/committees/rcrim/index.cfm)
     */
    @SerialName("rcrim")
    RCRIM,

    /**
     * Structured Documents (http://www.hl7.org/Special/committees/structure/index.cfm)
     */
    @SerialName("sd")
    SD,

    /**
     * Security (http://www.hl7.org/Special/committees/secure/index.cfm)
     */
    @SerialName("sec")
    SEC,

    /**
     * US Realm Taskforce (http://wiki.hl7.org/index.php?title=US_Realm_Task_Force)
     */
    @SerialName("us")
    US,

    /**
     * Vocabulary (http://www.hl7.org/Special/committees/Vocab/index.cfm)
     */
    @SerialName("vocab")
    VOCAB,

    /**
     * Application Implementation and Design (http://www.hl7.org/Special/committees/java/index.cfm)
     */
    @SerialName("aid")
    AID
}
