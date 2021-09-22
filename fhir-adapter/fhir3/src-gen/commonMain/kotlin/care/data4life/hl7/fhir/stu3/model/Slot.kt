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

import care.data4life.hl7.fhir.stu3.codesystem.SlotStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSlot
 *
 * A slot of time on a schedule that may be available for booking appointments
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Slot">Slot</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Slot)
 */
interface FhirSlot : FhirDomainResource {

    /**
     * External Ids for this item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * A broad categorisation of the service that is to be performed during this
     * appointment.
     */
    val serviceCategory: CodeableConcept?

    /**
     * The type of appointments that can be booked into this slot (ideally this would
     * be an identifiable service - which is at a location, rather than the location
     * itself). If provided then this overrides the value provided on the availability
     * resource.
     */
    val serviceType: kotlin.collections.List<CodeableConcept>?

    /**
     * The specialty of a practitioner that would be required to perform the service
     * requested in this appointment.
     */
    val specialty: kotlin.collections.List<CodeableConcept>?

    /**
     * The style of appointment or patient that may be booked in the slot (not service
     * type).
     */
    val appointmentType: CodeableConcept?

    /**
     * The schedule resource that this slot defines an interval of status information.
     */
    val schedule: Reference

    /**
     * None
     */
    val status: SlotStatus

    /**
     * Date/Time that the slot is to begin.
     */
    val start: Instant

    /**
     * Date/Time that the slot is to conclude.
     */
    val end: Instant

    /**
     * This slot has already been overbooked, appointments are unlikely to be accepted
     * for this time.
     */
    val overbooked: Bool?

    /**
     * Comments on the slot to describe any extended information. Such as custom
     * constraints on the slot.
     */
    val comment: String?
}

/**
 * Slot
 *
 * A slot of time on a schedule that may be available for booking appointments
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Slot">Slot</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Slot)
 */
@Serializable
@SerialName("Slot")
data class Slot(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("serviceCategory")
    override val serviceCategory: CodeableConcept? = null,

    @SerialName("serviceType")
    override val serviceType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("appointmentType")
    override val appointmentType: CodeableConcept? = null,

    @SerialName("schedule")
    override val schedule: Reference,

    @SerialName("status")
    override val status: SlotStatus,

    @SerialName("start")
    override val start: Instant,

    @SerialName("end")
    override val end: Instant,

    @SerialName("overbooked")
    override val overbooked: Bool? = null,

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
) : FhirSlot {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Slot"
    }
}
