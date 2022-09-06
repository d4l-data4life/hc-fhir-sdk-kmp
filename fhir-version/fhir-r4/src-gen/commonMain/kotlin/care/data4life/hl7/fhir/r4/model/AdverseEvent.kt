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

import care.data4life.hl7.fhir.r4.codesystem.AdverseEventActuality
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirAdverseEvent
 *
 * Actual or potential/avoided event causing unintended physical injury resulting from or contributed
 * to by medical care, a research study or other healthcare setting factors that requires additional
 * monitoring, treatment, or hospitalization, or that results in death.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEvent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
interface FhirAdverseEvent : FhirDomainResource {

    /**
     * Business identifier for the event.
     */
    val identifier: Identifier?

    /**
     * Whether the event actually happened, or just had the potential to. Note that
     * this is independent of whether anyone was affected or harmed or how severely.
     */
    val actuality: AdverseEventActuality

    /**
     * product-problem | product-quality | product-use-error | wrong-dose | incorrect-
     * prescribing-information | wrong-technique | wrong-route-of-administration |
     * wrong-rate | wrong-duration | wrong-time | expired-drug | medical-device-use-
     * error | problem-different-manufacturer | unsafe-physical-environment.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Type of the event itself in relation to the subject.
     */
    val event: CodeableConcept?

    /**
     * Subject impacted by event.
     */
    val subject: Reference

    /**
     * Encounter created as part of.
     */
    val encounter: Reference?

    /**
     * When the event occurred.
     */
    val date: DateTime?

    /**
     * When the event was detected.
     */
    val detected: DateTime?

    /**
     * When the event was recorded.
     */
    val recordedDate: DateTime?

    /**
     * Effect on the subject due to this event.
     */
    val resultingCondition: kotlin.collections.List<Reference>?

    /**
     * Location where adverse event occurred.
     */
    val location: Reference?

    /**
     * Seriousness of the event.
     */
    val seriousness: CodeableConcept?

    /**
     * mild | moderate | severe.
     */
    val severity: CodeableConcept?

    /**
     * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown.
     */
    val outcome: CodeableConcept?

    /**
     * Who recorded the adverse event.
     */
    val recorder: Reference?

    /**
     * Who was involved in the adverse event or the potential adverse event.
     */
    val contributor: kotlin.collections.List<Reference>?

    /**
     * The suspected agent causing the adverse event.
     */
    val suspectEntity: kotlin.collections.List<AdverseEventSuspectEntity>?

    /**
     * AdverseEvent.subjectMedicalHistory.
     */
    val subjectMedicalHistory: kotlin.collections.List<Reference>?

    /**
     * AdverseEvent.referenceDocument.
     */
    val referenceDocument: kotlin.collections.List<Reference>?

    /**
     * AdverseEvent.study.
     */
    val study: kotlin.collections.List<Reference>?
}

/**
 * AdverseEvent
 *
 * Actual or potential/avoided event causing unintended physical injury resulting from or contributed
 * to by medical care, a research study or other healthcare setting factors that requires additional
 * monitoring, treatment, or hospitalization, or that results in death.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEvent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
@Serializable
@SerialName("AdverseEvent")
data class AdverseEvent(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("actuality")
    override val actuality: AdverseEventActuality,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("event")
    override val event: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("detected")
    override val detected: DateTime? = null,

    @SerialName("recordedDate")
    override val recordedDate: DateTime? = null,

    @SerialName("resultingCondition")
    override val resultingCondition: kotlin.collections.List<Reference>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("seriousness")
    override val seriousness: CodeableConcept? = null,

    @SerialName("severity")
    override val severity: CodeableConcept? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("contributor")
    override val contributor: kotlin.collections.List<Reference>? = null,

    @SerialName("suspectEntity")
    override val suspectEntity: kotlin.collections.List<AdverseEventSuspectEntity>? = null,

    @SerialName("subjectMedicalHistory")
    override val subjectMedicalHistory: kotlin.collections.List<Reference>? = null,

    @SerialName("referenceDocument")
    override val referenceDocument: kotlin.collections.List<Reference>? = null,

    @SerialName("study")
    override val study: kotlin.collections.List<Reference>? = null,

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
) : FhirAdverseEvent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "AdverseEvent"
    }
}

/**
 * FhirAdverseEventSuspectEntity
 *
 * Describes the entity that is suspected to have caused the adverse event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEventSuspectEntity</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
interface FhirAdverseEventSuspectEntity : FhirBackboneElement {

    /**
     * Refers to the specific entity that caused the adverse event.
     */
    val instance: Reference

    /**
     * Information on the possible cause of the event.
     */
    val causality: kotlin.collections.List<AdverseEventSuspectEntityCausality>?
}

/**
 * AdverseEventSuspectEntity
 *
 * Describes the entity that is suspected to have caused the adverse event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEventSuspectEntity</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
@Serializable
@SerialName("AdverseEventSuspectEntity")
data class AdverseEventSuspectEntity(

    @SerialName("instance")
    override val instance: Reference,

    @SerialName("causality")
    override val causality: kotlin.collections.List<AdverseEventSuspectEntityCausality>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirAdverseEventSuspectEntity {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "AdverseEventSuspectEntity"
    }
}

/**
 * FhirAdverseEventSuspectEntityCausality
 *
 * Information on the possible cause of the event
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEventSuspectEntityCausality</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
interface FhirAdverseEventSuspectEntityCausality : FhirBackboneElement {

    /**
     * Assessment of if the entity caused the event.
     */
    val assessment: CodeableConcept?

    /**
     * AdverseEvent.suspectEntity.causalityProductRelatedness.
     */
    val productRelatedness: String?

    /**
     * AdverseEvent.suspectEntity.causalityAuthor.
     */
    val author: Reference?

    /**
     * ProbabilityScale | Bayesian | Checklist.
     */
    val method: CodeableConcept?
}

/**
 * AdverseEventSuspectEntityCausality
 *
 * Information on the possible cause of the event
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEventSuspectEntityCausality</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
@Serializable
@SerialName("AdverseEventSuspectEntityCausality")
data class AdverseEventSuspectEntityCausality(

    @SerialName("assessment")
    override val assessment: CodeableConcept? = null,

    @SerialName("productRelatedness")
    override val productRelatedness: String? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirAdverseEventSuspectEntityCausality {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "AdverseEventSuspectEntityCausality"
    }
}
