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

import care.data4life.hl7.fhir.stu3.codesystem.DeviceUseStatementStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDeviceUseStatement
 *
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceUseStatement">DeviceUseStatement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceUseStatement)
 */
interface FhirDeviceUseStatement : FhirDomainResource {

    /**
     * External identifier for this record.
     */
    val identifier: List<Identifier>?

    /**
     * A code representing the patient or other source's judgment about the state of
     * the device used that this statement is about. Generally this will be active or
     * completed.
     */
    val status: DeviceUseStatementStatus

    /**
     * Patient using device.
     */
    val subject: Reference

    /**
     * Period device was used.
     */
    val whenUsed: Period?

    /**
     * How often the device was used.
     */
    val timingTiming: Timing?

    /**
     * How often the device was used.
     */
    val timingPeriod: Period?

    /**
     * How often the device was used.
     */
    val timingDateTime: DateTime?

    /**
     * When statement was recorded.
     */
    val recordedOn: DateTime?

    /**
     * Who made the statement.
     */
    val source: Reference?

    /**
     * Reference to device used.
     */
    val device: Reference

    /**
     * Why device was used.
     */
    val indication: List<CodeableConcept>?

    /**
     * Target body site.
     */
    val bodySite: CodeableConcept?

    /**
     * Addition details (comments, instructions).
     */
    val note: List<Annotation>?
}

/**
 * DeviceUseStatement
 *
 * SourceFileName: DeviceUseStatement.kt
 *
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceUseStatement">DeviceUseStatement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceUseStatement)
 */
@Serializable
@SerialName("DeviceUseStatement")
data class DeviceUseStatement(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("status")
    override val status: DeviceUseStatementStatus,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("whenUsed")
    override val whenUsed: Period? = null,

    @SerialName("timingTiming")
    override val timingTiming: Timing? = null,

    @SerialName("timingPeriod")
    override val timingPeriod: Period? = null,

    @SerialName("timingDateTime")
    override val timingDateTime: DateTime? = null,

    @SerialName("recordedOn")
    override val recordedOn: DateTime? = null,

    @SerialName("source")
    override val source: Reference? = null,

    @SerialName("device")
    override val device: Reference,

    @SerialName("indication")
    override val indication: List<CodeableConcept>? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

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
) : FhirDeviceUseStatement {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceUseStatement"
    }
}
