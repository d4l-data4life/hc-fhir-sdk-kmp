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

import care.data4life.hl7.fhir.stu3.codesystem.TestReportActionResult
import care.data4life.hl7.fhir.stu3.codesystem.TestReportParticipantType
import care.data4life.hl7.fhir.stu3.codesystem.TestReportResult
import care.data4life.hl7.fhir.stu3.codesystem.TestReportStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirTestReport
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReport : FhirDomainResource {

    /**
     * External identifier.
     */
    val identifier: Identifier?

    /**
     * Informal name of the executed TestScript.
     */
    val name: String?

    /**
     * The current state of this test report.
     */
    val status: TestReportStatus

    /**
     * Reference to the version-specific TestScript that was executed to produce this
     * TestReport.
     */
    val testScript: Reference

    /**
     * The overall result from the execution of the TestScript.
     */
    val result: TestReportResult

    /**
     * The final score (percentage of tests passed) resulting from the execution of the
     * TestScript.
     */
    val score: Decimal?

    /**
     * Name of the tester producing this report (Organization or individual).
     */
    val tester: String?

    /**
     * When the TestScript was executed and this TestReport was generated.
     */
    val issued: DateTime?

    /**
     * A participant in the test execution, either the execution engine, a client, or a
     * server.
     */
    val participant: kotlin.collections.List<TestReportParticipant>?

    /**
     * The results of the series of required setup operations before the tests were
     * executed.
     */
    val setup: TestReportSetup?

    /**
     * A test executed from the test script.
     */
    val test: kotlin.collections.List<TestReportTest>?

    /**
     * The results of running the series of required clean up steps.
     */
    val teardown: TestReportTeardown?
}

/**
 * TestReport
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReport")
data class TestReport(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("status")
    override val status: TestReportStatus,

    @SerialName("testScript")
    override val testScript: Reference,

    @SerialName("result")
    override val result: TestReportResult,

    @SerialName("score")
    override val score: Decimal? = null,

    @SerialName("tester")
    override val tester: String? = null,

    @SerialName("issued")
    override val issued: DateTime? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<TestReportParticipant>? = null,

    @SerialName("setup")
    override val setup: TestReportSetup? = null,

    @SerialName("test")
    override val test: kotlin.collections.List<TestReportTest>? = null,

    @SerialName("teardown")
    override val teardown: TestReportTeardown? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirTestReport {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReport"
    }
}

/**
 * FhirTestReportParticipant
 *
 * A participant in the test execution, either the execution engine, a client, or a server
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportParticipant : FhirBackboneElement {

    /**
     * The type of participant.
     */
    val type: TestReportParticipantType

    /**
     * The uri of the participant. An absolute URL is preferred.
     */
    val uri: String

    /**
     * The display name of the participant.
     */
    val display: String?
}

/**
 * TestReportParticipant
 *
 * A participant in the test execution, either the execution engine, a client, or a server
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportParticipant")
data class TestReportParticipant(

    @SerialName("type")
    override val type: TestReportParticipantType,

    @SerialName("uri")
    override val uri: String,

    @SerialName("display")
    override val display: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportParticipant"
    }
}

/**
 * FhirTestReportSetup
 *
 * The results of the series of required setup operations before the tests were executed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportSetup : FhirBackboneElement {

    /**
     * A setup operation or assert that was executed.
     */
    val action: kotlin.collections.List<TestReportSetupAction>
}

/**
 * TestReportSetup
 *
 * The results of the series of required setup operations before the tests were executed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportSetup")
data class TestReportSetup(

    @SerialName("action")
    override val action: kotlin.collections.List<TestReportSetupAction>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportSetup {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportSetup"
    }
}

/**
 * FhirTestReportSetupAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetupAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportSetupAction : FhirBackboneElement {

    /**
     * The operation to perform.
     */
    val operation: TestReportSetupActionOperation?

    /**
     * The assertion to perform.
     */
    val assert: TestReportSetupActionAssert?
}

/**
 * TestReportSetupAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetupAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportSetupAction")
data class TestReportSetupAction(

    @SerialName("operation")
    override val operation: TestReportSetupActionOperation? = null,

    @SerialName("assert")
    override val assert: TestReportSetupActionAssert? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportSetupAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportSetupAction"
    }
}

/**
 * FhirTestReportSetupActionAssert
 *
 * The results of the assertion performed on the previous operations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetupActionAssert</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportSetupActionAssert : FhirBackboneElement {

    /**
     * The result of this assertion.
     */
    val result: TestReportActionResult

    /**
     * A message associated with the result.
     */
    val message: String?

    /**
     * A link to further details on the result.
     */
    val detail: String?
}

/**
 * TestReportSetupActionAssert
 *
 * The results of the assertion performed on the previous operations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetupActionAssert</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportSetupActionAssert")
data class TestReportSetupActionAssert(

    @SerialName("result")
    override val result: TestReportActionResult,

    @SerialName("message")
    override val message: String? = null,

    @SerialName("detail")
    override val detail: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportSetupActionAssert {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportSetupActionAssert"
    }
}

/**
 * FhirTestReportSetupActionOperation
 *
 * The operation performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetupActionOperation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportSetupActionOperation : FhirBackboneElement {

    /**
     * The result of this operation.
     */
    val result: TestReportActionResult

    /**
     * A message associated with the result.
     */
    val message: String?

    /**
     * A link to further details on the result.
     */
    val detail: String?
}

/**
 * TestReportSetupActionOperation
 *
 * The operation performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportSetupActionOperation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportSetupActionOperation")
data class TestReportSetupActionOperation(

    @SerialName("result")
    override val result: TestReportActionResult,

    @SerialName("message")
    override val message: String? = null,

    @SerialName("detail")
    override val detail: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportSetupActionOperation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportSetupActionOperation"
    }
}

/**
 * FhirTestReportTeardown
 *
 * The results of the series of operations required to clean up after the all the tests were executed
 * (successfully or otherwise).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTeardown</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportTeardown : FhirBackboneElement {

    /**
     * One or more teardown operations performed.
     */
    val action: kotlin.collections.List<TestReportTeardownAction>
}

/**
 * TestReportTeardown
 *
 * The results of the series of operations required to clean up after the all the tests were executed
 * (successfully or otherwise).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTeardown</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportTeardown")
data class TestReportTeardown(

    @SerialName("action")
    override val action: kotlin.collections.List<TestReportTeardownAction>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportTeardown {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportTeardown"
    }
}

/**
 * FhirTestReportTeardownAction
 *
 * The teardown action will only contain an operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTeardownAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportTeardownAction : FhirBackboneElement {

    /**
     * The teardown operation performed.
     */
    val operation: TestReportSetupActionOperation
}

/**
 * TestReportTeardownAction
 *
 * The teardown action will only contain an operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTeardownAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportTeardownAction")
data class TestReportTeardownAction(

    @SerialName("operation")
    override val operation: TestReportSetupActionOperation,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportTeardownAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportTeardownAction"
    }
}

/**
 * FhirTestReportTest
 *
 * A test executed from the test script
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportTest : FhirBackboneElement {

    /**
     * Tracking/logging name of this test.
     */
    val name: String?

    /**
     * Tracking/reporting short description of the test.
     */
    val description: String?

    /**
     * A test operation or assert that was performed.
     */
    val action: kotlin.collections.List<TestReportTestAction>
}

/**
 * TestReportTest
 *
 * A test executed from the test script
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportTest")
data class TestReportTest(

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<TestReportTestAction>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportTest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportTest"
    }
}

/**
 * FhirTestReportTestAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTestAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
interface FhirTestReportTestAction : FhirBackboneElement {

    /**
     * The operation performed.
     */
    val operation: TestReportSetupActionOperation?

    /**
     * The assertion performed.
     */
    val assert: TestReportSetupActionAssert?
}

/**
 * TestReportTestAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestReport">TestReportTestAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestReport)
 */
@Serializable
@SerialName("TestReportTestAction")
data class TestReportTestAction(

    @SerialName("operation")
    override val operation: TestReportSetupActionOperation? = null,

    @SerialName("assert")
    override val assert: TestReportSetupActionAssert? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestReportTestAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestReportTestAction"
    }
}
