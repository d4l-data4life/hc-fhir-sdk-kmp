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

import care.data4life.hl7.fhir.stu3.codesystem.NamingSystemIdentifierType
import care.data4life.hl7.fhir.stu3.codesystem.NamingSystemType
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirNamingSystem
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of
 * concepts, people, devices, etc. Represents a "System" used within the Identifier and Coding data
 * types.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NamingSystem">NamingSystem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NamingSystem)
 */
interface FhirNamingSystem : FhirDomainResource {

    /**
     * Name for this naming system (computer friendly).
     */
    val name: String

    /**
     * The status of this naming system. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * Indicates the purpose for the naming system - what kinds of things does it make
     * unique?
     */
    val kind: NamingSystemType

    /**
     * Date this was last changed.
     */
    val date: DateTime

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Who maintains system namespace?.
     */
    val responsible: String?

    /**
     * e.g. driver, provider, patient, bank etc..
     */
    val type: CodeableConcept?

    /**
     * Natural language description of the naming system.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for naming system (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * How/where is it used.
     */
    val usage: String?

    /**
     * Unique identifiers used for system.
     */
    val uniqueId: kotlin.collections.List<NamingSystemUniqueId>

    /**
     * Use this instead.
     */
    val replacedBy: Reference?
}

/**
 * NamingSystem
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of
 * concepts, people, devices, etc. Represents a "System" used within the Identifier and Coding data
 * types.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NamingSystem">NamingSystem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NamingSystem)
 */
@Serializable
@SerialName("NamingSystem")
data class NamingSystem(

    @SerialName("name")
    override val name: String,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("kind")
    override val kind: NamingSystemType,

    @SerialName("date")
    override val date: DateTime,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("responsible")
    override val responsible: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("usage")
    override val usage: String? = null,

    @SerialName("uniqueId")
    override val uniqueId: kotlin.collections.List<NamingSystemUniqueId>,

    @SerialName("replacedBy")
    override val replacedBy: Reference? = null,

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
) : FhirNamingSystem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NamingSystem"
    }
}

/**
 * FhirNamingSystemUniqueId
 *
 * Indicates how the system may be identified when referenced in electronic exchange.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NamingSystem">NamingSystemUniqueId</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NamingSystem)
 */
interface FhirNamingSystemUniqueId : FhirBackboneElement {

    /**
     * Identifies the unique identifier scheme used for this particular identifier.
     */
    val type: NamingSystemIdentifierType

    /**
     * The unique identifier.
     */
    val value: String

    /**
     * Is this the id that should be used for this type.
     */
    val preferred: Bool?

    /**
     * Notes about identifier usage.
     */
    val comment: String?

    /**
     * When is identifier valid?.
     */
    val period: Period?
}

/**
 * NamingSystemUniqueId
 *
 * Indicates how the system may be identified when referenced in electronic exchange.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NamingSystem">NamingSystemUniqueId</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NamingSystem)
 */
@Serializable
@SerialName("NamingSystemUniqueId")
data class NamingSystemUniqueId(

    @SerialName("type")
    override val type: NamingSystemIdentifierType,

    @SerialName("value")
    override val value: String,

    @SerialName("preferred")
    override val preferred: Bool? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("period")
    override val period: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNamingSystemUniqueId {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NamingSystemUniqueId"
    }
}
