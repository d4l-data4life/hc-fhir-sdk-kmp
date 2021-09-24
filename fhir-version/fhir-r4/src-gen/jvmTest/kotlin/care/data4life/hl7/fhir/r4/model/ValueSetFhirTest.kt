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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.FilterOperator
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.QuantityComparator
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ValueSetTest.java
 *
 * A set of codes drawn from one or more code systems
 *
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended
 * for use in a particular context. Value sets link between [CodeSystem](codesystem.html) definitions
 * and their use in [coded elements](terminologies.html).
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ValueSetFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testValueSet01() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet01Step01(data: ValueSet) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.compose?.inactive?.value
        )

        assertEquals(
            expected = "14647-2",
            actual = data.compose?.include?.get(0)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Moles/Volume]",
            actual = data.compose?.include?.get(0)?.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2093-3",
            actual = data.compose?.include?.get(0)?.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass/Volume]",
            actual = data.compose?.include?.get(0)?.concept?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35200-5",
            actual = data.compose?.include?.get(0)?.concept?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass Or Moles/Volume]",
            actual = data.compose?.include?.get(0)?.concept?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9342-7",
            actual = data.compose?.include?.get(0)?.concept?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Percentile]",
            actual = data.compose?.include?.get(0)?.concept?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.36",
            actual = data.compose?.include?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-13",
            actual = data.compose?.lockedDate?.value.toString()
        )

        assertEquals(
            expected = "FHIR project team",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
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
            expected = "This content from LOINC ® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-extensional",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/identifiers/valuesets",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "loinc-cholesterol-int",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC Codes for Cholesterol in Serum/Plasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This value set was published by ACME Inc in order to make clear which codes are used for Cholesterol by AcmeClinicals (Adult Ambulatory care support in USA)",
            actual = data.purpose
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
            expected = "http://hl7.org/fhir/ValueSet/example-extensional",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "age",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a",
            actual = data.useContext?.get(0)?.valueQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuantityComparator.GREATER_THAN,
            actual = data.useContext?.get(0)?.valueQuantity?.comparator
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.useContext?.get(0)?.valueQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "yrs",
            actual = data.useContext?.get(0)?.valueQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18".toDouble(),
            actual = data.useContext?.get(0)?.valueQuantity?.value?.value
        )

        assertEquals(
            expected = "20150622",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet02() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-hierarchical.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet02Step01(data)
        assertValueSet02Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet02Step01(data: ValueSet) {

        assertEquals(
            expected = "invalid",
            actual = data.compose?.include?.get(0)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "structure",
            actual = data.compose?.include?.get(0)?.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "required",
            actual = data.compose?.include?.get(0)?.concept?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "value",
            actual = data.compose?.include?.get(0)?.concept?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "processing",
            actual = data.compose?.include?.get(0)?.concept?.get(4)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "duplicate",
            actual = data.compose?.include?.get(0)?.concept?.get(5)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "not-found",
            actual = data.compose?.include?.get(0)?.concept?.get(6)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "conflict",
            actual = data.compose?.include?.get(0)?.concept?.get(7)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lock",
            actual = data.compose?.include?.get(0)?.concept?.get(8)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "exception",
            actual = data.compose?.include?.get(0)?.concept?.get(9)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expand-rules",
            actual = data.compose?.include?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "groups-only",
            actual = data.compose?.include?.get(0)?.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "display",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "(Most common)",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "login",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "conflict",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            actual = data.compose?.include?.get(0)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "processing",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "duplicate",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "not-found",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            actual = data.compose?.include?.get(0)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "invalid",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "structure",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "required",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(3)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "value",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(3)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            actual = data.compose?.include?.get(0)?.extension?.get(3)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "transient",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lock",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "exception",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(3)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "throttled",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(3)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            actual = data.compose?.include?.get(0)?.extension?.get(4)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "security",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "login",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "member",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "unknown",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            actual = data.compose?.include?.get(0)?.extension?.get(5)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#hacked",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "hacked",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-07-20",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Demonstration of extensions that build a hierarchical contains",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(0)?.abstrakt?.value
        )

        assertEquals(
            expected = "login",
            actual = data.expansion?.contains?.get(0)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Login Required",
            actual = data.expansion?.contains?.get(0)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(0)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "conflict",
            actual = data.expansion?.contains?.get(0)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Edit Version Conflict",
            actual = data.expansion?.contains?.get(0)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(0)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "(Most common)",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "processing",
            actual = data.expansion?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "duplicate",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Duplicate",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "not-found",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Not Found",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Processing Failure",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(2)?.abstrakt?.value
        )

        assertEquals(
            expected = "invalid",
            actual = data.expansion?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "structure",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Structural Issue",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "required",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Required element missing",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "value",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Element value invalid",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Invalid Content",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(3)?.abstrakt?.value
        )

        assertEquals(
            expected = "transient",
            actual = data.expansion?.contains?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lock-error",
            actual = data.expansion?.contains?.get(3)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lock Error",
            actual = data.expansion?.contains?.get(3)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(3)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "exception",
            actual = data.expansion?.contains?.get(3)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Exception",
            actual = data.expansion?.contains?.get(3)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(3)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "throttled",
            actual = data.expansion?.contains?.get(3)?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Throttled",
            actual = data.expansion?.contains?.get(3)?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(3)?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Transient Issue",
            actual = data.expansion?.contains?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(3)?.system
                ?.replace("\\n", " ")
        )
    }

    private fun assertValueSet02Step02(data: ValueSet) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(4)?.abstrakt?.value
        )

        assertEquals(
            expected = "security",
            actual = data.expansion?.contains?.get(4)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "login",
            actual = data.expansion?.contains?.get(4)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Login Required",
            actual = data.expansion?.contains?.get(4)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(4)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "unknown",
            actual = data.expansion?.contains?.get(4)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Unknown User",
            actual = data.expansion?.contains?.get(4)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(4)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Security Problem",
            actual = data.expansion?.contains?.get(4)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/hacked",
            actual = data.expansion?.contains?.get(4)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "excludeNotForUI",
            actual = data.expansion?.parameter?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "false",
            actual = data.expansion?.parameter?.get(0)?.valueUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-07-20T23:14:07+10:00",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-hierarchical",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example Hierarchical ValueSet",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project team",
            actual = data.publisher
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
            expected = "http://hl7.org/fhir/ValueSet/example-hierarchical",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet03() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-expansion.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet03Step01(data: ValueSet) {

        assertEquals(
            expected = FilterOperator.EQUAL,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "parent",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LP43571-6",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "This content from LOINC® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14647-2",
            actual = data.expansion?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Moles/volume] in Serum or Plasma",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(1)?.abstrakt?.value
        )

        assertEquals(
            expected = "2093-3",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass/volume] in Serum or Plasma",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48620-9",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Mass/volume] in Serum or Plasma ultracentrifugate",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9342-7",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Percentile]",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(1)?.contains?.get(2)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol codes",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(2)?.abstrakt?.value
        )

        assertEquals(
            expected = "2096-6",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35200-5",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(1)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48089-7",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Apolipoprotein B [Molar ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(2)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "55838-7",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol/Phospholipid [Molar ratio] in Serum or Plasma",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.contains?.get(2)?.contains?.get(3)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol Ratios",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/valueset-expansionSource",
            actual = data.expansion?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/example-extensional",
            actual = data.expansion?.extension?.get(0)?.valueUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.expansion?.offset?.value
        )

        assertEquals(
            expected = "version",
            actual = data.expansion?.parameter?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.50",
            actual = data.expansion?.parameter?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22T13:56:07Z",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "8".toInt(),
            actual = data.expansion?.total?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-expansion",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC Codes for Cholesterol in Serum/Plasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project team",
            actual = data.publisher
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
            expected = "http://hl7.org/fhir/ValueSet/example-expansion",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20150622",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet04() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-inactive.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet04Step01(data: ValueSet) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.compose?.inactive?.value
        )

        assertEquals(
            expected = FilterOperator.DESCENDENT_OF,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "concept",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "_ActMoodPredicate",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 v3 ActMood Predicate codes, including inactive codes",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CRT",
            actual = data.expansion?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "criterion",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.expansion?.contains?.get(0)?.inactive?.value
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            actual = data.expansion?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EXPEC",
            actual = data.expansion?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GOL",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            actual = data.expansion?.contains?.get(1)?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RSK",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "risk",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            actual = data.expansion?.contains?.get(1)?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "expectation",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            actual = data.expansion?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OPT",
            actual = data.expansion?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "option",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            actual = data.expansion?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:46c00b3f-003a-4f31-9d4b-ea2de58b2a99",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-26T10:00:00Z",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "inactive",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example-inactive",
            actual = data.name
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
            expected = "Example with inactive codes",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/inactive",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet05() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-filter.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet05Step01(data: ValueSet) {

        assertEquals(
            expected = FilterOperator.EQUAL,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "acme-plasma",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "true",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/CodeSystem/example",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR project team",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
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
            expected = "2018-11-01",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "ACME Codes for Cholesterol: Plasma only - demonstrating the use of a filter defined in a CodeSystem",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-filter",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACMECholCodesPlasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
            actual = data.publisher
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
            expected = "ACME Codes for Cholesterol: Plasma only",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/example-filter",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet06() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-yesnodontknow.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet06Step01(data: ValueSet) {

        assertEquals(
            expected = "http://terminology.hl7.org/ValueSet/v2-0136",
            actual = data.compose?.include?.get(0)?.valueSet?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "asked-unknown",
            actual = data.compose?.include?.get(1)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Don't know",
            actual = data.compose?.include?.get(1)?.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/data-absent-reason",
            actual = data.compose?.include?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "For Capturing simple yes-no-don't know answers",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Y",
            actual = data.expansion?.contains?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.expansion?.contains?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0136",
            actual = data.expansion?.contains?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.expansion?.contains?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.expansion?.contains?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0136",
            actual = data.expansion?.contains?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "asked-unknown",
            actual = data.expansion?.contains?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Don't know",
            actual = data.expansion?.contains?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/data-absent-reason",
            actual = data.expansion?.contains?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:bf99fe50-2c2b-41ad-bd63-bee6919810b4",
            actual = data.expansion?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-07-14T10:00:00Z",
            actual = data.expansion?.timestamp?.value.toString()
        )

        assertEquals(
            expected = "yesnodontknow",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Yes/No/Don't Know",
            actual = data.name
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
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet07() {
        // Given
        val sourceJson = loadAsString("r4/valueset-examplescenario-actor-type.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet07Step01(data: ValueSet) {

        assertEquals(
            expected = "http://hl7.org/fhir/examplescenario-actor-type",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = "fhir@lists.hl7.org",
            actual = data.contact?.get(0)?.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2019-11-01T09:29:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "The type of actor - system or human.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "trial-use",
            actual = data.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.extension?.get(2)?.valueInteger?.value
        )

        assertEquals(
            expected = "examplescenario-actor-type",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.642.3.858",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.immutable?.value
        )

        assertEquals(
            expected = "2019-11-01T09:29:23.356+11:00",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ExampleScenarioActorType",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 (FHIR Project)",
            actual = data.publisher
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
            expected = "ExampleScenarioActorType",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/examplescenario-actor-type",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet08() {
        // Given
        val sourceJson = loadAsString("r4/valueset-list-example-codes.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet08Step01(data: ValueSet) {

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/list-example-use-codes",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "2019-11-01T09:29:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Example use codes for the List resource - typical kinds of use.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "draft",
            actual = data.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.extension?.get(2)?.valueInteger?.value
        )

        assertEquals(
            expected = "list-example-codes",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.642.3.316",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.immutable?.value
        )

        assertEquals(
            expected = "2019-11-01T09:29:23.356+11:00",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ExampleUseCodesForList",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project",
            actual = data.publisher
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
            expected = "Example Use Codes for List",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/list-example-codes",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testValueSet09() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-intensional.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertValueSet09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertValueSet09Step01(data: ValueSet) {

        assertEquals(
            expected = "5932-9",
            actual = data.compose?.exclude?.get(0)?.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cholesterol [Presence] in Blood by Test strip",
            actual = data.compose?.exclude?.get(0)?.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.exclude?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FilterOperator.EQUAL,
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.op
        )

        assertEquals(
            expected = "parent",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LP43571-6",
            actual = data.compose?.include?.get(0)?.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.compose?.include?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR project team",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
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
            expected = "This content from LOINCÂ® is copyright Â© 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-intensional",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/identifiers/valuesets",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "loinc-cholesterol-ext",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LOINC Codes for Cholesterol in Serum/Plasma",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
            actual = data.publisher
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
            expected = "http://hl7.org/fhir/ValueSet/example-intensional",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20150622",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
