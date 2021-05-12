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
 * This value set includes sample Coverage Copayment Type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/coverage-copay-type">CoverageCopayTypeCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/coverage-copay-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class CoverageCopayTypeCodes {

    /**
     * An office visit for a general practitioner of a discipline.
     */
    @SerialName("gpvisit")
    GPVISIT,

    /**
     * An office visit for a specialist practitioner of a discipline
     */
    @SerialName("spvisit")
    SPVISIT,

    /**
     * An episode in an emergency department.
     */
    @SerialName("emergency")
    EMERGENCY,

    /**
     * An episode of an Inpatient hospital stay.
     */
    @SerialName("inpthosp")
    INPTHOSP,

    /**
     * A visit held where the patient is remote relative to the practitioner, e.g. by phone, computer or video conference.
     */
    @SerialName("televisit")
    TELEVISIT,

    /**
     * A visit to an urgent care facility - typically a community care clinic.
     */
    @SerialName("urgentcare")
    URGENTCARE,

    /**
     * A standard percentage applied to all classes or service or product not otherwise specified.
     */
    @SerialName("copaypct")
    COPAYPCT,

    /**
     * A standard fixed currency amount applied to all classes or service or product not otherwise specified.
     */
    @SerialName("copay")
    COPAY,

    /**
     * The accumulated amount of patient payment before the coverage begins to pay for services.
     */
    @SerialName("deductible")
    DEDUCTIBLE,

    /**
     * The maximum amout of payment for services which a patient, or family, is expected to incur - typically annually.
     */
    @SerialName("maxoutofpocket")
    MAXOUTOFPOCKET
}
