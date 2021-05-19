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

import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResearchStudyStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ResearchStudyTest.java
 *
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A process where a researcher or organization plans and then executes a series of steps intended to
 * increase the field of healthcare-related knowledge. This includes studies of safety, efficacy,
 * comparative effectiveness and other information about medications, devices, therapies and other
 * interventional and investigative techniques. A ResearchStudy involves the gathering of information
 * about human or animal subjects.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ResearchStudyFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testResearchStudy01() {
        // Given
        val sourceJson = loadAsString("stu3/researchstudy-example.json")

        // When
        val data = parser.toFhir(ResearchStudy::class, sourceJson)

        // Then
        assertResearchStudy01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertResearchStudy01Step01(data: ResearchStudy) {

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResearchStudyStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
