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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.codesystem.ResearchSubjectStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirResearchSubject
 *
 * A physical entity which is the primary unit of operational and/or administrative interest in a
 * study.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchSubject">ResearchSubject</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchSubject)
 */
interface FhirResearchSubject : FhirDomainResource {

    /**
     * Business Identifier for research subject in a study.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The current state of the subject.
     */
    val status: ResearchSubjectStatus

    /**
     * Start and end of participation.
     */
    val period: Period?

    /**
     * Study subject is part of.
     */
    val study: Reference

    /**
     * Who is part of study.
     */
    val individual: Reference

    /**
     * What path should be followed.
     */
    val assignedArm: String?

    /**
     * What path was followed.
     */
    val actualArm: String?

    /**
     * Agreement to participate in study.
     */
    val consent: Reference?
}

/**
 * ResearchSubject
 *
 * A physical entity which is the primary unit of operational and/or administrative interest in a
 * study.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchSubject">ResearchSubject</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchSubject)
 */
@Serializable
@SerialName("ResearchSubject")
data class ResearchSubject(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: ResearchSubjectStatus,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("study")
    override val study: Reference,

    @SerialName("individual")
    override val individual: Reference,

    @SerialName("assignedArm")
    override val assignedArm: String? = null,

    @SerialName("actualArm")
    override val actualArm: String? = null,

    @SerialName("consent")
    override val consent: Reference? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirResearchSubject {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ResearchSubject"
    }
}