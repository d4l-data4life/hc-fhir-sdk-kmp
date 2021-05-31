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

import care.data4life.hl7.fhir.r4.codesystem.Status
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirVerificationResult
 *
 * Describes validation requirements, source(s), status and dates for one or more elements
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResult</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
interface FhirVerificationResult : FhirDomainResource {

    /**
     * A resource that was validated.
     */
    val target: kotlin.collections.List<Reference>?

    /**
     * The fhirpath location(s) within the resource that was validated.
     */
    val targetLocation: kotlin.collections.List<String>?

    /**
     * none | initial | periodic.
     */
    val need: CodeableConcept?

    /**
     * The validation status of the target (attested; validated; in process; requires
     * revalidation; validation failed; revalidation failed).
     */
    val status: Status

    /**
     * When the validation status was updated.
     */
    val statusDate: DateTime?

    /**
     * nothing | primary | multiple.
     */
    val validationType: CodeableConcept?

    /**
     * The primary process by which the target is validated (edit check; value set;
     * primary source; multiple sources; standalone; in context).
     */
    val validationProcess: kotlin.collections.List<CodeableConcept>?

    /**
     * Frequency of revalidation.
     */
    val frequency: Timing?

    /**
     * The date/time validation was last completed (including failed validations).
     */
    val lastPerformed: DateTime?

    /**
     * The date when target is next validated, if appropriate.
     */
    val nextScheduled: Date?

    /**
     * fatal | warn | rec-only | none.
     */
    val failureAction: CodeableConcept?

    /**
     * Information about the primary source(s) involved in validation.
     */
    val primarySource: kotlin.collections.List<VerificationResultPrimarySource>?

    /**
     * Information about the entity attesting to information.
     */
    val attestation: VerificationResultAttestation?

    /**
     * Information about the entity validating information.
     */
    val validator: kotlin.collections.List<VerificationResultValidator>?
}

/**
 * VerificationResult
 *
 * Describes validation requirements, source(s), status and dates for one or more elements
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResult</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
@Serializable
@SerialName("VerificationResult")
data class VerificationResult(

    @SerialName("target")
    override val target: kotlin.collections.List<Reference>? = null,

    @SerialName("targetLocation")
    override val targetLocation: kotlin.collections.List<String>? = null,

    @SerialName("need")
    override val need: CodeableConcept? = null,

    @SerialName("status")
    override val status: Status,

    @SerialName("statusDate")
    override val statusDate: DateTime? = null,

    @SerialName("validationType")
    override val validationType: CodeableConcept? = null,

    @SerialName("validationProcess")
    override val validationProcess: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("frequency")
    override val frequency: Timing? = null,

    @SerialName("lastPerformed")
    override val lastPerformed: DateTime? = null,

    @SerialName("nextScheduled")
    override val nextScheduled: Date? = null,

    @SerialName("failureAction")
    override val failureAction: CodeableConcept? = null,

    @SerialName("primarySource")
    override val primarySource: kotlin.collections.List<VerificationResultPrimarySource>? = null,

    @SerialName("attestation")
    override val attestation: VerificationResultAttestation? = null,

    @SerialName("validator")
    override val validator: kotlin.collections.List<VerificationResultValidator>? = null,

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
) : FhirVerificationResult {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VerificationResult"
    }
}

/**
 * FhirVerificationResultAttestation
 *
 * Information about the entity attesting to information
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResultAttestation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
interface FhirVerificationResultAttestation : FhirBackboneElement {

    /**
     * The individual or organization attesting to information.
     */
    val who: Reference?

    /**
     * When the who is asserting on behalf of another (organization or individual).
     */
    val onBehalfOf: Reference?

    /**
     * The method by which attested information was submitted/retrieved.
     */
    val communicationMethod: CodeableConcept?

    /**
     * The date the information was attested to.
     */
    val date: Date?

    /**
     * A digital identity certificate associated with the attestation source.
     */
    val sourceIdentityCertificate: String?

    /**
     * A digital identity certificate associated with the proxy entity submitting
     * attested information on behalf of the attestation source.
     */
    val proxyIdentityCertificate: String?

    /**
     * Proxy signature.
     */
    val proxySignature: Signature?

    /**
     * Attester signature.
     */
    val sourceSignature: Signature?
}

/**
 * VerificationResultAttestation
 *
 * Information about the entity attesting to information
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResultAttestation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
@Serializable
@SerialName("VerificationResultAttestation")
data class VerificationResultAttestation(

    @SerialName("who")
    override val who: Reference? = null,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    @SerialName("communicationMethod")
    override val communicationMethod: CodeableConcept? = null,

    @SerialName("date")
    override val date: Date? = null,

    @SerialName("sourceIdentityCertificate")
    override val sourceIdentityCertificate: String? = null,

    @SerialName("proxyIdentityCertificate")
    override val proxyIdentityCertificate: String? = null,

    @SerialName("proxySignature")
    override val proxySignature: Signature? = null,

    @SerialName("sourceSignature")
    override val sourceSignature: Signature? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirVerificationResultAttestation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VerificationResultAttestation"
    }
}

/**
 * FhirVerificationResultPrimarySource
 *
 * Information about the primary source(s) involved in validation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResultPrimarySource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
interface FhirVerificationResultPrimarySource : FhirBackboneElement {

    /**
     * Reference to the primary source.
     */
    val who: Reference?

    /**
     * Type of primary source (License Board; Primary Education; Continuing Education;
     * Postal Service; Relationship owner; Registration Authority; legal source;
     * issuing source; authoritative source).
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Method for exchanging information with the primary source.
     */
    val communicationMethod: kotlin.collections.List<CodeableConcept>?

    /**
     * successful | failed | unknown.
     */
    val validationStatus: CodeableConcept?

    /**
     * When the target was validated against the primary source.
     */
    val validationDate: DateTime?

    /**
     * yes | no | undetermined.
     */
    val canPushUpdates: CodeableConcept?

    /**
     * specific | any | source.
     */
    val pushTypeAvailable: kotlin.collections.List<CodeableConcept>?
}

/**
 * VerificationResultPrimarySource
 *
 * Information about the primary source(s) involved in validation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResultPrimarySource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
@Serializable
@SerialName("VerificationResultPrimarySource")
data class VerificationResultPrimarySource(

    @SerialName("who")
    override val who: Reference? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("communicationMethod")
    override val communicationMethod: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("validationStatus")
    override val validationStatus: CodeableConcept? = null,

    @SerialName("validationDate")
    override val validationDate: DateTime? = null,

    @SerialName("canPushUpdates")
    override val canPushUpdates: CodeableConcept? = null,

    @SerialName("pushTypeAvailable")
    override val pushTypeAvailable: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirVerificationResultPrimarySource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VerificationResultPrimarySource"
    }
}

/**
 * FhirVerificationResultValidator
 *
 * Information about the entity validating information
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResultValidator</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
interface FhirVerificationResultValidator : FhirBackboneElement {

    /**
     * Reference to the organization validating information.
     */
    val organization: Reference

    /**
     * A digital identity certificate associated with the validator.
     */
    val identityCertificate: String?

    /**
     * Validator signature.
     */
    val attestationSignature: Signature?
}

/**
 * VerificationResultValidator
 *
 * Information about the entity validating information
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/VerificationResult">VerificationResultValidator</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/VerificationResult)
 */
@Serializable
@SerialName("VerificationResultValidator")
data class VerificationResultValidator(

    @SerialName("organization")
    override val organization: Reference,

    @SerialName("identityCertificate")
    override val identityCertificate: String? = null,

    @SerialName("attestationSignature")
    override val attestationSignature: Signature? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirVerificationResultValidator {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "VerificationResultValidator"
    }
}
