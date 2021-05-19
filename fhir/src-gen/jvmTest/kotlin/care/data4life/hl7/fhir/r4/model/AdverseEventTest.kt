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

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.AdverseEventActuality
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AdverseEventTest {

    val parser = FhirR4Parser()

    @Test
    fun testAdverseEvent01() {
        // Given
        val sourceJson = loadAsString("r4/adverseevent-example.json")

        // When
        val data = parser.toFhir(AdverseEvent::class, sourceJson)

        // Then
        assertEquals(
            AdverseEventActuality.ACTUAL,
            data.actuality
        )
        assertEquals(
            "product-use-error",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Product Use Error",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/adverse-event-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2017-01-29T12:34:56+00:00",
            data.date?.value.toString()
        )
        assertEquals(
            "304386008",
            data.event?.coding?.get(0)?.code
        )
        assertEquals(
            "O/E - itchy rash",
            data.event?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.event?.coding?.get(0)?.system
        )
        assertEquals(
            "This was a mild rash on the left forearm",
            data.event?.text
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://acme.com/ids/patients/risks",
            data.identifier?.system
        )
        assertEquals(
            "49476534",
            data.identifier?.value
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.recorder?.reference
        )
        assertEquals(
            "Non-serious",
            data.seriousness?.coding?.get(0)?.code
        )
        assertEquals(
            "Non-serious",
            data.seriousness?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/adverse-event-seriousness",
            data.seriousness?.coding?.get(0)?.system
        )
        assertEquals(
            "mild",
            data.severity?.coding?.get(0)?.code
        )
        assertEquals(
            "Mild",
            data.severity?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/adverse-event-severity",
            data.severity?.coding?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "Medication/example",
            data.suspectEntity?.get(0)?.instance?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
