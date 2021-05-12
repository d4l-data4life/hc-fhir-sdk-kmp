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

import care.data4life.hl7.fhir.r4.codesystem.OperationParameterUse
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirParameterDefinition : FhirElement {

    // Name used to access the parameter value.
    val name: String?

    // Whether the parameter is input or output for the module.
    val use: OperationParameterUse

    // Minimum cardinality.
    val min: Integer?

    // Maximum cardinality (a number of *).
    val max: String?

    // A brief description of the parameter.
    val documentation: String?

    // What type of value.
    val type: String

    // What profile the value is expected to be.
    val profile: String?
}

/**
 * ClassName: ParameterDefinition
 *
 * SourceFileName: ParameterDefinition.kt
 *
 * The parameters to the module. This collection specifies both the input and output parameters. Input
 * parameters are provided by the caller as part of the $evaluate operation. Output parameters are
 * included in the GuidanceResponse.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ParameterDefinition">ParameterDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ParameterDefinition)
 */
@Serializable
@SerialName("ParameterDefinition")
data class ParameterDefinition(

    // Name used to access the parameter value.
    @SerialName("name")
    override val name: String? = null,

    // Whether the parameter is input or output for the module.
    @SerialName("use")
    override val use: OperationParameterUse,

    // Minimum cardinality.
    @SerialName("min")
    override val min: Integer? = null,

    // Maximum cardinality (a number of *).
    @SerialName("max")
    override val max: String? = null,

    // A brief description of the parameter.
    @SerialName("documentation")
    override val documentation: String? = null,

    // What type of value.
    @SerialName("type")
    override val type: String,

    // What profile the value is expected to be.
    @SerialName("profile")
    override val profile: String? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirParameterDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ParameterDefinition"
    }
}
