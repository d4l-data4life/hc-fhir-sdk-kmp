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
import care.data4life.hl7.fhir.r4.codesystem.ListMode
import care.data4life.hl7.fhir.r4.codesystem.ListStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ListTest.java
 *
 * A list is a curated collection of resources
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ListTest {

    val parser = FhirR4Parser()

    @Test
    fun testList01() {
        // Given
        val sourceJson = loadAsString("r4/list-example-medlist.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "182836005",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Review of medication",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Medication Review",
            data.code?.text
        )
        assertEquals(
            "2013-11-20T23:10:23+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "01",
            data.entry?.get(0)?.flag?.coding?.get(0)?.code
        )
        assertEquals(
            "Prescribed",
            data.entry?.get(0)?.flag?.coding?.get(0)?.display
        )
        assertEquals(
            "http://nehta.gov.au/codes/medications/changetype",
            data.entry?.get(0)?.flag?.coding?.get(0)?.system
        )
        assertEquals(
            "hydroxocobalamin",
            data.entry?.get(0)?.item?.display
        )
        assertEquals(
            "True".toBoolean(),
            data.entry?.get(1)?.deleted?.value
        )
        assertEquals(
            "02",
            data.entry?.get(1)?.flag?.coding?.get(0)?.code
        )
        assertEquals(
            "Cancelled",
            data.entry?.get(1)?.flag?.coding?.get(0)?.display
        )
        assertEquals(
            "http://nehta.gov.au/codes/medications/changetype",
            data.entry?.get(1)?.flag?.coding?.get(0)?.system
        )
        assertEquals(
            "Morphine Sulfate",
            data.entry?.get(1)?.item?.display
        )
        assertEquals(
            "med-list",
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
            ListMode.CHANGES,
            data.mode
        )
        assertEquals(
            "Patient/example",
            data.source?.reference
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
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

    @Test
    fun testList02() {
        // Given
        val sourceJson = loadAsString("r4/list-example-familyhistory-genetics-profile-annie.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "8670-2",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "History of family member diseases",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "image",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "1",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "2",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "3",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "4",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "5",
            data.contained?.get(5)?.id
        )
        assertEquals(
            "6",
            data.contained?.get(6)?.id
        )
        assertEquals(
            "7",
            data.contained?.get(7)?.id
        )
        assertEquals(
            "8",
            data.contained?.get(8)?.id
        )
        assertEquals(
            "9",
            data.contained?.get(9)?.id
        )
        assertEquals(
            "#image",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "#2",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "#3",
            data.entry?.get(2)?.item?.reference
        )
        assertEquals(
            "#4",
            data.entry?.get(3)?.item?.reference
        )
        assertEquals(
            "#5",
            data.entry?.get(4)?.item?.reference
        )
        assertEquals(
            "#6",
            data.entry?.get(5)?.item?.reference
        )
        assertEquals(
            "#7",
            data.entry?.get(6)?.item?.reference
        )
        assertEquals(
            "#8",
            data.entry?.get(7)?.item?.reference
        )
        assertEquals(
            "#9",
            data.entry?.get(8)?.item?.reference
        )
        assertEquals(
            "#10",
            data.entry?.get(9)?.item?.reference
        )
        assertEquals(
            "prognosis",
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
            ListMode.SNAPSHOT,
            data.mode
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
        )
        assertEquals(
            "Annie Proband, female, born 1966",
            data.subject?.display
        )
        assertEquals(
            "Patient/proband",
            data.subject?.reference
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

    @Test
    fun testList03() {
        // Given
        val sourceJson = loadAsString("r4/list-example-simple-empty.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "346638",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Patient Admission List",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://acme.com/list-codes",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-07-14T11:54:05+10:00",
            data.date?.value.toString()
        )
        assertEquals(
            "example-simple-empty",
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
            ListMode.SNAPSHOT,
            data.mode
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
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

    @Test
    fun testList04() {
        // Given
        val sourceJson = loadAsString("r4/list-example-empty.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "182836005",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Review of medication",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Medication Review",
            data.code?.text
        )
        assertEquals(
            "2012-11-26T07:30:23+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "nilknown",
            data.emptyReason?.coding?.get(0)?.code
        )
        assertEquals(
            "Nil Known",
            data.emptyReason?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/list-empty-reason",
            data.emptyReason?.coding?.get(0)?.system
        )
        assertEquals(
            "The patient is not on any medications",
            data.emptyReason?.text
        )
        assertEquals(
            "example-empty",
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
            ListMode.SNAPSHOT,
            data.mode
        )
        assertEquals(
            "Patient/example",
            data.source?.reference
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
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

    @Test
    fun testList05() {
        // Given
        val sourceJson = loadAsString("r4/list-example-familyhistory-genetics-profile.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "8670-2",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "History of family member diseases",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "2",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "3",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "4",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "5",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "6",
            data.contained?.get(5)?.id
        )
        assertEquals(
            "7",
            data.contained?.get(6)?.id
        )
        assertEquals(
            "8",
            data.contained?.get(7)?.id
        )
        assertEquals(
            "#1",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "#2",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "#3",
            data.entry?.get(2)?.item?.reference
        )
        assertEquals(
            "#4",
            data.entry?.get(3)?.item?.reference
        )
        assertEquals(
            "#5",
            data.entry?.get(4)?.item?.reference
        )
        assertEquals(
            "#6",
            data.entry?.get(5)?.item?.reference
        )
        assertEquals(
            "#7",
            data.entry?.get(6)?.item?.reference
        )
        assertEquals(
            "#8",
            data.entry?.get(7)?.item?.reference
        )
        assertEquals(
            "Family history of cancer of colon",
            data.entry?.get(8)?.item?.display
        )
        assertEquals(
            "Condition/family-history",
            data.entry?.get(8)?.item?.reference
        )
        assertEquals(
            "genetic",
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
            ListMode.SNAPSHOT,
            data.mode
        )
        assertEquals(
            ListStatus.CURRENT,
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

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testList06() {
        // Given
        val sourceJson = loadAsString("r4/list-example-familyhistory-f201-roel.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "8670-2",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "History of family member diseases",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "fmh-1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "fmh-2",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "#fmh-1",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "#fmh-2",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "f201",
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
            ListMode.SNAPSHOT,
            data.mode
        )
        assertEquals(
            "Both parents, both brothers and both children (twin) are still alive.",
            data.note?.get(0)?.text
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
        )
        assertEquals(
            "Roel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f201",
            data.subject?.reference
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

    @Test
    fun testList07() {
        // Given
        val sourceJson = loadAsString("r4/list-example.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "2012-11-25T22:17:00+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.entry?.get(0)?.deleted?.value
        )
        assertEquals(
            "Deleted due to error",
            data.entry?.get(0)?.flag?.text
        )
        assertEquals(
            "Condition/example",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "Added",
            data.entry?.get(1)?.flag?.text
        )
        assertEquals(
            "Condition/example2",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "urn:uuid:a9fcea7c-fcdf-4d17-a5e0-f26dda030b59",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "23974652",
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
            ListMode.CHANGES,
            data.mode
        )
        assertEquals(
            "Patient/example",
            data.source?.reference
        )
        assertEquals(
            ListStatus.CURRENT,
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

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testList08() {
        // Given
        val sourceJson = loadAsString("r4/list-example-allergies.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "52472-8",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Allergies and Adverse Drug Reactions",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Current Allergy List",
            data.code?.text
        )
        assertEquals(
            "2015-07-14T23:10:23+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "AllergyIntolerance/medication",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "current-allergies",
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
            ListMode.WORKING,
            data.mode
        )
        assertEquals(
            "entry-date",
            data.orderedBy?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/list-order",
            data.orderedBy?.coding?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.source?.reference
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Current Allergy List",
            data.title
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testList09() {
        // Given
        val sourceJson = loadAsString("r4/list-example-double-cousin-relationship-pedigree.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "80738-8",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "TPMT gene mutations found [Identifier] in Blood or Tissue by Sequencing Nominal",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "TPMT gene mutations found [Identifier] in Blood or Tissue by Sequencing Nominal",
            data.code?.text
        )
        assertEquals(
            "1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "2",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "3",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "4",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "5",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "6",
            data.contained?.get(5)?.id
        )
        assertEquals(
            "#1",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "#2",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "#3",
            data.entry?.get(2)?.item?.reference
        )
        assertEquals(
            "#4",
            data.entry?.get(3)?.item?.reference
        )
        assertEquals(
            "#5",
            data.entry?.get(4)?.item?.reference
        )
        assertEquals(
            "#6",
            data.entry?.get(5)?.item?.reference
        )
        assertEquals(
            "example-double-cousin-relationship",
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
            ListMode.SNAPSHOT,
            data.mode
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
        )
        assertEquals(
            "Pam Taylor",
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

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testList10() {
        // Given
        val sourceJson = loadAsString("r4/list-example-long.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertEquals(
            "2018-02-21T12:17:00+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "Patient/example",
            data.entry?.get(0)?.item?.reference
        )
        assertEquals(
            "Patient/pat1",
            data.entry?.get(1)?.item?.reference
        )
        assertEquals(
            "Patient/pat2",
            data.entry?.get(2)?.item?.reference
        )
        assertEquals(
            "Patient/pat3",
            data.entry?.get(3)?.item?.reference
        )
        assertEquals(
            "Patient/pat4",
            data.entry?.get(4)?.item?.reference
        )
        assertEquals(
            "Patient/1",
            data.entry?.get(5)?.item?.reference
        )
        assertEquals(
            "Patient/2",
            data.entry?.get(6)?.item?.reference
        )
        assertEquals(
            "Patient/3",
            data.entry?.get(7)?.item?.reference
        )
        assertEquals(
            "Patient/4",
            data.entry?.get(8)?.item?.reference
        )
        assertEquals(
            "Patient/5",
            data.entry?.get(9)?.item?.reference
        )
        assertEquals(
            "long",
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
            ListMode.CHANGES,
            data.mode
        )
        assertEquals(
            ListStatus.CURRENT,
            data.status
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
