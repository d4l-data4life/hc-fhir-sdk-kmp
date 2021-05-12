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
 * Structure Definition Use Codes / Keywords
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/definition-use">DefinitionUseCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/definition-use">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class DefinitionUseCodes {

    /**
     * This structure is defined as part of the base FHIR Specification
     */
    @SerialName("fhir-structure")
    FHIR_STRUCTURE,

    /**
     * This structure is intended to be treated like a FHIR resource (e.g. on the FHIR API)
     */
    @SerialName("custom-resource")
    CUSTOM_RESOURCE,

    /**
     * This structure captures an analysis of a domain
     */
    @SerialName("dam")
    DAM,

    /**
     * This structure represents and existing structure (e.g. CDA, HL7 v2)
     */
    @SerialName("wire-format")
    WIRE_FORMAT,

    /**
     * This structure captures an analysis of a domain
     */
    @SerialName("archetype")
    ARCHETYPE,

    /**
     * This structure is a template (n.b: 'template' has many meanings)
     */
    @SerialName("template")
    TEMPLATE
}
