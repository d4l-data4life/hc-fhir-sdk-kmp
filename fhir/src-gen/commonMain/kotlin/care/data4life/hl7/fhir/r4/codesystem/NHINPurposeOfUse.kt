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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This value set is suitable for use with the provenance resource. It is derived from, but not compatible with, the HL7 v3 Purpose of use Code system.
 *
 * @see <a href="http://healthit.gov/nhin/purposeofuse">NHINPurposeOfUse</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/nhin-purposeofuse">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class NHINPurposeOfUse {
    /**
     * Treatment
     */
    @SerialName("TREATMENT")
    TREATMENT,

    /**
     * Payment
     */
    @SerialName("PAYMENT")
    PAYMENT,

    /**
     * Healthcare Operations
     */
    @SerialName("OPERATIONS")
    OPERATIONS,

    /**
     * System Administration
     */
    @SerialName("SYSADMIN")
    SYSADMIN,

    /**
     * Fraud detection
     */
    @SerialName("FRAUD")
    FRAUD,

    /**
     * Use or disclosure of Psychotherapy Notes
     */
    @SerialName("PSYCHOTHERAPY")
    PSYCHOTHERAPY,

    /**
     * Use or disclosure by the covered entity for its own training programs
     */
    @SerialName("TRAINING")
    TRAINING,

    /**
     * Use or disclosure by the covered entity to defend itself in a legal action
     */
    @SerialName("LEGAL")
    LEGAL,

    /**
     * Marketing
     */
    @SerialName("MARKETING")
    MARKETING,

    /**
     * Use and disclosure for facility directories
     */
    @SerialName("DIRECTORY")
    DIRECTORY,

    /**
     * Disclose to a family member, other relative, or a close personal friend of the individual
     */
    @SerialName("FAMILY")
    FAMILY,

    /**
     * Uses and disclosures with the individual present.
     */
    @SerialName("PRESENT")
    PRESENT,

    /**
     * Permission cannot practicably be provided because of the individual's incapacity or an emergency.
     */
    @SerialName("EMERGENCY")
    EMERGENCY,

    /**
     * Use and disclosures for disaster relief purposes.
     */
    @SerialName("DISASTER")
    DISASTER,

    /**
     * Uses and disclosures for public health activities.
     */
    @SerialName("PUBLICHEALTH")
    PUBLICHEALTH,

    /**
     * Disclosures about victims of abuse, neglect or domestic violence.
     */
    @SerialName("ABUSE")
    ABUSE,

    /**
     * Uses and disclosures for health oversight activities.
     */
    @SerialName("OVERSIGHT")
    OVERSIGHT,

    /**
     * Disclosures for judicial and administrative proceedings.
     */
    @SerialName("JUDICIAL")
    JUDICIAL,

    /**
     * Disclosures for law enforcement purposes.
     */
    @SerialName("LAW")
    LAW,

    /**
     * Uses and disclosures about decedents.
     */
    @SerialName("DECEASED")
    DECEASED,

    /**
     * Uses and disclosures for cadaveric organ,  eye or tissue donation purposes
     */
    @SerialName("DONATION")
    DONATION,

    /**
     * Uses and disclosures for research purposes.
     */
    @SerialName("RESEARCH")
    RESEARCH,

    /**
     * Uses and disclosures to avert a serious threat to health or safety.
     */
    @SerialName("THREAT")
    THREAT,

    /**
     * Uses and disclosures for specialized government functions.
     */
    @SerialName("GOVERNMENT")
    GOVERNMENT,

    /**
     * Disclosures for workers' compensation.
     */
    @SerialName("WORKERSCOMP")
    WORKERSCOMP,

    /**
     * Disclosures for insurance or disability coverage determination
     */
    @SerialName("COVERAGE")
    COVERAGE,

    /**
     * Request of the Individual
     */
    @SerialName("REQUEST")
    REQUEST
}
