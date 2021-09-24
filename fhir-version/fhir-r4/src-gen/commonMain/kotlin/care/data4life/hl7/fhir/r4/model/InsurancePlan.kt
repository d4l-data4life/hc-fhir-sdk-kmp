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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirInsurancePlan
 *
 * Details of a Health Insurance product/plan provided by an organization
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlan</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlan : FhirDomainResource {

    /**
     * Business Identifier for Product.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The current state of the health insurance product.
     */
    val status: PublicationStatus?

    /**
     * Kind of product.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Official name.
     */
    val name: String?

    /**
     * Alternate names.
     */
    val alias: kotlin.collections.List<String>?

    /**
     * When the product is available.
     */
    val period: Period?

    /**
     * Plan issuer.
     */
    val ownedBy: Reference?

    /**
     * Product administrator.
     */
    val administeredBy: Reference?

    /**
     * Where product applies.
     */
    val coverageArea: kotlin.collections.List<Reference>?

    /**
     * Contact for the product.
     */
    val contact: kotlin.collections.List<InsurancePlanContact>?

    /**
     * Technical endpoint.
     */
    val endpoint: kotlin.collections.List<Reference>?

    /**
     * What networks are Included.
     */
    val network: kotlin.collections.List<Reference>?

    /**
     * Coverage details.
     */
    val coverage: kotlin.collections.List<InsurancePlanCoverage>?

    /**
     * Plan details.
     */
    val plan: kotlin.collections.List<InsurancePlanPlan>?
}

/**
 * InsurancePlan
 *
 * Details of a Health Insurance product/plan provided by an organization
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlan</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlan")
data class InsurancePlan(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: PublicationStatus? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("alias")
    override val alias: kotlin.collections.List<String>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("ownedBy")
    override val ownedBy: Reference? = null,

    @SerialName("administeredBy")
    override val administeredBy: Reference? = null,

    @SerialName("coverageArea")
    override val coverageArea: kotlin.collections.List<Reference>? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<InsurancePlanContact>? = null,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

    @SerialName("network")
    override val network: kotlin.collections.List<Reference>? = null,

    @SerialName("coverage")
    override val coverage: kotlin.collections.List<InsurancePlanCoverage>? = null,

    @SerialName("plan")
    override val plan: kotlin.collections.List<InsurancePlanPlan>? = null,

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
) : FhirInsurancePlan {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlan"
    }
}

/**
 * FhirInsurancePlanContact
 *
 * The contact for the health insurance product for a certain purpose.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanContact</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanContact : FhirBackboneElement {

    /**
     * The type of contact.
     */
    val purpose: CodeableConcept?

    /**
     * A name associated with the contact.
     */
    val name: HumanName?

    /**
     * Contact details (telephone, email, etc.) for a contact.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Visiting or postal addresses for the contact.
     */
    val address: Address?
}

/**
 * InsurancePlanContact
 *
 * The contact for the health insurance product for a certain purpose.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanContact</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanContact")
data class InsurancePlanContact(

    @SerialName("purpose")
    override val purpose: CodeableConcept? = null,

    @SerialName("name")
    override val name: HumanName? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("address")
    override val address: Address? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanContact {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanContact"
    }
}

/**
 * FhirInsurancePlanCoverage
 *
 * Details about the coverage offered by the insurance product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanCoverage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanCoverage : FhirBackboneElement {

    /**
     * Type of coverage.
     */
    val type: CodeableConcept

    /**
     * What networks provide coverage.
     */
    val network: kotlin.collections.List<Reference>?

    /**
     * List of benefits.
     */
    val benefit: kotlin.collections.List<InsurancePlanCoverageBenefit>
}

/**
 * InsurancePlanCoverage
 *
 * Details about the coverage offered by the insurance product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanCoverage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanCoverage")
data class InsurancePlanCoverage(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("network")
    override val network: kotlin.collections.List<Reference>? = null,

    @SerialName("benefit")
    override val benefit: kotlin.collections.List<InsurancePlanCoverageBenefit>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanCoverage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanCoverage"
    }
}

/**
 * FhirInsurancePlanCoverageBenefit
 *
 * Specific benefits under this type of coverage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanCoverageBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanCoverageBenefit : FhirBackboneElement {

    /**
     * Type of benefit.
     */
    val type: CodeableConcept

    /**
     * Referral requirements.
     */
    val requirement: String?

    /**
     * Benefit limits.
     */
    val limit: kotlin.collections.List<InsurancePlanCoverageBenefitLimit>?
}

/**
 * InsurancePlanCoverageBenefit
 *
 * Specific benefits under this type of coverage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanCoverageBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanCoverageBenefit")
data class InsurancePlanCoverageBenefit(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("requirement")
    override val requirement: String? = null,

    @SerialName("limit")
    override val limit: kotlin.collections.List<InsurancePlanCoverageBenefitLimit>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanCoverageBenefit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanCoverageBenefit"
    }
}

/**
 * FhirInsurancePlanCoverageBenefitLimit
 *
 * The specific limits on the benefit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanCoverageBenefitLimit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanCoverageBenefitLimit : FhirBackboneElement {

    /**
     * Maximum value allowed.
     */
    val value: Quantity?

    /**
     * Benefit limit details.
     */
    val code: CodeableConcept?
}

/**
 * InsurancePlanCoverageBenefitLimit
 *
 * The specific limits on the benefit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanCoverageBenefitLimit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanCoverageBenefitLimit")
data class InsurancePlanCoverageBenefitLimit(

    @SerialName("value")
    override val value: Quantity? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanCoverageBenefitLimit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanCoverageBenefitLimit"
    }
}

/**
 * FhirInsurancePlanPlan
 *
 * Details about an insurance plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlan</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanPlan : FhirBackboneElement {

    /**
     * Business Identifier for Product.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Type of plan.
     */
    val type: CodeableConcept?

    /**
     * Where product applies.
     */
    val coverageArea: kotlin.collections.List<Reference>?

    /**
     * What networks provide coverage.
     */
    val network: kotlin.collections.List<Reference>?

    /**
     * Overall costs.
     */
    val generalCost: kotlin.collections.List<InsurancePlanPlanGeneralCost>?

    /**
     * Specific costs.
     */
    val specificCost: kotlin.collections.List<InsurancePlanPlanSpecificCost>?
}

/**
 * InsurancePlanPlan
 *
 * Details about an insurance plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlan</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanPlan")
data class InsurancePlanPlan(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("coverageArea")
    override val coverageArea: kotlin.collections.List<Reference>? = null,

    @SerialName("network")
    override val network: kotlin.collections.List<Reference>? = null,

    @SerialName("generalCost")
    override val generalCost: kotlin.collections.List<InsurancePlanPlanGeneralCost>? = null,

    @SerialName("specificCost")
    override val specificCost: kotlin.collections.List<InsurancePlanPlanSpecificCost>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanPlan {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanPlan"
    }
}

/**
 * FhirInsurancePlanPlanGeneralCost
 *
 * Overall costs associated with the plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanGeneralCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanPlanGeneralCost : FhirBackboneElement {

    /**
     * Type of cost.
     */
    val type: CodeableConcept?

    /**
     * Number of enrollees.
     */
    val groupSize: PositiveInteger?

    /**
     * Cost value.
     */
    val cost: Money?

    /**
     * Additional cost information.
     */
    val comment: String?
}

/**
 * InsurancePlanPlanGeneralCost
 *
 * Overall costs associated with the plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanGeneralCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanPlanGeneralCost")
data class InsurancePlanPlanGeneralCost(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("groupSize")
    override val groupSize: PositiveInteger? = null,

    @SerialName("cost")
    override val cost: Money? = null,

    @SerialName("comment")
    override val comment: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanPlanGeneralCost {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanPlanGeneralCost"
    }
}

/**
 * FhirInsurancePlanPlanSpecificCost
 *
 * Costs associated with the coverage provided by the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanSpecificCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanPlanSpecificCost : FhirBackboneElement {

    /**
     * General category of benefit.
     */
    val category: CodeableConcept

    /**
     * Benefits list.
     */
    val benefit: kotlin.collections.List<InsurancePlanPlanSpecificCostBenefit>?
}

/**
 * InsurancePlanPlanSpecificCost
 *
 * Costs associated with the coverage provided by the product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanSpecificCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanPlanSpecificCost")
data class InsurancePlanPlanSpecificCost(

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("benefit")
    override val benefit: kotlin.collections.List<InsurancePlanPlanSpecificCostBenefit>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanPlanSpecificCost {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanPlanSpecificCost"
    }
}

/**
 * FhirInsurancePlanPlanSpecificCostBenefit
 *
 * List of the specific benefits under this category of benefit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanSpecificCostBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanPlanSpecificCostBenefit : FhirBackboneElement {

    /**
     * Type of specific benefit.
     */
    val type: CodeableConcept

    /**
     * List of the costs.
     */
    val cost: kotlin.collections.List<InsurancePlanPlanSpecificCostBenefitCost>?
}

/**
 * InsurancePlanPlanSpecificCostBenefit
 *
 * List of the specific benefits under this category of benefit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanSpecificCostBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanPlanSpecificCostBenefit")
data class InsurancePlanPlanSpecificCostBenefit(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("cost")
    override val cost: kotlin.collections.List<InsurancePlanPlanSpecificCostBenefitCost>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanPlanSpecificCostBenefit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanPlanSpecificCostBenefit"
    }
}

/**
 * FhirInsurancePlanPlanSpecificCostBenefitCost
 *
 * List of the costs associated with a specific benefit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanSpecificCostBenefitCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
interface FhirInsurancePlanPlanSpecificCostBenefitCost : FhirBackboneElement {

    /**
     * Type of cost.
     */
    val type: CodeableConcept

    /**
     * in-network | out-of-network | other.
     */
    val applicability: CodeableConcept?

    /**
     * Additional information about the cost.
     */
    val qualifiers: kotlin.collections.List<CodeableConcept>?

    /**
     * The actual cost value.
     */
    val value: Quantity?
}

/**
 * InsurancePlanPlanSpecificCostBenefitCost
 *
 * List of the costs associated with a specific benefit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/InsurancePlan">InsurancePlanPlanSpecificCostBenefitCost</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/InsurancePlan)
 */
@Serializable
@SerialName("InsurancePlanPlanSpecificCostBenefitCost")
data class InsurancePlanPlanSpecificCostBenefitCost(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("applicability")
    override val applicability: CodeableConcept? = null,

    @SerialName("qualifiers")
    override val qualifiers: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("value")
    override val value: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirInsurancePlanPlanSpecificCostBenefitCost {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "InsurancePlanPlanSpecificCostBenefitCost"
    }
}
