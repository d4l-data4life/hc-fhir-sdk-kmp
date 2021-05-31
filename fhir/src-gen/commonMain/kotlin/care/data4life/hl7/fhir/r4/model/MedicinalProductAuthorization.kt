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

import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicinalProductAuthorization
 *
 * The regulatory authorization of a medicinal product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization">MedicinalProductAuthorization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization)
 */
interface FhirMedicinalProductAuthorization : FhirDomainResource {

    /**
     * Business identifier for the marketing authorization, as assigned by a regulator.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The medicinal product that is being authorized.
     */
    val subject: Reference?

    /**
     * The country in which the marketing authorization has been granted.
     */
    val country: kotlin.collections.List<CodeableConcept>?

    /**
     * Jurisdiction within a country.
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * The status of the marketing authorization.
     */
    val status: CodeableConcept?

    /**
     * The date at which the given status has become applicable.
     */
    val statusDate: DateTime?

    /**
     * The date when a suspended the marketing or the marketing authorization of the
     * product is anticipated to be restored.
     */
    val restoreDate: DateTime?

    /**
     * The beginning of the time period in which the marketing authorization is in the
     * specific status shall be specified A complete date consisting of day, month and
     * year shall be specified using the ISO 8601 date format.
     */
    val validityPeriod: Period?

    /**
     * A period of time after authorization before generic product applicatiosn can be
     * submitted.
     */
    val dataExclusivityPeriod: Period?

    /**
     * The date when the first authorization was granted by a Medicines Regulatory
     * Agency.
     */
    val dateOfFirstAuthorization: DateTime?

    /**
     * Date of first marketing authorization for a company's new medicinal product in
     * any country in the World.
     */
    val internationalBirthDate: DateTime?

    /**
     * The legal framework against which this authorization is granted.
     */
    val legalBasis: CodeableConcept?

    /**
     * Authorization in areas within a country.
     */
    val jurisdictionalAuthorization: kotlin.collections.List<MedicinalProductAuthorizationJurisdictionalAuthorization>?

    /**
     * Marketing Authorization Holder.
     */
    val holder: Reference?

    /**
     * Medicines Regulatory Agency.
     */
    val regulator: Reference?

    /**
     * The regulatory procedure for granting or amending a marketing authorization.
     */
    val procedure: MedicinalProductAuthorizationProcedure?
}

/**
 * MedicinalProductAuthorization
 *
 * The regulatory authorization of a medicinal product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization">MedicinalProductAuthorization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization)
 */
@Serializable
@SerialName("MedicinalProductAuthorization")
data class MedicinalProductAuthorization(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("country")
    override val country: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    @SerialName("statusDate")
    override val statusDate: DateTime? = null,

    @SerialName("restoreDate")
    override val restoreDate: DateTime? = null,

    @SerialName("validityPeriod")
    override val validityPeriod: Period? = null,

    @SerialName("dataExclusivityPeriod")
    override val dataExclusivityPeriod: Period? = null,

    @SerialName("dateOfFirstAuthorization")
    override val dateOfFirstAuthorization: DateTime? = null,

    @SerialName("internationalBirthDate")
    override val internationalBirthDate: DateTime? = null,

    @SerialName("legalBasis")
    override val legalBasis: CodeableConcept? = null,

    @SerialName("jurisdictionalAuthorization")
    override val jurisdictionalAuthorization: kotlin.collections.List<MedicinalProductAuthorizationJurisdictionalAuthorization>? = null,

    @SerialName("holder")
    override val holder: Reference? = null,

    @SerialName("regulator")
    override val regulator: Reference? = null,

    @SerialName("procedure")
    override val procedure: MedicinalProductAuthorizationProcedure? = null,

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
) : FhirMedicinalProductAuthorization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductAuthorization"
    }
}

/**
 * FhirMedicinalProductAuthorizationJurisdictionalAuthorization
 *
 * Authorization in areas within a country
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization">MedicinalProductAuthorizationJurisdictionalAuthorization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization)
 */
interface FhirMedicinalProductAuthorizationJurisdictionalAuthorization : FhirBackboneElement {

    /**
     * The assigned number for the marketing authorization.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Country of authorization.
     */
    val country: CodeableConcept?

    /**
     * Jurisdiction within a country.
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * The legal status of supply in a jurisdiction or region.
     */
    val legalStatusOfSupply: CodeableConcept?

    /**
     * The start and expected end date of the authorization.
     */
    val validityPeriod: Period?
}

/**
 * MedicinalProductAuthorizationJurisdictionalAuthorization
 *
 * Authorization in areas within a country
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization">MedicinalProductAuthorizationJurisdictionalAuthorization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization)
 */
@Serializable
@SerialName("MedicinalProductAuthorizationJurisdictionalAuthorization")
data class MedicinalProductAuthorizationJurisdictionalAuthorization(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("country")
    override val country: CodeableConcept? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("legalStatusOfSupply")
    override val legalStatusOfSupply: CodeableConcept? = null,

    @SerialName("validityPeriod")
    override val validityPeriod: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductAuthorizationJurisdictionalAuthorization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductAuthorizationJurisdictionalAuthorization"
    }
}

/**
 * FhirMedicinalProductAuthorizationProcedure
 *
 * The regulatory procedure for granting or amending a marketing authorization
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization">MedicinalProductAuthorizationProcedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization)
 */
interface FhirMedicinalProductAuthorizationProcedure : FhirBackboneElement {

    /**
     * Identifier for this procedure.
     */
    val identifier: Identifier?

    /**
     * Type of procedure.
     */
    val type: CodeableConcept

    /**
     * Date of procedure.
     */
    val datePeriod: Period?

    /**
     * Date of procedure.
     */
    val dateDateTime: DateTime?

    /**
     * Applcations submitted to obtain a marketing authorization.
     */
    val application: kotlin.collections.List<MedicinalProductAuthorizationProcedure>?
}

/**
 * MedicinalProductAuthorizationProcedure
 *
 * The regulatory procedure for granting or amending a marketing authorization
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization">MedicinalProductAuthorizationProcedure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductAuthorization)
 */
@Serializable
@SerialName("MedicinalProductAuthorizationProcedure")
data class MedicinalProductAuthorizationProcedure(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("datePeriod")
    override val datePeriod: Period? = null,

    @SerialName("dateDateTime")
    override val dateDateTime: DateTime? = null,

    @SerialName("application")
    override val application: kotlin.collections.List<MedicinalProductAuthorizationProcedure>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductAuthorizationProcedure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductAuthorizationProcedure"
    }
}
