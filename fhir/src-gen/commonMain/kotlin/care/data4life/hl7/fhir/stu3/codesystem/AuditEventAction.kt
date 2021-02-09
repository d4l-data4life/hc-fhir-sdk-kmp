/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Indicator for type of action performed during the event that generated the event
 *
 * @see <a href="http://hl7.org/fhir/audit-event-action">AuditEventAction</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/audit-event-action">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class AuditEventAction {
    /**
     * Create a new database object, such as placing an order.
     */
    @SerialName("C")
    C,

    /**
     * Display or print data, such as a doctor census.
     */
    @SerialName("R")
    R,

    /**
     * Update data, such as revise patient information.
     */
    @SerialName("U")
    U,

    /**
     * Delete items, such as a doctor master file record.
     */
    @SerialName("D")
    D,

    /**
     * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
     */
    @SerialName("E")
    E
}
