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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The type of PlanDefinition.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/plan-definition-type">PlanDefinitionType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/plan-definition-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class PlanDefinitionType {

    /**
     * A pre-defined and approved group of orders related to a particular clinical
     * condition (e.g. hypertension treatment and monitoring) or stage of care (e.g.
     * hospital admission to Coronary Care Unit). An order set is used as a checklist
     * for the clinician when managing a patient with a specific condition. It is a
     * structured collection of orders relevant to that condition and presented to the
     * clinician in a computerized provider order entry (CPOE) system.
     */
    @SerialName("order-set")
    ORDER_SET,

    /**
     * Defines a desired/typical sequence of clinical activities including
     * preconditions, triggers and temporal relationships.
     */
    @SerialName("clinical-protocol")
    CLINICAL_PROTOCOL,

    /**
     * A decision support rule of the form [on Event] if Condition then Action. It is
     * intended to be a shareable, computable definition of actions that should be
     * taken whenever some condition is met in response to a particular event or
     * events.
     */
    @SerialName("eca-rule")
    ECA_RULE,

    /**
     * Defines the steps for a group of one or more systems in an event flow process
     * along with the step constraints, sequence, pre-conditions and decision points to
     * complete a particular objective.
     */
    @SerialName("workflow-definition")
    WORKFLOW_DEFINITION
}
