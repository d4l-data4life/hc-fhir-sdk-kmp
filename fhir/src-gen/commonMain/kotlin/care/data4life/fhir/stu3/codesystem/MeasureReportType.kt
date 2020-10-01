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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * The type of the measure report
 *
 * @see <a href="http://hl7.org/fhir/measure-report-type">MeasureReportType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/measure-report-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class MeasureReportType {
    /**
     * An individual report that provides information on the performance for a given measure with respect to a single patient
     */
    @SerialName("individual")
    INDIVIDUAL,

    /**
     * A patient list report that includes a listing of patients that satisfied each population criteria in the measure
     */
    @SerialName("patient-list")
    PATIENT_LIST,

    /**
     * A summary report that returns the number of patients in each population criteria for the measure
     */
    @SerialName("summary")
    SUMMARY
}
