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

import care.data4life.hl7.fhir.stu3.codesystem.ChargeItemStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirChargeItem
 *
 * The resource ChargeItem describes the provision of healthcare provider products for a certain
 * patient, therefore referring not only to the product, but containing in addition details of the
 * provision, like date, time, amounts and participating organizations and persons. Main Usage of the
 * ChargeItem is to enable the billing process and internal cost allocation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItem">ChargeItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ChargeItem)
 */
interface FhirChargeItem : FhirDomainResource {

    /**
     * Business Identifier for item.
     */
    val identifier: Identifier?

    /**
     * Defining information about the code of this charge item.
     */
    val definition: List<String>?

    /**
     * The current state of the ChargeItem.
     */
    val status: ChargeItemStatus

    /**
     * Part of referenced ChargeItem.
     */
    val partOf: List<Reference>?

    /**
     * A code that identifies the charge, like a billing code.
     */
    val code: CodeableConcept

    /**
     * Individual service was done for/to.
     */
    val subject: Reference

    /**
     * Encounter / Episode associated with event.
     */
    val context: Reference?

    /**
     * When the charged service was applied.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When the charged service was applied.
     */
    val occurrencePeriod: Period?

    /**
     * When the charged service was applied.
     */
    val occurrenceTiming: Timing?

    /**
     * Who performed charged service.
     */
    val participant: List<ChargeItemParticipant>?

    /**
     * Organization providing the charged sevice.
     */
    val performingOrganization: Reference?

    /**
     * Organization requesting the charged service.
     */
    val requestingOrganization: Reference?

    /**
     * Quantity of which the charge item has been serviced.
     */
    val quantity: Quantity?

    /**
     * Anatomical location, if relevant.
     */
    val bodysite: List<CodeableConcept>?

    /**
     * Factor overriding the associated rules.
     */
    val factorOverride: Decimal?

    /**
     * Price overriding the associated rules.
     */
    val priceOverride: Money?

    /**
     * Reason for overriding the list price/factor.
     */
    val overrideReason: String?

    /**
     * Individual who was entering.
     */
    val enterer: Reference?

    /**
     * Date the charge item was entered.
     */
    val enteredDate: DateTime?

    /**
     * Why was the charged service rendered?.
     */
    val reason: List<CodeableConcept>?

    /**
     * Which rendered service is being charged?.
     */
    val service: List<Reference>?

    /**
     * Account to place this charge.
     */
    val account: List<Reference>?

    /**
     * Comments made about the ChargeItem.
     */
    val note: List<Annotation>?

    /**
     * Further information supporting the this charge.
     */
    val supportingInformation: List<Reference>?
}

/**
 * ChargeItem
 *
 * SourceFileName: ChargeItem.kt
 *
 * The resource ChargeItem describes the provision of healthcare provider products for a certain
 * patient, therefore referring not only to the product, but containing in addition details of the
 * provision, like date, time, amounts and participating organizations and persons. Main Usage of the
 * ChargeItem is to enable the billing process and internal cost allocation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItem">ChargeItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ChargeItem)
 */
@Serializable
@SerialName("ChargeItem")
data class ChargeItem(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("definition")
    override val definition: List<String>? = null,

    @SerialName("status")
    override val status: ChargeItemStatus,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("participant")
    override val participant: List<ChargeItemParticipant>? = null,

    @SerialName("performingOrganization")
    override val performingOrganization: Reference? = null,

    @SerialName("requestingOrganization")
    override val requestingOrganization: Reference? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("bodysite")
    override val bodysite: List<CodeableConcept>? = null,

    @SerialName("factorOverride")
    override val factorOverride: Decimal? = null,

    @SerialName("priceOverride")
    override val priceOverride: Money? = null,

    @SerialName("overrideReason")
    override val overrideReason: String? = null,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("enteredDate")
    override val enteredDate: DateTime? = null,

    @SerialName("reason")
    override val reason: List<CodeableConcept>? = null,

    @SerialName("service")
    override val service: List<Reference>? = null,

    @SerialName("account")
    override val account: List<Reference>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("supportingInformation")
    override val supportingInformation: List<Reference>? = null,

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
) : FhirChargeItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ChargeItem"
    }
}

/**
 * FhirChargeItemParticipant
 *
 * Indicates who or what performed or participated in the charged service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItem">ChargeItemParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ChargeItem)
 */
interface FhirChargeItemParticipant : FhirBackboneElement {

    /**
     * What type of performance was done.
     */
    val role: CodeableConcept?

    /**
     * Individual who was performing.
     */
    val actor: Reference
}

/**
 * ChargeItemParticipant
 *
 * SourceFileName: ChargeItem.kt
 *
 * Indicates who or what performed or participated in the charged service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ChargeItem">ChargeItemParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ChargeItem)
 */
@Serializable
@SerialName("ChargeItemParticipant")
data class ChargeItemParticipant(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirChargeItemParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ChargeItemParticipant"
    }
}
