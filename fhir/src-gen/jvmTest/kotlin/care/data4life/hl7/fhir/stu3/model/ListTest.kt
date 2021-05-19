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
import care.data4life.hl7.fhir.stu3.codesystem.ListMode
import care.data4life.hl7.fhir.stu3.codesystem.ListStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ListTest.java
 *
 * Information summarized from a list of other resources
 *
 * A set of information summarized from a list of other resources.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ListTest {

    val parser = FhirStu3Parser()

    @Test
    fun testList01() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-medlist.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList01Step01(data: List) {

        assertEquals(
            expected = "182836005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Review of medication",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication Review",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-11-20T23:10:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "01",
            actual = data.entry?.get(0)?.flag?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Prescribed",
            actual = data.entry?.get(0)?.flag?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nehta.gov.au/codes/medications/changetype",
            actual = data.entry?.get(0)?.flag?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hydroxocobalamin",
            actual = data.entry?.get(0)?.item?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.entry?.get(1)?.deleted?.value
        )

        assertEquals(
            expected = "02",
            actual = data.entry?.get(1)?.flag?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cancelled",
            actual = data.entry?.get(1)?.flag?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nehta.gov.au/codes/medications/changetype",
            actual = data.entry?.get(1)?.flag?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Morphine Sulfate",
            actual = data.entry?.get(1)?.item?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "med-list",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.CHANGES,
            actual = data.mode
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList02() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-familyhistory-genetics-profile-annie.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList02Step01(data: List) {

        assertEquals(
            expected = "8670-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History of family member diseases",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "image",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6",
            actual = data.contained?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7",
            actual = data.contained?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8",
            actual = data.contained?.get(8)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9",
            actual = data.contained?.get(9)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#image",
            actual = data.entry?.get(0)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#2",
            actual = data.entry?.get(1)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#3",
            actual = data.entry?.get(2)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#4",
            actual = data.entry?.get(3)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#5",
            actual = data.entry?.get(4)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#6",
            actual = data.entry?.get(5)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#7",
            actual = data.entry?.get(6)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#8",
            actual = data.entry?.get(7)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#9",
            actual = data.entry?.get(8)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#10",
            actual = data.entry?.get(9)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "prognosis",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.mode
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Annie Proband, female, born 1966",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/proband",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList03() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-simple-empty.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList03Step01(data: List) {

        assertEquals(
            expected = "346638",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Admission List",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/list-codes",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-07-14T11:54:05+10:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "example-simple-empty",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.mode
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList04() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-empty.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList04Step01(data: List) {

        assertEquals(
            expected = "182836005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Review of medication",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication Review",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-11-26T07:30:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "nilknown",
            actual = data.emptyReason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nil Known",
            actual = data.emptyReason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/list-empty-reason",
            actual = data.emptyReason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient is not on any medications",
            actual = data.emptyReason?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-empty",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.mode
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList05() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-familyhistory-genetics-profile.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList05Step01(data: List) {

        assertEquals(
            expected = "8670-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History of family member diseases",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7",
            actual = data.contained?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8",
            actual = data.contained?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#1",
            actual = data.entry?.get(0)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#2",
            actual = data.entry?.get(1)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#3",
            actual = data.entry?.get(2)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#4",
            actual = data.entry?.get(3)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#5",
            actual = data.entry?.get(4)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#6",
            actual = data.entry?.get(5)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#7",
            actual = data.entry?.get(6)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#8",
            actual = data.entry?.get(7)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Family history of cancer of colon",
            actual = data.entry?.get(8)?.item?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/family-history",
            actual = data.entry?.get(8)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "genetic",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.mode
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Peter Patient",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList06() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-familyhistory-f201-roel.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList06Step01(data: List) {

        assertEquals(
            expected = "8670-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History of family member diseases",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fmh-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fmh-2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#fmh-1",
            actual = data.entry?.get(0)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#fmh-2",
            actual = data.entry?.get(1)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.mode
        )

        assertEquals(
            expected = "Both parents, both brothers and both children (twin) are still alive.",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList07() {
        // Given
        val sourceJson = loadAsString("stu3/list-example.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList07Step01(data: List) {

        assertEquals(
            expected = "2012-11-25T22:17:00+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.entry?.get(0)?.deleted?.value
        )

        assertEquals(
            expected = "Deleted due to error",
            actual = data.entry?.get(0)?.flag?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/example",
            actual = data.entry?.get(0)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-11-21",
            actual = data.entry?.get(1)?.date?.value.toString()
        )

        assertEquals(
            expected = "Added",
            actual = data.entry?.get(1)?.flag?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/example2",
            actual = data.entry?.get(1)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:a9fcea7c-fcdf-4d17-a5e0-f26dda030b59",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23974652",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.CHANGES,
            actual = data.mode
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testList08() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-allergies.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList08Step01(data: List) {

        assertEquals(
            expected = "52472-8",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Allergies and Adverse Drug Reactions",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Current Allergy List",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-07-14T23:10:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.entry?.get(0)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/medication",
            actual = data.entry?.get(1)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "current-allergies",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.WORKING,
            actual = data.mode
        )

        assertEquals(
            expected = "entry-date",
            actual = data.orderedBy?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/list-order",
            actual = data.orderedBy?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Current Allergy List",
            actual = data.title
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testList09() {
        // Given
        val sourceJson = loadAsString("stu3/list-example-double-cousin-relationship-pedigree.json")

        // When
        val data = parser.toFhir(List::class, sourceJson)

        // Then
        assertList09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertList09Step01(data: List) {

        assertEquals(
            expected = "80738-8",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TPMT gene mutations found [Identifier] in Blood or Tissue by Sequencing Nominal",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TPMT gene mutations found [Identifier] in Blood or Tissue by Sequencing Nominal",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#1",
            actual = data.entry?.get(0)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#2",
            actual = data.entry?.get(1)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#3",
            actual = data.entry?.get(2)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#4",
            actual = data.entry?.get(3)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#5",
            actual = data.entry?.get(4)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#6",
            actual = data.entry?.get(5)?.item?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-double-cousin-relationship",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.mode
        )

        assertEquals(
            expected = ListStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Pam Taylor",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
