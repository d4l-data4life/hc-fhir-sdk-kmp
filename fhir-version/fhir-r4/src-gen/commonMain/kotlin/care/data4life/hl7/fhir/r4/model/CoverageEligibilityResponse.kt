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

import care.data4life.hl7.fhir.r4.codesystem.ClaimProcessingCodes
import care.data4life.hl7.fhir.r4.codesystem.EligibilityResponsePurpose
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCoverageEligibilityResponse
 *
 * This resource provides eligibility and plan details from the processing of an
 * CoverageEligibilityRequest resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponse</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
interface FhirCoverageEligibilityResponse : FhirDomainResource {

    /**
     * Business Identifier for coverage eligiblity request.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * Code to specify whether requesting: prior authorization requirements for some
     * service categories or billing codes; benefits for coverages specified or
     * discovered; discovery and return of coverages for the patient; and/or validation
     * that the specified coverage is in-force at the date/period specified or 'now' if
     * not specified.
     */
    val purpose: kotlin.collections.List<EligibilityResponsePurpose>

    /**
     * Intended recipient of products and services.
     */
    val patient: Reference

    /**
     * Estimated date or dates of service.
     */
    val servicedDate: Date?

    /**
     * Estimated date or dates of service.
     */
    val servicedPeriod: Period?

    /**
     * Response creation date.
     */
    val created: DateTime

    /**
     * Party responsible for the request.
     */
    val requestor: Reference?

    /**
     * Eligibility request reference.
     */
    val request: Reference

    /**
     * The outcome of the request processing.
     */
    val outcome: ClaimProcessingCodes

    /**
     * Disposition Message.
     */
    val disposition: String?

    /**
     * Coverage issuer.
     */
    val insurer: Reference

    /**
     * Patient insurance information.
     */
    val insurance: kotlin.collections.List<CoverageEligibilityResponseInsurance>?

    /**
     * Preauthorization reference.
     */
    val preAuthRef: String?

    /**
     * Printed form identifier.
     */
    val form: CodeableConcept?

    /**
     * Processing errors.
     */
    val error: kotlin.collections.List<CoverageEligibilityResponseError>?
}

/**
 * CoverageEligibilityResponse
 *
 * This resource provides eligibility and plan details from the processing of an
 * CoverageEligibilityRequest resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponse</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
@Serializable
@SerialName("CoverageEligibilityResponse")
data class CoverageEligibilityResponse(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("purpose")
    override val purpose: kotlin.collections.List<EligibilityResponsePurpose>,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("servicedDate")
    override val servicedDate: Date? = null,

    @SerialName("servicedPeriod")
    override val servicedPeriod: Period? = null,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("requestor")
    override val requestor: Reference? = null,

    @SerialName("request")
    override val request: Reference,

    @SerialName("outcome")
    override val outcome: ClaimProcessingCodes,

    @SerialName("disposition")
    override val disposition: String? = null,

    @SerialName("insurer")
    override val insurer: Reference,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<CoverageEligibilityResponseInsurance>? = null,

    @SerialName("preAuthRef")
    override val preAuthRef: String? = null,

    @SerialName("form")
    override val form: CodeableConcept? = null,

    @SerialName("error")
    override val error: kotlin.collections.List<CoverageEligibilityResponseError>? = null,

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
) : FhirCoverageEligibilityResponse {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityResponse"
    }
}

/**
 * FhirCoverageEligibilityResponseError
 *
 * Errors encountered during the processing of the request.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseError</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
interface FhirCoverageEligibilityResponseError : FhirBackboneElement {

    /**
     * Error code detailing processing issues.
     */
    val code: CodeableConcept
}

/**
 * CoverageEligibilityResponseError
 *
 * Errors encountered during the processing of the request.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseError</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
@Serializable
@SerialName("CoverageEligibilityResponseError")
data class CoverageEligibilityResponseError(

    @SerialName("code")
    override val code: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityResponseError {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityResponseError"
    }
}

/**
 * FhirCoverageEligibilityResponseInsurance
 *
 * Financial instruments for reimbursement for the health care products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
interface FhirCoverageEligibilityResponseInsurance : FhirBackboneElement {

    /**
     * Insurance information.
     */
    val coverage: Reference

    /**
     * Coverage inforce indicator.
     */
    val inforce: Bool?

    /**
     * When the benefits are applicable.
     */
    val benefitPeriod: Period?

    /**
     * Benefits and authorization details.
     */
    val item: kotlin.collections.List<CoverageEligibilityResponseInsuranceItem>?
}

/**
 * CoverageEligibilityResponseInsurance
 *
 * Financial instruments for reimbursement for the health care products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
@Serializable
@SerialName("CoverageEligibilityResponseInsurance")
data class CoverageEligibilityResponseInsurance(

    @SerialName("coverage")
    override val coverage: Reference,

    @SerialName("inforce")
    override val inforce: Bool? = null,

    @SerialName("benefitPeriod")
    override val benefitPeriod: Period? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<CoverageEligibilityResponseInsuranceItem>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityResponseInsurance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityResponseInsurance"
    }
}

/**
 * FhirCoverageEligibilityResponseInsuranceItem
 *
 * Benefits and optionally current balances, and authorization details by category or service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseInsuranceItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
interface FhirCoverageEligibilityResponseInsuranceItem : FhirBackboneElement {

    /**
     * Benefit classification.
     */
    val category: CodeableConcept?

    /**
     * Billing, service, product, or drug code.
     */
    val productOrService: CodeableConcept?

    /**
     * Product or service billing modifiers.
     */
    val modifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Performing practitioner.
     */
    val provider: Reference?

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
    val benefit: kotlin.collections.List<CoverageEligibilityResponseInsuranceItemBenefit>?

    /**
     * Authorization required flag.
     */
    val authorizationRequired: Bool?

    /**
     * Type of required supporting materials.
     */
    val authorizationSupporting: kotlin.collections.List<CodeableConcept>?

    /**
     * Preauthorization requirements endpoint.
     */
    val authorizationUrl: String?
}

/**
 * CoverageEligibilityResponseInsuranceItem
 *
 * Benefits and optionally current balances, and authorization details by category or service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseInsuranceItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
@Serializable
@SerialName("CoverageEligibilityResponseInsuranceItem")
data class CoverageEligibilityResponseInsuranceItem(

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("productOrService")
    override val productOrService: CodeableConcept? = null,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

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

    @SerialName("benefit")
    override val benefit: kotlin.collections.List<CoverageEligibilityResponseInsuranceItemBenefit>? = null,

    @SerialName("authorizationRequired")
    override val authorizationRequired: Bool? = null,

    @SerialName("authorizationSupporting")
    override val authorizationSupporting: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("authorizationUrl")
    override val authorizationUrl: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityResponseInsuranceItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityResponseInsuranceItem"
    }
}

/**
 * FhirCoverageEligibilityResponseInsuranceItemBenefit
 *
 * Benefits used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseInsuranceItemBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
interface FhirCoverageEligibilityResponseInsuranceItemBenefit : FhirBackboneElement {

    /**
     * Benefit classification.
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
    val usedString: String?

    /**
     * Benefits used.
     */
    val usedMoney: Money?
}

/**
 * CoverageEligibilityResponseInsuranceItemBenefit
 *
 * Benefits used to date.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse">CoverageEligibilityResponseInsuranceItemBenefit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityResponse)
 */
@Serializable
@SerialName("CoverageEligibilityResponseInsuranceItemBenefit")
data class CoverageEligibilityResponseInsuranceItemBenefit(

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

    @SerialName("usedString")
    override val usedString: String? = null,

    @SerialName("usedMoney")
    override val usedMoney: Money? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityResponseInsuranceItemBenefit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityResponseInsuranceItemBenefit"
    }
}
