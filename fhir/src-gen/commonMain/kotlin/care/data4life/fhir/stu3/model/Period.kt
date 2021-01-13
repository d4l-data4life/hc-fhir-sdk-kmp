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

package care.data4life.fhir.stu3.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirPeriod : FhirElement {

    // Starting time with inclusive boundary.
    val start: String?

    // End time with inclusive boundary, if not ongoing.
    val end: String?
}


/**
 * ClassName: Period
 *
 * SourceFileName: Period.kt
 *
 *
 * A time period defined by a start and end date and optionally time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Period">Period</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Period) on 2020-10-01
 */
@Serializable
@SerialName("Period")
data class Period(

    // Starting time with inclusive boundary.
    @SerialName("start")
    override val start: String? = null,
    // End time with inclusive boundary, if not ongoing.
    @SerialName("end")
    override val end: String? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPeriod {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Period"
    }
}
