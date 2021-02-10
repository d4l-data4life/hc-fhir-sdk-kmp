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
 * The way in which a person authenticated a composition.
 *
 * @see <a href="http://hl7.org/fhir/composition-attestation-mode">CompositionAttestationMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/composition-attestation-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class CompositionAttestationMode {
    /**
     * The person authenticated the content in their personal capacity.
     */
    @SerialName("personal")
    PERSONAL,

    /**
     * The person authenticated the content in their professional capacity.
     */
    @SerialName("professional")
    PROFESSIONAL,

    /**
     * The person authenticated the content and accepted legal responsibility for its content.
     */
    @SerialName("legal")
    LEGAL,

    /**
     * The organization authenticated the content as consistent with their policies and procedures.
     */
    @SerialName("official")
    OFFICIAL
}
