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

import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirIdentifier
 *
 * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for
 * business identifiers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Identifier">Identifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Identifier)
 */
interface FhirIdentifier : FhirElement {

    /**
     * The purpose of this identifier.
     */
    val use: IdentifierUse?

    /**
     * Description of identifier.
     */
    val type: CodeableConcept?

    /**
     * The namespace for the identifier value.
     */
    val system: String?

    /**
     * The value that is unique.
     */
    val value: String?

    /**
     * Time period when id is/was valid for use.
     */
    val period: Period?

    /**
     * Organization that issued id (may be just text).
     */
    val assigner: Reference?
}

/**
 * Identifier
 *
 * An identifier - identifies some entity uniquely and unambiguously. Typically this is used for
 * business identifiers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Identifier">Identifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Identifier)
 */
@Serializable
@SerialName("Identifier")
data class Identifier(

    @SerialName("use")
    override val use: IdentifierUse? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("system")
    override val system: String? = null,

    @SerialName("value")
    override val value: String? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("assigner")
    override val assigner: Reference? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirIdentifier {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Identifier"
    }
}
