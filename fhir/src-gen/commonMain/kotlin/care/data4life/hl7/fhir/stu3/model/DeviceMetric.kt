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

import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricCalibrationState
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricCalibrationType
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricCategory
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricColor
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricOperationalStatus
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirDeviceMetric
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceMetric">DeviceMetric</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceMetric)
 */
interface FhirDeviceMetric : FhirDomainResource {

    /**
     * Unique identifier of this DeviceMetric.
     */
    val identifier: Identifier

    /**
     * Identity of metric, for example Heart Rate or PEEP Setting.
     */
    val type: CodeableConcept

    /**
     * Unit of Measure for the Metric.
     */
    val unit: CodeableConcept?

    /**
     * Describes the link to the source Device.
     */
    val source: Reference?

    /**
     * Describes the link to the parent DeviceComponent.
     */
    val parent: Reference?

    /**
     * Indicates current operational state of the device. For example: On, Off,
     * Standby, etc.
     */
    val operationalStatus: DeviceMetricOperationalStatus?

    /**
     * Describes the color representation for the metric. This is often used to aid
     * clinicians to track and identify parameter types by color. In practice, consider
     * a Patient Monitor that has ECG/HR and Pleth for example; the parameters are
     * displayed in different characteristic colors, such as HR-blue, BP-green, and PR
     * and SpO2- magenta.
     */
    val color: DeviceMetricColor?

    /**
     * Indicates the category of the observation generation process. A DeviceMetric can
     * be for example a setting, measurement, or calculation.
     */
    val category: DeviceMetricCategory

    /**
     * Describes the measurement repetition time.
     */
    val measurementPeriod: Timing?

    /**
     * Describes the calibrations that have been performed or that are required to be
     * performed.
     */
    val calibration: kotlin.collections.List<DeviceMetricCalibration>?
}

/**
 * DeviceMetric
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceMetric">DeviceMetric</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceMetric)
 */
@Serializable
@SerialName("DeviceMetric")
data class DeviceMetric(

    @SerialName("identifier")
    override val identifier: Identifier,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("unit")
    override val unit: CodeableConcept? = null,

    @SerialName("source")
    override val source: Reference? = null,

    @SerialName("parent")
    override val parent: Reference? = null,

    @SerialName("operationalStatus")
    override val operationalStatus: DeviceMetricOperationalStatus? = null,

    @SerialName("color")
    override val color: DeviceMetricColor? = null,

    @SerialName("category")
    override val category: DeviceMetricCategory,

    @SerialName("measurementPeriod")
    override val measurementPeriod: Timing? = null,

    @SerialName("calibration")
    override val calibration: kotlin.collections.List<DeviceMetricCalibration>? = null,

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
) : FhirDeviceMetric {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceMetric"
    }
}

/**
 * FhirDeviceMetricCalibration
 *
 * Describes the calibrations that have been performed or that are required to be performed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceMetric">DeviceMetricCalibration</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceMetric)
 */
interface FhirDeviceMetricCalibration : FhirBackboneElement {

    /**
     * Describes the type of the calibration method.
     */
    val type: DeviceMetricCalibrationType?

    /**
     * Describes the state of the calibration.
     */
    val state: DeviceMetricCalibrationState?

    /**
     * Describes the time last calibration has been performed.
     */
    val time: Instant?
}

/**
 * DeviceMetricCalibration
 *
 * Describes the calibrations that have been performed or that are required to be performed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/DeviceMetric">DeviceMetricCalibration</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/DeviceMetric)
 */
@Serializable
@SerialName("DeviceMetricCalibration")
data class DeviceMetricCalibration(

    @SerialName("type")
    override val type: DeviceMetricCalibrationType? = null,

    @SerialName("state")
    override val state: DeviceMetricCalibrationState? = null,

    @SerialName("time")
    override val time: Instant? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirDeviceMetricCalibration {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DeviceMetricCalibration"
    }
}
