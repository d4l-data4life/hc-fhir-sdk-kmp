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

import care.data4life.hl7.fhir.r4.codesystem.SpecimenContainedPreference
import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSpecimenDefinition
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
interface FhirSpecimenDefinition : FhirDomainResource {

    /**
     * Business identifier of a kind of specimen.
     */
    val identifier: Identifier?

    /**
     * Kind of material to collect.
     */
    val typeCollected: CodeableConcept?

    /**
     * Patient preparation for collection.
     */
    val patientPreparation: kotlin.collections.List<CodeableConcept>?

    /**
     * Time aspect for collection.
     */
    val timeAspect: String?

    /**
     * Specimen collection procedure.
     */
    val collection: kotlin.collections.List<CodeableConcept>?

    /**
     * Specimen in container intended for testing by lab.
     */
    val typeTested: kotlin.collections.List<SpecimenDefinitionTypeTested>?
}

/**
 * SpecimenDefinition
 *
 * A kind of specimen with associated set of requirements.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
@Serializable
@SerialName("SpecimenDefinition")
data class SpecimenDefinition(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("typeCollected")
    override val typeCollected: CodeableConcept? = null,

    @SerialName("patientPreparation")
    override val patientPreparation: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("timeAspect")
    override val timeAspect: String? = null,

    @SerialName("collection")
    override val collection: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("typeTested")
    override val typeTested: kotlin.collections.List<SpecimenDefinitionTypeTested>? = null,

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
) : FhirSpecimenDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SpecimenDefinition"
    }
}

/**
 * FhirSpecimenDefinitionTypeTested
 *
 * Specimen conditioned in a container as expected by the testing laboratory.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTested</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
interface FhirSpecimenDefinitionTypeTested : FhirBackboneElement {

    /**
     * Primary or secondary specimen.
     */
    val isDerived: Bool?

    /**
     * Type of intended specimen.
     */
    val type: CodeableConcept?

    /**
     * The preference for this type of conditioned specimen.
     */
    val preference: SpecimenContainedPreference

    /**
     * The specimen's container.
     */
    val container: SpecimenDefinitionTypeTestedContainer?

    /**
     * Specimen requirements.
     */
    val requirement: String?

    /**
     * Specimen retention time.
     */
    val retentionTime: Duration?

    /**
     * Rejection criterion.
     */
    val rejectionCriterion: kotlin.collections.List<CodeableConcept>?

    /**
     * Specimen handling before testing.
     */
    val handling: kotlin.collections.List<SpecimenDefinitionTypeTestedHandling>?
}

/**
 * SpecimenDefinitionTypeTested
 *
 * Specimen conditioned in a container as expected by the testing laboratory.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTested</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
@Serializable
@SerialName("SpecimenDefinitionTypeTested")
data class SpecimenDefinitionTypeTested(

    @SerialName("isDerived")
    override val isDerived: Bool? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("preference")
    override val preference: SpecimenContainedPreference,

    @SerialName("container")
    override val container: SpecimenDefinitionTypeTestedContainer? = null,

    @SerialName("requirement")
    override val requirement: String? = null,

    @SerialName("retentionTime")
    override val retentionTime: Duration? = null,

    @SerialName("rejectionCriterion")
    override val rejectionCriterion: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("handling")
    override val handling: kotlin.collections.List<SpecimenDefinitionTypeTestedHandling>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSpecimenDefinitionTypeTested {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SpecimenDefinitionTypeTested"
    }
}

/**
 * FhirSpecimenDefinitionTypeTestedContainer
 *
 * The specimen's container
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTestedContainer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
interface FhirSpecimenDefinitionTypeTestedContainer : FhirBackboneElement {

    /**
     * Container material.
     */
    val material: CodeableConcept?

    /**
     * Kind of container associated with the kind of specimen.
     */
    val type: CodeableConcept?

    /**
     * Color of container cap.
     */
    val cap: CodeableConcept?

    /**
     * Container description.
     */
    val description: String?

    /**
     * Container capacity.
     */
    val capacity: Quantity?

    /**
     * Minimum volume.
     */
    val minimumVolumeQuantity: Quantity?

    /**
     * Minimum volume.
     */
    val minimumVolumeString: String?

    /**
     * Additive associated with container.
     */
    val additive: kotlin.collections.List<SpecimenDefinitionTypeTestedContainerAdditive>?

    /**
     * Specimen container preparation.
     */
    val preparation: String?
}

/**
 * SpecimenDefinitionTypeTestedContainer
 *
 * The specimen's container
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTestedContainer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
@Serializable
@SerialName("SpecimenDefinitionTypeTestedContainer")
data class SpecimenDefinitionTypeTestedContainer(

    @SerialName("material")
    override val material: CodeableConcept? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("cap")
    override val cap: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("capacity")
    override val capacity: Quantity? = null,

    @SerialName("minimumVolumeQuantity")
    override val minimumVolumeQuantity: Quantity? = null,

    @SerialName("minimumVolumeString")
    override val minimumVolumeString: String? = null,

    @SerialName("additive")
    override val additive: kotlin.collections.List<SpecimenDefinitionTypeTestedContainerAdditive>? = null,

    @SerialName("preparation")
    override val preparation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSpecimenDefinitionTypeTestedContainer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SpecimenDefinitionTypeTestedContainer"
    }
}

/**
 * FhirSpecimenDefinitionTypeTestedContainerAdditive
 *
 * Substance introduced in the kind of container to preserve, maintain or enhance the specimen.
 * Examples: Formalin, Citrate, EDTA.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTestedContainerAdditive</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
interface FhirSpecimenDefinitionTypeTestedContainerAdditive : FhirBackboneElement {

    /**
     * Additive associated with container.
     */
    val additiveCodeableConcept: CodeableConcept?

    /**
     * Additive associated with container.
     */
    val additiveReference: Reference?
}

/**
 * SpecimenDefinitionTypeTestedContainerAdditive
 *
 * Substance introduced in the kind of container to preserve, maintain or enhance the specimen.
 * Examples: Formalin, Citrate, EDTA.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTestedContainerAdditive</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
@Serializable
@SerialName("SpecimenDefinitionTypeTestedContainerAdditive")
data class SpecimenDefinitionTypeTestedContainerAdditive(

    @SerialName("additiveCodeableConcept")
    override val additiveCodeableConcept: CodeableConcept? = null,

    @SerialName("additiveReference")
    override val additiveReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSpecimenDefinitionTypeTestedContainerAdditive {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SpecimenDefinitionTypeTestedContainerAdditive"
    }
}

/**
 * FhirSpecimenDefinitionTypeTestedHandling
 *
 * Set of instructions for preservation/transport of the specimen at a defined temperature interval,
 * prior the testing process.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTestedHandling</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
interface FhirSpecimenDefinitionTypeTestedHandling : FhirBackboneElement {

    /**
     * Temperature qualifier.
     */
    val temperatureQualifier: CodeableConcept?

    /**
     * Temperature range.
     */
    val temperatureRange: Range?

    /**
     * Maximum preservation time.
     */
    val maxDuration: Duration?

    /**
     * Preservation instruction.
     */
    val instruction: String?
}

/**
 * SpecimenDefinitionTypeTestedHandling
 *
 * Set of instructions for preservation/transport of the specimen at a defined temperature interval,
 * prior the testing process.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SpecimenDefinition">SpecimenDefinitionTypeTestedHandling</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SpecimenDefinition)
 */
@Serializable
@SerialName("SpecimenDefinitionTypeTestedHandling")
data class SpecimenDefinitionTypeTestedHandling(

    @SerialName("temperatureQualifier")
    override val temperatureQualifier: CodeableConcept? = null,

    @SerialName("temperatureRange")
    override val temperatureRange: Range? = null,

    @SerialName("maxDuration")
    override val maxDuration: Duration? = null,

    @SerialName("instruction")
    override val instruction: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSpecimenDefinitionTypeTestedHandling {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SpecimenDefinitionTypeTestedHandling"
    }
}
