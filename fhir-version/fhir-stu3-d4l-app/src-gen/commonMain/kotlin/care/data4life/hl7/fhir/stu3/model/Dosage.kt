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

import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDosage
 *
 * Indicates how the medication is/was taken or should be taken by the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Dosage">Dosage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Dosage)
 */
interface FhirDosage : FhirElement {

    /**
     * The order of the dosage instructions.
     */
    val sequence: Integer?

    /**
     * Free text dosage instructions e.g. SIG.
     */
    val text: String?

    /**
     * Supplemental instruction - e.g. "with meals".
     */
    val additionalInstruction: kotlin.collections.List<CodeableConcept>?

    /**
     * Patient or consumer oriented instructions.
     */
    val patientInstruction: String?

    /**
     * When medication should be administered.
     */
    val timing: Timing?

    /**
     * Take "as needed" (for x).
     */
    val asNeededBoolean: Bool?

    /**
     * Take "as needed" (for x).
     */
    val asNeededCodeableConcept: CodeableConcept?

    /**
     * Body site to administer to.
     */
    val site: CodeableConcept?

    /**
     * How drug should enter body.
     */
    val route: CodeableConcept?

    /**
     * Technique for administering medication.
     */
    val method: CodeableConcept?

    /**
     * Amount of medication per dose.
     */
    val doseRange: Range?

    /**
     * Amount of medication per dose.
     */
    val doseQuantity: Quantity?

    /**
     * Upper limit on medication per unit of time.
     */
    val maxDosePerPeriod: Ratio?

    /**
     * Upper limit on medication per administration.
     */
    val maxDosePerAdministration: Quantity?

    /**
     * Upper limit on medication per lifetime of the patient.
     */
    val maxDosePerLifetime: Quantity?

    /**
     * Amount of medication per unit of time.
     */
    val rateRatio: Ratio?

    /**
     * Amount of medication per unit of time.
     */
    val rateRange: Range?

    /**
     * Amount of medication per unit of time.
     */
    val rateQuantity: Quantity?
}

/**
 * Dosage
 *
 * Indicates how the medication is/was taken or should be taken by the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Dosage">Dosage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Dosage)
 */
@Serializable
@SerialName("Dosage")
data class Dosage(

    @SerialName("sequence")
    override val sequence: Integer? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("additionalInstruction")
    override val additionalInstruction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("patientInstruction")
    override val patientInstruction: String? = null,

    @SerialName("timing")
    override val timing: Timing? = null,

    @SerialName("asNeededBoolean")
    override val asNeededBoolean: Bool? = null,

    @SerialName("asNeededCodeableConcept")
    override val asNeededCodeableConcept: CodeableConcept? = null,

    @SerialName("site")
    override val site: CodeableConcept? = null,

    @SerialName("route")
    override val route: CodeableConcept? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("doseRange")
    override val doseRange: Range? = null,

    @SerialName("doseQuantity")
    override val doseQuantity: Quantity? = null,

    @SerialName("maxDosePerPeriod")
    override val maxDosePerPeriod: Ratio? = null,

    @SerialName("maxDosePerAdministration")
    override val maxDosePerAdministration: Quantity? = null,

    @SerialName("maxDosePerLifetime")
    override val maxDosePerLifetime: Quantity? = null,

    @SerialName("rateRatio")
    override val rateRatio: Ratio? = null,

    @SerialName("rateRange")
    override val rateRange: Range? = null,

    @SerialName("rateQuantity")
    override val rateQuantity: Quantity? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDosage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Dosage"
    }
}
