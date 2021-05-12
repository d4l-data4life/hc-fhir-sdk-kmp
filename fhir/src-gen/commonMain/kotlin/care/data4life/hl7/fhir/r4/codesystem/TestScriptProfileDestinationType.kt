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
 * This value set defines a set of codes that are used to indicate the profile type of a test system
 * when acting as the destination within a TestScript.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/testscript-profile-destination-types">TestScriptProfileDestinationType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/testscript-profile-destination-types">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TestScriptProfileDestinationType {

    /**
     * General FHIR server used to respond to operations sent from a FHIR client.
     */
    @SerialName("FHIR-Server")
    FHIR_SERVER,

    /**
     * A FHIR server acting as a Structured Data Capture Form Manager.
     */
    @SerialName("FHIR-SDC-FormManager")
    FHIR_SDC_FORMMANAGER,

    /**
     * A FHIR server acting as a Structured Data Capture Form Processor.
     */
    @SerialName("FHIR-SDC-FormProcessor")
    FHIR_SDC_FORMPROCESSOR,

    /**
     * A FHIR server acting as a Structured Data Capture Form Receiver.
     */
    @SerialName("FHIR-SDC-FormReceiver")
    FHIR_SDC_FORMRECEIVER
}
