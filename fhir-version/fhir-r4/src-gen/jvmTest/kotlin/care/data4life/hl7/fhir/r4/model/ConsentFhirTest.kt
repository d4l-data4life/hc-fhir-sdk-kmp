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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

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
class ConsentFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testConsent01() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notThis.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent01Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-notThis",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentDataMeaning.RELATED,
            actual = data.provision?.data?.get(0)?.meaning
        )

        assertEquals(
            expected = "Task/example3",
            actual = data.provision?.data?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent02() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-smartonfhir.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent02Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-23T17:02:33+10:00",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-smartonfhir",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RelatedPerson/peter",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-23T17:32:33+10:00",
            actual = data.provision?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-06-23T17:02:33+10:00",
            actual = data.provision?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationRequest",
            actual = data.provision?.provision?.get(0)?.clazz?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.provision?.provision?.get(0)?.clazz?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentProvisionType.PERMIT,
            actual = data.provision?.provision?.get(0)?.type
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent03() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notAuthor.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent03Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-notAuthor",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CST",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent04() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notTime.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent04Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-notTime",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-01",
            actual = data.provision?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-01",
            actual = data.provision?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent05() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-signature.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent05Step01(data: Consent) {
        assertEquals(
            expected = "npp",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentcategorycodes",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-05-26T00:41:10-04:00",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-signature",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.3.72.5.9.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "494e0c7a-a69e-4fb4-9d02-6aae747790d7",
            actual = data.identifier?.get(0)?.value
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/72",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/72",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/13",
            actual = data.provision?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-10",
            actual = data.provision?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-10-10",
            actual = data.provision?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.provision?.provision?.get(0)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AUT",
            actual = data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/hl7-cda+xml",
            actual = data.provision?.provision?.get(0)?.clazz?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:13",
            actual = data.provision?.provision?.get(0)?.clazz?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "34133-9",
            actual = data.provision?.provision?.get(0)?.code?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.provision?.provision?.get(0)?.code?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18842-5",
            actual = data.provision?.provision?.get(0)?.code?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.provision?.provision?.get(0)?.code?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentProvisionType.PERMIT,
            actual = data.provision?.provision?.get(0)?.type
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent06() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notThem.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent06Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-notThem",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "correct",
            actual = data.provision?.action?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.action?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fictive Nurse",
            actual = data.provision?.actor?.get(0)?.reference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f204",
            actual = data.provision?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent07() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-grantor.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent07Step01(data: Consent) {
        assertEquals(
            expected = "INFAO",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-grantor",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTOUT",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CST",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.provision?.actor?.get(1)?.reference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.provision?.actor?.get(1)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.actor?.get(1)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(1)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent08() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-notOrg.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent08Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-notOrg",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "correct",
            actual = data.provision?.action?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.action?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentProvisionType.DENY,
            actual = data.provision?.type
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent09() {
        // Given
        val sourceJson = loadAsString("r4/consent-example-pkb.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent09Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-16",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-pkb",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "...example patient...",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTOUT",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(0)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(0)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(0)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PSY",
            actual = data.provision?.provision?.get(0)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(0)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(1)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(1)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(1)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(1)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(1)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SPI",
            actual = data.provision?.provision?.get(1)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(1)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(2)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(2)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(2)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(2)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(2)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.provision?.provision?.get(2)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            actual = data.provision?.provision?.get(2)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(3)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(3)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(3)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(3)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(3)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PSY",
            actual = data.provision?.provision?.get(3)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(3)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(4)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(4)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(4)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(4)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(4)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SPI",
            actual = data.provision?.provision?.get(4)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(4)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(5)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(5)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(5)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(5)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(5)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SEX",
            actual = data.provision?.provision?.get(5)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(5)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(6)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(6)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(6)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(6)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(6)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.provision?.provision?.get(6)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            actual = data.provision?.provision?.get(6)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(7)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(7)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(7)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(7)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(7)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PSY",
            actual = data.provision?.provision?.get(7)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(7)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(8)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(8)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(8)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(8)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(8)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SPI",
            actual = data.provision?.provision?.get(8)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(8)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "access",
            actual = data.provision?.provision?.get(9)?.action?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentaction",
            actual = data.provision?.provision?.get(9)?.action?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.provision?.provision?.get(9)?.actor?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRCP",
            actual = data.provision?.provision?.get(9)?.actor?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.provision?.provision?.get(9)?.actor?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SEX",
            actual = data.provision?.provision?.get(9)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.provision?.provision?.get(9)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.provision?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            actual = data.provision?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testConsent10() {
        // Given
        val sourceJson = loadAsString("r4/consent-example.json")

        // When
        val data = parser.toFhir(Consent::class, sourceJson)

        // Then
        assertConsent10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConsent10Step01(data: Consent) {
        assertEquals(
            expected = "59284-0",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-05-11",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "consent-example-basic",
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
            expected = "Organization/f001",
            actual = data.organization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.policyRule?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.policyRule?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.provision?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "1964-01-01",
            actual = data.provision?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "patient-privacy",
            actual = data.scope?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentscope",
            actual = data.scope?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.sourceAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConsentState.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
