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
import care.data4life.hl7.fhir.r4.codesystem.CompositionAttestationMode
import care.data4life.hl7.fhir.r4.codesystem.CompositionStatus
import care.data4life.hl7.fhir.r4.codesystem.DocumentRelationshipType
import care.data4life.hl7.fhir.r4.codesystem.ListMode
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CompositionTest.java
 *
 * A set of resources composed into a single coherent clinical statement with clinical attestation
 *
 * A set of healthcare-related information that is assembled together into a single logical package
 * that provides a single coherent statement of meaning, establishes its own context and that has
 * clinical attestation with regard to who is making the statement. A Composition defines the structure
 * and narrative content necessary for a document. However, a Composition alone does not constitute a
 * document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document,
 * and any other resources referenced from Composition must be included as subsequent entries in the
 * Bundle (for example Patient, Practitioner, Encounter, etc.).
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CompositionTest {

    val parser = FhirR4Parser()

    @Test
    fun testComposition01() {
        // Given
        val sourceJson = loadAsString("r4/composition-example-mixed.json")

        // When
        val data = parser.toFhir(Composition::class, sourceJson)

        // Then
        assertComposition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertComposition01Step01(data: Composition) {

        assertEquals(
            expected = CompositionAttestationMode.LEGAL,
            actual = data.attester?.get(0)?.mode
        )

        assertEquals(
            expected = "Harold Hippocrates, MD",
            actual = data.attester?.get(0)?.party?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.attester?.get(0)?.party?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-01-04T09:10:14Z",
            actual = data.attester?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Harold Hippocrates, MD",
            actual = data.author?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.author?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LP173421-1",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Report",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.confidentiality
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.custodian?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.custodian?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2018-10-30T16:56:04+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "example-mixed",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "newborn",
            actual = data.section?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "New Born Details",
            actual = data.section?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/codes/SectionType",
            actual = data.section?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.section?.get(0)?.text?.status
        )

        assertEquals(
            expected = "Child's Details",
            actual = data.section?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mother",
            actual = data.section?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Mother's Details",
            actual = data.section?.get(1)?.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/codes/SectionType",
            actual = data.section?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.section?.get(1)?.text?.status
        )

        assertEquals(
            expected = "Mpther's Details",
            actual = data.section?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = CompositionStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Tahlia Smith",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/newborn",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Discharge Summary (Neonatal Service)",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "78418-1",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Neonatal perinatal medicine Discharge summary",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testComposition02() {
        // Given
        val sourceJson = loadAsString("r4/composition-example.json")

        // When
        val data = parser.toFhir(Composition::class, sourceJson)

        // Then
        assertComposition02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertComposition02Step01(data: Composition) {

        assertEquals(
            expected = CompositionAttestationMode.LEGAL,
            actual = data.attester?.get(0)?.mode
        )

        assertEquals(
            expected = "Harold Hippocrates, MD",
            actual = data.attester?.get(0)?.party?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.attester?.get(0)?.party?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-01-04T09:10:14Z",
            actual = data.attester?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Harold Hippocrates, MD",
            actual = data.author?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.author?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LP173421-1",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Report",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.confidentiality
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.custodian?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.custodian?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-01-04T09:10:14Z",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Encounter/xcda",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HEALTHREC",
            actual = data.event?.get(0)?.code?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "health record",
            actual = data.event?.get(0)?.code?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.event?.get(0)?.code?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.event?.get(0)?.detail?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-11-12",
            actual = data.event?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2010-07-18",
            actual = data.event?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://healthintersections.com.au/test",
            actual = data.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = DocumentRelationshipType.REPLACES,
            actual = data.relatesTo?.get(0)?.code
        )

        assertEquals(
            expected = "Composition/old-example",
            actual = data.relatesTo?.get(0)?.targetReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = DocumentRelationshipType.APPENDS,
            actual = data.relatesTo?.get(1)?.code
        )

        assertEquals(
            expected = "http://example.org/fhir/NamingSystem/document-ids",
            actual = data.relatesTo?.get(1)?.targetIdentifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ABC123",
            actual = data.relatesTo?.get(1)?.targetIdentifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "11348-0",
            actual = data.section?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "History of past illness Narrative",
            actual = data.section?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.section?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Condition/stroke",
            actual = data.section?.get(0)?.entry?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Condition/example",
            actual = data.section?.get(0)?.entry?.get(1)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Condition/example2",
            actual = data.section?.get(0)?.entry?.get(2)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.section?.get(0)?.mode
        )

        assertEquals(
            expected = "event-date",
            actual = data.section?.get(0)?.orderedBy?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Sorted by Event Date",
            actual = data.section?.get(0)?.orderedBy?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/list-order",
            actual = data.section?.get(0)?.orderedBy?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.section?.get(0)?.text?.status
        )

        assertEquals(
            expected = "History of present illness",
            actual = data.section?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "10157-6",
            actual = data.section?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "History of family member diseases Narrative",
            actual = data.section?.get(1)?.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.section?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "withheld",
            actual = data.section?.get(1)?.emptyReason?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Information Withheld",
            actual = data.section?.get(1)?.emptyReason?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/list-empty-reason",
            actual = data.section?.get(1)?.emptyReason?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ListMode.SNAPSHOT,
            actual = data.section?.get(1)?.mode
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.section?.get(1)?.text?.status
        )

        assertEquals(
            expected = "History of family member diseases",
            actual = data.section?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = CompositionStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Henry Levin the 7th",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Consultation Note",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "11488-4",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Consult note",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }
}
