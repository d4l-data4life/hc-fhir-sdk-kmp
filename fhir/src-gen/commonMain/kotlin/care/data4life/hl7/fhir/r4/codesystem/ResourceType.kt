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
 * One of the resource types defined as part of this version of FHIR.
 *
 * @see <a href="http://hl7.org/fhir/resource-types">ResourceType</a>
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ResourceType {

    /**
     * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.
     */
    @SerialName("Account")
    ACCOUNT,

    /**
     * This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.
     */
    @SerialName("ActivityDefinition")
    ACTIVITYDEFINITION,

    /**
     * Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.
     */
    @SerialName("AdverseEvent")
    ADVERSEEVENT,

    /**
     * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
     */
    @SerialName("AllergyIntolerance")
    ALLERGYINTOLERANCE,

    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
     */
    @SerialName("Appointment")
    APPOINTMENT,

    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
     */
    @SerialName("AppointmentResponse")
    APPOINTMENTRESPONSE,

    /**
     * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
     */
    @SerialName("AuditEvent")
    AUDITEVENT,

    /**
     * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
     */
    @SerialName("Basic")
    BASIC,

    /**
     * A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
     */
    @SerialName("Binary")
    BINARY,

    /**
     * A material substance originating from a biological entity intended to be transplanted or infused
into another (possibly the same) biological entity.
     */
    @SerialName("BiologicallyDerivedProduct")
    BIOLOGICALLYDERIVEDPRODUCT,

    /**
     * Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
     */
    @SerialName("BodyStructure")
    BODYSTRUCTURE,

    /**
     * A container for a collection of resources.
     */
    @SerialName("Bundle")
    BUNDLE,

    /**
     * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     */
    @SerialName("CapabilityStatement")
    CAPABILITYSTATEMENT,

    /**
     * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
     */
    @SerialName("CarePlan")
    CAREPLAN,

    /**
     * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
     */
    @SerialName("CareTeam")
    CARETEAM,

    /**
     * Catalog entries are wrappers that contextualize items included in a catalog.
     */
    @SerialName("CatalogEntry")
    CATALOGENTRY,

    /**
     * The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.
     */
    @SerialName("ChargeItem")
    CHARGEITEM,

    /**
     * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
     */
    @SerialName("ChargeItemDefinition")
    CHARGEITEMDEFINITION,

    /**
     * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
     */
    @SerialName("Claim")
    CLAIM,

    /**
     * This resource provides the adjudication details from the processing of a Claim resource.
     */
    @SerialName("ClaimResponse")
    CLAIMRESPONSE,

    /**
     * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
     */
    @SerialName("ClinicalImpression")
    CLINICALIMPRESSION,

    /**
     * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
     */
    @SerialName("CodeSystem")
    CODESYSTEM,

    /**
     * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.
     */
    @SerialName("Communication")
    COMMUNICATION,

    /**
     * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
     */
    @SerialName("CommunicationRequest")
    COMMUNICATIONREQUEST,

    /**
     * A compartment definition that defines how resources are accessed on a server.
     */
    @SerialName("CompartmentDefinition")
    COMPARTMENTDEFINITION,

    /**
     * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
     */
    @SerialName("Composition")
    COMPOSITION,

    /**
     * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
     */
    @SerialName("ConceptMap")
    CONCEPTMAP,

    /**
     * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
     */
    @SerialName("Condition")
    CONDITION,

    /**
     * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
     */
    @SerialName("Consent")
    CONSENT,

    /**
     * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     */
    @SerialName("Contract")
    CONTRACT,

    /**
     * Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.
     */
    @SerialName("Coverage")
    COVERAGE,

    /**
     * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
     */
    @SerialName("CoverageEligibilityRequest")
    COVERAGEELIGIBILITYREQUEST,

    /**
     * This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
     */
    @SerialName("CoverageEligibilityResponse")
    COVERAGEELIGIBILITYRESPONSE,

    /**
     * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
     */
    @SerialName("DetectedIssue")
    DETECTEDISSUE,

    /**
     * A type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.
     */
    @SerialName("Device")
    DEVICE,

    /**
     * The characteristics, operational status and capabilities of a medical-related component of a medical device.
     */
    @SerialName("DeviceDefinition")
    DEVICEDEFINITION,

    /**
     * Describes a measurement, calculation or setting capability of a medical device.
     */
    @SerialName("DeviceMetric")
    DEVICEMETRIC,

    /**
     * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
     */
    @SerialName("DeviceRequest")
    DEVICEREQUEST,

    /**
     * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
     */
    @SerialName("DeviceUseStatement")
    DEVICEUSESTATEMENT,

    /**
     * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
     */
    @SerialName("DiagnosticReport")
    DIAGNOSTICREPORT,

    /**
     * A collection of documents compiled for a purpose together with metadata that applies to the collection.
     */
    @SerialName("DocumentManifest")
    DOCUMENTMANIFEST,

    /**
     * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
     */
    @SerialName("DocumentReference")
    DOCUMENTREFERENCE,

    /**
     * A resource that includes narrative, extensions, and contained resources.
     */
    @SerialName("DomainResource")
    DOMAINRESOURCE,

    /**
     * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.
     */
    @SerialName("EffectEvidenceSynthesis")
    EFFECTEVIDENCESYNTHESIS,

    /**
     * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
     */
    @SerialName("Encounter")
    ENCOUNTER,

    /**
     * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
     */
    @SerialName("Endpoint")
    ENDPOINT,

    /**
     * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
     */
    @SerialName("EnrollmentRequest")
    ENROLLMENTREQUEST,

    /**
     * This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
     */
    @SerialName("EnrollmentResponse")
    ENROLLMENTRESPONSE,

    /**
     * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
     */
    @SerialName("EpisodeOfCare")
    EPISODEOFCARE,

    /**
     * The EventDefinition resource provides a reusable description of when a particular event can occur.
     */
    @SerialName("EventDefinition")
    EVENTDEFINITION,

    /**
     * The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    @SerialName("Evidence")
    EVIDENCE,

    /**
     * The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
     */
    @SerialName("EvidenceVariable")
    EVIDENCEVARIABLE,

    /**
     * Example of workflow instance.
     */
    @SerialName("ExampleScenario")
    EXAMPLESCENARIO,

    /**
     * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
     */
    @SerialName("ExplanationOfBenefit")
    EXPLANATIONOFBENEFIT,

    /**
     * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
     */
    @SerialName("FamilyMemberHistory")
    FAMILYMEMBERHISTORY,

    /**
     * Prospective warnings of potential issues when providing care to the patient.
     */
    @SerialName("Flag")
    FLAG,

    /**
     * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
     */
    @SerialName("Goal")
    GOAL,

    /**
     * A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.
     */
    @SerialName("GraphDefinition")
    GRAPHDEFINITION,

    /**
     * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
     */
    @SerialName("Group")
    GROUP,

    /**
     * A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.
     */
    @SerialName("GuidanceResponse")
    GUIDANCERESPONSE,

    /**
     * The details of a healthcare service available at a location.
     */
    @SerialName("HealthcareService")
    HEALTHCARESERVICE,

    /**
     * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
     */
    @SerialName("ImagingStudy")
    IMAGINGSTUDY,

    /**
     * Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.
     */
    @SerialName("Immunization")
    IMMUNIZATION,

    /**
     * Describes a comparison of an immunization event against published recommendations to determine if the administration is "valid" in relation to those  recommendations.
     */
    @SerialName("ImmunizationEvaluation")
    IMMUNIZATIONEVALUATION,

    /**
     * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.
     */
    @SerialName("ImmunizationRecommendation")
    IMMUNIZATIONRECOMMENDATION,

    /**
     * A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.
     */
    @SerialName("ImplementationGuide")
    IMPLEMENTATIONGUIDE,

    /**
     * Details of a Health Insurance product/plan provided by an organization.
     */
    @SerialName("InsurancePlan")
    INSURANCEPLAN,

    /**
     * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
     */
    @SerialName("Invoice")
    INVOICE,

    /**
     * The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.
     */
    @SerialName("Library")
    LIBRARY,

    /**
     * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
     */
    @SerialName("Linkage")
    LINKAGE,

    /**
     * A list is a curated collection of resources.
     */
    @SerialName("List")
    LIST,

    /**
     * Details and position information for a physical place where services are provided and resources and participants may be stored, found, contained, or accommodated.
     */
    @SerialName("Location")
    LOCATION,

    /**
     * The Measure resource provides the definition of a quality measure.
     */
    @SerialName("Measure")
    MEASURE,

    /**
     * The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.
     */
    @SerialName("MeasureReport")
    MEASUREREPORT,

    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
     */
    @SerialName("Media")
    MEDIA,

    /**
     * This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.
     */
    @SerialName("Medication")
    MEDICATION,

    /**
     * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
     */
    @SerialName("MedicationAdministration")
    MEDICATIONADMINISTRATION,

    /**
     * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
     */
    @SerialName("MedicationDispense")
    MEDICATIONDISPENSE,

    /**
     * Information about a medication that is used to support knowledge.
     */
    @SerialName("MedicationKnowledge")
    MEDICATIONKNOWLEDGE,

    /**
     * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
     */
    @SerialName("MedicationRequest")
    MEDICATIONREQUEST,

    /**
     * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 

The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
     */
    @SerialName("MedicationStatement")
    MEDICATIONSTATEMENT,

    /**
     * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
     */
    @SerialName("MedicinalProduct")
    MEDICINALPRODUCT,

    /**
     * The regulatory authorization of a medicinal product.
     */
    @SerialName("MedicinalProductAuthorization")
    MEDICINALPRODUCTAUTHORIZATION,

    /**
     * The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.
     */
    @SerialName("MedicinalProductContraindication")
    MEDICINALPRODUCTCONTRAINDICATION,

    /**
     * Indication for the Medicinal Product.
     */
    @SerialName("MedicinalProductIndication")
    MEDICINALPRODUCTINDICATION,

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    @SerialName("MedicinalProductIngredient")
    MEDICINALPRODUCTINGREDIENT,

    /**
     * The interactions of the medicinal product with other medicinal products, or other forms of interactions.
     */
    @SerialName("MedicinalProductInteraction")
    MEDICINALPRODUCTINTERACTION,

    /**
     * The manufactured item as contained in the packaged medicinal product.
     */
    @SerialName("MedicinalProductManufactured")
    MEDICINALPRODUCTMANUFACTURED,

    /**
     * A medicinal product in a container or package.
     */
    @SerialName("MedicinalProductPackaged")
    MEDICINALPRODUCTPACKAGED,

    /**
     * A pharmaceutical product described in terms of its composition and dose form.
     */
    @SerialName("MedicinalProductPharmaceutical")
    MEDICINALPRODUCTPHARMACEUTICAL,

    /**
     * Describe the undesirable effects of the medicinal product.
     */
    @SerialName("MedicinalProductUndesirableEffect")
    MEDICINALPRODUCTUNDESIRABLEEFFECT,

    /**
     * Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.
     */
    @SerialName("MessageDefinition")
    MESSAGEDEFINITION,

    /**
     * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
     */
    @SerialName("MessageHeader")
    MESSAGEHEADER,

    /**
     * Raw data describing a biological sequence.
     */
    @SerialName("MolecularSequence")
    MOLECULARSEQUENCE,

    /**
     * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
     */
    @SerialName("NamingSystem")
    NAMINGSYSTEM,

    /**
     * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     */
    @SerialName("NutritionOrder")
    NUTRITIONORDER,

    /**
     * Measurements and simple assertions made about a patient, device or other subject.
     */
    @SerialName("Observation")
    OBSERVATION,

    /**
     * Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.
     */
    @SerialName("ObservationDefinition")
    OBSERVATIONDEFINITION,

    /**
     * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
     */
    @SerialName("OperationDefinition")
    OPERATIONDEFINITION,

    /**
     * A collection of error, warning, or information messages that result from a system action.
     */
    @SerialName("OperationOutcome")
    OPERATIONOUTCOME,

    /**
     * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.
     */
    @SerialName("Organization")
    ORGANIZATION,

    /**
     * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship.
     */
    @SerialName("OrganizationAffiliation")
    ORGANIZATIONAFFILIATION,

    /**
     * This resource is a non-persisted resource used to pass information into and back from an [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with it.
     */
    @SerialName("Parameters")
    PARAMETERS,

    /**
     * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
     */
    @SerialName("Patient")
    PATIENT,

    /**
     * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
     */
    @SerialName("PaymentNotice")
    PAYMENTNOTICE,

    /**
     * This resource provides the details including amount of a payment and allocates the payment items being paid.
     */
    @SerialName("PaymentReconciliation")
    PAYMENTRECONCILIATION,

    /**
     * Demographics and administrative information about a person independent of a specific health-related context.
     */
    @SerialName("Person")
    PERSON,

    /**
     * This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.
     */
    @SerialName("PlanDefinition")
    PLANDEFINITION,

    /**
     * A person who is directly or indirectly involved in the provisioning of healthcare.
     */
    @SerialName("Practitioner")
    PRACTITIONER,

    /**
     * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time.
     */
    @SerialName("PractitionerRole")
    PRACTITIONERROLE,

    /**
     * An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.
     */
    @SerialName("Procedure")
    PROCEDURE,

    /**
     * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
     */
    @SerialName("Provenance")
    PROVENANCE,

    /**
     * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
     */
    @SerialName("Questionnaire")
    QUESTIONNAIRE,

    /**
     * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
     */
    @SerialName("QuestionnaireResponse")
    QUESTIONNAIRERESPONSE,

    /**
     * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
     */
    @SerialName("RelatedPerson")
    RELATEDPERSON,

    /**
     * A group of related requests that can be used to capture intended activities that have inter-dependencies such as "give this medication after that one".
     */
    @SerialName("RequestGroup")
    REQUESTGROUP,

    /**
     * The ResearchDefinition resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    @SerialName("ResearchDefinition")
    RESEARCHDEFINITION,

    /**
     * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is about.
     */
    @SerialName("ResearchElementDefinition")
    RESEARCHELEMENTDEFINITION,

    /**
     * A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.
     */
    @SerialName("ResearchStudy")
    RESEARCHSTUDY,

    /**
     * A physical entity which is the primary unit of operational and/or administrative interest in a study.
     */
    @SerialName("ResearchSubject")
    RESEARCHSUBJECT,

    /**
     * This is the base resource type for everything.
     */
    @SerialName("Resource")
    RESOURCE,

    /**
     * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
     */
    @SerialName("RiskAssessment")
    RISKASSESSMENT,

    /**
     * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where the risk estimate is derived from a combination of research studies.
     */
    @SerialName("RiskEvidenceSynthesis")
    RISKEVIDENCESYNTHESIS,

    /**
     * A container for slots of time that may be available for booking appointments.
     */
    @SerialName("Schedule")
    SCHEDULE,

    /**
     * A search parameter that defines a named search item that can be used to search/filter on a resource.
     */
    @SerialName("SearchParameter")
    SEARCHPARAMETER,

    /**
     * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
     */
    @SerialName("ServiceRequest")
    SERVICEREQUEST,

    /**
     * A slot of time on a schedule that may be available for booking appointments.
     */
    @SerialName("Slot")
    SLOT,

    /**
     * A sample to be used for analysis.
     */
    @SerialName("Specimen")
    SPECIMEN,

    /**
     * A kind of specimen with associated set of requirements.
     */
    @SerialName("SpecimenDefinition")
    SPECIMENDEFINITION,

    /**
     * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.
     */
    @SerialName("StructureDefinition")
    STRUCTUREDEFINITION,

    /**
     * A Map of relationships between 2 structures that can be used to transform data.
     */
    @SerialName("StructureMap")
    STRUCTUREMAP,

    /**
     * The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system can take an appropriate action.
     */
    @SerialName("Subscription")
    SUBSCRIPTION,

    /**
     * A homogeneous material with a definite composition.
     */
    @SerialName("Substance")
    SUBSTANCE,

    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
     */
    @SerialName("SubstanceNucleicAcid")
    SUBSTANCENUCLEICACID,

    /**
     * Todo.
     */
    @SerialName("SubstancePolymer")
    SUBSTANCEPOLYMER,

    /**
     * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
     */
    @SerialName("SubstanceProtein")
    SUBSTANCEPROTEIN,

    /**
     * Todo.
     */
    @SerialName("SubstanceReferenceInformation")
    SUBSTANCEREFERENCEINFORMATION,

    /**
     * Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
     */
    @SerialName("SubstanceSourceMaterial")
    SUBSTANCESOURCEMATERIAL,

    /**
     * The detailed description of a substance, typically at a level beyond what is used for prescribing.
     */
    @SerialName("SubstanceSpecification")
    SUBSTANCESPECIFICATION,

    /**
     * Record of delivery of what is supplied.
     */
    @SerialName("SupplyDelivery")
    SUPPLYDELIVERY,

    /**
     * A record of a request for a medication, substance or device used in the healthcare setting.
     */
    @SerialName("SupplyRequest")
    SUPPLYREQUEST,

    /**
     * A task to be performed.
     */
    @SerialName("Task")
    TASK,

    /**
     * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     */
    @SerialName("TerminologyCapabilities")
    TERMINOLOGYCAPABILITIES,

    /**
     * A summary of information based on the results of executing a TestScript.
     */
    @SerialName("TestReport")
    TESTREPORT,

    /**
     * A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.
     */
    @SerialName("TestScript")
    TESTSCRIPT,

    /**
     * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).
     */
    @SerialName("ValueSet")
    VALUESET,

    /**
     * Describes validation requirements, source(s), status and dates for one or more elements.
     */
    @SerialName("VerificationResult")
    VERIFICATIONRESULT,

    /**
     * An authorization for the provision of glasses and/or contact lenses to a patient.
     */
    @SerialName("VisionPrescription")
    VISIONPRESCRIPTION
}
