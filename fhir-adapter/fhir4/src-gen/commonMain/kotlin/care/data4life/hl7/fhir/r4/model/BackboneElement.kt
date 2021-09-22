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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirBackboneElement
 *
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BackboneElement">BackboneElement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BackboneElement)
 */
interface FhirBackboneElement : FhirElement {

    /**
     * Extensions that cannot be ignored even if unrecognized.
     */
    val modifierExtension: kotlin.collections.List<Extension>?
}

/**
 * BackboneElement
 *
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/BackboneElement">BackboneElement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/BackboneElement)
 */
@Serializable
@SerialName("BackboneElement")
data class BackboneElement(

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBackboneElement {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "BackboneElement"
    }
}
