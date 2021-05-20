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

import care.data4life.hl7.fhir.r4.codesystem.LinkageType
import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirLinkage
 *
 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Linkage">Linkage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Linkage)
 */
interface FhirLinkage : FhirDomainResource {

    /**
     * Whether this linkage assertion is active or not.
     */
    val active: Bool?

    /**
     * Who is responsible for linkages.
     */
    val author: Reference?

    /**
     * Item to be linked.
     */
    val item: kotlin.collections.List<LinkageItem>
}

/**
 * Linkage
 *
 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Linkage">Linkage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Linkage)
 */
@Serializable
@SerialName("Linkage")
data class Linkage(

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<LinkageItem>,

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
) : FhirLinkage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Linkage"
    }
}

/**
 * FhirLinkageItem
 *
 * Identifies which record considered as the reference to the same real-world occurrence as well as how
 * the items should be evaluated within the collection of linked items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Linkage">LinkageItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Linkage)
 */
interface FhirLinkageItem : FhirBackboneElement {

    /**
     * Distinguishes which item is "source of truth" (if any) and which items are no
     * longer considered to be current representations.
     */
    val type: LinkageType

    /**
     * Resource being linked.
     */
    val resource: Reference
}

/**
 * LinkageItem
 *
 * Identifies which record considered as the reference to the same real-world occurrence as well as how
 * the items should be evaluated within the collection of linked items.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Linkage">LinkageItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Linkage)
 */
@Serializable
@SerialName("LinkageItem")
data class LinkageItem(

    @SerialName("type")
    override val type: LinkageType,

    @SerialName("resource")
    override val resource: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirLinkageItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "LinkageItem"
    }
}
