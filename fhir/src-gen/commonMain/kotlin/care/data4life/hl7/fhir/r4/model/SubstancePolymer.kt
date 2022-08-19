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

import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSubstancePolymer
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymer : FhirDomainResource {

    /**
     * Todo.
     */
    val clazz: CodeableConcept?

    /**
     * Todo.
     */
    val geometry: CodeableConcept?

    /**
     * Todo.
     */
    val copolymerConnectivity: kotlin.collections.List<CodeableConcept>?

    /**
     * Todo.
     */
    val modification: kotlin.collections.List<String>?

    /**
     * Todo.
     */
    val monomerSet: kotlin.collections.List<SubstancePolymerMonomerSet>?

    /**
     * Todo.
     */
    val repeat: kotlin.collections.List<SubstancePolymerRepeat>?
}

/**
 * SubstancePolymer
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymer")
data class SubstancePolymer(

    @SerialName("class")
    override val clazz: CodeableConcept? = null,

    @SerialName("geometry")
    override val geometry: CodeableConcept? = null,

    @SerialName("copolymerConnectivity")
    override val copolymerConnectivity: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("modification")
    override val modification: kotlin.collections.List<String>? = null,

    @SerialName("monomerSet")
    override val monomerSet: kotlin.collections.List<SubstancePolymerMonomerSet>? = null,

    @SerialName("repeat")
    override val repeat: kotlin.collections.List<SubstancePolymerRepeat>? = null,

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
) : FhirSubstancePolymer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymer"
    }
}

/**
 * FhirSubstancePolymerMonomerSet
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerMonomerSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymerMonomerSet : FhirBackboneElement {

    /**
     * Todo.
     */
    val ratioType: CodeableConcept?

    /**
     * Todo.
     */
    val startingMaterial: kotlin.collections.List<SubstancePolymerMonomerSetStartingMaterial>?
}

/**
 * SubstancePolymerMonomerSet
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerMonomerSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymerMonomerSet")
data class SubstancePolymerMonomerSet(

    @SerialName("ratioType")
    override val ratioType: CodeableConcept? = null,

    @SerialName("startingMaterial")
    override val startingMaterial: kotlin.collections.List<SubstancePolymerMonomerSetStartingMaterial>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstancePolymerMonomerSet {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymerMonomerSet"
    }
}

/**
 * FhirSubstancePolymerMonomerSetStartingMaterial
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerMonomerSetStartingMaterial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymerMonomerSetStartingMaterial : FhirBackboneElement {

    /**
     * Todo.
     */
    val material: CodeableConcept?

    /**
     * Todo.
     */
    val type: CodeableConcept?

    /**
     * Todo.
     */
    val isDefining: Bool?

    /**
     * Todo.
     */
    val amount: SubstanceAmount?
}

/**
 * SubstancePolymerMonomerSetStartingMaterial
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerMonomerSetStartingMaterial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymerMonomerSetStartingMaterial")
data class SubstancePolymerMonomerSetStartingMaterial(

    @SerialName("material")
    override val material: CodeableConcept? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("isDefining")
    override val isDefining: Bool? = null,

    @SerialName("amount")
    override val amount: SubstanceAmount? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstancePolymerMonomerSetStartingMaterial {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymerMonomerSetStartingMaterial"
    }
}

/**
 * FhirSubstancePolymerRepeat
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeat</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymerRepeat : FhirBackboneElement {

    /**
     * Todo.
     */
    val numberOfUnits: Integer?

    /**
     * Todo.
     */
    val averageMolecularFormula: String?

    /**
     * Todo.
     */
    val repeatUnitAmountType: CodeableConcept?

    /**
     * Todo.
     */
    val repeatUnit: kotlin.collections.List<SubstancePolymerRepeatRepeatUnit>?
}

/**
 * SubstancePolymerRepeat
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeat</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymerRepeat")
data class SubstancePolymerRepeat(

    @SerialName("numberOfUnits")
    override val numberOfUnits: Integer? = null,

    @SerialName("averageMolecularFormula")
    override val averageMolecularFormula: String? = null,

    @SerialName("repeatUnitAmountType")
    override val repeatUnitAmountType: CodeableConcept? = null,

    @SerialName("repeatUnit")
    override val repeatUnit: kotlin.collections.List<SubstancePolymerRepeatRepeatUnit>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstancePolymerRepeat {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymerRepeat"
    }
}

/**
 * FhirSubstancePolymerRepeatRepeatUnit
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeatRepeatUnit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymerRepeatRepeatUnit : FhirBackboneElement {

    /**
     * Todo.
     */
    val orientationOfPolymerisation: CodeableConcept?

    /**
     * Todo.
     */
    val repeatUnit: String?

    /**
     * Todo.
     */
    val amount: SubstanceAmount?

    /**
     * Todo.
     */
    val degreeOfPolymerisation: kotlin.collections.List<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation>?

    /**
     * Todo.
     */
    val structuralRepresentation: kotlin.collections.List<SubstancePolymerRepeatRepeatUnitStructuralRepresentation>?
}

/**
 * SubstancePolymerRepeatRepeatUnit
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeatRepeatUnit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymerRepeatRepeatUnit")
data class SubstancePolymerRepeatRepeatUnit(

    @SerialName("orientationOfPolymerisation")
    override val orientationOfPolymerisation: CodeableConcept? = null,

    @SerialName("repeatUnit")
    override val repeatUnit: String? = null,

    @SerialName("amount")
    override val amount: SubstanceAmount? = null,

    @SerialName("degreeOfPolymerisation")
    override val degreeOfPolymerisation: kotlin.collections.List<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation>? = null,

    @SerialName("structuralRepresentation")
    override val structuralRepresentation: kotlin.collections.List<SubstancePolymerRepeatRepeatUnitStructuralRepresentation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstancePolymerRepeatRepeatUnit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymerRepeatRepeatUnit"
    }
}

/**
 * FhirSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation : FhirBackboneElement {

    /**
     * Todo.
     */
    val degree: CodeableConcept?

    /**
     * Todo.
     */
    val amount: SubstanceAmount?
}

/**
 * SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation")
data class SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation(

    @SerialName("degree")
    override val degree: CodeableConcept? = null,

    @SerialName("amount")
    override val amount: SubstanceAmount? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation"
    }
}

/**
 * FhirSubstancePolymerRepeatRepeatUnitStructuralRepresentation
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeatRepeatUnitStructuralRepresentation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
interface FhirSubstancePolymerRepeatRepeatUnitStructuralRepresentation : FhirBackboneElement {

    /**
     * Todo.
     */
    val type: CodeableConcept?

    /**
     * Todo.
     */
    val representation: String?

    /**
     * Todo.
     */
    val attachment: Attachment?
}

/**
 * SubstancePolymerRepeatRepeatUnitStructuralRepresentation
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstancePolymer">SubstancePolymerRepeatRepeatUnitStructuralRepresentation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstancePolymer)
 */
@Serializable
@SerialName("SubstancePolymerRepeatRepeatUnitStructuralRepresentation")
data class SubstancePolymerRepeatRepeatUnitStructuralRepresentation(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("representation")
    override val representation: String? = null,

    @SerialName("attachment")
    override val attachment: Attachment? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstancePolymerRepeatRepeatUnitStructuralRepresentation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstancePolymerRepeatRepeatUnitStructuralRepresentation"
    }
}
