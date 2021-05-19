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

import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMeta
 *
 * The metadata about a resource. This is content in the resource that is maintained by the
 * infrastructure. Changes to the content may not always be associated with version changes to the
 * resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Meta">Meta</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Meta)
 */
interface FhirMeta : FhirElement {

    /**
     * Version specific identifier.
     */
    val versionId: String?

    /**
     * When the resource version last changed.
     */
    val lastUpdated: Instant?

    /**
     * Profiles this resource claims to conform to.
     */
    val profile: List<String>?

    /**
     * Security Labels applied to this resource.
     */
    val security: List<Coding>?

    /**
     * Tags applied to this resource.
     */
    val tag: List<Coding>?
}

/**
 * Meta
 *
 * SourceFileName: Meta.kt
 *
 * The metadata about a resource. This is content in the resource that is maintained by the
 * infrastructure. Changes to the content may not always be associated with version changes to the
 * resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Meta">Meta</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Meta)
 */
@Serializable
@SerialName("Meta")
data class Meta(

    @SerialName("versionId")
    override val versionId: String? = null,

    @SerialName("lastUpdated")
    override val lastUpdated: Instant? = null,

    @SerialName("profile")
    override val profile: List<String>? = null,

    @SerialName("security")
    override val security: List<Coding>? = null,

    @SerialName("tag")
    override val tag: List<Coding>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMeta {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Meta"
    }
}
