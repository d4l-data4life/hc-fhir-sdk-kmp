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

import care.data4life.hl7.fhir.stu3.codesystem.ActionList
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirProcessRequest
 *
 * This resource provides the target, request and response, and action details for an action to be
 * performed by the target on or about existing resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessRequest">ProcessRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessRequest)
 */
interface FhirProcessRequest : FhirDomainResource {

    /**
     * Business Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * The type of processing action being requested, for example Reversal,
     * Readjudication, StatusRequest,PendedRequest.
     */
    val action: ActionList?

    /**
     * Party which is the target of the request.
     */
    val target: Reference?

    /**
     * Creation date.
     */
    val created: DateTime?

    /**
     * Responsible practitioner.
     */
    val provider: Reference?

    /**
     * Responsible organization.
     */
    val organization: Reference?

    /**
     * Reference to the Request resource.
     */
    val request: Reference?

    /**
     * Reference to the Response resource.
     */
    val response: Reference?

    /**
     * Remove history.
     */
    val nullify: Bool?

    /**
     * Reference number/string.
     */
    val reference: String?

    /**
     * Items to re-adjudicate.
     */
    val item: kotlin.collections.List<ProcessRequestItem>?

    /**
     * Resource type(s) to include.
     */
    val include: kotlin.collections.List<String>?

    /**
     * Resource type(s) to exclude.
     */
    val exclude: kotlin.collections.List<String>?

    /**
     * Selection period.
     */
    val period: Period?
}

/**
 * ProcessRequest
 *
 * This resource provides the target, request and response, and action details for an action to be
 * performed by the target on or about existing resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessRequest">ProcessRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessRequest)
 */
@Serializable
@SerialName("ProcessRequest")
data class ProcessRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("action")
    override val action: ActionList? = null,

    @SerialName("target")
    override val target: Reference? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("provider")
    override val provider: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("response")
    override val response: Reference? = null,

    @SerialName("nullify")
    override val nullify: Bool? = null,

    @SerialName("reference")
    override val reference: String? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<ProcessRequestItem>? = null,

    @SerialName("include")
    override val include: kotlin.collections.List<String>? = null,

    @SerialName("exclude")
    override val exclude: kotlin.collections.List<String>? = null,

    @SerialName("period")
    override val period: Period? = null,

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
) : FhirProcessRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcessRequest"
    }
}

/**
 * FhirProcessRequestItem
 *
 * List of top level items to be re-adjudicated, if none specified then the entire submission is re-
 * adjudicated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessRequest">ProcessRequestItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessRequest)
 */
interface FhirProcessRequestItem : FhirBackboneElement {

    /**
     * Service instance.
     */
    val sequenceLinkId: Integer
}

/**
 * ProcessRequestItem
 *
 * List of top level items to be re-adjudicated, if none specified then the entire submission is re-
 * adjudicated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProcessRequest">ProcessRequestItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ProcessRequest)
 */
@Serializable
@SerialName("ProcessRequestItem")
data class ProcessRequestItem(

    @SerialName("sequenceLinkId")
    override val sequenceLinkId: Integer,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirProcessRequestItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ProcessRequestItem"
    }
}
