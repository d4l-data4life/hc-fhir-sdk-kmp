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

import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Instant
import care.data4life.hl7.fhir.stu3.primitive.Integer
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import care.data4life.hl7.fhir.stu3.primitive.Time
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirExtension
 *
 * Optional Extension Element - found in all resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Extension">Extension</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Extension)
 */
interface FhirExtension : FhirElement {

    /**
     * identifies the meaning of the extension.
     */
    val url: String

    /**
     * Value of extension.
     */
    val valueBase64Binary: String?

    /**
     * Value of extension.
     */
    val valueBoolean: Bool?

    /**
     * Value of extension.
     */
    val valueCode: String?

    /**
     * Value of extension.
     */
    val valueDate: Date?

    /**
     * Value of extension.
     */
    val valueDateTime: DateTime?

    /**
     * Value of extension.
     */
    val valueDecimal: Decimal?

    /**
     * Value of extension.
     */
    val valueId: String?

    /**
     * Value of extension.
     */
    val valueInstant: Instant?

    /**
     * Value of extension.
     */
    val valueInteger: Integer?

    /**
     * Value of extension.
     */
    val valueMarkdown: String?

    /**
     * Value of extension.
     */
    val valueOid: String?

    /**
     * Value of extension.
     */
    val valuePositiveInt: PositiveInteger?

    /**
     * Value of extension.
     */
    val valueString: String?

    /**
     * Value of extension.
     */
    val valueTime: Time?

    /**
     * Value of extension.
     */
    val valueUnsignedInt: UnsignedInteger?

    /**
     * Value of extension.
     */
    val valueUri: String?

    /**
     * Value of extension.
     */
    val valueAddress: Address?

    /**
     * Value of extension.
     */
    val valueAge: Age?

    /**
     * Value of extension.
     */
    val valueAnnotation: Annotation?

    /**
     * Value of extension.
     */
    val valueAttachment: Attachment?

    /**
     * Value of extension.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Value of extension.
     */
    val valueCoding: Coding?

    /**
     * Value of extension.
     */
    val valueContactPoint: ContactPoint?

    /**
     * Value of extension.
     */
    val valueCount: Count?

    /**
     * Value of extension.
     */
    val valueDistance: Distance?

    /**
     * Value of extension.
     */
    val valueDuration: Duration?

    /**
     * Value of extension.
     */
    val valueHumanName: HumanName?

    /**
     * Value of extension.
     */
    val valueIdentifier: Identifier?

    /**
     * Value of extension.
     */
    val valueMoney: Money?

    /**
     * Value of extension.
     */
    val valuePeriod: Period?

    /**
     * Value of extension.
     */
    val valueQuantity: Quantity?

    /**
     * Value of extension.
     */
    val valueRange: Range?

    /**
     * Value of extension.
     */
    val valueRatio: Ratio?

    /**
     * Value of extension.
     */
    val valueReference: Reference?

    /**
     * Value of extension.
     */
    val valueSampledData: SampledData?

    /**
     * Value of extension.
     */
    val valueSignature: Signature?

    /**
     * Value of extension.
     */
    val valueTiming: Timing?

    /**
     * Value of extension.
     */
    val valueMeta: Meta?
}

/**
 * Extension
 *
 * SourceFileName: Extension.kt
 *
 * Optional Extension Element - found in all resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Extension">Extension</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Extension)
 */
@Serializable
@SerialName("Extension")
data class Extension(

    @SerialName("url")
    override val url: String,

    @SerialName("valueBase64Binary")
    override val valueBase64Binary: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueCode")
    override val valueCode: String? = null,

    @SerialName("valueDate")
    override val valueDate: Date? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    @SerialName("valueId")
    override val valueId: String? = null,

    @SerialName("valueInstant")
    override val valueInstant: Instant? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueMarkdown")
    override val valueMarkdown: String? = null,

    @SerialName("valueOid")
    override val valueOid: String? = null,

    @SerialName("valuePositiveInt")
    override val valuePositiveInt: PositiveInteger? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueUnsignedInt")
    override val valueUnsignedInt: UnsignedInteger? = null,

    @SerialName("valueUri")
    override val valueUri: String? = null,

    @SerialName("valueAddress")
    override val valueAddress: Address? = null,

    @SerialName("valueAge")
    override val valueAge: Age? = null,

    @SerialName("valueAnnotation")
    override val valueAnnotation: Annotation? = null,

    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    @SerialName("valueContactPoint")
    override val valueContactPoint: ContactPoint? = null,

    @SerialName("valueCount")
    override val valueCount: Count? = null,

    @SerialName("valueDistance")
    override val valueDistance: Distance? = null,

    @SerialName("valueDuration")
    override val valueDuration: Duration? = null,

    @SerialName("valueHumanName")
    override val valueHumanName: HumanName? = null,

    @SerialName("valueIdentifier")
    override val valueIdentifier: Identifier? = null,

    @SerialName("valueMoney")
    override val valueMoney: Money? = null,

    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,

    @SerialName("valueReference")
    override val valueReference: Reference? = null,

    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,

    @SerialName("valueSignature")
    override val valueSignature: Signature? = null,

    @SerialName("valueTiming")
    override val valueTiming: Timing? = null,

    @SerialName("valueMeta")
    override val valueMeta: Meta? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

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
