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
 * FhirMarketingStatus
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MarketingStatus">MarketingStatus</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MarketingStatus)
 */
interface FhirMarketingStatus : FhirBackboneElement {

    /**
     * The country in which the marketing authorisation has been granted shall be
     * specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements.
     */
    val country: CodeableConcept

    /**
     * Where a Medicines Regulatory Agency has granted a marketing authorisation for
     * which specific provisions within a jurisdiction apply, the jurisdiction can be
     * specified using an appropriate controlled terminology The controlled term and
     * the controlled term identifier shall be specified.
     */
    val jurisdiction: CodeableConcept?

    /**
     * This attribute provides information on the status of the marketing of the
     * medicinal product See ISO/TS 20443 for more information and examples.
     */
    val status: CodeableConcept

    /**
     * The date when the Medicinal Product is placed on the market by the Marketing
     * Authorisation Holder (or where applicable, the manufacturer/distributor) in a
     * country and/or jurisdiction shall be provided A complete date consisting of day,
     * month and year shall be specified using the ISO 8601 date format NOTE “Placed on
     * the market” refers to the release of the Medicinal Product into the distribution
     * chain.
     */
    val dateRange: Period

    /**
     * The date when the Medicinal Product is placed on the market by the Marketing
     * Authorisation Holder (or where applicable, the manufacturer/distributor) in a
     * country and/or jurisdiction shall be provided A complete date consisting of day,
     * month and year shall be specified using the ISO 8601 date format NOTE “Placed on
     * the market” refers to the release of the Medicinal Product into the distribution
     * chain.
     */
    val restoreDate: DateTime?
}

/**
 * MarketingStatus
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MarketingStatus">MarketingStatus</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MarketingStatus)
 */
@Serializable
@SerialName("MarketingStatus")
data class MarketingStatus(

    @SerialName("country")
    override val country: CodeableConcept,

    @SerialName("jurisdiction")
    override val jurisdiction: CodeableConcept? = null,

    @SerialName("status")
    override val status: CodeableConcept,

    @SerialName("dateRange")
    override val dateRange: Period,

    @SerialName("restoreDate")
    override val restoreDate: DateTime? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMarketingStatus {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MarketingStatus"
    }
}
