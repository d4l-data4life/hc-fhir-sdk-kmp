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
 * This value set includes sample Contract Actor Role codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/contractactorrole">ContractActorRoleCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/contract-actorrole">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ContractActorRoleCodes {

    /**
     * Someone who provides health care related services to people or animals including
     * both clinical and support services.
     */
    @SerialName("practitioner")
    PRACTITIONER,

    /**
     * A receiver, human or animal, of health care related goods and services.
     */
    @SerialName("patient")
    PATIENT
}
