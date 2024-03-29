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

import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirExpression
 *
 * A expression that is evaluated in a specified context and returns a value. The context of use of the
 * expression must specify the context in which the expression is evaluated, and how the result of the
 * expression is used.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Expression">Expression</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Expression)
 */
interface FhirExpression : FhirElement {

    /**
     * Natural language description of the condition.
     */
    val description: String?

    /**
     * Short name assigned to expression for reuse.
     */
    val name: String?

    /**
     * text/cql | text/fhirpath | application/x-fhir-query | etc..
     */
    val language: String

    /**
     * Expression in specified language.
     */
    val expression: String?

    /**
     * Where the expression is found.
     */
    val reference: String?
}

/**
 * Expression
 *
 * A expression that is evaluated in a specified context and returns a value. The context of use of the
 * expression must specify the context in which the expression is evaluated, and how the result of the
 * expression is used.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Expression">Expression</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Expression)
 */
@Serializable
@SerialName("Expression")
data class Expression(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("language")
    override val language: String,

    @SerialName("expression")
    override val expression: String? = null,

    @SerialName("reference")
    override val reference: String? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpression {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Expression"
    }
}
