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

import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirContactDetail
 *
 * Specifies contact information for a person or organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ContactDetail">ContactDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ContactDetail)
 */
interface FhirContactDetail : FhirElement {

    /**
     * Name of an individual to contact.
     */
    val name: String?

    /**
     * Contact details for individual or organization.
     */
    val telecom: kotlin.collections.List<ContactPoint>?
}

/**
 * ContactDetail
 *
 * Specifies contact information for a person or organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ContactDetail">ContactDetail</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ContactDetail)
 */
@Serializable
@SerialName("ContactDetail")
data class ContactDetail(

    @SerialName("name")
    override val name: String? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContactDetail {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContactDetail"
    }
}
