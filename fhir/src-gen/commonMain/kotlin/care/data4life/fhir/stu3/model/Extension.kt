/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirExtension : FhirElement {

    // identifies the meaning of the extension.
    val url: String

    // Value of extension.
    val valueBase64Binary: String?

    // Value of extension.
    val valueBoolean: String?

    // Value of extension.
    val valueCode: String?

    // Value of extension.
    val valueDate: String?

    // Value of extension.
    val valueDateTime: String?

    // Value of extension.
    val valueDecimal: String?

    // Value of extension.
    val valueId: String?

    // Value of extension.
    val valueInstant: String?

    // Value of extension.
    val valueInteger: String?

    // Value of extension.
    val valueMarkdown: String?

    // Value of extension.
    val valueOid: String?

    // Value of extension.
    val valuePositiveInt: String?

    // Value of extension.
    val valueString: String?

    // Value of extension.
    val valueTime: String?

    // Value of extension.
    val valueUnsignedInt: String?

    // Value of extension.
    val valueUri: String?

    // Value of extension.
    val valueAddress: Address?

    // Value of extension.
    val valueAge: Age?

    // Value of extension.
    val valueAnnotation: Annotation?

    // Value of extension.
    val valueAttachment: Attachment?

    // Value of extension.
    val valueCodeableConcept: CodeableConcept?

    // Value of extension.
    val valueCoding: Coding?

    // Value of extension.
    val valueContactPoint: ContactPoint?

    // Value of extension.
    val valueCount: Count?

    // Value of extension.
    val valueDistance: Distance?

    // Value of extension.
    val valueDuration: Duration?

    // Value of extension.
    val valueHumanName: HumanName?

    // Value of extension.
    val valueIdentifier: Identifier?

    // Value of extension.
    val valueMoney: Money?

    // Value of extension.
    val valuePeriod: Period?

    // Value of extension.
    val valueQuantity: Quantity?

    // Value of extension.
    val valueRange: Range?

    // Value of extension.
    val valueRatio: Ratio?

    // Value of extension.
    val valueReference: Reference?

    // Value of extension.
    val valueSampledData: SampledData?

    // Value of extension.
    val valueSignature: Signature?

    // Value of extension.
    val valueTiming: Timing?

    // Value of extension.
    val valueMeta: Meta?
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Extension) on 2020-10-01
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
    override val valueBoolean: String? = null,
    // Value of extension.
    @SerialName("valueCode")
    override val valueCode: String? = null,
    // Value of extension.
    @SerialName("valueDate")
    override val valueDate: String? = null,
    // Value of extension.
    @SerialName("valueDateTime")
    override val valueDateTime: String? = null,
    // Value of extension.
    @SerialName("valueDecimal")
    override val valueDecimal: String? = null,
    // Value of extension.
    @SerialName("valueId")
    override val valueId: String? = null,
    // Value of extension.
    @SerialName("valueInstant")
    override val valueInstant: String? = null,
    // Value of extension.
    @SerialName("valueInteger")
    override val valueInteger: String? = null,
    // Value of extension.
    @SerialName("valueMarkdown")
    override val valueMarkdown: String? = null,
    // Value of extension.
    @SerialName("valueOid")
    override val valueOid: String? = null,
    // Value of extension.
    @SerialName("valuePositiveInt")
    override val valuePositiveInt: String? = null,
    // Value of extension.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Value of extension.
    @SerialName("valueTime")
    override val valueTime: String? = null,
    // Value of extension.
    @SerialName("valueUnsignedInt")
    override val valueUnsignedInt: String? = null,
    // Value of extension.
    @SerialName("valueUri")
    override val valueUri: String? = null,
    // Value of extension.
    @SerialName("valueAddress")
    override val valueAddress: Address? = null,
    // Value of extension.
    @SerialName("valueAge")
    override val valueAge: Age? = null,
    // Value of extension.
    @SerialName("valueAnnotation")
    override val valueAnnotation: Annotation? = null,
    // Value of extension.
    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,
    // Value of extension.
    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,
    // Value of extension.
    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,
    // Value of extension.
    @SerialName("valueContactPoint")
    override val valueContactPoint: ContactPoint? = null,
    // Value of extension.
    @SerialName("valueCount")
    override val valueCount: Count? = null,
    // Value of extension.
    @SerialName("valueDistance")
    override val valueDistance: Distance? = null,
    // Value of extension.
    @SerialName("valueDuration")
    override val valueDuration: Duration? = null,
    // Value of extension.
    @SerialName("valueHumanName")
    override val valueHumanName: HumanName? = null,
    // Value of extension.
    @SerialName("valueIdentifier")
    override val valueIdentifier: Identifier? = null,
    // Value of extension.
    @SerialName("valueMoney")
    override val valueMoney: Money? = null,
    // Value of extension.
    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,
    // Value of extension.
    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,
    // Value of extension.
    @SerialName("valueRange")
    override val valueRange: Range? = null,
    // Value of extension.
    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,
    // Value of extension.
    @SerialName("valueReference")
    override val valueReference: Reference? = null,
    // Value of extension.
    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,
    // Value of extension.
    @SerialName("valueSignature")
    override val valueSignature: Signature? = null,
    // Value of extension.
    @SerialName("valueTiming")
    override val valueTiming: Timing? = null,
    // Value of extension.
    @SerialName("valueMeta")
    override val valueMeta: Meta? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
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

