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
 * Attached is vocabulary for the 27 record lifecycle events, as per ISO TS 21089-2017, Health
 * Informatics - Trusted End-to-End Information Flows, Section 3, Terms and Definitions (2017, at ISO
 * Central Secretariat, passed ballot and ready for publication).  This will also be included in the
 * FHIR EHR Record Lifecycle Event Implementation Guide, balloted and (to be) published with FHIR
 * STU-3.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle">ISO210892017HealthRecordLifecycleEvents</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ISO210892017HealthRecordLifecycleEvents {

    /**
     * Occurs when an agent causes the system to obtain and open a record entry for
     * inspection or review.
     */
    @SerialName("access")
    ACCESS,

    /**
     * Occurs when an agent causes the system to tag or otherwise indicate special
     * access management and suspension of record entry deletion/destruction, if deemed
     * relevant to a lawsuit or which are reasonably anticipated to be relevant or to
     * fulfill organizational policy under the legal doctrine of “duty to preserve”.
     */
    @SerialName("hold")
    HOLD,

    /**
     * Occurs when an agent makes any change to record entry content currently residing
     * in storage considered permanent (persistent).
     */
    @SerialName("amend")
    AMEND,

    /**
     * Occurs when an agent causes the system to create and move archive artifacts
     * containing record entry content, typically to long-term offline storage.
     */
    @SerialName("archive")
    ARCHIVE,

    /**
     * Occurs when an agent causes the system to capture the agent’s digital signature
     * (or equivalent indication) during formal validation of record entry content.
     */
    @SerialName("attest")
    ATTEST,

    /**
     * Occurs when an agent causes the system to decode record entry content from a
     * cipher.
     */
    @SerialName("decrypt")
    DECRYPT,

    /**
     * Occurs when an agent causes the system to scrub record entry content to reduce
     * the association between a set of identifying data and the data subject in a way
     * that might or might not be reversible.
     */
    @SerialName("deidentify")
    DEIDENTIFY,

    /**
     * Occurs when an agent causes the system to tag record entry(ies) as obsolete,
     * erroneous or untrustworthy, to warn against its future use.
     */
    @SerialName("deprecate")
    DEPRECATE,

    /**
     * Occurs when an agent causes the system to permanently erase record entry content
     * from the system.
     */
    @SerialName("destroy")
    DESTROY,

    /**
     * Occurs when an agent causes the system to release, transfer, provision access
     * to, or otherwise divulge record entry content.
     */
    @SerialName("disclose")
    DISCLOSE,

    /**
     * Occurs when an agent causes the system to encode record entry content in a
     * cipher.
     */
    @SerialName("encrypt")
    ENCRYPT,

    /**
     * Occurs when an agent causes the system to selectively pull out a subset of
     * record entry content, based on explicit criteria.
     */
    @SerialName("extract")
    EXTRACT,

    /**
     * Occurs when an agent causes the system to connect related record entries.
     */
    @SerialName("link")
    LINK,

    /**
     * Occurs when an agent causes the system to combine or join content from two or
     * more record entries, resulting in a single logical record entry.
     */
    @SerialName("merge")
    MERGE,

    /**
     * Occurs when an agent causes the system to: a) initiate capture of potential
     * record content, and b) incorporate that content into the storage considered a
     * permanent part of the health record.
     */
    @SerialName("originate")
    ORIGINATE,

    /**
     * Occurs when an agent causes the system to remove record entry content to reduce
     * the association between a set of identifying data and the data subject in a way
     * that may be reversible.
     */
    @SerialName("pseudonymize")
    PSEUDONYMIZE,

    /**
     * Occurs when an agent causes the system to recreate or restore full status to
     * record entries previously deleted or deprecated.
     */
    @SerialName("reactivate")
    REACTIVATE,

    /**
     * Occurs when an agent causes the system to a) initiate capture of data content
     * from elsewhere, and b) incorporate that content into the storage considered a
     * permanent part of the health record.
     */
    @SerialName("receive")
    RECEIVE,

    /**
     * Occurs when an agent causes the system to restore information to data that
     * allows identification of information source and/or information subject.
     */
    @SerialName("reidentify")
    REIDENTIFY,

    /**
     * Occurs when an agent causes the system to remove a tag or other cues for special
     * access management had required to fulfill organizational policy under the legal
     * doctrine of “duty to preserve”.
     */
    @SerialName("unhold")
    UNHOLD,

    /**
     * Occurs when an agent causes the system to produce and deliver record entry
     * content in a particular form and manner.
     */
    @SerialName("report")
    REPORT,

    /**
     * Occurs when an agent causes the system to recreate record entries and their
     * content from a previous created archive artefact.
     */
    @SerialName("restore")
    RESTORE,

    /**
     * Occurs when an agent causes the system to change the form, language or code
     * system used to represent record entry content.
     */
    @SerialName("transform")
    TRANSFORM,

    /**
     * Occurs when an agent causes the system to send record entry content from one
     * (EHR/PHR/other) system to another.
     */
    @SerialName("transmit")
    TRANSMIT,

    /**
     * Occurs when an agent causes the system to disconnect two or more record entries
     * previously connected, rendering them separate (disconnected) again.
     */
    @SerialName("unlink")
    UNLINK,

    /**
     * Occurs when an agent causes the system to reverse a previous record entry merge
     * operation, rendering them separate again.
     */
    @SerialName("unmerge")
    UNMERGE,

    /**
     * Occurs when an agent causes the system to confirm compliance of data or data
     * objects with regulations, requirements, specifications, or other imposed
     * conditions based on organizational policy.
     */
    @SerialName("verify")
    VERIFY
}
