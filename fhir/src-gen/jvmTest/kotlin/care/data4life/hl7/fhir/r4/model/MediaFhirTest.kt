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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * MediaTest.java
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MediaFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedia01() {
        // Given
        val sourceJson = loadAsString("r4/media-example.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertMedia01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedia01Step01(data: Media) {
        assertEquals(
            expected = "image/gif",
            actual = data.content?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2009-09-03",
            actual = data.content?.creation?.value.toString()
        )

        assertEquals(
            expected = "a1",
            actual = data.content?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-12-17",
            actual = data.createdDateTime?.value.toString()
        )

        assertEquals(
            expected = "Acme Camera",
            actual = data.device?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.frames?.value
        )

        assertEquals(
            expected = "145".toLong(),
            actual = data.height?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-12-17T14:56:18Z",
            actual = data.issued?.value.toString()
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
            expected = "diagram",
            actual = data.modality?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/media-modality",
            actual = data.modality?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.operator?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "image",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Image",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/media-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "126".toLong(),
            actual = data.width?.value
        )
    }

    @Test
    fun testMedia02() {
        // Given
        val sourceJson = loadAsString("r4/media-example-dicom.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertMedia02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedia02Step01(data: Media) {
        assertEquals(
            expected = "application/dicom",
            actual = data.content?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G.E. Medical Systems",
            actual = data.device?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nema.org/fhir/extensions#0002-0010",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.1.2.1",
            actual = data.extension?.get(0)?.valueUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "480".toLong(),
            actual = data.height?.value
        )

        assertEquals(
            expected = "1.2.840.11361907579238403408700.3.1.04.19970327150033",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:dicom:uid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "InstanceUID",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "urn:oid:1.2.840.11361907579238403408700.3.1.04.19970327150033",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme-imaging.com/accession/2012",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "accessionNo",
            actual = data.identifier?.get(1)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1234567",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:dicom:uid",
            actual = data.identifier?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "studyId",
            actual = data.identifier?.get(2)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.840.113619.2.21.848.34082.0.538976288.3",
            actual = data.identifier?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:dicom:uid",
            actual = data.identifier?.get(3)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "seriesId",
            actual = data.identifier?.get(3)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.840.113619.2.21.3408.700.0.757923840.3.0",
            actual = data.identifier?.get(3)?.value
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
            expected = "US",
            actual = data.modality?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.modality?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
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
            expected = "399067008",
            actual = data.view?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lateral projection",
            actual = data.view?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.view?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "640".toLong(),
            actual = data.width?.value
        )
    }

    @Test
    fun testMedia03() {
        // Given
        val sourceJson = loadAsString("r4/media-example-xray.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertMedia03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedia03Step01(data: Media) {
        assertEquals(
            expected = "XYZ Medical Clinic",
            actual = data.basedOn?.get(0)?.identifier?.assigner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://someclinic.org/fhir/NamingSystem/imaging-orders",
            actual = data.basedOn?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "111222",
            actual = data.basedOn?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "85151006",
            actual = data.bodySite?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Structure of left hand (body structure)",
            actual = data.bodySite?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "image/jpeg",
            actual = data.content?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-03-15",
            actual = data.content?.creation?.value.toString()
        )

        assertEquals(
            expected = "a1",
            actual = data.content?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://someimagingcenter.org/fhir/Binary/A12345",
            actual = data.content?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-03-15",
            actual = data.createdDateTime?.value.toString()
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "432".toLong(),
            actual = data.height?.value
        )

        assertEquals(
            expected = "xray",
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
            expected = "39714003",
            actual = data.modality?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Skeletal X-ray of wrist and hand",
            actual = data.modality?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.modality?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Xray of left hand for Patient Henry Levin (MRN 12345) 2016-03-15</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "640".toLong(),
            actual = data.width?.value
        )
    }

    @Test
    fun testMedia04() {
        // Given
        val sourceJson = loadAsString("r4/media-example-sound.json")

        // When
        val data = parser.toFhir(Media::class, sourceJson)

        // Then
        assertMedia04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedia04Step01(data: Media) {
        assertEquals(
            expected = "audio/mpeg",
            actual = data.content?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dG9vIGJpZyB0b28gaW5jbHVkZSB0aGUgd2hvbGU=",
            actual = data.content?.data
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a1",
            actual = data.content?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "65".toDouble(),
            actual = data.duration?.value
        )

        assertEquals(
            expected = "sound",
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
            expected = "Practitioner/xcda-author",
            actual = data.operator?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Sound recording of speech example for Patient Henry Levin (MRN 12345):<br/><img src=\"#11\" alt=\"diagram\"/></div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
