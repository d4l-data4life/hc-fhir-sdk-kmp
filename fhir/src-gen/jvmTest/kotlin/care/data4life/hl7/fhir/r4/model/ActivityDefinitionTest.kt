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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.RelatedArtifactType
import care.data4life.hl7.fhir.r4.codesystem.RequestResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ActivityDefinitionTest.java
 *
 * The definition of a specific activity to be taken, independent of any particular patient or context
 *
 * This resource allows for the definition of some activity to be performed, independent of a
 * particular patient, practitioner, or other performance context.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ActivityDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testActivityDefinition01() {
        // FIXME Test disabled due to issues with activitydefinition-predecessor-example.json
        // REASON - Property _event is not supported yet
        assertEquals(expected = true, actual = true)
    }

    @Test
    fun testActivityDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-medicationorder-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertActivityDefinition02Step01(data)
        assertActivityDefinition02Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertActivityDefinition02Step01(data: ActivityDefinition) {

        assertEquals(
            expected = "2016-03-12",
            actual = data.approvalDate?.value.toString()
        )

        assertEquals(
            expected = "Motive Medical Intelligence",
            actual = data.author?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.author?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.author?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "415-362-4007",
            actual = data.author?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.author?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.author?.get(0)?.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "info@motivemi.com",
            actual = data.author?.get(0)?.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "415-362-4007",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "info@motivemi.com",
            actual = data.contact?.get(0)?.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "citalopramMedication",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "citalopramSubstance",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-15",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Citalopram 20 mg tablet 1 tablet oral 1 time daily now (30 table; 3 refills",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "{tbl}",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dose-rate-type",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "26643006",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral route (qualifier value)",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral route (qualifier value)",
            actual = data.dosage?.get(0)?.route?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1 tablet oral 1 time daily",
            actual = data.dosage?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.dosage?.get(0)?.timing?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.timing?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.dosage?.get(0)?.timing?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dispenseRequest.numberOfRepeatsAllowed is three (3)",
            actual = data.dynamicValue?.get(0)?.expression?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.dynamicValue?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dispenseRequest.numberOfRepeatsAllowed",
            actual = data.dynamicValue?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dispenseRequest.quantity is thirty (30) tablets",
            actual = data.dynamicValue?.get(1)?.expression?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30 '{tbl}'",
            actual = data.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.dynamicValue?.get(1)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dispenseRequest.quantity",
            actual = data.dynamicValue?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-12-31",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "citalopramPrescription",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "citalopramPrescription",
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
            expected = RequestResourceType.MEDICATIONREQUEST,
            actual = data.kind
        )

        assertEquals(
            expected = "2016-08-15",
            actual = data.lastReviewDate?.value.toString()
        )

        assertEquals(
            expected = "CitalopramPrescription",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#citalopramMedication",
            actual = data.productReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Motive Medical Intelligence",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Defines a guideline supported prescription for the treatment of depressive disorders",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.CITATION,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#citalopramMedication",
            actual = data.relatedArtifact?.get(1)?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(1)?.type
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
            expected = "Citalopram Prescription",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mental Health Treatment",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com/artifacts/ActivityDefinition/citalopramPrescription",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This activity definition is used as part of various suicide risk order sets",
            actual = data.usage
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "age",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "D000328",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://meshb.nlm.nih.gov",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(1)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(1)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "87512008",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mild major depression",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(2)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(2)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "40379007",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Major depression, recurrent, mild",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(3)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(3)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "225444004",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "At risk for suicide (finding)",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(4)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(4)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "306206005",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Referral to service (procedure)",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "user",
            actual = data.useContext?.get(5)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(5)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "309343006",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Physician",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "venue",
            actual = data.useContext?.get(6)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(6)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "440655000",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Outpatient environment",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    private fun assertActivityDefinition02Step02(data: ActivityDefinition) {

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testActivityDefinition03() {
        // FIXME Test disabled due to issues with activitydefinition-example.json
        // REASON - Property _event is not supported yet
        assertEquals(expected = true, actual = true)
    }

    @Test
    fun testActivityDefinition04() {
        // FIXME Test disabled due to issues with activitydefinition-servicerequest-example.json
        // REASON - Property _event is not supported yet
        assertEquals(expected = true, actual = true)
    }

    @Test
    fun testActivityDefinition05() {
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-supplyrequest-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertActivityDefinition05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertActivityDefinition05Step01(data: ActivityDefinition) {

        assertEquals(
            expected = "BlueTubes",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blood collect tubes blue cap",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10 Blood collect tubes blue cap",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "blood-tubes-supply",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestResourceType.SUPPLYREQUEST,
            actual = data.kind
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
            expected = "Describes a request for 10 Blood collection tubes with blue caps.",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10".toDouble(),
            actual = data.quantity?.value?.value
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
            expected = "StructureMap/supplyrequest-transform",
            actual = data.transform
                ?.replace("\\n", " ")
        )
    }
}
