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
        assertEquals(
            "http://lab.acme.org/specimens/2011",
            data.accessionIdentifier?.system
        )
        assertEquals(
            "X352356-ISO1",
            data.accessionIdentifier?.value
        )
        assertEquals(
            "2015-08-16T07:03:00Z",
            data.collection?.collectedDateTime?.value.toString()
        )
        assertEquals(
            "Practitioner/f202",
            data.collection?.collector?.reference
        )
        assertEquals(
            "BAP",
            data.collection?.method?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0488",
            data.collection?.method?.coding?.get(0)?.system
        )
        assertEquals(
            "stool",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "isolate",
            data.id
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
            "Patient dropped off specimen",
            data.note?.get(0)?.text
        )
        assertEquals(
            "#stool",
            data.parent?.get(0)?.reference
        )
        assertEquals(
            "2015-08-18T07:03:00Z",
            data.receivedTime?.value.toString()
        )
        assertEquals(
            SpecimenStatus.AVAILABLE,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "429951000124103",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Bacterial isolate specimen",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSpecimen02() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-pooled-serum.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertEquals(
            "https://vetmed.iastate.edu/vdl",
            data.accessionIdentifier?.system
        )
        assertEquals(
            "20171120-1234",
            data.accessionIdentifier?.value
        )
        assertEquals(
            "2017-11-14",
            data.collection?.collectedDateTime?.value.toString()
        )
        assertEquals(
            "James Herriot, FRCVS",
            data.collection?.collector?.display
        )
        assertEquals(
            "RTT",
            data.container?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Red Top Tube",
            data.container?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "https://vetmed.iastate.edu/vdl",
            data.container?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Red Top Blood Collection Tube",
            data.container?.get(0)?.type?.text
        )
        assertEquals(
            "pooled-serum",
            data.id
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
            "Pooled serum sample from 30 individuals",
            data.note?.get(0)?.text
        )
        assertEquals(
            "Group/herd1",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Serum sample, pooled",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Serum sample, pooled",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "https://vetmed.iastate.edu/vdl",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Pooled serum sample",
            data.type?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSpecimen03() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-urine.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertEquals(
            "http://lab.acme.org/specimens/2015",
            data.accessionIdentifier?.system
        )
        assertEquals(
            "X352356",
            data.accessionIdentifier?.value
        )
        assertEquals(
            "2015-08-18T07:03:00Z",
            data.collection?.collectedDateTime?.value.toString()
        )
        assertEquals(
            "Practitioner/f202",
            data.collection?.collector?.reference
        )
        assertEquals(
            "mls",
            data.container?.get(0)?.capacity?.unit
        )
        assertEquals(
            "50".toDouble(),
            data.container?.get(0)?.capacity?.value?.value
        )
        assertEquals(
            "mls",
            data.container?.get(0)?.specimenQuantity?.unit
        )
        assertEquals(
            "10".toDouble(),
            data.container?.get(0)?.specimenQuantity?.value?.value
        )
        assertEquals(
            "Non-sterile specimen container",
            data.container?.get(0)?.type?.text
        )
        assertEquals(
            "vma-urine",
            data.id
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
            "6 N HCl",
            data.processing?.get(0)?.additive?.get(0)?.display
        )
        assertEquals(
            "Acidify to pH < 3.0 with 6 N HCl.",
            data.processing?.get(0)?.description
        )
        assertEquals(
            "ACID",
            data.processing?.get(0)?.procedure?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0373",
            data.processing?.get(0)?.procedure?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-08-18T08:10:00Z",
            data.processing?.get(0)?.timeDateTime?.value.toString()
        )
        assertEquals(
            "2015-08-18T07:03:00Z",
            data.receivedTime?.value.toString()
        )
        assertEquals(
            SpecimenStatus.AVAILABLE,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "RANDU",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Urine, Random",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0487",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSpecimen04() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example-serum.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertEquals(
            "http://acme.com/labs/accession-ids",
            data.accessionIdentifier?.system
        )
        assertEquals(
            "20150816-00124",
            data.accessionIdentifier?.value
        )
        assertEquals(
            "2015-08-16T06:40:17Z",
            data.collection?.collectedDateTime?.value.toString()
        )
        assertEquals(
            "Practitioner/f202",
            data.collection?.collector?.reference
        )
        assertEquals(
            "SST",
            data.container?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Serum Separator Tube",
            data.container?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://acme.com/labs",
            data.container?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "sst",
            data.id
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
            "ServiceRequest/ft4",
            data.request?.get(0)?.reference
        )
        assertEquals(
            "Patient/pat2",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "119364003",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Serum sample",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSpecimen05() {
        // Given
        val sourceJson = loadAsString("r4/specimen-example.json")

        // When
        val data = parser.toFhir(Specimen::class, sourceJson)

        // Then
        assertEquals(
            "http://lab.acme.org/specimens/2011",
            data.accessionIdentifier?.system
        )
        assertEquals(
            "X352356",
            data.accessionIdentifier?.value
        )
        assertEquals(
            "49852007",
            data.collection?.bodySite?.coding?.get(0)?.code
        )
        assertEquals(
            "Structure of median cubital vein (body structure)",
            data.collection?.bodySite?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.collection?.bodySite?.coding?.get(0)?.system
        )
        assertEquals(
            "Right median cubital vein",
            data.collection?.bodySite?.text
        )
        assertEquals(
            "2011-05-30T06:15:00Z",
            data.collection?.collectedDateTime?.value.toString()
        )
        assertEquals(
            "Practitioner/example",
            data.collection?.collector?.reference
        )
        assertEquals(
            "LNV",
            data.collection?.method?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0488",
            data.collection?.method?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.collection?.quantity?.unit
        )
        assertEquals(
            "6".toDouble(),
            data.collection?.quantity?.value?.value
        )
        assertEquals(
            "hep",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "#hep",
            data.container?.get(0)?.additiveReference?.reference
        )
        assertEquals(
            "mL",
            data.container?.get(0)?.capacity?.unit
        )
        assertEquals(
            "10".toDouble(),
            data.container?.get(0)?.capacity?.value?.value
        )
        assertEquals(
            "Green Gel tube",
            data.container?.get(0)?.description
        )
        assertEquals(
            "48736-15394-75465",
            data.container?.get(0)?.identifier?.get(0)?.value
        )
        assertEquals(
            "mL",
            data.container?.get(0)?.specimenQuantity?.unit
        )
        assertEquals(
            "6".toDouble(),
            data.container?.get(0)?.specimenQuantity?.value?.value
        )
        assertEquals(
            "Vacutainer",
            data.container?.get(0)?.type?.text
        )
        assertEquals(
            "101",
            data.id
        )
        assertEquals(
            "http://ehr.acme.org/identifiers/collections",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "23234352356",
            data.identifier?.get(0)?.value
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
            "Specimen is grossly lipemic",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2011-03-04T07:03:00Z",
            data.receivedTime?.value.toString()
        )
        assertEquals(
            "ServiceRequest/example",
            data.request?.get(0)?.reference
        )
        assertEquals(
            SpecimenStatus.AVAILABLE,
            data.status
        )
        assertEquals(
            "Peter Patient",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "122555007",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Venous blood specimen",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
