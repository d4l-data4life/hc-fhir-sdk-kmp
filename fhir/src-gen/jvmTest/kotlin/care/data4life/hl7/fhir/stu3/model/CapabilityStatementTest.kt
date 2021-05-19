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
import care.data4life.hl7.fhir.stu3.codesystem.CapabilityStatementKind
import care.data4life.hl7.fhir.stu3.codesystem.ConditionalDeleteStatus
import care.data4life.hl7.fhir.stu3.codesystem.ConditionalReadStatus
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.DocumentMode
import care.data4life.hl7.fhir.stu3.codesystem.EventCapabilityMode
import care.data4life.hl7.fhir.stu3.codesystem.FHIRRestfulInteractions
import care.data4life.hl7.fhir.stu3.codesystem.MessageSignificanceCategory
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.codesystem.ResourceVersionPolicy
import care.data4life.hl7.fhir.stu3.codesystem.RestfulCapabilityMode
import care.data4life.hl7.fhir.stu3.codesystem.SearchParamType
import care.data4life.hl7.fhir.stu3.codesystem.UnknownContentCode
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CapabilityStatementTest.java
 *
 * A statement of system capabilities
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used
 * as a statement of actual server functionality or a statement of required or desired server
 * implementation.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CapabilityStatementTest {

    val parser = FhirStu3Parser()

    @Test
    fun testCapabilityStatement01() {
        // Given
        val sourceJson = loadAsString("stu3/capabilitystatement-example.json")

        // When
        val data = parser.toFhir(CapabilityStatement::class, sourceJson)

        // Then
        assertCapabilityStatement01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCapabilityStatement01Step01(data: CapabilityStatement) {

        assertEquals(
            expected = UnknownContentCode.BOTH,
            actual = data.acceptUnknown
        )

        assertEquals(
            expected = "System Administrator",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "wile@acme.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Copyright © Acme Healthcare and GoodCorp EHR Systems",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-01-04",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is the FHIR capability statement for the main EHR at ACME for the private interface - it does not describe the public interface",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Basic rules for all documents in the EHR system",
            actual = data.document?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DocumentMode.CONSUMER,
            actual = data.document?.get(0)?.mode
        )

        assertEquals(
            expected = "http://fhir.hl7.org/base/Profilebc054d23-75e1-4dc6-aca5-838b6b1ac81d/_history/b5fdd9fc-b021-4ea1-911a-721a60663796",
            actual = data.document?.get(0)?.profile?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.fhirVer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "xml",
            actual = data.format?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "json",
            actual = data.format?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "main EHR at ACME",
            actual = data.implementation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://10.2.3.4/fhir",
            actual = data.implementation?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/lab",
            actual = data.implementationGuide?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ihe.org/fhir/CapabilityStatement/pixm-client",
            actual = data.instantiates?.get(0)
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
            expected = CapabilityStatementKind.INSTANCE,
            actual = data.kind
        )

        assertEquals(
            expected = "ADT A08 equivalent for external system notifications",
            actual = data.messaging?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mllp:10.1.1.10:9234",
            actual = data.messaging?.get(0)?.endpoint?.get(0)?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mllp",
            actual = data.messaging?.get(0)?.endpoint?.get(0)?.protocol?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/message-transport",
            actual = data.messaging?.get(0)?.endpoint?.get(0)?.protocol?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MessageSignificanceCategory.CONSEQUENCE,
            actual = data.messaging?.get(0)?.event?.get(0)?.category
        )

        assertEquals(
            expected = "admin-notify",
            actual = data.messaging?.get(0)?.event?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/message-events",
            actual = data.messaging?.get(0)?.event?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Notification of an update to a patient resource. changing the links is not supported",
            actual = data.messaging?.get(0)?.event?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.messaging?.get(0)?.event?.get(0)?.focus
        )

        assertEquals(
            expected = EventCapabilityMode.RECEIVER,
            actual = data.messaging?.get(0)?.event?.get(0)?.mode
        )

        assertEquals(
            expected = "StructureDefinition/Patient",
            actual = data.messaging?.get(0)?.event?.get(0)?.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "StructureDefinition/MessageHeader",
            actual = data.messaging?.get(0)?.event?.get(0)?.response?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30".toLong(),
            actual = data.messaging?.get(0)?.reliableCache?.value
        )

        assertEquals(
            expected = "ACME-EHR",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/xml-patch+xml",
            actual = data.patchFormat?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/json-patch+json",
            actual = data.patchFormat?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/core/StructureDefinition/familymemberhistory-genetic",
            actual = data.profile?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACME Corporation",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Main EHR capability statement, published for contracting and operational support",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/CompartmentDefinition/patient",
            actual = data.rest?.get(0)?.compartment?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Main FHIR endpoint for acem health",
            actual = data.rest?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRRestfulInteractions.TRANSACTION,
            actual = data.rest?.get(0)?.interaction?.get(0)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.HISTORY_SYSTEM,
            actual = data.rest?.get(0)?.interaction?.get(1)?.code
        )

        assertEquals(
            expected = RestfulCapabilityMode.SERVER,
            actual = data.rest?.get(0)?.mode
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.rest?.get(0)?.resource?.get(0)?.conditionalCreate?.value
        )

        assertEquals(
            expected = ConditionalDeleteStatus.NOT_SUPPORTED,
            actual = data.rest?.get(0)?.resource?.get(0)?.conditionalDelete
        )

        assertEquals(
            expected = ConditionalReadStatus.FULL_SUPPORT,
            actual = data.rest?.get(0)?.resource?.get(0)?.conditionalRead
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.rest?.get(0)?.resource?.get(0)?.conditionalUpdate?.value
        )

        assertEquals(
            expected = "This server does not let the clients create identities.",
            actual = data.rest?.get(0)?.resource?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRRestfulInteractions.READ,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(0)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.VREAD,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.code
        )

        assertEquals(
            expected = "Only supported for patient records since 12-Dec 2012",
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FHIRRestfulInteractions.UPDATE,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(2)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.HISTORY_INSTANCE,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(3)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.CREATE,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(4)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.HISTORY_TYPE,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(5)?.code
        )

        assertEquals(
            expected = "http://fhir.hl7.org/base/StructureDefinition/7896271d-57f6-4231-89dc-dcc91eab2416",
            actual = data.rest?.get(0)?.resource?.get(0)?.profile?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.rest?.get(0)?.resource?.get(0)?.readHistory?.value
        )

        assertEquals(
            expected = "Organization",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchInclude?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/SearchParameter/Patient-identifier",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Only supports search by institution MRN",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "identifier",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchParamType.TOKEN,
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/SearchParameter/Patient-general-practitioner",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(1)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "general-practitioner",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchParamType.REFERENCE,
            actual = data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(1)?.type
        )

        assertEquals(
            expected = "Person",
            actual = data.rest?.get(0)?.resource?.get(0)?.searchRevInclude?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.rest?.get(0)?.resource?.get(0)?.type
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.rest?.get(0)?.resource?.get(0)?.updateCreate?.value
        )

        assertEquals(
            expected = ResourceVersionPolicy.VERSIONED_UPDATE,
            actual = data.rest?.get(0)?.resource?.get(0)?.versioning
        )

        assertEquals(
            expected = "IHRoaXMgYmxvYiBpcyBub3QgdmFsaWQ=",
            actual = data.rest?.get(0)?.security?.certificate?.get(0)?.blob
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/jwt",
            actual = data.rest?.get(0)?.security?.certificate?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.rest?.get(0)?.security?.cors?.value
        )

        assertEquals(
            expected = "See Smart on FHIR documentation",
            actual = data.rest?.get(0)?.security?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SMART-on-FHIR",
            actual = data.rest?.get(0)?.security?.service?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/restful-security-service",
            actual = data.rest?.get(0)?.security?.service?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EHR",
            actual = data.software?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-01-04",
            actual = data.software?.releaseDate?.value.toString()
        )

        assertEquals(
            expected = "0.00.020.2134",
            actual = data.software?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "ACME EHR capability statement",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:68D043B5-9ECF-4559-A57A-396E0D452311",
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
            expected = "20130510",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCapabilityStatement02() {
        // Given
        val sourceJson = loadAsString("stu3/capabilitystatement-phr-example.json")

        // When
        val data = parser.toFhir(CapabilityStatement::class, sourceJson)

        // Then
        assertCapabilityStatement02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCapabilityStatement02Step01(data: CapabilityStatement) {

        assertEquals(
            expected = UnknownContentCode.NO,
            actual = data.acceptUnknown
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-06-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Prototype Capability Statement for September 2013 Connectathon",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.fhirVer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "json",
            actual = data.format?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "xml",
            actual = data.format?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "phr",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CapabilityStatementKind.CAPABILITY,
            actual = data.kind
        )

        assertEquals(
            expected = "PHR Template",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Protoype server Capability Statement for September 2013 Connectathon",
            actual = data.rest?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RestfulCapabilityMode.SERVER,
            actual = data.rest?.get(0)?.mode
        )

        assertEquals(
            expected = FHIRRestfulInteractions.READ,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(0)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.SEARCH_TYPE,
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.code
        )

        assertEquals(
            expected = "When a client searches patients with no search criteria, they get a list of all patients they have access too. Servers may elect to offer additional search parameters, but this is not required",
            actual = data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.rest?.get(0)?.resource?.get(0)?.type
        )

        assertEquals(
            expected = FHIRRestfulInteractions.READ,
            actual = data.rest?.get(0)?.resource?.get(1)?.interaction?.get(0)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.SEARCH_TYPE,
            actual = data.rest?.get(0)?.resource?.get(1)?.interaction?.get(1)?.code
        )

        assertEquals(
            expected = "_id parameter always supported. For the connectathon, servers may elect which search parameters are supported",
            actual = data.rest?.get(0)?.resource?.get(1)?.searchParam?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "_id",
            actual = data.rest?.get(0)?.resource?.get(1)?.searchParam?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchParamType.TOKEN,
            actual = data.rest?.get(0)?.resource?.get(1)?.searchParam?.get(0)?.type
        )

        assertEquals(
            expected = ResourceType.DOCUMENTREFERENCE,
            actual = data.rest?.get(0)?.resource?.get(1)?.type
        )

        assertEquals(
            expected = FHIRRestfulInteractions.READ,
            actual = data.rest?.get(0)?.resource?.get(2)?.interaction?.get(0)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.SEARCH_TYPE,
            actual = data.rest?.get(0)?.resource?.get(2)?.interaction?.get(1)?.code
        )

        assertEquals(
            expected = "Standard _id parameter",
            actual = data.rest?.get(0)?.resource?.get(2)?.searchParam?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "_id",
            actual = data.rest?.get(0)?.resource?.get(2)?.searchParam?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchParamType.TOKEN,
            actual = data.rest?.get(0)?.resource?.get(2)?.searchParam?.get(0)?.type
        )

        assertEquals(
            expected = ResourceType.CONDITION,
            actual = data.rest?.get(0)?.resource?.get(2)?.type
        )

        assertEquals(
            expected = FHIRRestfulInteractions.READ,
            actual = data.rest?.get(0)?.resource?.get(3)?.interaction?.get(0)?.code
        )

        assertEquals(
            expected = FHIRRestfulInteractions.SEARCH_TYPE,
            actual = data.rest?.get(0)?.resource?.get(3)?.interaction?.get(1)?.code
        )

        assertEquals(
            expected = "Standard _id parameter",
            actual = data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "_id",
            actual = data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchParamType.TOKEN,
            actual = data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(0)?.type
        )

        assertEquals(
            expected = "which diagnostic discipline/department created the report",
            actual = data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(1)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "service",
            actual = data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchParamType.TOKEN,
            actual = data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(1)?.type
        )

        assertEquals(
            expected = ResourceType.DIAGNOSTICREPORT,
            actual = data.rest?.get(0)?.resource?.get(3)?.type
        )

        assertEquals(
            expected = "OAuth",
            actual = data.rest?.get(0)?.security?.service?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACME PHR Server",
            actual = data.software?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
