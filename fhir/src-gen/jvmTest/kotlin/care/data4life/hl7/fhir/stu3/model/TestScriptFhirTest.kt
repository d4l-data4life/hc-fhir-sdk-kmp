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
import care.data4life.hl7.fhir.stu3.codesystem.AssertionDirectionType
import care.data4life.hl7.fhir.stu3.codesystem.AssertionOperatorType
import care.data4life.hl7.fhir.stu3.codesystem.AssertionResponseTypes
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointUse
import care.data4life.hl7.fhir.stu3.codesystem.ContentType
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.TestScriptRequestMethodCode
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * TestScriptTest.java
 *
 * Describes a set of tests
 *
 * A structured set of tests against a FHIR server implementation to determine compliance against the
 * FHIR specification.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class TestScriptFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testTestScript01() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example-multisystem.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript01Step01(data)
        assertTestScript01Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript01Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.destination?.get(0)?.index?.value
        )

        assertEquals(
            expected = "FHIR-Server",
            actual = data.destination?.get(0)?.profile?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toInt(),
            actual = data.destination?.get(1)?.index?.value
        )

        assertEquals(
            expected = "FHIR-Server",
            actual = data.destination?.get(1)?.profile?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "testscript-example-multisystem",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9878",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Read Operation",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.metadata?.capability?.get(0)?.destination?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#read",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.metadata?.capability?.get(0)?.origin?.get(0)?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.validated?.value
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(1)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Read Operation",
            actual = data.metadata?.capability?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toInt(),
            actual = data.metadata?.capability?.get(1)?.destination?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#read",
            actual = data.metadata?.capability?.get(1)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.metadata?.capability?.get(1)?.origin?.get(0)?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(1)?.required?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.metadata?.capability?.get(1)?.validated?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "testscript-example-multisystem",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.origin?.get(0)?.index?.value
        )

        assertEquals(
            expected = "FHIR-Client",
            actual = data.origin?.get(0)?.profile?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Read Operation",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.contentType
        )

        assertEquals(
            expected = "Read a Patient from the first destination test system and perform basic validation.",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.test?.get(0)?.action?.get(0)?.operation?.destination?.value
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.test?.get(0)?.action?.get(0)?.operation?.origin?.value
        )

        assertEquals(
            expected = "/\${Dest1PatientResourceId}",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "request-read-patient-01",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.requestId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the request method GET was sent by the client system under test.",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestScriptRequestMethodCode.GET,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.requestMethod
        )

        assertEquals(
            expected = "Confirm that the client requested an Accept of xml.",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.REQUEST,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.direction
        )

        assertEquals(
            expected = "Accept",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.CONTAINS,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.operator
        )

        assertEquals(
            expected = "xml",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.response
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(4)?.assert?.contentType
        )

        assertEquals(
            expected = "Confirm that the returned format is XML.",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(4)?.assert?.direction
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Patient.",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(5)?.assert?.direction
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read a Patient from the first destination test system using the user defined dynamic variable \${Dest1PatientResourceId}. Perform basic validation.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-ReadPatient-Destination1",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ReadPatient-Destination1",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(1)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(1)?.action?.get(0)?.operation?.contentType
        )

        assertEquals(
            expected = "Read a Patient from the second destination test system and perform basic validation.",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toInt(),
            actual = data.test?.get(1)?.action?.get(0)?.operation?.destination?.value
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.test?.get(1)?.action?.get(0)?.operation?.origin?.value
        )

        assertEquals(
            expected = "/\${Dest2PatientResourceId}",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Accept-Charset",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.requestHeader?.get(0)?.field
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "utf-8",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.requestHeader?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the client requested an Accept of xml.",
            actual = data.test?.get(1)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.REQUEST,
            actual = data.test?.get(1)?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = "Accept",
            actual = data.test?.get(1)?.action?.get(1)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.CONTAINS,
            actual = data.test?.get(1)?.action?.get(1)?.assert?.operator
        )

        assertEquals(
            expected = "xml",
            actual = data.test?.get(1)?.action?.get(1)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(1)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(1)?.action?.get(2)?.assert?.direction
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(1)?.action?.get(2)?.assert?.response
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(1)?.action?.get(3)?.assert?.contentType
        )

        assertEquals(
            expected = "Confirm that the returned format is XML.",
            actual = data.test?.get(1)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(1)?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Patient.",
            actual = data.test?.get(1)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(1)?.action?.get(4)?.assert?.direction
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(1)?.action?.get(4)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read a Patient from the second destination test system using the user defined dynamic variable \${Dest2PatientResourceId}. Perform basic validation.",
            actual = data.test?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "02-ReadPatient-Destination2",
            actual = data.test?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ReadPatient-Destination2",
            actual = data.test?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Multisystem Test Script",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example-multisystem",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.variable?.get(0)?.defaultValue
                ?.replace("\\n", " ")
        )
    }

    private fun assertTestScript01Step02(data: TestScript) {
        assertEquals(
            expected = "Dest1PatientResourceId",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.variable?.get(1)?.defaultValue
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dest2PatientResourceId",
            actual = data.variable?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testTestScript02() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example-history.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript02Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.fixture?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.fixture?.get(0)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-update",
            actual = data.fixture?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.fixture?.get(1)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.fixture?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "testscript-example-history",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9877",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Update, Delete and History (Instance) Operations",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#update",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#delete",
            actual = data.metadata?.capability?.get(0)?.link?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#history",
            actual = data.metadata?.capability?.get(0)?.link?.get(2)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript Example History",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bundle-profile",
            actual = data.profile?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Bundle",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient (Conditional) Create, Update, Delete and History (Instance) Operations",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Execute a delete operation to insure the patient does not exist on the server.",
            actual = data.setup?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupDeletePatient",
            actual = data.setup?.action?.get(0)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "delete",
            actual = data.setup?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK) or 204(No Content).",
            actual = data.setup?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = AssertionOperatorType.IN,
            actual = data.setup?.action?.get(1)?.assert?.operator
        )

        assertEquals(
            expected = "200,204",
            actual = data.setup?.action?.get(1)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(2)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(2)?.operation?.contentType
        )

        assertEquals(
            expected = "Create patient resource on test server using the contents of fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupCreatePatient",
            actual = data.setup?.action?.get(2)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(2)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(2)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "update",
            actual = data.setup?.action?.get(2)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(2)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 201(Created).",
            actual = data.setup?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = "201",
            actual = data.setup?.action?.get(3)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(4)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(4)?.operation?.contentType
        )

        assertEquals(
            expected = "Update patient resource on test server using the contents of fixture-patient-update",
            actual = data.setup?.action?.get(4)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupUpdatePatient",
            actual = data.setup?.action?.get(4)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(4)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(4)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-update",
            actual = data.setup?.action?.get(4)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "update",
            actual = data.setup?.action?.get(4)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(4)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.setup?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(5)?.assert?.direction
        )

        assertEquals(
            expected = "200",
            actual = data.setup?.action?.get(5)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.contentType
        )

        assertEquals(
            expected = "Get the Patient history on the test server using the id from fixture-patient-create.",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.targetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "history",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Bundle.",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bundle",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Bundle conforms to the base FHIR specification.",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bundle-profile",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.validateProfileId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Bundle type equals 'history'.",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(4)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Bundle/fhir:type/@value",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "history",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Get the history for a known Patient and validate response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-HistoryPatient",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History Patient",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example-history",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "createResourceId",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/id",
            actual = data.variable?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.variable?.get(0)?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testTestScript03() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example-update.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript03Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "TestScript example resource with setup to delete if present and create a new instance of a Patient; and single test definition to update that Patient with various asserts.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.fixture?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.fixture?.get(0)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-update",
            actual = data.fixture?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.fixture?.get(1)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.fixture?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "testscript-example-update",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9882",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Update and Delete Operations",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#update",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#delete",
            actual = data.metadata?.capability?.get(0)?.link?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript Example Update",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.profile?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Patient",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient (Conditional) Create, Update, Delete Operations",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.setup?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Execute a delete operation to insure the patient does not exist on the server.",
            actual = data.setup?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupDeletePatient",
            actual = data.setup?.action?.get(0)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "delete",
            actual = data.setup?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK) or 204(No Content).",
            actual = data.setup?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = AssertionOperatorType.IN,
            actual = data.setup?.action?.get(1)?.assert?.operator
        )

        assertEquals(
            expected = "200,204",
            actual = data.setup?.action?.get(1)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.setup?.action?.get(2)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.setup?.action?.get(2)?.operation?.contentType
        )

        assertEquals(
            expected = "Create patient resource on test server using the contents of fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupCreatePatient",
            actual = data.setup?.action?.get(2)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(2)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(2)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "update",
            actual = data.setup?.action?.get(2)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(2)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 201(Created).",
            actual = data.setup?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = "201",
            actual = data.setup?.action?.get(3)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.contentType
        )

        assertEquals(
            expected = "Update patient resource on test server using the contents of fixture-patient-update",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupUpdatePatient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-update",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "update",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.contentType
        )

        assertEquals(
            expected = "Confirm that the returned format is XML.",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP Header Last-Modified is present. Warning only as the server may not support versioning.",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Last-Modified",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.NOTEMPTY,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.operator
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.test?.get(0)?.action?.get(3)?.assert?.warningOnly?.value
        )

        assertEquals(
            expected = "Update a Patient and validate response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-UpdatePatient",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Update Patient",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example-update",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "createResourceId",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/id",
            actual = data.variable?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.variable?.get(0)?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testTestScript04() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example-rule.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript04Step01(data)
        assertTestScript04Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript04Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.fixture?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.fixture?.get(0)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-minimum",
            actual = data.fixture?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers (minimum)",
            actual = data.fixture?.get(1)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "testscript-example-rule",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9880",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Update, Read and Delete Operations",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#delete",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#read",
            actual = data.metadata?.capability?.get(0)?.link?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#update",
            actual = data.metadata?.capability?.get(0)?.link?.get(2)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript Example",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.profile?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Patient",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Conditional Create (Update), Read and Delete Operations",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "rule-responseStatusCode",
            actual = data.rule?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectedStatusCode",
            actual = data.rule?.get(0)?.param?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200",
            actual = data.rule?.get(0)?.param?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript/testscript-example",
            actual = data.rule?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ruleset-responseContentTypeStatusCode",
            actual = data.ruleset?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript/testscript-example",
            actual = data.ruleset?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectedContentType",
            actual = data.ruleset?.get(0)?.rule?.get(0)?.param?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "json",
            actual = data.ruleset?.get(0)?.rule?.get(0)?.param?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RuleResponseContentType",
            actual = data.ruleset?.get(0)?.rule?.get(0)?.ruleId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectedStatusCode",
            actual = data.ruleset?.get(0)?.rule?.get(1)?.param?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200",
            actual = data.ruleset?.get(0)?.rule?.get(1)?.param?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RuleResponseStatusCode",
            actual = data.ruleset?.get(0)?.rule?.get(1)?.ruleId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Execute a delete operation to insure the patient does not exist on the server.",
            actual = data.setup?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupDeletePatient",
            actual = data.setup?.action?.get(0)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "delete",
            actual = data.setup?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK) or 204(No Content).",
            actual = data.setup?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = AssertionOperatorType.IN,
            actual = data.setup?.action?.get(1)?.assert?.operator
        )

        assertEquals(
            expected = "200,204",
            actual = data.setup?.action?.get(1)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(2)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(2)?.operation?.contentType
        )

        assertEquals(
            expected = "Create patient resource on test server using the contents of fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupCreatePatient",
            actual = data.setup?.action?.get(2)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(2)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(2)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "update",
            actual = data.setup?.action?.get(2)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(2)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 201(Created).",
            actual = data.setup?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = "Setup-RuleCreateOK",
            actual = data.setup?.action?.get(3)?.assert?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectedStatusCode",
            actual = data.setup?.action?.get(3)?.assert?.rule?.param?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "201",
            actual = data.setup?.action?.get(3)?.assert?.rule?.param?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "rule-responseStatusCode",
            actual = data.setup?.action?.get(3)?.assert?.rule?.ruleId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "Read the patient resource on the test server using the id from fixture-patient-create. Prevent URL encoding of the request.",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.test?.get(0)?.action?.get(0)?.operation?.encodeRequestUrl?.value
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.responseId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.targetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-RuleReadPatientOK",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "rule-responseStatusCode",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.rule?.ruleId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-RuleReadPatientContentType",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectedContentType",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.ruleset?.rule?.get(0)?.param?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XML",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.ruleset?.rule?.get(0)?.param?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RuleResponseContentType",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.ruleset?.rule?.get(0)?.ruleId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ruleset-responseResourcePatient",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.ruleset?.rulesetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP Header Last-Modified is present. Warning only as the server may not support versioning.",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = "Last-Modified",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.NOTEMPTY,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.operator
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.test?.get(0)?.action?.get(3)?.assert?.warningOnly?.value
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Patient.",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient conforms to the base FHIR specification.",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.validateProfileId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient contains the expected family name 'Chalmers'. Uses explicit sourceId reference to read responseId fixture.",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.description
                ?.replace("\\n", " ")
        )
    }

    private fun assertTestScript04Step02(data: TestScript) {
        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(6)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:family/@value",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chalmers",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient contains the expected given name 'Peter'. Uses explicit sourceId reference to read responseId fixture.",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(7)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:given/@value",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.compareToSourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:family/@value",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.compareToSourcePath
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(8)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:family/@value",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.compareToSourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:given/@value",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.compareToSourcePath
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:given/@value",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read a patient and validate response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-ReadPatient",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read Patient",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example-rule",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "createResourceId",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/id",
            actual = data.variable?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.variable?.get(0)?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testTestScript05() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example-search.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript05Step01(data)
        assertTestScript05Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript05Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "TestScript example resource with simple Patient search test. The read tests will utilize user defined dynamic variables that will hold the Patient search parameter values.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.fixture?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.fixture?.get(0)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "testscript-example-search",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9881",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Search Operation",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#search",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript Example Search",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bundle-profile",
            actual = data.profile?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Bundle",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Search Operation",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.setup?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Test simple search to verify server support.",
            actual = data.setup?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "?family=DONTEXPECTAMATCH&given=DONTEXPECTAMATCH",
            actual = data.setup?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "search",
            actual = data.setup?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the request url contains the family search parameter.",
            actual = data.setup?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.REQUEST,
            actual = data.setup?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = AssertionOperatorType.CONTAINS,
            actual = data.setup?.action?.get(1)?.assert?.operator
        )

        assertEquals(
            expected = "family",
            actual = data.setup?.action?.get(1)?.assert?.requestURL
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.setup?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(2)?.assert?.direction
        )

        assertEquals(
            expected = "200",
            actual = data.setup?.action?.get(2)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Bundle.",
            actual = data.setup?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bundle",
            actual = data.setup?.action?.get(3)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Bundle correctly defines the navigation links.",
            actual = data.setup?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.setup?.action?.get(4)?.assert?.navigationLinks?.value
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.contentType
        )

        assertEquals(
            expected = "Create a Patient resource and capture the returned HTTP Header Location.",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PatientCreateResponse",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.responseId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "create",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 201(Created).",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.CREATED,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = "Confirm that the returned HTTP Header Location is present.",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.direction
        )

        assertEquals(
            expected = "Location",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.NOTEMPTY,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.operator
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(3)?.operation?.accept
        )

        assertEquals(
            expected = "Read the created Patient using the captured Location URL value.",
            actual = data.test?.get(0)?.action?.get(3)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(0)?.action?.get(3)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(3)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "\${PatientCreateLocation}",
            actual = data.test?.get(0)?.action?.get(3)?.operation?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(0)?.action?.get(4)?.assert?.response
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Patient.",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Create a Patient resource and capture the returned HTTP Header Location. Then search for (read) that Patient using the Location URL value and validate the response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-PatientCreateSearch",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Create Search",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(1)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Search for Patient resources on the destination test system.",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "?family=\${PatientSearchFamilyName}&given=\${PatientSearchGivenName}",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "search",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(1)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(1)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(1)?.action?.get(2)?.assert?.contentType
        )

        assertEquals(
            expected = "Confirm that the returned format is XML.",
            actual = data.test?.get(1)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Bundle.",
            actual = data.test?.get(1)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bundle",
            actual = data.test?.get(1)?.action?.get(3)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Bundle conforms to the base FHIR specification.",
            actual = data.test?.get(1)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bundle-profile",
            actual = data.test?.get(1)?.action?.get(4)?.assert?.validateProfileId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Bundle type equals 'searchset'.",
            actual = data.test?.get(1)?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(1)?.action?.get(5)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Bundle/fhir:type/@value",
            actual = data.test?.get(1)?.action?.get(5)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "searchset",
            actual = data.test?.get(1)?.action?.get(5)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Bundle total is greater than or equal to the number of returned entries.",
            actual = data.test?.get(1)?.action?.get(6)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bundle.total.toInteger() >= entry.count()",
            actual = data.test?.get(1)?.action?.get(6)?.assert?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Search for Patient resources using the user defined dynamic variables \${PatientSearchFamilyName} and \${PatientSearchGivenName} and validate response.",
            actual = data.test?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "02-PatientSearchDynamic",
            actual = data.test?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Search Dynamic",
            actual = data.test?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example-search",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location",
            actual = data.variable?.get(0)?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PatientCreateLocation",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PatientCreateResponse",
            actual = data.variable?.get(0)?.sourceId
                ?.replace("\\n", " ")
        )
    }

    private fun assertTestScript05Step02(data: TestScript) {
        assertEquals(
            expected = "Enter patient search criteria for a known family name on the target system",
            actual = data.variable?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "[Family name]",
            actual = data.variable?.get(1)?.hint
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PatientSearchFamilyName",
            actual = data.variable?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Enter patient search criteria for a known given name on the target system",
            actual = data.variable?.get(2)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "[Given name]",
            actual = data.variable?.get(2)?.hint
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PatientSearchGivenName",
            actual = data.variable?.get(2)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evaluate the returned Patient searchset Bundle.total value",
            actual = data.variable?.get(3)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bundle.total.toInteger()",
            actual = data.variable?.get(3)?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PatientSearchBundleTotal",
            actual = data.variable?.get(3)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testTestScript06() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript06Step01(data)
        assertTestScript06Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript06Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "TestScript example resource with setup to delete if present and create a new instance of a Patient; and single test definition to read the created Patient with various asserts.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(0)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.fixture?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.fixture?.get(0)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autocreate?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.fixture?.get(1)?.autodelete?.value
        )

        assertEquals(
            expected = "fixture-patient-minimum",
            actual = data.fixture?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers (minimum)",
            actual = data.fixture?.get(1)?.resource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.fixture?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "testscript-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9876",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Update, Read and Delete Operations",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#delete",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#read",
            actual = data.metadata?.capability?.get(0)?.link?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#update",
            actual = data.metadata?.capability?.get(0)?.link?.get(2)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript Example",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.profile?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Patient",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Conditional Create (Update), Read and Delete Operations",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Execute a delete operation to insure the patient does not exist on the server.",
            actual = data.setup?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupDeletePatient",
            actual = data.setup?.action?.get(0)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "delete",
            actual = data.setup?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK) or 204(No Content).",
            actual = data.setup?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = AssertionOperatorType.IN,
            actual = data.setup?.action?.get(1)?.assert?.operator
        )

        assertEquals(
            expected = "200,204",
            actual = data.setup?.action?.get(1)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(2)?.operation?.accept
        )

        assertEquals(
            expected = ContentType.JSON,
            actual = data.setup?.action?.get(2)?.operation?.contentType
        )

        assertEquals(
            expected = "Create patient resource on test server using the contents of fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SetupCreatePatient",
            actual = data.setup?.action?.get(2)?.operation?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${createResourceId}",
            actual = data.setup?.action?.get(2)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(2)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "update",
            actual = data.setup?.action?.get(2)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(2)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 201(Created).",
            actual = data.setup?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(3)?.assert?.direction
        )

        assertEquals(
            expected = "201",
            actual = data.setup?.action?.get(3)?.assert?.responseCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read the created patient resource on the test server using the id from fixture-patient-create. Verify contents.",
            actual = data.setup?.action?.get(4)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.setup?.action?.get(4)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.setup?.action?.get(4)?.operation?.targetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.setup?.action?.get(4)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.setup?.action?.get(4)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.setup?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.setup?.action?.get(5)?.assert?.direction
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.setup?.action?.get(5)?.assert?.response
        )

        assertEquals(
            expected = "Patient.name.first().family",
            actual = data.setup?.action?.get(6)?.assert?.compareToSourceExpression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.setup?.action?.get(6)?.assert?.compareToSourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient contains the expected family name 'Chalmers'. Uses explicit compareToSourceId reference to fixture-patient-create used to create the Patient.",
            actual = data.setup?.action?.get(6)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.setup?.action?.get(6)?.assert?.operator
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "Delete the patient resource on the test server using the id from fixture-patient-create.",
            actual = data.teardown?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.teardown?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.teardown?.action?.get(0)?.operation?.targetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "delete",
            actual = data.teardown?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.teardown?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read the patient resource on the test server using the id from fixture-patient-create. Prevent URL encoding of the request.",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.test?.get(0)?.action?.get(0)?.operation?.encodeRequestUrl?.value
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.responseId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.targetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.direction
        )

        assertEquals(
            expected = "01-ReadPatientOK",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = "Confirm that the returned HTTP Header Last-Modified is present. Warning only as the server may not support versioning.",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionDirectionType.RESPONSE,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.direction
        )

        assertEquals(
            expected = "Last-Modified",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.NOTEMPTY,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.operator
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.test?.get(0)?.action?.get(2)?.assert?.warningOnly?.value
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Patient.",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient conforms to the base FHIR specification.",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.validateProfileId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient contains the expected family name 'Chalmers'. Uses explicit sourceId reference to read responseId fixture.",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(5)?.assert?.operator
        )
    }

    private fun assertTestScript06Step02(data: TestScript) {
        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:family/@value",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chalmers",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient contains the expected given name 'Peter'. Uses explicit sourceId reference to read responseId fixture.",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(6)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:given/@value",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.compareToSourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:family/@value",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.compareToSourcePath
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.EQUALS,
            actual = data.test?.get(0)?.action?.get(7)?.assert?.operator
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:family/@value",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.compareToSourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:given/@value",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.compareToSourcePath
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir:Patient/fhir:name/fhir:given/@value",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-read",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned resource contains the expected retained elements and values. Warning only to provide users with reviewable results.",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-minimum",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.minimumId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.test?.get(0)?.action?.get(9)?.assert?.warningOnly?.value
        )

        assertEquals(
            expected = "Read a Patient and validate response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-ReadPatient",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read Patient",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "positive",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/variant-state",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "createResourceId",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/id",
            actual = data.variable?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fixture-patient-create",
            actual = data.variable?.get(0)?.sourceId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testTestScript07() {
        // Given
        val sourceJson = loadAsString("stu3/testscript-example-readtest.json")

        // When
        val data = parser.toFhir(TestScript::class, sourceJson)

        // Then
        assertTestScript07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestScript07Step01(data: TestScript) {
        assertEquals(
            expected = "Support",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "support@HL7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "© HL7.org 2011+",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "TestScript example resource with ported Sprinkler basic read tests R001, R002, R003, R004. The read tests will utilize user defined dynamic variables that will hold the Patient resource id values.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "testscript-example-readtest",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9879",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CapabilityStatement/example",
            actual = data.metadata?.capability?.get(0)?.capabilities?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Read Operation",
            actual = data.metadata?.capability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/http.html#read",
            actual = data.metadata?.capability?.get(0)?.link?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.metadata?.capability?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
            actual = data.metadata?.link?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/patient.html",
            actual = data.metadata?.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript Example Read Test",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.profile?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Patient",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient Read Operation",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Read the known Patient resource on the destination test system using the user defined dynamic variable \${KnownPatientResourceId}.",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${KnownPatientResourceId}",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 200(OK).",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.OKAY,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.contentType
        )

        assertEquals(
            expected = "Confirm that the returned format is XML.",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP Header Last-Modified is present. Warning only as the server may not support versioning.",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Last-Modified",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.headerField
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionOperatorType.NOTEMPTY,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.operator
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.test?.get(0)?.action?.get(3)?.assert?.warningOnly?.value
        )

        assertEquals(
            expected = "Confirm that the returned resource type is Patient.",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned Patient conforms to the base FHIR specification.",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-profile",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.validateProfileId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read a known Patient and validate response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R001",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sprinkler Read Test R001",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(1)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "/1",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(1)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 404(Not Found).",
            actual = data.test?.get(1)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.NOTFOUND,
            actual = data.test?.get(1)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = "Read an unknown Resource Type and validate response.",
            actual = data.test?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R002",
            actual = data.test?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sprinkler Read Test R002",
            actual = data.test?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(2)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Attempt to read the non-existing Patient resource on the destination test system using the user defined dynamic variable \${NonExistsPatientResourceId}.",
            actual = data.test?.get(2)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/\${NonExistsPatientResourceId}",
            actual = data.test?.get(2)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(2)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(2)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(2)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 404(Not Found).",
            actual = data.test?.get(2)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.NOTFOUND,
            actual = data.test?.get(2)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = "Read a known, non-existing Patient and validate response.",
            actual = data.test?.get(2)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R003",
            actual = data.test?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sprinkler Read Test R003",
            actual = data.test?.get(2)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContentType.XML,
            actual = data.test?.get(3)?.action?.get(0)?.operation?.accept
        )

        assertEquals(
            expected = "Attempt to read a Patient resource on the destination test system using known bad formatted resource id.",
            actual = data.test?.get(3)?.action?.get(0)?.operation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/ID-may-not-contain-CAPITALS",
            actual = data.test?.get(3)?.action?.get(0)?.operation?.params
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.test?.get(3)?.action?.get(0)?.operation?.resource
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "read",
            actual = data.test?.get(3)?.action?.get(0)?.operation?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/testscript-operation-codes",
            actual = data.test?.get(3)?.action?.get(0)?.operation?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirm that the returned HTTP status is 400(Bad Request).",
            actual = data.test?.get(3)?.action?.get(1)?.assert?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AssertionResponseTypes.BAD,
            actual = data.test?.get(3)?.action?.get(1)?.assert?.response
        )

        assertEquals(
            expected = "Read a Patient using a known bad formatted resource id and validate response.",
            actual = data.test?.get(3)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R004",
            actual = data.test?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sprinkler Read Test R004",
            actual = data.test?.get(3)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/TestScript/testscript-example-readtest",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.variable?.get(0)?.defaultValue
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "KnownPatientResourceId",
            actual = data.variable?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "does-not-exist",
            actual = data.variable?.get(1)?.defaultValue
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NonExistsPatientResourceId",
            actual = data.variable?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
