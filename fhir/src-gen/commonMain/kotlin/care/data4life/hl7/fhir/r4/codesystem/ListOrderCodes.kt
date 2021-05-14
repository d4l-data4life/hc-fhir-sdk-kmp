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
 * Code System: ListOrderCodes
 *
 * Base values for the order of the items in a list resource.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/list-order">ListOrderCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/list-order">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ListOrderCodes {

    /**
     * The list was sorted by a user. The criteria the user used are not specified.
     */
    @SerialName("user")
    USER,

    /**
     * The list was sorted by the system. The criteria the user used are not specified;
     * define additional codes to specify a particular order (or use other defined
     * codes).
     */
    @SerialName("system")
    SYSTEM,

    /**
     * The list is sorted by the data of the event. This can be used when the list has
     * items which are dates with past or future events.
     */
    @SerialName("event-date")
    EVENT_DATE,

    /**
     * The list is sorted by the date the item was added to the list. Note that the
     * date added to the list is not explicit in the list itself.
     */
    @SerialName("entry-date")
    ENTRY_DATE,

    /**
     * The list is sorted by priority. The exact method in which priority has been
     * determined is not specified.
     */
    @SerialName("priority")
    PRIORITY,

    /**
     * The list is sorted alphabetically by an unspecified property of the items in the
     * list.
     */
    @SerialName("alphabetic")
    ALPHABETIC,

    /**
     * The list is sorted categorically by an unspecified property of the items in the
     * list.
     */
    @SerialName("category")
    CATEGORY,

    /**
     * The list is sorted by patient, with items for each patient grouped together.
     */
    @SerialName("patient")
    PATIENT,
}
