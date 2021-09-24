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

import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirNarrative
 *
 * A human-readable summary of the resource conveying the essential clinical and business information
 * for the resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Narrative">Narrative</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Narrative)
 */
interface FhirNarrative : FhirElement {

    /**
     * The status of the narrative - whether it's entirely generated (from just the
     * defined data or the extensions too), or whether a human authored it and it may
     * contain additional data.
     */
    val status: NarrativeStatus

    /**
     * Limited xhtml content.
     */
    val div: String
}

/**
 * Narrative
 *
 * A human-readable summary of the resource conveying the essential clinical and business information
 * for the resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Narrative">Narrative</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Narrative)
 */
@Serializable
@SerialName("Narrative")
data class Narrative(

    @SerialName("status")
    override val status: NarrativeStatus,

    @SerialName("div")
    override val div: String,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNarrative {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Narrative"
    }
}
