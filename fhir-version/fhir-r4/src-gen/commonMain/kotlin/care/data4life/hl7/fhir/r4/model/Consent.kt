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

import care.data4life.hl7.fhir.r4.codesystem.ConsentDataMeaning
import care.data4life.hl7.fhir.r4.codesystem.ConsentProvisionType
import care.data4life.hl7.fhir.r4.codesystem.ConsentState
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirConsent
 *
 * A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or
 * recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsent : FhirDomainResource {

    /**
     * Identifier for this record (external references).
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates the current state of this consent.
     */
    val status: ConsentState

    /**
     * Which of the four areas this resource covers (extensible).
     */
    val scope: CodeableConcept

    /**
     * Classification of the consent statement - for indexing/retrieval.
     */
    val category: kotlin.collections.List<CodeableConcept>

    /**
     * Who the consent applies to.
     */
    val patient: Reference?

    /**
     * When this Consent was created or indexed.
     */
    val dateTime: DateTime?

    /**
     * Who is agreeing to the policy and rules.
     */
    val performer: kotlin.collections.List<Reference>?

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
    val sourceReference: Reference?

    /**
     * Policies covered by this consent.
     */
    val policy: kotlin.collections.List<ConsentPolicy>?

    /**
     * Regulation that this consents to.
     */
    val policyRule: CodeableConcept?

    /**
     * Consent Verified by patient or family.
     */
    val verification: kotlin.collections.List<ConsentVerification>?

    /**
     * Constraints to the base Consent.policyRule.
     */
    val provision: ConsentProvision?
}

/**
 * Consent
 *
 * A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or
 * recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">Consent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("Consent")
data class Consent(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: ConsentState,

    @SerialName("scope")
    override val scope: CodeableConcept,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("dateTime")
    override val dateTime: DateTime? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<Reference>? = null,

    @SerialName("organization")
    override val organization: kotlin.collections.List<Reference>? = null,

    @SerialName("sourceAttachment")
    override val sourceAttachment: Attachment? = null,

    @SerialName("sourceReference")
    override val sourceReference: Reference? = null,

    @SerialName("policy")
    override val policy: kotlin.collections.List<ConsentPolicy>? = null,

    @SerialName("policyRule")
    override val policyRule: CodeableConcept? = null,

    @SerialName("verification")
    override val verification: kotlin.collections.List<ConsentVerification>? = null,

    @SerialName("provision")
    override val provision: ConsentProvision? = null,

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

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Consent"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
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

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConsentPolicy"
    }
}

/**
 * FhirConsentProvision
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of
 * access permissions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentProvision</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentProvision : FhirBackboneElement {

    /**
     * Action to take - permit or deny - when the rule conditions are met. Not
     * permitted in root rule, required in all nested rules.
     */
    val type: ConsentProvisionType?

    /**
     * Timeframe for this rule.
     */
    val period: Period?

    /**
     * Who|what controlled by this rule (or group, by role).
     */
    val actor: kotlin.collections.List<ConsentProvisionActor>?

    /**
     * Actions controlled by this rule.
     */
    val action: kotlin.collections.List<CodeableConcept>?

    /**
     * Security Labels that define affected resources.
     */
    val securityLabel: kotlin.collections.List<Coding>?

    /**
     * Context of activities covered by this rule.
     */
    val purpose: kotlin.collections.List<Coding>?

    /**
     * e.g. Resource Type, Profile, CDA, etc..
     */
    val clazz: kotlin.collections.List<Coding>?

    /**
     * e.g. LOINC or SNOMED CT code, etc. in the content.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Timeframe for data controlled by this rule.
     */
    val dataPeriod: Period?

    /**
     * Data controlled by this rule.
     */
    val data: kotlin.collections.List<ConsentProvisionData>?

    /**
     * Nested Exception Rules.
     */
    val provision: kotlin.collections.List<ConsentProvision>?
}

/**
 * ConsentProvision
 *
 * An exception to the base policy of this consent. An exception can be an addition or removal of
 * access permissions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentProvision</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentProvision")
data class ConsentProvision(

    @SerialName("type")
    override val type: ConsentProvisionType? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("actor")
    override val actor: kotlin.collections.List<ConsentProvisionActor>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("securityLabel")
    override val securityLabel: kotlin.collections.List<Coding>? = null,

    @SerialName("purpose")
    override val purpose: kotlin.collections.List<Coding>? = null,

    @SerialName("class")
    override val clazz: kotlin.collections.List<Coding>? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("dataPeriod")
    override val dataPeriod: Period? = null,

    @SerialName("data")
    override val data: kotlin.collections.List<ConsentProvisionData>? = null,

    @SerialName("provision")
    override val provision: kotlin.collections.List<ConsentProvision>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentProvision {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConsentProvision"
    }
}

/**
 * FhirConsentProvisionActor
 *
 * Who or what is controlled by this rule. Use group to identify a set of actors by some property they
 * share (e.g. 'admitting officers').
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentProvisionActor</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentProvisionActor : FhirBackboneElement {

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
 * ConsentProvisionActor
 *
 * Who or what is controlled by this rule. Use group to identify a set of actors by some property they
 * share (e.g. 'admitting officers').
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentProvisionActor</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentProvisionActor")
data class ConsentProvisionActor(

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
) : FhirConsentProvisionActor {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConsentProvisionActor"
    }
}

/**
 * FhirConsentProvisionData
 *
 * The resources controlled by this rule if specific resources are referenced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentProvisionData</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentProvisionData : FhirBackboneElement {

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
 * ConsentProvisionData
 *
 * The resources controlled by this rule if specific resources are referenced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentProvisionData</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentProvisionData")
data class ConsentProvisionData(

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
) : FhirConsentProvisionData {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConsentProvisionData"
    }
}

/**
 * FhirConsentVerification
 *
 * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the
 * patient, his/her family or another authorized person.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentVerification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
interface FhirConsentVerification : FhirBackboneElement {

    /**
     * Has been verified.
     */
    val verified: Bool

    /**
     * Person who verified.
     */
    val verifiedWith: Reference?

    /**
     * When consent verified.
     */
    val verificationDate: DateTime?
}

/**
 * ConsentVerification
 *
 * Whether a treatment instruction (e.g. artificial respiration yes or no) was verified with the
 * patient, his/her family or another authorized person.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Consent">ConsentVerification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Consent)
 */
@Serializable
@SerialName("ConsentVerification")
data class ConsentVerification(

    @SerialName("verified")
    override val verified: Bool,

    @SerialName("verifiedWith")
    override val verifiedWith: Reference? = null,

    @SerialName("verificationDate")
    override val verificationDate: DateTime? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConsentVerification {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConsentVerification"
    }
}
