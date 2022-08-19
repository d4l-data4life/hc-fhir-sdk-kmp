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
 * FhirMedicinalProductIndication
 *
 * Indication for the Medicinal Product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication">MedicinalProductIndication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication)
 */
interface FhirMedicinalProductIndication : FhirDomainResource {

    /**
     * The medication for which this is an indication.
     */
    val subject: kotlin.collections.List<Reference>?

    /**
     * The disease, symptom or procedure that is the indication for treatment.
     */
    val diseaseSymptomProcedure: CodeableConcept?

    /**
     * The status of the disease or symptom for which the indication applies.
     */
    val diseaseStatus: CodeableConcept?

    /**
     * Comorbidity (concurrent condition) or co-infection as part of the indication.
     */
    val comorbidity: kotlin.collections.List<CodeableConcept>?

    /**
     * The intended effect, aim or strategy to be achieved by the indication.
     */
    val intendedEffect: CodeableConcept?

    /**
     * Timing or duration information as part of the indication.
     */
    val duration: Quantity?

    /**
     * Information about the use of the medicinal product in relation to other
     * therapies described as part of the indication.
     */
    val otherTherapy: kotlin.collections.List<MedicinalProductIndicationOtherTherapy>?

    /**
     * Describe the undesirable effects of the medicinal product.
     */
    val undesirableEffect: kotlin.collections.List<Reference>?

    /**
     * The population group to which this applies.
     */
    val population: kotlin.collections.List<Population>?
}

/**
 * MedicinalProductIndication
 *
 * Indication for the Medicinal Product.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication">MedicinalProductIndication</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication)
 */
@Serializable
@SerialName("MedicinalProductIndication")
data class MedicinalProductIndication(

    @SerialName("subject")
    override val subject: kotlin.collections.List<Reference>? = null,

    @SerialName("diseaseSymptomProcedure")
    override val diseaseSymptomProcedure: CodeableConcept? = null,

    @SerialName("diseaseStatus")
    override val diseaseStatus: CodeableConcept? = null,

    @SerialName("comorbidity")
    override val comorbidity: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("intendedEffect")
    override val intendedEffect: CodeableConcept? = null,

    @SerialName("duration")
    override val duration: Quantity? = null,

    @SerialName("otherTherapy")
    override val otherTherapy: kotlin.collections.List<MedicinalProductIndicationOtherTherapy>? = null,

    @SerialName("undesirableEffect")
    override val undesirableEffect: kotlin.collections.List<Reference>? = null,

    @SerialName("population")
    override val population: kotlin.collections.List<Population>? = null,

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
) : FhirMedicinalProductIndication {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIndication"
    }
}

/**
 * FhirMedicinalProductIndicationOtherTherapy
 *
 * Information about the use of the medicinal product in relation to other therapies described as part
 * of the indication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication">MedicinalProductIndicationOtherTherapy</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication)
 */
interface FhirMedicinalProductIndicationOtherTherapy : FhirBackboneElement {

    /**
     * The type of relationship between the medicinal product indication or
     * contraindication and another therapy.
     */
    val therapyRelationshipType: CodeableConcept

    /**
     * Reference to a specific medication (active substance, medicinal product or class
     * of products) as part of an indication or contraindication.
     */
    val medicationCodeableConcept: CodeableConcept?

    /**
     * Reference to a specific medication (active substance, medicinal product or class
     * of products) as part of an indication or contraindication.
     */
    val medicationReference: Reference?
}

/**
 * MedicinalProductIndicationOtherTherapy
 *
 * Information about the use of the medicinal product in relation to other therapies described as part
 * of the indication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication">MedicinalProductIndicationOtherTherapy</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIndication)
 */
@Serializable
@SerialName("MedicinalProductIndicationOtherTherapy")
data class MedicinalProductIndicationOtherTherapy(

    @SerialName("therapyRelationshipType")
    override val therapyRelationshipType: CodeableConcept,

    @SerialName("medicationCodeableConcept")
    override val medicationCodeableConcept: CodeableConcept? = null,

    @SerialName("medicationReference")
    override val medicationReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductIndicationOtherTherapy {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIndicationOtherTherapy"
    }
}
