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

import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Instant
import care.data4life.hl7.fhir.r4.primitive.Integer
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import care.data4life.hl7.fhir.r4.primitive.Time
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirExtension : FhirElement {

    // identifies the meaning of the extension.
    val url: String

    // Value of extension.
    val valueBase64Binary: String?

    // Value of extension.
    val valueBoolean: Bool?

    // Value of extension.
    val valueCanonical: String?

    // Value of extension.
    val valueCode: String?

    // Value of extension.
    val valueDate: Date?

    // Value of extension.
    val valueDateTime: DateTime?

    // Value of extension.
    val valueDecimal: Decimal?

    // Value of extension.
    val valueId: String?

    // Value of extension.
    val valueInstant: Instant?

    // Value of extension.
    val valueInteger: Integer?

    // Value of extension.
    val valueMarkdown: String?

    // Value of extension.
    val valueOid: String?

    // Value of extension.
    val valuePositiveInt: PositiveInteger?

    // Value of extension.
    val valueString: String?

    // Value of extension.
    val valueTime: Time?

    // Value of extension.
    val valueUnsignedInt: UnsignedInteger?

    // Value of extension.
    val valueUri: String?

    // Value of extension.
    val valueUrl: String?

    // Value of extension.
    val valueUuid: String?
}

/**
 * ClassName: Extension
 *
 * SourceFileName: Extension.kt
 *
 *
 * Optional Extension Element - found in all resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Extension">Extension</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Extension)
 */
@Serializable
@SerialName("Extension")
data class Extension(

    // identifies the meaning of the extension.
    @SerialName("url")
    override val url: String,
    // Value of extension.
    @SerialName("valueBase64Binary")
    override val valueBase64Binary: String? = null,
    // Value of extension.
    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,
    // Value of extension.
    @SerialName("valueCanonical")
    override val valueCanonical: String? = null,
    // Value of extension.
    @SerialName("valueCode")
    override val valueCode: String? = null,
    // Value of extension.
    @SerialName("valueDate")
    override val valueDate: Date? = null,
    // Value of extension.
    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,
    // Value of extension.
    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,
    // Value of extension.
    @SerialName("valueId")
    override val valueId: String? = null,
    // Value of extension.
    @SerialName("valueInstant")
    override val valueInstant: Instant? = null,
    // Value of extension.
    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,
    // Value of extension.
    @SerialName("valueMarkdown")
    override val valueMarkdown: String? = null,
    // Value of extension.
    @SerialName("valueOid")
    override val valueOid: String? = null,
    // Value of extension.
    @SerialName("valuePositiveInt")
    override val valuePositiveInt: PositiveInteger? = null,
    // Value of extension.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Value of extension.
    @SerialName("valueTime")
    override val valueTime: Time? = null,
    // Value of extension.
    @SerialName("valueUnsignedInt")
    override val valueUnsignedInt: UnsignedInteger? = null,
    // Value of extension.
    @SerialName("valueUri")
    override val valueUri: String? = null,
    // Value of extension.
    @SerialName("valueUrl")
    override val valueUrl: String? = null,
    // Value of extension.
    @SerialName("valueUuid")
    override val valueUuid: String? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirExtension {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Extension"
    }
}
