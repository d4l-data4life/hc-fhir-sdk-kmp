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

import care.data4life.hl7.fhir.stu3.codesystem.DataElementStringency
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDataElement
 *
 * The formal description of a single piece of information that can be gathered and reported.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataElement">DataElement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataElement)
 */
interface FhirDataElement : FhirDomainResource {

    /**
     * Logical URI to reference this data element (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the data element.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the data element.
     */
    val version: String?

    /**
     * The status of this data element. Enables tracking the life-cycle of the content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Name for this data element (computer friendly).
     */
    val name: String?

    /**
     * Name for this data element (human friendly).
     */
    val title: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for data element (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Identifies how precise the data element is in its definition.
     */
    val stringency: DataElementStringency?

    /**
     * External specification mapped to.
     */
    val mapping: kotlin.collections.List<DataElementMapping>?

    /**
     * Definition of element.
     */
    val element: kotlin.collections.List<ElementDefinition>
}

/**
 * DataElement
 *
 * The formal description of a single piece of information that can be gathered and reported.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataElement">DataElement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataElement)
 */
@Serializable
@SerialName("DataElement")
data class DataElement(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("stringency")
    override val stringency: DataElementStringency? = null,

    @SerialName("mapping")
    override val mapping: kotlin.collections.List<DataElementMapping>? = null,

    @SerialName("element")
    override val element: kotlin.collections.List<ElementDefinition>,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirDataElement {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DataElement"
    }
}

/**
 * FhirDataElementMapping
 *
 * Identifies a specification (other than a terminology) that the elements which make up the
 * DataElement have some correspondence with.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataElement">DataElementMapping</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataElement)
 */
interface FhirDataElementMapping : FhirBackboneElement {

    /**
     * Internal id when this mapping is used.
     */
    val identity: String

    /**
     * Identifies what this mapping refers to.
     */
    val uri: String?

    /**
     * Names what this mapping refers to.
     */
    val name: String?

    /**
     * Versions, issues, scope limitations, etc..
     */
    val comment: String?
}

/**
 * DataElementMapping
 *
 * Identifies a specification (other than a terminology) that the elements which make up the
 * DataElement have some correspondence with.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DataElement">DataElementMapping</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DataElement)
 */
@Serializable
@SerialName("DataElementMapping")
data class DataElementMapping(

    @SerialName("identity")
    override val identity: String,

    @SerialName("uri")
    override val uri: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("comment")
    override val comment: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDataElementMapping {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DataElementMapping"
    }
}
