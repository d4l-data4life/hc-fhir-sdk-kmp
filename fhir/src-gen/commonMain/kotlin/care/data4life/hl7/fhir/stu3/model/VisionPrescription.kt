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

import care.data4life.hl7.fhir.stu3.codesystem.VisionBase
import care.data4life.hl7.fhir.stu3.codesystem.VisionEyes
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirVisionPrescription
 *
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescription</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
interface FhirVisionPrescription : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | cancelled | draft | entered-in-error.
     */
    val status: String?

    /**
     * Who prescription is for.
     */
    val patient: Reference?

    /**
     * Created during encounter / admission / stay.
     */
    val encounter: Reference?

    /**
     * When prescription was authorized.
     */
    val dateWritten: DateTime?

    /**
     * Who authorizes the vision product.
     */
    val prescriber: Reference?

    /**
     * Reason or indication for writing the prescription.
     */
    val reasonCodeableConcept: CodeableConcept?

    /**
     * Reason or indication for writing the prescription.
     */
    val reasonReference: Reference?

    /**
     * Vision supply authorization.
     */
    val dispense: kotlin.collections.List<VisionPrescriptionDispense>?
}

/**
 * VisionPrescription
 *
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescription</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
@Serializable
@SerialName("VisionPrescription")
data class VisionPrescription(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("dateWritten")
    override val dateWritten: DateTime? = null,

    @SerialName("prescriber")
    override val prescriber: Reference? = null,

    @SerialName("reasonCodeableConcept")
    override val reasonCodeableConcept: CodeableConcept? = null,

    @SerialName("reasonReference")
    override val reasonReference: Reference? = null,

    @SerialName("dispense")
    override val dispense: kotlin.collections.List<VisionPrescriptionDispense>? = null,

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
) : FhirVisionPrescription {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "VisionPrescription"
    }
}

/**
 * FhirVisionPrescriptionDispense
 *
 * Deals with details of the dispense part of the supply specification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescriptionDispense</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
interface FhirVisionPrescriptionDispense : FhirBackboneElement {

    /**
     * Product to be supplied.
     */
    val product: CodeableConcept?

    /**
     * The eye for which the lens applies.
     */
    val eye: VisionEyes?

    /**
     * Lens sphere.
     */
    val sphere: Decimal?

    /**
     * Lens cylinder.
     */
    val cylinder: Decimal?

    /**
     * Lens axis.
     */
    val axis: Integer?

    /**
     * Lens prism.
     */
    val prism: Decimal?

    /**
     * The relative base, or reference lens edge, for the prism.
     */
    val base: VisionBase?

    /**
     * Lens add.
     */
    val add: Decimal?

    /**
     * Contact lens power.
     */
    val power: Decimal?

    /**
     * Contact lens back curvature.
     */
    val backCurve: Decimal?

    /**
     * Contact lens diameter.
     */
    val diameter: Decimal?

    /**
     * Lens wear duration.
     */
    val duration: Quantity?

    /**
     * Color required.
     */
    val color: String?

    /**
     * Brand required.
     */
    val brand: String?

    /**
     * Notes for coatings.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * VisionPrescriptionDispense
 *
 * Deals with details of the dispense part of the supply specification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VisionPrescription">VisionPrescriptionDispense</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/VisionPrescription)
 */
@Serializable
@SerialName("VisionPrescriptionDispense")
data class VisionPrescriptionDispense(

    @SerialName("product")
    override val product: CodeableConcept? = null,

    @SerialName("eye")
    override val eye: VisionEyes? = null,

    @SerialName("sphere")
    override val sphere: Decimal? = null,

    @SerialName("cylinder")
    override val cylinder: Decimal? = null,

    @SerialName("axis")
    override val axis: Integer? = null,

    @SerialName("prism")
    override val prism: Decimal? = null,

    @SerialName("base")
    override val base: VisionBase? = null,

    @SerialName("add")
    override val add: Decimal? = null,

    @SerialName("power")
    override val power: Decimal? = null,

    @SerialName("backCurve")
    override val backCurve: Decimal? = null,

    @SerialName("diameter")
    override val diameter: Decimal? = null,

    @SerialName("duration")
    override val duration: Quantity? = null,

    @SerialName("color")
    override val color: String? = null,

    @SerialName("brand")
    override val brand: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirVisionPrescriptionDispense {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "VisionPrescriptionDispense"
    }
}
