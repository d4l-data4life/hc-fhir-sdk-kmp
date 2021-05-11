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

import care.data4life.hl7.fhir.stu3.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirCoding : FhirElement {

    // Identity of the terminology system.
    val system: String?

    // Version of the system - if relevant.
    val version: String?

    // Symbol in syntax defined by the system.
    val code: String?

    // Representation defined by the system.
    val display: String?

    // If this coding was chosen directly by the user.
    val userSelected: Bool?
}

/**
 * ClassName: Coding
 *
 * SourceFileName: Coding.kt
 *
 *
 * A reference to a code defined by a terminology system
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Coding">Coding</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Coding)
 */
@Serializable
@SerialName("Coding")
data class Coding(

    // Identity of the terminology system.
    @SerialName("system")
    override val system: String? = null,
    // Version of the system - if relevant.
    @SerialName("version")
    override val version: String? = null,
    // Symbol in syntax defined by the system.
    @SerialName("code")
    override val code: String? = null,
    // Representation defined by the system.
    @SerialName("display")
    override val display: String? = null,
    // If this coding was chosen directly by the user.
    @SerialName("userSelected")
    override val userSelected: Bool? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCoding {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Coding"
    }
}
