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

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudy : FhirDomainResource {

    /**
     * Formal DICOM identifier for the study.
     */
    val uid: String

    /**
     * Related workflow identifier ("Accession Number").
     */
    val accession: Identifier?

    /**
     * Other identifiers for the study.
     */
    val identifier: List<Identifier>?

    /**
     * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE.
     */
    val availability: String?

    /**
     * All series modality if actual acquisition modalities.
     */
    val modalityList: List<Coding>?

    /**
     * Who the images are of.
     */
    val patient: Reference

    /**
     * Originating context.
     */
    val context: Reference?

    /**
     * When the study was started.
     */
    val started: DateTime?

    /**
     * Request fulfilled.
     */
    val basedOn: List<Reference>?

    /**
     * Referring physician.
     */
    val referrer: Reference?

    /**
     * Who interpreted images.
     */
    val interpreter: List<Reference>?

    /**
     * Study access endpoint.
     */
    val endpoint: List<Reference>?

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
    val procedureReference: List<Reference>?

    /**
     * The performed procedure code.
     */
    val procedureCode: List<CodeableConcept>?

    /**
     * Why the study was requested.
     */
    val reason: CodeableConcept?

    /**
     * Institution-generated description.
     */
    val description: String?

    /**
     * Each study has one or more series of instances.
     */
    val series: List<ImagingStudySeries>?
}

/**
 * ImagingStudy
 *
 * SourceFileName: ImagingStudy.kt
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series,
 * each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data)
 * acquired or produced in a common context. A series is of only one modality (e.g. X-ray, CT, MR,
 * ultrasound), but a study may have multiple series of different modalities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
@Serializable
@SerialName("ImagingStudy")
data class ImagingStudy(

    @SerialName("uid")
    override val uid: String,

    @SerialName("accession")
    override val accession: Identifier? = null,

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("availability")
    override val availability: String? = null,

    @SerialName("modalityList")
    override val modalityList: List<Coding>? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("started")
    override val started: DateTime? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("referrer")
    override val referrer: Reference? = null,

    @SerialName("interpreter")
    override val interpreter: List<Reference>? = null,

    @SerialName("endpoint")
    override val endpoint: List<Reference>? = null,

    @SerialName("numberOfSeries")
    override val numberOfSeries: UnsignedInteger? = null,

    @SerialName("numberOfInstances")
    override val numberOfInstances: UnsignedInteger? = null,

    @SerialName("procedureReference")
    override val procedureReference: List<Reference>? = null,

    @SerialName("procedureCode")
    override val procedureCode: List<CodeableConcept>? = null,

    @SerialName("reason")
    override val reason: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("series")
    override val series: List<ImagingStudySeries>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingStudy"
    }
}

/**
 * FhirImagingStudySeries
 *
 * Each study has one or more series of images or other content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeries</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudySeries : FhirBackboneElement {

    /**
     * Formal DICOM identifier for this series.
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
     * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE.
     */
    val availability: String?

    /**
     * Series access endpoint.
     */
    val endpoint: List<Reference>?

    /**
     * Body part examined.
     */
    val bodySite: Coding?

    /**
     * Body part laterality.
     */
    val laterality: Coding?

    /**
     * When the series started.
     */
    val started: DateTime?

    /**
     * Who performed the series.
     */
    val performer: List<Reference>?

    /**
     * A single SOP instance from the series.
     */
    val instance: List<ImagingStudySeriesInstance>?
}

/**
 * ImagingStudySeries
 *
 * SourceFileName: ImagingStudy.kt
 *
 * Each study has one or more series of images or other content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeries</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
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

    @SerialName("availability")
    override val availability: String? = null,

    @SerialName("endpoint")
    override val endpoint: List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: Coding? = null,

    @SerialName("laterality")
    override val laterality: Coding? = null,

    @SerialName("started")
    override val started: DateTime? = null,

    @SerialName("performer")
    override val performer: List<Reference>? = null,

    @SerialName("instance")
    override val instance: List<ImagingStudySeriesInstance>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirImagingStudySeries {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingStudySeries"
    }
}

/**
 * FhirImagingStudySeriesInstance
 *
 * A single SOP instance within the series, e.g. an image, or presentation state.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeriesInstance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
interface FhirImagingStudySeriesInstance : FhirBackboneElement {

    /**
     * Formal DICOM identifier for this instance.
     */
    val uid: String

    /**
     * The number of this instance in the series.
     */
    val number: UnsignedInteger?

    /**
     * DICOM class type.
     */
    val sopClass: String

    /**
     * Description of instance.
     */
    val title: String?
}

/**
 * ImagingStudySeriesInstance
 *
 * SourceFileName: ImagingStudy.kt
 *
 * A single SOP instance within the series, e.g. an image, or presentation state.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingStudy">ImagingStudySeriesInstance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingStudy)
 */
@Serializable
@SerialName("ImagingStudySeriesInstance")
data class ImagingStudySeriesInstance(

    @SerialName("uid")
    override val uid: String,

    @SerialName("number")
    override val number: UnsignedInteger? = null,

    @SerialName("sopClass")
    override val sopClass: String,

    @SerialName("title")
    override val title: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirImagingStudySeriesInstance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingStudySeriesInstance"
    }
}
