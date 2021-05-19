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

import care.data4life.hl7.fhir.stu3.codesystem.ConsentDataMeaning
import care.data4life.hl7.fhir.stu3.codesystem.ConsentExceptType
import care.data4life.hl7.fhir.stu3.codesystem.ConsentState
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirConsent
 *
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s)
 * or recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsent : FhirDomainResource {

    /**
     * Identifier for this record (external references).
     */
    val identifier: Identifier?

    /**
     * Indicates the current state of this consent.
     */
    val status: ConsentState

    /**
     * Classification of the consent statement - for indexing/retrieval.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Who the consent applies to.
     */
    val patient: Reference

    /**
     * Period that this consent applies.
     */
    val period: Period?

    /**
     * When this Consent was created or indexed.
     */
    val dateTime: DateTime?

    /**
     * Who is agreeing to the policy and exceptions.
     */
    val consentingParty: kotlin.collections.List<Reference>?

    /**
     * Who|what controlled by this consent (or group, by role).
     */
    val actor: kotlin.collections.List<ConsentActor>?

    /**
     * Actions controlled by this consent.
     */
    val action: kotlin.collections.List<CodeableConcept>?

    /**
     * Custodian of the consent.
     */
    val organization: kotlin.collections.List<Reference>?

    /**
     * Source from which this consent is taken.
     */
    val sourceAttachment: Attachment?

    /**
     * Source from which this consent is taken.
     */
    val sourceIdentifier: Identifier?

    /**
     * Source from which this consent is taken.
     */
    val sourceReference: Reference?

    /**
     * Policies covered by this consent.
     */
    val policy: kotlin.collections.List<ConsentPolicy>?

    /**
     * Policy that this consents to.
     */
    val policyRule: String?

    /**
     * Security Labels that define affected resources.
     */
    val securityLabel: kotlin.collections.List<Coding>?

    /**
     * Context of activities for which the agreement is made.
     */
    val purpose: kotlin.collections.List<Coding>?

    /**
     * Timeframe for data controlled by this consent.
     */
    val dataPeriod: Period?

    /**
     * Data controlled by this consent.
     */
    val data: kotlin.collections.List<ConsentData>?

    /**
     * Additional rule - addition or removal of permissions.
     */
    val except: kotlin.collections.List<ConsentExcept>?
}

/**
 * Consent
 *
 * A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s)
 * or recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("Consent")
data class Consent(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("status")
    override val status: ConsentState,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("dateTime")
    override val dateTime: DateTime? = null,

    @SerialName("consentingParty")
    override val consentingParty: kotlin.collections.List<Reference>? = null,

    @SerialName("actor")
    override val actor: kotlin.collections.List<ConsentActor>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("organization")
    override val organization: kotlin.collections.List<Reference>? = null,

    @SerialName("sourceAttachment")
    override val sourceAttachment: Attachment? = null,

    @SerialName("sourceIdentifier")
    override val sourceIdentifier: Identifier? = null,

    @SerialName("sourceReference")
    override val sourceReference: Reference? = null,

    @SerialName("policy")
    override val policy: kotlin.collections.List<ConsentPolicy>? = null,

    @SerialName("policyRule")
    override val policyRule: String? = null,

    @SerialName("securityLabel")
    override val securityLabel: kotlin.collections.List<Coding>? = null,

    @SerialName("purpose")
    override val purpose: kotlin.collections.List<Coding>? = null,

    @SerialName("dataPeriod")
    override val dataPeriod: Period? = null,

    @SerialName("data")
    override val data: kotlin.collections.List<ConsentData>? = null,

    @SerialName("except")
    override val except: kotlin.collections.List<ConsentExcept>? = null,

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
) : FhirConsent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Consent"
    }
}

/**
 * FhirConsentActor
 *
 * Who or what is controlled by this consent. Use group to identify a set of actors by some property
 * they share (e.g. 'admitting officers').
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentActor</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentActor : FhirBackboneElement {

    /**
     * How the actor is involved.
     */
    val role: CodeableConcept

    /**
     * Resource for the actor (or group, by role).
     */
    val reference: Reference
}

/**
 * ConsentActor
 *
 * Who or what is controlled by this consent. Use group to identify a set of actors by some property
 * they share (e.g. 'admitting officers').
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentActor</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentActor")
data class ConsentActor(

    @SerialName("role")
    override val role: CodeableConcept,

    @SerialName("reference")
    override val reference: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentActor {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConsentActor"
    }
}

/**
 * FhirConsentData
 *
 * The resources controlled by this consent, if specific resources are referenced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentData : FhirBackboneElement {

    /**
     * How the resource reference is interpreted when testing consent restrictions.
     */
    val meaning: ConsentDataMeaning

    /**
     * The actual data reference.
     */
    val reference: Reference
}

/**
 * ConsentData
 *
 * The resources controlled by this consent, if specific resources are referenced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentData")
data class ConsentData(

    @SerialName("meaning")
    override val meaning: ConsentDataMeaning,

    @SerialName("reference")
    override val reference: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentData {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConsentData"
    }
}

/**
 * FhirConsentExcept
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of
 * access permissions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentExcept</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentExcept : FhirBackboneElement {

    /**
     * Action to take - permit or deny - when the exception conditions are met.
     */
    val type: ConsentExceptType

    /**
     * Timeframe for this exception.
     */
    val period: Period?

    /**
     * Who|what controlled by this exception (or group, by role).
     */
    val actor: kotlin.collections.List<ConsentExceptActor>?

    /**
     * Actions controlled by this exception.
     */
    val action: kotlin.collections.List<CodeableConcept>?

    /**
     * Security Labels that define affected resources.
     */
    val securityLabel: kotlin.collections.List<Coding>?

    /**
     * Context of activities covered by this exception.
     */
    val purpose: kotlin.collections.List<Coding>?

    /**
     * e.g. Resource Type, Profile, or CDA etc.
     */
    val clazz: kotlin.collections.List<Coding>?

    /**
     * e.g. LOINC or SNOMED CT code, etc in the content.
     */
    val code: kotlin.collections.List<Coding>?

    /**
     * Timeframe for data controlled by this exception.
     */
    val dataPeriod: Period?

    /**
     * Data controlled by this exception.
     */
    val data: kotlin.collections.List<ConsentExceptData>?
}

/**
 * ConsentExcept
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of
 * access permissions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentExcept</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentExcept")
data class ConsentExcept(

    @SerialName("type")
    override val type: ConsentExceptType,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("actor")
    override val actor: kotlin.collections.List<ConsentExceptActor>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("securityLabel")
    override val securityLabel: kotlin.collections.List<Coding>? = null,

    @SerialName("purpose")
    override val purpose: kotlin.collections.List<Coding>? = null,

    @SerialName("class")
    override val clazz: kotlin.collections.List<Coding>? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<Coding>? = null,

    @SerialName("dataPeriod")
    override val dataPeriod: Period? = null,

    @SerialName("data")
    override val data: kotlin.collections.List<ConsentExceptData>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentExcept {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConsentExcept"
    }
}

/**
 * FhirConsentExceptActor
 *
 * Who or what is controlled by this Exception. Use group to identify a set of actors by some property
 * they share (e.g. 'admitting officers').
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentExceptActor</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentExceptActor : FhirBackboneElement {

    /**
     * How the actor is involved.
     */
    val role: CodeableConcept

    /**
     * Resource for the actor (or group, by role).
     */
    val reference: Reference
}

/**
 * ConsentExceptActor
 *
 * Who or what is controlled by this Exception. Use group to identify a set of actors by some property
 * they share (e.g. 'admitting officers').
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentExceptActor</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentExceptActor")
data class ConsentExceptActor(

    @SerialName("role")
    override val role: CodeableConcept,

    @SerialName("reference")
    override val reference: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentExceptActor {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConsentExceptActor"
    }
}

/**
 * FhirConsentExceptData
 *
 * The resources controlled by this exception, if specific resources are referenced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentExceptData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentExceptData : FhirBackboneElement {

    /**
     * How the resource reference is interpreted when testing consent restrictions.
     */
    val meaning: ConsentDataMeaning

    /**
     * The actual data reference.
     */
    val reference: Reference
}

/**
 * ConsentExceptData
 *
 * The resources controlled by this exception, if specific resources are referenced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentExceptData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentExceptData")
data class ConsentExceptData(

    @SerialName("meaning")
    override val meaning: ConsentDataMeaning,

    @SerialName("reference")
    override val reference: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentExceptData {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConsentExceptData"
    }
}

/**
 * FhirConsentPolicy
 *
 * The references to the policies that are included in this consent scope. Policies may be
 * organizational, but are often defined jurisdictionally, or in law.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentPolicy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentPolicy : FhirBackboneElement {

    /**
     * Enforcement source for policy.
     */
    val authority: String?

    /**
     * Specific policy covered by this consent.
     */
    val uri: String?
}

/**
 * ConsentPolicy
 *
 * The references to the policies that are included in this consent scope. Policies may be
 * organizational, but are often defined jurisdictionally, or in law.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentPolicy</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentPolicy")
data class ConsentPolicy(

    @SerialName("authority")
    override val authority: String? = null,

    @SerialName("uri")
    override val uri: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentPolicy {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConsentPolicy"
    }
}
