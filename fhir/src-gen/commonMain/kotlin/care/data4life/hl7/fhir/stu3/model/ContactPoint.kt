/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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

import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointUse
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirContactPoint : FhirElement {

    // Telecommunications form for contact point - what communications system is required to make use of the contact.
    val system: ContactPointSystem?

    // The actual contact point details.
    val value: String?

    // Identifies the purpose for the contact point.
    val use: ContactPointUse?

    // Specify preferred order of use (1 = highest).
    val rank: PositiveInteger?

    // Time period when the contact point was/is in use.
    val period: Period?
}

/**
 * ClassName: ContactPoint
 *
 * SourceFileName: ContactPoint.kt
 *
 *
 * Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ContactPoint">ContactPoint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ContactPoint)
 */
@Serializable
@SerialName("ContactPoint")
data class ContactPoint(

    // Telecommunications form for contact point - what communications system is required to make use of the contact.
    @SerialName("system")
    override val system: ContactPointSystem? = null,
    // The actual contact point details.
    @SerialName("value")
    override val value: String? = null,
    // Identifies the purpose for the contact point.
    @SerialName("use")
    override val use: ContactPointUse? = null,
    // Specify preferred order of use (1 = highest).
    @SerialName("rank")
    override val rank: PositiveInteger? = null,
    // Time period when the contact point was/is in use.
    @SerialName("period")
    override val period: Period? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContactPoint {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContactPoint"
    }
}
