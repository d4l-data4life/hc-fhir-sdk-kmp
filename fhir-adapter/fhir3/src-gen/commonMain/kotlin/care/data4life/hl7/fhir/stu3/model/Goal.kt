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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.GoalStatus
import care.data4life.hl7.fhir.stu3.primitive.Date
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirGoal
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight
 * loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal)
 */
interface FhirGoal : FhirDomainResource {

    /**
     * External Ids for this goal.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates whether the goal has been reached and is still considered relevant.
     */
    val status: GoalStatus

    /**
     * E.g. Treatment, dietary, behavioral, etc..
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * high-priority | medium-priority | low-priority.
     */
    val priority: CodeableConcept?

    /**
     * Code or text describing goal.
     */
    val description: CodeableConcept

    /**
     * Who this goal is intended for.
     */
    val subject: Reference?

    /**
     * When goal pursuit begins.
     */
    val startDate: Date?

    /**
     * When goal pursuit begins.
     */
    val startCodeableConcept: CodeableConcept?

    /**
     * Target outcome for the goal.
     */
    val target: GoalTarget?

    /**
     * When goal status took effect.
     */
    val statusDate: Date?

    /**
     * Reason for current status.
     */
    val statusReason: String?

    /**
     * Who's responsible for creating Goal?.
     */
    val expressedBy: Reference?

    /**
     * Issues addressed by this goal.
     */
    val addresses: kotlin.collections.List<Reference>?

    /**
     * Comments about the goal.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * What result was achieved regarding the goal?.
     */
    val outcomeCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Observation that resulted from goal.
     */
    val outcomeReference: kotlin.collections.List<Reference>?
}

/**
 * Goal
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight
 * loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal)
 */
@Serializable
@SerialName("Goal")
data class Goal(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: GoalStatus,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    @SerialName("description")
    override val description: CodeableConcept,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("startDate")
    override val startDate: Date? = null,

    @SerialName("startCodeableConcept")
    override val startCodeableConcept: CodeableConcept? = null,

    @SerialName("target")
    override val target: GoalTarget? = null,

    @SerialName("statusDate")
    override val statusDate: Date? = null,

    @SerialName("statusReason")
    override val statusReason: String? = null,

    @SerialName("expressedBy")
    override val expressedBy: Reference? = null,

    @SerialName("addresses")
    override val addresses: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("outcomeCode")
    override val outcomeCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("outcomeReference")
    override val outcomeReference: kotlin.collections.List<Reference>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirGoal {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Goal"
    }
}

/**
 * FhirGoalTarget
 *
 * Indicates what should be done by when.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">GoalTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal)
 */
interface FhirGoalTarget : FhirBackboneElement {

    /**
     * The parameter whose value is being tracked.
     */
    val measure: CodeableConcept?

    /**
     * The target value to be achieved.
     */
    val detailQuantity: Quantity?

    /**
     * The target value to be achieved.
     */
    val detailRange: Range?

    /**
     * The target value to be achieved.
     */
    val detailCodeableConcept: CodeableConcept?

    /**
     * Reach goal on or before.
     */
    val dueDate: Date?

    /**
     * Reach goal on or before.
     */
    val dueDuration: Duration?
}

/**
 * GoalTarget
 *
 * Indicates what should be done by when.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">GoalTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal)
 */
@Serializable
@SerialName("GoalTarget")
data class GoalTarget(

    @SerialName("measure")
    override val measure: CodeableConcept? = null,

    @SerialName("detailQuantity")
    override val detailQuantity: Quantity? = null,

    @SerialName("detailRange")
    override val detailRange: Range? = null,

    @SerialName("detailCodeableConcept")
    override val detailCodeableConcept: CodeableConcept? = null,

    @SerialName("dueDate")
    override val dueDate: Date? = null,

    @SerialName("dueDuration")
    override val dueDuration: Duration? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirGoalTarget {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GoalTarget"
    }
}
