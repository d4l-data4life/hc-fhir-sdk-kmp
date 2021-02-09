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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Category of an identified substance.
 *
 * @see <a href="http://hl7.org/fhir/allergy-intolerance-category">AllergyIntoleranceCategory</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/allergy-intolerance-category">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class AllergyIntoleranceCategory {
    /**
     * Any substance consumed to provide nutritional support for the body.
     */
    @SerialName("food")
    FOOD,

    /**
     * Substances administered to achieve a physiological effect.
     */
    @SerialName("medication")
    MEDICATION,

    /**
     * Any substances that are encountered in the environment, including any substance not already classified as food, medication, or biologic.
     */
    @SerialName("environment")
    ENVIRONMENT,

    /**
     * A preparation that is synthesized from living organisms or their products, especially a human or animal protein, such as a hormone or antitoxin, that is used as a diagnostic, preventive, or therapeutic agent. Examples of biologic medications include: vaccines; allergenic extracts, which are used for both diagnosis and treatment (for example, allergy shots); gene therapies; cellular therapies.  There are other biologic products, such as tissues, that are not typically associated with allergies.
     */
    @SerialName("biologic")
    BIOLOGIC
}
