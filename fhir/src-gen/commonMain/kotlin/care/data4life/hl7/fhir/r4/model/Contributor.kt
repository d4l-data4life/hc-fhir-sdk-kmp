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

import care.data4life.hl7.fhir.r4.codesystem.ContributorType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirContributor : FhirElement {

    // The type of contributor.
    val type: ContributorType

    // Who contributed the content.
    val name: String

    // Contact details of the contributor.
    val contact: List<ContactDetail>?
}

/**
 * ClassName: Contributor
 *
 * SourceFileName: Contributor.kt
 *
 *
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contributor">Contributor</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contributor)
 */
@Serializable
@SerialName("Contributor")
data class Contributor(

    // The type of contributor.
    @SerialName("type")
    override val type: ContributorType,
    // Who contributed the content.
    @SerialName("name")
    override val name: String,
    // Contact details of the contributor.
    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContributor {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Contributor"
    }
}