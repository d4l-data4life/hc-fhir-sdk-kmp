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
 * Life cycle of the Status Code of a Template Design (Version)
 *
 * @see <a href="urn:oid:2.16.840.1.113883.3.1937.98.5.8">TemplateStatusCodeLifeCycle</a>
 * @see <a href="urn:oid:2.16.840.1.113883.3.1937.98.11.8">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TemplateStatusCodeLifeCycle {

    /**
     * Design is under development (nascent).
     */
    @SerialName("draft")
    DRAFT,

    /**
     * Design is completed and is being reviewed.
     */
    @SerialName("pending")
    PENDING,

    /**
     * Design has been deemed fit for the intended purpose and is published by the
     * governance group.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * Design is active, but is under review. The review may result in a change to the
     * design. The change may necessitate a new version to be created. This in turn may
     * result in the prior version of the template to be retired. Alternatively, the
     * review may result in a change to the design that does not require a new version
     * to be created, or it may result in no change to the design at all.
     */
    @SerialName("review")
    REVIEW,

    /**
     * A drafted design is determined to be erroneous or not fit for intended purpose
     * and is discontinued before ever being published in an active state.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * A previously drafted design is determined to be erroneous or not fit for
     * intended purpose and is discontinued before ever being published for
     * consideration in a pending state.
     */
    @SerialName("rejected")
    REJECTED,

    /**
     * A previously active design is discontinued from use. It should no longer be used
     * for future designs, but for historical purposes may be used to process data
     * previously recorded using this design. A newer design may or may not exist. The
     * design is published in the retired state.
     */
    @SerialName("retired")
    RETIRED,

    /**
     * A design is determined to be erroneous or not fit for the intended purpose and
     * should no longer be used, even for historical purposes. No new designs can be
     * developed for this template. The associated template no longer needs to be
     * published, but if published, is shown in the terminated state.
     */
    @SerialName("terminated")
    TERMINATED
}
