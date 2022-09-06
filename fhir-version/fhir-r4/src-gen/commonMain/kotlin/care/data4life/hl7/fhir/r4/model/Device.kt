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

import care.data4life.hl7.fhir.r4.codesystem.DeviceNameType
import care.data4life.hl7.fhir.r4.codesystem.FHIRDeviceStatus
import care.data4life.hl7.fhir.r4.codesystem.UDIEntryType
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirDevice
 *
 * A type of a manufactured item that is used in the provision of healthcare without being
 * substantially changed through that activity. The device may be a medical or non-medical device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDevice : FhirDomainResource {

    /**
     * Instance identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The reference to the definition for the device.
     */
    val definition: Reference?

    /**
     * Unique Device Identifier (UDI) Barcode string.
     */
    val udiCarrier: kotlin.collections.List<DeviceUdiCarrier>?

    /**
     * Status of the Device availability.
     */
    val status: FHIRDeviceStatus?

    /**
     * online | paused | standby | offline | not-ready | transduc-discon | hw-discon |
     * off.
     */
    val statusReason: kotlin.collections.List<CodeableConcept>?

    /**
     * The distinct identification string.
     */
    val distinctIdentifier: String?

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
     * Lot number of manufacture.
     */
    val lotNumber: String?

    /**
     * Serial number assigned by the manufacturer.
     */
    val serialNumber: String?

    /**
     * The name of the device as given by the manufacturer.
     */
    val deviceName: kotlin.collections.List<DeviceDeviceName>?

    /**
     * The model number for the device.
     */
    val modelNumber: String?

    /**
     * The part number of the device.
     */
    val partNumber: String?

    /**
     * The kind or type of device.
     */
    val type: CodeableConcept?

    /**
     * The capabilities supported on a device, the standards to which the device
     * conforms for a particular purpose, and used for the communication.
     */
    val specialization: kotlin.collections.List<DeviceSpecialization>?

    /**
     * The actual design of the device or software version running on the device.
     */
    val version: kotlin.collections.List<DeviceVersion>?

    /**
     * The actual configuration settings of a device as it actually operates, e.g.,
     * regulation status, time properties.
     */
    val property: kotlin.collections.List<DeviceProperty>?

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
    val contact: kotlin.collections.List<ContactPoint>?

    /**
     * Where the device is found.
     */
    val location: Reference?

    /**
     * Network address to contact device.
     */
    val url: String?

    /**
     * Device notes and comments.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Safety Characteristics of Device.
     */
    val safety: kotlin.collections.List<CodeableConcept>?

    /**
     * The parent device.
     */
    val parent: Reference?
}

/**
 * Device
 *
 * A type of a manufactured item that is used in the provision of healthcare without being
 * substantially changed through that activity. The device may be a medical or non-medical device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">Device</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("Device")
data class Device(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("definition")
    override val definition: Reference? = null,

    @SerialName("udiCarrier")
    override val udiCarrier: kotlin.collections.List<DeviceUdiCarrier>? = null,

    @SerialName("status")
    override val status: FHIRDeviceStatus? = null,

    @SerialName("statusReason")
    override val statusReason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("distinctIdentifier")
    override val distinctIdentifier: String? = null,

    @SerialName("manufacturer")
    override val manufacturer: String? = null,

    @SerialName("manufactureDate")
    override val manufactureDate: DateTime? = null,

    @SerialName("expirationDate")
    override val expirationDate: DateTime? = null,

    @SerialName("lotNumber")
    override val lotNumber: String? = null,

    @SerialName("serialNumber")
    override val serialNumber: String? = null,

    @SerialName("deviceName")
    override val deviceName: kotlin.collections.List<DeviceDeviceName>? = null,

    @SerialName("modelNumber")
    override val modelNumber: String? = null,

    @SerialName("partNumber")
    override val partNumber: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("specialization")
    override val specialization: kotlin.collections.List<DeviceSpecialization>? = null,

    @SerialName("version")
    override val version: kotlin.collections.List<DeviceVersion>? = null,

    @SerialName("property")
    override val property: kotlin.collections.List<DeviceProperty>? = null,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("owner")
    override val owner: Reference? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("safety")
    override val safety: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("parent")
    override val parent: Reference? = null,

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
) : FhirDevice {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Device"
    }
}

/**
 * FhirDeviceDeviceName
 *
 * This represents the manufacturer's name of the device as provided by the device, from a UDI label,
 * or by a person describing the Device. This typically would be used when a person provides the
 * name(s) or when the device represents one of the names available from DeviceDefinition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceDeviceName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDeviceDeviceName : FhirBackboneElement {

    /**
     * The name of the device.
     */
    val name: String

    /**
     * The type of deviceName. UDILabelName | UserFriendlyName | PatientReportedName |
     * ManufactureDeviceName | ModelName.
     */
    val type: DeviceNameType
}

/**
 * DeviceDeviceName
 *
 * This represents the manufacturer's name of the device as provided by the device, from a UDI label,
 * or by a person describing the Device. This typically would be used when a person provides the
 * name(s) or when the device represents one of the names available from DeviceDefinition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceDeviceName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("DeviceDeviceName")
data class DeviceDeviceName(

    @SerialName("name")
    override val name: String,

    @SerialName("type")
    override val type: DeviceNameType,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceDeviceName {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDeviceName"
    }
}

/**
 * FhirDeviceProperty
 *
 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time
 * properties
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDeviceProperty : FhirBackboneElement {

    /**
     * Code that specifies the property DeviceDefinitionPropetyCode (Extensible).
     */
    val type: CodeableConcept

    /**
     * Property value as a quantity.
     */
    val valueQuantity: kotlin.collections.List<Quantity>?

    /**
     * Property value as a code, e.g., NTP4 (synced to NTP).
     */
    val valueCode: kotlin.collections.List<CodeableConcept>?
}

/**
 * DeviceProperty
 *
 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time
 * properties
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("DeviceProperty")
data class DeviceProperty(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("valueQuantity")
    override val valueQuantity: kotlin.collections.List<Quantity>? = null,

    @SerialName("valueCode")
    override val valueCode: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceProperty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceProperty"
    }
}

/**
 * FhirDeviceSpecialization
 *
 * The capabilities supported on a device, the standards to which the device conforms for a particular
 * purpose, and used for the communication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceSpecialization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDeviceSpecialization : FhirBackboneElement {

    /**
     * The standard that is used to operate and communicate.
     */
    val systemType: CodeableConcept

    /**
     * The version of the standard that is used to operate and communicate.
     */
    val version: String?
}

/**
 * DeviceSpecialization
 *
 * The capabilities supported on a device, the standards to which the device conforms for a particular
 * purpose, and used for the communication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceSpecialization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("DeviceSpecialization")
data class DeviceSpecialization(

    @SerialName("systemType")
    override val systemType: CodeableConcept,

    @SerialName("version")
    override val version: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceSpecialization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceSpecialization"
    }
}

/**
 * FhirDeviceUdiCarrier
 *
 * Unique device identifier (UDI) assigned to device label or package. Note that the Device may include
 * multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold,
 * or for multiple jurisdictions it could have been sold.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceUdiCarrier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDeviceUdiCarrier : FhirBackboneElement {

    /**
     * Mandatory fixed portion of UDI.
     */
    val deviceIdentifier: String?

    /**
     * UDI Issuing Organization.
     */
    val issuer: String?

    /**
     * Regional UDI authority.
     */
    val jurisdiction: String?

    /**
     * UDI Machine Readable Barcode String.
     */
    val carrierAIDC: String?

    /**
     * UDI Human Readable Barcode String.
     */
    val carrierHRF: String?

    /**
     * A coded entry to indicate how the data was entered.
     */
    val entryType: UDIEntryType?
}

/**
 * DeviceUdiCarrier
 *
 * Unique device identifier (UDI) assigned to device label or package. Note that the Device may include
 * multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold,
 * or for multiple jurisdictions it could have been sold.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceUdiCarrier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("DeviceUdiCarrier")
data class DeviceUdiCarrier(

    @SerialName("deviceIdentifier")
    override val deviceIdentifier: String? = null,

    @SerialName("issuer")
    override val issuer: String? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: String? = null,

    @SerialName("carrierAIDC")
    override val carrierAIDC: String? = null,

    @SerialName("carrierHRF")
    override val carrierHRF: String? = null,

    @SerialName("entryType")
    override val entryType: UDIEntryType? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceUdiCarrier {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceUdiCarrier"
    }
}

/**
 * FhirDeviceVersion
 *
 * The actual design of the device or software version running on the device
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceVersion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
interface FhirDeviceVersion : FhirBackboneElement {

    /**
     * The type of the device version.
     */
    val type: CodeableConcept?

    /**
     * A single component of the device version.
     */
    val component: Identifier?

    /**
     * The version text.
     */
    val value: String
}

/**
 * DeviceVersion
 *
 * The actual design of the device or software version running on the device
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Device">DeviceVersion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Device)
 */
@Serializable
@SerialName("DeviceVersion")
data class DeviceVersion(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("component")
    override val component: Identifier? = null,

    @SerialName("value")
    override val value: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceVersion {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceVersion"
    }
}
