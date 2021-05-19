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

import care.data4life.hl7.fhir.stu3.codesystem.MeasmntPrinciple
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDeviceComponent
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical
 * device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceComponent">DeviceComponent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceComponent)
 */
interface FhirDeviceComponent : FhirDomainResource {

    /**
     * Instance id assigned by the software stack.
     */
    val identifier: Identifier

    /**
     * What kind of component it is.
     */
    val type: CodeableConcept

    /**
     * Recent system change timestamp.
     */
    val lastSystemChange: Instant?

    /**
     * Top-level device resource link.
     */
    val source: Reference?

    /**
     * Parent resource link.
     */
    val parent: Reference?

    /**
     * Current operational status of the component, for example On, Off or Standby.
     */
    val operationalStatus: List<CodeableConcept>?

    /**
     * Current supported parameter group.
     */
    val parameterGroup: CodeableConcept?

    /**
     * The physical principle of the measurement. For example: thermal, chemical,
     * acoustical, etc.
     */
    val measurementPrinciple: MeasmntPrinciple?

    /**
     * Specification details such as Component Revisions, or Serial Numbers.
     */
    val productionSpecification: List<DeviceComponentProductionSpecification>?

    /**
     * Language code for the human-readable text strings produced by the device.
     */
    val languageCode: CodeableConcept?
}

/**
 * DeviceComponent
 *
 * SourceFileName: DeviceComponent.kt
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical
 * device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceComponent">DeviceComponent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceComponent)
 */
@Serializable
@SerialName("DeviceComponent")
data class DeviceComponent(

    @SerialName("identifier")
    override val identifier: Identifier,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("lastSystemChange")
    override val lastSystemChange: Instant? = null,

    @SerialName("source")
    override val source: Reference? = null,

    @SerialName("parent")
    override val parent: Reference? = null,

    @SerialName("operationalStatus")
    override val operationalStatus: List<CodeableConcept>? = null,

    @SerialName("parameterGroup")
    override val parameterGroup: CodeableConcept? = null,

    @SerialName("measurementPrinciple")
    override val measurementPrinciple: MeasmntPrinciple? = null,

    @SerialName("productionSpecification")
    override val productionSpecification: List<DeviceComponentProductionSpecification>? = null,

    @SerialName("languageCode")
    override val languageCode: CodeableConcept? = null,

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
) : FhirDeviceComponent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceComponent"
    }
}

/**
 * FhirDeviceComponentProductionSpecification
 *
 * The production specification such as component revision, serial number, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceComponent">DeviceComponentProductionSpecification</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceComponent)
 */
interface FhirDeviceComponentProductionSpecification : FhirBackboneElement {

    /**
     * Type or kind of production specification, for example serial number or software
     * revision.
     */
    val specType: CodeableConcept?

    /**
     * Internal component unique identification.
     */
    val componentId: Identifier?

    /**
     * A printable string defining the component.
     */
    val productionSpec: String?
}

/**
 * DeviceComponentProductionSpecification
 *
 * SourceFileName: DeviceComponent.kt
 *
 * The production specification such as component revision, serial number, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceComponent">DeviceComponentProductionSpecification</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceComponent)
 */
@Serializable
@SerialName("DeviceComponentProductionSpecification")
data class DeviceComponentProductionSpecification(

    @SerialName("specType")
    override val specType: CodeableConcept? = null,

    @SerialName("componentId")
    override val componentId: Identifier? = null,

    @SerialName("productionSpec")
    override val productionSpec: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDeviceComponentProductionSpecification {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceComponentProductionSpecification"
    }
}
