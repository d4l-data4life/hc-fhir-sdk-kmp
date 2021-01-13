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

import care.data4life.fhir.stu3.codesystem.AddressType
import care.data4life.fhir.stu3.codesystem.AddressUse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirAddress : FhirElement {

    // The purpose of this address.
    val use: AddressUse?

    // Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
    val type: AddressType?

    // Text representation of the address.
    val text: String?

    // Street name, number, direction & P.O. Box etc..
    val line: List<String>?

    // Name of city, town etc..
    val city: String?

    // District name (aka county).
    val district: String?

    // Sub-unit of country (abbreviations ok).
    val state: String?

    // Postal code for area.
    val postalCode: String?

    // Country (e.g. can be ISO 3166 2 or 3 letter code).
    val country: String?

    // Time period when address was/is in use.
    val period: Period?
}


/**
 * ClassName: Address
 *
 * SourceFileName: Address.kt
 *
 *
 * An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Address">Address</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Address) on 2020-10-01
 */
@Serializable
@SerialName("Address")
data class Address(

    // The purpose of this address.
    @SerialName("use")
    override val use: AddressUse? = null,
    // Distinguishes between physical addresses (those you can visit) and mailing addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
    @SerialName("type")
    override val type: AddressType? = null,
    // Text representation of the address.
    @SerialName("text")
    override val text: String? = null,
    // Street name, number, direction & P.O. Box etc..
    @SerialName("line")
    override val line: List<String>? = null,
    // Name of city, town etc..
    @SerialName("city")
    override val city: String? = null,
    // District name (aka county).
    @SerialName("district")
    override val district: String? = null,
    // Sub-unit of country (abbreviations ok).
    @SerialName("state")
    override val state: String? = null,
    // Postal code for area.
    @SerialName("postalCode")
    override val postalCode: String? = null,
    // Country (e.g. can be ISO 3166 2 or 3 letter code).
    @SerialName("country")
    override val country: String? = null,
    // Time period when address was/is in use.
    @SerialName("period")
    override val period: Period? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAddress {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Address"
    }
}
