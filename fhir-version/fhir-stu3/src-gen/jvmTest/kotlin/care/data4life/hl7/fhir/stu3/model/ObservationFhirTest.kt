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
import care.data4life.hl7.fhir.stu3.codesystem.ObservationRelationshipType
import care.data4life.hl7.fhir.stu3.codesystem.ObservationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ObservationTest.java
 *
 * Measurements and simple assertions
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ObservationFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testObservation01() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-genetics-1.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation01Step01(data: Observation) {
        assertEquals(
            expected = "55233-1",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genetic analysis master panel-- This is the parent OBR for the panel holding all of the associated observations that can be reported with a molecular genetics analysis result.",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsDNASequenceVariantName",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NG_007726.3:g.146252T>G",
            actual = data.extension?.get(0)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsGene",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3236",
            actual = data.extension?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EGFR",
            actual = data.extension?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.genenames.org",
            actual = data.extension?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsDNARegionName",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Exon 21",
            actual = data.extension?.get(2)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsGenomicSourceClass",
            actual = data.extension?.get(3)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LA6684-0",
            actual = data.extension?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "somatic",
            actual = data.extension?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.extension?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-genetics-1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-04-03T15:30:10+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Molecular Diagnostics Laboratory",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Molecular Specimen ID: MLD45-Z4-1234",
            actual = data.specimen?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen/genetics-example1-somatic",
            actual = data.specimen?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Molecular Lab Patient ID: HOSP-23456",
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

        assertEquals(
            expected = "10828004",
            actual = data.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Positive",
            actual = data.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testObservation02() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-bmd.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation02Step01(data: Observation) {
        assertEquals(
            expected = "71341001:272741003=7771000",
            actual = data.bodySite?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Left Femur",
            actual = data.bodySite?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24701-5",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Femur DXA Bone density",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BMD - Left Femur",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bmd",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Imaging Diagnostics",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "g/cm-2",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g/cm²",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.887".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }

    @Test
    fun testObservation03() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-respiratory-rate.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation03Step01(data: Observation) {
        assertEquals(
            expected = "vital-signs",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/observation-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9279-1",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Respiratory rate",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Respiratory rate",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1999-07-02",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "respiratory-rate",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/vitalsigns",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "/min",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "breaths/minute",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "26".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }

    @Test
    fun testObservation04() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation04Step01(data: Observation) {
        assertEquals(
            expected = "vital-signs",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/observation-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "29463-7",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body Weight",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3141-9",
            actual = data.code?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body weight Measured",
            actual = data.code?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "27113001",
            actual = data.code?.coding?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body weight",
            actual = data.code?.coding?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "body-weight",
            actual = data.code?.coding?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body Weight",
            actual = data.code?.coding?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/devices/clinical-codes",
            actual = data.code?.coding?.get(3)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-03-28",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "[lb_av]",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lbs",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "185".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }

    @Test
    fun testObservation05() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-haplotype2.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation05Step01(data: Observation) {
        assertEquals(
            expected = "55233-1",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genetic analysis master panel-- This is the parent OBR for the panel holding all of the associated observations that can be reported with a molecular genetics analysis result.",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsGene",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2623",
            actual = data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CYP2C9",
            actual = data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.genenames.org",
            actual = data.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsSequence",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sequence/example-sequence1",
            actual = data.extension?.get(1)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/observation-geneticsSequence",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sequence/example-sequence2",
            actual = data.extension?.get(2)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-haplotype2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-04-03T15:30:10+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Sequence/example-pgx-1",
            actual = data.related?.get(0)?.target?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationRelationshipType.DERIVED_FROM,
            actual = data.related?.get(0)?.type
        )

        assertEquals(
            expected = "Sequence/example-pgx-2",
            actual = data.related?.get(1)?.target?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationRelationshipType.DERIVED_FROM,
            actual = data.related?.get(1)?.type
        )

        assertEquals(
            expected = "Molecular Specimen ID: MLD45-Z4-1234",
            actual = data.specimen?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen/genetics-example1-somatic",
            actual = data.specimen?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.UNKNOWN,
            actual = data.status
        )

        assertEquals(
            expected = "J*********** C***********",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/727127",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "PA16581679",
            actual = data.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "*4",
            actual = data.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://pharmakb.org",
            actual = data.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testObservation06() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-mbp.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation06Step01(data: Observation) {
        assertEquals(
            expected = "vital-signs",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/observation-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8478-0",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mean blood pressure",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mean blood pressure",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1999-07-02",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "mbp",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "mm[Hg]",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mm[Hg]",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }

    @Test
    fun testObservation07() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-bmi.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation07Step01(data: Observation) {
        assertEquals(
            expected = "vital-signs",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/observation-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "39156-5",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body mass index (BMI) [Ratio]",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BMI",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1999-07-02",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "bmi",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/vitalsigns",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "kg/m2",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "kg/m2",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "16.2".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }

    @Test
    fun testObservation08() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-body-height.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation08Step01(data: Observation) {
        assertEquals(
            expected = "vital-signs",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/observation-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8302-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body height",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body height",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1999-07-02",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "body-height",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/vitalsigns",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "[in_i]",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "66.89999999999999".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }

    @Test
    fun testObservation09() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-eye-color.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation09Step01(data: Observation) {
        assertEquals(
            expected = "eye color",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-05-18",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "eye-color",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "blue",
            actual = data.valueString
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testObservation10() {
        // Given
        val sourceJson = loadAsString("stu3/observation-example-body-temperature.json")

        // When
        val data = parser.toFhir(Observation::class, sourceJson)

        // Then
        assertObservation10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertObservation10Step01(data: Observation) {
        assertEquals(
            expected = "vital-signs",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/observation-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vital Signs",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8310-5",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body temperature",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body temperature",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1999-07-02",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "body-temperature",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/vitalsigns",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
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

        assertEquals(
            expected = "Cel",
            actual = data.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C",
            actual = data.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "36.5".toDouble(),
            actual = data.valueQuantity?.value?.value
        )
    }
}
