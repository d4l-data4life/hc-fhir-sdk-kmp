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
 * Substance category codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/substance-category">SubstanceCategoryCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/substance-category">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class SubstanceCategoryCodes {

    /**
     * A substance that causes an allergic reaction.
     */
    @SerialName("allergen")
    ALLERGEN,

    /**
     * A substance that is produced by or extracted from a biological source.
     */
    @SerialName("biological")
    BIOLOGICAL,

    /**
     * A substance that comes directly from a human or an animal (e.g. blood, urine, feces, tears, etc.).
     */
    @SerialName("body")
    BODY,

    /**
     * Any organic or inorganic substance of a particular molecular identity, including -- (i) any combination of such substances occurring in whole or in part as a result of a chemical reaction or occurring in nature and (ii) any element or uncombined radical (http://www.epa.gov/opptintr/import-export/pubs/importguide.pdf).
     */
    @SerialName("chemical")
    CHEMICAL,

    /**
     * A food, dietary ingredient, or dietary supplement for human or animal.
     */
    @SerialName("food")
    FOOD,

    /**
     * A substance intended for use in the diagnosis, cure, mitigation, treatment, or prevention of disease in man or other animals (Federal Food Drug and Cosmetic Act).
     */
    @SerialName("drug")
    DRUG,

    /**
     * A finished product which is not normally ingested, absorbed or injected (e.g. steel, iron, wood, plastic and paper).
     */
    @SerialName("material")
    MATERIAL
}
