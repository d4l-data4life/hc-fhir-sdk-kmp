/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * LocationTest.java
 *
 * Details and position information for a physical place.
 *
 * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class LocationTest {

    val parser = FhirR4Parser()

    @Test
    fun testLocation1() {
        val sourceJson = loadAsString("r4/location-example.json")

        val data = parser.toFhir(Location::class, sourceJson)

        assertEquals("Den Burg", data.address?.city)
        assertEquals("NLD", data.address?.country)
        assertEquals("Galapagosweg 91, Building A", data.address?.line?.get(0))
        assertEquals("9105 PZ", data.address?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.use)
        assertEquals("BU MC, SW, F2", data.alias?.get(0))
        assertEquals("Burgers University Medical Center, South Wing, second floor", data.alias?.get(1))
        assertEquals("Second floor of the Old South Wing, formerly in use by Psychiatry", data.description)
        assertEquals("Endpoint/example", data.endpoint?.get(0)?.reference)
        assertEquals("1", data.id)
        assertEquals("B1-S.F2", data.identifier?.get(0)?.value)
        assertEquals("Organization/f001", data.managingOrganization?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(LocationMode.INSTANCE, data.mode)
        assertEquals("South Wing, second floor", data.name)
        assertEquals("wi", data.physicalType?.coding?.get(0)?.code)
        assertEquals("Wing", data.physicalType?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/location-physical-type", data.physicalType?.coding?.get(0)?.system)
        assertEquals("0".toDouble(), data.position?.altitude?.value)
        assertEquals("42.25475478".toDouble(), data.position?.latitude?.value)
        assertEquals("-83.6945691".toDouble(), data.position?.longitude?.value)
        assertEquals(LocationStatus.ACTIVE, data.status)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("2328", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.FAX, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(1)?.use)
        assertEquals("2329", data.telecom?.get(1)?.value)
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(2)?.system)
        assertEquals("second wing admissions", data.telecom?.get(2)?.value)
        assertEquals(ContactPointSystem.URL, data.telecom?.get(3)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(3)?.use)
        assertEquals("http://sampleorg.com/southwing", data.telecom?.get(3)?.value)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testLocation2() {
        val sourceJson = loadAsString("r4/location-example-room.json")

        val data = parser.toFhir(Location::class, sourceJson)

        assertEquals("South Wing OR 5", data.alias?.get(0))
        assertEquals("Main Wing OR 2", data.alias?.get(1))
        assertEquals("Old South Wing, Neuro Radiology Operation Room 1 on second floor", data.description)
        assertEquals("2", data.id)
        assertEquals("B1-S.F2.1.00", data.identifier?.get(0)?.value)
        assertEquals("Organization/f001", data.managingOrganization?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(LocationMode.INSTANCE, data.mode)
        assertEquals("South Wing Neuro OR 1", data.name)
        assertEquals("H", data.operationalStatus?.code)
        assertEquals("Housekeeping", data.operationalStatus?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v2-0116", data.operationalStatus?.system)
        assertEquals("Location/1", data.partOf?.reference)
        assertEquals("ro", data.physicalType?.coding?.get(0)?.code)
        assertEquals("Room", data.physicalType?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/location-physical-type", data.physicalType?.coding?.get(0)?.system)
        assertEquals(LocationStatus.SUSPENDED, data.status)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals("2329", data.telecom?.get(0)?.value)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor, Neuro Radiology Operation Room 1</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("RNEU", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Neuroradiology unit", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testLocation3() {
        val sourceJson = loadAsString("r4/location-example-ambulance.json")

        val data = parser.toFhir(Location::class, sourceJson)

        assertEquals("Ambulance provided by Burgers University Medical Center", data.description)
        assertEquals("amb", data.id)
        assertEquals("Organization/f001", data.managingOrganization?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(LocationMode.KIND, data.mode)
        assertEquals("BUMC Ambulance", data.name)
        assertEquals("ve", data.physicalType?.coding?.get(0)?.code)
        assertEquals("Vehicle", data.physicalType?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/location-physical-type", data.physicalType?.coding?.get(0)?.system)
        assertEquals(LocationStatus.ACTIVE, data.status)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.MOBILE, data.telecom?.get(0)?.use)
        assertEquals("2329", data.telecom?.get(0)?.value)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Mobile Clinic</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("AMB", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Ambulance", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testLocation4() {
        val sourceJson = loadAsString("r4/location-example-ukpharmacy.json")

        val data = parser.toFhir(Location::class, sourceJson)

        assertEquals("All Pharmacies in the United Kingdom covered by the National Pharmacy Association", data.description)
        assertEquals("ukp", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(LocationMode.KIND, data.mode)
        assertEquals("UK Pharmacies", data.name)
        assertEquals("jdn", data.physicalType?.coding?.get(0)?.code)
        assertEquals("Jurisdiction", data.physicalType?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/location-physical-type", data.physicalType?.coding?.get(0)?.system)
        assertEquals(LocationStatus.ACTIVE, data.status)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">UK Pharmacies</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("PHARM", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Pharmacy", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testLocation5() {
        val sourceJson = loadAsString("r4/location-example-patients-home.json")

        val data = parser.toFhir(Location::class, sourceJson)

        assertEquals("Patient's Home", data.description)
        assertEquals("ph", data.id)
        assertEquals("Organization/f001", data.managingOrganization?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(LocationMode.KIND, data.mode)
        assertEquals("Patient's Home", data.name)
        assertEquals("ho", data.physicalType?.coding?.get(0)?.code)
        assertEquals("House", data.physicalType?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/location-physical-type", data.physicalType?.coding?.get(0)?.system)
        assertEquals(LocationStatus.ACTIVE, data.status)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Patient's Home</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("PTRES", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Patient's Residence", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testLocation6() {
        val sourceJson = loadAsString("r4/location-example-hl7hq.json")

        val data = parser.toFhir(Location::class, sourceJson)

        assertEquals("Ann Arbor", data.address?.city)
        assertEquals("USA", data.address?.country)
        assertEquals("3300 Washtenaw Avenue, Suite 227", data.address?.line?.get(0))
        assertEquals("48104", data.address?.postalCode)
        assertEquals("MI", data.address?.state)
        assertEquals("HL7 Headquarters", data.description)
        assertEquals("hl7", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(LocationMode.INSTANCE, data.mode)
        assertEquals("Health Level Seven International", data.name)
        assertEquals("bu", data.physicalType?.coding?.get(0)?.code)
        assertEquals("Building", data.physicalType?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/location-physical-type", data.physicalType?.coding?.get(0)?.system)
        assertEquals("-83.69471".toDouble(), data.position?.latitude?.value)
        assertEquals("42.2565".toDouble(), data.position?.longitude?.value)
        assertEquals(LocationStatus.ACTIVE, data.status)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals("(+1) 734-677-7777", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.FAX, data.telecom?.get(1)?.system)
        assertEquals("(+1) 734-677-6622", data.telecom?.get(1)?.value)
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(2)?.system)
        assertEquals("hq@HL7.org", data.telecom?.get(2)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("SLEEP", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Sleep disorders unit", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
