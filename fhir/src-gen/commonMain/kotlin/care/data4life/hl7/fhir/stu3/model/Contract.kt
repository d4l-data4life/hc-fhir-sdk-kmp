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

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirContract
 *
 * A formal agreement between parties regarding the conduct of business, exchange of information or
 * other matters.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">Contract</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContract : FhirDomainResource {

    /**
     * Contract number.
     */
    val identifier: Identifier?

    /**
     * amended | appended | cancelled | disputed | entered-in-error | executable |
     * executed | negotiable | offered | policy | rejected | renewed | revoked |
     * resolved | terminated.
     */
    val status: String?

    /**
     * When this Contract was issued.
     */
    val issued: DateTime?

    /**
     * Effective time.
     */
    val applies: Period?

    /**
     * Contract Target Entity.
     */
    val subject: List<Reference>?

    /**
     * Context of the Contract.
     */
    val topic: List<Reference>?

    /**
     * Authority under which this Contract has standing.
     */
    val authority: List<Reference>?

    /**
     * Domain in which this Contract applies.
     */
    val domain: List<Reference>?

    /**
     * Type or form.
     */
    val type: CodeableConcept?

    /**
     * Subtype within the context of type.
     */
    val subType: List<CodeableConcept>?

    /**
     * Action stipulated by this Contract.
     */
    val action: List<CodeableConcept>?

    /**
     * Rationale for the stiplulated action.
     */
    val actionReason: List<CodeableConcept>?

    /**
     * Decision by Grantor.
     */
    val decisionType: CodeableConcept?

    /**
     * Content derived from the basal information.
     */
    val contentDerivative: CodeableConcept?

    /**
     * Security Labels that define affected resources.
     */
    val securityLabel: List<Coding>?

    /**
     * Entity being ascribed responsibility.
     */
    val agent: List<ContractAgent>?

    /**
     * Contract Signatory.
     */
    val signer: List<ContractSigner>?

    /**
     * Contract Valued Item List.
     */
    val valuedItem: List<ContractValuedItem>?

    /**
     * Contract Term List.
     */
    val term: List<ContractTerm>?

    /**
     * Binding Contract.
     */
    val bindingAttachment: Attachment?

    /**
     * Binding Contract.
     */
    val bindingReference: Reference?

    /**
     * Contract Friendly Language.
     */
    val friendly: List<ContractFriendly>?

    /**
     * Contract Legal Language.
     */
    val legal: List<ContractLegal>?

    /**
     * Computable Contract Language.
     */
    val rule: List<ContractRule>?
}

/**
 * Contract
 *
 * SourceFileName: Contract.kt
 *
 * A formal agreement between parties regarding the conduct of business, exchange of information or
 * other matters.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">Contract</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("Contract")
data class Contract(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("status")
    override val status: String? = null,

    @SerialName("issued")
    override val issued: DateTime? = null,

    @SerialName("applies")
    override val applies: Period? = null,

    @SerialName("subject")
    override val subject: List<Reference>? = null,

    @SerialName("topic")
    override val topic: List<Reference>? = null,

    @SerialName("authority")
    override val authority: List<Reference>? = null,

    @SerialName("domain")
    override val domain: List<Reference>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subType")
    override val subType: List<CodeableConcept>? = null,

    @SerialName("action")
    override val action: List<CodeableConcept>? = null,

    @SerialName("actionReason")
    override val actionReason: List<CodeableConcept>? = null,

    @SerialName("decisionType")
    override val decisionType: CodeableConcept? = null,

    @SerialName("contentDerivative")
    override val contentDerivative: CodeableConcept? = null,

    @SerialName("securityLabel")
    override val securityLabel: List<Coding>? = null,

    @SerialName("agent")
    override val agent: List<ContractAgent>? = null,

    @SerialName("signer")
    override val signer: List<ContractSigner>? = null,

    @SerialName("valuedItem")
    override val valuedItem: List<ContractValuedItem>? = null,

    @SerialName("term")
    override val term: List<ContractTerm>? = null,

    @SerialName("bindingAttachment")
    override val bindingAttachment: Attachment? = null,

    @SerialName("bindingReference")
    override val bindingReference: Reference? = null,

    @SerialName("friendly")
    override val friendly: List<ContractFriendly>? = null,

    @SerialName("legal")
    override val legal: List<ContractLegal>? = null,

    @SerialName("rule")
    override val rule: List<ContractRule>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Contract"
    }
}

/**
 * FhirContractAgent
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for
 * the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractAgent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractAgent : FhirBackboneElement {

    /**
     * Contract Agent Type.
     */
    val actor: Reference

    /**
     * Role type of the agent.
     */
    val role: List<CodeableConcept>?
}

/**
 * ContractAgent
 *
 * SourceFileName: Contract.kt
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for
 * the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractAgent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractAgent")
data class ContractAgent(

    @SerialName("actor")
    override val actor: Reference,

    @SerialName("role")
    override val role: List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractAgent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractAgent"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
 * SourceFileName: Contract.kt
 *
 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
 * language" means the representation of the Contract and Contract Provisions in a manner that is
 * readily accessible and understandable by a layperson in accordance with best practices for
 * communication styles that ensure that those agreeing to or signing the Contract understand the
 * roles, actions, obligations, responsibilities, and implication of the agreement.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractFriendly</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractFriendly {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractFriendly"
    }
}

/**
 * FhirContractLegal
 *
 * List of Legal expressions or representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractLegal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
 * SourceFileName: Contract.kt
 *
 * List of Legal expressions or representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractLegal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractLegal {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractLegal"
    }
}

/**
 * FhirContractRule
 *
 * List of Computable Policy Rule Language Representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
 * SourceFileName: Contract.kt
 *
 * List of Computable Policy Rule Language Representations of this Contract.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractRule {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractRule"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
    val signature: List<Signature>
}

/**
 * ContractSigner
 *
 * SourceFileName: Contract.kt
 *
 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and
 * grantee(s), which are any person or organization bound by the contract, and any ancillary parties,
 * which facilitate the execution of the contract such as a notary or witness.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractSigner</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractSigner")
data class ContractSigner(

    @SerialName("type")
    override val type: Coding,

    @SerialName("party")
    override val party: Reference,

    @SerialName("signature")
    override val signature: List<Signature>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractSigner {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractSigner"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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
     * Contract Term Type or Form.
     */
    val type: CodeableConcept?

    /**
     * Contract Term Type specific classification.
     */
    val subType: CodeableConcept?

    /**
     * Context of the Contract term.
     */
    val topic: List<Reference>?

    /**
     * Contract Term Activity.
     */
    val action: List<CodeableConcept>?

    /**
     * Purpose for the Contract Term Action.
     */
    val actionReason: List<CodeableConcept>?

    /**
     * Security Labels that define affected terms.
     */
    val securityLabel: List<Coding>?

    /**
     * Contract Term Agent List.
     */
    val agent: List<ContractTermAgent>?

    /**
     * Human readable Contract term text.
     */
    val text: String?

    /**
     * Contract Term Valued Item List.
     */
    val valuedItem: List<ContractTermValuedItem>?

    /**
     * Nested Contract Term Group.
     */
    val group: List<ContractTerm>?
}

/**
 * ContractTerm
 *
 * SourceFileName: Contract.kt
 *
 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain
 * nested groups.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTerm</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
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

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("subType")
    override val subType: CodeableConcept? = null,

    @SerialName("topic")
    override val topic: List<Reference>? = null,

    @SerialName("action")
    override val action: List<CodeableConcept>? = null,

    @SerialName("actionReason")
    override val actionReason: List<CodeableConcept>? = null,

    @SerialName("securityLabel")
    override val securityLabel: List<Coding>? = null,

    @SerialName("agent")
    override val agent: List<ContractTermAgent>? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("valuedItem")
    override val valuedItem: List<ContractTermValuedItem>? = null,

    @SerialName("group")
    override val group: List<ContractTerm>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractTerm {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractTerm"
    }
}

/**
 * FhirContractTermAgent
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for
 * the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAgent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermAgent : FhirBackboneElement {

    /**
     * Contract Term Agent Subject.
     */
    val actor: Reference

    /**
     * Type of the Contract Term Agent.
     */
    val role: List<CodeableConcept>?
}

/**
 * ContractTermAgent
 *
 * SourceFileName: Contract.kt
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility for
 * the activity taking place.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermAgent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermAgent")
data class ContractTermAgent(

    @SerialName("actor")
    override val actor: Reference,

    @SerialName("role")
    override val role: List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractTermAgent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractTermAgent"
    }
}

/**
 * FhirContractTermValuedItem
 *
 * Contract Provision Valued Item List.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermValuedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractTermValuedItem : FhirBackboneElement {

    /**
     * Contract Term Valued Item Type.
     */
    val entityCodeableConcept: CodeableConcept?

    /**
     * Contract Term Valued Item Type.
     */
    val entityReference: Reference?

    /**
     * Contract Term Valued Item Number.
     */
    val identifier: Identifier?

    /**
     * Contract Term Valued Item Effective Tiem.
     */
    val effectiveTime: DateTime?

    /**
     * Contract Term Valued Item Count.
     */
    val quantity: Quantity?

    /**
     * Contract Term Valued Item fee, charge, or cost.
     */
    val unitPrice: Money?

    /**
     * Contract Term Valued Item Price Scaling Factor.
     */
    val factor: Decimal?

    /**
     * Contract Term Valued Item Difficulty Scaling Factor.
     */
    val points: Decimal?

    /**
     * Total Contract Term Valued Item Value.
     */
    val net: Money?
}

/**
 * ContractTermValuedItem
 *
 * SourceFileName: Contract.kt
 *
 * Contract Provision Valued Item List.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractTermValuedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractTermValuedItem")
data class ContractTermValuedItem(

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

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractTermValuedItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractTermValuedItem"
    }
}

/**
 * FhirContractValuedItem
 *
 * Contract Valued Item List
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractValuedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
interface FhirContractValuedItem : FhirBackboneElement {

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
}

/**
 * ContractValuedItem
 *
 * SourceFileName: Contract.kt
 *
 * Contract Valued Item List
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Contract">ContractValuedItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Contract)
 */
@Serializable
@SerialName("ContractValuedItem")
data class ContractValuedItem(

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

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirContractValuedItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ContractValuedItem"
    }
}
