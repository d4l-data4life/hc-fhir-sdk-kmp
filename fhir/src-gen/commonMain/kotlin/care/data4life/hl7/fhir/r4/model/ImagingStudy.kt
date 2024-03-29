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

import care.data4life.hl7.fhir.r4.codesystem.ImagingStudyStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirImagingStudy
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series,
 * each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data)
 * acquired or produced in a common context. A series is of only one modality (e.g. X-ray, CT, MR,
 * ultrasound), but a study may have multiple series of different modalities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudy</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudy : FhirDomainResource {

    /**
     * Identifiers for the whole study.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The current state of the ImagingStudy.
     */
    val status: ImagingStudyStatus

    /**
     * All series modality if actual acquisition modalities.
     */
    val modality: kotlin.collections.List<Coding>?

    /**
     * Who or what is the subject of the study.
     */
    val subject: Reference

    /**
     * Encounter with which this imaging study is associated.
     */
    val encounter: Reference?

    /**
     * When the study was started.
     */
    val started: DateTime?

    /**
     * Request fulfilled.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Referring physician.
     */
    val referrer: Reference?

    /**
     * Who interpreted images.
     */
    val interpreter: kotlin.collections.List<Reference>?

    /**
     * Study access endpoint.
     */
    val endpoint: kotlin.collections.List<Reference>?

    /**
     * Number of Study Related Series.
     */
    val numberOfSeries: UnsignedInteger?

    /**
     * Number of Study Related Instances.
     */
    val numberOfInstances: UnsignedInteger?

    /**
     * The performed Procedure reference.
     */
    val procedureReference: Reference?

    /**
     * The performed procedure code.
     */
    val procedureCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Where ImagingStudy occurred.
     */
    val location: Reference?

    /**
     * Why the study was requested.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why was study performed.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * User-defined comments.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Institution-generated description.
     */
    val description: String?

    /**
     * Each study has one or more series of instances.
     */
    val series: kotlin.collections.List<ImagingStudySeries>?
}

/**
 * ImagingStudy
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series,
 * each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data)
 * acquired or produced in a common context. A series is of only one modality (e.g. X-ray, CT, MR,
 * ultrasound), but a study may have multiple series of different modalities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudy</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
@Serializable
@SerialName("ImagingStudy")
data class ImagingStudy(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: ImagingStudyStatus,

    @SerialName("modality")
    override val modality: kotlin.collections.List<Coding>? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("started")
    override val started: DateTime? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("referrer")
    override val referrer: Reference? = null,

    @SerialName("interpreter")
    override val interpreter: kotlin.collections.List<Reference>? = null,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

    @SerialName("numberOfSeries")
    override val numberOfSeries: UnsignedInteger? = null,

    @SerialName("numberOfInstances")
    override val numberOfInstances: UnsignedInteger? = null,

    @SerialName("procedureReference")
    override val procedureReference: Reference? = null,

    @SerialName("procedureCode")
    override val procedureCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("series")
    override val series: kotlin.collections.List<ImagingStudySeries>? = null,

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
) : FhirImagingStudy {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImagingStudy"
    }
}

/**
 * FhirImagingStudySeries
 *
 * Each study has one or more series of images or other content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeries</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudySeries : FhirBackboneElement {

    /**
     * DICOM Series Instance UID for the series.
     */
    val uid: String

    /**
     * Numeric identifier of this series.
     */
    val number: UnsignedInteger?

    /**
     * The modality of the instances in the series.
     */
    val modality: Coding

    /**
     * A short human readable summary of the series.
     */
    val description: String?

    /**
     * Number of Series Related Instances.
     */
    val numberOfInstances: UnsignedInteger?

    /**
     * Series access endpoint.
     */
    val endpoint: kotlin.collections.List<Reference>?

    /**
     * Body part examined.
     */
    val bodySite: Coding?

    /**
     * Body part laterality.
     */
    val laterality: Coding?

    /**
     * Specimen imaged.
     */
    val specimen: kotlin.collections.List<Reference>?

    /**
     * When the series started.
     */
    val started: DateTime?

    /**
     * Who performed the series.
     */
    val performer: kotlin.collections.List<ImagingStudySeriesPerformer>?

    /**
     * A single SOP instance from the series.
     */
    val instance: kotlin.collections.List<ImagingStudySeriesInstance>?
}

/**
 * ImagingStudySeries
 *
 * Each study has one or more series of images or other content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeries</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
@Serializable
@SerialName("ImagingStudySeries")
data class ImagingStudySeries(

    @SerialName("uid")
    override val uid: String,

    @SerialName("number")
    override val number: UnsignedInteger? = null,

    @SerialName("modality")
    override val modality: Coding,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("numberOfInstances")
    override val numberOfInstances: UnsignedInteger? = null,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: Coding? = null,

    @SerialName("laterality")
    override val laterality: Coding? = null,

    @SerialName("specimen")
    override val specimen: kotlin.collections.List<Reference>? = null,

    @SerialName("started")
    override val started: DateTime? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<ImagingStudySeriesPerformer>? = null,

    @SerialName("instance")
    override val instance: kotlin.collections.List<ImagingStudySeriesInstance>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImagingStudySeries {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImagingStudySeries"
    }
}

/**
 * FhirImagingStudySeriesInstance
 *
 * A single SOP instance within the series, e.g. an image, or presentation state.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeriesInstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudySeriesInstance : FhirBackboneElement {

    /**
     * DICOM SOP Instance UID.
     */
    val uid: String

    /**
     * DICOM class type.
     */
    val sopClass: Coding

    /**
     * The number of this instance in the series.
     */
    val number: UnsignedInteger?

    /**
     * Description of instance.
     */
    val title: String?
}

/**
 * ImagingStudySeriesInstance
 *
 * A single SOP instance within the series, e.g. an image, or presentation state.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeriesInstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
@Serializable
@SerialName("ImagingStudySeriesInstance")
data class ImagingStudySeriesInstance(

    @SerialName("uid")
    override val uid: String,

    @SerialName("sopClass")
    override val sopClass: Coding,

    @SerialName("number")
    override val number: UnsignedInteger? = null,

    @SerialName("title")
    override val title: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImagingStudySeriesInstance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImagingStudySeriesInstance"
    }
}

/**
 * FhirImagingStudySeriesPerformer
 *
 * Indicates who or what performed the series and how they were involved.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeriesPerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudySeriesPerformer : FhirBackboneElement {

    /**
     * Type of performance.
     */
    val function: CodeableConcept?

    /**
     * Who performed the series.
     */
    val actor: Reference
}

/**
 * ImagingStudySeriesPerformer
 *
 * Indicates who or what performed the series and how they were involved.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeriesPerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
@Serializable
@SerialName("ImagingStudySeriesPerformer")
data class ImagingStudySeriesPerformer(

    @SerialName("function")
    override val function: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImagingStudySeriesPerformer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImagingStudySeriesPerformer"
    }
}
