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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirContactDetail : FhirElement {

    // Name of an individual to contact.
    val name: String?

    // Contact details for individual or organization.
    val telecom: List<ContactPoint>?
}

/**
 * ClassName: ContactDetail
 *
 * SourceFileName: ContactDetail.kt
 *
 *
 * Specifies contact information for a person or organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ContactDetail">ContactDetail</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ContactDetail)
 */
@Serializable
@SerialName("ContactDetail")
data class ContactDetail(

    // Name of an individual to contact.
    @SerialName("name")
    override val name: String? = null,
    // Contact details for individual or organization.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContactDetail {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContactDetail"
    }
}
