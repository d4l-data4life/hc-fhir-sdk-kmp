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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirParameters
 *
 * This special resource type is used to represent an operation request and response (operations.html).
 * It has no other use, and there is no RESTful endpoint associated with it.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Parameters">Parameters</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Parameters)
 */
interface FhirParameters : FhirResource {

    /**
     * Operation Parameter.
     */
    val parameter: kotlin.collections.List<ParametersParameter>?
}

/**
 * Parameters
 *
 * This special resource type is used to represent an operation request and response (operations.html).
 * It has no other use, and there is no RESTful endpoint associated with it.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Parameters">Parameters</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Parameters)
 */
@Serializable
@SerialName("Parameters")
data class Parameters(

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<ParametersParameter>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirParameters {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Parameters"
    }
}

/**
 * FhirParametersParameter
 *
 * A parameter passed to or received from the operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Parameters">ParametersParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Parameters)
 */
interface FhirParametersParameter : FhirBackboneElement {

    /**
     * Name from the definition.
     */
    val name: String

    /**
     * If parameter is a data type.
     */
    val valueBase64Binary: String?

    /**
     * If parameter is a data type.
     */
    val valueBoolean: Bool?

    /**
     * If parameter is a data type.
     */
    val valueCode: String?

    /**
     * If parameter is a data type.
     */
    val valueDate: Date?

    /**
     * If parameter is a data type.
     */
    val valueDateTime: DateTime?

    /**
     * If parameter is a data type.
     */
    val valueDecimal: Decimal?

    /**
     * If parameter is a data type.
     */
    val valueId: String?

    /**
     * If parameter is a data type.
     */
    val valueInstant: Instant?

    /**
     * If parameter is a data type.
     */
    val valueInteger: Integer?

    /**
     * If parameter is a data type.
     */
    val valueMarkdown: String?

    /**
     * If parameter is a data type.
     */
    val valueOid: String?

    /**
     * If parameter is a data type.
     */
    val valuePositiveInt: PositiveInteger?

    /**
     * If parameter is a data type.
     */
    val valueString: String?

    /**
     * If parameter is a data type.
     */
    val valueTime: Time?

    /**
     * If parameter is a data type.
     */
    val valueUnsignedInt: UnsignedInteger?

    /**
     * If parameter is a data type.
     */
    val valueUri: String?

    /**
     * If parameter is a data type.
     */
    val valueAddress: Address?

    /**
     * If parameter is a data type.
     */
    val valueAge: Age?

    /**
     * If parameter is a data type.
     */
    val valueAnnotation: Annotation?

    /**
     * If parameter is a data type.
     */
    val valueAttachment: Attachment?

    /**
     * If parameter is a data type.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * If parameter is a data type.
     */
    val valueCoding: Coding?

    /**
     * If parameter is a data type.
     */
    val valueContactPoint: ContactPoint?

    /**
     * If parameter is a data type.
     */
    val valueCount: Count?

    /**
     * If parameter is a data type.
     */
    val valueDistance: Distance?

    /**
     * If parameter is a data type.
     */
    val valueDuration: Duration?

    /**
     * If parameter is a data type.
     */
    val valueHumanName: HumanName?

    /**
     * If parameter is a data type.
     */
    val valueIdentifier: Identifier?

    /**
     * If parameter is a data type.
     */
    val valueMoney: Money?

    /**
     * If parameter is a data type.
     */
    val valuePeriod: Period?

    /**
     * If parameter is a data type.
     */
    val valueQuantity: Quantity?

    /**
     * If parameter is a data type.
     */
    val valueRange: Range?

    /**
     * If parameter is a data type.
     */
    val valueRatio: Ratio?

    /**
     * If parameter is a data type.
     */
    val valueReference: Reference?

    /**
     * If parameter is a data type.
     */
    val valueSampledData: SampledData?

    /**
     * If parameter is a data type.
     */
    val valueSignature: Signature?

    /**
     * If parameter is a data type.
     */
    val valueTiming: Timing?

    /**
     * If parameter is a data type.
     */
    val valueMeta: Meta?

    /**
     * If parameter is a whole resource.
     */
    val resource: FhirResource?

    /**
     * Named part of a multi-part parameter.
     */
    val part: kotlin.collections.List<ParametersParameter>?
}

/**
 * ParametersParameter
 *
 * A parameter passed to or received from the operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Parameters">ParametersParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Parameters)
 */
@Serializable
@SerialName("ParametersParameter")
data class ParametersParameter(

    @SerialName("name")
    override val name: String,

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

    @SerialName("resource")
    override val resource: FhirResource? = null,

    @SerialName("part")
    override val part: kotlin.collections.List<ParametersParameter>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirParametersParameter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ParametersParameter"
    }
}
