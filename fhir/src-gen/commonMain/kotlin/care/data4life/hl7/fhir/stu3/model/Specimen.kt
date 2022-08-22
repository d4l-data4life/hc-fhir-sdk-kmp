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

import care.data4life.hl7.fhir.stu3.codesystem.SpecimenStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSpecimen
 *
 * A sample to be used for analysis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">Specimen</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
interface FhirSpecimen : FhirDomainResource {

    /**
     * External Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Identifier assigned by the lab.
     */
    val accessionIdentifier: Identifier?

    /**
     * The availability of the specimen.
     */
    val status: SpecimenStatus?

    /**
     * Kind of material that forms the specimen.
     */
    val type: CodeableConcept?

    /**
     * Where the specimen came from. This may be from the patient(s) or from the
     * environment or a device.
     */
    val subject: Reference

    /**
     * The time when specimen was received for processing.
     */
    val receivedTime: DateTime?

    /**
     * Specimen from which this specimen originated.
     */
    val parent: kotlin.collections.List<Reference>?

    /**
     * Why the specimen was collected.
     */
    val request: kotlin.collections.List<Reference>?

    /**
     * Collection details.
     */
    val collection: SpecimenCollection?

    /**
     * Processing and processing step details.
     */
    val processing: kotlin.collections.List<SpecimenProcessing>?

    /**
     * Direct container of specimen (tube/slide, etc.).
     */
    val container: kotlin.collections.List<SpecimenContainer>?

    /**
     * Comments.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * Specimen
 *
 * A sample to be used for analysis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">Specimen</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
@Serializable
@SerialName("Specimen")
data class Specimen(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("accessionIdentifier")
    override val accessionIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: SpecimenStatus? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("receivedTime")
    override val receivedTime: DateTime? = null,

    @SerialName("parent")
    override val parent: kotlin.collections.List<Reference>? = null,

    @SerialName("request")
    override val request: kotlin.collections.List<Reference>? = null,

    @SerialName("collection")
    override val collection: SpecimenCollection? = null,

    @SerialName("processing")
    override val processing: kotlin.collections.List<SpecimenProcessing>? = null,

    @SerialName("container")
    override val container: kotlin.collections.List<SpecimenContainer>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

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
) : FhirSpecimen {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Specimen"
    }
}

/**
 * FhirSpecimenCollection
 *
 * Details concerning the specimen collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenCollection</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
interface FhirSpecimenCollection : FhirBackboneElement {

    /**
     * Who collected the specimen.
     */
    val collector: Reference?

    /**
     * Collection time.
     */
    val collectedDateTime: DateTime?

    /**
     * Collection time.
     */
    val collectedPeriod: Period?

    /**
     * The quantity of specimen collected.
     */
    val quantity: Quantity?

    /**
     * Technique used to perform collection.
     */
    val method: CodeableConcept?

    /**
     * Anatomical collection site.
     */
    val bodySite: CodeableConcept?
}

/**
 * SpecimenCollection
 *
 * Details concerning the specimen collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenCollection</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
@Serializable
@SerialName("SpecimenCollection")
data class SpecimenCollection(

    @SerialName("collector")
    override val collector: Reference? = null,

    @SerialName("collectedDateTime")
    override val collectedDateTime: DateTime? = null,

    @SerialName("collectedPeriod")
    override val collectedPeriod: Period? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSpecimenCollection {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SpecimenCollection"
    }
}

/**
 * FhirSpecimenContainer
 *
 * The container holding the specimen. The recursive nature of containers; i.e. blood in tube in tray
 * in rack is not addressed here.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenContainer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
interface FhirSpecimenContainer : FhirBackboneElement {

    /**
     * Id for the container.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Textual description of the container.
     */
    val description: String?

    /**
     * Kind of container directly associated with specimen.
     */
    val type: CodeableConcept?

    /**
     * Container volume or size.
     */
    val capacity: Quantity?

    /**
     * Quantity of specimen within container.
     */
    val specimenQuantity: Quantity?

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
 * SpecimenContainer
 *
 * The container holding the specimen. The recursive nature of containers; i.e. blood in tube in tray
 * in rack is not addressed here.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenContainer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
@Serializable
@SerialName("SpecimenContainer")
data class SpecimenContainer(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("capacity")
    override val capacity: Quantity? = null,

    @SerialName("specimenQuantity")
    override val specimenQuantity: Quantity? = null,

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
) : FhirSpecimenContainer {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SpecimenContainer"
    }
}

/**
 * FhirSpecimenProcessing
 *
 * Details concerning processing and processing steps for the specimen.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenProcessing</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
interface FhirSpecimenProcessing : FhirBackboneElement {

    /**
     * Textual description of procedure.
     */
    val description: String?

    /**
     * Indicates the treatment step applied to the specimen.
     */
    val procedure: CodeableConcept?

    /**
     * Material used in the processing step.
     */
    val additive: kotlin.collections.List<Reference>?

    /**
     * Date and time of specimen processing.
     */
    val timeDateTime: DateTime?

    /**
     * Date and time of specimen processing.
     */
    val timePeriod: Period?
}

/**
 * SpecimenProcessing
 *
 * Details concerning processing and processing steps for the specimen.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenProcessing</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
@Serializable
@SerialName("SpecimenProcessing")
data class SpecimenProcessing(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("procedure")
    override val procedure: CodeableConcept? = null,

    @SerialName("additive")
    override val additive: kotlin.collections.List<Reference>? = null,

    @SerialName("timeDateTime")
    override val timeDateTime: DateTime? = null,

    @SerialName("timePeriod")
    override val timePeriod: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSpecimenProcessing {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SpecimenProcessing"
    }
}
