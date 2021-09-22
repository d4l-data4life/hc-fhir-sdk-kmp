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

import care.data4life.hl7.fhir.r4.codesystem.EligibilityRequestPurpose
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCoverageEligibilityRequest
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for
 * them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether
 * the stated coverage is valid and in-force and optionally to provide the insurance details of the
 * policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
interface FhirCoverageEligibilityRequest : FhirDomainResource {

    /**
     * Business Identifier for coverage eligiblity request.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status of the resource instance.
     */
    val status: FinancialResourceStatusCodes

    /**
     * Desired processing priority.
     */
    val priority: CodeableConcept?

    /**
     * Code to specify whether requesting: prior authorization requirements for some
     * service categories or billing codes; benefits for coverages specified or
     * discovered; discovery and return of coverages for the patient; and/or validation
     * that the specified coverage is in-force at the date/period specified or 'now' if
     * not specified.
     */
    val purpose: kotlin.collections.List<EligibilityRequestPurpose>

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
     * Creation date.
     */
    val created: DateTime

    /**
     * Author.
     */
    val enterer: Reference?

    /**
     * Party responsible for the request.
     */
    val provider: Reference?

    /**
     * Coverage issuer.
     */
    val insurer: Reference

    /**
     * Servicing facility.
     */
    val facility: Reference?

    /**
     * Supporting information.
     */
    val supportingInfo: kotlin.collections.List<CoverageEligibilityRequestSupportingInfo>?

    /**
     * Patient insurance information.
     */
    val insurance: kotlin.collections.List<CoverageEligibilityRequestInsurance>?

    /**
     * Item to be evaluated for eligibiity.
     */
    val item: kotlin.collections.List<CoverageEligibilityRequestItem>?
}

/**
 * CoverageEligibilityRequest
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for
 * them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether
 * the stated coverage is valid and in-force and optionally to provide the insurance details of the
 * policy.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
@Serializable
@SerialName("CoverageEligibilityRequest")
data class CoverageEligibilityRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FinancialResourceStatusCodes,

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    @SerialName("purpose")
    override val purpose: kotlin.collections.List<EligibilityRequestPurpose>,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("servicedDate")
    override val servicedDate: Date? = null,

    @SerialName("servicedPeriod")
    override val servicedPeriod: Period? = null,

    @SerialName("created")
    override val created: DateTime,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("insurer")
    override val insurer: Reference,

    @SerialName("facility")
    override val facility: Reference? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<CoverageEligibilityRequestSupportingInfo>? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<CoverageEligibilityRequestInsurance>? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<CoverageEligibilityRequestItem>? = null,

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
) : FhirCoverageEligibilityRequest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityRequest"
    }
}

/**
 * FhirCoverageEligibilityRequestInsurance
 *
 * Financial instruments for reimbursement for the health care products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
interface FhirCoverageEligibilityRequestInsurance : FhirBackboneElement {

    /**
     * Applicable coverage.
     */
    val focal: Bool?

    /**
     * Insurance information.
     */
    val coverage: Reference

    /**
     * Additional provider contract number.
     */
    val businessArrangement: String?
}

/**
 * CoverageEligibilityRequestInsurance
 *
 * Financial instruments for reimbursement for the health care products and services.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestInsurance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
@Serializable
@SerialName("CoverageEligibilityRequestInsurance")
data class CoverageEligibilityRequestInsurance(

    @SerialName("focal")
    override val focal: Bool? = null,

    @SerialName("coverage")
    override val coverage: Reference,

    @SerialName("businessArrangement")
    override val businessArrangement: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityRequestInsurance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityRequestInsurance"
    }
}

/**
 * FhirCoverageEligibilityRequestItem
 *
 * Service categories or billable services for which benefit details and/or an authorization prior to
 * service delivery may be required by the payor.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
interface FhirCoverageEligibilityRequestItem : FhirBackboneElement {

    /**
     * Applicable exception or supporting information.
     */
    val supportingInfoSequence: kotlin.collections.List<PositiveInteger>?

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
     * Perfoming practitioner.
     */
    val provider: Reference?

    /**
     * Count of products or services.
     */
    val quantity: Quantity?

    /**
     * Fee, charge or cost per item.
     */
    val unitPrice: Money?

    /**
     * Servicing facility.
     */
    val facility: Reference?

    /**
     * Applicable diagnosis.
     */
    val diagnosis: kotlin.collections.List<CoverageEligibilityRequestItemDiagnosis>?

    /**
     * Product or service details.
     */
    val detail: kotlin.collections.List<Reference>?
}

/**
 * CoverageEligibilityRequestItem
 *
 * Service categories or billable services for which benefit details and/or an authorization prior to
 * service delivery may be required by the payor.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
@Serializable
@SerialName("CoverageEligibilityRequestItem")
data class CoverageEligibilityRequestItem(

    @SerialName("supportingInfoSequence")
    override val supportingInfoSequence: kotlin.collections.List<PositiveInteger>? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("productOrService")
    override val productOrService: CodeableConcept? = null,

    @SerialName("modifier")
    override val modifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("facility")
    override val facility: Reference? = null,

    @SerialName("diagnosis")
    override val diagnosis: kotlin.collections.List<CoverageEligibilityRequestItemDiagnosis>? = null,

    @SerialName("detail")
    override val detail: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityRequestItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityRequestItem"
    }
}

/**
 * FhirCoverageEligibilityRequestItemDiagnosis
 *
 * Patient diagnosis for which care is sought.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestItemDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
interface FhirCoverageEligibilityRequestItemDiagnosis : FhirBackboneElement {

    /**
     * Nature of illness or problem.
     */
    val diagnosisCodeableConcept: CodeableConcept?

    /**
     * Nature of illness or problem.
     */
    val diagnosisReference: Reference?
}

/**
 * CoverageEligibilityRequestItemDiagnosis
 *
 * Patient diagnosis for which care is sought.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestItemDiagnosis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
@Serializable
@SerialName("CoverageEligibilityRequestItemDiagnosis")
data class CoverageEligibilityRequestItemDiagnosis(

    @SerialName("diagnosisCodeableConcept")
    override val diagnosisCodeableConcept: CodeableConcept? = null,

    @SerialName("diagnosisReference")
    override val diagnosisReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityRequestItemDiagnosis {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityRequestItemDiagnosis"
    }
}

/**
 * FhirCoverageEligibilityRequestSupportingInfo
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestSupportingInfo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
interface FhirCoverageEligibilityRequestSupportingInfo : FhirBackboneElement {

    /**
     * Information instance identifier.
     */
    val sequence: PositiveInteger

    /**
     * Data to be provided.
     */
    val information: Reference

    /**
     * Applies to all items.
     */
    val appliesToAll: Bool?
}

/**
 * CoverageEligibilityRequestSupportingInfo
 *
 * Additional information codes regarding exceptions, special considerations, the condition, situation,
 * prior or concurrent issues.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest">CoverageEligibilityRequestSupportingInfo</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest)
 */
@Serializable
@SerialName("CoverageEligibilityRequestSupportingInfo")
data class CoverageEligibilityRequestSupportingInfo(

    @SerialName("sequence")
    override val sequence: PositiveInteger,

    @SerialName("information")
    override val information: Reference,

    @SerialName("appliesToAll")
    override val appliesToAll: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCoverageEligibilityRequestSupportingInfo {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CoverageEligibilityRequestSupportingInfo"
    }
}
