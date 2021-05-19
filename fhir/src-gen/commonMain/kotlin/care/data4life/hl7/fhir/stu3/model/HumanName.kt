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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.NameUse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirHumanName
 *
 * A human's name with the ability to identify parts and usage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HumanName">HumanName</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HumanName)
 */
interface FhirHumanName : FhirElement {

    /**
     * Identifies the purpose for this name.
     */
    val use: NameUse?

    /**
     * Text representation of the full name.
     */
    val text: String?

    /**
     * Family name (often called 'Surname').
     */
    val family: String?

    /**
     * Given names (not always 'first'). Includes middle names.
     */
    val given: List<String>?

    /**
     * Parts that come before the name.
     */
    val prefix: List<String>?

    /**
     * Parts that come after the name.
     */
    val suffix: List<String>?

    /**
     * Time period when name was/is in use.
     */
    val period: Period?
}

/**
 * HumanName
 *
 * SourceFileName: HumanName.kt
 *
 * A human's name with the ability to identify parts and usage.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HumanName">HumanName</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HumanName)
 */
@Serializable
@SerialName("HumanName")
data class HumanName(

    @SerialName("use")
    override val use: NameUse? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("family")
    override val family: String? = null,

    @SerialName("given")
    override val given: List<String>? = null,

    @SerialName("prefix")
    override val prefix: List<String>? = null,

    @SerialName("suffix")
    override val suffix: List<String>? = null,

    @SerialName("period")
    override val period: Period? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirHumanName {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "HumanName"
    }
}
