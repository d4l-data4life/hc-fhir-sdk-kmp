/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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


interface FhirCarePlan : FhirDomainResource {

    // External Ids for this plan.
    val identifier: List<Identifier>?

    // Protocol or definition.
    val definition: List<Reference>?

    // Fulfills care plan.
    val basedOn: List<Reference>?

    // CarePlan replaced by this CarePlan.
    val replaces: List<Reference>?

    // Part of referenced CarePlan.
    val partOf: List<Reference>?

    // Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
    val status: CarePlanStatus

    // Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
    val intent: CarePlanIntent

    // Type of plan.
    val category: List<CodeableConcept>?

    // Human-friendly name for the CarePlan.
    val title: String?

    // Summary of nature of plan.
    val description: String?

    // Who care plan is for.
    val subject: Reference

    // Created in context of.
    val context: Reference?

    // Time period plan covers.
    val period: Period?

    // Who is responsible for contents of the plan.
    val author: List<Reference>?

    // Who's involved in plan?.
    val careTeam: List<Reference>?

    // Health issues this plan addresses.
    val addresses: List<Reference>?

    // Information considered as part of plan.
    val supportingInfo: List<Reference>?

    // Desired outcome of plan.
    val goal: List<Reference>?

    // Action to occur as part of plan.
    val activity: List<CarePlanActivity>?

    // Comments about the plan.
    val note: List<Annotation>?
}


/**
 * ClassName: CarePlan
 *
 * SourceFileName: CarePlan.kt
 *
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlan</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
@Serializable
@SerialName("CarePlan")
data class CarePlan(

    // External Ids for this plan.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Protocol or definition.
    @SerialName("definition")
    override val definition: List<Reference>? = null,
    // Fulfills care plan.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,
    // CarePlan replaced by this CarePlan.
    @SerialName("replaces")
    override val replaces: List<Reference>? = null,
    // Part of referenced CarePlan.
    @SerialName("partOf")
    override val partOf: List<Reference>? = null,
    // Indicates whether the plan is currently being acted upon, represents future intentions or is now a historical record.
    @SerialName("status")
    override val status: CarePlanStatus,
    // Indicates the level of authority/intentionality associated with the care plan and where the care plan fits into the workflow chain.
    @SerialName("intent")
    override val intent: CarePlanIntent,
    // Type of plan.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // Human-friendly name for the CarePlan.
    @SerialName("title")
    override val title: String? = null,
    // Summary of nature of plan.
    @SerialName("description")
    override val description: String? = null,
    // Who care plan is for.
    @SerialName("subject")
    override val subject: Reference,
    // Created in context of.
    @SerialName("context")
    override val context: Reference? = null,
    // Time period plan covers.
    @SerialName("period")
    override val period: Period? = null,
    // Who is responsible for contents of the plan.
    @SerialName("author")
    override val author: List<Reference>? = null,
    // Who's involved in plan?.
    @SerialName("careTeam")
    override val careTeam: List<Reference>? = null,
    // Health issues this plan addresses.
    @SerialName("addresses")
    override val addresses: List<Reference>? = null,
    // Information considered as part of plan.
    @SerialName("supportingInfo")
    override val supportingInfo: List<Reference>? = null,
    // Desired outcome of plan.
    @SerialName("goal")
    override val goal: List<Reference>? = null,
    // Action to occur as part of plan.
    @SerialName("activity")
    override val activity: List<CarePlanActivity>? = null,
    // Comments about the plan.
    @SerialName("note")
    override val note: List<Annotation>? = null,


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
) : FhirCarePlan {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CarePlan"
    }
}


interface FhirCarePlanActivity : FhirBackboneElement {

    // Results of the activity.
    val outcomeCodeableConcept: List<CodeableConcept>?

    // Appointment, Encounter, Procedure, etc..
    val outcomeReference: List<Reference>?

    // Comments about the activity status/progress.
    val progress: List<Annotation>?

    // Activity details defined in specific resource.
    val reference: Reference?

    // In-line definition of activity.
    val detail: CarePlanActivityDetail?
}


/**
 * ClassName: CarePlanActivity
 *
 * SourceFileName: CarePlan.kt
 *
 *
 * Identifies a planned action to occur as part of the plan.  For example, a medication to be used, lab tests to perform, self-monitoring, education, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlanActivity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
@Serializable
@SerialName("CarePlanActivity")
data class CarePlanActivity(

    // Results of the activity.
    @SerialName("outcomeCodeableConcept")
    override val outcomeCodeableConcept: List<CodeableConcept>? = null,
    // Appointment, Encounter, Procedure, etc..
    @SerialName("outcomeReference")
    override val outcomeReference: List<Reference>? = null,
    // Comments about the activity status/progress.
    @SerialName("progress")
    override val progress: List<Annotation>? = null,
    // Activity details defined in specific resource.
    @SerialName("reference")
    override val reference: Reference? = null,
    // In-line definition of activity.
    @SerialName("detail")
    override val detail: CarePlanActivityDetail? = null,


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
) : FhirCarePlanActivity {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CarePlanActivity"
    }
}


interface FhirCarePlanActivityDetail : FhirBackboneElement {

    // diet | drug | encounter | observation | procedure | supply | other.
    val category: CodeableConcept?

    // Protocol or definition.
    val definition: Reference?

    // Detail type of activity.
    val code: CodeableConcept?

    // Why activity should be done or why activity was prohibited.
    val reasonCode: List<CodeableConcept>?

    // Condition triggering need for activity.
    val reasonReference: List<Reference>?

    // Goals this activity relates to.
    val goal: List<Reference>?

    // Identifies what progress is being made for the specific activity.
    val status: CarePlanActivityStatus

    // Reason for current status.
    val statusReason: String?

    // Do NOT do.
    val prohibited: Bool?

    // When activity is to occur.
    val scheduledTiming: Timing?

    // When activity is to occur.
    val scheduledPeriod: Period?

    // When activity is to occur.
    val scheduledString: String?

    // Where it should happen.
    val location: Reference?

    // Who will be responsible?.
    val performer: List<Reference>?

    // What is to be administered/supplied.
    val productCodeableConcept: CodeableConcept?

    // What is to be administered/supplied.
    val productReference: Reference?

    // How to consume/day?.
    val dailyAmount: Quantity?

    // How much to administer/supply/consume.
    val quantity: Quantity?

    // Extra info describing activity to perform.
    val description: String?
}


/**
 * ClassName: CarePlanActivityDetail
 *
 * SourceFileName: CarePlan.kt
 *
 *
 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CarePlan">CarePlanActivityDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CarePlan)
 */
@Serializable
@SerialName("CarePlanActivityDetail")
data class CarePlanActivityDetail(

    // diet | drug | encounter | observation | procedure | supply | other.
    @SerialName("category")
    override val category: CodeableConcept? = null,
    // Protocol or definition.
    @SerialName("definition")
    override val definition: Reference? = null,
    // Detail type of activity.
    @SerialName("code")
    override val code: CodeableConcept? = null,
    // Why activity should be done or why activity was prohibited.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,
    // Condition triggering need for activity.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,
    // Goals this activity relates to.
    @SerialName("goal")
    override val goal: List<Reference>? = null,
    // Identifies what progress is being made for the specific activity.
    @SerialName("status")
    override val status: CarePlanActivityStatus,
    // Reason for current status.
    @SerialName("statusReason")
    override val statusReason: String? = null,
    // Do NOT do.
    @SerialName("prohibited")
    override val prohibited: Bool? = null,
    // When activity is to occur.
    @SerialName("scheduledTiming")
    override val scheduledTiming: Timing? = null,
    // When activity is to occur.
    @SerialName("scheduledPeriod")
    override val scheduledPeriod: Period? = null,
    // When activity is to occur.
    @SerialName("scheduledString")
    override val scheduledString: String? = null,
    // Where it should happen.
    @SerialName("location")
    override val location: Reference? = null,
    // Who will be responsible?.
    @SerialName("performer")
    override val performer: List<Reference>? = null,
    // What is to be administered/supplied.
    @SerialName("productCodeableConcept")
    override val productCodeableConcept: CodeableConcept? = null,
    // What is to be administered/supplied.
    @SerialName("productReference")
    override val productReference: Reference? = null,
    // How to consume/day?.
    @SerialName("dailyAmount")
    override val dailyAmount: Quantity? = null,
    // How much to administer/supply/consume.
    @SerialName("quantity")
    override val quantity: Quantity? = null,
    // Extra info describing activity to perform.
    @SerialName("description")
    override val description: String? = null,


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
) : FhirCarePlanActivityDetail {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CarePlanActivityDetail"
    }
}

