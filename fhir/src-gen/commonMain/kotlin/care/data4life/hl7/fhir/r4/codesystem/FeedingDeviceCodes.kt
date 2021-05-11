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
 * Materials used or needed to feed the patient.
 *
 * @see <a href="http://hl7.org/fhir/feeding-device">FeedingDeviceCodes</a>
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class FeedingDeviceCodes {
    /**
     * Standard nipple definition:
     */
    @SerialName("standard-nipple")
    STANDARD_NIPPLE,

    /**
     * Preemie nipple definition:
     */
    @SerialName("preemie-nipple")
    PREEMIE_NIPPLE,

    /**
     * Orthodontic nipple definition:
     */
    @SerialName("ortho-nipple")
    ORTHO_NIPPLE,

    /**
     * Slow flow nipple definition:
     */
    @SerialName("sloflo-nipple")
    SLOFLO_NIPPLE,

    /**
     * Middle flow nipple definition:
     */
    @SerialName("midflo-nipple")
    MIDFLO_NIPPLE,

    /**
     * Enlarged, cross-cut nipple definition:
     */
    @SerialName("bigcut-nipple")
    BIGCUT_NIPPLE,

    /**
     * Haberman bottle definition:
     */
    @SerialName("haberman-bottle")
    HABERMAN_BOTTLE,

    /**
     * Sippy cup with valve definition:
     */
    @SerialName("sippy-valve")
    SIPPY_VALVE,

    /**
     * Sippy cup without valve definition:
     */
    @SerialName("sippy-no-valve")
    SIPPY_NO_VALVE,

    /**
     * Provale Cup definition:
     */
    @SerialName("provale-cup")
    PROVALE_CUP,

    /**
     * Glass with lid/sippy cup definition:
     */
    @SerialName("glass-lid")
    GLASS_LID,

    /**
     * Double handhold on glass/cup definition:
     */
    @SerialName("handhold-cup")
    HANDHOLD_CUP,

    /**
     * Rubber matting under tray definition:
     */
    @SerialName("rubber-mat")
    RUBBER_MAT,

    /**
     * Straw definition:
     */
    @SerialName("straw")
    STRAW,

    /**
     * Nose cup definition:
     */
    @SerialName("nose-cup")
    NOSE_CUP,

    /**
     * Scoop plate definition:
     */
    @SerialName("scoop-plate")
    SCOOP_PLATE,

    /**
     * Hand wrap utensil holder definition:
     */
    @SerialName("utensil-holder")
    UTENSIL_HOLDER,

    /**
     * Foam handle utensils definition:
     */
    @SerialName("foam-handle")
    FOAM_HANDLE,

    /**
     * Angled utensils definition:
     */
    @SerialName("angled-utensil")
    ANGLED_UTENSIL,

    /**
     * Spout cup definition:
     */
    @SerialName("spout-cup")
    SPOUT_CUP,

    /**
     * Automated feeding devices definition:
     */
    @SerialName("autofeeding-device")
    AUTOFEEDING_DEVICE,

    /**
     * Rocker knife definition:
     */
    @SerialName("rocker-knife")
    ROCKER_KNIFE
}
