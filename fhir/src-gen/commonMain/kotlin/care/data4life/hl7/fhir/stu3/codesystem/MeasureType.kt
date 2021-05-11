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
 * The type of measure (includes codes from 2.16.840.1.113883.1.11.20368)
 *
 * @see <a href="http://hl7.org/fhir/measure-type">MeasureType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/measure-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class MeasureType {
    /**
     * A measure which focuses on a process which leads to a certain outcome, meaning that a scientific basis exists for believing that the process, when executed well, will increase the probability of achieving a desired outcome
     */
    @SerialName("process")
    PROCESS,

    /**
     * A measure that indicates the result of the performance (or non-performance) of a function or process
     */
    @SerialName("outcome")
    OUTCOME,

    /**
     * A measure that focuses on a health care provider's capacity, systems, and processes to provide high-quality care
     */
    @SerialName("structure")
    STRUCTURE,

    /**
     * A measure that focuses on patient-reported information such as patient engagement or patient experience measures
     */
    @SerialName("patient-reported-outcome")
    PATIENT_REPORTED_OUTCOME,

    /**
     * A measure that combines multiple component measures in to a single quality measure
     */
    @SerialName("composite")
    COMPOSITE
}
