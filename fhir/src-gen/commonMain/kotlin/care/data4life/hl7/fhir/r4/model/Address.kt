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

import care.data4life.hl7.fhir.r4.codesystem.AddressType
import care.data4life.hl7.fhir.r4.codesystem.AddressUse
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirAddress
 *
 * An address expressed using postal conventions (as opposed to GPS or other location definition
 * formats). This data type may be used to convey addresses for use in delivering mail as well as for
 * visiting locations which might not be valid for mail delivery. There are a variety of postal address
 * formats defined around the world.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Address">Address</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Address)
 */
interface FhirAddress : FhirElement {

    /**
     * The purpose of this address.
     */
    val use: AddressUse?

    /**
     * Distinguishes between physical addresses (those you can visit) and mailing
     * addresses (e.g. PO Boxes and care-of addresses). Most addresses are both.
     */
    val type: AddressType?

    /**
     * Text representation of the address.
     */
    val text: String?

    /**
     * Street name, number, direction & P.O. Box etc..
     */
    val line: kotlin.collections.List<String>?

    /**
     * Name of city, town etc..
     */
    val city: String?

    /**
     * District name (aka county).
     */
    val district: String?

    /**
     * Sub-unit of country (abbreviations ok).
     */
    val state: String?

    /**
     * Postal code for area.
     */
    val postalCode: String?

    /**
     * Country (e.g. can be ISO 3166 2 or 3 letter code).
     */
    val country: String?

    /**
     * Time period when address was/is in use.
     */
    val period: Period?
}

/**
 * Address
 *
 * An address expressed using postal conventions (as opposed to GPS or other location definition
 * formats). This data type may be used to convey addresses for use in delivering mail as well as for
 * visiting locations which might not be valid for mail delivery. There are a variety of postal address
 * formats defined around the world.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Address">Address</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Address)
 */
@Serializable
@SerialName("Address")
data class Address(

    @SerialName("use")
    override val use: AddressUse? = null,

    @SerialName("type")
    override val type: AddressType? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("line")
    override val line: kotlin.collections.List<String>? = null,

    @SerialName("city")
    override val city: String? = null,

    @SerialName("district")
    override val district: String? = null,

    @SerialName("state")
    override val state: String? = null,

    @SerialName("postalCode")
    override val postalCode: String? = null,

    @SerialName("country")
    override val country: String? = null,

    @SerialName("period")
    override val period: Period? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirAddress {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Address"
    }
}
