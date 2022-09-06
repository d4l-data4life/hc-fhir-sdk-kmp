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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSchedule
 *
 * A container for slots of time that may be available for booking appointments
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Schedule">Schedule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Schedule)
 */
interface FhirSchedule : FhirDomainResource {

    /**
     * External Ids for this item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether this schedule is in active use.
     */
    val active: Bool?

    /**
     * A broad categorisation of the service that is to be performed during this
     * appointment.
     */
    val serviceCategory: CodeableConcept?

    /**
     * The specific service that is to be performed during this appointment.
     */
    val serviceType: kotlin.collections.List<CodeableConcept>?

    /**
     * The specialty of a practitioner that would be required to perform the service
     * requested in this appointment.
     */
    val specialty: kotlin.collections.List<CodeableConcept>?

    /**
     * The resource this Schedule resource is providing availability information for.
     * These are expected to usually be one of HealthcareService, Location,
     * Practitioner, PractitionerRole, Device, Patient or RelatedPerson.
     */
    val actor: kotlin.collections.List<Reference>

    /**
     * The period of time that the slots that are attached to this Schedule resource
     * cover (even if none exist). These cover the amount of time that an
     * organization's planning horizon; the interval for which they are currently
     * accepting appointments. This does not define a "template" for planning outside
     * these dates.
     */
    val planningHorizon: Period?

    /**
     * Comments on the availability to describe any extended information. Such as
     * custom constraints on the slots that may be associated.
     */
    val comment: String?
}

/**
 * Schedule
 *
 * A container for slots of time that may be available for booking appointments
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Schedule">Schedule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Schedule)
 */
@Serializable
@SerialName("Schedule")
data class Schedule(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("serviceCategory")
    override val serviceCategory: CodeableConcept? = null,

    @SerialName("serviceType")
    override val serviceType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("actor")
    override val actor: kotlin.collections.List<Reference>,

    @SerialName("planningHorizon")
    override val planningHorizon: Period? = null,

    @SerialName("comment")
    override val comment: String? = null,

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
) : FhirSchedule {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Schedule"
    }
}
