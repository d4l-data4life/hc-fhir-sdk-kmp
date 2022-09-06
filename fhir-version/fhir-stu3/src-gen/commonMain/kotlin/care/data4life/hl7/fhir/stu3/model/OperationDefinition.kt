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

import care.data4life.hl7.fhir.stu3.codesystem.BindingStrength
import care.data4life.hl7.fhir.stu3.codesystem.OperationKind
import care.data4life.hl7.fhir.stu3.codesystem.OperationParameterUse
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.codesystem.SearchParamType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirOperationDefinition
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using
 * the search interaction).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
interface FhirOperationDefinition : FhirDomainResource {

    /**
     * Logical URI to reference this operation definition (globally unique).
     */
    val url: String?

    /**
     * Business version of the operation definition.
     */
    val version: String?

    /**
     * Name for this operation definition (computer friendly).
     */
    val name: String

    /**
     * The status of this operation definition. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * Whether this is an operation or a named query.
     */
    val kind: OperationKind

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
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
     * Natural language description of the operation definition.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for operation definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this operation definition is defined.
     */
    val purpose: String?

    /**
     * Whether content is unchanged by the operation.
     */
    val idempotent: Bool?

    /**
     * Name used to invoke the operation.
     */
    val code: String

    /**
     * Additional information about use.
     */
    val comment: String?

    /**
     * Marks this as a profile of the base.
     */
    val base: Reference?

    /**
     * The types on which this operation can be executed.
     */
    val resource: kotlin.collections.List<ResourceType>?

    /**
     * Invoke at the system level?.
     */
    val system: Bool

    /**
     * Invole at the type level?.
     */
    val type: Bool

    /**
     * Invoke on an instance?.
     */
    val instance: Bool

    /**
     * Parameters for the operation/query.
     */
    val parameter: kotlin.collections.List<OperationDefinitionParameter>?

    /**
     * Define overloaded variants for when generating code.
     */
    val overload: kotlin.collections.List<OperationDefinitionOverload>?
}

/**
 * OperationDefinition
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using
 * the search interaction).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
@Serializable
@SerialName("OperationDefinition")
data class OperationDefinition(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("kind")
    override val kind: OperationKind,

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

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("idempotent")
    override val idempotent: Bool? = null,

    @SerialName("code")
    override val code: String,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("base")
    override val base: Reference? = null,

    @SerialName("resource")
    override val resource: kotlin.collections.List<ResourceType>? = null,

    @SerialName("system")
    override val system: Bool,

    @SerialName("type")
    override val type: Bool,

    @SerialName("instance")
    override val instance: Bool,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<OperationDefinitionParameter>? = null,

    @SerialName("overload")
    override val overload: kotlin.collections.List<OperationDefinitionOverload>? = null,

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
) : FhirOperationDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "OperationDefinition"
    }
}

/**
 * FhirOperationDefinitionOverload
 *
 * Defines an appropriate combination of parameters to use when invoking this operation, to help code
 * generators when generating overloaded parameter sets for this operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinitionOverload</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
interface FhirOperationDefinitionOverload : FhirBackboneElement {

    /**
     * Name of parameter to include in overload.
     */
    val parameterName: kotlin.collections.List<String>?

    /**
     * Comments to go on overload.
     */
    val comment: String?
}

/**
 * OperationDefinitionOverload
 *
 * Defines an appropriate combination of parameters to use when invoking this operation, to help code
 * generators when generating overloaded parameter sets for this operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinitionOverload</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
@Serializable
@SerialName("OperationDefinitionOverload")
data class OperationDefinitionOverload(

    @SerialName("parameterName")
    override val parameterName: kotlin.collections.List<String>? = null,

    @SerialName("comment")
    override val comment: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirOperationDefinitionOverload {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "OperationDefinitionOverload"
    }
}

/**
 * FhirOperationDefinitionParameter
 *
 * The parameters for the operation/query.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinitionParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
interface FhirOperationDefinitionParameter : FhirBackboneElement {

    /**
     * Name in Parameters.parameter.name or in URL.
     */
    val name: String

    /**
     * Whether this is an input or an output parameter.
     */
    val use: OperationParameterUse

    /**
     * Minimum Cardinality.
     */
    val min: Integer

    /**
     * Maximum Cardinality (a number or *).
     */
    val max: String

    /**
     * Description of meaning/use.
     */
    val documentation: String?

    /**
     * What type this parameter has.
     */
    val type: String?

    /**
     * How the parameter is understood as a search parameter. This is only used if the
     * parameter type is 'string'.
     */
    val searchType: SearchParamType?

    /**
     * Profile on the type.
     */
    val profile: Reference?

    /**
     * ValueSet details if this is coded.
     */
    val binding: OperationDefinitionParameterBinding?

    /**
     * Parts of a nested Parameter.
     */
    val part: kotlin.collections.List<OperationDefinitionParameter>?
}

/**
 * OperationDefinitionParameter
 *
 * The parameters for the operation/query.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinitionParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
@Serializable
@SerialName("OperationDefinitionParameter")
data class OperationDefinitionParameter(

    @SerialName("name")
    override val name: String,

    @SerialName("use")
    override val use: OperationParameterUse,

    @SerialName("min")
    override val min: Integer,

    @SerialName("max")
    override val max: String,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("type")
    override val type: String? = null,

    @SerialName("searchType")
    override val searchType: SearchParamType? = null,

    @SerialName("profile")
    override val profile: Reference? = null,

    @SerialName("binding")
    override val binding: OperationDefinitionParameterBinding? = null,

    @SerialName("part")
    override val part: kotlin.collections.List<OperationDefinitionParameter>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirOperationDefinitionParameter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "OperationDefinitionParameter"
    }
}

/**
 * FhirOperationDefinitionParameterBinding
 *
 * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinitionParameterBinding</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
interface FhirOperationDefinitionParameterBinding : FhirBackboneElement {

    /**
     * Indicates the degree of conformance expectations associated with this binding -
     * that is, the degree to which the provided value set must be adhered to in the
     * instances.
     */
    val strength: BindingStrength

    /**
     * Source of value set.
     */
    val valueSetUri: String?

    /**
     * Source of value set.
     */
    val valueSetReference: Reference?
}

/**
 * OperationDefinitionParameterBinding
 *
 * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/OperationDefinition">OperationDefinitionParameterBinding</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/OperationDefinition)
 */
@Serializable
@SerialName("OperationDefinitionParameterBinding")
data class OperationDefinitionParameterBinding(

    @SerialName("strength")
    override val strength: BindingStrength,

    @SerialName("valueSetUri")
    override val valueSetUri: String? = null,

    @SerialName("valueSetReference")
    override val valueSetReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirOperationDefinitionParameterBinding {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "OperationDefinitionParameterBinding"
    }
}
