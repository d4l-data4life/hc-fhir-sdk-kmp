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
import care.data4life.hl7.fhir.r4.codesystem.ActionParticipantType
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
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-predecessor-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertEquals(
            "2016-03-12",
            data.approvalDate?.value.toString()
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.author?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.author?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.author?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.author?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.author?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "306206005",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Referral to service (procedure)",
            data.code?.text
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.contact?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            data.copyright
        )
        assertEquals(
            "2017-03-03T14:06:00Z",
            data.date?.value.toString()
        )
        assertEquals(
            "refer to primary care mental-health integrated care program for evaluation and treatment of mental health conditions now",
            data.description
        )
        assertEquals(
            "2017-12-31",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2016-01-01",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "referralPrimaryCareMentalHealth-initial",
            data.id
        )
        assertEquals(
            "http://motivemi.com/artifacts",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "referralPrimaryCareMentalHealth",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            RequestResourceType.SERVICEREQUEST,
            data.kind
        )
        assertEquals(
            "2016-08-15",
            data.lastReviewDate?.value.toString()
        )
        assertEquals(
            "ReferralPrimaryCareMentalHealth",
            data.name
        )
        assertEquals(
            ActionParticipantType.PRACTITIONER,
            data.participant?.get(0)?.type
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.publisher
        )
        assertEquals(
            "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.CITATION,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "ActivityDefinition/referralPrimaryCareMentalHealth",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.SUCCESSOR,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            PublicationStatus.RETIRED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Referral to Primary Care Mental Health",
            data.title
        )
        assertEquals(
            "Mental Health Referral",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "http://motivemi.com/artifacts/ActivityDefinition/referralPrimaryCareMentalHealth",
            data.url
        )
        assertEquals(
            "age",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "D000328",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "https://meshb.nlm.nih.gov",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "87512008",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Mild major depression",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(2)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(2)?.code?.system
        )
        assertEquals(
            "40379007",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Major depression, recurrent, mild",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(3)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(3)?.code?.system
        )
        assertEquals(
            "225444004",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "At risk for suicide (finding)",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(4)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(4)?.code?.system
        )
        assertEquals(
            "306206005",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Referral to service (procedure)",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "user",
            data.useContext?.get(5)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(5)?.code?.system
        )
        assertEquals(
            "309343006",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Physician",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "venue",
            data.useContext?.get(6)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(6)?.code?.system
        )
        assertEquals(
            "440655000",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Outpatient environment",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "1.0.0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testActivityDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-medicationorder-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertEquals(
            "2016-03-12",
            data.approvalDate?.value.toString()
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.author?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.author?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.author?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.author?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.author?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.contact?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "citalopramMedication",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "citalopramSubstance",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            data.copyright
        )
        assertEquals(
            "2015-08-15",
            data.date?.value.toString()
        )
        assertEquals(
            "Citalopram 20 mg tablet 1 tablet oral 1 time daily now (30 table; 3 refills",
            data.description
        )
        assertEquals(
            "{tbl}",
            data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value
        )
        assertEquals(
            "ordered",
            data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Ordered",
            data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/dose-rate-type",
            data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "26643006",
            data.dosage?.get(0)?.route?.coding?.get(0)?.code
        )
        assertEquals(
            "Oral route (qualifier value)",
            data.dosage?.get(0)?.route?.coding?.get(0)?.display
        )
        assertEquals(
            "Oral route (qualifier value)",
            data.dosage?.get(0)?.route?.text
        )
        assertEquals(
            "1 tablet oral 1 time daily",
            data.dosage?.get(0)?.text
        )
        assertEquals(
            "1".toLong(),
            data.dosage?.get(0)?.timing?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.dosage?.get(0)?.timing?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.dosage?.get(0)?.timing?.repeat?.periodUnit
        )
        assertEquals(
            "dispenseRequest.numberOfRepeatsAllowed is three (3)",
            data.dynamicValue?.get(0)?.expression?.description
        )
        assertEquals(
            "3",
            data.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "dispenseRequest.numberOfRepeatsAllowed",
            data.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "dispenseRequest.quantity is thirty (30) tablets",
            data.dynamicValue?.get(1)?.expression?.description
        )
        assertEquals(
            "30 '{tbl}'",
            data.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "dispenseRequest.quantity",
            data.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "2017-12-31",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2016-01-01",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "citalopramPrescription",
            data.id
        )
        assertEquals(
            "http://motivemi.com",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "citalopramPrescription",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            RequestResourceType.MEDICATIONREQUEST,
            data.kind
        )
        assertEquals(
            "2016-08-15",
            data.lastReviewDate?.value.toString()
        )
        assertEquals(
            "CitalopramPrescription",
            data.name
        )
        assertEquals(
            "#citalopramMedication",
            data.productReference?.reference
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.publisher
        )
        assertEquals(
            "Defines a guideline supported prescription for the treatment of depressive disorders",
            data.purpose
        )
        assertEquals(
            "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.CITATION,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "#citalopramMedication",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Citalopram Prescription",
            data.title
        )
        assertEquals(
            "Mental Health Treatment",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "http://motivemi.com/artifacts/ActivityDefinition/citalopramPrescription",
            data.url
        )
        assertEquals(
            "This activity definition is used as part of various suicide risk order sets",
            data.usage
        )
        assertEquals(
            "age",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "D000328",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "https://meshb.nlm.nih.gov",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "87512008",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Mild major depression",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(2)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(2)?.code?.system
        )
        assertEquals(
            "40379007",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Major depression, recurrent, mild",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(3)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(3)?.code?.system
        )
        assertEquals(
            "225444004",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "At risk for suicide (finding)",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(4)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(4)?.code?.system
        )
        assertEquals(
            "306206005",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Referral to service (procedure)",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "user",
            data.useContext?.get(5)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(5)?.code?.system
        )
        assertEquals(
            "309343006",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Physician",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "venue",
            data.useContext?.get(6)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(6)?.code?.system
        )
        assertEquals(
            "440655000",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Outpatient environment",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "1.0.0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testActivityDefinition03() {
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertEquals(
            "2017-03-01",
            data.approvalDate?.value.toString()
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.author?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.author?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.author?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.author?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.author?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "306206005",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Referral to service (procedure)",
            data.code?.text
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.contact?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            data.copyright
        )
        assertEquals(
            "2017-03-03T14:06:00Z",
            data.date?.value.toString()
        )
        assertEquals(
            "refer to primary care mental-health integrated care program for evaluation and treatment of mental health conditions now",
            data.description
        )
        assertEquals(
            "2017-12-31",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2017-03-01",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "referralPrimaryCareMentalHealth",
            data.id
        )
        assertEquals(
            "http://motivemi.com/artifacts",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "referralPrimaryCareMentalHealth",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            RequestResourceType.SERVICEREQUEST,
            data.kind
        )
        assertEquals(
            "2017-03-01",
            data.lastReviewDate?.value.toString()
        )
        assertEquals(
            "ReferralPrimaryCareMentalHealth",
            data.name
        )
        assertEquals(
            ActionParticipantType.PRACTITIONER,
            data.participant?.get(0)?.type
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.publisher
        )
        assertEquals(
            "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.CITATION,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "ActivityDefinition/referralPrimaryCareMentalHealth-initial",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.PREDECESSOR,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Referral to Primary Care Mental Health",
            data.title
        )
        assertEquals(
            "Mental Health Referral",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "http://motivemi.com/artifacts/ActivityDefinition/referralPrimaryCareMentalHealth",
            data.url
        )
        assertEquals(
            "age",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "D000328",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "https://meshb.nlm.nih.gov",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "87512008",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Mild major depression",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(2)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(2)?.code?.system
        )
        assertEquals(
            "40379007",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Major depression, recurrent, mild",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(3)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(3)?.code?.system
        )
        assertEquals(
            "225444004",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "At risk for suicide (finding)",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(4)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(4)?.code?.system
        )
        assertEquals(
            "306206005",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Referral to service (procedure)",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "user",
            data.useContext?.get(5)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(5)?.code?.system
        )
        assertEquals(
            "309343006",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Physician",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "venue",
            data.useContext?.get(6)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(6)?.code?.system
        )
        assertEquals(
            "440655000",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Outpatient environment",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "1.1.0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testActivityDefinition04() {
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-servicerequest-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertEquals(
            "17401000",
            data.bodySite?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Heart valve structure",
            data.bodySite?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.bodySite?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "34068001",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Heart valve replacement",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Heart valve replacement",
            data.description
        )
        assertEquals(
            "heart-valve-replacement",
            data.id
        )
        assertEquals(
            RequestResourceType.SERVICEREQUEST,
            data.kind
        )
        assertEquals(
            "Location/1",
            data.location?.reference
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
            "207RI0011X",
            data.participant?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "Interventional Cardiology",
            data.participant?.get(0)?.role?.coding?.get(0)?.display
        )
        assertEquals(
            "http://nucc.org/provider-taxonomy",
            data.participant?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "Interventional Cardiology",
            data.participant?.get(0)?.role?.text
        )
        assertEquals(
            ActionParticipantType.PRACTITIONER,
            data.participant?.get(0)?.type
        )
        assertEquals(
            "Describes the proposal to perform a Heart Valve replacement.",
            data.purpose
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "34068001",
            data.topic?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Heart valve replacement",
            data.topic?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.topic?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "age",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "D000328",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "https://meshb.nlm.nih.gov",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "user",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "309343006",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Physician",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testActivityDefinition05() {
        // Given
        val sourceJson = loadAsString("r4/activitydefinition-supplyrequest-example.json")

        // When
        val data = parser.toFhir(ActivityDefinition::class, sourceJson)

        // Then
        assertEquals(
            "BlueTubes",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Blood collect tubes blue cap",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "10 Blood collect tubes blue cap",
            data.description
        )
        assertEquals(
            "blood-tubes-supply",
            data.id
        )
        assertEquals(
            RequestResourceType.SUPPLYREQUEST,
            data.kind
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
            "Describes a request for 10 Blood collection tubes with blue caps.",
            data.purpose
        )
        assertEquals(
            "10".toDouble(),
            data.quantity?.value?.value
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "StructureMap/supplyrequest-transform",
            data.transform
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
