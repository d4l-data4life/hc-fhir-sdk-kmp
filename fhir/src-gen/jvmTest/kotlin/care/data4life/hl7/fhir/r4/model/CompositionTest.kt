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
        assertEquals(
            CompositionAttestationMode.LEGAL,
            data.attester?.get(0)?.mode
        )
        assertEquals(
            "Harold Hippocrates, MD",
            data.attester?.get(0)?.party?.display
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.attester?.get(0)?.party?.reference
        )
        assertEquals(
            "2012-01-04T09:10:14Z",
            data.attester?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Harold Hippocrates, MD",
            data.author?.get(0)?.display
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.author?.get(0)?.reference
        )
        assertEquals(
            "LP173421-1",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Report",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "N",
            data.confidentiality
        )
        assertEquals(
            "Good Health Clinic",
            data.custodian?.display
        )
        assertEquals(
            "Organization/2.16.840.1.113883.19.5",
            data.custodian?.reference
        )
        assertEquals(
            "2018-10-30T16:56:04+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "example-mixed",
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
            "newborn",
            data.section?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "New Born Details",
            data.section?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://acme.org/codes/SectionType",
            data.section?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.section?.get(0)?.text?.status
        )
        assertEquals(
            "Child's Details",
            data.section?.get(0)?.title
        )
        assertEquals(
            "mother",
            data.section?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Mother's Details",
            data.section?.get(1)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://acme.org/codes/SectionType",
            data.section?.get(1)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.section?.get(1)?.text?.status
        )
        assertEquals(
            "Mpther's Details",
            data.section?.get(1)?.title
        )
        assertEquals(
            CompositionStatus.FINAL,
            data.status
        )
        assertEquals(
            "Tahlia Smith",
            data.subject?.display
        )
        assertEquals(
            "Patient/newborn",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Discharge Summary (Neonatal Service)",
            data.title
        )
        assertEquals(
            "78418-1",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Neonatal perinatal medicine Discharge summary",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testComposition02() {
        // Given
        val sourceJson = loadAsString("r4/composition-example.json")

        // When
        val data = parser.toFhir(Composition::class, sourceJson)

        // Then
        assertEquals(
            CompositionAttestationMode.LEGAL,
            data.attester?.get(0)?.mode
        )
        assertEquals(
            "Harold Hippocrates, MD",
            data.attester?.get(0)?.party?.display
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.attester?.get(0)?.party?.reference
        )
        assertEquals(
            "2012-01-04T09:10:14Z",
            data.attester?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "Harold Hippocrates, MD",
            data.author?.get(0)?.display
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.author?.get(0)?.reference
        )
        assertEquals(
            "LP173421-1",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Report",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "N",
            data.confidentiality
        )
        assertEquals(
            "Good Health Clinic",
            data.custodian?.display
        )
        assertEquals(
            "Organization/2.16.840.1.113883.19.5",
            data.custodian?.reference
        )
        assertEquals(
            "2012-01-04T09:10:14Z",
            data.date?.value.toString()
        )
        assertEquals(
            "Encounter/xcda",
            data.encounter?.reference
        )
        assertEquals(
            "HEALTHREC",
            data.event?.get(0)?.code?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "health record",
            data.event?.get(0)?.code?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.event?.get(0)?.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Observation/example",
            data.event?.get(0)?.detail?.get(0)?.reference
        )
        assertEquals(
            "2012-11-12",
            data.event?.get(0)?.period?.end?.value.toString()
        )
        assertEquals(
            "2010-07-18",
            data.event?.get(0)?.period?.start?.value.toString()
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://healthintersections.com.au/test",
            data.identifier?.system
        )
        assertEquals(
            "1",
            data.identifier?.value
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
            DocumentRelationshipType.REPLACES,
            data.relatesTo?.get(0)?.code
        )
        assertEquals(
            "Composition/old-example",
            data.relatesTo?.get(0)?.targetReference?.reference
        )
        assertEquals(
            DocumentRelationshipType.APPENDS,
            data.relatesTo?.get(1)?.code
        )
        assertEquals(
            "http://example.org/fhir/NamingSystem/document-ids",
            data.relatesTo?.get(1)?.targetIdentifier?.system
        )
        assertEquals(
            "ABC123",
            data.relatesTo?.get(1)?.targetIdentifier?.value
        )
        assertEquals(
            "11348-0",
            data.section?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "History of past illness Narrative",
            data.section?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.section?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Condition/stroke",
            data.section?.get(0)?.entry?.get(0)?.reference
        )
        assertEquals(
            "Condition/example",
            data.section?.get(0)?.entry?.get(1)?.reference
        )
        assertEquals(
            "Condition/example2",
            data.section?.get(0)?.entry?.get(2)?.reference
        )
        assertEquals(
            ListMode.SNAPSHOT,
            data.section?.get(0)?.mode
        )
        assertEquals(
            "event-date",
            data.section?.get(0)?.orderedBy?.coding?.get(0)?.code
        )
        assertEquals(
            "Sorted by Event Date",
            data.section?.get(0)?.orderedBy?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/list-order",
            data.section?.get(0)?.orderedBy?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.section?.get(0)?.text?.status
        )
        assertEquals(
            "History of present illness",
            data.section?.get(0)?.title
        )
        assertEquals(
            "10157-6",
            data.section?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "History of family member diseases Narrative",
            data.section?.get(1)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.section?.get(1)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "withheld",
            data.section?.get(1)?.emptyReason?.coding?.get(0)?.code
        )
        assertEquals(
            "Information Withheld",
            data.section?.get(1)?.emptyReason?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/list-empty-reason",
            data.section?.get(1)?.emptyReason?.coding?.get(0)?.system
        )
        assertEquals(
            ListMode.SNAPSHOT,
            data.section?.get(1)?.mode
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.section?.get(1)?.text?.status
        )
        assertEquals(
            "History of family member diseases",
            data.section?.get(1)?.title
        )
        assertEquals(
            CompositionStatus.FINAL,
            data.status
        )
        assertEquals(
            "Henry Levin the 7th",
            data.subject?.display
        )
        assertEquals(
            "Patient/xcda",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Consultation Note",
            data.title
        )
        assertEquals(
            "11488-4",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Consult note",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
