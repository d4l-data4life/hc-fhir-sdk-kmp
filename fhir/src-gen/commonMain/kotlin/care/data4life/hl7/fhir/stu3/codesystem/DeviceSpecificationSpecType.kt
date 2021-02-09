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
 * Codes for device specification types such as serial number, part number, hardware revision, software revision, etc.
 *
 * @see <a href="http://hl7.org/fhir/specification-type">DeviceSpecificationSpecType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/specification-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class DeviceSpecificationSpecType {
    /**
     * Unspecified Production Specification - MDC_ID_PROD_SPEC_UNSPECIFIED
     */
    @SerialName("unspecified")
    UNSPECIFIED,

    /**
     * Serial Number - MDC_ID_PROD_SPEC_SERIAL
     */
    @SerialName("serial-number")
    SERIAL_NUMBER,

    /**
     * Part Number - MDC_ID_PROD_SPEC_PART
     */
    @SerialName("part-number")
    PART_NUMBER,

    /**
     * Hardware Revision - MDC_ID_PROD_SPEC_HW
     */
    @SerialName("hardware-revision")
    HARDWARE_REVISION,

    /**
     * Software Revision - MDC_ID_PROD_SPEC_SW
     */
    @SerialName("software-revision")
    SOFTWARE_REVISION,

    /**
     * Firmware Revision - MDC_ID_PROD_SPEC_FW
     */
    @SerialName("firmware-revision")
    FIRMWARE_REVISION,

    /**
     * Protocol Revision - MDC_ID_PROD_SPEC_PROTOCOL
     */
    @SerialName("protocol-revision")
    PROTOCOL_REVISION,

    /**
     * GMDN - MDC_ID_PROD_SPEC_GMDN
     */
    @SerialName("gmdn")
    GMDN
}
