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
 * Preferred value set for Condition Categories.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/condition-category">ConditionCategoryCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/condition-category">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ConditionCategoryCodes {

    /**
     * An item on a problem list that can be managed over time and can be expressed by a practitioner (e.g. physician, nurse), patient, or related person.
     */
    @SerialName("problem-list-item")
    PROBLEM_LIST_ITEM,

    /**
     * A point in time diagnosis (e.g. from a physician or nurse) in context of an encounter.
     */
    @SerialName("encounter-diagnosis")
    ENCOUNTER_DIAGNOSIS
}
