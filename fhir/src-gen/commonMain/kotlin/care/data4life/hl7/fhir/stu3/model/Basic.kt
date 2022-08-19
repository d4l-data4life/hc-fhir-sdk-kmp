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

import care.data4life.hl7.fhir.stu3.primitive.Date
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirBasic
 *
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map
 * to an existing resource, and custom resources not appropriate for inclusion in the FHIR
 * specification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Basic">Basic</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Basic)
 */
interface FhirBasic : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Kind of Resource.
     */
    val code: CodeableConcept

    /**
     * Identifies the focus of this resource.
     */
    val subject: Reference?

    /**
     * When created.
     */
    val created: Date?

    /**
     * Who created.
     */
    val author: Reference?
}

/**
 * Basic
 *
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map
 * to an existing resource, and custom resources not appropriate for inclusion in the FHIR
 * specification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Basic">Basic</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Basic)
 */
@Serializable
@SerialName("Basic")
data class Basic(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("created")
    override val created: Date? = null,

    @SerialName("author")
    override val author: Reference? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirBasic {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Basic"
    }
}
