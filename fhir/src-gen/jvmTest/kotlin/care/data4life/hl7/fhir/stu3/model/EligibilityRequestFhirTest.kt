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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EligibilityRequestTest.java
 *
 * Determine insurance validity and scope of coverage
 *
 * The EligibilityRequest provides patient and insurance coverage information to an insurer for them to
 * respond, in the form of an EligibilityResponse, with information regarding whether the stated
 * coverage is valid and in-force and optionally to provide the insurance details of the policy.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EligibilityRequestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testEligibilityRequest01() {
        // Given
        val sourceJson = loadAsString("stu3/eligibilityrequest-example-2.json")

        // When
        val data = parser.toFhir(EligibilityRequest::class, sourceJson)

        // Then
        assertEligibilityRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEligibilityRequest01Step01(data: EligibilityRequest) {

        assertEquals(
            expected = "medical",
            actual = data.benefitCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.benefitCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "69",
            actual = data.benefitSubCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Maternity",
            actual = data.benefitSubCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.benefitSubCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NB8742",
            actual = data.businessArrangement
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "http://happyvalleyclinic.com/staff",
            actual = data.enterer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14",
            actual = data.enterer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://statecliniclicensor.com/clinicid",
            actual = data.facility?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G35B9",
            actual = data.facility?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52346",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/elegibilityrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52346",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalleyclinic.com/staff",
            actual = data.provider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18",
            actual = data.provider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EligibilityRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEligibilityRequest02() {
        // Given
        val sourceJson = loadAsString("stu3/eligibilityrequest-example.json")

        // When
        val data = parser.toFhir(EligibilityRequest::class, sourceJson)

        // Then
        assertEligibilityRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEligibilityRequest02Step01(data: EligibilityRequest) {

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "52345",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/elegibilityrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EligibilityRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
