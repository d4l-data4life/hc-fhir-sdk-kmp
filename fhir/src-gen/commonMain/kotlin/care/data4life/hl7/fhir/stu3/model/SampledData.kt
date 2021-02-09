/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirSampledData : FhirElement {

    // Zero value and units.
    val origin: Quantity

    // Number of milliseconds between samples.
    val period: String

    // Multiply data by this before adding to origin.
    val factor: String?

    // Lower limit of detection.
    val lowerLimit: String?

    // Upper limit of detection.
    val upperLimit: String?

    // Number of sample points at each time point.
    val dimensions: String

    // Decimal values with spaces, or "E" | "U" | "L".
    val data: String
}


/**
 * ClassName: SampledData
 *
 * SourceFileName: SampledData.kt
 *
 *
 * A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SampledData">SampledData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SampledData)
 */
@Serializable
@SerialName("SampledData")
data class SampledData(

    // Zero value and units.
    @SerialName("origin")
    override val origin: Quantity,
    // Number of milliseconds between samples.
    @SerialName("period")
    override val period: String,
    // Multiply data by this before adding to origin.
    @SerialName("factor")
    override val factor: String? = null,
    // Lower limit of detection.
    @SerialName("lowerLimit")
    override val lowerLimit: String? = null,
    // Upper limit of detection.
    @SerialName("upperLimit")
    override val upperLimit: String? = null,
    // Number of sample points at each time point.
    @SerialName("dimensions")
    override val dimensions: String,
    // Decimal values with spaces, or "E" | "U" | "L".
    @SerialName("data")
    override val data: String,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSampledData {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SampledData"
    }
}

