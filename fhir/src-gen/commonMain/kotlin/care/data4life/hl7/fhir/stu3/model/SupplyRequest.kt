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

import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.SupplyRequestStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSupplyRequest
 *
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
interface FhirSupplyRequest : FhirDomainResource {

    /**
     * Unique identifier.
     */
    val identifier: Identifier?

    /**
     * Status of the supply request.
     */
    val status: SupplyRequestStatus?

    /**
     * The kind of supply (central, non-stock, etc.).
     */
    val category: CodeableConcept?

    /**
     * Indicates how quickly this SupplyRequest should be addressed with respect to
     * other requests.
     */
    val priority: RequestPriority?

    /**
     * The item being requested.
     */
    val orderedItem: SupplyRequestOrderedItem?

    /**
     * When the request should be fulfilled.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When the request should be fulfilled.
     */
    val occurrencePeriod: Period?

    /**
     * When the request should be fulfilled.
     */
    val occurrenceTiming: Timing?

    /**
     * When the request was made.
     */
    val authoredOn: DateTime?

    /**
     * Who/what is requesting service.
     */
    val requester: SupplyRequestRequester?

    /**
     * Who is intended to fulfill the request.
     */
    val supplier: List<Reference>?

    /**
     * Why the supply item was requested.
     */
    val reasonCodeableConcept: CodeableConcept?

    /**
     * Why the supply item was requested.
     */
    val reasonReference: Reference?

    /**
     * The origin of the supply.
     */
    val deliverFrom: Reference?

    /**
     * The destination of the supply.
     */
    val deliverTo: Reference?
}

/**
 * SupplyRequest
 *
 * SourceFileName: SupplyRequest.kt
 *
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
@Serializable
@SerialName("SupplyRequest")
data class SupplyRequest(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("status")
    override val status: SupplyRequestStatus? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("orderedItem")
    override val orderedItem: SupplyRequestOrderedItem? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: SupplyRequestRequester? = null,

    @SerialName("supplier")
    override val supplier: List<Reference>? = null,

    @SerialName("reasonCodeableConcept")
    override val reasonCodeableConcept: CodeableConcept? = null,

    @SerialName("reasonReference")
    override val reasonReference: Reference? = null,

    @SerialName("deliverFrom")
    override val deliverFrom: Reference? = null,

    @SerialName("deliverTo")
    override val deliverTo: Reference? = null,

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
) : FhirSupplyRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SupplyRequest"
    }
}

/**
 * FhirSupplyRequestOrderedItem
 *
 * The item being requested
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequestOrderedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
interface FhirSupplyRequestOrderedItem : FhirBackboneElement {

    /**
     * The requested amount of the item indicated.
     */
    val quantity: Quantity

    /**
     * Medication, Substance, or Device requested to be supplied.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * Medication, Substance, or Device requested to be supplied.
     */
    val itemReference: Reference?
}

/**
 * SupplyRequestOrderedItem
 *
 * SourceFileName: SupplyRequest.kt
 *
 * The item being requested
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequestOrderedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
@Serializable
@SerialName("SupplyRequestOrderedItem")
data class SupplyRequestOrderedItem(

    @SerialName("quantity")
    override val quantity: Quantity,

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSupplyRequestOrderedItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SupplyRequestOrderedItem"
    }
}

/**
 * FhirSupplyRequestRequester
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
interface FhirSupplyRequestRequester : FhirBackboneElement {

    /**
     * Individual making the request.
     */
    val agent: Reference

    /**
     * Organization agent is acting for.
     */
    val onBehalfOf: Reference?
}

/**
 * SupplyRequestRequester
 *
 * SourceFileName: SupplyRequest.kt
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
@Serializable
@SerialName("SupplyRequestRequester")
data class SupplyRequestRequester(

    @SerialName("agent")
    override val agent: Reference,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSupplyRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SupplyRequestRequester"
    }
}
