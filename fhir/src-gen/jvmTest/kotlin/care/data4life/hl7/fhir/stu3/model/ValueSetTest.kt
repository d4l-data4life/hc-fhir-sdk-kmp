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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.FilterOperator
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ValueSetTest.java
 *
 * A set of codes drawn from one or more code systems
 *
 * A value set specifies a set of codes drawn from one or more code systems.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ValueSetTest {

    val parser = FhirStu3Parser()

    @Test
    fun testValueSet01() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example.json")

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
            "http://hl7.org/fhir/ValueSet/example-extensional",
            data.url
        )
        assertEquals(
            "20150622",
            data.version
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet02() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-expansion.json")

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

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet03() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-inactive.json")

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
            "http://hl7.org/fhir/v3/ActMood",
            data.compose?.include?.get(0)?.system
        )
        assertEquals(
            "HL7 v3 ActMood Prdicate codes, including inactive codes",
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
            "http://hl7.org/fhir/v3/ActMood",
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
            "http://hl7.org/fhir/v3/ActMood",
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
            "http://hl7.org/fhir/v3/ActMood",
            data.expansion?.contains?.get(1)?.contains?.get(1)?.system
        )
        assertEquals(
            "expectation",
            data.expansion?.contains?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/v3/ActMood",
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
            "http://hl7.org/fhir/v3/ActMood",
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

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet04() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-yesnodontknow.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then

        assertEquals(
            "http://hl7.org/fhir/ValueSet/v2-0136",
            data.compose?.include?.get(0)?.valueSet?.get(0)
        )
        assertEquals(
            "asked",
            data.compose?.include?.get(1)?.concept?.get(0)?.code
        )
        assertEquals(
            "Don't know",
            data.compose?.include?.get(1)?.concept?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/data-absent-reason",
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
            "http://hl7.org/fhir/v2/0136",
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
            "http://hl7.org/fhir/v2/0136",
            data.expansion?.contains?.get(1)?.system
        )
        assertEquals(
            "asked",
            data.expansion?.contains?.get(2)?.code
        )
        assertEquals(
            "Don't know",
            data.expansion?.contains?.get(2)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/data-absent-reason",
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

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet05() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-list-example-codes.json")

        // When
        val data = parser.toFhir(ValueSet::class, sourceJson)

        // Then

        assertEquals(
            "http://hl7.org/fhir/list-example-use-codes",
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
            "2017-04-19T07:44:43+10:00",
            data.date?.value.toString()
        )
        assertEquals(
            "Example use codes for the List resource - typical kinds of use.",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-ballot-status",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "Informative",
            data.extension?.get(0)?.valueString
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            data.extension?.get(1)?.url
        )
        assertEquals(
            "1".toInt(),
            data.extension?.get(1)?.valueInteger?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            data.extension?.get(2)?.url
        )
        assertEquals(
            "fhir",
            data.extension?.get(2)?.valueCode
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
            "urn:oid:2.16.840.1.113883.4.642.3.307",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.immutable?.value
        )
        assertEquals(
            "2017-04-19T07:44:43.294+10:00",
            data.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablevalueset",
            data.meta?.profile?.get(0)
        )
        assertEquals(
            "Example Use Codes for List",
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
            "http://hl7.org/fhir/ValueSet/list-example-codes",
            data.url
        )
        assertEquals(
            "3.0.1",
            data.version
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testValueSet06() {
        // Given
        val sourceJson = loadAsString("stu3/valueset-example-intensional.json")

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

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
