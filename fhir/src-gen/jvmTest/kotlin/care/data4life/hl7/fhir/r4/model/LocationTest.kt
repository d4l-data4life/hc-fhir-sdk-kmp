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
import care.data4life.hl7.fhir.r4.codesystem.AddressUse
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.LocationMode
import care.data4life.hl7.fhir.r4.codesystem.LocationStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * LocationTest.java
 *
 * Details and position information for a physical place
 *
 * Details and position information for a physical place where services are provided and resources and
 * participants may be stored, found, contained, or accommodated.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class LocationTest {

    val parser = FhirR4Parser()

    @Test
    fun testLocation01() {
        // Given
        val sourceJson = loadAsString("r4/location-example.json")

        // When
        val data = parser.toFhir(Location::class, sourceJson)

        // Then
        assertLocation01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLocation01Step01(data: Location) {

        assertEquals(
            expected = "Den Burg",
            actual = data.address?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Galapagosweg 91, Building A",
            actual = data.address?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9105 PZ",
            actual = data.address?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.use
        )

        assertEquals(
            expected = "BU MC, SW, F2",
            actual = data.alias?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center, South Wing, second floor",
            actual = data.alias?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Second floor of the Old South Wing, formerly in use by Psychiatry",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "B1-S.F2",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.managingOrganization?.reference
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
            expected = LocationMode.INSTANCE,
            actual = data.mode
        )

        assertEquals(
            expected = "South Wing, second floor",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "wi",
            actual = data.physicalType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Wing",
            actual = data.physicalType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/location-physical-type",
            actual = data.physicalType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toDouble(),
            actual = data.position?.altitude?.value
        )

        assertEquals(
            expected = "42.25475478".toDouble(),
            actual = data.position?.latitude?.value
        )

        assertEquals(
            expected = "-83.6945691".toDouble(),
            actual = data.position?.longitude?.value
        )

        assertEquals(
            expected = LocationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "2328",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "2329",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = "second wing admissions",
            actual = data.telecom?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.telecom?.get(3)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(3)?.use
        )

        assertEquals(
            expected = "http://sampleorg.com/southwing",
            actual = data.telecom?.get(3)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testLocation02() {
        // Given
        val sourceJson = loadAsString("r4/location-example-room.json")

        // When
        val data = parser.toFhir(Location::class, sourceJson)

        // Then
        assertLocation02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLocation02Step01(data: Location) {

        assertEquals(
            expected = "South Wing OR 5",
            actual = data.alias?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Main Wing OR 2",
            actual = data.alias?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Old South Wing, Neuro Radiology Operation Room 1 on second floor",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "B1-S.F2.1.00",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.managingOrganization?.reference
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
            expected = LocationMode.INSTANCE,
            actual = data.mode
        )

        assertEquals(
            expected = "South Wing Neuro OR 1",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "H",
            actual = data.operationalStatus?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Housekeeping",
            actual = data.operationalStatus?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0116",
            actual = data.operationalStatus?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.partOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ro",
            actual = data.physicalType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Room",
            actual = data.physicalType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/location-physical-type",
            actual = data.physicalType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = LocationStatus.SUSPENDED,
            actual = data.status
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "2329",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Burgers UMC, South Wing, second floor, Neuro Radiology Operation Room 1</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "RNEU",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Neuroradiology unit",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLocation03() {
        // Given
        val sourceJson = loadAsString("r4/location-example-ambulance.json")

        // When
        val data = parser.toFhir(Location::class, sourceJson)

        // Then
        assertLocation03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLocation03Step01(data: Location) {

        assertEquals(
            expected = "Ambulance provided by Burgers University Medical Center",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "amb",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.managingOrganization?.reference
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
            expected = LocationMode.KIND,
            actual = data.mode
        )

        assertEquals(
            expected = "BUMC Ambulance",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ve",
            actual = data.physicalType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vehicle",
            actual = data.physicalType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/location-physical-type",
            actual = data.physicalType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = LocationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.MOBILE,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "2329",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Mobile Clinic</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "AMB",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ambulance",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLocation04() {
        // Given
        val sourceJson = loadAsString("r4/location-example-ukpharmacy.json")

        // When
        val data = parser.toFhir(Location::class, sourceJson)

        // Then
        assertLocation04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLocation04Step01(data: Location) {

        assertEquals(
            expected = "All Pharmacies in the United Kingdom covered by the National Pharmacy Association",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ukp",
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
            expected = LocationMode.KIND,
            actual = data.mode
        )

        assertEquals(
            expected = "UK Pharmacies",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "jdn",
            actual = data.physicalType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Jurisdiction",
            actual = data.physicalType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/location-physical-type",
            actual = data.physicalType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = LocationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">UK Pharmacies</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "PHARM",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pharmacy",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLocation05() {
        // Given
        val sourceJson = loadAsString("r4/location-example-patients-home.json")

        // When
        val data = parser.toFhir(Location::class, sourceJson)

        // Then
        assertLocation05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLocation05Step01(data: Location) {

        assertEquals(
            expected = "Patient's Home",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ph",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.managingOrganization?.reference
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
            expected = LocationMode.KIND,
            actual = data.mode
        )

        assertEquals(
            expected = "Patient's Home",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ho",
            actual = data.physicalType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "House",
            actual = data.physicalType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/location-physical-type",
            actual = data.physicalType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = LocationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Patient's Home</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "PTRES",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient's Residence",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLocation06() {
        // Given
        val sourceJson = loadAsString("r4/location-example-hl7hq.json")

        // When
        val data = parser.toFhir(Location::class, sourceJson)

        // Then
        assertLocation06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLocation06Step01(data: Location) {

        assertEquals(
            expected = "Ann Arbor",
            actual = data.address?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USA",
            actual = data.address?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3300 Washtenaw Avenue, Suite 227",
            actual = data.address?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48104",
            actual = data.address?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MI",
            actual = data.address?.state
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 Headquarters",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hl7",
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
            expected = LocationMode.INSTANCE,
            actual = data.mode
        )

        assertEquals(
            expected = "Health Level Seven International",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bu",
            actual = data.physicalType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Building",
            actual = data.physicalType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/location-physical-type",
            actual = data.physicalType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "-83.69471".toDouble(),
            actual = data.position?.latitude?.value
        )

        assertEquals(
            expected = "42.2565".toDouble(),
            actual = data.position?.longitude?.value
        )

        assertEquals(
            expected = LocationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "(+1) 734-677-7777",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = "(+1) 734-677-6622",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = "hq@HL7.org",
            actual = data.telecom?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "SLEEP",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sleep disorders unit",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
