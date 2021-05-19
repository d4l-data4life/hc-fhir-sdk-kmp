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

import care.data4life.hl7.fhir.stu3.codesystem.FHIRDeviceStatus
import care.data4life.hl7.fhir.stu3.codesystem.UDIEntryType
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDevice
 *
 * This resource identifies an instance or a type of a manufactured item that is used in the provision
 * of healthcare without being substantially changed through that activity. The device may be a medical
 * or non-medical device. Medical devices include durable (reusable) medical equipment, implantable
 * devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare
 * and public health. Non-medical devices may include items such as a machine, cellphone, computer,
 * application, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDevice : FhirDomainResource {

    /**
     * Instance identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Unique Device Identifier (UDI) Barcode string.
     */
    val udi: DeviceUdi?

    /**
     * Status of the Device availability.
     */
    val status: FHIRDeviceStatus?

    /**
     * What kind of device this is.
     */
    val type: CodeableConcept?

    /**
     * Lot number of manufacture.
     */
    val lotNumber: String?

    /**
     * Name of device manufacturer.
     */
    val manufacturer: String?

    /**
     * Date when the device was made.
     */
    val manufactureDate: DateTime?

    /**
     * Date and time of expiry of this device (if applicable).
     */
    val expirationDate: DateTime?

    /**
     * Model id assigned by the manufacturer.
     */
    val model: String?

    /**
     * Version number (i.e. software).
     */
    val version: String?

    /**
     * Patient to whom Device is affixed.
     */
    val patient: Reference?

    /**
     * Organization responsible for device.
     */
    val owner: Reference?

    /**
     * Details for human/organization for support.
     */
    val contact: List<ContactPoint>?

    /**
     * Where the resource is found.
     */
    val location: Reference?

    /**
     * Network address to contact device.
     */
    val url: String?

    /**
     * Device notes and comments.
     */
    val note: List<Annotation>?

    /**
     * Safety Characteristics of Device.
     */
    val safety: List<CodeableConcept>?
}

/**
 * Device
 *
 * SourceFileName: Device.kt
 *
 * This resource identifies an instance or a type of a manufactured item that is used in the provision
 * of healthcare without being substantially changed through that activity. The device may be a medical
 * or non-medical device. Medical devices include durable (reusable) medical equipment, implantable
 * devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare
 * and public health. Non-medical devices may include items such as a machine, cellphone, computer,
 * application, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("Device")
data class Device(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("udi")
    override val udi: DeviceUdi? = null,

    @SerialName("status")
    override val status: FHIRDeviceStatus? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("lotNumber")
    override val lotNumber: String? = null,

    @SerialName("manufacturer")
    override val manufacturer: String? = null,

    @SerialName("manufactureDate")
    override val manufactureDate: DateTime? = null,

    @SerialName("expirationDate")
    override val expirationDate: DateTime? = null,

    @SerialName("model")
    override val model: String? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("owner")
    override val owner: Reference? = null,

    @SerialName("contact")
    override val contact: List<ContactPoint>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("safety")
    override val safety: List<CodeableConcept>? = null,

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
) : FhirDevice {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Device"
    }
}

/**
 * FhirDeviceUdi
 *
 * [Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceUdi</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDeviceUdi : FhirBackboneElement {

    /**
     * Mandatory fixed portion of UDI.
     */
    val deviceIdentifier: String?

    /**
     * Device Name as appears on UDI label.
     */
    val name: String?

    /**
     * Regional UDI authority.
     */
    val jurisdiction: String?

    /**
     * UDI Human Readable Barcode String.
     */
    val carrierHRF: String?

    /**
     * UDI Machine Readable Barcode String.
     */
    val carrierAIDC: String?

    /**
     * UDI Issuing Organization.
     */
    val issuer: String?

    /**
     * A coded entry to indicate how the data was entered.
     */
    val entryType: UDIEntryType?
}

/**
 * DeviceUdi
 *
 * SourceFileName: Device.kt
 *
 * [Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceUdi</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("DeviceUdi")
data class DeviceUdi(

    @SerialName("deviceIdentifier")
    override val deviceIdentifier: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: String? = null,

    @SerialName("carrierHRF")
    override val carrierHRF: String? = null,

    @SerialName("carrierAIDC")
    override val carrierAIDC: String? = null,

    @SerialName("issuer")
    override val issuer: String? = null,

    @SerialName("entryType")
    override val entryType: UDIEntryType? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDeviceUdi {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceUdi"
    }
}
