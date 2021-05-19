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
import care.data4life.hl7.fhir.r4.codesystem.CapabilityStatementKind
import care.data4life.hl7.fhir.r4.codesystem.ConditionalDeleteStatus
import care.data4life.hl7.fhir.r4.codesystem.ConditionalReadStatus
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.DocumentMode
import care.data4life.hl7.fhir.r4.codesystem.EventCapabilityMode
import care.data4life.hl7.fhir.r4.codesystem.FHIRRestfulInteractions
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.r4.codesystem.ResourceVersionPolicy
import care.data4life.hl7.fhir.r4.codesystem.RestfulCapabilityMode
import care.data4life.hl7.fhir.r4.codesystem.SearchParamType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CapabilityStatementTest.java
 *
 * A statement of system capabilities
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular
 * version of FHIR that may be used as a statement of actual server functionality or a statement of
 * required or desired server implementation.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CapabilityStatementTest {

    val parser = FhirR4Parser()

    @Test
    fun testCapabilityStatement01() {
        // Given
        val sourceJson = loadAsString("r4/capabilitystatement-example.json")

        // When
        val data = parser.toFhir(CapabilityStatement::class, sourceJson)

        // Then
        assertEquals(
            "System Administrator",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "wile@acme.org",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "Copyright © Acme Healthcare and GoodCorp EHR Systems",
            data.copyright
        )
        assertEquals(
            "2012-01-04",
            data.date?.value.toString()
        )
        assertEquals(
            "This is the FHIR capability statement for the main EHR at ACME for the private interface - it does not describe the public interface",
            data.description
        )
        assertEquals(
            "Basic rules for all documents in the EHR system",
            data.document?.get(0)?.documentation
        )
        assertEquals(
            DocumentMode.CONSUMER,
            data.document?.get(0)?.mode
        )
        assertEquals(
            "http://fhir.hl7.org/base/Profilebc054d23-75e1-4dc6-aca5-838b6b1ac81d/_history/b5fdd9fc-b021-4ea1-911a-721a60663796",
            data.document?.get(0)?.profile
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "4.0.1",
            data.fhirVer
        )
        assertEquals(
            "xml",
            data.format?.get(0)
        )
        assertEquals(
            "json",
            data.format?.get(1)
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "main EHR at ACME",
            data.implementation?.description
        )
        assertEquals(
            "http://10.2.3.4/fhir",
            data.implementation?.url
        )
        assertEquals(
            "http://hl7.org/fhir/us/lab",
            data.implementationGuide?.get(0)
        )
        assertEquals(
            "http://ihe.org/fhir/CapabilityStatement/pixm-client",
            data.instantiates?.get(0)
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "United States of America (the)",
            data.jurisdiction?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            CapabilityStatementKind.INSTANCE,
            data.kind
        )
        assertEquals(
            "ADT A08 equivalent for external system notifications",
            data.messaging?.get(0)?.documentation
        )
        assertEquals(
            "mllp:10.1.1.10:9234",
            data.messaging?.get(0)?.endpoint?.get(0)?.address
        )
        assertEquals(
            "mllp",
            data.messaging?.get(0)?.endpoint?.get(0)?.protocol?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/message-transport",
            data.messaging?.get(0)?.endpoint?.get(0)?.protocol?.system
        )
        assertEquals(
            "30".toLong(),
            data.messaging?.get(0)?.reliableCache?.value
        )
        assertEquals(
            "MessageDefinition/example",
            data.messaging?.get(0)?.supportedMessage?.get(0)?.definition
        )
        assertEquals(
            EventCapabilityMode.RECEIVER,
            data.messaging?.get(0)?.supportedMessage?.get(0)?.mode
        )
        assertEquals(
            "ACME-EHR",
            data.name
        )
        assertEquals(
            "application/xml-patch+xml",
            data.patchFormat?.get(0)
        )
        assertEquals(
            "application/json-patch+json",
            data.patchFormat?.get(1)
        )
        assertEquals(
            "ACME Corporation",
            data.publisher
        )
        assertEquals(
            "Main EHR capability statement, published for contracting and operational support",
            data.purpose
        )
        assertEquals(
            "http://hl7.org/fhir/CompartmentDefinition/patient",
            data.rest?.get(0)?.compartment?.get(0)
        )
        assertEquals(
            "Main FHIR endpoint for acem health",
            data.rest?.get(0)?.documentation
        )
        assertEquals(
            FHIRRestfulInteractions.TRANSACTION,
            data.rest?.get(0)?.interaction?.get(0)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.HISTORY_SYSTEM,
            data.rest?.get(0)?.interaction?.get(1)?.code
        )
        assertEquals(
            RestfulCapabilityMode.SERVER,
            data.rest?.get(0)?.mode
        )
        assertEquals(
            "True".toBoolean(),
            data.rest?.get(0)?.resource?.get(0)?.conditionalCreate?.value
        )
        assertEquals(
            ConditionalDeleteStatus.NOT_SUPPORTED,
            data.rest?.get(0)?.resource?.get(0)?.conditionalDelete
        )
        assertEquals(
            ConditionalReadStatus.FULL_SUPPORT,
            data.rest?.get(0)?.resource?.get(0)?.conditionalRead
        )
        assertEquals(
            "False".toBoolean(),
            data.rest?.get(0)?.resource?.get(0)?.conditionalUpdate?.value
        )
        assertEquals(
            "This server does not let the clients create identities.",
            data.rest?.get(0)?.resource?.get(0)?.documentation
        )
        assertEquals(
            FHIRRestfulInteractions.READ,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(0)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.VREAD,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.code
        )
        assertEquals(
            "Only supported for patient records since 12-Dec 2012",
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.documentation
        )
        assertEquals(
            FHIRRestfulInteractions.UPDATE,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(2)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.HISTORY_INSTANCE,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(3)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.CREATE,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(4)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.HISTORY_TYPE,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(5)?.code
        )
        assertEquals(
            "http://registry.fhir.org/r4/StructureDefinition/7896271d-57f6-4231-89dc-dcc91eab2416",
            data.rest?.get(0)?.resource?.get(0)?.profile
        )
        assertEquals(
            "True".toBoolean(),
            data.rest?.get(0)?.resource?.get(0)?.readHistory?.value
        )
        assertEquals(
            "Organization",
            data.rest?.get(0)?.resource?.get(0)?.searchInclude?.get(0)
        )
        assertEquals(
            "http://hl7.org/fhir/SearchParameter/Patient-identifier",
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.definition
        )
        assertEquals(
            "Only supports search by institution MRN",
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.documentation
        )
        assertEquals(
            "identifier",
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.name
        )
        assertEquals(
            SearchParamType.TOKEN,
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(0)?.type
        )
        assertEquals(
            "http://hl7.org/fhir/SearchParameter/Patient-general-practitioner",
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(1)?.definition
        )
        assertEquals(
            "general-practitioner",
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(1)?.name
        )
        assertEquals(
            SearchParamType.REFERENCE,
            data.rest?.get(0)?.resource?.get(0)?.searchParam?.get(1)?.type
        )
        assertEquals(
            "Person",
            data.rest?.get(0)?.resource?.get(0)?.searchRevInclude?.get(0)
        )
        assertEquals(
            "http://registry.fhir.org/r4/StructureDefinition/00ab9e7a-06c7-4f77-9234-4154ca1e3347",
            data.rest?.get(0)?.resource?.get(0)?.supportedProfile?.get(0)
        )
        assertEquals(
            ResourceType.PATIENT,
            data.rest?.get(0)?.resource?.get(0)?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.rest?.get(0)?.resource?.get(0)?.updateCreate?.value
        )
        assertEquals(
            ResourceVersionPolicy.VERSIONED_UPDATE,
            data.rest?.get(0)?.resource?.get(0)?.versioning
        )
        assertEquals(
            "True".toBoolean(),
            data.rest?.get(0)?.security?.cors?.value
        )
        assertEquals(
            "See Smart on FHIR documentation",
            data.rest?.get(0)?.security?.description
        )
        assertEquals(
            "SMART-on-FHIR",
            data.rest?.get(0)?.security?.service?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/restful-security-service",
            data.rest?.get(0)?.security?.service?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "EHR",
            data.software?.name
        )
        assertEquals(
            "2012-01-04",
            data.software?.releaseDate?.value.toString()
        )
        assertEquals(
            "0.00.020.2134",
            data.software?.version
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "ACME EHR capability statement",
            data.title
        )
        assertEquals(
            "urn:uuid:68D043B5-9ECF-4559-A57A-396E0D452311",
            data.url
        )
        assertEquals(
            "focus",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "positive",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/variant-state",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "20130510",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCapabilityStatement02() {
        // Given
        val sourceJson = loadAsString("r4/capabilitystatement-phr-example.json")

        // When
        val data = parser.toFhir(CapabilityStatement::class, sourceJson)

        // Then
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2013-06-18",
            data.date?.value.toString()
        )
        assertEquals(
            "Prototype Capability Statement for September 2013 Connectathon",
            data.description
        )
        assertEquals(
            "4.0.1",
            data.fhirVer
        )
        assertEquals(
            "json",
            data.format?.get(0)
        )
        assertEquals(
            "xml",
            data.format?.get(1)
        )
        assertEquals(
            "phr",
            data.id
        )
        assertEquals(
            CapabilityStatementKind.CAPABILITY,
            data.kind
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
            "PHR Template",
            data.name
        )
        assertEquals(
            "FHIR Project",
            data.publisher
        )
        assertEquals(
            "Protoype server Capability Statement for September 2013 Connectathon",
            data.rest?.get(0)?.documentation
        )
        assertEquals(
            RestfulCapabilityMode.SERVER,
            data.rest?.get(0)?.mode
        )
        assertEquals(
            FHIRRestfulInteractions.READ,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(0)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.SEARCH_TYPE,
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.code
        )
        assertEquals(
            "When a client searches patients with no search criteria, they get a list of all patients they have access too. Servers may elect to offer additional search parameters, but this is not required",
            data.rest?.get(0)?.resource?.get(0)?.interaction?.get(1)?.documentation
        )
        assertEquals(
            ResourceType.PATIENT,
            data.rest?.get(0)?.resource?.get(0)?.type
        )
        assertEquals(
            FHIRRestfulInteractions.READ,
            data.rest?.get(0)?.resource?.get(1)?.interaction?.get(0)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.SEARCH_TYPE,
            data.rest?.get(0)?.resource?.get(1)?.interaction?.get(1)?.code
        )
        assertEquals(
            "_id parameter always supported. For the connectathon, servers may elect which search parameters are supported",
            data.rest?.get(0)?.resource?.get(1)?.searchParam?.get(0)?.documentation
        )
        assertEquals(
            "_id",
            data.rest?.get(0)?.resource?.get(1)?.searchParam?.get(0)?.name
        )
        assertEquals(
            SearchParamType.TOKEN,
            data.rest?.get(0)?.resource?.get(1)?.searchParam?.get(0)?.type
        )
        assertEquals(
            ResourceType.DOCUMENTREFERENCE,
            data.rest?.get(0)?.resource?.get(1)?.type
        )
        assertEquals(
            FHIRRestfulInteractions.READ,
            data.rest?.get(0)?.resource?.get(2)?.interaction?.get(0)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.SEARCH_TYPE,
            data.rest?.get(0)?.resource?.get(2)?.interaction?.get(1)?.code
        )
        assertEquals(
            "Standard _id parameter",
            data.rest?.get(0)?.resource?.get(2)?.searchParam?.get(0)?.documentation
        )
        assertEquals(
            "_id",
            data.rest?.get(0)?.resource?.get(2)?.searchParam?.get(0)?.name
        )
        assertEquals(
            SearchParamType.TOKEN,
            data.rest?.get(0)?.resource?.get(2)?.searchParam?.get(0)?.type
        )
        assertEquals(
            ResourceType.CONDITION,
            data.rest?.get(0)?.resource?.get(2)?.type
        )
        assertEquals(
            FHIRRestfulInteractions.READ,
            data.rest?.get(0)?.resource?.get(3)?.interaction?.get(0)?.code
        )
        assertEquals(
            FHIRRestfulInteractions.SEARCH_TYPE,
            data.rest?.get(0)?.resource?.get(3)?.interaction?.get(1)?.code
        )
        assertEquals(
            "Standard _id parameter",
            data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(0)?.documentation
        )
        assertEquals(
            "_id",
            data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(0)?.name
        )
        assertEquals(
            SearchParamType.TOKEN,
            data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(0)?.type
        )
        assertEquals(
            "which diagnostic discipline/department created the report",
            data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(1)?.documentation
        )
        assertEquals(
            "service",
            data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(1)?.name
        )
        assertEquals(
            SearchParamType.TOKEN,
            data.rest?.get(0)?.resource?.get(3)?.searchParam?.get(1)?.type
        )
        assertEquals(
            ResourceType.DIAGNOSTICREPORT,
            data.rest?.get(0)?.resource?.get(3)?.type
        )
        assertEquals(
            "OAuth",
            data.rest?.get(0)?.security?.service?.get(0)?.text
        )
        assertEquals(
            "ACME PHR Server",
            data.software?.name
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
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
