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

import care.data4life.hl7.fhir.stu3.codesystem.SupplyDeliveryStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSupplyDelivery
 *
 * Record of delivery of what is supplied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyDelivery">SupplyDelivery</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyDelivery)
 */
interface FhirSupplyDelivery : FhirDomainResource {

    /**
     * External identifier.
     */
    val identifier: Identifier?

    /**
     * Fulfills plan, proposal or order.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Part of referenced event.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * A code specifying the state of the dispense event.
     */
    val status: SupplyDeliveryStatus?

    /**
     * Patient for whom the item is supplied.
     */
    val patient: Reference?

    /**
     * Category of dispense event.
     */
    val type: CodeableConcept?

    /**
     * The item that is delivered or supplied.
     */
    val suppliedItem: SupplyDeliverySuppliedItem?

    /**
     * When event occurred.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When event occurred.
     */
    val occurrencePeriod: Period?

    /**
     * When event occurred.
     */
    val occurrenceTiming: Timing?

    /**
     * Dispenser.
     */
    val supplier: Reference?

    /**
     * Where the Supply was sent.
     */
    val destination: Reference?

    /**
     * Who collected the Supply.
     */
    val receiver: kotlin.collections.List<Reference>?
}

/**
 * SupplyDelivery
 *
 * Record of delivery of what is supplied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyDelivery">SupplyDelivery</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyDelivery)
 */
@Serializable
@SerialName("SupplyDelivery")
data class SupplyDelivery(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: SupplyDeliveryStatus? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("suppliedItem")
    override val suppliedItem: SupplyDeliverySuppliedItem? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("supplier")
    override val supplier: Reference? = null,

    @SerialName("destination")
    override val destination: Reference? = null,

    @SerialName("receiver")
    override val receiver: kotlin.collections.List<Reference>? = null,

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
) : FhirSupplyDelivery {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SupplyDelivery"
    }
}

/**
 * FhirSupplyDeliverySuppliedItem
 *
 * The item that is being delivered or has been supplied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyDelivery">SupplyDeliverySuppliedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyDelivery)
 */
interface FhirSupplyDeliverySuppliedItem : FhirBackboneElement {

    /**
     * Amount dispensed.
     */
    val quantity: Quantity?

    /**
     * Medication, Substance, or Device supplied.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * Medication, Substance, or Device supplied.
     */
    val itemReference: Reference?
}

/**
 * SupplyDeliverySuppliedItem
 *
 * The item that is being delivered or has been supplied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyDelivery">SupplyDeliverySuppliedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyDelivery)
 */
@Serializable
@SerialName("SupplyDeliverySuppliedItem")
data class SupplyDeliverySuppliedItem(

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSupplyDeliverySuppliedItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SupplyDeliverySuppliedItem"
    }
}
