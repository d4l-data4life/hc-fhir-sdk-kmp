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

import care.data4life.hl7.fhir.stu3.codesystem.GroupType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirGroup
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but
 * which are not expected to act collectively and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Group">Group</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Group)
 */
interface FhirGroup : FhirDomainResource {

    /**
     * Unique id.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether this group's record is in active use.
     */
    val active: Bool?

    /**
     * Identifies the broad classification of the kind of resources the group includes.
     */
    val type: GroupType

    /**
     * Descriptive or actual.
     */
    val actual: Bool

    /**
     * Kind of Group members.
     */
    val code: CodeableConcept?

    /**
     * Label for Group.
     */
    val name: String?

    /**
     * Number of members.
     */
    val quantity: UnsignedInteger?

    /**
     * Trait of group members.
     */
    val characteristic: kotlin.collections.List<GroupCharacteristic>?

    /**
     * Who or what is in group.
     */
    val member: kotlin.collections.List<GroupMember>?
}

/**
 * Group
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but
 * which are not expected to act collectively and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Group">Group</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Group)
 */
@Serializable
@SerialName("Group")
data class Group(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("type")
    override val type: GroupType,

    @SerialName("actual")
    override val actual: Bool,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("quantity")
    override val quantity: UnsignedInteger? = null,

    @SerialName("characteristic")
    override val characteristic: kotlin.collections.List<GroupCharacteristic>? = null,

    @SerialName("member")
    override val member: kotlin.collections.List<GroupMember>? = null,

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
) : FhirGroup {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Group"
    }
}

/**
 * FhirGroupCharacteristic
 *
 * Identifies the traits shared by members of the group.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Group">GroupCharacteristic</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Group)
 */
interface FhirGroupCharacteristic : FhirBackboneElement {

    /**
     * Kind of characteristic.
     */
    val code: CodeableConcept

    /**
     * Value held by characteristic.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Value held by characteristic.
     */
    val valueBoolean: Bool?

    /**
     * Value held by characteristic.
     */
    val valueQuantity: Quantity?

    /**
     * Value held by characteristic.
     */
    val valueRange: Range?

    /**
     * Group includes or excludes.
     */
    val exclude: Bool

    /**
     * Period over which characteristic is tested.
     */
    val period: Period?
}

/**
 * GroupCharacteristic
 *
 * Identifies the traits shared by members of the group.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Group">GroupCharacteristic</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Group)
 */
@Serializable
@SerialName("GroupCharacteristic")
data class GroupCharacteristic(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("exclude")
    override val exclude: Bool,

    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirGroupCharacteristic {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GroupCharacteristic"
    }
}

/**
 * FhirGroupMember
 *
 * Identifies the resource instances that are members of the group.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Group">GroupMember</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Group)
 */
interface FhirGroupMember : FhirBackboneElement {

    /**
     * Reference to the group member.
     */
    val entity: Reference

    /**
     * Period member belonged to the group.
     */
    val period: Period?

    /**
     * If member is no longer in group.
     */
    val inactive: Bool?
}

/**
 * GroupMember
 *
 * Identifies the resource instances that are members of the group.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Group">GroupMember</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Group)
 */
@Serializable
@SerialName("GroupMember")
data class GroupMember(

    @SerialName("entity")
    override val entity: Reference,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("inactive")
    override val inactive: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirGroupMember {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GroupMember"
    }
}
