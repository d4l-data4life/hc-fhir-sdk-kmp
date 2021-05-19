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
import care.data4life.hl7.fhir.r4.codesystem.ConsentDataMeaning
import care.data4life.hl7.fhir.r4.codesystem.ConsentProvisionType
import care.data4life.hl7.fhir.r4.codesystem.ConsentState
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ConsentTest.java
 *
 * A healthcare consumer's  choices to permit or deny recipients or roles to perform actions for specific purposes and periods of time
 *
 * A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or
 * recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ConsentTest {

    val parser = FhirR4Parser()

    @Test
    fun testConsent01() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notThis.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-11-18",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-notThis",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            ConsentDataMeaning.RELATED,
            data.provision?.data?.get(0)?.meaning
        )
        assertEquals(
            "Task/example3",
            data.provision?.data?.get(0)?.reference?.reference
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent02() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-smartonfhir.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-06-23T17:02:33+10:00",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-smartonfhir",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "Patient/xcda",
            data.patient?.reference
        )
        assertEquals(
            "RelatedPerson/peter",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-06-23T17:32:33+10:00",
            data.provision?.period?.end?.value.toString()
        )
        assertEquals(
            "2016-06-23T17:02:33+10:00",
            data.provision?.period?.start?.value.toString()
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "MedicationRequest",
            data.provision?.provision?.get(0)?.clazz?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/resource-types",
            data.provision?.provision?.get(0)?.clazz?.get(0)?.system
        )
        assertEquals(
            ConsentProvisionType.PERMIT,
            data.provision?.provision?.get(0)?.type
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent03() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notAuthor.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-11-18",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-notAuthor",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "CST",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent04() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notTime.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-11-18",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-notTime",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-02-01",
            data.provision?.period?.end?.value.toString()
        )
        assertEquals(
            "2015-01-01",
            data.provision?.period?.start?.value.toString()
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent05() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-signature.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "npp",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentcategorycodes",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-05-26T00:41:10-04:00",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-signature",
            data.id
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.72.5.9.1",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "494e0c7a-a69e-4fb4-9d02-6aae747790d7",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "Patient/72",
            data.patient?.reference
        )
        assertEquals(
            "Patient/72",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/13",
            data.provision?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-10-10",
            data.provision?.period?.end?.value.toString()
        )
        assertEquals(
            "2015-10-10",
            data.provision?.period?.start?.value.toString()
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.provision?.provision?.get(0)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "AUT",
            data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "application/hl7-cda+xml",
            data.provision?.provision?.get(0)?.clazz?.get(0)?.code
        )
        assertEquals(
            "urn:ietf:bcp:13",
            data.provision?.provision?.get(0)?.clazz?.get(0)?.system
        )
        assertEquals(
            "34133-9",
            data.provision?.provision?.get(0)?.code?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.provision?.provision?.get(0)?.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "18842-5",
            data.provision?.provision?.get(0)?.code?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.provision?.provision?.get(0)?.code?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            ConsentProvisionType.PERMIT,
            data.provision?.provision?.get(0)?.type
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent06() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notThem.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-11-18",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-notThem",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "correct",
            data.provision?.action?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.action?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "Fictive Nurse",
            data.provision?.actor?.get(0)?.reference?.display
        )
        assertEquals(
            "Practitioner/f204",
            data.provision?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent07() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-grantor.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "INFAO",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-11-18",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-grantor",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTOUT",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "CST",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "Good Health Clinic",
            data.provision?.actor?.get(1)?.reference?.display
        )
        assertEquals(
            "Patient/example",
            data.provision?.actor?.get(1)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.actor?.get(1)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(1)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent08() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notOrg.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-11-18",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-notOrg",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "correct",
            data.provision?.action?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.action?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            ConsentProvisionType.DENY,
            data.provision?.type
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent09() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-pkb.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-06-16",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-pkb",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "...example patient...",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "OPTOUT",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(0)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "PSY",
            data.provision?.provision?.get(0)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(0)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(1)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(1)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(1)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(1)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(1)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "SPI",
            data.provision?.provision?.get(1)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(1)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(2)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(2)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(2)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(2)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(2)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "N",
            data.provision?.provision?.get(2)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            data.provision?.provision?.get(2)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(3)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(3)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(3)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(3)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(3)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "PSY",
            data.provision?.provision?.get(3)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(3)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(4)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(4)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(4)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(4)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(4)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "SPI",
            data.provision?.provision?.get(4)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(4)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(5)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(5)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(5)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(5)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(5)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "SEX",
            data.provision?.provision?.get(5)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(5)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(6)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(6)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(6)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(6)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(6)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "N",
            data.provision?.provision?.get(6)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            data.provision?.provision?.get(6)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(7)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(7)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(7)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(7)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(7)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "PSY",
            data.provision?.provision?.get(7)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(7)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(8)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(8)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(8)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(8)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(8)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "SPI",
            data.provision?.provision?.get(8)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(8)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "access",
            data.provision?.provision?.get(9)?.action?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentaction",
            data.provision?.provision?.get(9)?.action?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/f001",
            data.provision?.provision?.get(9)?.actor?.get(0)?.reference?.reference
        )
        assertEquals(
            "PRCP",
            data.provision?.provision?.get(9)?.actor?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.provision?.provision?.get(9)?.actor?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "SEX",
            data.provision?.provision?.get(9)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.provision?.provision?.get(9)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "N",
            data.provision?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            data.provision?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            ConsentState.ACTIVE,
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

    @Test
    fun testConsent10() {
        // Given
        val sourceJson = loadAsString("r4/consent-example.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertEquals(
            "59284-0",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-05-11",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "consent-example-basic",
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
            "Organization/f001",
            data.organization?.get(0)?.reference
        )
        assertEquals(
            "P. van de Heuvel",
            data.patient?.display
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "OPTIN",
            data.policyRule?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.policyRule?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-01-01",
            data.provision?.period?.end?.value.toString()
        )
        assertEquals(
            "1964-01-01",
            data.provision?.period?.start?.value.toString()
        )
        assertEquals(
            "patient-privacy",
            data.scope?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentscope",
            data.scope?.coding?.get(0)?.system
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.sourceAttachment?.title
        )
        assertEquals(
            ConsentState.ACTIVE,
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
