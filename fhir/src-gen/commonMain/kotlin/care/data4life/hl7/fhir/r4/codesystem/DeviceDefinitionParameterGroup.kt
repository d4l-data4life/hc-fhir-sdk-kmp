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
 * Codes identifying groupings of parameters; e.g. Cardiovascular.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/parameter-group">DeviceDefinitionParameterGroup</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/parameter-group">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class DeviceDefinitionParameterGroup {
    /**
     * Haemodynamic Parameter Group - MDC_PGRP_HEMO.
     */
    @SerialName("haemodynamic")
    HAEMODYNAMIC,

    /**
     * ECG Parameter Group - MDC_PGRP_ECG.
     */
    @SerialName("ecg")
    ECG,

    /**
     * Respiratory Parameter Group - MDC_PGRP_RESP.
     */
    @SerialName("respiratory")
    RESPIRATORY,

    /**
     * Ventilation Parameter Group - MDC_PGRP_VENT.
     */
    @SerialName("ventilation")
    VENTILATION,

    /**
     * Neurological Parameter Group - MDC_PGRP_NEURO.
     */
    @SerialName("neurological")
    NEUROLOGICAL,

    /**
     * Drug Delivery Parameter Group - MDC_PGRP_DRUG.
     */
    @SerialName("drug-delivery")
    DRUG_DELIVERY,

    /**
     * Fluid Chemistry Parameter Group - MDC_PGRP_FLUID.
     */
    @SerialName("fluid-chemistry")
    FLUID_CHEMISTRY,

    /**
     * Blood Chemistry Parameter Group - MDC_PGRP_BLOOD_CHEM.
     */
    @SerialName("blood-chemistry")
    BLOOD_CHEMISTRY,

    /**
     * Miscellaneous Parameter Group - MDC_PGRP_MISC.
     */
    @SerialName("miscellaneous")
    MISCELLANEOUS
}
