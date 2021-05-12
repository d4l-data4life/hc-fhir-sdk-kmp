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
 * This value set includes example Diagnosis Type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/ex-diagnosistype">ExampleDiagnosisTypeCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/ex-diagnosistype">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ExampleDiagnosisTypeCodes {

    /**
     * The diagnosis given as the reason why the patient was admitted to the hospital.
     */
    @SerialName("admitting")
    ADMITTING,

    /**
     * A diagnosis made on the basis of medical signs and patient-reported symptoms, rather than diagnostic tests.
     */
    @SerialName("clinical")
    CLINICAL,

    /**
     * One of a set of the possible diagnoses that could be connected to the signs, symptoms, and lab findings.
     */
    @SerialName("differential")
    DIFFERENTIAL,

    /**
     * The diagnosis given when the patient is discharged from the hospital.
     */
    @SerialName("discharge")
    DISCHARGE,

    /**
     * A diagnosis based significantly on laboratory reports or test results, rather than the physical examination of the patient.
     */
    @SerialName("laboratory")
    LABORATORY,

    /**
     * A diagnosis which identifies people's responses to situations in their lives, such as a readiness to change or a willingness to accept assistance.
     */
    @SerialName("nursing")
    NURSING,

    /**
     * A diagnosis determined prior to birth.
     */
    @SerialName("prenatal")
    PRENATAL,

    /**
     * The single medical diagnosis that is most relevant to the patient's chief complaint or need for treatment.
     */
    @SerialName("principal")
    PRINCIPAL,

    /**
     * A diagnosis based primarily on the results from medical imaging studies.
     */
    @SerialName("radiology")
    RADIOLOGY,

    /**
     * A diagnosis determined using telemedicine techniques.
     */
    @SerialName("remote")
    REMOTE,

    /**
     * The labeling of an illness in a specific historical event using modern knowledge, methods and disease classifications.
     */
    @SerialName("retrospective")
    RETROSPECTIVE,

    /**
     * A diagnosis determined by the patient.
     */
    @SerialName("self")
    SELF
}
