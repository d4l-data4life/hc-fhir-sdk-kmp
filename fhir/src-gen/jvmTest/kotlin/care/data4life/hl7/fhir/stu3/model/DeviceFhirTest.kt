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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.FHIRDeviceStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.UDIEntryType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DeviceTest.java
 *
 * Item used in healthcare
 *
 * This resource identifies an instance or a type of a manufactured item that is used in the provision
 * of healthcare without being substantially changed through that activity. The device may be a medical
 * or non-medical device. Medical devices include durable (reusable) medical equipment, implantable
 * devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare
 * and public health. Non-medical devices may include items such as a machine, cellphone, computer,
 * application, etc.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDevice01() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-software.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice01Step01(data: Device) {

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.system
        )

        assertEquals(
            expected = "http://acme.com",
            actual = data.contact?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "software",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/ehr/client-ids",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goodhealth",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Devices, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHR",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/goodhealth/ehr/",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.23-23423",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice02() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-udi3.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice02Step01(data: Device) {

        assertEquals(
            expected = "2020-02-02",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "example-udi3",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SNO",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/identifier-type",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XYZ456789012345678",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOT123456789012345",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-02-02",
            actual = data.manufactureDate?.value.toString()
        )

        assertEquals(
            expected = "GlobalMed, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ultra Implantable",
            actual = data.model
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRDeviceStatus.INACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "+H123PARTNO1234567890120/\$\$420020216LOT123456789012345/SXYZ456789012345678/16D20130202C",
            actual = data.udi?.carrierHRF
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = UDIEntryType.MANUAL,
            actual = data.udi?.entryType
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/hibcc",
            actual = data.udi?.issuer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/fda-udi",
            actual = data.udi?.jurisdiction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR® Ulltra Implantable",
            actual = data.udi?.name
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice03() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-udi2.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice03Step01(data: Device) {

        assertEquals(
            expected = "2014-02-01",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/device-din",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/iccbba-din",
            actual = data.extension?.get(0)?.valueIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A99971312345600",
            actual = data.extension?.get(0)?.valueIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-udi2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-02-01",
            actual = data.manufactureDate?.value.toString()
        )

        assertEquals(
            expected = "Acme Devices, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRDeviceStatus.INACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "A9999XYZ100T0474",
            actual = data.udi?.deviceIdentifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/iccbba-other",
            actual = data.udi?.issuer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/fda-udi",
            actual = data.udi?.jurisdiction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bone,Putty Demineralized",
            actual = data.udi?.name
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice04() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-f001-feedingtube.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice04Step01(data: Device) {

        assertEquals(
            expected = "2020-08-08",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "f001",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealthhospital/identifier/devices",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Central Supply",
            actual = data.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-08",
            actual = data.manufactureDate?.value.toString()
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRDeviceStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "25062003",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Feeding tube, device",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice05() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-pacemaker.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice05Step01(data: Device) {

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.system
        )

        assertEquals(
            expected = "ext 4352",
            actual = data.contact?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-pacemaker",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/devices/pacemakers/octane/serial",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1234-5678-90AB-CDEF",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1234-5678",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Devices, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PM/Octane 2014",
            actual = data.model
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "octane2014",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performance pace maker for high octane patients",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/devices",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice06() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-udi4.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice06Step01(data: Device) {

        assertEquals(
            expected = "example-udi4",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RZ12345678",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GlobalMed, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRDeviceStatus.INACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "=)1TE123456A&)RZ12345678",
            actual = data.udi?.carrierHRF
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/iccbba-blood",
            actual = data.udi?.issuer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/fda-udi",
            actual = data.udi?.jurisdiction
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice07() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-ihe-pcd.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice07Step01(data: Device) {

        assertEquals(
            expected = "ihe-pcd",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SNO",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/identifier-type",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serial Number",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AMID-123-456",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Devices, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A.1.1",
            actual = data.model
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Vital Signs Monitor",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice08() {
        // Given
        val sourceJson = loadAsString("stu3/device-example.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice08Step01(data: Device) {

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.system
        )

        assertEquals(
            expected = "ext 4352",
            actual = data.contact?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodcare.org/devices/id",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "345675",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SNO",
            actual = data.identifier?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/identifier-type",
            actual = data.identifier?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serial Number",
            actual = data.identifier?.get(1)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AMID-342135-8464",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "43453424",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Devices, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB 45-J",
            actual = data.model
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.note?.get(0)?.authorReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "QA Checked",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-28T14:03:32+10:00",
            actual = data.note?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = FHIRDeviceStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "86184003",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Electrocardiographic monitor and recorder",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ECG",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDevice09() {
        // Given
        val sourceJson = loadAsString("stu3/device-example-udi1.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertDevice09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDevice09Step01(data: Device) {

        assertEquals(
            expected = "2014-11-20",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "example-udi1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/devices/pacemakers/octane/serial",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1234-5678-90AB-CDEF",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SNO",
            actual = data.identifier?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/identifier-type",
            actual = data.identifier?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10987654d321",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7654321D",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Devices, Inc",
            actual = data.manufacturer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PM/Octane 2014",
            actual = data.model
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mr-unsafe",
            actual = data.safety?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MR Unsafe",
            actual = data.safety?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.3.26.1.1",
            actual = data.safety?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MR Unsafe",
            actual = data.safety?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRDeviceStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "468063009",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coated femoral stem prosthesis, modular",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coated femoral stem prosthesis, modular",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XWQyMDExMDg1NzY3NDAwMjAxNzE3MTQxMTIwMTBOWUZVTDAx4oaUMjExOTI4MzfihpQ3MTNBMUIyQzNENEU1RjZH",
            actual = data.udi?.carrierAIDC
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "{01}00844588003288{17}141120{10}7654321D{21}10987654d321",
            actual = data.udi?.carrierHRF
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "00844588003288",
            actual = data.udi?.deviceIdentifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = UDIEntryType.BARCODE,
            actual = data.udi?.entryType
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/gs1",
            actual = data.udi?.issuer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/NamingSystem/fda-udi",
            actual = data.udi?.jurisdiction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR® Hip System",
            actual = data.udi?.name
                ?.replace("\\n", " ")
        )
    }
}
