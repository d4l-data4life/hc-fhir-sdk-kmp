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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSubstanceSourceMaterial
 *
 * Source material shall capture information on the taxonomic and anatomical origins as well as the
 * fraction of a material that can result in or can be modified to form a substance. This set of data
 * elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and
 * anatomical origins shall be described using a controlled vocabulary as required. This information is
 * captured for naturally derived polymers ( . starch) and structurally diverse substances. For
 * Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a
 * single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations,
 * the fraction information will be captured at the Substance information level and additional
 * information for herbal extracts will be captured at the Specified Substance Group 1 information
 * level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterial : FhirDomainResource {

    /**
     * General high level classification of the source material specific to the origin
     * of the material.
     */
    val sourceMaterialClass: CodeableConcept?

    /**
     * The type of the source material shall be specified based on a controlled
     * vocabulary. For vaccines, this subclause refers to the class of infectious agent.
     */
    val sourceMaterialType: CodeableConcept?

    /**
     * The state of the source material when extracted.
     */
    val sourceMaterialState: CodeableConcept?

    /**
     * The unique identifier associated with the source material parent organism shall
     * be specified.
     */
    val organismId: Identifier?

    /**
     * The organism accepted Scientific name shall be provided based on the organism
     * taxonomy.
     */
    val organismName: String?

    /**
     * The parent of the herbal drug Ginkgo biloba, Leaf is the substance ID of the
     * substance (fresh) of Ginkgo biloba L. or Ginkgo biloba L. (Whole plant).
     */
    val parentSubstanceId: kotlin.collections.List<Identifier>?

    /**
     * The parent substance of the Herbal Drug, or Herbal preparation.
     */
    val parentSubstanceName: kotlin.collections.List<String>?

    /**
     * The country where the plant material is harvested or the countries where the
     * plasma is sourced from as laid down in accordance with the Plasma Master File.
     * For “Plasma-derived substances” the attribute country of origin provides
     * information about the countries used for the manufacturing of the Cryopoor plama
     * or Crioprecipitate.
     */
    val countryOfOrigin: kotlin.collections.List<CodeableConcept>?

    /**
     * The place/region where the plant is harvested or the places/regions where the
     * animal source material has its habitat.
     */
    val geographicalLocation: kotlin.collections.List<String>?

    /**
     * Stage of life for animals, plants, insects and microorganisms. This information
     * shall be provided only when the substance is significantly different in these
     * stages (e.g. foetal bovine serum).
     */
    val developmentStage: CodeableConcept?

    /**
     * Many complex materials are fractions of parts of plants, animals, or minerals.
     * Fraction elements are often necessary to define both Substances and Specified
     * Group 1 Substances. For substances derived from Plants, fraction information
     * will be captured at the Substance information level ( . Oils, Juices and
     * Exudates). Additional information for Extracts, such as extraction solvent
     * composition, will be captured at the Specified Substance Group 1 information
     * level. For plasma-derived products fraction information will be captured at the
     * Substance and the Specified Substance Group 1 levels.
     */
    val fractionDescription: kotlin.collections.List<SubstanceSourceMaterialFractionDescription>?

    /**
     * This subclause describes the organism which the substance is derived from. For
     * vaccines, the parent organism shall be specified based on these subclause
     * elements. As an example, full taxonomy will be described for the Substance Name:
     * ., Leaf.
     */
    val organism: SubstanceSourceMaterialOrganism?

    /**
     * To do.
     */
    val partDescription: kotlin.collections.List<SubstanceSourceMaterialPartDescription>?
}

/**
 * SubstanceSourceMaterial
 *
 * Source material shall capture information on the taxonomic and anatomical origins as well as the
 * fraction of a material that can result in or can be modified to form a substance. This set of data
 * elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and
 * anatomical origins shall be described using a controlled vocabulary as required. This information is
 * captured for naturally derived polymers ( . starch) and structurally diverse substances. For
 * Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a
 * single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations,
 * the fraction information will be captured at the Substance information level and additional
 * information for herbal extracts will be captured at the Specified Substance Group 1 information
 * level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterial")
data class SubstanceSourceMaterial(

    @SerialName("sourceMaterialClass")
    override val sourceMaterialClass: CodeableConcept? = null,

    @SerialName("sourceMaterialType")
    override val sourceMaterialType: CodeableConcept? = null,

    @SerialName("sourceMaterialState")
    override val sourceMaterialState: CodeableConcept? = null,

    @SerialName("organismId")
    override val organismId: Identifier? = null,

    @SerialName("organismName")
    override val organismName: String? = null,

    @SerialName("parentSubstanceId")
    override val parentSubstanceId: kotlin.collections.List<Identifier>? = null,

    @SerialName("parentSubstanceName")
    override val parentSubstanceName: kotlin.collections.List<String>? = null,

    @SerialName("countryOfOrigin")
    override val countryOfOrigin: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("geographicalLocation")
    override val geographicalLocation: kotlin.collections.List<String>? = null,

    @SerialName("developmentStage")
    override val developmentStage: CodeableConcept? = null,

    @SerialName("fractionDescription")
    override val fractionDescription: kotlin.collections.List<SubstanceSourceMaterialFractionDescription>? = null,

    @SerialName("organism")
    override val organism: SubstanceSourceMaterialOrganism? = null,

    @SerialName("partDescription")
    override val partDescription: kotlin.collections.List<SubstanceSourceMaterialPartDescription>? = null,

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
) : FhirSubstanceSourceMaterial {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterial"
    }
}

/**
 * FhirSubstanceSourceMaterialFractionDescription
 *
 * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are
 * often necessary to define both Substances and Specified Group 1 Substances. For substances derived
 * from Plants, fraction information will be captured at the Substance information level ( . Oils,
 * Juices and Exudates). Additional information for Extracts, such as extraction solvent composition,
 * will be captured at the Specified Substance Group 1 information level. For plasma-derived products
 * fraction information will be captured at the Substance and the Specified Substance Group 1 levels
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialFractionDescription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterialFractionDescription : FhirBackboneElement {

    /**
     * This element is capturing information about the fraction of a plant part, or
     * human plasma for fractionation.
     */
    val fraction: String?

    /**
     * The specific type of the material constituting the component. For Herbal
     * preparations the particulars of the extracts (liquid/dry) is described in
     * Specified Substance Group 1.
     */
    val materialType: CodeableConcept?
}

/**
 * SubstanceSourceMaterialFractionDescription
 *
 * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements are
 * often necessary to define both Substances and Specified Group 1 Substances. For substances derived
 * from Plants, fraction information will be captured at the Substance information level ( . Oils,
 * Juices and Exudates). Additional information for Extracts, such as extraction solvent composition,
 * will be captured at the Specified Substance Group 1 information level. For plasma-derived products
 * fraction information will be captured at the Substance and the Specified Substance Group 1 levels
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialFractionDescription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterialFractionDescription")
data class SubstanceSourceMaterialFractionDescription(

    @SerialName("fraction")
    override val fraction: String? = null,

    @SerialName("materialType")
    override val materialType: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSourceMaterialFractionDescription {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterialFractionDescription"
    }
}

/**
 * FhirSubstanceSourceMaterialOrganism
 *
 * This subclause describes the organism which the substance is derived from. For vaccines, the parent
 * organism shall be specified based on these subclause elements. As an example, full taxonomy will be
 * described for the Substance Name: ., Leaf
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganism</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterialOrganism : FhirBackboneElement {

    /**
     * The family of an organism shall be specified.
     */
    val family: CodeableConcept?

    /**
     * The genus of an organism shall be specified; refers to the Latin epithet of the
     * genus element of the plant/animal scientific name; it is present in names for
     * genera, species and infraspecies.
     */
    val genus: CodeableConcept?

    /**
     * The species of an organism shall be specified; refers to the Latin epithet of
     * the species of the plant/animal; it is present in names for species and
     * infraspecies.
     */
    val species: CodeableConcept?

    /**
     * The Intraspecific type of an organism shall be specified.
     */
    val intraspecificType: CodeableConcept?

    /**
     * The intraspecific description of an organism shall be specified based on a
     * controlled vocabulary. For Influenza Vaccine, the intraspecific description
     * shall contain the syntax of the antigen in line with the WHO convention.
     */
    val intraspecificDescription: String?

    /**
     * 4.9.13.6.1 Author type (Conditional).
     */
    val author: kotlin.collections.List<SubstanceSourceMaterialOrganismAuthor>?

    /**
     * 4.9.13.8.1 Hybrid species maternal organism ID (Optional).
     */
    val hybrid: SubstanceSourceMaterialOrganismHybrid?

    /**
     * 4.9.13.7.1 Kingdom (Conditional).
     */
    val organismGeneral: SubstanceSourceMaterialOrganismOrganismGeneral?
}

/**
 * SubstanceSourceMaterialOrganism
 *
 * This subclause describes the organism which the substance is derived from. For vaccines, the parent
 * organism shall be specified based on these subclause elements. As an example, full taxonomy will be
 * described for the Substance Name: ., Leaf
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganism</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterialOrganism")
data class SubstanceSourceMaterialOrganism(

    @SerialName("family")
    override val family: CodeableConcept? = null,

    @SerialName("genus")
    override val genus: CodeableConcept? = null,

    @SerialName("species")
    override val species: CodeableConcept? = null,

    @SerialName("intraspecificType")
    override val intraspecificType: CodeableConcept? = null,

    @SerialName("intraspecificDescription")
    override val intraspecificDescription: String? = null,

    @SerialName("author")
    override val author: kotlin.collections.List<SubstanceSourceMaterialOrganismAuthor>? = null,

    @SerialName("hybrid")
    override val hybrid: SubstanceSourceMaterialOrganismHybrid? = null,

    @SerialName("organismGeneral")
    override val organismGeneral: SubstanceSourceMaterialOrganismOrganismGeneral? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSourceMaterialOrganism {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterialOrganism"
    }
}

/**
 * FhirSubstanceSourceMaterialOrganismAuthor
 *
 * 4.9.13.6.1 Author type (Conditional)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganismAuthor</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterialOrganismAuthor : FhirBackboneElement {

    /**
     * The type of author of an organism species shall be specified. The parenthetical
     * author of an organism species refers to the first author who published the
     * plant/animal name (of any rank). The primary author of an organism species
     * refers to the first author(s), who validly published the plant/animal name.
     */
    val authorType: CodeableConcept?

    /**
     * The author of an organism species shall be specified. The author year of an
     * organism shall also be specified when applicable; refers to the year in which
     * the first author(s) published the infraspecific plant/animal name (of any rank).
     */
    val authorDescription: String?
}

/**
 * SubstanceSourceMaterialOrganismAuthor
 *
 * 4.9.13.6.1 Author type (Conditional)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganismAuthor</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterialOrganismAuthor")
data class SubstanceSourceMaterialOrganismAuthor(

    @SerialName("authorType")
    override val authorType: CodeableConcept? = null,

    @SerialName("authorDescription")
    override val authorDescription: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSourceMaterialOrganismAuthor {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterialOrganismAuthor"
    }
}

/**
 * FhirSubstanceSourceMaterialOrganismHybrid
 *
 * 4.9.13.8.1 Hybrid species maternal organism ID (Optional)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganismHybrid</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterialOrganismHybrid : FhirBackboneElement {

    /**
     * The identifier of the maternal species constituting the hybrid organism shall be
     * specified based on a controlled vocabulary. For plants, the parents aren’t
     * always known, and it is unlikely that it will be known which is maternal and
     * which is paternal.
     */
    val maternalOrganismId: String?

    /**
     * The name of the maternal species constituting the hybrid organism shall be
     * specified. For plants, the parents aren’t always known, and it is unlikely that
     * it will be known which is maternal and which is paternal.
     */
    val maternalOrganismName: String?

    /**
     * The identifier of the paternal species constituting the hybrid organism shall be
     * specified based on a controlled vocabulary.
     */
    val paternalOrganismId: String?

    /**
     * The name of the paternal species constituting the hybrid organism shall be
     * specified.
     */
    val paternalOrganismName: String?

    /**
     * The hybrid type of an organism shall be specified.
     */
    val hybridType: CodeableConcept?
}

/**
 * SubstanceSourceMaterialOrganismHybrid
 *
 * 4.9.13.8.1 Hybrid species maternal organism ID (Optional)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganismHybrid</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterialOrganismHybrid")
data class SubstanceSourceMaterialOrganismHybrid(

    @SerialName("maternalOrganismId")
    override val maternalOrganismId: String? = null,

    @SerialName("maternalOrganismName")
    override val maternalOrganismName: String? = null,

    @SerialName("paternalOrganismId")
    override val paternalOrganismId: String? = null,

    @SerialName("paternalOrganismName")
    override val paternalOrganismName: String? = null,

    @SerialName("hybridType")
    override val hybridType: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSourceMaterialOrganismHybrid {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterialOrganismHybrid"
    }
}

/**
 * FhirSubstanceSourceMaterialOrganismOrganismGeneral
 *
 * 4.9.13.7.1 Kingdom (Conditional)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganismOrganismGeneral</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterialOrganismOrganismGeneral : FhirBackboneElement {

    /**
     * The kingdom of an organism shall be specified.
     */
    val kingdom: CodeableConcept?

    /**
     * The phylum of an organism shall be specified.
     */
    val phylum: CodeableConcept?

    /**
     * The class of an organism shall be specified.
     */
    val clazz: CodeableConcept?

    /**
     * The order of an organism shall be specified,.
     */
    val order: CodeableConcept?
}

/**
 * SubstanceSourceMaterialOrganismOrganismGeneral
 *
 * 4.9.13.7.1 Kingdom (Conditional)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialOrganismOrganismGeneral</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterialOrganismOrganismGeneral")
data class SubstanceSourceMaterialOrganismOrganismGeneral(

    @SerialName("kingdom")
    override val kingdom: CodeableConcept? = null,

    @SerialName("phylum")
    override val phylum: CodeableConcept? = null,

    @SerialName("class")
    override val clazz: CodeableConcept? = null,

    @SerialName("order")
    override val order: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSourceMaterialOrganismOrganismGeneral {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterialOrganismOrganismGeneral"
    }
}

/**
 * FhirSubstanceSourceMaterialPartDescription
 *
 * To do
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialPartDescription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
interface FhirSubstanceSourceMaterialPartDescription : FhirBackboneElement {

    /**
     * Entity of anatomical origin of source material within an organism.
     */
    val part: CodeableConcept?

    /**
     * The detailed anatomic location when the part can be extracted from different
     * anatomical locations of the organism. Multiple alternative locations may apply.
     */
    val partLocation: CodeableConcept?
}

/**
 * SubstanceSourceMaterialPartDescription
 *
 * To do
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial">SubstanceSourceMaterialPartDescription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSourceMaterial)
 */
@Serializable
@SerialName("SubstanceSourceMaterialPartDescription")
data class SubstanceSourceMaterialPartDescription(

    @SerialName("part")
    override val part: CodeableConcept? = null,

    @SerialName("partLocation")
    override val partLocation: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSourceMaterialPartDescription {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSourceMaterialPartDescription"
    }
}
