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

import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.SupplyRequestStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
interface FhirSupplyRequest : FhirDomainResource {

    /**
     * Business Identifier for SupplyRequest.
     */
    val identifier: kotlin.collections.List<Identifier>?

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
     * Medication, Substance, or Device requested to be supplied.
     */
    val itemCodeableConcept: CodeableConcept?

    /**
     * Medication, Substance, or Device requested to be supplied.
     */
    val itemReference: Reference?

    /**
     * The requested amount of the item indicated.
     */
    val quantity: Quantity

    /**
     * Ordered item details.
     */
    val parameter: kotlin.collections.List<SupplyRequestParameter>?

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
     * Individual making the request.
     */
    val requester: Reference?

    /**
     * Who is intended to fulfill the request.
     */
    val supplier: kotlin.collections.List<Reference>?

    /**
     * The reason why the supply item was requested.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * The reason why the supply item was requested.
     */
    val reasonReference: kotlin.collections.List<Reference>?

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
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
@Serializable
@SerialName("SupplyRequest")
data class SupplyRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: SupplyRequestStatus? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("itemCodeableConcept")
    override val itemCodeableConcept: CodeableConcept? = null,

    @SerialName("itemReference")
    override val itemReference: Reference? = null,

    @SerialName("quantity")
    override val quantity: Quantity,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<SupplyRequestParameter>? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: Reference? = null,

    @SerialName("supplier")
    override val supplier: kotlin.collections.List<Reference>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("deliverFrom")
    override val deliverFrom: Reference? = null,

    @SerialName("deliverTo")
    override val deliverTo: Reference? = null,

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
) : FhirSupplyRequest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SupplyRequest"
    }
}

/**
 * FhirSupplyRequestParameter
 *
 * Specific parameters for the ordered item. For example, the size of the indicated item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequestParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
interface FhirSupplyRequestParameter : FhirBackboneElement {

    /**
     * Item detail.
     */
    val code: CodeableConcept?

    /**
     * Value of detail.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Value of detail.
     */
    val valueQuantity: Quantity?

    /**
     * Value of detail.
     */
    val valueRange: Range?

    /**
     * Value of detail.
     */
    val valueBoolean: Bool?
}

/**
 * SupplyRequestParameter
 *
 * Specific parameters for the ordered item. For example, the size of the indicated item.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SupplyRequest">SupplyRequestParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SupplyRequest)
 */
@Serializable
@SerialName("SupplyRequestParameter")
data class SupplyRequestParameter(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSupplyRequestParameter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SupplyRequestParameter"
    }
}
