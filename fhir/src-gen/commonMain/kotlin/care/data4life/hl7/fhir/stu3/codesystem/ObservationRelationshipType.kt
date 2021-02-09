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
 * Codes specifying how two observations are related.
 *
 * @see <a href="http://hl7.org/fhir/observation-relationshiptypes">ObservationRelationshipType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/observation-relationshiptypes">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class ObservationRelationshipType {
    /**
     * This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.
     */
    @SerialName("has-member")
    HAS_MEMBER,

    /**
     * The target resource (Observation or QuestionnaireResponse) is part of the information from which this observation value is derived. (e.g. calculated anion gap, Apgar score)  NOTE:  "derived-from" is the only logical choice when referencing QuestionnaireResponse.
     */
    @SerialName("derived-from")
    DERIVED_FROM,

    /**
     * This observation follows the target observation (e.g. timed tests such as Glucose Tolerance Test).
     */
    @SerialName("sequel-to")
    SEQUEL_TO,

    /**
     * This observation replaces a previous observation (i.e. a revised value). The target observation is now obsolete.
     */
    @SerialName("replaces")
    REPLACES,

    /**
     * The value of the target observation qualifies (refines) the semantics of the source observation (e.g. a lipemia measure target from a plasma measure).
     */
    @SerialName("qualified-by")
    QUALIFIED_BY,

    /**
     * The value of the target observation interferes (degrades quality, or prevents valid observation) with the semantics of the source observation (e.g. a hemolysis measure target from a plasma potassium measure, which has no value).
     */
    @SerialName("interfered-by")
    INTERFERED_BY
}
