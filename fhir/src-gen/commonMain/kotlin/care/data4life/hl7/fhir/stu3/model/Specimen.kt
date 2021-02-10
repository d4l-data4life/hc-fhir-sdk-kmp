/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirSpecimen : FhirDomainResource {

    // External Identifier.
    val identifier: List<Identifier>?

    // Identifier assigned by the lab.
    val accessionIdentifier: Identifier?

    // The availability of the specimen.
    val status: SpecimenStatus?

    // Kind of material that forms the specimen.
    val type: CodeableConcept?

    // Where the specimen came from. This may be from the patient(s) or from the environment or a device.
    val subject: Reference

    // The time when specimen was received for processing.
    val receivedTime: DateTime?

    // Specimen from which this specimen originated.
    val parent: List<Reference>?

    // Why the specimen was collected.
    val request: List<Reference>?

    // Collection details.
    val collection: SpecimenCollection?

    // Processing and processing step details.
    val processing: List<SpecimenProcessing>?

    // Direct container of specimen (tube/slide, etc.).
    val container: List<SpecimenContainer>?

    // Comments.
    val note: List<Annotation>?
}


/**
 * ClassName: Specimen
 *
 * SourceFileName: Specimen.kt
 *
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

    // External Identifier.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Identifier assigned by the lab.
    @SerialName("accessionIdentifier")
    override val accessionIdentifier: Identifier? = null,
    // The availability of the specimen.
    @SerialName("status")
    override val status: SpecimenStatus? = null,
    // Kind of material that forms the specimen.
    @SerialName("type")
    override val type: CodeableConcept? = null,
    // Where the specimen came from. This may be from the patient(s) or from the environment or a device.
    @SerialName("subject")
    override val subject: Reference,
    // The time when specimen was received for processing.
    @SerialName("receivedTime")
    override val receivedTime: DateTime? = null,
    // Specimen from which this specimen originated.
    @SerialName("parent")
    override val parent: List<Reference>? = null,
    // Why the specimen was collected.
    @SerialName("request")
    override val request: List<Reference>? = null,
    // Collection details.
    @SerialName("collection")
    override val collection: SpecimenCollection? = null,
    // Processing and processing step details.
    @SerialName("processing")
    override val processing: List<SpecimenProcessing>? = null,
    // Direct container of specimen (tube/slide, etc.).
    @SerialName("container")
    override val container: List<SpecimenContainer>? = null,
    // Comments.
    @SerialName("note")
    override val note: List<Annotation>? = null,


    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
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


interface FhirSpecimenCollection : FhirBackboneElement {

    // Who collected the specimen.
    val collector: Reference?

    // Collection time.
    val collectedDateTime: DateTime?

    // Collection time.
    val collectedPeriod: Period?

    // The quantity of specimen collected.
    val quantity: Quantity?

    // Technique used to perform collection.
    val method: CodeableConcept?

    // Anatomical collection site.
    val bodySite: CodeableConcept?
}


/**
 * ClassName: SpecimenCollection
 *
 * SourceFileName: Specimen.kt
 *
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

    // Who collected the specimen.
    @SerialName("collector")
    override val collector: Reference? = null,
    // Collection time.
    @SerialName("collectedDateTime")
    override val collectedDateTime: DateTime? = null,
    // Collection time.
    @SerialName("collectedPeriod")
    override val collectedPeriod: Period? = null,
    // The quantity of specimen collected.
    @SerialName("quantity")
    override val quantity: Quantity? = null,
    // Technique used to perform collection.
    @SerialName("method")
    override val method: CodeableConcept? = null,
    // Anatomical collection site.
    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSpecimenCollection {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SpecimenCollection"
    }
}


interface FhirSpecimenContainer : FhirBackboneElement {

    // Id for the container.
    val identifier: List<Identifier>?

    // Textual description of the container.
    val description: String?

    // Kind of container directly associated with specimen.
    val type: CodeableConcept?

    // Container volume or size.
    val capacity: Quantity?

    // Quantity of specimen within container.
    val specimenQuantity: Quantity?

    // Additive associated with container.
    val additiveCodeableConcept: CodeableConcept?

    // Additive associated with container.
    val additiveReference: Reference?
}


/**
 * ClassName: SpecimenContainer
 *
 * SourceFileName: Specimen.kt
 *
 *
 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Specimen">SpecimenContainer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Specimen)
 */
@Serializable
@SerialName("SpecimenContainer")
data class SpecimenContainer(

    // Id for the container.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Textual description of the container.
    @SerialName("description")
    override val description: String? = null,
    // Kind of container directly associated with specimen.
    @SerialName("type")
    override val type: CodeableConcept? = null,
    // Container volume or size.
    @SerialName("capacity")
    override val capacity: Quantity? = null,
    // Quantity of specimen within container.
    @SerialName("specimenQuantity")
    override val specimenQuantity: Quantity? = null,
    // Additive associated with container.
    @SerialName("additiveCodeableConcept")
    override val additiveCodeableConcept: CodeableConcept? = null,
    // Additive associated with container.
    @SerialName("additiveReference")
    override val additiveReference: Reference? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSpecimenContainer {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SpecimenContainer"
    }
}


interface FhirSpecimenProcessing : FhirBackboneElement {

    // Textual description of procedure.
    val description: String?

    // Indicates the treatment step  applied to the specimen.
    val procedure: CodeableConcept?

    // Material used in the processing step.
    val additive: List<Reference>?

    // Date and time of specimen processing.
    val timeDateTime: DateTime?

    // Date and time of specimen processing.
    val timePeriod: Period?
}


/**
 * ClassName: SpecimenProcessing
 *
 * SourceFileName: Specimen.kt
 *
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

    // Textual description of procedure.
    @SerialName("description")
    override val description: String? = null,
    // Indicates the treatment step  applied to the specimen.
    @SerialName("procedure")
    override val procedure: CodeableConcept? = null,
    // Material used in the processing step.
    @SerialName("additive")
    override val additive: List<Reference>? = null,
    // Date and time of specimen processing.
    @SerialName("timeDateTime")
    override val timeDateTime: DateTime? = null,
    // Date and time of specimen processing.
    @SerialName("timePeriod")
    override val timePeriod: Period? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSpecimenProcessing {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SpecimenProcessing"
    }
}

