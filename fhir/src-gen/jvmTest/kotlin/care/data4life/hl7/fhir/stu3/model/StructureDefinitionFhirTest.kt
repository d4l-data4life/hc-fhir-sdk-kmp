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
import care.data4life.hl7.fhir.stu3.codesystem.AggregationMode
import care.data4life.hl7.fhir.stu3.codesystem.BindingStrength
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.DiscriminatorType
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ReferenceVersionRules
import care.data4life.hl7.fhir.stu3.codesystem.SlicingRules
import care.data4life.hl7.fhir.stu3.codesystem.StructureDefinitionKind
import care.data4life.hl7.fhir.stu3.codesystem.TypeDerivationRule
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * StructureDefinitionTest.java
 *
 * Structural Definition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data
 * types defined in FHIR, and also for describing extensions and constraints on resources and data
 * types.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class StructureDefinitionFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testStructureDefinition01() {
        // Given
        val sourceJson = loadAsString("stu3/structuredefinition-example.json")

        // When
        val data = parser.toFhir(StructureDefinition::class, sourceJson)

        // Then
        assertStructureDefinition01Step01(data)
        assertStructureDefinition01Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertStructureDefinition01Step01(data: StructureDefinition) {
        assertEquals(
            expected = "False".toBoolean(),
            actual = data.abstrakt?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport",
            actual = data.baseDefinition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "grahame@healthintersections.com.au",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Creative Commons 0, per FHIR specification",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-12",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = TypeDerivationRule.CONSTRAINT,
            actual = data.derivation
        )

        assertEquals(
            expected = "Describes how the lab report is used for a standard Lipid Profile - Cholesterol, Triglyceride and Cholesterol fractions. Uses LOINC codes",
            actual = data.description
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
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2.36.90146595217.4.2",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AU",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "314079002",
            actual = data.keyword?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hyperlipidemia screening test (procedure)",
            actual = data.keyword?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.keyword?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = StructureDefinitionKind.RESOURCE,
            actual = data.kind
        )

        assertEquals(
            expected = "Actual mappings haven't yet been filled out",
            actual = data.mapping?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "m1",
            actual = data.mapping?.get(0)?.identity
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RCPA Lipid Report recommendations",
            actual = data.mapping?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.rcpa.edu.au/getattachment/0961c6d1-ec80-4500-8dc0-de516500e05b/Lipid-and-lipoprotein-testing.aspx",
            actual = data.mapping?.get(0)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LipidProfileExample",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Health Intersections Pty Ltd",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Provide an example to demonstrate how to use StructureDefinition",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(0)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(0)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.snapshot?.element?.get(0)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The findings and interpretation of a general lipd lab profile.",
            actual = data.snapshot?.element?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.snapshot?.element?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(0)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(0)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(0)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.snapshot?.element?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Lab Report",
            actual = data.snapshot?.element?.get(0)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(1)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(1)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.extension",
            actual = data.snapshot?.element?.get(1)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.extension",
            actual = data.snapshot?.element?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(1)?.isModifier?.value
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(1)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(1)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.extension",
            actual = data.snapshot?.element?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Additional Content defined by implementations",
            actual = data.snapshot?.element?.get(1)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "url",
            actual = data.snapshot?.element?.get(1)?.slicing?.discriminator?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiscriminatorType.VALUE,
            actual = data.snapshot?.element?.get(1)?.slicing?.discriminator?.get(0)?.type
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(1)?.slicing?.ordered?.value
        )

        assertEquals(
            expected = SlicingRules.OPEN,
            actual = data.snapshot?.element?.get(1)?.slicing?.rules
        )

        assertEquals(
            expected = "Extension",
            actual = data.snapshot?.element?.get(1)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "narrative",
            actual = data.snapshot?.element?.get(2)?.alias?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "html",
            actual = data.snapshot?.element?.get(2)?.alias?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "xhtml",
            actual = data.snapshot?.element?.get(2)?.alias?.get(2)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "display",
            actual = data.snapshot?.element?.get(2)?.alias?.get(3)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(2)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(2)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.text",
            actual = data.snapshot?.element?.get(2)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Contained resources do not have narrative. Resources that are not contained SHOULD have a narrative.",
            actual = data.snapshot?.element?.get(2)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.text",
            actual = data.snapshot?.element?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(2)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(2)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(2)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.text",
            actual = data.snapshot?.element?.get(2)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Text summary of the resource, for human interpretation",
            actual = data.snapshot?.element?.get(2)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Narrative",
            actual = data.snapshot?.element?.get(2)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inline resources",
            actual = data.snapshot?.element?.get(3)?.alias?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "anonymous resources",
            actual = data.snapshot?.element?.get(3)?.alias?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "contained resources",
            actual = data.snapshot?.element?.get(3)?.alias?.get(2)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(3)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(3)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.contained",
            actual = data.snapshot?.element?.get(3)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This should never be done when the content can be identified properly, as once identification is lost, it is extremely difficult (and context dependent) to restore it again.",
            actual = data.snapshot?.element?.get(3)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.contained",
            actual = data.snapshot?.element?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(3)?.isModifier?.value
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(3)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(3)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.contained",
            actual = data.snapshot?.element?.get(3)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Contained, inline Resources",
            actual = data.snapshot?.element?.get(3)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Resource",
            actual = data.snapshot?.element?.get(3)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(4)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(4)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.status",
            actual = data.snapshot?.element?.get(4)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = BindingStrength.REQUIRED,
            actual = data.snapshot?.element?.get(4)?.binding?.strength
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/observation-status",
            actual = data.snapshot?.element?.get(4)?.binding?.valueSetReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This is labeled as \"Is Modifier\" because applications need to take appropriate action if a report is withdrawn.",
            actual = data.snapshot?.element?.get(4)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The status of the diagnostic report as a whole.",
            actual = data.snapshot?.element?.get(4)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.status",
            actual = data.snapshot?.element?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(4)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(4)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(4)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.status",
            actual = data.snapshot?.element?.get(4)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "registered|interim|final|amended|cancelled|withdrawn",
            actual = data.snapshot?.element?.get(4)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.snapshot?.element?.get(4)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(5)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(5)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.issued",
            actual = data.snapshot?.element?.get(5)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "May be different from the update time of the resource itself, because that is the status of the record (potentially a secondary copy), not the actual release time of the report.",
            actual = data.snapshot?.element?.get(5)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The date and/or time that this version of the report was released from the source diagnostic service.",
            actual = data.snapshot?.element?.get(5)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.issued",
            actual = data.snapshot?.element?.get(5)?.id
                ?.replace("\\n", " ")
        )
    }

    private fun assertStructureDefinition01Step02(data: StructureDefinition) {
        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(5)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(5)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(5)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.issued",
            actual = data.snapshot?.element?.get(5)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Date this version was released",
            actual = data.snapshot?.element?.get(5)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dateTime",
            actual = data.snapshot?.element?.get(5)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(6)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(6)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.subject",
            actual = data.snapshot?.element?.get(6)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The subject of the report. Usually, but not always, this is a patient. However diagnostic services also perform analyses on specimens collected from a variety of other sources.",
            actual = data.snapshot?.element?.get(6)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.subject",
            actual = data.snapshot?.element?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(6)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(6)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(6)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.subject",
            actual = data.snapshot?.element?.get(6)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The subject of the report",
            actual = data.snapshot?.element?.get(6)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AggregationMode.BUNDLED,
            actual = data.snapshot?.element?.get(6)?.type?.get(0)?.aggregation?.get(0)
        )

        assertEquals(
            expected = "Reference",
            actual = data.snapshot?.element?.get(6)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Patient",
            actual = data.snapshot?.element?.get(6)?.type?.get(0)?.targetProfile
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ReferenceVersionRules.EITHER,
            actual = data.snapshot?.element?.get(6)?.type?.get(0)?.versioning
        )

        assertEquals(
            expected = AggregationMode.BUNDLED,
            actual = data.snapshot?.element?.get(6)?.type?.get(1)?.aggregation?.get(0)
        )

        assertEquals(
            expected = "Reference",
            actual = data.snapshot?.element?.get(6)?.type?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Group",
            actual = data.snapshot?.element?.get(6)?.type?.get(1)?.targetProfile
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AggregationMode.BUNDLED,
            actual = data.snapshot?.element?.get(6)?.type?.get(2)?.aggregation?.get(0)
        )

        assertEquals(
            expected = "Reference",
            actual = data.snapshot?.element?.get(6)?.type?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Device",
            actual = data.snapshot?.element?.get(6)?.type?.get(2)?.targetProfile
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(7)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(7)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.performer",
            actual = data.snapshot?.element?.get(7)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This is not necessarily the source of the atomic data items - it's the entity that takes responsibility for the clinical report.",
            actual = data.snapshot?.element?.get(7)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The diagnostic service that is responsible for issuing the report.",
            actual = data.snapshot?.element?.get(7)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.performer",
            actual = data.snapshot?.element?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(7)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(7)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.snapshot?.element?.get(7)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.performer",
            actual = data.snapshot?.element?.get(7)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Responsible Diagnostic Service",
            actual = data.snapshot?.element?.get(7)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Reference",
            actual = data.snapshot?.element?.get(7)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Organization",
            actual = data.snapshot?.element?.get(7)?.type?.get(0)?.targetProfile
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(8)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(8)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.identifier",
            actual = data.snapshot?.element?.get(8)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The local ID assigned to the report by the order filler, usually by the Information System of the diagnostic service provider.",
            actual = data.snapshot?.element?.get(8)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.identifier",
            actual = data.snapshot?.element?.get(8)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(8)?.isModifier?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(8)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(8)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.identifier",
            actual = data.snapshot?.element?.get(8)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Id for external references to this report",
            actual = data.snapshot?.element?.get(8)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Identifier",
            actual = data.snapshot?.element?.get(8)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(9)?.base?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(9)?.base?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.request",
            actual = data.snapshot?.element?.get(9)?.base?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Details concerning a single pathology test requested.",
            actual = data.snapshot?.element?.get(9)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport.request",
            actual = data.snapshot?.element?.get(9)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(9)?.isModifier?.value
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(9)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(9)?.min?.value
        )

        assertEquals(
            expected = "DiagnosticReport.request",
            actual = data.snapshot?.element?.get(9)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "What was requested",
            actual = data.snapshot?.element?.get(9)?.short
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AggregationMode.REFERENCED,
            actual = data.snapshot?.element?.get(9)?.type?.get(0)?.aggregation?.get(0)
        )

        assertEquals(
            expected = "Reference",
            actual = data.snapshot?.element?.get(9)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/ProcedureRequest",
            actual = data.snapshot?.element?.get(9)?.type?.get(0)?.targetProfile
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ReferenceVersionRules.SPECIFIC,
            actual = data.snapshot?.element?.get(9)?.type?.get(0)?.versioning
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
            expected = "Example Lipid Profile",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical Focus",
            actual = data.useContext?.get(0)?.code?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "314079002",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hyperlipidemia screening test (procedure)",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
