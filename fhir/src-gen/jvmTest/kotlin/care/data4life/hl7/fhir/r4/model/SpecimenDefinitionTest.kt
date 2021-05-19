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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
class SpecimenDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testSpecimenDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/specimendefinition-example-serum-plasma.json")

        // When
        val data = parser.toFhir(SpecimenDefinition::class, sourceJson)

        // Then
        assertEquals(
            "2364",
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
            "12 hour fasting",
            data.patientPreparation?.get(0)?.text
        )
        assertEquals(
            "263678003",
            data.patientPreparation?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "At rest",
            data.patientPreparation?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.patientPreparation?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "preferrably morning time",
            data.timeAspect
        )
        assertEquals(
            "122555007",
            data.typeCollected?.coding?.get(0)?.code
        )
        assertEquals(
            "Venous blood specimen",
            data.typeCollected?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeCollected?.coding?.get(0)?.system
        )
        assertEquals(
            "yellow",
            data.typeTested?.get(0)?.container?.cap?.coding?.get(0)?.code
        )
        assertEquals(
            "yellow cap",
            data.typeTested?.get(0)?.container?.cap?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:6710:2017",
            data.typeTested?.get(0)?.container?.cap?.coding?.get(0)?.system
        )
        assertEquals(
            "61088005",
            data.typeTested?.get(0)?.container?.material?.coding?.get(0)?.code
        )
        assertEquals(
            "plastic",
            data.typeTested?.get(0)?.container?.material?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeTested?.get(0)?.container?.material?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.system
        )
        assertEquals(
            "ml",
            data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.unit
        )
        assertEquals(
            "2".toDouble(),
            data.typeTested?.get(0)?.container?.minimumVolumeQuantity?.value?.value
        )
        assertEquals(
            "702281005",
            data.typeTested?.get(0)?.container?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Evacuated blood collection tube, thrombin/clot activator/gel separator",
            data.typeTested?.get(0)?.container?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeTested?.get(0)?.container?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "min",
            data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.system
        )
        assertEquals(
            "minute",
            data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.unit
        )
        assertEquals(
            "60".toDouble(),
            data.typeTested?.get(0)?.handling?.get(0)?.maxDuration?.value?.value
        )
        assertEquals(
            "Ambient temperature",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureQualifier?.text
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.unit
        )
        assertEquals(
            "25".toDouble(),
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.high?.value?.value
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.unit
        )
        assertEquals(
            "15".toDouble(),
            data.typeTested?.get(0)?.handling?.get(0)?.temperatureRange?.low?.value?.value
        )
        assertEquals(
            "h",
            data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.system
        )
        assertEquals(
            "hour",
            data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.unit
        )
        assertEquals(
            "8".toDouble(),
            data.typeTested?.get(0)?.handling?.get(1)?.maxDuration?.value?.value
        )
        assertEquals(
            "Refrigerated temperature",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureQualifier?.text
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.unit
        )
        assertEquals(
            "8".toDouble(),
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.high?.value?.value
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.unit
        )
        assertEquals(
            "2".toDouble(),
            data.typeTested?.get(0)?.handling?.get(1)?.temperatureRange?.low?.value?.value
        )
        assertEquals(
            SpecimenContainedPreference.PREFERRED,
            data.typeTested?.get(0)?.preference
        )
        assertEquals(
            "119364003",
            data.typeTested?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Serum specimen",
            data.typeTested?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeTested?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "green",
            data.typeTested?.get(1)?.container?.cap?.coding?.get(0)?.code
        )
        assertEquals(
            "green cap",
            data.typeTested?.get(1)?.container?.cap?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:6710:2017",
            data.typeTested?.get(1)?.container?.cap?.coding?.get(0)?.system
        )
        assertEquals(
            "32039001",
            data.typeTested?.get(1)?.container?.material?.coding?.get(0)?.code
        )
        assertEquals(
            "glass",
            data.typeTested?.get(1)?.container?.material?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeTested?.get(1)?.container?.material?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.system
        )
        assertEquals(
            "ml",
            data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.unit
        )
        assertEquals(
            "2".toDouble(),
            data.typeTested?.get(1)?.container?.minimumVolumeQuantity?.value?.value
        )
        assertEquals(
            "767390000",
            data.typeTested?.get(1)?.container?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Evacuated blood collection tube with heparin lithium and gel separator",
            data.typeTested?.get(1)?.container?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeTested?.get(1)?.container?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "min",
            data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.system
        )
        assertEquals(
            "minute",
            data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.unit
        )
        assertEquals(
            "60".toDouble(),
            data.typeTested?.get(1)?.handling?.get(0)?.maxDuration?.value?.value
        )
        assertEquals(
            "Ambient temperature",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureQualifier?.text
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.unit
        )
        assertEquals(
            "25".toDouble(),
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.high?.value?.value
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.unit
        )
        assertEquals(
            "15".toDouble(),
            data.typeTested?.get(1)?.handling?.get(0)?.temperatureRange?.low?.value?.value
        )
        assertEquals(
            "h",
            data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.system
        )
        assertEquals(
            "hour",
            data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.unit
        )
        assertEquals(
            "8".toDouble(),
            data.typeTested?.get(1)?.handling?.get(1)?.maxDuration?.value?.value
        )
        assertEquals(
            "Refrigerated temperature",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureQualifier?.text
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.unit
        )
        assertEquals(
            "8".toDouble(),
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.high?.value?.value
        )
        assertEquals(
            "Cel",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.system
        )
        assertEquals(
            "°C",
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.unit
        )
        assertEquals(
            "2".toDouble(),
            data.typeTested?.get(1)?.handling?.get(1)?.temperatureRange?.low?.value?.value
        )
        assertEquals(
            SpecimenContainedPreference.ALTERNATE,
            data.typeTested?.get(1)?.preference
        )
        assertEquals(
            "insufficient",
            data.typeTested?.get(1)?.rejectionCriterion?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "insufficient specimen volume",
            data.typeTested?.get(1)?.rejectionCriterion?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/rejection-criteria",
            data.typeTested?.get(1)?.rejectionCriterion?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "hemolized",
            data.typeTested?.get(1)?.rejectionCriterion?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "hemolized specimen",
            data.typeTested?.get(1)?.rejectionCriterion?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/rejection-criteria",
            data.typeTested?.get(1)?.rejectionCriterion?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "119361006",
            data.typeTested?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Plasma specimen",
            data.typeTested?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.typeTested?.get(1)?.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
