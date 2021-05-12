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
 * This value set includes sample Information Category codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/claiminformationcategory">ClaimInformationCategoryCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/claim-informationcategory">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ClaimInformationCategoryCodes {

    /**
     * Codes conveying additional situation and condition information.
     */
    @SerialName("info")
    INFO,

    /**
     * Discharge status and discharge to locations.
     */
    @SerialName("discharge")
    DISCHARGE,

    /**
     * Period, start or end dates of aspects of the Condition.
     */
    @SerialName("onset")
    ONSET,

    /**
     * Nature and date of the related event e.g. Last exam, service, X-ray etc.
     */
    @SerialName("related")
    RELATED,

    /**
     * Insurance policy exceptions.
     */
    @SerialName("exception")
    EXCEPTION,

    /**
     * Materials being forwarded, e.g. Models, molds, images, documents.
     */
    @SerialName("material")
    MATERIAL,

    /**
     * Materials attached such as images, documents and resources.
     */
    @SerialName("attachment")
    ATTACHMENT,

    /**
     * Teeth which are missing for any reason, for example: prior extraction, never developed.
     */
    @SerialName("missingtooth")
    MISSINGTOOTH,

    /**
     * The type of prosthesis and date of supply if a previously supplied prosthesis.
     */
    @SerialName("prosthesis")
    PROSTHESIS,

    /**
     * Other information identified by the type.system.
     */
    @SerialName("other")
    OTHER,

    /**
     * An indication that the patient was hospitalized, the period if known otherwise a Yes/No (boolean).
     */
    @SerialName("hospitalized")
    HOSPITALIZED,

    /**
     * An indication that the patient was unable to work, the period if known otherwise a Yes/No (boolean).
     */
    @SerialName("employmentimpacted")
    EMPLOYMENTIMPACTED,

    /**
     * The external cause of an illness or injury.
     */
    @SerialName("externalcause")
    EXTERNALCAUSE,

    /**
     * The reason for the patient visit.
     */
    @SerialName("patientreasonforvisit")
    PATIENTREASONFORVISIT
}
