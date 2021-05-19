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
import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MediaTest.java
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MediaTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedia01() {
        // Given
        val sourceJson = loadAsString("r4/media-example.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertEquals(
            "image/gif",
            data.content?.contentType
        )
        assertEquals(
            "2009-09-03",
            data.content?.creation?.value.toString()
        )
        assertEquals(
            "a1",
            data.content?.id
        )
        assertEquals(
            "2017-12-17",
            data.createdDateTime?.value.toString()
        )
        assertEquals(
            "Acme Camera",
            data.device?.display
        )
        assertEquals(
            "1".toLong(),
            data.frames?.value
        )
        assertEquals(
            "145".toLong(),
            data.height?.value
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "2017-12-17T14:56:18Z",
            data.issued?.value.toString()
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
            "diagram",
            data.modality?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/media-modality",
            data.modality?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.operator?.reference
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
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
            "image",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Image",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/media-type",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "126".toLong(),
            data.width?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMedia02() {
        // Given
        val sourceJson = loadAsString("r4/media-example-dicom.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertEquals(
            "application/dicom",
            data.content?.contentType
        )
        assertEquals(
            "G.E. Medical Systems",
            data.device?.display
        )
        assertEquals(
            "http://nema.org/fhir/extensions#0002-0010",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "urn:oid:1.2.840.10008.1.2.1",
            data.extension?.get(0)?.valueUri
        )
        assertEquals(
            "480".toLong(),
            data.height?.value
        )
        assertEquals(
            "1.2.840.11361907579238403408700.3.1.04.19970327150033",
            data.id
        )
        assertEquals(
            "urn:dicom:uid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "InstanceUID",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "urn:oid:1.2.840.11361907579238403408700.3.1.04.19970327150033",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://acme-imaging.com/accession/2012",
            data.identifier?.get(1)?.system
        )
        assertEquals(
            "accessionNo",
            data.identifier?.get(1)?.type?.text
        )
        assertEquals(
            "1234567",
            data.identifier?.get(1)?.value
        )
        assertEquals(
            "urn:dicom:uid",
            data.identifier?.get(2)?.system
        )
        assertEquals(
            "studyId",
            data.identifier?.get(2)?.type?.text
        )
        assertEquals(
            "urn:oid:1.2.840.113619.2.21.848.34082.0.538976288.3",
            data.identifier?.get(2)?.value
        )
        assertEquals(
            "urn:dicom:uid",
            data.identifier?.get(3)?.system
        )
        assertEquals(
            "seriesId",
            data.identifier?.get(3)?.type?.text
        )
        assertEquals(
            "urn:oid:1.2.840.113619.2.21.3408.700.0.757923840.3.0",
            data.identifier?.get(3)?.value
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
            "US",
            data.modality?.coding?.get(0)?.code
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.modality?.coding?.get(0)?.system
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "399067008",
            data.view?.coding?.get(0)?.code
        )
        assertEquals(
            "Lateral projection",
            data.view?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.view?.coding?.get(0)?.system
        )
        assertEquals(
            "640".toLong(),
            data.width?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMedia03() {
        // Given
        val sourceJson = loadAsString("r4/media-example-xray.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertEquals(
            "XYZ Medical Clinic",
            data.basedOn?.get(0)?.identifier?.assigner?.display
        )
        assertEquals(
            "http://someclinic.org/fhir/NamingSystem/imaging-orders",
            data.basedOn?.get(0)?.identifier?.system
        )
        assertEquals(
            "111222",
            data.basedOn?.get(0)?.identifier?.value
        )
        assertEquals(
            "85151006",
            data.bodySite?.coding?.get(0)?.code
        )
        assertEquals(
            "Structure of left hand (body structure)",
            data.bodySite?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.bodySite?.coding?.get(0)?.system
        )
        assertEquals(
            "image/jpeg",
            data.content?.contentType
        )
        assertEquals(
            "2016-03-15",
            data.content?.creation?.value.toString()
        )
        assertEquals(
            "a1",
            data.content?.id
        )
        assertEquals(
            "http://someimagingcenter.org/fhir/Binary/A12345",
            data.content?.url
        )
        assertEquals(
            "2016-03-15",
            data.createdDateTime?.value.toString()
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "432".toLong(),
            data.height?.value
        )
        assertEquals(
            "xray",
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
            "39714003",
            data.modality?.coding?.get(0)?.code
        )
        assertEquals(
            "Skeletal X-ray of wrist and hand",
            data.modality?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.modality?.coding?.get(0)?.system
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Xray of left hand for Patient Henry Levin (MRN 12345) 2016-03-15</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "640".toLong(),
            data.width?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMedia04() {
        // Given
        val sourceJson = loadAsString("r4/media-example-sound.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertEquals(
            "audio/mpeg",
            data.content?.contentType
        )
        assertEquals(
            "dG9vIGJpZyB0b28gaW5jbHVkZSB0aGUgd2hvbGU=",
            data.content?.data
        )
        assertEquals(
            "a1",
            data.content?.id
        )
        assertEquals(
            "65".toDouble(),
            data.duration?.value
        )
        assertEquals(
            "sound",
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
            "Practitioner/xcda-author",
            data.operator?.reference
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/xcda",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Sound recording of speech example for Patient Henry Levin (MRN 12345):<br/><img src=\"#11\" alt=\"diagram\"/></div>",
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
