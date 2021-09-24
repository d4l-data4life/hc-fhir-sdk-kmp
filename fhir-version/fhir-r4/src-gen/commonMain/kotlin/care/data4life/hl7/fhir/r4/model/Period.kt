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

import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirPeriod
 *
 * A time period defined by a start and end date and optionally time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Period">Period</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Period)
 */
interface FhirPeriod : FhirElement {

    /**
     * Starting time with inclusive boundary.
     */
    val start: DateTime?

    /**
     * End time with inclusive boundary, if not ongoing.
     */
    val end: DateTime?
}

/**
 * Period
 *
 * A time period defined by a start and end date and optionally time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Period">Period</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Period)
 */
@Serializable
@SerialName("Period")
data class Period(

    @SerialName("start")
    override val start: DateTime? = null,

    @SerialName("end")
    override val end: DateTime? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPeriod {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Period"
    }
}
