/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model


import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.stu3.codesystem.SpecimenStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * SpecimenTest.java
 *
 * Sample for analysis.
 *
 * A sample to be used for analysis.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class SpecimenTest {

    val parser = FhirStu3Parser()


    @Test
    fun testSpecimen1() {
        val sourceJson = loadAsString("specimen-example-isolate.json")

        val data = parser.toFhir(Specimen::class, sourceJson)


        assertEquals(data.accessionIdentifier?.system, "http://lab.acme.org/specimens/2011")
        assertEquals(data.accessionIdentifier?.value, "X352356-ISO1")
        assertEquals(data.collection?.collectedDateTime, "2015-08-16T07:03:00Z")
        assertEquals(data.collection?.collector?.reference, "Practitioner/f202")
        assertEquals(data.collection?.method?.coding?.get(0)?.code, "BAP")
        assertEquals(data.collection?.method?.coding?.get(0)?.system, "http://hl7.org/fhir/v2/0488")
        assertEquals(data.contained?.get(0)?.id, "stool")
        assertEquals(data.id, "isolate")
        assertEquals(data.note?.get(0)?.text, "Patient dropped off specimen")
        assertEquals(data.parent?.get(0)?.reference, "#stool")
        assertEquals(data.receivedTime, "2015-08-18T07:03:00Z")
        assertEquals(data.status, SpecimenStatus.AVAILABLE)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.coding?.get(0)?.code, "429951000124103")
        assertEquals(data.type?.coding?.get(0)?.display, "Bacterial isolate specimen")
        assertEquals(data.type?.coding?.get(0)?.system, "http://snomed.info/sct")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testSpecimen2() {
        val sourceJson = loadAsString("specimen-example-urine.json")

        val data = parser.toFhir(Specimen::class, sourceJson)


        assertEquals(data.accessionIdentifier?.system, "http://lab.acme.org/specimens/2015")
        assertEquals(data.accessionIdentifier?.value, "X352356")
        assertEquals(data.collection?.collectedDateTime, "2015-08-18T07:03:00Z")
        assertEquals(data.collection?.collector?.reference, "Practitioner/f202")
        assertEquals(data.container?.get(0)?.capacity?.unit, "mls")
        assertEquals(data.container?.get(0)?.capacity?.value, "50")
        assertEquals(data.container?.get(0)?.specimenQuantity?.unit, "mls")
        assertEquals(data.container?.get(0)?.specimenQuantity?.value, "10")
        assertEquals(data.container?.get(0)?.type?.text, "Non-sterile specimen container")
        assertEquals(data.id, "vma-urine")
        assertEquals(data.processing?.get(0)?.additive?.get(0)?.display, "6 N HCl")
        assertEquals(data.processing?.get(0)?.description, "Acidify to pH < 3.0 with 6 N HCl.")
        assertEquals(data.processing?.get(0)?.procedure?.coding?.get(0)?.code, "ACID")
        assertEquals(
            data.processing?.get(0)?.procedure?.coding?.get(0)?.system,
            "http://hl7.org/fhir/v2/0373"
        )
        assertEquals(data.processing?.get(0)?.timeDateTime, "2015-08-18T08:10:00Z")
        assertEquals(data.receivedTime, "2015-08-18T07:03:00Z")
        assertEquals(data.status, SpecimenStatus.AVAILABLE)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.coding?.get(0)?.code, "RANDU")
        assertEquals(data.type?.coding?.get(0)?.display, "Urine, Random")
        assertEquals(data.type?.coding?.get(0)?.system, "http://hl7.org/fhir/v2/0487")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testSpecimen3() {
        val sourceJson = loadAsString("specimen-example-serum.json")

        val data = parser.toFhir(Specimen::class, sourceJson)


        assertEquals(data.accessionIdentifier?.system, "http://acme.com/labs/accession-ids")
        assertEquals(data.accessionIdentifier?.value, "20150816-00124")
        assertEquals(data.collection?.collectedDateTime, "2015-08-16T06:40:17Z")
        assertEquals(data.collection?.collector?.reference, "Practitioner/f202")
        assertEquals(data.container?.get(0)?.type?.coding?.get(0)?.code, "SST")
        assertEquals(data.container?.get(0)?.type?.coding?.get(0)?.display, "Serum Separator Tube")
        assertEquals(data.container?.get(0)?.type?.coding?.get(0)?.system, "http://acme.com/labs")
        assertEquals(data.id, "sst")
        assertEquals(data.request?.get(0)?.reference, "ProcedureRequest/ft4")
        assertEquals(data.subject.reference, "Patient/pat2")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.coding?.get(0)?.code, "119364003")
        assertEquals(data.type?.coding?.get(0)?.display, "Serum sample")
        assertEquals(data.type?.coding?.get(0)?.system, "http://snomed.info/sct")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testSpecimen4() {
        val sourceJson = loadAsString("specimen-example.json")

        val data = parser.toFhir(Specimen::class, sourceJson)


        assertEquals(data.accessionIdentifier?.system, "http://lab.acme.org/specimens/2011")
        assertEquals(data.accessionIdentifier?.value, "X352356")
        assertEquals(data.collection?.bodySite?.coding?.get(0)?.code, "49852007")
        assertEquals(
            data.collection?.bodySite?.coding?.get(0)?.display,
            "Structure of median cubital vein (body structure)"
        )
        assertEquals(data.collection?.bodySite?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.collection?.bodySite?.text, "Right median cubital vein")
        assertEquals(data.collection?.collectedDateTime, "2011-05-30T06:15:00Z")
        assertEquals(data.collection?.collector?.reference, "Practitioner/example")
        assertEquals(data.collection?.method?.coding?.get(0)?.code, "LNV")
        assertEquals(data.collection?.method?.coding?.get(0)?.system, "http://hl7.org/fhir/v2/0488")
        assertEquals(data.collection?.quantity?.unit, "mL")
        assertEquals(data.collection?.quantity?.value, "6")
        assertEquals(data.contained?.get(0)?.id, "hep")
        assertEquals(data.container?.get(0)?.additiveReference?.reference, "#hep")
        assertEquals(data.container?.get(0)?.capacity?.unit, "mL")
        assertEquals(data.container?.get(0)?.capacity?.value, "10")
        assertEquals(data.container?.get(0)?.description, "Green Gel tube")
        assertEquals(data.container?.get(0)?.identifier?.get(0)?.value, "48736-15394-75465")
        assertEquals(data.container?.get(0)?.specimenQuantity?.unit, "mL")
        assertEquals(data.container?.get(0)?.specimenQuantity?.value, "6")
        assertEquals(data.container?.get(0)?.type?.text, "Vacutainer")
        assertEquals(data.id, "101")
        assertEquals(data.identifier?.get(0)?.system, "http://ehr.acme.org/identifiers/collections")
        assertEquals(data.identifier?.get(0)?.value, "23234352356")
        assertEquals(data.note?.get(0)?.text, "Specimen is grossly lipemic")
        assertEquals(data.receivedTime, "2011-03-04T07:03:00Z")
        assertEquals(data.request?.get(0)?.reference, "ProcedureRequest/example")
        assertEquals(data.status, SpecimenStatus.AVAILABLE)
        assertEquals(data.subject.display, "Peter Patient")
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.coding?.get(0)?.code, "122555007")
        assertEquals(data.type?.coding?.get(0)?.display, "Venous blood specimen")
        assertEquals(data.type?.coding?.get(0)?.system, "http://snomed.info/sct")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


