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

import care.data4life.hl7.fhir.r4.codesystem.CompartmentType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirCompartmentDefinition
 *
 * A compartment definition that defines how resources are accessed on a server.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CompartmentDefinition">CompartmentDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CompartmentDefinition)
 */
interface FhirCompartmentDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this compartment definition, represented as a URI
     * (globally unique).
     */
    val url: String

    /**
     * Business version of the compartment definition.
     */
    val version: String?

    /**
     * Name for this compartment definition (computer friendly).
     */
    val name: String

    /**
     * The status of this compartment definition. Enables tracking the life-cycle of
     * the content.
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
     * Natural language description of the compartment definition.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Why this compartment definition is defined.
     */
    val purpose: String?

    /**
     * Which compartment this definition describes.
     */
    val code: CompartmentType

    /**
     * Whether the search syntax is supported.
     */
    val search: Bool

    /**
     * How a resource is related to the compartment.
     */
    val resource: kotlin.collections.List<CompartmentDefinitionResource>?
}

/**
 * CompartmentDefinition
 *
 * A compartment definition that defines how resources are accessed on a server.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CompartmentDefinition">CompartmentDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CompartmentDefinition)
 */
@Serializable
@SerialName("CompartmentDefinition")
data class CompartmentDefinition(

    @SerialName("url")
    override val url: String,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String,

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

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("code")
    override val code: CompartmentType,

    @SerialName("search")
    override val search: Bool,

    @SerialName("resource")
    override val resource: kotlin.collections.List<CompartmentDefinitionResource>? = null,

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
) : FhirCompartmentDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CompartmentDefinition"
    }
}

/**
 * FhirCompartmentDefinitionResource
 *
 * Information about how a resource is related to the compartment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CompartmentDefinition">CompartmentDefinitionResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CompartmentDefinition)
 */
interface FhirCompartmentDefinitionResource : FhirBackboneElement {

    /**
     * The name of a resource supported by the server.
     */
    val code: ResourceType

    /**
     * Search Parameter Name, or chained parameters.
     */
    val param: kotlin.collections.List<String>?

    /**
     * Additional documentation about the resource and compartment.
     */
    val documentation: String?
}

/**
 * CompartmentDefinitionResource
 *
 * Information about how a resource is related to the compartment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CompartmentDefinition">CompartmentDefinitionResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CompartmentDefinition)
 */
@Serializable
@SerialName("CompartmentDefinitionResource")
data class CompartmentDefinitionResource(

    @SerialName("code")
    override val code: ResourceType,

    @SerialName("param")
    override val param: kotlin.collections.List<String>? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCompartmentDefinitionResource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CompartmentDefinitionResource"
    }
}
