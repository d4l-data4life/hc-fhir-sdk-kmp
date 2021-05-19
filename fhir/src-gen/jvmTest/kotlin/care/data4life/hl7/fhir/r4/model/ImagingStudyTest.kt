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
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.ImagingStudyStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImagingStudyTest.java
 *
 * A set of images produced in single study (one or more series of references images)
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series,
 * each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data)
 * acquired or produced in a common context. A series is of only one modality (e.g. X-ray, CT, MR,
 * ultrasound), but a study may have multiple series of different modalities.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImagingStudyTest {

    val parser = FhirR4Parser()

    @Test
    fun testImagingStudy01() {
        // Given
        val sourceJson = loadAsString("r4/imagingstudy-example-xr.json")

        // When
        val data = parser.toFhir(ImagingStudy::class, sourceJson)

        // Then
        assertEquals(
            "ServiceRequest/example",
            data.basedOn?.get(0)?.reference
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "Endpoint/example-wadors",
            data.endpoint?.get(0)?.reference
        )
        assertEquals(
            "example-xr",
            data.id
        )
        assertEquals(
            "urn:dicom:uid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "urn:oid:2.16.124.113543.6003.1154777499.30246.19789.3503430046",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/dicom-organization",
            data.identifier?.get(1)?.assigner?.reference
        )
        assertEquals(
            "ACSN",
            data.identifier?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.identifier?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(1)?.use
        )
        assertEquals(
            "W12342398",
            data.identifier?.get(1)?.value
        )
        assertEquals(
            "Organization/dicom-organization",
            data.identifier?.get(2)?.assigner?.reference
        )
        assertEquals(
            IdentifierUse.SECONDARY,
            data.identifier?.get(2)?.use
        )
        assertEquals(
            "55551234",
            data.identifier?.get(2)?.value
        )
        assertEquals(
            "Practitioner/example",
            data.interpreter?.get(0)?.reference
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
            "DX",
            data.modality?.get(0)?.code
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.modality?.get(0)?.system
        )
        assertEquals(
            "XR Wrist 3+ Views",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2".toLong(),
            data.numberOfInstances?.value
        )
        assertEquals(
            "1".toLong(),
            data.numberOfSeries?.value
        )
        assertEquals(
            "RPID2589",
            data.procedureCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "XR Wrist 3+ Views",
            data.procedureCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.radlex.org",
            data.procedureCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "XR Wrist 3+ Views",
            data.procedureCode?.get(0)?.text
        )
        assertEquals(
            "Procedure/example",
            data.procedureReference?.reference
        )
        assertEquals(
            "357009",
            data.reasonCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Closed fracture of trapezoidal bone of wrist",
            data.reasonCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reasonCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.referrer?.reference
        )
        assertEquals(
            "T-15460",
            data.series?.get(0)?.bodySite?.code
        )
        assertEquals(
            "Wrist Joint",
            data.series?.get(0)?.bodySite?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.series?.get(0)?.bodySite?.system
        )
        assertEquals(
            "XR Wrist 3+ Views",
            data.series?.get(0)?.description
        )
        assertEquals(
            "Endpoint/example-wadors",
            data.series?.get(0)?.endpoint?.get(0)?.reference
        )
        assertEquals(
            "1".toLong(),
            data.series?.get(0)?.instance?.get(0)?.number?.value
        )
        assertEquals(
            "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            data.series?.get(0)?.instance?.get(0)?.sopClass?.code
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.series?.get(0)?.instance?.get(0)?.sopClass?.system
        )
        assertEquals(
            "PA VIEW",
            data.series?.get(0)?.instance?.get(0)?.title
        )
        assertEquals(
            "2.16.124.113543.6003.1154777499.30246.19789.3503430045.1.1",
            data.series?.get(0)?.instance?.get(0)?.uid
        )
        assertEquals(
            "2".toLong(),
            data.series?.get(0)?.instance?.get(1)?.number?.value
        )
        assertEquals(
            "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            data.series?.get(0)?.instance?.get(1)?.sopClass?.code
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.series?.get(0)?.instance?.get(1)?.sopClass?.system
        )
        assertEquals(
            "LL VIEW",
            data.series?.get(0)?.instance?.get(1)?.title
        )
        assertEquals(
            "2.16.124.113543.6003.1154777499.30246.19789.3503430045.1.2",
            data.series?.get(0)?.instance?.get(1)?.uid
        )
        assertEquals(
            "419161000",
            data.series?.get(0)?.laterality?.code
        )
        assertEquals(
            "Unilateral left",
            data.series?.get(0)?.laterality?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.series?.get(0)?.laterality?.system
        )
        assertEquals(
            "DX",
            data.series?.get(0)?.modality?.code
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.series?.get(0)?.modality?.system
        )
        assertEquals(
            "3".toLong(),
            data.series?.get(0)?.number?.value
        )
        assertEquals(
            "2".toLong(),
            data.series?.get(0)?.numberOfInstances?.value
        )
        assertEquals(
            "Practitioner/example",
            data.series?.get(0)?.performer?.get(0)?.actor?.reference
        )
        assertEquals(
            "PRF",
            data.series?.get(0)?.performer?.get(0)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.series?.get(0)?.performer?.get(0)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "2011-01-01T11:01:20+03:00",
            data.series?.get(0)?.started?.value.toString()
        )
        assertEquals(
            "2.16.124.113543.6003.1154777499.30246.19789.3503430045.1",
            data.series?.get(0)?.uid
        )
        assertEquals(
            "2017-01-01T11:01:20+03:00",
            data.started?.value.toString()
        )
        assertEquals(
            ImagingStudyStatus.AVAILABLE,
            data.status
        )
        assertEquals(
            "Patient/dicom",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">XR Wrist 3+ Views. John Smith (MRN: 09236). Accession: W12342398. Performed: 2017-01-01. 1 series, 2 images.</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testImagingStudy02() {
        // Given
        val sourceJson = loadAsString("r4/imagingstudy-example.json")

        // When
        val data = parser.toFhir(ImagingStudy::class, sourceJson)

        // Then
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "urn:dicom:uid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.124.113543.6003.1154777499.30246.19789.3503430045",
            data.identifier?.get(0)?.value
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
            "1".toLong(),
            data.numberOfInstances?.value
        )
        assertEquals(
            "1".toLong(),
            data.numberOfSeries?.value
        )
        assertEquals(
            "67734004",
            data.series?.get(0)?.bodySite?.code
        )
        assertEquals(
            "Upper Trunk Structure",
            data.series?.get(0)?.bodySite?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.series?.get(0)?.bodySite?.system
        )
        assertEquals(
            "CT Surview 180",
            data.series?.get(0)?.description
        )
        assertEquals(
            "1".toLong(),
            data.series?.get(0)?.instance?.get(0)?.number?.value
        )
        assertEquals(
            "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            data.series?.get(0)?.instance?.get(0)?.sopClass?.code
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.series?.get(0)?.instance?.get(0)?.sopClass?.system
        )
        assertEquals(
            "2.16.124.113543.6003.189642796.63084.16748.2599092903",
            data.series?.get(0)?.instance?.get(0)?.uid
        )
        assertEquals(
            "CT",
            data.series?.get(0)?.modality?.code
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.series?.get(0)?.modality?.system
        )
        assertEquals(
            "3".toLong(),
            data.series?.get(0)?.number?.value
        )
        assertEquals(
            "1".toLong(),
            data.series?.get(0)?.numberOfInstances?.value
        )
        assertEquals(
            "2.16.124.113543.6003.2588828330.45298.17418.2723805630",
            data.series?.get(0)?.uid
        )
        assertEquals(
            "2011-01-01T11:01:20+03:00",
            data.started?.value.toString()
        )
        assertEquals(
            ImagingStudyStatus.AVAILABLE,
            data.status
        )
        assertEquals(
            "Patient/dicom",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">CT Chest.  John Smith (MRN: 09236). Accession: W12342398. Performed: 2011-01-01. 3 series, 12 images.</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
