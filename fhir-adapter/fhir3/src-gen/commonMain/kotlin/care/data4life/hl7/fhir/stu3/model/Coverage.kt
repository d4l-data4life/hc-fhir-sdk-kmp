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

import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCoverage
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">Coverage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
interface FhirCoverage : FhirDomainResource {

    /**
     * The primary coverage ID.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Type of coverage such as medical or accident.
     */
    val type: CodeableConcept?

    /**
     * Owner of the policy.
     */
    val policyHolder: Reference?

    /**
     * Subscriber to the policy.
     */
    val subscriber: Reference?

    /**
     * ID assigned to the Subscriber.
     */
    val subscriberId: String?

    /**
     * Plan Beneficiary.
     */
    val beneficiary: Reference?

    /**
     * Beneficiary relationship to the Subscriber.
     */
    val relationship: CodeableConcept?

    /**
     * Coverage start and end dates.
     */
    val period: Period?

    /**
     * Identifier for the plan or agreement issuer.
     */
    val payor: kotlin.collections.List<Reference>?

    /**
     * Additional coverage classifications.
     */
    val grouping: CoverageGrouping?

    /**
     * Dependent number.
     */
    val dependent: String?

    /**
     * The plan instance or sequence counter.
     */
    val sequence: String?

    /**
     * Relative order of the coverage.
     */
    val order: PositiveInteger?

    /**
     * Insurer network.
     */
    val network: String?

    /**
     * Contract details.
     */
    val contract: kotlin.collections.List<Reference>?
}

/**
 * Coverage
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">Coverage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
@Serializable
@SerialName("Coverage")
data class Coverage(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("policyHolder")
    override val policyHolder: Reference? = null,

    @SerialName("subscriber")
    override val subscriber: Reference? = null,

    @SerialName("subscriberId")
    override val subscriberId: String? = null,

    @SerialName("beneficiary")
    override val beneficiary: Reference? = null,

    @SerialName("relationship")
    override val relationship: CodeableConcept? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("payor")
    override val payor: kotlin.collections.List<Reference>? = null,

    @SerialName("grouping")
    override val grouping: CoverageGrouping? = null,

    @SerialName("dependent")
    override val dependent: String? = null,

    @SerialName("sequence")
    override val sequence: String? = null,

    @SerialName("order")
    override val order: PositiveInteger? = null,

    @SerialName("network")
    override val network: String? = null,

    @SerialName("contract")
    override val contract: kotlin.collections.List<Reference>? = null,

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
) : FhirCoverage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Coverage"
    }
}

/**
 * FhirCoverageGrouping
 *
 * A suite of underwrite specific classifiers, for example may be used to identify a class of coverage
 * or employer group, Policy, Plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageGrouping</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
interface FhirCoverageGrouping : FhirBackboneElement {

    /**
     * An identifier for the group.
     */
    val group: String?

    /**
     * Display text for an identifier for the group.
     */
    val groupDisplay: String?

    /**
     * An identifier for the subsection of the group.
     */
    val subGroup: String?

    /**
     * Display text for the subsection of the group.
     */
    val subGroupDisplay: String?

    /**
     * An identifier for the plan.
     */
    val plan: String?

    /**
     * Display text for the plan.
     */
    val planDisplay: String?

    /**
     * An identifier for the subsection of the plan.
     */
    val subPlan: String?

    /**
     * Display text for the subsection of the plan.
     */
    val subPlanDisplay: String?

    /**
     * An identifier for the class.
     */
    val clazz: String?

    /**
     * Display text for the class.
     */
    val classDisplay: String?

    /**
     * An identifier for the subsection of the class.
     */
    val subClass: String?

    /**
     * Display text for the subsection of the subclass.
     */
    val subClassDisplay: String?
}

/**
 * CoverageGrouping
 *
 * A suite of underwrite specific classifiers, for example may be used to identify a class of coverage
 * or employer group, Policy, Plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageGrouping</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
@Serializable
@SerialName("CoverageGrouping")
data class CoverageGrouping(

    @SerialName("group")
    override val group: String? = null,

    @SerialName("groupDisplay")
    override val groupDisplay: String? = null,

    @SerialName("subGroup")
    override val subGroup: String? = null,

    @SerialName("subGroupDisplay")
    override val subGroupDisplay: String? = null,

    @SerialName("plan")
    override val plan: String? = null,

    @SerialName("planDisplay")
    override val planDisplay: String? = null,

    @SerialName("subPlan")
    override val subPlan: String? = null,

    @SerialName("subPlanDisplay")
    override val subPlanDisplay: String? = null,

    @SerialName("class")
    override val clazz: String? = null,

    @SerialName("classDisplay")
    override val classDisplay: String? = null,

    @SerialName("subClass")
    override val subClass: String? = null,

    @SerialName("subClassDisplay")
    override val subClassDisplay: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageGrouping {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CoverageGrouping"
    }
}
