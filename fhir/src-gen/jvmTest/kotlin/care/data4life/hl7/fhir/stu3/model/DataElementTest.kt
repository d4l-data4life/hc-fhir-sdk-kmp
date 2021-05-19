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
import care.data4life.hl7.fhir.stu3.codesystem.BindingStrength
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DataElementTest.java
 *
 * Resource data element
 *
 * The formal description of a single piece of information that can be gathered and reported.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DataElementTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDataElement01() {
        // Given
        val sourceJson = loadAsString("stu3/dataelement-example.json")

        // When
        val data = parser.toFhir(DataElement::class, sourceJson)

        // Then
        assertDataElement01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDataElement01Step01(data: DataElement) {

        assertEquals(
            expected = "2179414",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2179414-permitted",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2179414-cm",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = BindingStrength.REQUIRED,
            actual = data.element?.get(0)?.binding?.strength
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/11179-permitted-value-valueset",
            actual = data.element?.get(0)?.binding?.valueSetReference?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#2179414-permitted",
            actual = data.element?.get(0)?.binding?.valueSetReference?.extension?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/11179-permitted-value-conceptmap",
            actual = data.element?.get(0)?.binding?.valueSetReference?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#2179414-cm",
            actual = data.element?.get(0)?.binding?.valueSetReference?.extension?.get(1)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#2179414",
            actual = data.element?.get(0)?.binding?.valueSetReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "46098-0",
            actual = data.element?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sex",
            actual = data.element?.get(0)?.code?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.element?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The code representing the gender of a person.",
            actual = data.element?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/minLength",
            actual = data.element?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.element?.get(0)?.extension?.get(0)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-question",
            actual = data.element?.get(0)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.element?.get(0)?.extension?.get(1)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.element?.get(0)?.mapping?.get(0)?.identity
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/xquery",
            actual = data.element?.get(0)?.mapping?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "return f:/Patient/f:gender",
            actual = data.element?.get(0)?.mapping?.get(0)?.map
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "13".toInt(),
            actual = data.element?.get(0)?.maxLength?.value
        )

        assertEquals(
            expected = "Gender",
            actual = data.element?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CodeableConcept",
            actual = data.element?.get(0)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "gender",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2179650",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.mapping?.get(0)?.identity
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fast Healthcare Interoperable Resources (FHIR)",
            actual = data.mapping?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/api",
            actual = data.mapping?.get(0)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Gender Code",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DCP",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Administrative gender",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDataElement02() {
        // Given
        val sourceJson = loadAsString("stu3/dataelement-labtestmaster-example.json")

        // When
        val data = parser.toFhir(DataElement::class, sourceJson)

        // Then
        assertDataElement02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDataElement02Step01(data: DataElement) {

        assertEquals(
            expected = "Protime, PT",
            actual = data.element?.get(0)?.alias?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Used to screen the integrity of the extrinsic and common pathways of coagulation and to monitor warfarin anticoagulation. ",
            actual = data.element?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The PT test evaluates the extrinsic and common pathways of the coagulation cascade.",
            actual = data.element?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Simple",
            actual = data.element?.get(0)?.example?.get(0)?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.0".toDouble(),
            actual = data.element?.get(0)?.example?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-allowedUnits",
            actual = data.element?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "s",
            actual = data.element?.get(0)?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "second",
            actual = data.element?.get(0)?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.element?.get(0)?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.element?.get(0)?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.userSelected?.value
        )

        assertEquals(
            expected = "1.9",
            actual = data.element?.get(0)?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "second",
            actual = data.element?.get(0)?.extension?.get(0)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "loinc",
            actual = data.element?.get(0)?.mapping?.get(0)?.identity
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5964-2",
            actual = data.element?.get(0)?.mapping?.get(0)?.map
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "prothrombin",
            actual = data.element?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This test is orderable. A plasma specimen in a 3.2% sodium citrate blue top tube is required.",
            actual = data.element?.get(0)?.requirements
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "decimal",
            actual = data.element?.get(0)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "prothrombin",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Century Hospital Laboratory",
            actual = data.identifier?.get(0)?.assigner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-05-19",
            actual = data.identifier?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "http://www.CenturyHospital/Laboratory/DirectoryofServices",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Prothrombin Time, PT",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "11",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Version 2.48 or later",
            actual = data.mapping?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "loinc",
            actual = data.mapping?.get(0)?.identity
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC",
            actual = data.mapping?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/",
            actual = data.mapping?.get(0)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Prothrombin Time",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
