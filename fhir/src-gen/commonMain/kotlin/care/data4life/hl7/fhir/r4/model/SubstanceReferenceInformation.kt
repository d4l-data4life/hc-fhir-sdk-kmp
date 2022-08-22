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

import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSubstanceReferenceInformation
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
interface FhirSubstanceReferenceInformation : FhirDomainResource {

    /**
     * Todo.
     */
    val comment: String?

    /**
     * Todo.
     */
    val gene: kotlin.collections.List<SubstanceReferenceInformationGene>?

    /**
     * Todo.
     */
    val geneElement: kotlin.collections.List<SubstanceReferenceInformationGeneElement>?

    /**
     * Todo.
     */
    val classification: kotlin.collections.List<SubstanceReferenceInformationClassification>?

    /**
     * Todo.
     */
    val target: kotlin.collections.List<SubstanceReferenceInformationTarget>?
}

/**
 * SubstanceReferenceInformation
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
@Serializable
@SerialName("SubstanceReferenceInformation")
data class SubstanceReferenceInformation(

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("gene")
    override val gene: kotlin.collections.List<SubstanceReferenceInformationGene>? = null,

    @SerialName("geneElement")
    override val geneElement: kotlin.collections.List<SubstanceReferenceInformationGeneElement>? = null,

    @SerialName("classification")
    override val classification: kotlin.collections.List<SubstanceReferenceInformationClassification>? = null,

    @SerialName("target")
    override val target: kotlin.collections.List<SubstanceReferenceInformationTarget>? = null,

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
) : FhirSubstanceReferenceInformation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceReferenceInformation"
    }
}

/**
 * FhirSubstanceReferenceInformationClassification
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationClassification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
interface FhirSubstanceReferenceInformationClassification : FhirBackboneElement {

    /**
     * Todo.
     */
    val domain: CodeableConcept?

    /**
     * Todo.
     */
    val classification: CodeableConcept?

    /**
     * Todo.
     */
    val subtype: kotlin.collections.List<CodeableConcept>?

    /**
     * Todo.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceReferenceInformationClassification
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationClassification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
@Serializable
@SerialName("SubstanceReferenceInformationClassification")
data class SubstanceReferenceInformationClassification(

    @SerialName("domain")
    override val domain: CodeableConcept? = null,

    @SerialName("classification")
    override val classification: CodeableConcept? = null,

    @SerialName("subtype")
    override val subtype: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceReferenceInformationClassification {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceReferenceInformationClassification"
    }
}

/**
 * FhirSubstanceReferenceInformationGene
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationGene</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
interface FhirSubstanceReferenceInformationGene : FhirBackboneElement {

    /**
     * Todo.
     */
    val geneSequenceOrigin: CodeableConcept?

    /**
     * Todo.
     */
    val gene: CodeableConcept?

    /**
     * Todo.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceReferenceInformationGene
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationGene</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
@Serializable
@SerialName("SubstanceReferenceInformationGene")
data class SubstanceReferenceInformationGene(

    @SerialName("geneSequenceOrigin")
    override val geneSequenceOrigin: CodeableConcept? = null,

    @SerialName("gene")
    override val gene: CodeableConcept? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceReferenceInformationGene {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceReferenceInformationGene"
    }
}

/**
 * FhirSubstanceReferenceInformationGeneElement
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationGeneElement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
interface FhirSubstanceReferenceInformationGeneElement : FhirBackboneElement {

    /**
     * Todo.
     */
    val type: CodeableConcept?

    /**
     * Todo.
     */
    val element: Identifier?

    /**
     * Todo.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceReferenceInformationGeneElement
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationGeneElement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
@Serializable
@SerialName("SubstanceReferenceInformationGeneElement")
data class SubstanceReferenceInformationGeneElement(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("element")
    override val element: Identifier? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceReferenceInformationGeneElement {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceReferenceInformationGeneElement"
    }
}

/**
 * FhirSubstanceReferenceInformationTarget
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationTarget</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
interface FhirSubstanceReferenceInformationTarget : FhirBackboneElement {

    /**
     * Todo.
     */
    val target: Identifier?

    /**
     * Todo.
     */
    val type: CodeableConcept?

    /**
     * Todo.
     */
    val interaction: CodeableConcept?

    /**
     * Todo.
     */
    val organism: CodeableConcept?

    /**
     * Todo.
     */
    val organismType: CodeableConcept?

    /**
     * Todo.
     */
    val amountQuantity: Quantity?

    /**
     * Todo.
     */
    val amountRange: Range?

    /**
     * Todo.
     */
    val amountString: String?

    /**
     * Todo.
     */
    val amountType: CodeableConcept?

    /**
     * Todo.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceReferenceInformationTarget
 *
 * Todo
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation">SubstanceReferenceInformationTarget</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceReferenceInformation)
 */
@Serializable
@SerialName("SubstanceReferenceInformationTarget")
data class SubstanceReferenceInformationTarget(

    @SerialName("target")
    override val target: Identifier? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("interaction")
    override val interaction: CodeableConcept? = null,

    @SerialName("organism")
    override val organism: CodeableConcept? = null,

    @SerialName("organismType")
    override val organismType: CodeableConcept? = null,

    @SerialName("amountQuantity")
    override val amountQuantity: Quantity? = null,

    @SerialName("amountRange")
    override val amountRange: Range? = null,

    @SerialName("amountString")
    override val amountString: String? = null,

    @SerialName("amountType")
    override val amountType: CodeableConcept? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceReferenceInformationTarget {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceReferenceInformationTarget"
    }
}
