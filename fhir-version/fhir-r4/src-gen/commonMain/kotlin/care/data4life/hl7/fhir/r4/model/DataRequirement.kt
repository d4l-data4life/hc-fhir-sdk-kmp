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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirDataRequirement
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or
 * date-based filters of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirement : FhirElement {

    /**
     * The type of the required data.
     */
    val type: String

    /**
     * The profile of the required data.
     */
    val profile: kotlin.collections.List<String>?

    /**
     * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
     */
    val subjectReference: Reference?

    /**
     * Indicates specific structure elements that are referenced by the knowledge
     * module.
     */
    val mustSupport: kotlin.collections.List<String>?

    /**
     * What codes are expected.
     */
    val codeFilter: kotlin.collections.List<DataRequirementCodeFilter>?

    /**
     * What dates/date ranges are expected.
     */
    val dateFilter: kotlin.collections.List<DataRequirementDateFilter>?

    /**
     * Number of results.
     */
    val limit: PositiveInteger?

    /**
     * Order of the results.
     */
    val sort: kotlin.collections.List<DataRequirementSort>?
}

/**
 * DataRequirement
 *
 * Describes a required data item for evaluation in terms of the type of data, and optional code or
 * date-based filters of the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirement")
data class DataRequirement(

    @SerialName("type")
    override val type: String,

    @SerialName("profile")
    override val profile: kotlin.collections.List<String>? = null,

    @SerialName("subjectCodeableConcept")
    override val subjectCodeableConcept: CodeableConcept? = null,

    @SerialName("subjectReference")
    override val subjectReference: Reference? = null,

    @SerialName("mustSupport")
    override val mustSupport: kotlin.collections.List<String>? = null,

    @SerialName("codeFilter")
    override val codeFilter: kotlin.collections.List<DataRequirementCodeFilter>? = null,

    @SerialName("dateFilter")
    override val dateFilter: kotlin.collections.List<DataRequirementDateFilter>? = null,

    @SerialName("limit")
    override val limit: PositiveInteger? = null,

    @SerialName("sort")
    override val sort: kotlin.collections.List<DataRequirementSort>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDataRequirement {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DataRequirement"
    }
}

/**
 * FhirDataRequirementCodeFilter
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a
 * particular element of the data. Each code filter defines an additional constraint on the data, i.e.
 * code filters are AND'ed, not OR'ed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementCodeFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirementCodeFilter : FhirElement {

    /**
     * A code-valued attribute to filter on.
     */
    val path: String?

    /**
     * A coded (token) parameter to search on.
     */
    val searchParam: String?

    /**
     * Valueset for the filter.
     */
    val valueSet: String?

    /**
     * What code is expected.
     */
    val code: kotlin.collections.List<Coding>?
}

/**
 * DataRequirementCodeFilter
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for a
 * particular element of the data. Each code filter defines an additional constraint on the data, i.e.
 * code filters are AND'ed, not OR'ed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementCodeFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementCodeFilter")
data class DataRequirementCodeFilter(

    @SerialName("path")
    override val path: String? = null,

    @SerialName("searchParam")
    override val searchParam: String? = null,

    @SerialName("valueSet")
    override val valueSet: String? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<Coding>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDataRequirementCodeFilter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DataRequirementCodeFilter"
    }
}

/**
 * FhirDataRequirementDateFilter
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for
 * specific elements. Each date filter specifies an additional constraint on the data, i.e. date
 * filters are AND'ed, not OR'ed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementDateFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirementDateFilter : FhirElement {

    /**
     * A date-valued attribute to filter on.
     */
    val path: String?

    /**
     * A date valued parameter to search on.
     */
    val searchParam: String?

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
 * Date filters specify additional constraints on the data in terms of the applicable date range for
 * specific elements. Each date filter specifies an additional constraint on the data, i.e. date
 * filters are AND'ed, not OR'ed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementDateFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
@Serializable
@SerialName("DataRequirementDateFilter")
data class DataRequirementDateFilter(

    @SerialName("path")
    override val path: String? = null,

    @SerialName("searchParam")
    override val searchParam: String? = null,

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
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDataRequirementDateFilter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DataRequirementDateFilter"
    }
}

/**
 * FhirDataRequirementSort
 *
 * Specifies the order of the results to be returned.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataRequirement">DataRequirementSort</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DataRequirement)
 */
interface FhirDataRequirementSort : FhirElement {

    /**
     * The name of the attribute to perform the sort.
     */
    val path: String

    /**
     * The direction of the sort, ascending or descending.
     */
    val direction: SortDirection
}

/**
 * DataRequirementSort
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

    @SerialName("path")
    override val path: String,

    @SerialName("direction")
    override val direction: SortDirection,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDataRequirementSort {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DataRequirementSort"
    }
}
