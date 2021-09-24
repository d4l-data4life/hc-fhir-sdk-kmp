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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.FilterOperator
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ValueSetTest.java
 *
 * A set of codes drawn from one or more code systems
 *
 * A value set specifies a set of codes drawn from one or more code systems.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ValueSetFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testValueSet01() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet01Step01(data: ValueSet) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.compose?.inactive?.value
        )

        assertEquals(
            expected = "14647-2",
            actual = data.compose?.include?.get(0)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Moles/Volume]",
            actual = data.compose?.include?.get(0)?.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2093-3",
            actual = data.compose?.include?.get(0)?.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass/Volume]",
            actual = data.compose?.include?.get(0)?.concept?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35200-5",
            actual = data.compose?.include?.get(0)?.concept?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass Or Moles/Volume]",
            actual = data.compose?.include?.get(0)?.concept?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9342-7",
            actual = data.compose?.include?.get(0)?.concept?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Percentile]",
            actual = data.compose?.include?.get(0)?.concept?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.36",
            actual = data.compose?.include?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-13",
            actual = data.compose?.lockedDate?.value.toString()
        )

        assertEquals(
            expected = "FHIR project team",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This content from LOINC ® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-extensional",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/identifiers/valuesets",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "loinc-cholesterol-int",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC Codes for Cholesterol in Serum/Plasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/example-extensional",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20150622",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet02() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-expansion.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet02Step01(data: ValueSet) {

        assertEquals(
            expected = FilterOperator.EQUAL,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "parent",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LP43571-6",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This content from LOINC® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14647-2",
            actual = data.expansion?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Moles/volume] in Serum or Plasma",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(1)?.abstrakt?.value
        )

        assertEquals(
            expected = "2093-3",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass/volume] in Serum or Plasma",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48620-9",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass/volume] in Serum or Plasma ultracentrifugate",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9342-7",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Percentile]",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol codes",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(2)?.abstrakt?.value
        )

        assertEquals(
            expected = "2096-6",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35200-5",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48089-7",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Apolipoprotein B [Molar ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "55838-7",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Phospholipid [Molar ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol Ratios",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expansionSource",
            actual = data.expansion?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/example-extensional",
            actual = data.expansion?.extension?.get(0)?.valueUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.expansion?.offset?.value
        )

        assertEquals(
            expected = "version",
            actual = data.expansion?.parameter?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.parameter?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22T13:56:07Z",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "8".toInt(),
            actual = data.expansion?.total?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-expansion",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC Codes for Cholesterol in Serum/Plasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project team",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/example-expansion",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20150622",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet03() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-inactive.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet03Step01(data: ValueSet) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.compose?.inactive?.value
        )

        assertEquals(
            expected = FilterOperator.DESCENDENT_OF,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "concept",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "_ActMoodPredicate",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActMood",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 v3 ActMood Prdicate codes, including inactive codes",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CRT",
            actual = data.expansion?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "criterion",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(0)?.inactive?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActMood",
            actual = data.expansion?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EXPEC",
            actual = data.expansion?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GOL",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActMood",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RSK",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "risk",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActMood",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectation",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActMood",
            actual = data.expansion?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPT",
            actual = data.expansion?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "option",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActMood",
            actual = data.expansion?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:46c00b3f-003a-4f31-9d4b-ea2de58b2a99",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-26T10:00:00Z",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "inactive",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example-inactive",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Example with inactive codes",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/inactive",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet04() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-yesnodontknow.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet04Step01(data: ValueSet) {

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/v2-0136",
            actual = data.compose?.include?.get(0)?.valueSet?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "asked",
            actual = data.compose?.include?.get(1)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Don't know",
            actual = data.compose?.include?.get(1)?.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/data-absent-reason",
            actual = data.compose?.include?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "For Capturing simple yes-no-don't know answers",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Y",
            actual = data.expansion?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0136",
            actual = data.expansion?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.expansion?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0136",
            actual = data.expansion?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "asked",
            actual = data.expansion?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Don't know",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/data-absent-reason",
            actual = data.expansion?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:bf99fe50-2c2b-41ad-bd63-bee6919810b4",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-07-14T10:00:00Z",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "yesnodontknow",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Yes/No/Don't Know",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet05() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-list-example-codes.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet05Step01(data: ValueSet) {

        assertEquals(
            expected = "http://hl7.org/fhir/list-example-use-codes",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-04-19T07:44:43+10:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Example use codes for the List resource - typical kinds of use.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-ballot-status",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Informative",
            actual = data.extension?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.extension?.get(1)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "list-example-codes",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.642.3.307",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.immutable?.value
        )

        assertEquals(
            expected = "2017-04-19T07:44:43.294+10:00",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example Use Codes for List",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/list-example-codes",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet06() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-intensional.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet06Step01(data: ValueSet) {

        assertEquals(
            expected = "5932-9",
            actual = data.compose?.exclude?.get(0)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Presence] in Blood by Test strip",
            actual = data.compose?.exclude?.get(0)?.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.exclude?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FilterOperator.EQUAL,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "parent",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LP43571-6",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR project team",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This content from LOINCÂ® is copyright Â© 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-intensional",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/identifiers/valuesets",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "loinc-cholesterol-ext",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC Codes for Cholesterol in Serum/Plasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/example-intensional",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20150622",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
