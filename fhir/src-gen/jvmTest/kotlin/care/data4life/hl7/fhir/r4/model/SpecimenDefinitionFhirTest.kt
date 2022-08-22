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
import care.data4life.hl7.fhir.r4.codesystem.SpecimenContainedPreference
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * SpecimenDefinitionTest.java
 *
 * Kind of specimen
 *
 * A kind of specimen with associated set of requirements.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SpecimenDefinitionFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testSpecimenDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/specimendefinition-example-serum-plasma.json")

        // When
        val data = parser.toFhir(SpecimenDefinition::class, sourceJson)

        // Then
        assertSpecimenDefinition01Step01(data)
        assertSpecimenDefinition01Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSpecimenDefinition01Step01(data: SpecimenDefinition) {
        assertEquals(
            expected = "2364",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12 hour fasting",
            actual = data.patientPreparation?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "263678003",
            actual = data.patientPreparation?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "At rest",
            actual = data.patientPreparation?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.patientPreparation?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "preferrably morning time",
            actual = data.timeAspect
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "122555007",
            actual = data.typeCollected?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Venous blood specimen",
            actual = data.typeCollected?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeCollected?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "yellow",
            actual = data.typeTested?.get(0)?.container?.cap?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "yellow cap",
            actual = data.typeTested?.get(0)?.container?.cap?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:6710:2017",
            actual = data.typeTested?.get(0)?.container?.cap?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "61088005",
            actual = data.typeTested?.get(0)?.container?.material?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "plastic",
            actual = data.typeTested?.get(0)?.container?.material?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeTested?.get(0)?.container?.material?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ml",
            actual = data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.value?.value
        )

        assertEquals(
            expected = "702281005",
            actual = data.typeTested?.get(0)?.container?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evacuated blood collection tube, thrombin/clot activator/gel separator",
            actual = data.typeTested?.get(0)?.container?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeTested?.get(0)?.container?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "minute",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "60".toDouble(),
            actual = data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.value?.value
        )

        assertEquals(
            expected = "Ambient temperature",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureQualifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "25".toDouble(),
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.value?.value
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15".toDouble(),
            actual = data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.value?.value
        )

        assertEquals(
            expected = "h",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hour",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8".toDouble(),
            actual = data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.value?.value
        )

        assertEquals(
            expected = "Refrigerated temperature",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureQualifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8".toDouble(),
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.value?.value
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.value?.value
        )

        assertEquals(
            expected = SpecimenContainedPreference.PREFERRED,
            actual = data.typeTested?.get(0)?.preference
        )

        assertEquals(
            expected = "119364003",
            actual = data.typeTested?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum specimen",
            actual = data.typeTested?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeTested?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "green",
            actual = data.typeTested?.get(1)?.container?.cap?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "green cap",
            actual = data.typeTested?.get(1)?.container?.cap?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:6710:2017",
            actual = data.typeTested?.get(1)?.container?.cap?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "32039001",
            actual = data.typeTested?.get(1)?.container?.material?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "glass",
            actual = data.typeTested?.get(1)?.container?.material?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeTested?.get(1)?.container?.material?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ml",
            actual = data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.value?.value
        )

        assertEquals(
            expected = "767390000",
            actual = data.typeTested?.get(1)?.container?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evacuated blood collection tube with heparin lithium and gel separator",
            actual = data.typeTested?.get(1)?.container?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeTested?.get(1)?.container?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "minute",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "60".toDouble(),
            actual = data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.value?.value
        )

        assertEquals(
            expected = "Ambient temperature",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureQualifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "25".toDouble(),
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.value?.value
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15".toDouble(),
            actual = data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.value?.value
        )

        assertEquals(
            expected = "h",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hour",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8".toDouble(),
            actual = data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.value?.value
        )

        assertEquals(
            expected = "Refrigerated temperature",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureQualifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8".toDouble(),
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.value?.value
        )

        assertEquals(
            expected = "Cel",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "°C",
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.value?.value
        )

        assertEquals(
            expected = SpecimenContainedPreference.ALTERNATE,
            actual = data.typeTested?.get(1)?.preference
        )

        assertEquals(
            expected = "insufficient",
            actual = data.typeTested?.get(1)?.rejectionCriterion?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "insufficient specimen volume",
            actual = data.typeTested?.get(1)?.rejectionCriterion?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/rejection-criteria",
            actual = data.typeTested?.get(1)?.rejectionCriterion?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hemolized",
            actual = data.typeTested?.get(1)?.rejectionCriterion?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )
    }

    private fun assertSpecimenDefinition01Step02(data: SpecimenDefinition) {
        assertEquals(
            expected = "hemolized specimen",
            actual = data.typeTested?.get(1)?.rejectionCriterion?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/rejection-criteria",
            actual = data.typeTested?.get(1)?.rejectionCriterion?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "119361006",
            actual = data.typeTested?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Plasma specimen",
            actual = data.typeTested?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.typeTested?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
