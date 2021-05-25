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

import care.data4life.hl7.fhir.stu3.codesystem.RelatedArtifactType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirRelatedArtifact
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RelatedArtifact">RelatedArtifact</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/RelatedArtifact)
 */
interface FhirRelatedArtifact : FhirElement {

    /**
     * The type of relationship to the related artifact.
     */
    val type: RelatedArtifactType

    /**
     * Brief description of the related artifact.
     */
    val display: String?

    /**
     * Bibliographic citation for the artifact.
     */
    val citation: String?

    /**
     * Where the artifact can be accessed.
     */
    val url: String?

    /**
     * What document is being referenced.
     */
    val document: Attachment?

    /**
     * What resource is being referenced.
     */
    val resource: Reference?
}

/**
 * RelatedArtifact
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RelatedArtifact">RelatedArtifact</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/RelatedArtifact)
 */
@Serializable
@SerialName("RelatedArtifact")
data class RelatedArtifact(

    @SerialName("type")
    override val type: RelatedArtifactType,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("citation")
    override val citation: String? = null,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("document")
    override val document: Attachment? = null,

    @SerialName("resource")
    override val resource: Reference? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRelatedArtifact {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "RelatedArtifact"
    }
}
