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
 * Codes to denote a guideline or policy statement.when a genetic test result is being shared as a
 * secondary finding.
 *
 * @see <a href="http://hl7.org/fhir/secondary-finding">ObservationCategoryCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/secondary-finding">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ObservationCategoryCodes {

    /**
     * First release (2013): ACMG Recommendations for Reporting of Incidental Findings in Clinical Exome and Genome Sequencing.  https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3727274/
     */
    @SerialName("acmg-version1")
    ACMG_VERSION1,

    /**
     * Second release (2016): Recommendations for reporting of secondary findings in clinical exome and genome sequencing, 2016 update (ACMG SF v2.0): a policy statement of the American College of Medical Genetics and Genomics. https://www.ncbi.nlm.nih.gov/pubmed/27854360
     */
    @SerialName("acmg-version2")
    ACMG_VERSION2
}
