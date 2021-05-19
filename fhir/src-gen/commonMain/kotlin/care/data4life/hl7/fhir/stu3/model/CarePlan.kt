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

import care.data4life.hl7.fhir.stu3.codesystem.CarePlanActivityStatus
import care.data4life.hl7.fhir.stu3.codesystem.CarePlanIntent
import care.data4life.hl7.fhir.stu3.codesystem.CarePlanStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCarePlan
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific condition
 * or set of conditions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlan</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
interface FhirCarePlan : FhirDomainResource {

    /**
     * External Ids for this plan.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Protocol or definition.
     */
    val definition: kotlin.collections.List<Reference>?

    /**
     * Fulfills care plan.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * CarePlan replaced by this CarePlan.
     */
    val replaces: kotlin.collections.List<Reference>?

    /**
     * Part of referenced CarePlan.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * Indicates whether the plan is currently being acted upon, represents future
     * intentions or is now a historical record.
     */
    val status: CarePlanStatus

    /**
     * Indicates the level of authority/intentionality associated with the care plan
     * and where the care plan fits into the workflow chain.
     */
    val intent: CarePlanIntent

    /**
     * Type of plan.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Human-friendly name for the CarePlan.
     */
    val title: String?

    /**
     * Summary of nature of plan.
     */
    val description: String?

    /**
     * Who care plan is for.
     */
    val subject: Reference

    /**
     * Created in context of.
     */
    val context: Reference?

    /**
     * Time period plan covers.
     */
    val period: Period?

    /**
     * Who is responsible for contents of the plan.
     */
    val author: kotlin.collections.List<Reference>?

    /**
     * Who's involved in plan?.
     */
    val careTeam: kotlin.collections.List<Reference>?

    /**
     * Health issues this plan addresses.
     */
    val addresses: kotlin.collections.List<Reference>?

    /**
     * Information considered as part of plan.
     */
    val supportingInfo: kotlin.collections.List<Reference>?

    /**
     * Desired outcome of plan.
     */
    val goal: kotlin.collections.List<Reference>?

    /**
     * Action to occur as part of plan.
     */
    val activity: kotlin.collections.List<CarePlanActivity>?

    /**
     * Comments about the plan.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * CarePlan
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific condition
 * or set of conditions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlan</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
@Serializable
@SerialName("CarePlan")
data class CarePlan(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("definition")
    override val definition: kotlin.collections.List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: kotlin.collections.List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: CarePlanStatus,

    @SerialName("intent")
    override val intent: CarePlanIntent,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("author")
    override val author: kotlin.collections.List<Reference>? = null,

    @SerialName("careTeam")
    override val careTeam: kotlin.collections.List<Reference>? = null,

    @SerialName("addresses")
    override val addresses: kotlin.collections.List<Reference>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<Reference>? = null,

    @SerialName("goal")
    override val goal: kotlin.collections.List<Reference>? = null,

    @SerialName("activity")
    override val activity: kotlin.collections.List<CarePlanActivity>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

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
) : FhirCarePlan {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CarePlan"
    }
}

/**
 * FhirCarePlanActivity
 *
 * Identifies a planned action to occur as part of the plan. For example, a medication to be used, lab
 * tests to perform, self-monitoring, education, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlanActivity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
interface FhirCarePlanActivity : FhirBackboneElement {

    /**
     * Results of the activity.
     */
    val outcomeCodeableConcept: kotlin.collections.List<CodeableConcept>?

    /**
     * Appointment, Encounter, Procedure, etc..
     */
    val outcomeReference: kotlin.collections.List<Reference>?

    /**
     * Comments about the activity status/progress.
     */
    val progress: kotlin.collections.List<Annotation>?

    /**
     * Activity details defined in specific resource.
     */
    val reference: Reference?

    /**
     * In-line definition of activity.
     */
    val detail: CarePlanActivityDetail?
}

/**
 * CarePlanActivity
 *
 * Identifies a planned action to occur as part of the plan. For example, a medication to be used, lab
 * tests to perform, self-monitoring, education, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlanActivity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
@Serializable
@SerialName("CarePlanActivity")
data class CarePlanActivity(

    @SerialName("outcomeCodeableConcept")
    override val outcomeCodeableConcept: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("outcomeReference")
    override val outcomeReference: kotlin.collections.List<Reference>? = null,

    @SerialName("progress")
    override val progress: kotlin.collections.List<Annotation>? = null,

    @SerialName("reference")
    override val reference: Reference? = null,

    @SerialName("detail")
    override val detail: CarePlanActivityDetail? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCarePlanActivity {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CarePlanActivity"
    }
}

/**
 * FhirCarePlanActivityDetail
 *
 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven)
 * that doesn't know about specific resources such as procedure etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlanActivityDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
interface FhirCarePlanActivityDetail : FhirBackboneElement {

    /**
     * diet | drug | encounter | observation | procedure | supply | other.
     */
    val category: CodeableConcept?

    /**
     * Protocol or definition.
     */
    val definition: Reference?

    /**
     * Detail type of activity.
     */
    val code: CodeableConcept?

    /**
     * Why activity should be done or why activity was prohibited.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Condition triggering need for activity.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Goals this activity relates to.
     */
    val goal: kotlin.collections.List<Reference>?

    /**
     * Identifies what progress is being made for the specific activity.
     */
    val status: CarePlanActivityStatus

    /**
     * Reason for current status.
     */
    val statusReason: String?

    /**
     * Do NOT do.
     */
    val prohibited: Bool?

    /**
     * When activity is to occur.
     */
    val scheduledTiming: Timing?

    /**
     * When activity is to occur.
     */
    val scheduledPeriod: Period?

    /**
     * When activity is to occur.
     */
    val scheduledString: String?

    /**
     * Where it should happen.
     */
    val location: Reference?

    /**
     * Who will be responsible?.
     */
    val performer: kotlin.collections.List<Reference>?

    /**
     * What is to be administered/supplied.
     */
    val productCodeableConcept: CodeableConcept?

    /**
     * What is to be administered/supplied.
     */
    val productReference: Reference?

    /**
     * How to consume/day?.
     */
    val dailyAmount: Quantity?

    /**
     * How much to administer/supply/consume.
     */
    val quantity: Quantity?

    /**
     * Extra info describing activity to perform.
     */
    val description: String?
}

/**
 * CarePlanActivityDetail
 *
 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven)
 * that doesn't know about specific resources such as procedure etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlanActivityDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
@Serializable
@SerialName("CarePlanActivityDetail")
data class CarePlanActivityDetail(

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("definition")
    override val definition: Reference? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("goal")
    override val goal: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: CarePlanActivityStatus,

    @SerialName("statusReason")
    override val statusReason: String? = null,

    @SerialName("prohibited")
    override val prohibited: Bool? = null,

    @SerialName("scheduledTiming")
    override val scheduledTiming: Timing? = null,

    @SerialName("scheduledPeriod")
    override val scheduledPeriod: Period? = null,

    @SerialName("scheduledString")
    override val scheduledString: String? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<Reference>? = null,

    @SerialName("productCodeableConcept")
    override val productCodeableConcept: CodeableConcept? = null,

    @SerialName("productReference")
    override val productReference: Reference? = null,

    @SerialName("dailyAmount")
    override val dailyAmount: Quantity? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("description")
    override val description: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCarePlanActivityDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CarePlanActivityDetail"
    }
}
