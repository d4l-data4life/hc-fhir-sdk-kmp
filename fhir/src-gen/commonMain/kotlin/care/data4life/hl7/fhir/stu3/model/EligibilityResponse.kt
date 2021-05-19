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

import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirEligibilityResponse
 *
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
interface FhirEligibilityResponse : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Responsible practitioner.
     */
    val requestProvider: Reference?

    /**
     * Responsible organization.
     */
    val requestOrganization: Reference?

    /**
     * Eligibility reference.
     */
    val request: Reference?

    /**
     * complete | error | partial.
     */
    val outcome: CodeableConcept?

    /**
     * Disposition Message.
     */
    val disposition: String?

    /**
     * Insurer issuing the coverage.
     */
    val insurer: Reference?

    /**
     * Coverage inforce indicator.
     */
    val inforce: Bool?

    /**
     * Details by insurance coverage.
     */
    val insurance: List<EligibilityResponseInsurance>?

    /**
     * Printed Form Identifier.
     */
    val form: CodeableConcept?

    /**
     * Processing errors.
     */
    val error: List<EligibilityResponseError>?
}

/**
 * EligibilityResponse
 *
 * SourceFileName: EligibilityResponse.kt
 *
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
@Serializable
@SerialName("EligibilityResponse")
data class EligibilityResponse(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("requestProvider")
    override val requestProvider: Reference? = null,

    @SerialName("requestOrganization")
    override val requestOrganization: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("insurer")
    override val insurer: Reference? = null,

    @SerialName("inforce")
    override val inforce: Bool? = null,

    @SerialName("insurance")
    override val insurance: List<EligibilityResponseInsurance>? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("error")
    override val error: List<EligibilityResponseError>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirEligibilityResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EligibilityResponse"
    }
}

/**
 * FhirEligibilityResponseError
 *
 * Mutually exclusive with Services Provided (Item).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseError</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
interface FhirEligibilityResponseError : FhirBackboneElement {

    /**
     * Error code detailing processing issues.
     */
    val code: CodeableConcept
}

/**
 * EligibilityResponseError
 *
 * SourceFileName: EligibilityResponse.kt
 *
 * Mutually exclusive with Services Provided (Item).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseError</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
@Serializable
@SerialName("EligibilityResponseError")
data class EligibilityResponseError(

    @SerialName("code")
    override val code: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEligibilityResponseError {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EligibilityResponseError"
    }
}

/**
 * FhirEligibilityResponseInsurance
 *
 * The insurer may provide both the details for the requested coverage as well as details for
 * additional coverages known to the insurer.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
interface FhirEligibilityResponseInsurance : FhirBackboneElement {

    /**
     * Updated Coverage details.
     */
    val coverage: Reference?

    /**
     * Contract details.
     */
    val contract: Reference?

    /**
     * Benefits by Category.
     */
    val benefitBalance: List<EligibilityResponseInsuranceBenefitBalance>?
}

/**
 * EligibilityResponseInsurance
 *
 * SourceFileName: EligibilityResponse.kt
 *
 * The insurer may provide both the details for the requested coverage as well as details for
 * additional coverages known to the insurer.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseInsurance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
@Serializable
@SerialName("EligibilityResponseInsurance")
data class EligibilityResponseInsurance(

    @SerialName("coverage")
    override val coverage: Reference? = null,

    @SerialName("contract")
    override val contract: Reference? = null,

    @SerialName("benefitBalance")
    override val benefitBalance: List<EligibilityResponseInsuranceBenefitBalance>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEligibilityResponseInsurance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EligibilityResponseInsurance"
    }
}

/**
 * FhirEligibilityResponseInsuranceBenefitBalance
 *
 * Benefits and optionally current balances by Category.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseInsuranceBenefitBalance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
interface FhirEligibilityResponseInsuranceBenefitBalance : FhirBackboneElement {

    /**
     * Type of services covered.
     */
    val category: CodeableConcept

    /**
     * Detailed services covered within the type.
     */
    val subCategory: CodeableConcept?

    /**
     * Excluded from the plan.
     */
    val excluded: Bool?

    /**
     * Short name for the benefit.
     */
    val name: String?

    /**
     * Description of the benefit or services covered.
     */
    val description: String?

    /**
     * In or out of network.
     */
    val network: CodeableConcept?

    /**
     * Individual or family.
     */
    val unit: CodeableConcept?

    /**
     * Annual or lifetime.
     */
    val term: CodeableConcept?

    /**
     * Benefit Summary.
     */
    val financial: List<EligibilityResponseInsuranceBenefitBalanceFinancial>?
}

/**
 * EligibilityResponseInsuranceBenefitBalance
 *
 * SourceFileName: EligibilityResponse.kt
 *
 * Benefits and optionally current balances by Category.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseInsuranceBenefitBalance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
@Serializable
@SerialName("EligibilityResponseInsuranceBenefitBalance")
data class EligibilityResponseInsuranceBenefitBalance(

    @SerialName("category")
    override val category: CodeableConcept,

    @SerialName("subCategory")
    override val subCategory: CodeableConcept? = null,

    @SerialName("excluded")
    override val excluded: Bool? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("network")
    override val network: CodeableConcept? = null,

    @SerialName("unit")
    override val unit: CodeableConcept? = null,

    @SerialName("term")
    override val term: CodeableConcept? = null,

    @SerialName("financial")
    override val financial: List<EligibilityResponseInsuranceBenefitBalanceFinancial>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEligibilityResponseInsuranceBenefitBalance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EligibilityResponseInsuranceBenefitBalance"
    }
}

/**
 * FhirEligibilityResponseInsuranceBenefitBalanceFinancial
 *
 * Benefits Used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseInsuranceBenefitBalanceFinancial</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
interface FhirEligibilityResponseInsuranceBenefitBalanceFinancial : FhirBackboneElement {

    /**
     * Deductable, visits, benefit amount.
     */
    val type: CodeableConcept

    /**
     * Benefits allowed.
     */
    val allowedUnsignedInt: UnsignedInteger?

    /**
     * Benefits allowed.
     */
    val allowedString: String?

    /**
     * Benefits allowed.
     */
    val allowedMoney: Money?

    /**
     * Benefits used.
     */
    val usedUnsignedInt: UnsignedInteger?

    /**
     * Benefits used.
     */
    val usedMoney: Money?
}

/**
 * EligibilityResponseInsuranceBenefitBalanceFinancial
 *
 * SourceFileName: EligibilityResponse.kt
 *
 * Benefits Used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EligibilityResponse">EligibilityResponseInsuranceBenefitBalanceFinancial</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/EligibilityResponse)
 */
@Serializable
@SerialName("EligibilityResponseInsuranceBenefitBalanceFinancial")
data class EligibilityResponseInsuranceBenefitBalanceFinancial(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("allowedUnsignedInt")
    override val allowedUnsignedInt: UnsignedInteger? = null,

    @SerialName("allowedString")
    override val allowedString: String? = null,

    @SerialName("allowedMoney")
    override val allowedMoney: Money? = null,

    @SerialName("usedUnsignedInt")
    override val usedUnsignedInt: UnsignedInteger? = null,

    @SerialName("usedMoney")
    override val usedMoney: Money? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirEligibilityResponseInsuranceBenefitBalanceFinancial {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "EligibilityResponseInsuranceBenefitBalanceFinancial"
    }
}
