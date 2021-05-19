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

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDataRequirement
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or
 * date-based filters of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirement : FhirElement {

    /**
     * The type of the required data.
     */
    val type: String

    /**
     * The profile of the required data.
     */
    val profile: List<String>?

    /**
     * Indicates that specific structure elements are referenced by the knowledge
     * module.
     */
    val mustSupport: List<String>?

    /**
     * What codes are expected.
     */
    val codeFilter: List<DataRequirementCodeFilter>?

    /**
     * What dates/date ranges are expected.
     */
    val dateFilter: List<DataRequirementDateFilter>?
}

/**
 * DataRequirement
 *
 * SourceFileName: DataRequirement.kt
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or
 * date-based filters of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirement")
data class DataRequirement(

    @SerialName("type")
    override val type: String,

    @SerialName("profile")
    override val profile: List<String>? = null,

    @SerialName("mustSupport")
    override val mustSupport: List<String>? = null,

    @SerialName("codeFilter")
    override val codeFilter: List<DataRequirementCodeFilter>? = null,

    @SerialName("dateFilter")
    override val dateFilter: List<DataRequirementDateFilter>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDataRequirement {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DataRequirement"
    }
}

/**
 * FhirDataRequirementCodeFilter
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a
 * particular element of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementCodeFilter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirementCodeFilter : FhirElement {

    /**
     * The code-valued attribute of the filter.
     */
    val path: String

    /**
     * Valueset for the filter.
     */
    val valueSetString: String?

    /**
     * Valueset for the filter.
     */
    val valueSetReference: Reference?

    /**
     * What code is expected.
     */
    val valueCode: List<String>?

    /**
     * What Coding is expected.
     */
    val valueCoding: List<Coding>?

    /**
     * What CodeableConcept is expected.
     */
    val valueCodeableConcept: List<CodeableConcept>?
}

/**
 * DataRequirementCodeFilter
 *
 * SourceFileName: DataRequirement.kt
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a
 * particular element of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementCodeFilter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementCodeFilter")
data class DataRequirementCodeFilter(

    @SerialName("path")
    override val path: String,

    @SerialName("valueSetString")
    override val valueSetString: String? = null,

    @SerialName("valueSetReference")
    override val valueSetReference: Reference? = null,

    @SerialName("valueCode")
    override val valueCode: List<String>? = null,

    @SerialName("valueCoding")
    override val valueCoding: List<Coding>? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: List<CodeableConcept>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDataRequirementCodeFilter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DataRequirementCodeFilter"
    }
}

/**
 * FhirDataRequirementDateFilter
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for
 * specific elements.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementDateFilter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirementDateFilter : FhirElement {

    /**
     * The date-valued attribute of the filter.
     */
    val path: String

    /**
     * The value of the filter, as a Period, DateTime, or Duration value.
     */
    val valueDateTime: DateTime?

    /**
     * The value of the filter, as a Period, DateTime, or Duration value.
     */
    val valuePeriod: Period?

    /**
     * The value of the filter, as a Period, DateTime, or Duration value.
     */
    val valueDuration: Duration?
}

/**
 * DataRequirementDateFilter
 *
 * SourceFileName: DataRequirement.kt
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for
 * specific elements.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementDateFilter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementDateFilter")
data class DataRequirementDateFilter(

    @SerialName("path")
    override val path: String,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,

    @SerialName("valueDuration")
    override val valueDuration: Duration? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDataRequirementDateFilter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DataRequirementDateFilter"
    }
}
