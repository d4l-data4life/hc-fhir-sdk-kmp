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
import care.data4life.hl7.fhir.stu3.codesystem.AdverseEventCategory
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * AdverseEventTest.java
 *
 * Medical care, research study or other healthcare event causing physical injury
 *
 * Actual or potential/avoided event causing unintended physical injury resulting from or contributed
 * to by medical care, a research study or other healthcare setting factors that requires additional
 * monitoring, treatment, or hospitalization, or that results in death.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AdverseEventTest {

    val parser = FhirStu3Parser()

    @Test
    fun testAdverseEvent01() {
        // Given
        val sourceJson = loadAsString("stu3/adverseevent-example.json")

        // When
        val data = parser.toFhir(AdverseEvent::class, sourceJson)

        // Then
        assertAdverseEvent01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAdverseEvent01Step01(data: AdverseEvent) {

        assertEquals(
            expected = AdverseEventCategory.AE,
            actual = data.category
        )

        assertEquals(
            expected = "2017-01-29T12:34:56+00:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This was a mild rash on the left forearm",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/ids/patients/risks",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "49476534",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.recorder?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mild",
            actual = data.seriousness?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mild",
            actual = data.seriousness?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/adverse-event-seriousness",
            actual = data.seriousness?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication/example",
            actual = data.suspectEntity?.get(0)?.instance?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "304386008",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "O/E - itchy rash",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
