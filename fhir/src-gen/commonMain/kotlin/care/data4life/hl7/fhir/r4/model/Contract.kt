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

import care.data4life.hl7.fhir.r4.codesystem.ContractResourcePublicationStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.ContractResourceStatusCodes
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import care.data4life.hl7.fhir.r4.primitive.Time
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirContract
 *
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
 * agreement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">Contract</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContract : FhirDomainResource {

    /**
     * Contract number.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Basal definition.
     */
    val url: String?

    /**
     * Business edition.
     */
    val version: String?

    /**
     * The status of the resource instance.
     */
    val status: ContractResourceStatusCodes?

    /**
     * Negotiation status.
     */
    val legalState: CodeableConcept?

    /**
     * Source Contract Definition.
     */
    val instantiatesCanonical: Reference?

    /**
     * External Contract Definition.
     */
    val instantiatesUri: String?

    /**
     * Content derived from the basal information.
     */
    val contentDerivative: CodeableConcept?

    /**
     * When this Contract was issued.
     */
    val issued: DateTime?

    /**
     * Effective time.
     */
    val applies: Period?

    /**
     * Contract cessation cause.
     */
    val expirationType: CodeableConcept?

    /**
     * Contract Target Entity.
     */
    val subject: kotlin.collections.List<Reference>?

    /**
     * Authority under which this Contract has standing.
     */
    val authority: kotlin.collections.List<Reference>?

    /**
     * A sphere of control governed by an authoritative jurisdiction, organization, or
     * person.
     */
    val domain: kotlin.collections.List<Reference>?

    /**
     * Specific Location.
     */
    val site: kotlin.collections.List<Reference>?

    /**
     * Computer friendly designation.
     */
    val name: String?

    /**
     * Human Friendly name.
     */
    val title: String?

    /**
     * Subordinate Friendly name.
     */
    val subtitle: String?

    /**
     * Acronym or short name.
     */
    val alias: kotlin.collections.List<String>?

    /**
     * Source of Contract.
     */
    val author: Reference?

    /**
     * Range of Legal Concerns.
     */
    val scope: CodeableConcept?

    /**
     * Focus of contract interest.
     */
    val topicCodeableConcept: CodeableConcept?

    /**
     * Focus of contract interest.
     */
    val topicReference: Reference?

    /**
     * Legal instrument category.
     */
    val type: CodeableConcept?

    /**
     * Subtype within the context of type.
     */
    val subType: kotlin.collections.List<CodeableConcept>?

    /**
     * Contract precursor content.
     */
    val contentDefinition: ContractContentDefinition?

    /**
     * Contract Term List.
     */
    val term: kotlin.collections.List<ContractTerm>?

    /**
     * Extra Information.
     */
    val supportingInfo: kotlin.collections.List<Reference>?

    /**
     * Key event in Contract History.
     */
    val relevantHistory: kotlin.collections.List<Reference>?

    /**
     * Contract Signatory.
     */
    val signer: kotlin.collections.List<ContractSigner>?

    /**
     * Contract Friendly Language.
     */
    val friendly: kotlin.collections.List<ContractFriendly>?

    /**
     * Contract Legal Language.
     */
    val legal: kotlin.collections.List<ContractLegal>?

    /**
     * Computable Contract Language.
     */
    val rule: kotlin.collections.List<ContractRule>?

    /**
     * Binding Contract.
     */
    val legallyBindingAttachment: Attachment?

    /**
     * Binding Contract.
     */
    val legallyBindingReference: Reference?
}

/**
 * Contract
 *
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
 * agreement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">Contract</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("Contract")
data class Contract(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("status")
    override val status: ContractResourceStatusCodes? = null,

    @SerialName("legalState")
    override val legalState: CodeableConcept? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: Reference? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: String? = null,

    @SerialName("contentDerivative")
    override val contentDerivative: CodeableConcept? = null,

    @SerialName("issued")
    override val issued: DateTime? = null,

    @SerialName("applies")
    override val applies: Period? = null,

    @SerialName("expirationType")
    override val expirationType: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: kotlin.collections.List<Reference>? = null,

    @SerialName("authority")
    override val authority: kotlin.collections.List<Reference>? = null,

    @SerialName("domain")
    override val domain: kotlin.collections.List<Reference>? = null,

    @SerialName("site")
    override val site: kotlin.collections.List<Reference>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("subtitle")
    override val subtitle: String? = null,

    @SerialName("alias")
    override val alias: kotlin.collections.List<String>? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("scope")
    override val scope: CodeableConcept? = null,

    @SerialName("topicCodeableConcept")
    override val topicCodeableConcept: CodeableConcept? = null,

    @SerialName("topicReference")
    override val topicReference: Reference? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subType")
    override val subType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("contentDefinition")
    override val contentDefinition: ContractContentDefinition? = null,

    @SerialName("term")
    override val term: kotlin.collections.List<ContractTerm>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<Reference>? = null,

    @SerialName("relevantHistory")
    override val relevantHistory: kotlin.collections.List<Reference>? = null,

    @SerialName("signer")
    override val signer: kotlin.collections.List<ContractSigner>? = null,

    @SerialName("friendly")
    override val friendly: kotlin.collections.List<ContractFriendly>? = null,

    @SerialName("legal")
    override val legal: kotlin.collections.List<ContractLegal>? = null,

    @SerialName("rule")
    override val rule: kotlin.collections.List<ContractRule>? = null,

    @SerialName("legallyBindingAttachment")
    override val legallyBindingAttachment: Attachment? = null,

    @SerialName("legallyBindingReference")
    override val legallyBindingReference: Reference? = null,

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
) : FhirContract {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Contract"
    }
}

/**
 * FhirContractContentDefinition
 *
 * Precusory content developed with a focus and intent of supporting the formation a Contract instance,
 * which may be associated with and transformable into a Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractContentDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractContentDefinition : FhirBackboneElement {

    /**
     * Content structure and use.
     */
    val type: CodeableConcept

    /**
     * Detailed Content Type Definition.
     */
    val subType: CodeableConcept?

    /**
     * Publisher Entity.
     */
    val publisher: Reference?

    /**
     * When published.
     */
    val publicationDate: DateTime?

    /**
     * None
     */
    val publicationStatus: ContractResourcePublicationStatusCodes

    /**
     * Publication Ownership.
     */
    val copyright: String?
}

/**
 * ContractContentDefinition
 *
 * Precusory content developed with a focus and intent of supporting the formation a Contract instance,
 * which may be associated with and transformable into a Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractContentDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractContentDefinition")
data class ContractContentDefinition(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("subType")
    override val subType: CodeableConcept? = null,

    @SerialName("publisher")
    override val publisher: Reference? = null,

    @SerialName("publicationDate")
    override val publicationDate: DateTime? = null,

    @SerialName("publicationStatus")
    override val publicationStatus: ContractResourcePublicationStatusCodes,

    @SerialName("copyright")
    override val copyright: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractContentDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractContentDefinition"
    }
}

/**
 * FhirContractFriendly
 *
 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
 * language" means the representation of the Contract and Contract Provisions in a manner that is
 * readily accessible and understandable by a layperson in accordance with best practices for
 * communication styles that ensure that those agreeing to or signing the Contract understand the
 * roles, actions, obligations, responsibilities, and implication of the agreement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractFriendly</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractFriendly : FhirBackboneElement {

    /**
     * Easily comprehended representation of this Contract.
     */
    val contentAttachment: Attachment?

    /**
     * Easily comprehended representation of this Contract.
     */
    val contentReference: Reference?
}

/**
 * ContractFriendly
 *
 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
 * language" means the representation of the Contract and Contract Provisions in a manner that is
 * readily accessible and understandable by a layperson in accordance with best practices for
 * communication styles that ensure that those agreeing to or signing the Contract understand the
 * roles, actions, obligations, responsibilities, and implication of the agreement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractFriendly</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractFriendly")
data class ContractFriendly(

    @SerialName("contentAttachment")
    override val contentAttachment: Attachment? = null,

    @SerialName("contentReference")
    override val contentReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractFriendly {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractFriendly"
    }
}

/**
 * FhirContractLegal
 *
 * List of Legal expressions or representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractLegal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractLegal : FhirBackboneElement {

    /**
     * Contract Legal Text.
     */
    val contentAttachment: Attachment?

    /**
     * Contract Legal Text.
     */
    val contentReference: Reference?
}

/**
 * ContractLegal
 *
 * List of Legal expressions or representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractLegal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractLegal")
data class ContractLegal(

    @SerialName("contentAttachment")
    override val contentAttachment: Attachment? = null,

    @SerialName("contentReference")
    override val contentReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractLegal {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractLegal"
    }
}

/**
 * FhirContractRule
 *
 * List of Computable Policy Rule Language Representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractRule</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractRule : FhirBackboneElement {

    /**
     * Computable Contract Rules.
     */
    val contentAttachment: Attachment?

    /**
     * Computable Contract Rules.
     */
    val contentReference: Reference?
}

/**
 * ContractRule
 *
 * List of Computable Policy Rule Language Representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractRule</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractRule")
data class ContractRule(

    @SerialName("contentAttachment")
    override val contentAttachment: Attachment? = null,

    @SerialName("contentReference")
    override val contentReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractRule {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractRule"
    }
}

/**
 * FhirContractSigner
 *
 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and
 * grantee(s), which are any person or organization bound by the contract, and any ancillary parties,
 * which facilitate the execution of the contract such as a notary or witness.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractSigner</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractSigner : FhirBackboneElement {

    /**
     * Contract Signatory Role.
     */
    val type: Coding

    /**
     * Contract Signatory Party.
     */
    val party: Reference

    /**
     * Contract Documentation Signature.
     */
    val signature: kotlin.collections.List<Signature>
}

/**
 * ContractSigner
 *
 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and
 * grantee(s), which are any person or organization bound by the contract, and any ancillary parties,
 * which facilitate the execution of the contract such as a notary or witness.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractSigner</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractSigner")
data class ContractSigner(

    @SerialName("type")
    override val type: Coding,

    @SerialName("party")
    override val party: Reference,

    @SerialName("signature")
    override val signature: kotlin.collections.List<Signature>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractSigner {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractSigner"
    }
}

/**
 * FhirContractTerm
 *
 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
 * nested groups.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTerm</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTerm : FhirBackboneElement {

    /**
     * Contract Term Number.
     */
    val identifier: Identifier?

    /**
     * Contract Term Issue Date Time.
     */
    val issued: DateTime?

    /**
     * Contract Term Effective Time.
     */
    val applies: Period?

    /**
     * Term Concern.
     */
    val topicCodeableConcept: CodeableConcept?

    /**
     * Term Concern.
     */
    val topicReference: Reference?

    /**
     * Contract Term Type or Form.
     */
    val type: CodeableConcept?

    /**
     * Contract Term Type specific classification.
     */
    val subType: CodeableConcept?

    /**
     * Term Statement.
     */
    val text: String?

    /**
     * Protection for the Term.
     */
    val securityLabel: kotlin.collections.List<ContractTermSecurityLabel>?

    /**
     * Context of the Contract term.
     */
    val offer: ContractTermOffer

    /**
     * Contract Term Asset List.
     */
    val asset: kotlin.collections.List<ContractTermAsset>?

    /**
     * Entity being ascribed responsibility.
     */
    val action: kotlin.collections.List<ContractTermAction>?

    /**
     * Nested Contract Term Group.
     */
    val group: kotlin.collections.List<ContractTerm>?
}

/**
 * ContractTerm
 *
 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
 * nested groups.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTerm</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTerm")
data class ContractTerm(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("issued")
    override val issued: DateTime? = null,

    @SerialName("applies")
    override val applies: Period? = null,

    @SerialName("topicCodeableConcept")
    override val topicCodeableConcept: CodeableConcept? = null,

    @SerialName("topicReference")
    override val topicReference: Reference? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subType")
    override val subType: CodeableConcept? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("securityLabel")
    override val securityLabel: kotlin.collections.List<ContractTermSecurityLabel>? = null,

    @SerialName("offer")
    override val offer: ContractTermOffer,

    @SerialName("asset")
    override val asset: kotlin.collections.List<ContractTermAsset>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<ContractTermAction>? = null,

    @SerialName("group")
    override val group: kotlin.collections.List<ContractTerm>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTerm {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTerm"
    }
}

/**
 * FhirContractTermAction
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for
 * the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermAction : FhirBackboneElement {

    /**
     * True if the term prohibits the action.
     */
    val doNotPerform: Bool?

    /**
     * Type or form of the action.
     */
    val type: CodeableConcept

    /**
     * Entity of the action.
     */
    val subject: kotlin.collections.List<ContractTermActionSubject>?

    /**
     * Purpose for the Contract Term Action.
     */
    val intent: CodeableConcept

    /**
     * Pointer to specific item.
     */
    val linkId: kotlin.collections.List<String>?

    /**
     * State of the action.
     */
    val status: CodeableConcept

    /**
     * Episode associated with action.
     */
    val context: Reference?

    /**
     * Pointer to specific item.
     */
    val contextLinkId: kotlin.collections.List<String>?

    /**
     * When action happens.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When action happens.
     */
    val occurrencePeriod: Period?

    /**
     * When action happens.
     */
    val occurrenceTiming: Timing?

    /**
     * Who asked for action.
     */
    val requester: kotlin.collections.List<Reference>?

    /**
     * Pointer to specific item.
     */
    val requesterLinkId: kotlin.collections.List<String>?

    /**
     * Kind of service performer.
     */
    val performerType: kotlin.collections.List<CodeableConcept>?

    /**
     * Competency of the performer.
     */
    val performerRole: CodeableConcept?

    /**
     * Actor that wil execute (or not) the action.
     */
    val performer: Reference?

    /**
     * Pointer to specific item.
     */
    val performerLinkId: kotlin.collections.List<String>?

    /**
     * Why is action (not) needed?.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why is action (not) needed?.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Why action is to be performed.
     */
    val reason: kotlin.collections.List<String>?

    /**
     * Pointer to specific item.
     */
    val reasonLinkId: kotlin.collections.List<String>?

    /**
     * Comments about the action.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Action restriction numbers.
     */
    val securityLabelNumber: kotlin.collections.List<UnsignedInteger>?
}

/**
 * ContractTermAction
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for
 * the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermAction")
data class ContractTermAction(

    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("subject")
    override val subject: kotlin.collections.List<ContractTermActionSubject>? = null,

    @SerialName("intent")
    override val intent: CodeableConcept,

    @SerialName("linkId")
    override val linkId: kotlin.collections.List<String>? = null,

    @SerialName("status")
    override val status: CodeableConcept,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("contextLinkId")
    override val contextLinkId: kotlin.collections.List<String>? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("requester")
    override val requester: kotlin.collections.List<Reference>? = null,

    @SerialName("requesterLinkId")
    override val requesterLinkId: kotlin.collections.List<String>? = null,

    @SerialName("performerType")
    override val performerType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("performerRole")
    override val performerRole: CodeableConcept? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("performerLinkId")
    override val performerLinkId: kotlin.collections.List<String>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("reason")
    override val reason: kotlin.collections.List<String>? = null,

    @SerialName("reasonLinkId")
    override val reasonLinkId: kotlin.collections.List<String>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("securityLabelNumber")
    override val securityLabelNumber: kotlin.collections.List<UnsignedInteger>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermAction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermAction"
    }
}

/**
 * FhirContractTermActionSubject
 *
 * Entity of the action
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermActionSubject</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermActionSubject : FhirBackboneElement {

    /**
     * Entity of the action.
     */
    val reference: kotlin.collections.List<Reference>

    /**
     * Role type of the agent.
     */
    val role: CodeableConcept?
}

/**
 * ContractTermActionSubject
 *
 * Entity of the action
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermActionSubject</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermActionSubject")
data class ContractTermActionSubject(

    @SerialName("reference")
    override val reference: kotlin.collections.List<Reference>,

    @SerialName("role")
    override val role: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermActionSubject {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermActionSubject"
    }
}

/**
 * FhirContractTermAsset
 *
 * Contract Term Asset List
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAsset</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermAsset : FhirBackboneElement {

    /**
     * Range of asset.
     */
    val scope: CodeableConcept?

    /**
     * Asset category.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Associated entities.
     */
    val typeReference: kotlin.collections.List<Reference>?

    /**
     * Asset sub-category.
     */
    val subtype: kotlin.collections.List<CodeableConcept>?

    /**
     * Kinship of the asset.
     */
    val relationship: Coding?

    /**
     * Circumstance of the asset.
     */
    val context: kotlin.collections.List<ContractTermAssetContext>?

    /**
     * Quality desctiption of asset.
     */
    val condition: String?

    /**
     * Asset availability types.
     */
    val periodType: kotlin.collections.List<CodeableConcept>?

    /**
     * Time period of the asset.
     */
    val period: kotlin.collections.List<Period>?

    /**
     * Time period.
     */
    val usePeriod: kotlin.collections.List<Period>?

    /**
     * Asset clause or question text.
     */
    val text: String?

    /**
     * Pointer to asset text.
     */
    val linkId: kotlin.collections.List<String>?

    /**
     * Response to assets.
     */
    val answer: kotlin.collections.List<ContractTermOfferAnswer>?

    /**
     * Asset restriction numbers.
     */
    val securityLabelNumber: kotlin.collections.List<UnsignedInteger>?

    /**
     * Contract Valued Item List.
     */
    val valuedItem: kotlin.collections.List<ContractTermAssetValuedItem>?
}

/**
 * ContractTermAsset
 *
 * Contract Term Asset List
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAsset</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermAsset")
data class ContractTermAsset(

    @SerialName("scope")
    override val scope: CodeableConcept? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("typeReference")
    override val typeReference: kotlin.collections.List<Reference>? = null,

    @SerialName("subtype")
    override val subtype: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("relationship")
    override val relationship: Coding? = null,

    @SerialName("context")
    override val context: kotlin.collections.List<ContractTermAssetContext>? = null,

    @SerialName("condition")
    override val condition: String? = null,

    @SerialName("periodType")
    override val periodType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("period")
    override val period: kotlin.collections.List<Period>? = null,

    @SerialName("usePeriod")
    override val usePeriod: kotlin.collections.List<Period>? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("linkId")
    override val linkId: kotlin.collections.List<String>? = null,

    @SerialName("answer")
    override val answer: kotlin.collections.List<ContractTermOfferAnswer>? = null,

    @SerialName("securityLabelNumber")
    override val securityLabelNumber: kotlin.collections.List<UnsignedInteger>? = null,

    @SerialName("valuedItem")
    override val valuedItem: kotlin.collections.List<ContractTermAssetValuedItem>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermAsset {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermAsset"
    }
}

/**
 * FhirContractTermAssetContext
 *
 * Circumstance of the asset
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAssetContext</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermAssetContext : FhirBackboneElement {

    /**
     * Creator,custodian or owner.
     */
    val reference: Reference?

    /**
     * Codeable asset context.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Context description.
     */
    val text: String?
}

/**
 * ContractTermAssetContext
 *
 * Circumstance of the asset
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAssetContext</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermAssetContext")
data class ContractTermAssetContext(

    @SerialName("reference")
    override val reference: Reference? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("text")
    override val text: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermAssetContext {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermAssetContext"
    }
}

/**
 * FhirContractTermAssetValuedItem
 *
 * Contract Valued Item List
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAssetValuedItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermAssetValuedItem : FhirBackboneElement {

    /**
     * Contract Valued Item Type.
     */
    val entityCodeableConcept: CodeableConcept?

    /**
     * Contract Valued Item Type.
     */
    val entityReference: Reference?

    /**
     * Contract Valued Item Number.
     */
    val identifier: Identifier?

    /**
     * Contract Valued Item Effective Tiem.
     */
    val effectiveTime: DateTime?

    /**
     * Count of Contract Valued Items.
     */
    val quantity: Quantity?

    /**
     * Contract Valued Item fee, charge, or cost.
     */
    val unitPrice: Money?

    /**
     * Contract Valued Item Price Scaling Factor.
     */
    val factor: Decimal?

    /**
     * Contract Valued Item Difficulty Scaling Factor.
     */
    val points: Decimal?

    /**
     * Total Contract Valued Item Value.
     */
    val net: Money?

    /**
     * Terms of valuation.
     */
    val payment: String?

    /**
     * When payment is due.
     */
    val paymentDate: DateTime?

    /**
     * Who will make payment.
     */
    val responsible: Reference?

    /**
     * Who will receive payment.
     */
    val recipient: Reference?

    /**
     * Pointer to specific item.
     */
    val linkId: kotlin.collections.List<String>?

    /**
     * Security Labels that define affected terms.
     */
    val securityLabelNumber: kotlin.collections.List<UnsignedInteger>?
}

/**
 * ContractTermAssetValuedItem
 *
 * Contract Valued Item List
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAssetValuedItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermAssetValuedItem")
data class ContractTermAssetValuedItem(

    @SerialName("entityCodeableConcept")
    override val entityCodeableConcept: CodeableConcept? = null,

    @SerialName("entityReference")
    override val entityReference: Reference? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("effectiveTime")
    override val effectiveTime: DateTime? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("unitPrice")
    override val unitPrice: Money? = null,

    @SerialName("factor")
    override val factor: Decimal? = null,

    @SerialName("points")
    override val points: Decimal? = null,

    @SerialName("net")
    override val net: Money? = null,

    @SerialName("payment")
    override val payment: String? = null,

    @SerialName("paymentDate")
    override val paymentDate: DateTime? = null,

    @SerialName("responsible")
    override val responsible: Reference? = null,

    @SerialName("recipient")
    override val recipient: Reference? = null,

    @SerialName("linkId")
    override val linkId: kotlin.collections.List<String>? = null,

    @SerialName("securityLabelNumber")
    override val securityLabelNumber: kotlin.collections.List<UnsignedInteger>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermAssetValuedItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermAssetValuedItem"
    }
}

/**
 * FhirContractTermOffer
 *
 * The matter of concern in the context of this provision of the agrement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermOffer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermOffer : FhirBackboneElement {

    /**
     * Offer business ID.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Offer Recipient.
     */
    val party: kotlin.collections.List<ContractTermOfferParty>?

    /**
     * Negotiable offer asset.
     */
    val topic: Reference?

    /**
     * Contract Offer Type or Form.
     */
    val type: CodeableConcept?

    /**
     * Accepting party choice.
     */
    val decision: CodeableConcept?

    /**
     * How decision is conveyed.
     */
    val decisionMode: kotlin.collections.List<CodeableConcept>?

    /**
     * Response to offer text.
     */
    val answer: kotlin.collections.List<ContractTermOfferAnswer>?

    /**
     * Human readable offer text.
     */
    val text: String?

    /**
     * Pointer to text.
     */
    val linkId: kotlin.collections.List<String>?

    /**
     * Offer restriction numbers.
     */
    val securityLabelNumber: kotlin.collections.List<UnsignedInteger>?
}

/**
 * ContractTermOffer
 *
 * The matter of concern in the context of this provision of the agrement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermOffer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermOffer")
data class ContractTermOffer(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("party")
    override val party: kotlin.collections.List<ContractTermOfferParty>? = null,

    @SerialName("topic")
    override val topic: Reference? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("decision")
    override val decision: CodeableConcept? = null,

    @SerialName("decisionMode")
    override val decisionMode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("answer")
    override val answer: kotlin.collections.List<ContractTermOfferAnswer>? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("linkId")
    override val linkId: kotlin.collections.List<String>? = null,

    @SerialName("securityLabelNumber")
    override val securityLabelNumber: kotlin.collections.List<UnsignedInteger>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermOffer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermOffer"
    }
}

/**
 * FhirContractTermOfferAnswer
 *
 * Response to offer text
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermOfferAnswer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermOfferAnswer : FhirBackboneElement {

    /**
     * The actual answer response.
     */
    val valueBoolean: Bool?

    /**
     * The actual answer response.
     */
    val valueDecimal: Decimal?

    /**
     * The actual answer response.
     */
    val valueInteger: Integer?

    /**
     * The actual answer response.
     */
    val valueDate: Date?

    /**
     * The actual answer response.
     */
    val valueDateTime: DateTime?

    /**
     * The actual answer response.
     */
    val valueTime: Time?

    /**
     * The actual answer response.
     */
    val valueString: String?

    /**
     * The actual answer response.
     */
    val valueUri: String?

    /**
     * The actual answer response.
     */
    val valueAttachment: Attachment?

    /**
     * The actual answer response.
     */
    val valueCoding: Coding?

    /**
     * The actual answer response.
     */
    val valueQuantity: Quantity?

    /**
     * The actual answer response.
     */
    val valueReference: Reference?
}

/**
 * ContractTermOfferAnswer
 *
 * Response to offer text
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermOfferAnswer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermOfferAnswer")
data class ContractTermOfferAnswer(

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueDate")
    override val valueDate: Date? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueUri")
    override val valueUri: String? = null,

    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,

    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueReference")
    override val valueReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermOfferAnswer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermOfferAnswer"
    }
}

/**
 * FhirContractTermOfferParty
 *
 * Offer Recipient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermOfferParty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermOfferParty : FhirBackboneElement {

    /**
     * Referenced entity.
     */
    val reference: kotlin.collections.List<Reference>

    /**
     * Participant engagement type.
     */
    val role: CodeableConcept
}

/**
 * ContractTermOfferParty
 *
 * Offer Recipient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermOfferParty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermOfferParty")
data class ContractTermOfferParty(

    @SerialName("reference")
    override val reference: kotlin.collections.List<Reference>,

    @SerialName("role")
    override val role: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermOfferParty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermOfferParty"
    }
}

/**
 * FhirContractTermSecurityLabel
 *
 * Security labels that protect the handling of information about the term and its elements, which may
 * be specifically identified..
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermSecurityLabel</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermSecurityLabel : FhirBackboneElement {

    /**
     * Link to Security Labels.
     */
    val number: kotlin.collections.List<UnsignedInteger>?

    /**
     * Confidentiality Protection.
     */
    val classification: Coding

    /**
     * Applicable Policy.
     */
    val category: kotlin.collections.List<Coding>?

    /**
     * Handling Instructions.
     */
    val control: kotlin.collections.List<Coding>?
}

/**
 * ContractTermSecurityLabel
 *
 * Security labels that protect the handling of information about the term and its elements, which may
 * be specifically identified..
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermSecurityLabel</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermSecurityLabel")
data class ContractTermSecurityLabel(

    @SerialName("number")
    override val number: kotlin.collections.List<UnsignedInteger>? = null,

    @SerialName("classification")
    override val classification: Coding,

    @SerialName("category")
    override val category: kotlin.collections.List<Coding>? = null,

    @SerialName("control")
    override val control: kotlin.collections.List<Coding>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirContractTermSecurityLabel {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ContractTermSecurityLabel"
    }
}
