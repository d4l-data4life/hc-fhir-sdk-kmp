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

import care.data4life.hl7.fhir.r4.codesystem.SortDirection
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirDataRequirement : FhirElement {

    // The type of the required data.
    val type: String

    // The profile of the required data.
    val profile: List<String>?

    // E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
    val subjectCodeableConcept: CodeableConcept?

    // E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
    val subjectReference: Reference?

    // Indicates specific structure elements that are referenced by the knowledge module.
    val mustSupport: List<String>?

    // What codes are expected.
    val codeFilter: List<DataRequirementCodeFilter>?

    // What dates/date ranges are expected.
    val dateFilter: List<DataRequirementDateFilter>?

    // Number of results.
    val limit: PositiveInteger?

    // Order of the results.
    val sort: List<DataRequirementSort>?
}

/**
 * ClassName: DataRequirement
 *
 * SourceFileName: DataRequirement.kt
 *
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirement")
data class DataRequirement(

    // The type of the required data.
    @SerialName("type")
    override val type: String,
    // The profile of the required data.
    @SerialName("profile")
    override val profile: List<String>? = null,
    // E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
    @SerialName("subjectCodeableConcept")
    override val subjectCodeableConcept: CodeableConcept? = null,
    // E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
    @SerialName("subjectReference")
    override val subjectReference: Reference? = null,
    // Indicates specific structure elements that are referenced by the knowledge module.
    @SerialName("mustSupport")
    override val mustSupport: List<String>? = null,
    // What codes are expected.
    @SerialName("codeFilter")
    override val codeFilter: List<DataRequirementCodeFilter>? = null,
    // What dates/date ranges are expected.
    @SerialName("dateFilter")
    override val dateFilter: List<DataRequirementDateFilter>? = null,
    // Number of results.
    @SerialName("limit")
    override val limit: PositiveInteger? = null,
    // Order of the results.
    @SerialName("sort")
    override val sort: List<DataRequirementSort>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
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

interface FhirDataRequirementCodeFilter : FhirElement {

    // A code-valued attribute to filter on.
    val path: String?

    // A coded (token) parameter to search on.
    val searchParam: String?

    // Valueset for the filter.
    val valueSet: String?

    // What code is expected.
    val code: List<Coding>?
}

/**
 * ClassName: DataRequirementCodeFilter
 *
 * SourceFileName: DataRequirement.kt
 *
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a particular element of the data. Each code filter defines an additional constraint on the data, i.e. code filters are AND'ed, not OR'ed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementCodeFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementCodeFilter")
data class DataRequirementCodeFilter(

    // A code-valued attribute to filter on.
    @SerialName("path")
    override val path: String? = null,
    // A coded (token) parameter to search on.
    @SerialName("searchParam")
    override val searchParam: String? = null,
    // Valueset for the filter.
    @SerialName("valueSet")
    override val valueSet: String? = null,
    // What code is expected.
    @SerialName("code")
    override val code: List<Coding>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
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

interface FhirDataRequirementDateFilter : FhirElement {

    // A date-valued attribute to filter on.
    val path: String?

    // A date valued parameter to search on.
    val searchParam: String?

    // The value of the filter, as a Period, DateTime, or Duration value.
    val valueDateTime: DateTime?

    // The value of the filter, as a Period, DateTime, or Duration value.
    val valuePeriod: Period?

    // The value of the filter, as a Period, DateTime, or Duration value.
    val valueDuration: Duration?
}

/**
 * ClassName: DataRequirementDateFilter
 *
 * SourceFileName: DataRequirement.kt
 *
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for specific elements. Each date filter specifies an additional constraint on the data, i.e. date filters are AND'ed, not OR'ed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementDateFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementDateFilter")
data class DataRequirementDateFilter(

    // A date-valued attribute to filter on.
    @SerialName("path")
    override val path: String? = null,
    // A date valued parameter to search on.
    @SerialName("searchParam")
    override val searchParam: String? = null,
    // The value of the filter, as a Period, DateTime, or Duration value.
    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,
    // The value of the filter, as a Period, DateTime, or Duration value.
    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,
    // The value of the filter, as a Period, DateTime, or Duration value.
    @SerialName("valueDuration")
    override val valueDuration: Duration? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
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

interface FhirDataRequirementSort : FhirElement {

    // The name of the attribute to perform the sort.
    val path: String

    // The direction of the sort, ascending or descending.
    val direction: SortDirection
}

/**
 * ClassName: DataRequirementSort
 *
 * SourceFileName: DataRequirement.kt
 *
 *
 * Specifies the order of the results to be returned.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementSort</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementSort")
data class DataRequirementSort(

    // The name of the attribute to perform the sort.
    @SerialName("path")
    override val path: String,
    // The direction of the sort, ascending or descending.
    @SerialName("direction")
    override val direction: SortDirection,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDataRequirementSort {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DataRequirementSort"
    }
}
