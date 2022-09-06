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

import care.data4life.hl7.fhir.stu3.codesystem.EndpointStatus
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirEndpoint
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web
 * services providing XDS.b or a REST endpoint for another FHIR server. This may include any security
 * context information.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Endpoint">Endpoint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Endpoint)
 */
interface FhirEndpoint : FhirDomainResource {

    /**
     * Identifies this endpoint across multiple systems.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | suspended | error | off | test.
     */
    val status: EndpointStatus

    /**
     * Protocol/Profile/Standard to be used with this endpoint connection.
     */
    val connectionType: Coding

    /**
     * A name that this endpoint can be identified by.
     */
    val name: String?

    /**
     * Organization that manages this endpoint (may not be the organization that
     * exposes the endpoint).
     */
    val managingOrganization: Reference?

    /**
     * Contact details for source (e.g. troubleshooting).
     */
    val contact: kotlin.collections.List<ContactPoint>?

    /**
     * Interval the endpoint is expected to be operational.
     */
    val period: Period?

    /**
     * The type of content that may be used at this endpoint (e.g. XDS Discharge
     * summaries).
     */
    val payloadType: kotlin.collections.List<CodeableConcept>

    /**
     * Mimetype to send. If not specified, the content could be anything (including no
     * payload, if the connectionType defined this).
     */
    val payloadMimeType: kotlin.collections.List<String>?

    /**
     * The technical base address for connecting to this endpoint.
     */
    val address: String

    /**
     * Usage depends on the channel type.
     */
    val header: kotlin.collections.List<String>?
}

/**
 * Endpoint
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web
 * services providing XDS.b or a REST endpoint for another FHIR server. This may include any security
 * context information.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Endpoint">Endpoint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Endpoint)
 */
@Serializable
@SerialName("Endpoint")
data class Endpoint(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: EndpointStatus,

    @SerialName("connectionType")
    override val connectionType: Coding,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("payloadType")
    override val payloadType: kotlin.collections.List<CodeableConcept>,

    @SerialName("payloadMimeType")
    override val payloadMimeType: kotlin.collections.List<String>? = null,

    @SerialName("address")
    override val address: String,

    @SerialName("header")
    override val header: kotlin.collections.List<String>? = null,

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
) : FhirEndpoint {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Endpoint"
    }
}
