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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.SpecimenStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SpecimenTest.java
 *
 * Sample for analysis
 *
 * A sample to be used for analysis.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SpecimenTest {

    val parser = FhirR4Parser()

    @Test
    fun testSpecimen01() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-isolate.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertSpecimen01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSpecimen01Step01(data: Specimen) {

        assertEquals(
            expected = "http://lab.acme.org/specimens/2011",
            actual = data.accessionIdentifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "X352356-ISO1",
            actual = data.accessionIdentifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-16T07:03:00Z",
            actual = data.collection?.collectedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/f202",
            actual = data.collection?.collector?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "BAP",
            actual = data.collection?.method?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0488",
            actual = data.collection?.method?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "stool",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "isolate",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient dropped off specimen",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#stool",
            actual = data.parent?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-18T07:03:00Z",
            actual = data.receivedTime?.value.toString()
        )

        assertEquals(
            expected = SpecimenStatus.AVAILABLE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "429951000124103",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Bacterial isolate specimen",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testSpecimen02() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-pooled-serum.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertSpecimen02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSpecimen02Step01(data: Specimen) {

        assertEquals(
            expected = "https://vetmed.iastate.edu/vdl",
            actual = data.accessionIdentifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "20171120-1234",
            actual = data.accessionIdentifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-11-14",
            actual = data.collection?.collectedDateTime?.value.toString()
        )

        assertEquals(
            expected = "James Herriot, FRCVS",
            actual = data.collection?.collector?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "RTT",
            actual = data.container?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Red Top Tube",
            actual = data.container?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://vetmed.iastate.edu/vdl",
            actual = data.container?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Red Top Blood Collection Tube",
            actual = data.container?.get(0)?.type?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "pooled-serum",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Pooled serum sample from 30 individuals",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Group/herd1",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Serum sample, pooled",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Serum sample, pooled",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://vetmed.iastate.edu/vdl",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Pooled serum sample",
            actual = data.type?.text
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testSpecimen03() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-urine.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertSpecimen03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSpecimen03Step01(data: Specimen) {

        assertEquals(
            expected = "http://lab.acme.org/specimens/2015",
            actual = data.accessionIdentifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "X352356",
            actual = data.accessionIdentifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-18T07:03:00Z",
            actual = data.collection?.collectedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/f202",
            actual = data.collection?.collector?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mls",
            actual = data.container?.get(0)?.capacity?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "50".toDouble(),
            actual = data.container?.get(0)?.capacity?.value?.value
        )

        assertEquals(
            expected = "mls",
            actual = data.container?.get(0)?.specimenQuantity?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "10".toDouble(),
            actual = data.container?.get(0)?.specimenQuantity?.value?.value
        )

        assertEquals(
            expected = "Non-sterile specimen container",
            actual = data.container?.get(0)?.type?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "vma-urine",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "6 N HCl",
            actual = data.processing?.get(0)?.additive?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Acidify to pH < 3.0 with 6 N HCl.",
            actual = data.processing?.get(0)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ACID",
            actual = data.processing?.get(0)?.procedure?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0373",
            actual = data.processing?.get(0)?.procedure?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-18T08:10:00Z",
            actual = data.processing?.get(0)?.timeDateTime?.value.toString()
        )

        assertEquals(
            expected = "2015-08-18T07:03:00Z",
            actual = data.receivedTime?.value.toString()
        )

        assertEquals(
            expected = SpecimenStatus.AVAILABLE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "RANDU",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Urine, Random",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0487",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testSpecimen04() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-serum.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertSpecimen04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSpecimen04Step01(data: Specimen) {

        assertEquals(
            expected = "http://acme.com/labs/accession-ids",
            actual = data.accessionIdentifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "20150816-00124",
            actual = data.accessionIdentifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-16T06:40:17Z",
            actual = data.collection?.collectedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/f202",
            actual = data.collection?.collector?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SST",
            actual = data.container?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Serum Separator Tube",
            actual = data.container?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/labs",
            actual = data.container?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sst",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest/ft4",
            actual = data.request?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "119364003",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Serum sample",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testSpecimen05() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertSpecimen05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSpecimen05Step01(data: Specimen) {

        assertEquals(
            expected = "http://lab.acme.org/specimens/2011",
            actual = data.accessionIdentifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "X352356",
            actual = data.accessionIdentifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "49852007",
            actual = data.collection?.bodySite?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Structure of median cubital vein (body structure)",
            actual = data.collection?.bodySite?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.collection?.bodySite?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Right median cubital vein",
            actual = data.collection?.bodySite?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2011-05-30T06:15:00Z",
            actual = data.collection?.collectedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.collection?.collector?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LNV",
            actual = data.collection?.method?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0488",
            actual = data.collection?.method?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.collection?.quantity?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "6".toDouble(),
            actual = data.collection?.quantity?.value?.value
        )

        assertEquals(
            expected = "hep",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#hep",
            actual = data.container?.get(0)?.additiveReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.container?.get(0)?.capacity?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "10".toDouble(),
            actual = data.container?.get(0)?.capacity?.value?.value
        )

        assertEquals(
            expected = "Green Gel tube",
            actual = data.container?.get(0)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "48736-15394-75465",
            actual = data.container?.get(0)?.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.container?.get(0)?.specimenQuantity?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "6".toDouble(),
            actual = data.container?.get(0)?.specimenQuantity?.value?.value
        )

        assertEquals(
            expected = "Vacutainer",
            actual = data.container?.get(0)?.type?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "101",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ehr.acme.org/identifiers/collections",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "23234352356",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Specimen is grossly lipemic",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2011-03-04T07:03:00Z",
            actual = data.receivedTime?.value.toString()
        )

        assertEquals(
            expected = "ServiceRequest/example",
            actual = data.request?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = SpecimenStatus.AVAILABLE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter Patient",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "122555007",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Venous blood specimen",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }
}
