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
import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirDeviceDefinition
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical
 * device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinition : FhirDomainResource {

    /**
     * Instance identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Unique Device Identifier (UDI) Barcode string.
     */
    val udiDeviceIdentifier: kotlin.collections.List<DeviceDefinitionUdiDeviceIdentifier>?

    /**
     * Name of device manufacturer.
     */
    val manufacturerString: String?

    /**
     * Name of device manufacturer.
     */
    val manufacturerReference: Reference?

    /**
     * A name given to the device to identify it.
     */
    val deviceName: kotlin.collections.List<DeviceDefinitionDeviceName>?

    /**
     * The model number for the device.
     */
    val modelNumber: String?

    /**
     * What kind of device or device system this is.
     */
    val type: CodeableConcept?

    /**
     * The capabilities supported on a device, the standards to which the device
     * conforms for a particular purpose, and used for the communication.
     */
    val specialization: kotlin.collections.List<DeviceDefinitionSpecialization>?

    /**
     * Available versions.
     */
    val version: kotlin.collections.List<String>?

    /**
     * Safety characteristics of the device.
     */
    val safety: kotlin.collections.List<CodeableConcept>?

    /**
     * Shelf Life and storage information.
     */
    val shelfLifeStorage: kotlin.collections.List<ProductShelfLife>?

    /**
     * Dimensions, color etc..
     */
    val physicalCharacteristics: ProdCharacteristic?

    /**
     * Language code for the human-readable text strings produced by the device (all
     * supported).
     */
    val languageCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Device capabilities.
     */
    val capability: kotlin.collections.List<DeviceDefinitionCapability>?

    /**
     * The actual configuration settings of a device as it actually operates, e.g.,
     * regulation status, time properties.
     */
    val property: kotlin.collections.List<DeviceDefinitionProperty>?

    /**
     * Organization responsible for device.
     */
    val owner: Reference?

    /**
     * Details for human/organization for support.
     */
    val contact: kotlin.collections.List<ContactPoint>?

    /**
     * Network address to contact device.
     */
    val url: String?

    /**
     * Access to on-line information.
     */
    val onlineInformation: String?

    /**
     * Device notes and comments.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * The quantity of the device present in the packaging (e.g. the number of devices
     * present in a pack, or the number of devices in the same package of the medicinal
     * product).
     */
    val quantity: Quantity?

    /**
     * The parent device it can be part of.
     */
    val parentDevice: Reference?

    /**
     * A substance used to create the material(s) of which the device is made.
     */
    val material: kotlin.collections.List<DeviceDefinitionMaterial>?
}

/**
 * DeviceDefinition
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical
 * device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinition")
data class DeviceDefinition(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("udiDeviceIdentifier")
    override val udiDeviceIdentifier: kotlin.collections.List<DeviceDefinitionUdiDeviceIdentifier>? = null,

    @SerialName("manufacturerString")
    override val manufacturerString: String? = null,

    @SerialName("manufacturerReference")
    override val manufacturerReference: Reference? = null,

    @SerialName("deviceName")
    override val deviceName: kotlin.collections.List<DeviceDefinitionDeviceName>? = null,

    @SerialName("modelNumber")
    override val modelNumber: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("specialization")
    override val specialization: kotlin.collections.List<DeviceDefinitionSpecialization>? = null,

    @SerialName("version")
    override val version: kotlin.collections.List<String>? = null,

    @SerialName("safety")
    override val safety: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("shelfLifeStorage")
    override val shelfLifeStorage: kotlin.collections.List<ProductShelfLife>? = null,

    @SerialName("physicalCharacteristics")
    override val physicalCharacteristics: ProdCharacteristic? = null,

    @SerialName("languageCode")
    override val languageCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("capability")
    override val capability: kotlin.collections.List<DeviceDefinitionCapability>? = null,

    @SerialName("property")
    override val property: kotlin.collections.List<DeviceDefinitionProperty>? = null,

    @SerialName("owner")
    override val owner: Reference? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("onlineInformation")
    override val onlineInformation: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("parentDevice")
    override val parentDevice: Reference? = null,

    @SerialName("material")
    override val material: kotlin.collections.List<DeviceDefinitionMaterial>? = null,

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
) : FhirDeviceDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinition"
    }
}

/**
 * FhirDeviceDefinitionCapability
 *
 * Device capabilities
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionCapability</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinitionCapability : FhirBackboneElement {

    /**
     * Type of capability.
     */
    val type: CodeableConcept

    /**
     * Description of capability.
     */
    val description: kotlin.collections.List<CodeableConcept>?
}

/**
 * DeviceDefinitionCapability
 *
 * Device capabilities
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionCapability</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinitionCapability")
data class DeviceDefinitionCapability(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("description")
    override val description: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceDefinitionCapability {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinitionCapability"
    }
}

/**
 * FhirDeviceDefinitionDeviceName
 *
 * A name given to the device to identify it
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionDeviceName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinitionDeviceName : FhirBackboneElement {

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
 * DeviceDefinitionDeviceName
 *
 * A name given to the device to identify it
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionDeviceName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinitionDeviceName")
data class DeviceDefinitionDeviceName(

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
) : FhirDeviceDefinitionDeviceName {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinitionDeviceName"
    }
}

/**
 * FhirDeviceDefinitionMaterial
 *
 * A substance used to create the material(s) of which the device is made
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionMaterial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinitionMaterial : FhirBackboneElement {

    /**
     * The substance.
     */
    val substance: CodeableConcept

    /**
     * Indicates an alternative material of the device.
     */
    val alternate: Bool?

    /**
     * Whether the substance is a known or suspected allergen.
     */
    val allergenicIndicator: Bool?
}

/**
 * DeviceDefinitionMaterial
 *
 * A substance used to create the material(s) of which the device is made
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionMaterial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinitionMaterial")
data class DeviceDefinitionMaterial(

    @SerialName("substance")
    override val substance: CodeableConcept,

    @SerialName("alternate")
    override val alternate: Bool? = null,

    @SerialName("allergenicIndicator")
    override val allergenicIndicator: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceDefinitionMaterial {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinitionMaterial"
    }
}

/**
 * FhirDeviceDefinitionProperty
 *
 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time
 * properties
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinitionProperty : FhirBackboneElement {

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
 * DeviceDefinitionProperty
 *
 * The actual configuration settings of a device as it actually operates, e.g., regulation status, time
 * properties
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinitionProperty")
data class DeviceDefinitionProperty(

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
) : FhirDeviceDefinitionProperty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinitionProperty"
    }
}

/**
 * FhirDeviceDefinitionSpecialization
 *
 * The capabilities supported on a device, the standards to which the device conforms for a particular
 * purpose, and used for the communication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionSpecialization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinitionSpecialization : FhirBackboneElement {

    /**
     * The standard that is used to operate and communicate.
     */
    val systemType: String

    /**
     * The version of the standard that is used to operate and communicate.
     */
    val version: String?
}

/**
 * DeviceDefinitionSpecialization
 *
 * The capabilities supported on a device, the standards to which the device conforms for a particular
 * purpose, and used for the communication
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionSpecialization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinitionSpecialization")
data class DeviceDefinitionSpecialization(

    @SerialName("systemType")
    override val systemType: String,

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
) : FhirDeviceDefinitionSpecialization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinitionSpecialization"
    }
}

/**
 * FhirDeviceDefinitionUdiDeviceIdentifier
 *
 * Unique device identifier (UDI) assigned to device label or package. Note that the Device may include
 * multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold,
 * or for multiple jurisdictions it could have been sold.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionUdiDeviceIdentifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
interface FhirDeviceDefinitionUdiDeviceIdentifier : FhirBackboneElement {

    /**
     * The identifier that is to be associated with every Device that references this
     * DeviceDefintiion for the issuer and jurisdication porvided in the
     * DeviceDefinition.udiDeviceIdentifier.
     */
    val deviceIdentifier: String

    /**
     * The organization that assigns the identifier algorithm.
     */
    val issuer: String

    /**
     * The jurisdiction to which the deviceIdentifier applies.
     */
    val jurisdiction: String
}

/**
 * DeviceDefinitionUdiDeviceIdentifier
 *
 * Unique device identifier (UDI) assigned to device label or package. Note that the Device may include
 * multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is sold,
 * or for multiple jurisdictions it could have been sold.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceDefinition">DeviceDefinitionUdiDeviceIdentifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/DeviceDefinition)
 */
@Serializable
@SerialName("DeviceDefinitionUdiDeviceIdentifier")
data class DeviceDefinitionUdiDeviceIdentifier(

    @SerialName("deviceIdentifier")
    override val deviceIdentifier: String,

    @SerialName("issuer")
    override val issuer: String,

    @SerialName("jurisdiction")
    override val jurisdiction: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceDefinitionUdiDeviceIdentifier {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "DeviceDefinitionUdiDeviceIdentifier"
    }
}
