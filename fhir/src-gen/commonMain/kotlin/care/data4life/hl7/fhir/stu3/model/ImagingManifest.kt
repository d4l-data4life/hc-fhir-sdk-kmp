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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirImagingManifest
 *
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or
 * significance of, the selection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
interface FhirImagingManifest : FhirDomainResource {

    /**
     * SOP Instance UID.
     */
    val identifier: Identifier?

    /**
     * Patient of the selected objects.
     */
    val patient: Reference

    /**
     * Time when the selection of instances was made.
     */
    val authoringTime: DateTime?

    /**
     * Author (human or machine).
     */
    val author: Reference?

    /**
     * Description text.
     */
    val description: String?

    /**
     * Study identity of the selected instances.
     */
    val study: kotlin.collections.List<ImagingManifestStudy>
}

/**
 * ImagingManifest
 *
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or
 * significance of, the selection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
@Serializable
@SerialName("ImagingManifest")
data class ImagingManifest(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("authoringTime")
    override val authoringTime: DateTime? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("study")
    override val study: kotlin.collections.List<ImagingManifestStudy>,

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
) : FhirImagingManifest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingManifest"
    }
}

/**
 * FhirImagingManifestStudy
 *
 * Study identity and locating information of the DICOM SOP instances in the selection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifestStudy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
interface FhirImagingManifestStudy : FhirBackboneElement {

    /**
     * Study instance UID.
     */
    val uid: String

    /**
     * Reference to ImagingStudy.
     */
    val imagingStudy: Reference?

    /**
     * Study access service endpoint.
     */
    val endpoint: kotlin.collections.List<Reference>?

    /**
     * Series identity of the selected instances.
     */
    val series: kotlin.collections.List<ImagingManifestStudySeries>
}

/**
 * ImagingManifestStudy
 *
 * Study identity and locating information of the DICOM SOP instances in the selection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifestStudy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
@Serializable
@SerialName("ImagingManifestStudy")
data class ImagingManifestStudy(

    @SerialName("uid")
    override val uid: String,

    @SerialName("imagingStudy")
    override val imagingStudy: Reference? = null,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

    @SerialName("series")
    override val series: kotlin.collections.List<ImagingManifestStudySeries>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImagingManifestStudy {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingManifestStudy"
    }
}

/**
 * FhirImagingManifestStudySeries
 *
 * Series identity and locating information of the DICOM SOP instances in the selection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifestStudySeries</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
interface FhirImagingManifestStudySeries : FhirBackboneElement {

    /**
     * Series instance UID.
     */
    val uid: String

    /**
     * Series access endpoint.
     */
    val endpoint: kotlin.collections.List<Reference>?

    /**
     * The selected instance.
     */
    val instance: kotlin.collections.List<ImagingManifestStudySeriesInstance>
}

/**
 * ImagingManifestStudySeries
 *
 * Series identity and locating information of the DICOM SOP instances in the selection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifestStudySeries</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
@Serializable
@SerialName("ImagingManifestStudySeries")
data class ImagingManifestStudySeries(

    @SerialName("uid")
    override val uid: String,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

    @SerialName("instance")
    override val instance: kotlin.collections.List<ImagingManifestStudySeriesInstance>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImagingManifestStudySeries {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingManifestStudySeries"
    }
}

/**
 * FhirImagingManifestStudySeriesInstance
 *
 * Identity and locating information of the selected DICOM SOP instances.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifestStudySeriesInstance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
interface FhirImagingManifestStudySeriesInstance : FhirBackboneElement {

    /**
     * SOP class UID of instance.
     */
    val sopClass: String

    /**
     * Selected instance UID.
     */
    val uid: String
}

/**
 * ImagingManifestStudySeriesInstance
 *
 * Identity and locating information of the selected DICOM SOP instances.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImagingManifest">ImagingManifestStudySeriesInstance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImagingManifest)
 */
@Serializable
@SerialName("ImagingManifestStudySeriesInstance")
data class ImagingManifestStudySeriesInstance(

    @SerialName("sopClass")
    override val sopClass: String,

    @SerialName("uid")
    override val uid: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImagingManifestStudySeriesInstance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImagingManifestStudySeriesInstance"
    }
}
