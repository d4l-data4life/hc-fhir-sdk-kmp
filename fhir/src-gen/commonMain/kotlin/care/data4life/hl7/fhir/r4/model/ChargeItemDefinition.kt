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

import care.data4life.hl7.fhir.r4.codesystem.InvoicePriceComponentType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirChargeItemDefinition
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
 * necessary to calculate costs and prices. The properties may differ largely depending on type and
 * realm, therefore this resource gives only a rough structure and requires profiling for each type of
 * billing code system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
interface FhirChargeItemDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this charge item definition, represented as a URI
     * (globally unique).
     */
    val url: String

    /**
     * Additional identifier for the charge item definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the charge item definition.
     */
    val version: String?

    /**
     * Name for this charge item definition (human friendly).
     */
    val title: String?

    /**
     * Underlying externally-defined charge item definition.
     */
    val derivedFromUri: kotlin.collections.List<String>?

    /**
     * A larger definition of which this particular definition is a component or step.
     */
    val partOf: kotlin.collections.List<String>?

    /**
     * Completed or terminated request(s) whose function is taken by this new request.
     */
    val replaces: kotlin.collections.List<String>?

    /**
     * The current state of the ChargeItemDefinition.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the charge item definition.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for charge item definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the charge item definition was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the charge item definition was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the charge item definition is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * Billing codes or product types this definition applies to.
     */
    val code: CodeableConcept?

    /**
     * Instances this definition applies to.
     */
    val instance: kotlin.collections.List<Reference>?

    /**
     * Whether or not the billing code is applicable.
     */
    val applicability: kotlin.collections.List<ChargeItemDefinitionApplicability>?

    /**
     * Group of properties which are applicable under the same conditions.
     */
    val propertyGroup: kotlin.collections.List<ChargeItemDefinitionPropertyGroup>?
}

/**
 * ChargeItemDefinition
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
 * necessary to calculate costs and prices. The properties may differ largely depending on type and
 * realm, therefore this resource gives only a rough structure and requires profiling for each type of
 * billing code system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
@Serializable
@SerialName("ChargeItemDefinition")
data class ChargeItemDefinition(

    @SerialName("url")
    override val url: String,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("derivedFromUri")
    override val derivedFromUri: kotlin.collections.List<String>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<String>? = null,

    @SerialName("replaces")
    override val replaces: kotlin.collections.List<String>? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("approvalDate")
    override val approvalDate: Date? = null,

    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("instance")
    override val instance: kotlin.collections.List<Reference>? = null,

    @SerialName("applicability")
    override val applicability: kotlin.collections.List<ChargeItemDefinitionApplicability>? = null,

    @SerialName("propertyGroup")
    override val propertyGroup: kotlin.collections.List<ChargeItemDefinitionPropertyGroup>? = null,

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
) : FhirChargeItemDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ChargeItemDefinition"
    }
}

/**
 * FhirChargeItemDefinitionApplicability
 *
 * Expressions that describe applicability criteria for the billing code.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinitionApplicability</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
interface FhirChargeItemDefinitionApplicability : FhirBackboneElement {

    /**
     * Natural language description of the condition.
     */
    val description: String?

    /**
     * Language of the expression.
     */
    val language: String?

    /**
     * Boolean-valued expression.
     */
    val expression: String?
}

/**
 * ChargeItemDefinitionApplicability
 *
 * Expressions that describe applicability criteria for the billing code.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinitionApplicability</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
@Serializable
@SerialName("ChargeItemDefinitionApplicability")
data class ChargeItemDefinitionApplicability(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("language")
    override val language: String? = null,

    @SerialName("expression")
    override val expression: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirChargeItemDefinitionApplicability {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ChargeItemDefinitionApplicability"
    }
}

/**
 * FhirChargeItemDefinitionPropertyGroup
 *
 * Group of properties which are applicable under the same conditions. If no applicability rules are
 * established for the group, then all properties always apply.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinitionPropertyGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
interface FhirChargeItemDefinitionPropertyGroup : FhirBackboneElement {

    /**
     * Conditions under which the priceComponent is applicable.
     */
    val applicability: kotlin.collections.List<ChargeItemDefinitionApplicability>?

    /**
     * Components of total line item price.
     */
    val priceComponent: kotlin.collections.List<ChargeItemDefinitionPropertyGroupPriceComponent>?
}

/**
 * ChargeItemDefinitionPropertyGroup
 *
 * Group of properties which are applicable under the same conditions. If no applicability rules are
 * established for the group, then all properties always apply.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinitionPropertyGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
@Serializable
@SerialName("ChargeItemDefinitionPropertyGroup")
data class ChargeItemDefinitionPropertyGroup(

    @SerialName("applicability")
    override val applicability: kotlin.collections.List<ChargeItemDefinitionApplicability>? = null,

    @SerialName("priceComponent")
    override val priceComponent: kotlin.collections.List<ChargeItemDefinitionPropertyGroupPriceComponent>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirChargeItemDefinitionPropertyGroup {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ChargeItemDefinitionPropertyGroup"
    }
}

/**
 * FhirChargeItemDefinitionPropertyGroupPriceComponent
 *
 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply
 * in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and
 * conditions that apply to a billing code is currently under development. The priceComponent element
 * can be used to offer transparency to the recipient of the Invoice of how the prices have been
 * calculated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinitionPropertyGroupPriceComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
interface FhirChargeItemDefinitionPropertyGroupPriceComponent : FhirBackboneElement {

    /**
     * This code identifies the type of the component.
     */
    val type: InvoicePriceComponentType

    /**
     * Code identifying the specific component.
     */
    val code: CodeableConcept?

    /**
     * Factor used for calculating this component.
     */
    val factor: Decimal?

    /**
     * Monetary amount associated with this component.
     */
    val amount: Money?
}

/**
 * ChargeItemDefinitionPropertyGroupPriceComponent
 *
 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply
 * in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and
 * conditions that apply to a billing code is currently under development. The priceComponent element
 * can be used to offer transparency to the recipient of the Invoice of how the prices have been
 * calculated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition">ChargeItemDefinitionPropertyGroupPriceComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ChargeItemDefinition)
 */
@Serializable
@SerialName("ChargeItemDefinitionPropertyGroupPriceComponent")
data class ChargeItemDefinitionPropertyGroupPriceComponent(

    @SerialName("type")
    override val type: InvoicePriceComponentType,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("amount")
    override val amount: Money? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirChargeItemDefinitionPropertyGroupPriceComponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ChargeItemDefinitionPropertyGroupPriceComponent"
    }
}
