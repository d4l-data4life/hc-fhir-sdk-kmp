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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * A coded concept defining the kind of container a medication package is packaged in
 *
 * @see <a href="http://hl7.org/fhir/medication-package-form">MedicationContainer</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medication-package-form">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class MedicationContainer {
    /**
     * A sealed glass capsule containing a liquid
     */
    @SerialName("ampoule")
    AMPOULE,

    /**
     * A container, typically made of glass or plastic and with a narrow neck, used for storing liquids.
     */
    @SerialName("bottle")
    BOTTLE,

    /**
     * A container with a flat base and sides, typically square or rectangular and having a lid.
     */
    @SerialName("box")
    BOX,

    /**
     * A device of various configuration and composition used with a syringe for the application of anesthetic or other materials to a patient.
     */
    @SerialName("cartridge")
    CARTRIDGE,

    /**
     * A package intended to store pharmaceuticals.
     */
    @SerialName("container")
    CONTAINER,

    /**
     * A long, hollow cylinder of metal, plastic, glass, etc., for holding medications, typically creams or ointments
     */
    @SerialName("tube")
    TUBE,

    /**
     * A dose of medicine prepared in an individual package for convenience, safety or monitoring.
     */
    @SerialName("unitdose")
    UNITDOSE,

    /**
     * A small container, typically cylindrical and made of glass, used especially for holding liquid medications.
     */
    @SerialName("vial")
    VIAL
}
