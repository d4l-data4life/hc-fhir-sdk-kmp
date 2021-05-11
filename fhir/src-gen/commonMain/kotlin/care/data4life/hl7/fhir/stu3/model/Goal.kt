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

interface FhirGoal : FhirDomainResource {

    // External Ids for this goal.
    val identifier: List<Identifier>?

    // Indicates whether the goal has been reached and is still considered relevant.
    val status: GoalStatus

    // E.g. Treatment, dietary, behavioral, etc..
    val category: List<CodeableConcept>?

    // high-priority | medium-priority | low-priority.
    val priority: CodeableConcept?

    // Code or text describing goal.
    val description: CodeableConcept

    // Who this goal is intended for.
    val subject: Reference?

    // When goal pursuit begins.
    val startDate: Date?

    // When goal pursuit begins.
    val startCodeableConcept: CodeableConcept?

    // Target outcome for the goal.
    val target: GoalTarget?

    // When goal status took effect.
    val statusDate: Date?

    // Reason for current status.
    val statusReason: String?

    // Who's responsible for creating Goal?.
    val expressedBy: Reference?

    // Issues addressed by this goal.
    val addresses: List<Reference>?

    // Comments about the goal.
    val note: List<Annotation>?

    // What result was achieved regarding the goal?.
    val outcomeCode: List<CodeableConcept>?

    // Observation that resulted from goal.
    val outcomeReference: List<Reference>?
}

/**
 * ClassName: Goal
 *
 * SourceFileName: Goal.kt
 *
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Goal">Goal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Goal)
 */
@Serializable
@SerialName("Goal")
data class Goal(

    // External Ids for this goal.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Indicates whether the goal has been reached and is still considered relevant.
    @SerialName("status")
    override val status: GoalStatus,
    // E.g. Treatment, dietary, behavioral, etc..
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // high-priority | medium-priority | low-priority.
    @SerialName("priority")
    override val priority: CodeableConcept? = null,
    // Code or text describing goal.
    @SerialName("description")
    override val description: CodeableConcept,
    // Who this goal is intended for.
    @SerialName("subject")
    override val subject: Reference? = null,
    // When goal pursuit begins.
    @SerialName("startDate")
    override val startDate: Date? = null,
    // When goal pursuit begins.
    @SerialName("startCodeableConcept")
    override val startCodeableConcept: CodeableConcept? = null,
    // Target outcome for the goal.
    @SerialName("target")
    override val target: GoalTarget? = null,
    // When goal status took effect.
    @SerialName("statusDate")
    override val statusDate: Date? = null,
    // Reason for current status.
    @SerialName("statusReason")
    override val statusReason: String? = null,
    // Who's responsible for creating Goal?.
    @SerialName("expressedBy")
    override val expressedBy: Reference? = null,
    // Issues addressed by this goal.
    @SerialName("addresses")
    override val addresses: List<Reference>? = null,
    // Comments about the goal.
    @SerialName("note")
    override val note: List<Annotation>? = null,
    // What result was achieved regarding the goal?.
    @SerialName("outcomeCode")
    override val outcomeCode: List<CodeableConcept>? = null,
    // Observation that resulted from goal.
    @SerialName("outcomeReference")
    override val outcomeReference: List<Reference>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
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

interface FhirGoalTarget : FhirBackboneElement {

    // The parameter whose value is being tracked.
    val measure: CodeableConcept?

    // The target value to be achieved.
    val detailQuantity: Quantity?

    // The target value to be achieved.
    val detailRange: Range?

    // The target value to be achieved.
    val detailCodeableConcept: CodeableConcept?

    // Reach goal on or before.
    val dueDate: Date?

    // Reach goal on or before.
    val dueDuration: Duration?
}

/**
 * ClassName: GoalTarget
 *
 * SourceFileName: Goal.kt
 *
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

    // The parameter whose value is being tracked.
    @SerialName("measure")
    override val measure: CodeableConcept? = null,
    // The target value to be achieved.
    @SerialName("detailQuantity")
    override val detailQuantity: Quantity? = null,
    // The target value to be achieved.
    @SerialName("detailRange")
    override val detailRange: Range? = null,
    // The target value to be achieved.
    @SerialName("detailCodeableConcept")
    override val detailCodeableConcept: CodeableConcept? = null,
    // Reach goal on or before.
    @SerialName("dueDate")
    override val dueDate: Date? = null,
    // Reach goal on or before.
    @SerialName("dueDuration")
    override val dueDuration: Duration? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirGoalTarget {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GoalTarget"
    }
}
