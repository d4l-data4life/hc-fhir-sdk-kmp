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

import care.data4life.hl7.fhir.stu3.codesystem.AccountStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirAccount
 *
 * A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used
 * to track charges for a patient, cost centers, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Account">Account</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Account)
 */
interface FhirAccount : FhirDomainResource {

    /**
     * Account number.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates whether the account is presently used/usable or not.
     */
    val status: AccountStatus?

    /**
     * E.g. patient, expense, depreciation.
     */
    val type: CodeableConcept?

    /**
     * Human-readable label.
     */
    val name: String?

    /**
     * What is account tied to?.
     */
    val subject: Reference?

    /**
     * Transaction window.
     */
    val period: Period?

    /**
     * Time window that transactions may be posted to this account.
     */
    val active: Period?

    /**
     * How much is in account?.
     */
    val balance: Money?

    /**
     * The party(s) that are responsible for covering the payment of this account, and
     * what order should they be applied to the account.
     */
    val coverage: kotlin.collections.List<AccountCoverage>?

    /**
     * Who is responsible?.
     */
    val owner: Reference?

    /**
     * Explanation of purpose/use.
     */
    val description: String?

    /**
     * Responsible for the account.
     */
    val guarantor: kotlin.collections.List<AccountGuarantor>?
}

/**
 * Account
 *
 * A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used
 * to track charges for a patient, cost centers, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Account">Account</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Account)
 */
@Serializable
@SerialName("Account")
data class Account(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: AccountStatus? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("active")
    override val active: Period? = null,

    @SerialName("balance")
    override val balance: Money? = null,

    @SerialName("coverage")
    override val coverage: kotlin.collections.List<AccountCoverage>? = null,

    @SerialName("owner")
    override val owner: Reference? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("guarantor")
    override val guarantor: kotlin.collections.List<AccountGuarantor>? = null,

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
) : FhirAccount {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Account"
    }
}

/**
 * FhirAccountCoverage
 *
 * The party(s) that are responsible for covering the payment of this account, and what order should
 * they be applied to the account
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Account">AccountCoverage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Account)
 */
interface FhirAccountCoverage : FhirBackboneElement {

    /**
     * The party(s) that are responsible for covering the payment of this account.
     */
    val coverage: Reference

    /**
     * The priority of the coverage in the context of this account.
     */
    val priority: PositiveInteger?
}

/**
 * AccountCoverage
 *
 * The party(s) that are responsible for covering the payment of this account, and what order should
 * they be applied to the account
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Account">AccountCoverage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Account)
 */
@Serializable
@SerialName("AccountCoverage")
data class AccountCoverage(

    @SerialName("coverage")
    override val coverage: Reference,

    @SerialName("priority")
    override val priority: PositiveInteger? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirAccountCoverage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AccountCoverage"
    }
}

/**
 * FhirAccountGuarantor
 *
 * Parties financially responsible for the account.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Account">AccountGuarantor</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Account)
 */
interface FhirAccountGuarantor : FhirBackboneElement {

    /**
     * Responsible entity.
     */
    val party: Reference

    /**
     * Credit or other hold applied.
     */
    val onHold: Bool?

    /**
     * Guarrantee account during.
     */
    val period: Period?
}

/**
 * AccountGuarantor
 *
 * Parties financially responsible for the account.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Account">AccountGuarantor</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Account)
 */
@Serializable
@SerialName("AccountGuarantor")
data class AccountGuarantor(

    @SerialName("party")
    override val party: Reference,

    @SerialName("onHold")
    override val onHold: Bool? = null,

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
) : FhirAccountGuarantor {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AccountGuarantor"
    }
}
