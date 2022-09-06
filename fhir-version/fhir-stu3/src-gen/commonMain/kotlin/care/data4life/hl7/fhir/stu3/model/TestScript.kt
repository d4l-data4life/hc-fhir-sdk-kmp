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

import care.data4life.hl7.fhir.stu3.codesystem.AssertionDirectionType
import care.data4life.hl7.fhir.stu3.codesystem.AssertionOperatorType
import care.data4life.hl7.fhir.stu3.codesystem.AssertionResponseTypes
import care.data4life.hl7.fhir.stu3.codesystem.ContentType
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.TestScriptRequestMethodCode
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirTestScript
 *
 * A structured set of tests against a FHIR server implementation to determine compliance against the
 * FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScript</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScript : FhirDomainResource {

    /**
     * Logical URI to reference this test script (globally unique).
     */
    val url: String

    /**
     * Additional identifier for the test script.
     */
    val identifier: Identifier?

    /**
     * Business version of the test script.
     */
    val version: String?

    /**
     * Name for this test script (computer friendly).
     */
    val name: String

    /**
     * Name for this test script (human friendly).
     */
    val title: String?

    /**
     * The status of this test script. Enables tracking the life-cycle of the content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the test script.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for test script (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this test script is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * An abstract server representing a client or sender in a message exchange.
     */
    val origin: kotlin.collections.List<TestScriptOrigin>?

    /**
     * An abstract server representing a destination or receiver in a message exchange.
     */
    val destination: kotlin.collections.List<TestScriptDestination>?

    /**
     * Required capability that is assumed to function correctly on the FHIR server
     * being tested.
     */
    val metadata: TestScriptMetadata?

    /**
     * Fixture in the test script - by reference (uri).
     */
    val fixture: kotlin.collections.List<TestScriptFixture>?

    /**
     * Reference of the validation profile.
     */
    val profile: kotlin.collections.List<Reference>?

    /**
     * Placeholder for evaluated elements.
     */
    val variable: kotlin.collections.List<TestScriptVariable>?

    /**
     * Assert rule used within the test script.
     */
    val rule: kotlin.collections.List<TestScriptRule>?

    /**
     * Assert ruleset used within the test script.
     */
    val ruleset: kotlin.collections.List<TestScriptRuleset>?

    /**
     * A series of required setup operations before tests are executed.
     */
    val setup: TestScriptSetup?

    /**
     * A test in this script.
     */
    val test: kotlin.collections.List<TestScriptTest>?

    /**
     * A series of required clean up steps.
     */
    val teardown: TestScriptTeardown?
}

/**
 * TestScript
 *
 * A structured set of tests against a FHIR server implementation to determine compliance against the
 * FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScript</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScript")
data class TestScript(

    @SerialName("url")
    override val url: String,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("origin")
    override val origin: kotlin.collections.List<TestScriptOrigin>? = null,

    @SerialName("destination")
    override val destination: kotlin.collections.List<TestScriptDestination>? = null,

    @SerialName("metadata")
    override val metadata: TestScriptMetadata? = null,

    @SerialName("fixture")
    override val fixture: kotlin.collections.List<TestScriptFixture>? = null,

    @SerialName("profile")
    override val profile: kotlin.collections.List<Reference>? = null,

    @SerialName("variable")
    override val variable: kotlin.collections.List<TestScriptVariable>? = null,

    @SerialName("rule")
    override val rule: kotlin.collections.List<TestScriptRule>? = null,

    @SerialName("ruleset")
    override val ruleset: kotlin.collections.List<TestScriptRuleset>? = null,

    @SerialName("setup")
    override val setup: TestScriptSetup? = null,

    @SerialName("test")
    override val test: kotlin.collections.List<TestScriptTest>? = null,

    @SerialName("teardown")
    override val teardown: TestScriptTeardown? = null,

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
) : FhirTestScript {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScript"
    }
}

/**
 * FhirTestScriptDestination
 *
 * An abstract server used in operations within this test script in the destination element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptDestination</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptDestination : FhirBackboneElement {

    /**
     * The index of the abstract destination server starting at 1.
     */
    val index: Integer

    /**
     * FHIR-Server | FHIR-SDC-FormManager | FHIR-SDC-FormReceiver | FHIR-SDC-
     * FormProcessor.
     */
    val profile: Coding
}

/**
 * TestScriptDestination
 *
 * An abstract server used in operations within this test script in the destination element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptDestination</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptDestination")
data class TestScriptDestination(

    @SerialName("index")
    override val index: Integer,

    @SerialName("profile")
    override val profile: Coding,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptDestination {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptDestination"
    }
}

/**
 * FhirTestScriptFixture
 *
 * Fixture in the test script - by reference (uri). All fixtures are required for the test script to
 * execute.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptFixture</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptFixture : FhirBackboneElement {

    /**
     * Whether or not to implicitly create the fixture during setup.
     */
    val autocreate: Bool?

    /**
     * Whether or not to implicitly delete the fixture during teardown.
     */
    val autodelete: Bool?

    /**
     * Reference of the resource.
     */
    val resource: Reference?
}

/**
 * TestScriptFixture
 *
 * Fixture in the test script - by reference (uri). All fixtures are required for the test script to
 * execute.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptFixture</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptFixture")
data class TestScriptFixture(

    @SerialName("autocreate")
    override val autocreate: Bool? = null,

    @SerialName("autodelete")
    override val autodelete: Bool? = null,

    @SerialName("resource")
    override val resource: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptFixture {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptFixture"
    }
}

/**
 * FhirTestScriptMetadata
 *
 * The required capability must exist and are assumed to function correctly on the FHIR server being
 * tested.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptMetadata</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptMetadata : FhirBackboneElement {

    /**
     * Links to the FHIR specification.
     */
    val link: kotlin.collections.List<TestScriptMetadataLink>?

    /**
     * Capabilities that are assumed to function correctly on the FHIR server being
     * tested.
     */
    val capability: kotlin.collections.List<TestScriptMetadataCapability>
}

/**
 * TestScriptMetadata
 *
 * The required capability must exist and are assumed to function correctly on the FHIR server being
 * tested.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptMetadata</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptMetadata")
data class TestScriptMetadata(

    @SerialName("link")
    override val link: kotlin.collections.List<TestScriptMetadataLink>? = null,

    @SerialName("capability")
    override val capability: kotlin.collections.List<TestScriptMetadataCapability>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptMetadata {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptMetadata"
    }
}

/**
 * FhirTestScriptMetadataCapability
 *
 * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptMetadataCapability</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptMetadataCapability : FhirBackboneElement {

    /**
     * Are the capabilities required?.
     */
    val required: Bool?

    /**
     * Are the capabilities validated?.
     */
    val validated: Bool?

    /**
     * The expected capabilities of the server.
     */
    val description: String?

    /**
     * Which origin server these requirements apply to.
     */
    val origin: kotlin.collections.List<Integer>?

    /**
     * Which server these requirements apply to.
     */
    val destination: Integer?

    /**
     * Links to the FHIR specification.
     */
    val link: kotlin.collections.List<String>?

    /**
     * Required Capability Statement.
     */
    val capabilities: Reference
}

/**
 * TestScriptMetadataCapability
 *
 * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptMetadataCapability</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptMetadataCapability")
data class TestScriptMetadataCapability(

    @SerialName("required")
    override val required: Bool? = null,

    @SerialName("validated")
    override val validated: Bool? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("origin")
    override val origin: kotlin.collections.List<Integer>? = null,

    @SerialName("destination")
    override val destination: Integer? = null,

    @SerialName("link")
    override val link: kotlin.collections.List<String>? = null,

    @SerialName("capabilities")
    override val capabilities: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptMetadataCapability {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptMetadataCapability"
    }
}

/**
 * FhirTestScriptMetadataLink
 *
 * A link to the FHIR specification that this test is covering.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptMetadataLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptMetadataLink : FhirBackboneElement {

    /**
     * URL to the specification.
     */
    val url: String

    /**
     * Short description.
     */
    val description: String?
}

/**
 * TestScriptMetadataLink
 *
 * A link to the FHIR specification that this test is covering.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptMetadataLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptMetadataLink")
data class TestScriptMetadataLink(

    @SerialName("url")
    override val url: String,

    @SerialName("description")
    override val description: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptMetadataLink {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptMetadataLink"
    }
}

/**
 * FhirTestScriptOrigin
 *
 * An abstract server used in operations within this test script in the origin element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptOrigin</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptOrigin : FhirBackboneElement {

    /**
     * The index of the abstract origin server starting at 1.
     */
    val index: Integer

    /**
     * FHIR-Client | FHIR-SDC-FormFiller.
     */
    val profile: Coding
}

/**
 * TestScriptOrigin
 *
 * An abstract server used in operations within this test script in the origin element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptOrigin</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptOrigin")
data class TestScriptOrigin(

    @SerialName("index")
    override val index: Integer,

    @SerialName("profile")
    override val profile: Coding,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptOrigin {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptOrigin"
    }
}

/**
 * FhirTestScriptRule
 *
 * Assert rule to be used in one or more asserts within the test script.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptRule : FhirBackboneElement {

    /**
     * Assert rule resource reference.
     */
    val resource: Reference

    /**
     * Rule parameter template.
     */
    val param: kotlin.collections.List<TestScriptRuleParam>?
}

/**
 * TestScriptRule
 *
 * Assert rule to be used in one or more asserts within the test script.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptRule")
data class TestScriptRule(

    @SerialName("resource")
    override val resource: Reference,

    @SerialName("param")
    override val param: kotlin.collections.List<TestScriptRuleParam>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptRule {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptRule"
    }
}

/**
 * FhirTestScriptRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptRuleParam : FhirBackboneElement {

    /**
     * Parameter name matching external assert rule parameter.
     */
    val name: String

    /**
     * Parameter value defined either explicitly or dynamically.
     */
    val value: String?
}

/**
 * TestScriptRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptRuleParam")
data class TestScriptRuleParam(

    @SerialName("name")
    override val name: String,

    @SerialName("value")
    override val value: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptRuleParam {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptRuleParam"
    }
}

/**
 * FhirTestScriptRuleset
 *
 * Contains one or more rules. Offers a way to group rules so assertions could reference the group of
 * rules and have them all applied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRuleset</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptRuleset : FhirBackboneElement {

    /**
     * Assert ruleset resource reference.
     */
    val resource: Reference

    /**
     * The referenced rule within the ruleset.
     */
    val rule: kotlin.collections.List<TestScriptRulesetRule>
}

/**
 * TestScriptRuleset
 *
 * Contains one or more rules. Offers a way to group rules so assertions could reference the group of
 * rules and have them all applied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRuleset</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptRuleset")
data class TestScriptRuleset(

    @SerialName("resource")
    override val resource: Reference,

    @SerialName("rule")
    override val rule: kotlin.collections.List<TestScriptRulesetRule>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptRuleset {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptRuleset"
    }
}

/**
 * FhirTestScriptRulesetRule
 *
 * The referenced rule within the external ruleset template.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRulesetRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptRulesetRule : FhirBackboneElement {

    /**
     * Id of referenced rule within the ruleset.
     */
    val ruleId: String

    /**
     * Ruleset rule parameter template.
     */
    val param: kotlin.collections.List<TestScriptRulesetRuleParam>?
}

/**
 * TestScriptRulesetRule
 *
 * The referenced rule within the external ruleset template.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRulesetRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptRulesetRule")
data class TestScriptRulesetRule(

    @SerialName("ruleId")
    override val ruleId: String,

    @SerialName("param")
    override val param: kotlin.collections.List<TestScriptRulesetRuleParam>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptRulesetRule {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptRulesetRule"
    }
}

/**
 * FhirTestScriptRulesetRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRulesetRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptRulesetRuleParam : FhirBackboneElement {

    /**
     * Parameter name matching external assert ruleset rule parameter.
     */
    val name: String

    /**
     * Parameter value defined either explicitly or dynamically.
     */
    val value: String?
}

/**
 * TestScriptRulesetRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptRulesetRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptRulesetRuleParam")
data class TestScriptRulesetRuleParam(

    @SerialName("name")
    override val name: String,

    @SerialName("value")
    override val value: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptRulesetRuleParam {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptRulesetRuleParam"
    }
}

/**
 * FhirTestScriptSetup
 *
 * A series of required setup operations before tests are executed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetup : FhirBackboneElement {

    /**
     * A setup operation or assert to perform.
     */
    val action: kotlin.collections.List<TestScriptSetupAction>
}

/**
 * TestScriptSetup
 *
 * A series of required setup operations before tests are executed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetup")
data class TestScriptSetup(

    @SerialName("action")
    override val action: kotlin.collections.List<TestScriptSetupAction>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetup {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetup"
    }
}

/**
 * FhirTestScriptSetupAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupAction : FhirBackboneElement {

    /**
     * The setup operation to perform.
     */
    val operation: TestScriptSetupActionOperation?

    /**
     * The assertion to perform.
     */
    val assert: TestScriptSetupActionAssert?
}

/**
 * TestScriptSetupAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupAction")
data class TestScriptSetupAction(

    @SerialName("operation")
    override val operation: TestScriptSetupActionOperation? = null,

    @SerialName("assert")
    override val assert: TestScriptSetupActionAssert? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupAction"
    }
}

/**
 * FhirTestScriptSetupActionAssert
 *
 * Evaluates the results of previous operations to determine if the server under test behaves
 * appropriately.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssert</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionAssert : FhirBackboneElement {

    /**
     * Tracking/logging assertion label.
     */
    val label: String?

    /**
     * Tracking/reporting assertion description.
     */
    val description: String?

    /**
     * The direction to use for the assertion.
     */
    val direction: AssertionDirectionType?

    /**
     * Id of the source fixture to be evaluated.
     */
    val compareToSourceId: String?

    /**
     * The fluentpath expression to evaluate against the source fixture.
     */
    val compareToSourceExpression: String?

    /**
     * XPath or JSONPath expression to evaluate against the source fixture.
     */
    val compareToSourcePath: String?

    /**
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type'
     * header.
     */
    val contentType: ContentType?

    /**
     * The fluentpath expression to be evaluated.
     */
    val expression: String?

    /**
     * HTTP header field name.
     */
    val headerField: String?

    /**
     * Fixture Id of minimum content resource.
     */
    val minimumId: String?

    /**
     * Perform validation on navigation links?.
     */
    val navigationLinks: Bool?

    /**
     * The operator type defines the conditional behavior of the assert. If not
     * defined, the default is equals.
     */
    val operator: AssertionOperatorType?

    /**
     * XPath or JSONPath expression.
     */
    val path: String?

    /**
     * The request method or HTTP operation code to compare against that used by the
     * client system under test.
     */
    val requestMethod: TestScriptRequestMethodCode?

    /**
     * Request URL comparison value.
     */
    val requestURL: String?

    /**
     * Resource type.
     */
    val resource: String?

    /**
     * None
     */
    val response: AssertionResponseTypes?

    /**
     * HTTP response code to test.
     */
    val responseCode: String?

    /**
     * The reference to a TestScript.rule.
     */
    val rule: TestScriptSetupActionAssertRule?

    /**
     * The reference to a TestScript.ruleset.
     */
    val ruleset: TestScriptSetupActionAssertRuleset?

    /**
     * Fixture Id of source expression or headerField.
     */
    val sourceId: String?

    /**
     * Profile Id of validation profile reference.
     */
    val validateProfileId: String?

    /**
     * The value to compare to.
     */
    val value: String?

    /**
     * Will this assert produce a warning only on error?.
     */
    val warningOnly: Bool?
}

/**
 * TestScriptSetupActionAssert
 *
 * Evaluates the results of previous operations to determine if the server under test behaves
 * appropriately.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssert</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionAssert")
data class TestScriptSetupActionAssert(

    @SerialName("label")
    override val label: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("direction")
    override val direction: AssertionDirectionType? = null,

    @SerialName("compareToSourceId")
    override val compareToSourceId: String? = null,

    @SerialName("compareToSourceExpression")
    override val compareToSourceExpression: String? = null,

    @SerialName("compareToSourcePath")
    override val compareToSourcePath: String? = null,

    @SerialName("contentType")
    override val contentType: ContentType? = null,

    @SerialName("expression")
    override val expression: String? = null,

    @SerialName("headerField")
    override val headerField: String? = null,

    @SerialName("minimumId")
    override val minimumId: String? = null,

    @SerialName("navigationLinks")
    override val navigationLinks: Bool? = null,

    @SerialName("operator")
    override val operator: AssertionOperatorType? = null,

    @SerialName("path")
    override val path: String? = null,

    @SerialName("requestMethod")
    override val requestMethod: TestScriptRequestMethodCode? = null,

    @SerialName("requestURL")
    override val requestURL: String? = null,

    @SerialName("resource")
    override val resource: String? = null,

    @SerialName("response")
    override val response: AssertionResponseTypes? = null,

    @SerialName("responseCode")
    override val responseCode: String? = null,

    @SerialName("rule")
    override val rule: TestScriptSetupActionAssertRule? = null,

    @SerialName("ruleset")
    override val ruleset: TestScriptSetupActionAssertRuleset? = null,

    @SerialName("sourceId")
    override val sourceId: String? = null,

    @SerialName("validateProfileId")
    override val validateProfileId: String? = null,

    @SerialName("value")
    override val value: String? = null,

    @SerialName("warningOnly")
    override val warningOnly: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionAssert {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionAssert"
    }
}

/**
 * FhirTestScriptSetupActionAssertRule
 *
 * The TestScript.rule this assert will evaluate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionAssertRule : FhirBackboneElement {

    /**
     * Id of the TestScript.rule.
     */
    val ruleId: String

    /**
     * Rule parameter template.
     */
    val param: kotlin.collections.List<TestScriptSetupActionAssertRuleParam>?
}

/**
 * TestScriptSetupActionAssertRule
 *
 * The TestScript.rule this assert will evaluate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionAssertRule")
data class TestScriptSetupActionAssertRule(

    @SerialName("ruleId")
    override val ruleId: String,

    @SerialName("param")
    override val param: kotlin.collections.List<TestScriptSetupActionAssertRuleParam>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionAssertRule {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionAssertRule"
    }
}

/**
 * FhirTestScriptSetupActionAssertRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionAssertRuleParam : FhirBackboneElement {

    /**
     * Parameter name matching external assert rule parameter.
     */
    val name: String

    /**
     * Parameter value defined either explicitly or dynamically.
     */
    val value: String
}

/**
 * TestScriptSetupActionAssertRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionAssertRuleParam")
data class TestScriptSetupActionAssertRuleParam(

    @SerialName("name")
    override val name: String,

    @SerialName("value")
    override val value: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionAssertRuleParam {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionAssertRuleParam"
    }
}

/**
 * FhirTestScriptSetupActionAssertRuleset
 *
 * The TestScript.ruleset this assert will evaluate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRuleset</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionAssertRuleset : FhirBackboneElement {

    /**
     * Id of the TestScript.ruleset.
     */
    val rulesetId: String

    /**
     * The referenced rule within the ruleset.
     */
    val rule: kotlin.collections.List<TestScriptSetupActionAssertRulesetRule>?
}

/**
 * TestScriptSetupActionAssertRuleset
 *
 * The TestScript.ruleset this assert will evaluate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRuleset</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionAssertRuleset")
data class TestScriptSetupActionAssertRuleset(

    @SerialName("rulesetId")
    override val rulesetId: String,

    @SerialName("rule")
    override val rule: kotlin.collections.List<TestScriptSetupActionAssertRulesetRule>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionAssertRuleset {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionAssertRuleset"
    }
}

/**
 * FhirTestScriptSetupActionAssertRulesetRule
 *
 * The referenced rule within the external ruleset template.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRulesetRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionAssertRulesetRule : FhirBackboneElement {

    /**
     * Id of referenced rule within the ruleset.
     */
    val ruleId: String

    /**
     * Rule parameter template.
     */
    val param: kotlin.collections.List<TestScriptSetupActionAssertRulesetRuleParam>?
}

/**
 * TestScriptSetupActionAssertRulesetRule
 *
 * The referenced rule within the external ruleset template.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRulesetRule</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionAssertRulesetRule")
data class TestScriptSetupActionAssertRulesetRule(

    @SerialName("ruleId")
    override val ruleId: String,

    @SerialName("param")
    override val param: kotlin.collections.List<TestScriptSetupActionAssertRulesetRuleParam>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionAssertRulesetRule {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionAssertRulesetRule"
    }
}

/**
 * FhirTestScriptSetupActionAssertRulesetRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRulesetRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionAssertRulesetRuleParam : FhirBackboneElement {

    /**
     * Parameter name matching external assert ruleset rule parameter.
     */
    val name: String

    /**
     * Parameter value defined either explicitly or dynamically.
     */
    val value: String
}

/**
 * TestScriptSetupActionAssertRulesetRuleParam
 *
 * Each rule template can take one or more parameters for rule evaluation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionAssertRulesetRuleParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionAssertRulesetRuleParam")
data class TestScriptSetupActionAssertRulesetRuleParam(

    @SerialName("name")
    override val name: String,

    @SerialName("value")
    override val value: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionAssertRulesetRuleParam {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionAssertRulesetRuleParam"
    }
}

/**
 * FhirTestScriptSetupActionOperation
 *
 * The operation to perform.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionOperation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionOperation : FhirBackboneElement {

    /**
     * The operation code type that will be executed.
     */
    val type: Coding?

    /**
     * Resource type.
     */
    val resource: String?

    /**
     * Tracking/logging operation label.
     */
    val label: String?

    /**
     * Tracking/reporting operation description.
     */
    val description: String?

    /**
     * The content-type or mime-type to use for RESTful operation in the 'Accept'
     * header.
     */
    val accept: ContentType?

    /**
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type'
     * header.
     */
    val contentType: ContentType?

    /**
     * Server responding to the request.
     */
    val destination: Integer?

    /**
     * Whether or not to send the request url in encoded format.
     */
    val encodeRequestUrl: Bool?

    /**
     * Server initiating the request.
     */
    val origin: Integer?

    /**
     * Explicitly defined path parameters.
     */
    val params: String?

    /**
     * Each operation can have one or more header elements.
     */
    val requestHeader: kotlin.collections.List<TestScriptSetupActionOperationRequestHeader>?

    /**
     * Fixture Id of mapped request.
     */
    val requestId: String?

    /**
     * Fixture Id of mapped response.
     */
    val responseId: String?

    /**
     * Fixture Id of body for PUT and POST requests.
     */
    val sourceId: String?

    /**
     * Id of fixture used for extracting the [id], [type], and [vid] for GET requests.
     */
    val targetId: String?

    /**
     * Request URL.
     */
    val url: String?
}

/**
 * TestScriptSetupActionOperation
 *
 * The operation to perform.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionOperation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionOperation")
data class TestScriptSetupActionOperation(

    @SerialName("type")
    override val type: Coding? = null,

    @SerialName("resource")
    override val resource: String? = null,

    @SerialName("label")
    override val label: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("accept")
    override val accept: ContentType? = null,

    @SerialName("contentType")
    override val contentType: ContentType? = null,

    @SerialName("destination")
    override val destination: Integer? = null,

    @SerialName("encodeRequestUrl")
    override val encodeRequestUrl: Bool? = null,

    @SerialName("origin")
    override val origin: Integer? = null,

    @SerialName("params")
    override val params: String? = null,

    @SerialName("requestHeader")
    override val requestHeader: kotlin.collections.List<TestScriptSetupActionOperationRequestHeader>? = null,

    @SerialName("requestId")
    override val requestId: String? = null,

    @SerialName("responseId")
    override val responseId: String? = null,

    @SerialName("sourceId")
    override val sourceId: String? = null,

    @SerialName("targetId")
    override val targetId: String? = null,

    @SerialName("url")
    override val url: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionOperation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionOperation"
    }
}

/**
 * FhirTestScriptSetupActionOperationRequestHeader
 *
 * Header elements would be used to set HTTP headers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionOperationRequestHeader</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptSetupActionOperationRequestHeader : FhirBackboneElement {

    /**
     * HTTP header field name.
     */
    val field: String

    /**
     * HTTP headerfield value.
     */
    val value: String
}

/**
 * TestScriptSetupActionOperationRequestHeader
 *
 * Header elements would be used to set HTTP headers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptSetupActionOperationRequestHeader</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptSetupActionOperationRequestHeader")
data class TestScriptSetupActionOperationRequestHeader(

    @SerialName("field")
    override val field: String,

    @SerialName("value")
    override val value: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptSetupActionOperationRequestHeader {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptSetupActionOperationRequestHeader"
    }
}

/**
 * FhirTestScriptTeardown
 *
 * A series of operations required to clean up after the all the tests are executed (successfully or
 * otherwise).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTeardown</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptTeardown : FhirBackboneElement {

    /**
     * One or more teardown operations to perform.
     */
    val action: kotlin.collections.List<TestScriptTeardownAction>
}

/**
 * TestScriptTeardown
 *
 * A series of operations required to clean up after the all the tests are executed (successfully or
 * otherwise).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTeardown</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptTeardown")
data class TestScriptTeardown(

    @SerialName("action")
    override val action: kotlin.collections.List<TestScriptTeardownAction>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptTeardown {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptTeardown"
    }
}

/**
 * FhirTestScriptTeardownAction
 *
 * The teardown action will only contain an operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTeardownAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptTeardownAction : FhirBackboneElement {

    /**
     * The teardown operation to perform.
     */
    val operation: TestScriptSetupActionOperation
}

/**
 * TestScriptTeardownAction
 *
 * The teardown action will only contain an operation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTeardownAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptTeardownAction")
data class TestScriptTeardownAction(

    @SerialName("operation")
    override val operation: TestScriptSetupActionOperation,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptTeardownAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptTeardownAction"
    }
}

/**
 * FhirTestScriptTest
 *
 * A test in this script
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptTest : FhirBackboneElement {

    /**
     * Tracking/logging name of this test.
     */
    val name: String?

    /**
     * Tracking/reporting short description of the test.
     */
    val description: String?

    /**
     * A test operation or assert to perform.
     */
    val action: kotlin.collections.List<TestScriptTestAction>
}

/**
 * TestScriptTest
 *
 * A test in this script
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptTest")
data class TestScriptTest(

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<TestScriptTestAction>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptTest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptTest"
    }
}

/**
 * FhirTestScriptTestAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTestAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptTestAction : FhirBackboneElement {

    /**
     * The setup operation to perform.
     */
    val operation: TestScriptSetupActionOperation?

    /**
     * The setup assertion to perform.
     */
    val assert: TestScriptSetupActionAssert?
}

/**
 * TestScriptTestAction
 *
 * Action would contain either an operation or an assertion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptTestAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptTestAction")
data class TestScriptTestAction(

    @SerialName("operation")
    override val operation: TestScriptSetupActionOperation? = null,

    @SerialName("assert")
    override val assert: TestScriptSetupActionAssert? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptTestAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptTestAction"
    }
}

/**
 * FhirTestScriptVariable
 *
 * Variable is set based either on element value in response body or on header field value in the
 * response headers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptVariable</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
interface FhirTestScriptVariable : FhirBackboneElement {

    /**
     * Descriptive name for this variable.
     */
    val name: String

    /**
     * Default, hard-coded, or user-defined value for this variable.
     */
    val defaultValue: String?

    /**
     * Natural language description of the variable.
     */
    val description: String?

    /**
     * The fluentpath expression against the fixture body.
     */
    val expression: String?

    /**
     * HTTP header field name for source.
     */
    val headerField: String?

    /**
     * Hint help text for default value to enter.
     */
    val hint: String?

    /**
     * XPath or JSONPath against the fixture body.
     */
    val path: String?

    /**
     * Fixture Id of source expression or headerField within this variable.
     */
    val sourceId: String?
}

/**
 * TestScriptVariable
 *
 * Variable is set based either on element value in response body or on header field value in the
 * response headers.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TestScript">TestScriptVariable</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TestScript)
 */
@Serializable
@SerialName("TestScriptVariable")
data class TestScriptVariable(

    @SerialName("name")
    override val name: String,

    @SerialName("defaultValue")
    override val defaultValue: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("expression")
    override val expression: String? = null,

    @SerialName("headerField")
    override val headerField: String? = null,

    @SerialName("hint")
    override val hint: String? = null,

    @SerialName("path")
    override val path: String? = null,

    @SerialName("sourceId")
    override val sourceId: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTestScriptVariable {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TestScriptVariable"
    }
}
