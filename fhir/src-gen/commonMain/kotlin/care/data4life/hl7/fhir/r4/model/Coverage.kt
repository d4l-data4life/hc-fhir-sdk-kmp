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

import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirCoverage
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * Includes both insurance and self-payment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">Coverage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
interface FhirCoverage : FhirDomainResource {

    /**
     * Business Identifier for the coverage.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * Coverage category such as medical or accident.
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
     * ID assigned to the subscriber.
     */
    val subscriberId: String?

    /**
     * Plan beneficiary.
     */
    val beneficiary: Reference

    /**
     * Dependent number.
     */
    val dependent: String?

    /**
     * Beneficiary relationship to the subscriber.
     */
    val relationship: CodeableConcept?

    /**
     * Coverage start and end dates.
     */
    val period: Period?

    /**
     * Issuer of the policy.
     */
    val payor: kotlin.collections.List<Reference>

    /**
     * Additional coverage classifications.
     */
    val clazz: kotlin.collections.List<CoverageClass>?

    /**
     * Relative order of the coverage.
     */
    val order: PositiveInteger?

    /**
     * Insurer network.
     */
    val network: String?

    /**
     * Patient payments for services/products.
     */
    val costToBeneficiary: kotlin.collections.List<CoverageCostToBeneficiary>?

    /**
     * Reimbursement to insurer.
     */
    val subrogation: Bool?

    /**
     * Contract details.
     */
    val contract: kotlin.collections.List<Reference>?
}

/**
 * Coverage
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * Includes both insurance and self-payment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">Coverage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
@Serializable
@SerialName("Coverage")
data class Coverage(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("policyHolder")
    override val policyHolder: Reference? = null,

    @SerialName("subscriber")
    override val subscriber: Reference? = null,

    @SerialName("subscriberId")
    override val subscriberId: String? = null,

    @SerialName("beneficiary")
    override val beneficiary: Reference,

    @SerialName("dependent")
    override val dependent: String? = null,

    @SerialName("relationship")
    override val relationship: CodeableConcept? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("payor")
    override val payor: kotlin.collections.List<Reference>,

    @SerialName("class")
    override val clazz: kotlin.collections.List<CoverageClass>? = null,

    @SerialName("order")
    override val order: PositiveInteger? = null,

    @SerialName("network")
    override val network: String? = null,

    @SerialName("costToBeneficiary")
    override val costToBeneficiary: kotlin.collections.List<CoverageCostToBeneficiary>? = null,

    @SerialName("subrogation")
    override val subrogation: Bool? = null,

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

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Coverage"
    }
}

/**
 * FhirCoverageClass
 *
 * A suite of underwriter specific classifiers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageClass</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
interface FhirCoverageClass : FhirBackboneElement {

    /**
     * Type of class such as 'group' or 'plan'.
     */
    val type: CodeableConcept

    /**
     * Value associated with the type.
     */
    val value: String

    /**
     * Human readable description of the type and value.
     */
    val name: String?
}

/**
 * CoverageClass
 *
 * A suite of underwriter specific classifiers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageClass</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
@Serializable
@SerialName("CoverageClass")
data class CoverageClass(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("value")
    override val value: String,

    @SerialName("name")
    override val name: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageClass {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageClass"
    }
}

/**
 * FhirCoverageCostToBeneficiary
 *
 * A suite of codes indicating the cost category and associated amount which have been detailed in the
 * policy and may have been included on the health card.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageCostToBeneficiary</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
interface FhirCoverageCostToBeneficiary : FhirBackboneElement {

    /**
     * Cost category.
     */
    val type: CodeableConcept?

    /**
     * The amount or percentage due from the beneficiary.
     */
    val valueQuantity: Quantity?

    /**
     * The amount or percentage due from the beneficiary.
     */
    val valueMoney: Money?

    /**
     * Exceptions for patient payments.
     */
    val exception: kotlin.collections.List<CoverageCostToBeneficiaryException>?
}

/**
 * CoverageCostToBeneficiary
 *
 * A suite of codes indicating the cost category and associated amount which have been detailed in the
 * policy and may have been included on the health card.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageCostToBeneficiary</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
@Serializable
@SerialName("CoverageCostToBeneficiary")
data class CoverageCostToBeneficiary(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueMoney")
    override val valueMoney: Money? = null,

    @SerialName("exception")
    override val exception: kotlin.collections.List<CoverageCostToBeneficiaryException>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageCostToBeneficiary {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageCostToBeneficiary"
    }
}

/**
 * FhirCoverageCostToBeneficiaryException
 *
 * A suite of codes indicating exceptions or reductions to patient costs and their effective periods.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageCostToBeneficiaryException</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
interface FhirCoverageCostToBeneficiaryException : FhirBackboneElement {

    /**
     * Exception category.
     */
    val type: CodeableConcept

    /**
     * The effective period of the exception.
     */
    val period: Period?
}

/**
 * CoverageCostToBeneficiaryException
 *
 * A suite of codes indicating exceptions or reductions to patient costs and their effective periods.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coverage">CoverageCostToBeneficiaryException</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Coverage)
 */
@Serializable
@SerialName("CoverageCostToBeneficiaryException")
data class CoverageCostToBeneficiaryException(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageCostToBeneficiaryException {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageCostToBeneficiaryException"
    }
}
