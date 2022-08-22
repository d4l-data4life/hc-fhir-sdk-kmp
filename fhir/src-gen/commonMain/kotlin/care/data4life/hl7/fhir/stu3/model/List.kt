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

import care.data4life.hl7.fhir.stu3.codesystem.ListMode
import care.data4life.hl7.fhir.stu3.codesystem.ListStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirList
 *
 * A set of information summarized from a list of other resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/List">List</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/List)
 */
interface FhirList : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates the current state of this list.
     */
    val status: ListStatus

    /**
     * How this list was prepared - whether it is a working list that is suitable for
     * being maintained on an ongoing basis, or if it represents a snapshot of a list
     * of items from another source, or whether it is a prepared list where items may
     * be marked as added, modified or deleted.
     */
    val mode: ListMode

    /**
     * Descriptive name for the list.
     */
    val title: String?

    /**
     * What the purpose of this list is.
     */
    val code: CodeableConcept?

    /**
     * If all resources have the same subject.
     */
    val subject: Reference?

    /**
     * Context in which list created.
     */
    val encounter: Reference?

    /**
     * When the list was prepared.
     */
    val date: DateTime?

    /**
     * Who and/or what defined the list contents (aka Author).
     */
    val source: Reference?

    /**
     * What order the list has.
     */
    val orderedBy: CodeableConcept?

    /**
     * Comments about the list.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Entries in the list.
     */
    val entry: kotlin.collections.List<ListEntry>?

    /**
     * Why list is empty.
     */
    val emptyReason: CodeableConcept?
}

/**
 * List
 *
 * A set of information summarized from a list of other resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/List">List</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/List)
 */
@Serializable
@SerialName("List")
data class List(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: ListStatus,

    @SerialName("mode")
    override val mode: ListMode,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("source")
    override val source: Reference? = null,

    @SerialName("orderedBy")
    override val orderedBy: CodeableConcept? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("entry")
    override val entry: kotlin.collections.List<ListEntry>? = null,

    @SerialName("emptyReason")
    override val emptyReason: CodeableConcept? = null,

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
) : FhirList {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "List"
    }
}

/**
 * FhirListEntry
 *
 * Entries in this list.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/List">ListEntry</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/List)
 */
interface FhirListEntry : FhirBackboneElement {

    /**
     * Status/Workflow information about this item.
     */
    val flag: CodeableConcept?

    /**
     * If this item is actually marked as deleted.
     */
    val deleted: Bool?

    /**
     * When item added to list.
     */
    val date: DateTime?

    /**
     * Actual entry.
     */
    val item: Reference
}

/**
 * ListEntry
 *
 * Entries in this list.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/List">ListEntry</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/List)
 */
@Serializable
@SerialName("ListEntry")
data class ListEntry(

    @SerialName("flag")
    override val flag: CodeableConcept? = null,

    @SerialName("deleted")
    override val deleted: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("item")
    override val item: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirListEntry {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ListEntry"
    }
}
