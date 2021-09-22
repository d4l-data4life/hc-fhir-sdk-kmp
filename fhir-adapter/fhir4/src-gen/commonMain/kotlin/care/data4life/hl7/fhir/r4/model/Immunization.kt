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

import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirImmunization
 *
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunization : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates the current status of the immunization event.
     *
     * Only use: ['completed', 'entered-in-error', 'not-done']
     */
    val status: EventStatus

    /**
     * Reason not done.
     */
    val statusReason: CodeableConcept?

    /**
     * Vaccine product administered.
     */
    val vaccineCode: CodeableConcept

    /**
     * Who was immunized.
     */
    val patient: Reference

    /**
     * Encounter immunization was part of.
     */
    val encounter: Reference?

    /**
     * Vaccine administration date.
     */
    val occurrenceDateTime: DateTime?

    /**
     * Vaccine administration date.
     */
    val occurrenceString: String?

    /**
     * When the immunization was first captured in the subject's record.
     */
    val recorded: DateTime?

    /**
     * Indicates context the data was recorded in.
     */
    val primarySource: Bool?

    /**
     * Indicates the source of a secondarily reported record.
     */
    val reportOrigin: CodeableConcept?

    /**
     * Where immunization occurred.
     */
    val location: Reference?

    /**
     * Vaccine manufacturer.
     */
    val manufacturer: Reference?

    /**
     * Vaccine lot number.
     */
    val lotNumber: String?

    /**
     * Vaccine expiration date.
     */
    val expirationDate: Date?

    /**
     * Body site vaccine was administered.
     */
    val site: CodeableConcept?

    /**
     * How vaccine entered body.
     */
    val route: CodeableConcept?

    /**
     * Amount of vaccine administered.
     */
    val doseQuantity: Quantity?

    /**
     * Who performed event.
     */
    val performer: kotlin.collections.List<ImmunizationPerformer>?

    /**
     * Additional immunization notes.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Why immunization occurred.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why immunization occurred.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Dose potency.
     */
    val isSubpotent: Bool?

    /**
     * Reason for being subpotent.
     */
    val subpotentReason: kotlin.collections.List<CodeableConcept>?

    /**
     * Educational material presented to patient.
     */
    val education: kotlin.collections.List<ImmunizationEducation>?

    /**
     * Patient eligibility for a vaccination program.
     */
    val programEligibility: kotlin.collections.List<CodeableConcept>?

    /**
     * Funding source for the vaccine.
     */
    val fundingSource: CodeableConcept?

    /**
     * Details of a reaction that follows immunization.
     */
    val reaction: kotlin.collections.List<ImmunizationReaction>?

    /**
     * Protocol followed by the provider.
     */
    val protocolApplied: kotlin.collections.List<ImmunizationProtocolApplied>?
}

/**
 * Immunization
 *
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("Immunization")
data class Immunization(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: EventStatus,

    @SerialName("statusReason")
    override val statusReason: CodeableConcept? = null,

    @SerialName("vaccineCode")
    override val vaccineCode: CodeableConcept,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrenceString")
    override val occurrenceString: String? = null,

    @SerialName("recorded")
    override val recorded: DateTime? = null,

    @SerialName("primarySource")
    override val primarySource: Bool? = null,

    @SerialName("reportOrigin")
    override val reportOrigin: CodeableConcept? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("manufacturer")
    override val manufacturer: Reference? = null,

    @SerialName("lotNumber")
    override val lotNumber: String? = null,

    @SerialName("expirationDate")
    override val expirationDate: Date? = null,

    @SerialName("site")
    override val site: CodeableConcept? = null,

    @SerialName("route")
    override val route: CodeableConcept? = null,

    @SerialName("doseQuantity")
    override val doseQuantity: Quantity? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<ImmunizationPerformer>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("isSubpotent")
    override val isSubpotent: Bool? = null,

    @SerialName("subpotentReason")
    override val subpotentReason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("education")
    override val education: kotlin.collections.List<ImmunizationEducation>? = null,

    @SerialName("programEligibility")
    override val programEligibility: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("fundingSource")
    override val fundingSource: CodeableConcept? = null,

    @SerialName("reaction")
    override val reaction: kotlin.collections.List<ImmunizationReaction>? = null,

    @SerialName("protocolApplied")
    override val protocolApplied: kotlin.collections.List<ImmunizationProtocolApplied>? = null,

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
) : FhirImmunization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Immunization"
    }
}

/**
 * FhirImmunizationEducation
 *
 * Educational material presented to the patient (or guardian) at the time of vaccine administration.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationEducation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationEducation : FhirBackboneElement {

    /**
     * Educational material document identifier.
     */
    val documentType: String?

    /**
     * Educational material reference pointer.
     */
    val reference: String?

    /**
     * Educational material publication date.
     */
    val publicationDate: DateTime?

    /**
     * Educational material presentation date.
     */
    val presentationDate: DateTime?
}

/**
 * ImmunizationEducation
 *
 * Educational material presented to the patient (or guardian) at the time of vaccine administration.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationEducation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationEducation")
data class ImmunizationEducation(

    @SerialName("documentType")
    override val documentType: String? = null,

    @SerialName("reference")
    override val reference: String? = null,

    @SerialName("publicationDate")
    override val publicationDate: DateTime? = null,

    @SerialName("presentationDate")
    override val presentationDate: DateTime? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationEducation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationEducation"
    }
}

/**
 * FhirImmunizationPerformer
 *
 * Indicates who performed the immunization event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationPerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationPerformer : FhirBackboneElement {

    /**
     * What type of performance was done.
     */
    val function: CodeableConcept?

    /**
     * Individual or organization who was performing.
     */
    val actor: Reference
}

/**
 * ImmunizationPerformer
 *
 * Indicates who performed the immunization event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationPerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationPerformer")
data class ImmunizationPerformer(

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
) : FhirImmunizationPerformer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationPerformer"
    }
}

/**
 * FhirImmunizationProtocolApplied
 *
 * The protocol (set of recommendations) being followed by the provider who administered the dose.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationProtocolApplied</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationProtocolApplied : FhirBackboneElement {

    /**
     * Name of vaccine series.
     */
    val series: String?

    /**
     * Who is responsible for publishing the recommendations.
     */
    val authority: Reference?

    /**
     * Vaccine preventatable disease being targetted.
     */
    val targetDisease: kotlin.collections.List<CodeableConcept>?

    /**
     * Dose number within series.
     */
    val doseNumberPositiveInt: PositiveInteger?

    /**
     * Dose number within series.
     */
    val doseNumberString: String?

    /**
     * Recommended number of doses for immunity.
     */
    val seriesDosesPositiveInt: PositiveInteger?

    /**
     * Recommended number of doses for immunity.
     */
    val seriesDosesString: String?
}

/**
 * ImmunizationProtocolApplied
 *
 * The protocol (set of recommendations) being followed by the provider who administered the dose.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationProtocolApplied</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationProtocolApplied")
data class ImmunizationProtocolApplied(

    @SerialName("series")
    override val series: String? = null,

    @SerialName("authority")
    override val authority: Reference? = null,

    @SerialName("targetDisease")
    override val targetDisease: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("doseNumberPositiveInt")
    override val doseNumberPositiveInt: PositiveInteger? = null,

    @SerialName("doseNumberString")
    override val doseNumberString: String? = null,

    @SerialName("seriesDosesPositiveInt")
    override val seriesDosesPositiveInt: PositiveInteger? = null,

    @SerialName("seriesDosesString")
    override val seriesDosesString: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationProtocolApplied {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationProtocolApplied"
    }
}

/**
 * FhirImmunizationReaction
 *
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationReaction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationReaction : FhirBackboneElement {

    /**
     * When reaction started.
     */
    val date: DateTime?

    /**
     * Additional information on reaction.
     */
    val detail: Reference?

    /**
     * Indicates self-reported reaction.
     */
    val reported: Bool?
}

/**
 * ImmunizationReaction
 *
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationReaction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationReaction")
data class ImmunizationReaction(

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("detail")
    override val detail: Reference? = null,

    @SerialName("reported")
    override val reported: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationReaction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationReaction"
    }
}
