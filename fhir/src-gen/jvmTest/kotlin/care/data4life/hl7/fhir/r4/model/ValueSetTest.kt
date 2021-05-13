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
class ValueSetTest {

    val parser = FhirR4Parser()

    @Test
    fun testValueSet01() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.compose?.inactive?.value
        )
        assertEquals(
            "14647-2",
            data.compose?.include?.get(0)?.concept?.get(0)?.code
        )
        assertEquals(
            "Cholesterol [Moles/Volume]",
            data.compose?.include?.get(0)?.concept?.get(0)?.display
        )
        assertEquals(
            "2093-3",
            data.compose?.include?.get(0)?.concept?.get(1)?.code
        )
        assertEquals(
            "Cholesterol [Mass/Volume]",
            data.compose?.include?.get(0)?.concept?.get(1)?.display
        )
        assertEquals(
            "35200-5",
            data.compose?.include?.get(0)?.concept?.get(2)?.code
        )
        assertEquals(
            "Cholesterol [Mass Or Moles/Volume]",
            data.compose?.include?.get(0)?.concept?.get(2)?.display
        )
        assertEquals(
            "9342-7",
            data.compose?.include?.get(0)?.concept?.get(3)?.code
        )
        assertEquals(
            "Cholesterol [Percentile]",
            data.compose?.include?.get(0)?.concept?.get(3)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            "2.36",
            data.compose?.include?.get(0)?.version
        )
        assertEquals(
            "2012-06-13",
            data.compose?.lockedDate?.value.toString()
        )
        assertEquals(
            "FHIR project team",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "This content from LOINC ® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.",
            data.copyright
        )
        assertEquals(
            "2015-06-22",
            data.date?.value.toString()
        )
        assertEquals(
            "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example-extensional",
            data.id
        )
        assertEquals(
            "http://acme.com/identifiers/valuesets",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "loinc-cholesterol-int",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "LOINC Codes for Cholesterol in Serum/Plasma",
            data.name
        )
        assertEquals(
            "HL7 International",
            data.publisher
        )
        assertEquals(
            "This value set was published by ACME Inc in order to make clear which codes are used for Cholesterol by AcmeClinicals (Adult Ambulatory care support in USA)",
            data.purpose
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
            "http://hl7.org/fhir/ValueSet/example-extensional",
            data.url
        )
        assertEquals(
            "age",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "a",
            data.useContext?.get(0)?.valueQuantity?.code
        )
        assertEquals(
            QuantityComparator.GREATER_THAN,
            data.useContext?.get(0)?.valueQuantity?.comparator
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.useContext?.get(0)?.valueQuantity?.system
        )
        assertEquals(
            "yrs",
            data.useContext?.get(0)?.valueQuantity?.unit
        )
        assertEquals(
            "18".toDouble(),
            data.useContext?.get(0)?.valueQuantity?.value?.value
        )
        assertEquals(
            "20150622",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet02() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-hierarchical.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "invalid",
            data.compose?.include?.get(0)?.concept?.get(0)?.code
        )
        assertEquals(
            "structure",
            data.compose?.include?.get(0)?.concept?.get(1)?.code
        )
        assertEquals(
            "required",
            data.compose?.include?.get(0)?.concept?.get(2)?.code
        )
        assertEquals(
            "value",
            data.compose?.include?.get(0)?.concept?.get(3)?.code
        )
        assertEquals(
            "processing",
            data.compose?.include?.get(0)?.concept?.get(4)?.code
        )
        assertEquals(
            "duplicate",
            data.compose?.include?.get(0)?.concept?.get(5)?.code
        )
        assertEquals(
            "not-found",
            data.compose?.include?.get(0)?.concept?.get(6)?.code
        )
        assertEquals(
            "conflict",
            data.compose?.include?.get(0)?.concept?.get(7)?.code
        )
        assertEquals(
            "lock",
            data.compose?.include?.get(0)?.concept?.get(8)?.code
        )
        assertEquals(
            "exception",
            data.compose?.include?.get(0)?.concept?.get(9)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expand-rules",
            data.compose?.include?.get(0)?.extension?.get(0)?.url
        )
        assertEquals(
            "groups-only",
            data.compose?.include?.get(0)?.extension?.get(0)?.valueCode
        )
        assertEquals(
            "display",
            data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(0)?.url
        )
        assertEquals(
            "(Most common)",
            data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(1)?.url
        )
        assertEquals(
            "login",
            data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(1)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(2)?.url
        )
        assertEquals(
            "conflict",
            data.compose?.include?.get(0)?.extension?.get(1)?.extension?.get(2)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            data.compose?.include?.get(0)?.extension?.get(1)?.url
        )
        assertEquals(
            "code",
            data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(0)?.url
        )
        assertEquals(
            "processing",
            data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(0)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(1)?.url
        )
        assertEquals(
            "duplicate",
            data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(1)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(2)?.url
        )
        assertEquals(
            "not-found",
            data.compose?.include?.get(0)?.extension?.get(2)?.extension?.get(2)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            data.compose?.include?.get(0)?.extension?.get(2)?.url
        )
        assertEquals(
            "code",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(0)?.url
        )
        assertEquals(
            "invalid",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(0)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(1)?.url
        )
        assertEquals(
            "structure",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(1)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(2)?.url
        )
        assertEquals(
            "required",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(2)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(3)?.url
        )
        assertEquals(
            "value",
            data.compose?.include?.get(0)?.extension?.get(3)?.extension?.get(3)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            data.compose?.include?.get(0)?.extension?.get(3)?.url
        )
        assertEquals(
            "code",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(0)?.url
        )
        assertEquals(
            "transient",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(0)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(1)?.url
        )
        assertEquals(
            "lock",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(1)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(2)?.url
        )
        assertEquals(
            "exception",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(2)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(3)?.url
        )
        assertEquals(
            "throttled",
            data.compose?.include?.get(0)?.extension?.get(4)?.extension?.get(3)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            data.compose?.include?.get(0)?.extension?.get(4)?.url
        )
        assertEquals(
            "code",
            data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(0)?.url
        )
        assertEquals(
            "security",
            data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(0)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(1)?.url
        )
        assertEquals(
            "login",
            data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(1)?.valueCode
        )
        assertEquals(
            "member",
            data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(2)?.url
        )
        assertEquals(
            "unknown",
            data.compose?.include?.get(0)?.extension?.get(5)?.extension?.get(2)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expand-group",
            data.compose?.include?.get(0)?.extension?.get(5)?.url
        )
        assertEquals(
            "#hacked",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "hacked",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "2018-07-20",
            data.date?.value.toString()
        )
        assertEquals(
            "Demonstration of extensions that build a hierarchical contains",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(0)?.`abstract`?.value
        )
        assertEquals(
            "login",
            data.expansion?.contains?.get(0)?.contains?.get(0)?.code
        )
        assertEquals(
            "Login Required",
            data.expansion?.contains?.get(0)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(0)?.contains?.get(0)?.system
        )
        assertEquals(
            "conflict",
            data.expansion?.contains?.get(0)?.contains?.get(1)?.code
        )
        assertEquals(
            "Edit Version Conflict",
            data.expansion?.contains?.get(0)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(0)?.contains?.get(1)?.system
        )
        assertEquals(
            "(Most common)",
            data.expansion?.contains?.get(0)?.display
        )
        assertEquals(
            "processing",
            data.expansion?.contains?.get(1)?.code
        )
        assertEquals(
            "duplicate",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.code
        )
        assertEquals(
            "Duplicate",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.system
        )
        assertEquals(
            "not-found",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.code
        )
        assertEquals(
            "Not Found",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.system
        )
        assertEquals(
            "Processing Failure",
            data.expansion?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(1)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(2)?.`abstract`?.value
        )
        assertEquals(
            "invalid",
            data.expansion?.contains?.get(2)?.code
        )
        assertEquals(
            "structure",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.code
        )
        assertEquals(
            "Structural Issue",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.system
        )
        assertEquals(
            "required",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.code
        )
        assertEquals(
            "Required element missing",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.system
        )
        assertEquals(
            "value",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.code
        )
        assertEquals(
            "Element value invalid",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.system
        )
        assertEquals(
            "Invalid Content",
            data.expansion?.contains?.get(2)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(2)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(3)?.`abstract`?.value
        )
        assertEquals(
            "transient",
            data.expansion?.contains?.get(3)?.code
        )
        assertEquals(
            "lock-error",
            data.expansion?.contains?.get(3)?.contains?.get(0)?.code
        )
        assertEquals(
            "Lock Error",
            data.expansion?.contains?.get(3)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(3)?.contains?.get(0)?.system
        )
        assertEquals(
            "exception",
            data.expansion?.contains?.get(3)?.contains?.get(1)?.code
        )
        assertEquals(
            "Exception",
            data.expansion?.contains?.get(3)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(3)?.contains?.get(1)?.system
        )
        assertEquals(
            "throttled",
            data.expansion?.contains?.get(3)?.contains?.get(2)?.code
        )
        assertEquals(
            "Throttled",
            data.expansion?.contains?.get(3)?.contains?.get(2)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(3)?.contains?.get(2)?.system
        )
        assertEquals(
            "Transient Issue",
            data.expansion?.contains?.get(3)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(3)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(4)?.`abstract`?.value
        )
        assertEquals(
            "security",
            data.expansion?.contains?.get(4)?.code
        )
        assertEquals(
            "login",
            data.expansion?.contains?.get(4)?.contains?.get(0)?.code
        )
        assertEquals(
            "Login Required",
            data.expansion?.contains?.get(4)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(4)?.contains?.get(0)?.system
        )
        assertEquals(
            "unknown",
            data.expansion?.contains?.get(4)?.contains?.get(1)?.code
        )
        assertEquals(
            "Unknown User",
            data.expansion?.contains?.get(4)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(4)?.contains?.get(1)?.system
        )
        assertEquals(
            "Security Problem",
            data.expansion?.contains?.get(4)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/hacked",
            data.expansion?.contains?.get(4)?.system
        )
        assertEquals(
            "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc",
            data.expansion?.identifier
        )
        assertEquals(
            "excludeNotForUI",
            data.expansion?.parameter?.get(0)?.name
        )
        assertEquals(
            "false",
            data.expansion?.parameter?.get(0)?.valueUri
        )
        assertEquals(
            "2018-07-20T23:14:07+10:00",
            data.expansion?.timestamp?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example-hierarchical",
            data.id
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "Example Hierarchical ValueSet",
            data.name
        )
        assertEquals(
            "FHIR Project team",
            data.publisher
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
            "http://hl7.org/fhir/ValueSet/example-hierarchical",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet03() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-expansion.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            FilterOperator.EQUAL,
            data.compose?.include?.get(0)?.filter?.get(0)?.op
        )
        assertEquals(
            "parent",
            data.compose?.include?.get(0)?.filter?.get(0)?.property
        )
        assertEquals(
            "LP43571-6",
            data.compose?.include?.get(0)?.filter?.get(0)?.value
        )
        assertEquals(
            "http://loinc.org",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "This content from LOINC® is copyright © 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use.",
            data.copyright
        )
        assertEquals(
            "2015-06-22",
            data.date?.value.toString()
        )
        assertEquals(
            "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            data.description
        )
        assertEquals(
            "14647-2",
            data.expansion?.contains?.get(0)?.code
        )
        assertEquals(
            "Cholesterol [Moles/volume] in Serum or Plasma",
            data.expansion?.contains?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(0)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(0)?.version
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(1)?.`abstract`?.value
        )
        assertEquals(
            "2093-3",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.code
        )
        assertEquals(
            "Cholesterol [Mass/volume] in Serum or Plasma",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.version
        )
        assertEquals(
            "48620-9",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.code
        )
        assertEquals(
            "Cholesterol [Mass/volume] in Serum or Plasma ultracentrifugate",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.version
        )
        assertEquals(
            "9342-7",
            data.expansion?.contains?.get(1)?.contains?.get(2)?.code
        )
        assertEquals(
            "Cholesterol [Percentile]",
            data.expansion?.contains?.get(1)?.contains?.get(2)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(1)?.contains?.get(2)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(1)?.contains?.get(2)?.version
        )
        assertEquals(
            "Cholesterol codes",
            data.expansion?.contains?.get(1)?.display
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(2)?.`abstract`?.value
        )
        assertEquals(
            "2096-6",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.code
        )
        assertEquals(
            "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(2)?.contains?.get(0)?.version
        )
        assertEquals(
            "35200-5",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.code
        )
        assertEquals(
            "Cholesterol/Triglyceride [Mass Ratio] in Serum or Plasma",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(2)?.contains?.get(1)?.version
        )
        assertEquals(
            "48089-7",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.code
        )
        assertEquals(
            "Cholesterol/Apolipoprotein B [Molar ratio] in Serum or Plasma",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(2)?.contains?.get(2)?.version
        )
        assertEquals(
            "55838-7",
            data.expansion?.contains?.get(2)?.contains?.get(3)?.code
        )
        assertEquals(
            "Cholesterol/Phospholipid [Molar ratio] in Serum or Plasma",
            data.expansion?.contains?.get(2)?.contains?.get(3)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.expansion?.contains?.get(2)?.contains?.get(3)?.system
        )
        assertEquals(
            "2.50",
            data.expansion?.contains?.get(2)?.contains?.get(3)?.version
        )
        assertEquals(
            "Cholesterol Ratios",
            data.expansion?.contains?.get(2)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/valueset-expansionSource",
            data.expansion?.extension?.get(0)?.url
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/example-extensional",
            data.expansion?.extension?.get(0)?.valueUri
        )
        assertEquals(
            "urn:uuid:42316ff8-2714-4680-9980-f37a6d1a71bc",
            data.expansion?.identifier
        )
        assertEquals(
            "0".toInt(),
            data.expansion?.offset?.value
        )
        assertEquals(
            "version",
            data.expansion?.parameter?.get(0)?.name
        )
        assertEquals(
            "2.50",
            data.expansion?.parameter?.get(0)?.valueString
        )
        assertEquals(
            "2015-06-22T13:56:07Z",
            data.expansion?.timestamp?.value.toString()
        )
        assertEquals(
            "8".toInt(),
            data.expansion?.total?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example-expansion",
            data.id
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "LOINC Codes for Cholesterol in Serum/Plasma",
            data.name
        )
        assertEquals(
            "FHIR Project team",
            data.publisher
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
            "http://hl7.org/fhir/ValueSet/example-expansion",
            data.url
        )
        assertEquals(
            "20150622",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet04() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-inactive.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.compose?.inactive?.value
        )
        assertEquals(
            FilterOperator.DESCENDENT_OF,
            data.compose?.include?.get(0)?.filter?.get(0)?.op
        )
        assertEquals(
            "concept",
            data.compose?.include?.get(0)?.filter?.get(0)?.property
        )
        assertEquals(
            "_ActMoodPredicate",
            data.compose?.include?.get(0)?.filter?.get(0)?.value
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            "HL7 v3 ActMood Predicate codes, including inactive codes",
            data.description
        )
        assertEquals(
            "CRT",
            data.expansion?.contains?.get(0)?.code
        )
        assertEquals(
            "criterion",
            data.expansion?.contains?.get(0)?.display
        )
        assertEquals(
            "True".toBoolean(),
            data.expansion?.contains?.get(0)?.inactive?.value
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            data.expansion?.contains?.get(0)?.system
        )
        assertEquals(
            "EXPEC",
            data.expansion?.contains?.get(1)?.code
        )
        assertEquals(
            "GOL",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.code
        )
        assertEquals(
            "goal",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            data.expansion?.contains?.get(1)?.contains?.get(0)?.system
        )
        assertEquals(
            "RSK",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.code
        )
        assertEquals(
            "risk",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.system
        )
        assertEquals(
            "expectation",
            data.expansion?.contains?.get(1)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            data.expansion?.contains?.get(1)?.system
        )
        assertEquals(
            "OPT",
            data.expansion?.contains?.get(2)?.code
        )
        assertEquals(
            "option",
            data.expansion?.contains?.get(2)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActMood",
            data.expansion?.contains?.get(2)?.system
        )
        assertEquals(
            "urn:uuid:46c00b3f-003a-4f31-9d4b-ea2de58b2a99",
            data.expansion?.identifier
        )
        assertEquals(
            "2017-02-26T10:00:00Z",
            data.expansion?.timestamp?.value.toString()
        )
        assertEquals(
            "inactive",
            data.id
        )
        assertEquals(
            "Example-inactive",
            data.name
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
            "Example with inactive codes",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/inactive",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet05() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-filter.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            FilterOperator.EQUAL,
            data.compose?.include?.get(0)?.filter?.get(0)?.op
        )
        assertEquals(
            "acme-plasma",
            data.compose?.include?.get(0)?.filter?.get(0)?.property
        )
        assertEquals(
            "true",
            data.compose?.include?.get(0)?.filter?.get(0)?.value
        )
        assertEquals(
            "http://hl7.org/fhir/CodeSystem/example",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            "FHIR project team",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2018-11-01",
            data.date?.value.toString()
        )
        assertEquals(
            "ACME Codes for Cholesterol: Plasma only - demonstrating the use of a filter defined in a CodeSystem",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example-filter",
            data.id
        )
        assertEquals(
            "ACMECholCodesPlasma",
            data.name
        )
        assertEquals(
            "HL7 International",
            data.publisher
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
            "ACME Codes for Cholesterol: Plasma only",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/example-filter",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet06() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-yesnodontknow.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "http://terminology.hl7.org/ValueSet/v2-0136",
            data.compose?.include?.get(0)?.valueSet?.get(0)
        )
        assertEquals(
            "asked-unknown",
            data.compose?.include?.get(1)?.concept?.get(0)?.code
        )
        assertEquals(
            "Don't know",
            data.compose?.include?.get(1)?.concept?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/data-absent-reason",
            data.compose?.include?.get(1)?.system
        )
        assertEquals(
            "For Capturing simple yes-no-don't know answers",
            data.description
        )
        assertEquals(
            "Y",
            data.expansion?.contains?.get(0)?.code
        )
        assertEquals(
            "Yes",
            data.expansion?.contains?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0136",
            data.expansion?.contains?.get(0)?.system
        )
        assertEquals(
            "N",
            data.expansion?.contains?.get(1)?.code
        )
        assertEquals(
            "No",
            data.expansion?.contains?.get(1)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0136",
            data.expansion?.contains?.get(1)?.system
        )
        assertEquals(
            "asked-unknown",
            data.expansion?.contains?.get(2)?.code
        )
        assertEquals(
            "Don't know",
            data.expansion?.contains?.get(2)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/data-absent-reason",
            data.expansion?.contains?.get(2)?.system
        )
        assertEquals(
            "urn:uuid:bf99fe50-2c2b-41ad-bd63-bee6919810b4",
            data.expansion?.identifier
        )
        assertEquals(
            "2015-07-14T10:00:00Z",
            data.expansion?.timestamp?.value.toString()
        )
        assertEquals(
            "yesnodontknow",
            data.id
        )
        assertEquals(
            "Yes/No/Don't Know",
            data.name
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
            "http://hl7.org/fhir/ValueSet/yesnodontknow",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet07() {
        // Given
        val sourceJson = loadAsString("r4/valueset-examplescenario-actor-type.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "http://hl7.org/fhir/examplescenario-actor-type",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            "fhir@lists.hl7.org",
            data.contact?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "2019-11-01T09:29:23+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "The type of actor - system or human.",
            data.description
        )
        assertEquals(
            "False".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "fhir",
            data.extension?.get(0)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            data.extension?.get(1)?.url
        )
        assertEquals(
            "trial-use",
            data.extension?.get(1)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            data.extension?.get(2)?.url
        )
        assertEquals(
            "0".toInt(),
            data.extension?.get(2)?.valueInteger?.value
        )
        assertEquals(
            "examplescenario-actor-type",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.642.3.858",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.immutable?.value
        )
        assertEquals(
            "2019-11-01T09:29:23.356+11:00",
            data.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "ExampleScenarioActorType",
            data.name
        )
        assertEquals(
            "HL7 (FHIR Project)",
            data.publisher
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
            "ExampleScenarioActorType",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/examplescenario-actor-type",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet08() {
        // Given
        val sourceJson = loadAsString("r4/valueset-list-example-codes.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/list-example-use-codes",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2019-11-01T09:29:23+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "Example use codes for the List resource - typical kinds of use.",
            data.description
        )
        assertEquals(
            "False".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "fhir",
            data.extension?.get(0)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            data.extension?.get(1)?.url
        )
        assertEquals(
            "draft",
            data.extension?.get(1)?.valueCode
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            data.extension?.get(2)?.url
        )
        assertEquals(
            "1".toInt(),
            data.extension?.get(2)?.valueInteger?.value
        )
        assertEquals(
            "list-example-codes",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.642.3.316",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.immutable?.value
        )
        assertEquals(
            "2019-11-01T09:29:23.356+11:00",
            data.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "ExampleUseCodesForList",
            data.name
        )
        assertEquals(
            "FHIR Project",
            data.publisher
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
            "Example Use Codes for List",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/list-example-codes",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet09() {
        // Given
        val sourceJson = loadAsString("r4/valueset-example-intensional.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then
        assertEquals(
            "5932-9",
            data.compose?.exclude?.get(0)?.concept?.get(0)?.code
        )
        assertEquals(
            "Cholesterol [Presence] in Blood by Test strip",
            data.compose?.exclude?.get(0)?.concept?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.compose?.exclude?.get(0)?.system
        )
        assertEquals(
            FilterOperator.EQUAL,
            data.compose?.include?.get(0)?.filter?.get(0)?.op
        )
        assertEquals(
            "parent",
            data.compose?.include?.get(0)?.filter?.get(0)?.property
        )
        assertEquals(
            "LP43571-6",
            data.compose?.include?.get(0)?.filter?.get(0)?.value
        )
        assertEquals(
            "http://loinc.org",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            "FHIR project team",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "This content from LOINCÂ® is copyright Â© 1995 Regenstrief Institute, Inc. and the LOINC Committee, and available at no cost under the license at http://loinc.org/terms-of-use",
            data.copyright
        )
        assertEquals(
            "2015-06-22",
            data.date?.value.toString()
        )
        assertEquals(
            "This is an example value set that includes all the LOINC codes for serum/plasma cholesterol from v2.36.",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example-intensional",
            data.id
        )
        assertEquals(
            "http://acme.com/identifiers/valuesets",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "loinc-cholesterol-ext",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "LOINC Codes for Cholesterol in Serum/Plasma",
            data.name
        )
        assertEquals(
            "HL7 International",
            data.publisher
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
            "http://hl7.org/fhir/ValueSet/example-intensional",
            data.url
        )
        assertEquals(
            "20150622",
            data.version
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
