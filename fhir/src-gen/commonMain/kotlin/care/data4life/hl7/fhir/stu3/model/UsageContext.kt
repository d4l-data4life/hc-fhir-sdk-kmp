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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirUsageContext : FhirElement {

    // Type of context being specified.
    val code: Coding

    // Value that defines the context.
    val valueCodeableConcept: CodeableConcept?

    // Value that defines the context.
    val valueQuantity: Quantity?

    // Value that defines the context.
    val valueRange: Range?
}

/**
 * ClassName: UsageContext
 *
 * SourceFileName: UsageContext.kt
 *
 *
 * Specifies clinical/business/etc metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/UsageContext">UsageContext</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/UsageContext)
 */
@Serializable
@SerialName("UsageContext")
data class UsageContext(

    // Type of context being specified.
    @SerialName("code")
    override val code: Coding,
    // Value that defines the context.
    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,
    // Value that defines the context.
    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,
    // Value that defines the context.
    @SerialName("valueRange")
    override val valueRange: Range? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirUsageContext {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "UsageContext"
    }
}
