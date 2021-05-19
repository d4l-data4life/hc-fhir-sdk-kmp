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

import care.data4life.hl7.fhir.stu3.codesystem.AdverseEventCategory
import care.data4life.hl7.fhir.stu3.codesystem.AdverseEventCausality
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirAdverseEvent
 *
 * Actual or potential/avoided event causing unintended physical injury resulting from or contributed
 * to by medical care, a research study or other healthcare setting factors that requires additional
 * monitoring, treatment, or hospitalization, or that results in death.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEvent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
interface FhirAdverseEvent : FhirDomainResource {

    /**
     * Business identifier for the event.
     */
    val identifier: Identifier?

    /**
     * The type of event which is important to characterize what occurred and caused
     * harm to the subject, or had the potential to cause harm to the subject.
     */
    val category: AdverseEventCategory?

    /**
     * actual | potential.
     */
    val type: CodeableConcept?

    /**
     * Subject or group impacted by event.
     */
    val subject: Reference?

    /**
     * When the event occurred.
     */
    val date: DateTime?

    /**
     * Adverse Reaction Events linked to exposure to substance.
     */
    val reaction: List<Reference>?

    /**
     * Location where adverse event occurred.
     */
    val location: Reference?

    /**
     * Mild | Moderate | Severe.
     */
    val seriousness: CodeableConcept?

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
    val eventParticipant: Reference?

    /**
     * Description of the adverse event.
     */
    val description: String?

    /**
     * The suspected agent causing the adverse event.
     */
    val suspectEntity: List<AdverseEventSuspectEntity>?

    /**
     * AdverseEvent.subjectMedicalHistory.
     */
    val subjectMedicalHistory: List<Reference>?

    /**
     * AdverseEvent.referenceDocument.
     */
    val referenceDocument: List<Reference>?

    /**
     * AdverseEvent.study.
     */
    val study: List<Reference>?
}

/**
 * AdverseEvent
 *
 * SourceFileName: AdverseEvent.kt
 *
 * Actual or potential/avoided event causing unintended physical injury resulting from or contributed
 * to by medical care, a research study or other healthcare setting factors that requires additional
 * monitoring, treatment, or hospitalization, or that results in death.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEvent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
@Serializable
@SerialName("AdverseEvent")
data class AdverseEvent(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("category")
    override val category: AdverseEventCategory? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("reaction")
    override val reaction: List<Reference>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("seriousness")
    override val seriousness: CodeableConcept? = null,

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("eventParticipant")
    override val eventParticipant: Reference? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("suspectEntity")
    override val suspectEntity: List<AdverseEventSuspectEntity>? = null,

    @SerialName("subjectMedicalHistory")
    override val subjectMedicalHistory: List<Reference>? = null,

    @SerialName("referenceDocument")
    override val referenceDocument: List<Reference>? = null,

    @SerialName("study")
    override val study: List<Reference>? = null,

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
) : FhirAdverseEvent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AdverseEvent"
    }
}

/**
 * FhirAdverseEventSuspectEntity
 *
 * Describes the entity that is suspected to have caused the adverse event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEventSuspectEntity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
interface FhirAdverseEventSuspectEntity : FhirBackboneElement {

    /**
     * Refers to the specific entity that caused the adverse event.
     */
    val instance: Reference

    /**
     * None
     */
    val causality: AdverseEventCausality?

    /**
     * assess1 | assess2.
     */
    val causalityAssessment: CodeableConcept?

    /**
     * AdverseEvent.suspectEntity.causalityProductRelatedness.
     */
    val causalityProductRelatedness: String?

    /**
     * method1 | method2.
     */
    val causalityMethod: CodeableConcept?

    /**
     * AdverseEvent.suspectEntity.causalityAuthor.
     */
    val causalityAuthor: Reference?

    /**
     * result1 | result2.
     */
    val causalityResult: CodeableConcept?
}

/**
 * AdverseEventSuspectEntity
 *
 * SourceFileName: AdverseEvent.kt
 *
 * Describes the entity that is suspected to have caused the adverse event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AdverseEvent">AdverseEventSuspectEntity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AdverseEvent)
 */
@Serializable
@SerialName("AdverseEventSuspectEntity")
data class AdverseEventSuspectEntity(

    @SerialName("instance")
    override val instance: Reference,

    @SerialName("causality")
    override val causality: AdverseEventCausality? = null,

    @SerialName("causalityAssessment")
    override val causalityAssessment: CodeableConcept? = null,

    @SerialName("causalityProductRelatedness")
    override val causalityProductRelatedness: String? = null,

    @SerialName("causalityMethod")
    override val causalityMethod: CodeableConcept? = null,

    @SerialName("causalityAuthor")
    override val causalityAuthor: Reference? = null,

    @SerialName("causalityResult")
    override val causalityResult: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAdverseEventSuspectEntity {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AdverseEventSuspectEntity"
    }
}
