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

import care.data4life.hl7.fhir.r4.codesystem.MedicationStatementStatusCodes
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMedicationStatement
 *
 * A record of a medication that is being consumed by a patient. A MedicationStatement may indicate
 * that the patient may be taking the medication now or has taken the medication in the past or will be
 * taking the medication in the future. The source of this information can be the patient, significant
 * other (such as a family member or spouse), or a clinician. A common scenario where this information
 * is captured is during the history taking process during a patient visit or stay. The medication
 * information may come from sources such as the patient's memory, from a prescription bottle, or from
 * a list of medications the patient, clinician or other party maintains.   The primary difference
 * between a medication statement and a medication administration is that the medication administration
 * has complete administration information and is based on actual administration information from the
 * person who administered the medication. A medication statement is often, if not always, less
 * specific. There is no required date/time when the medication was administered, in fact we only know
 * that a source has reported the patient is taking this medication, where details such as time,
 * quantity, or rate or even medication product may be incomplete or missing or less precise. As stated
 * earlier, the medication statement information may come from the patient's memory, from a
 * prescription bottle or from a list of medications the patient, clinician or other party maintains.
 * Medication administration is more formal and is not missing detailed information.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationStatement">MedicationStatement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationStatement)
 */
interface FhirMedicationStatement : FhirDomainResource {

    /**
     * External identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Fulfils plan, proposal or order.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Part of referenced event.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * A code representing the patient or other source's judgment about the state of
     * the medication used that this statement is about. Generally, this will be active
     * or completed.
     */
    val status: MedicationStatementStatusCodes

    /**
     * Reason for current status.
     */
    val statusReason: kotlin.collections.List<CodeableConcept>?

    /**
     * Type of medication usage.
     */
    val category: CodeableConcept?

    /**
     * What medication was taken.
     */
    val medicationCodeableConcept: CodeableConcept?

    /**
     * What medication was taken.
     */
    val medicationReference: Reference?

    /**
     * Who is/was taking the medication.
     */
    val subject: Reference

    /**
     * Encounter / Episode associated with MedicationStatement.
     */
    val context: Reference?

    /**
     * The date/time or interval when the medication is/was/will be taken.
     */
    val effectiveDateTime: DateTime?

    /**
     * The date/time or interval when the medication is/was/will be taken.
     */
    val effectivePeriod: Period?

    /**
     * When the statement was asserted?.
     */
    val dateAsserted: DateTime?

    /**
     * Person or organization that provided the information about the taking of this
     * medication.
     */
    val informationSource: Reference?

    /**
     * Additional supporting information.
     */
    val derivedFrom: kotlin.collections.List<Reference>?

    /**
     * Reason for why the medication is being/was taken.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Condition or observation that supports why the medication is being/was taken.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Further information about the statement.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Details of how medication is/was taken or should be taken.
     */
    val dosage: kotlin.collections.List<Dosage>?
}

/**
 * MedicationStatement
 *
 * A record of a medication that is being consumed by a patient. A MedicationStatement may indicate
 * that the patient may be taking the medication now or has taken the medication in the past or will be
 * taking the medication in the future. The source of this information can be the patient, significant
 * other (such as a family member or spouse), or a clinician. A common scenario where this information
 * is captured is during the history taking process during a patient visit or stay. The medication
 * information may come from sources such as the patient's memory, from a prescription bottle, or from
 * a list of medications the patient, clinician or other party maintains.   The primary difference
 * between a medication statement and a medication administration is that the medication administration
 * has complete administration information and is based on actual administration information from the
 * person who administered the medication. A medication statement is often, if not always, less
 * specific. There is no required date/time when the medication was administered, in fact we only know
 * that a source has reported the patient is taking this medication, where details such as time,
 * quantity, or rate or even medication product may be incomplete or missing or less precise. As stated
 * earlier, the medication statement information may come from the patient's memory, from a
 * prescription bottle or from a list of medications the patient, clinician or other party maintains.
 * Medication administration is more formal and is not missing detailed information.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationStatement">MedicationStatement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationStatement)
 */
@Serializable
@SerialName("MedicationStatement")
data class MedicationStatement(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: MedicationStatementStatusCodes,

    @SerialName("statusReason")
    override val statusReason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("medicationCodeableConcept")
    override val medicationCodeableConcept: CodeableConcept? = null,

    @SerialName("medicationReference")
    override val medicationReference: Reference? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("dateAsserted")
    override val dateAsserted: DateTime? = null,

    @SerialName("informationSource")
    override val informationSource: Reference? = null,

    @SerialName("derivedFrom")
    override val derivedFrom: kotlin.collections.List<Reference>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("dosage")
    override val dosage: kotlin.collections.List<Dosage>? = null,

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
) : FhirMedicationStatement {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationStatement"
    }
}
