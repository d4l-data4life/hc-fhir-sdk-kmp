#!/usr/bin/env kotlin

import java.io.File
import kotlin.system.exitProcess

val fhirSpecPath = "fhir-spec"

enum class FhirVersion(
    val versionName: String,
    val targetName: String,
    /**
     * modelExclusions need to be in sync with 'fhir-version/fhir-$targetName/parser/templates/template-elementfactory.kt' -> 'exclude_resources
     */
    val modelExclusions: List<String>,
    val codeSystemExclusions: List<String>,
) {
    FHIR3(
        versionName = "stu3",
        targetName = "stu3",
        modelExclusions = listOf(
            "ExplanationOfBenefit",
            "Claim",
        ),
        codeSystemExclusions = listOf(),
    ),
    FHIR3_D4L_APP(
        versionName = "stu3",
        targetName = "stu3-d4l-app",
        modelExclusions = listOf(
            "Account",
            "ActivityDefinition",
            "AdverseEvent",
            "AllergyIntolerance",
            "Appointment",
            "AppointmentResponse",
            "AuditEvent",
            "Basic",
            "Binary",
            "BodySite",
            "Bundle",
            "CapabilityStatement",
            "CarePlan",
            "CareTeam",
            "ChargeItem",
            "Claim",
            "ClaimResponse",
            "ClinicalImpression",
            "Communication",
            "CommunicationRequest",
            "CompartmentDefinition",
            "Composition",
            "ConceptMap",
            "Consent",
            "Contract",
            "Coverage",
            "DataElement",
            "DetectedIssue",
            "Device",
            "DeviceComponent",
            "DeviceMetric",
            "DeviceRequest",
            "DeviceUseStatement",
            "DiagnosticReport",
            "DocumentManifest",
            "DocumentReference",
            "EligibilityRequest",
            "EligibilityResponse",
            "Encounter",
            "Endpoint",
            "EnrollmentRequest",
            "EnrollmentResponse",
            "EpisodeOfCare",
            "ExpansionProfile",
            "ExplanationOfBenefit",
            "FamilyMemberHistory",
            "Flag",
            "Goal",
            "GraphDefinition",
            "Group",
            "GuidanceResponse",
            "HealthcareService",
            "ImagingManifest",
            "ImagingStudy",
            "Immunization",
            "ImmunizationRecommendation",
            "ImplementationGuide",
            "Library",
            "Linkage",
            "List",
            "Location",
            "Measure",
            "MeasureReport",
            "Media",
            "Medication",
            "MedicationAdministration",
            "MedicationDispense",
            "MedicationRequest",
            "MedicationStatement",
            "MessageDefinition",
            "MessageHeader",
            "NamingSystem",
            "NutritionOrder",
            "Observation",
            "OperationDefinition",
            "OperationOutcome",
            "Organization",
            "Parameters",
            "PaymentNotice",
            "PaymentReconciliation",
            "Person",
            "PlanDefinition",
            "PractitionerRole",
            "Procedure",
            "ProcedureRequest",
            "ProcessRequest",
            "ProcessResponse",
            "RelatedPerson",
            "RequestGroup",
            "ResearchStudy",
            "ResearchSubject",
            "RiskAssessment",
            "Schedule",
            "SearchParameter",
            "Sequence",
            "ServiceDefinition",
            "Slot",
            "StructureDefinition",
            "StructureMap",
            "Subscription",
            "SupplyDelivery",
            "SupplyRequest",
            "Task",
            "TestReport",
            "TestScript",
            "VisionPrescription",
        ),
        codeSystemExclusions = listOf(
            "AbstractType",
            "AccountStatus",
            "ActionCardinalityBehavior",
            "ActionConditionKind",
            "ActionGroupingBehavior",
            "ActionList",
            "ActionParticipantType",
            "ActionPrecheckBehavior",
            "ActionRelationshipType",
            "ActionRequiredBehavior",
            "ActionSelectionBehavior",
            "ActionType",
            "ActivityDefinitionCategory",
            "AdverseEventCategory",
            "AdverseEventCausality",
            "AdverseEventCausalityAssessment",
            "AdverseEventCausalityMethod",
            "AdverseEventCausalityResult",
            "AdverseEventOutcome",
            "AdverseEventSeriousness",
            "AllergyIntoleranceCategory",
            "AllergyIntoleranceCertainty",
            "AllergyIntoleranceClinicalStatus",
            "AllergyIntoleranceCriticality",
            "AllergyIntoleranceSeverity",
            "AllergyIntoleranceSubstanceExposureRisk",
            "AllergyIntoleranceType",
            "AllergyIntoleranceVerificationStatus",
            "AppointmentStatus",
            "AssertionDirectionType",
            "AssertionOperatorType",
            "AssertionResponseTypes",
            "AuditEventAction",
            "BundleType",
            "CapabilityStatementKind",
            "CarePlanActivityStatus",
            "CarePlanIntent",
            "CarePlanStatus",
            "CareTeamCategory",
            "CareTeamStatus",
            "ChargeItemStatus",
            "ChoiceListOrientation",
            "ClaimPayeeResourceType",
            "ClassificationOrContext",
            "ClinicalImpressionStatus",
            "CommunicationCategory",
            "CommunicationNotDoneReason",
            "CompartmentType",
            "CompositeMeasureScoring",
            "CompositionAttestationMode",
            "CompositionStatus",
            "ConceptMapEquivalence",
            "ConceptMapGroupUnmappedMode",
            "ConditionalDeleteStatus",
            "ConditionalReadStatus",
            "ConditionState",
            "ConformanceExpectation",
            "ConsentDataMeaning",
            "ConsentExceptType",
            "ConsentState",
            "ContentType",
            "CopyNumberEvent",
            "DataAbsentReason",
            "DataElementStringency",
            "DataType",
            "DefinitionStatus",
            "DefinitionTopic",
            "DetectedIssueSeverity",
            "DeviceComponentOperationalStatus",
            "DeviceComponentParameterGroup",
            "DeviceMetricCalibrationState",
            "DeviceMetricCalibrationType",
            "DeviceMetricCategory",
            "DeviceMetricColor",
            "DeviceMetricOperationalStatus",
            "DeviceSpecificationSpecType",
            "DeviceUseStatementStatus",
            "DiagnosticReportStatus",
            "DigitalMediaType",
            "DocumentMode",
            "DocumentReferenceStatus",
            "DocumentRelationshipType",
            "EncounterLocationStatus",
            "EncounterStatus",
            "EndpointStatus",
            "EpisodeOfCareStatus",
            "EventCapabilityMode",
            "EventStatus",
            "EventTiming",
            "ExplanationOfBenefitStatus",
            "ExtensionContext",
            "FamilyHistoryNotDoneReason",
            "FamilyHistoryStatus",
            "FHIRDefinedConceptProperties",
            "FHIRDeviceStatus",
            "FHIRRestfulInteractions",
            "FlagStatus",
            "GoalAcceptanceStatus",
            "GoalRelationshipType",
            "GoalStatus",
            "GraphCompartmentRule",
            "GroupType",
            "GuidanceResponseStatus",
            "GuideDependencyType",
            "GuidePageKind",
            "HL7Workgroup",
            "HTTPVerb",
            "HumanNameAssemblyOrder",
            "IdentityAssuranceLevel",
            "ImplantStatus",
            "IssueSeverity",
            "IssueType",
            "LibraryType",
            "LinkageType",
            "ListMode",
            "ListStatus",
            "LocationMode",
            "LocationStatus",
            "MatchGrade",
            "MaxOccurs",
            "MeasmntPrinciple",
            "MeasureDataUsage",
            "MeasurePopulationType",
            "MeasureReportStatus",
            "MeasureReportType",
            "MeasureScoring",
            "MeasureType",
            "MedicationAdministrationCategory",
            "MedicationAdministrationStatus",
            "MedicationContainer",
            "MedicationDispenseCategory",
            "MedicationDispenseStatus",
            "MedicationRequestCategory",
            "MedicationRequestIntent",
            "MedicationRequestPriority",
            "MedicationRequestStatus",
            "MedicationStatementCategory",
            "MedicationStatementStatus",
            "MedicationStatementTaken",
            "MedicationStatus",
            "MessageEvent",
            "MessageheaderResponseRequest",
            "MessageSignificanceCategory",
            "MessageTransport",
            "NamingSystemIdentifierType",
            "NamingSystemType",
            "NHINPurposeOfUse",
            "NoteType",
            "NutritionOrderStatus",
            "ObservationRelationshipType",
            "ObservationStatus",
            "OperationKind",
            "OperationOutcomeCodes",
            "ParticipantRequired",
            "ParticipationStatus",
            "PlanDefinitionType",
            "QualityOfEvidenceRating",
            "QualityType",
            "QuestionnaireItemUsageMode",
            "ReferenceHandlingPolicy",
            "ReferralMethod",
            "RepositoryType",
            "ResearchStudyStatus",
            "ResearchSubjectStatus",
            "ResourceTypeLink",
            "ResourceValidationMode",
            "ResourceVersionPolicy",
            "ResponseType",
            "RestfulCapabilityMode",
            "RestfulSecurityService",
            "SearchComparator",
            "SearchEntryMode",
            "SearchModifierCode",
            "SearchParamType",
            "SequenceStatus",
            "SequenceType",
            "ServiceProvisionConditions",
            "SlotStatus",
            "SpecialValues",
            "StrengthOfRecommendationRating",
            "StructureDefinitionKind",
            "StructureMapContextType",
            "StructureMapGroupTypeMode",
            "StructureMapInputMode",
            "StructureMapModelMode",
            "StructureMapSourceListMode",
            "StructureMapTargetListMode",
            "StructureMapTransform",
            "SubscriptionChannelType",
            "SubscriptionStatus",
            "SubscriptionTag",
            "SupplyDeliveryStatus",
            "SupplyRequestReason",
            "SupplyRequestStatus",
            "SystemVersionProcessingMode",
            "TaskPerformerType",
            "TaskStatus",
            "TestReportActionResult",
            "TestReportParticipantType",
            "TestReportResult",
            "TestReportStatus",
            "TestScriptRequestMethodCode",
            "TransactionMode",
            "TypeDerivationRule",
            "UDIEntryType",
            "UnknownContentCode",
            "UsageContextType",
            "Use",
            "VisionBase",
            "VisionEyes",
            "XPathUsageType",
        ),
    ),
    FHIR4(
        versionName = "r4",
        targetName = "r4",
        modelExclusions = listOf(
            "ExampleScenario",
        ),
        codeSystemExclusions = listOf(),
    ),
    FHIR4_D4L_APP(
        versionName = "r4",
        targetName = "r4-d4l-app",
        modelExclusions = listOf(
            "Account",
            "ActivityDefinition",
            "AdverseEvent",
            "AllergyIntolerance",
            "Appointment",
            "AppointmentResponse",
            "AuditEvent",
            "Basic",
            "Binary",
            "BiologicallyDerivedProduct",
            "BodyStructure",
            "Bundle",
            "CapabilityStatement",
            "CarePlan",
            "CareTeam",
            "CatalogEntry",
            "ChargeItem",
            "ChargeItemDefinition",
            "Claim",
            "ClaimResponse",
            "ClinicalImpression",
            "Communication",
            "CommunicationRequest",
            "CompartmentDefinition",
            "Composition",
            "ConceptMap",
            "Consent",
            "Contract",
            "Coverage",
            "CoverageEligibilityRequest",
            "CoverageEligibilityResponse",
            "DetectedIssue",
            "DeviceDefinition",
            "DeviceMetric",
            "DeviceRequest",
            "DeviceUseStatement",
            "DiagnosticReport",
            "DocumentManifest",
            "DocumentReference",
            "EffectEvidenceSynthesis",
            "Encounter",
            "Endpoint",
            "EnrollmentRequest",
            "EnrollmentResponse",
            "EpisodeOfCare",
            "EventDefinition",
            "Evidence",
            "EvidenceVariable",
            "ExampleScenario",
            "ExplanationOfBenefit",
            "FamilyMemberHistory",
            "Flag",
            "Goal",
            "GraphDefinition",
            "Group",
            "GuidanceResponse",
            "HealthcareService",
            "ImagingStudy",
            "Immunization",
            "ImmunizationEvaluation",
            "ImmunizationRecommendation",
            "ImplementationGuide",
            "InsurancePlan",
            "Invoice",
            "Library",
            "Linkage",
            "List",
            "Location",
            "Measure",
            "MeasureReport",
            "Media",
            "Medication",
            "MedicationAdministration",
            "MedicationDispense",
            "MedicationKnowledge",
            "MedicationRequest",
            "MedicationStatement",
            "MedicinalProduct",
            "MedicinalProductAuthorization",
            "MedicinalProductContraindication",
            "MedicinalProductIndication",
            "MedicinalProductIngredient",
            "MedicinalProductInteraction",
            "MedicinalProductManufactured",
            "MedicinalProductPackaged",
            "MedicinalProductPharmaceutical",
            "MedicinalProductUndesirableEffect",
            "MessageDefinition",
            "MessageHeader",
            "MolecularSequence",
            "NamingSystem",
            "NutritionOrder",
            "ObservationDefinition",
            "OperationDefinition",
            "OperationOutcome",
            "Organization",
            "OrganizationAffiliation",
            "Parameters",
            "PaymentNotice",
            "PaymentReconciliation",
            "Person",
            "PlanDefinition",
            "PractitionerRole",
            "Procedure",
            "RelatedPerson",
            "RequestGroup",
            "ResearchDefinition",
            "ResearchElementDefinition",
            "ResearchStudy",
            "ResearchSubject",
            "RiskAssessment",
            "RiskEvidenceSynthesis",
            "Schedule",
            "SearchParameter",
            "Slot",
            "SpecimenDefinition",
            "StructureDefinition",
            "StructureMap",
            "Subscription",
            "SubstanceNucleicAcid",
            "SubstancePolymer",
            "SubstanceProtein",
            "SubstanceReferenceInformation",
            "SubstanceSourceMaterial",
            "SubstanceSpecification",
            "SupplyDelivery",
            "SupplyRequest",
            "Task",
            "TerminologyCapabilities",
            "TestReport",
            "TestScript",
            "VerificationResult",
            "VisionPrescription",
        ),
        codeSystemExclusions = listOf(
             "AbstractType",
             "AccountStatus",
             "ActionCardinalityBehavior",
             "ActionConditionKind",
             "ActionGroupingBehavior",
             "ActionParticipantType",
             "ActionPrecheckBehavior",
             "ActionRelationshipType",
             "ActionRequiredBehavior",
             "ActionSelectionBehavior",
             "ActionType",
             "ActivityDefinitionCategory",
             "AdditionalMaterialCodes",
             "AdjudicationReasonCodes",
             "AdjudicationValueCodes",
             "AdmitSource",
             "AdverseEventActuality",
             "AdverseEventCategory",
             "AdverseEventCausalityAssessment",
             "AdverseEventCausalityMethod",
             "AdverseEventOutcome",
             "AdverseEventSeriousness",
             "AdverseEventSeverity",
             "AllergyIntoleranceCategory",
             "AllergyIntoleranceCertainty",
             "AllergyIntoleranceClinicalStatusCodes",
             "AllergyIntoleranceCriticality",
             "AllergyIntoleranceSeverity",
             "AllergyIntoleranceSubstanceExposureRisk",
             "AllergyIntoleranceType",
             "AllergyIntoleranceVerificationStatusCodes",
             "AlternativeCodeKind",
             "AnimalSpecies",
             "AppointmentStatus",
             "AssertionDirectionType",
             "AssertionOperatorType",
             "AssertionResponseTypes",
             "AuditEventAction",
             "AuditEventID",
             "BasicResourceTypes",
             "BenefitCostApplicability",
             "BenefitTermCodes",
             "BenefitTypeCodes",
             "BiologicallyDerivedProductCategory",
             "BiologicallyDerivedProductStatus",
             "BiologicallyDerivedProductStorageScale",
             "BundleType",
             "CanonicalStatusCodesForFHIRResources",
             "CanPushUpdates",
             "CapabilityStatementKind",
             "CarePlanActivityStatus",
             "CareTeamStatus",
             "CatalogEntryRelationType",
             "CatalogType",
             "CertaintySubcomponentRating",
             "CertaintySubcomponentType",
             "ChargeItemStatus",
             "ChoiceListOrientation",
             "ClaimCareTeamRoleCodes",
             "ClaimInformationCategoryCodes",
             "ClaimItemTypeCodes",
             "ClaimPayeeResourceType",
             "ClaimProcessingCodes",
             "ClaimTypeCodes",
             "CodeSearchSupport",
             "CommonTags",
             "CommunicationCategory",
             "CommunicationNotDoneReason",
             "CommunicationTopic",
             "CompartmentType",
             "CompositeMeasureScoring",
             "CompositionAttestationMode",
             "CompositionStatus",
             "ConceptMapEquivalence",
             "ConceptMapGroupUnmappedMode",
             "ConceptSubsumptionOutcome",
             "ConditionalDeleteStatus",
             "ConditionalReadStatus",
             "ConditionCategoryCodes",
             "ConditionClinicalStatusCodes",
             "ConditionState",
             "ConditionVerificationStatus",
             "ConformanceExpectation",
             "ConsentActionCodes",
             "ConsentCategoryCodes",
             "ConsentDataMeaning",
             "ConsentPolicyRuleCodes",
             "ConsentProvisionType",
             "ConsentScopeCodes",
             "ConsentState",
             "ContactEntityType",
             "ContainerCap",
             "ContractActionCodes",
             "ContractActorRoleCodes",
             "ContractContentDerivationCodes",
             "ContractDataMeaning",
             "ContractResourceActionStatusCodes",
             "ContractResourceAssetAvailiabilityCodes",
             "ContractResourceAssetContextCodes",
             "ContractResourceAssetScopeCodes",
             "ContractResourceAssetSubTypeCodes",
             "ContractResourceAssetTypeCodes",
             "ContractResourceDecisionModeCodes",
             "ContractResourceDefinitionSubtypeCodes",
             "ContractResourceDefinitionTypeCodes",
             "ContractResourceExpirationTypeCodes",
             "ContractResourceLegalStateCodes",
             "ContractResourcePartyRoleCodes",
             "ContractResourcePublicationStatusCodes",
             "ContractResourceScopeCodes",
             "ContractResourceSecurityControlCodes",
             "ContractResourceStatusCodes",
             "ContractSignerTypeCodes",
             "ContractSubtypeCodes",
             "ContractTermSubtypeCodes",
             "ContractTermTypeCodes",
             "ContractTypeCodes",
             "CopyNumberEvent",
             "CoverageClassCodes",
             "CoverageCopayTypeCodes",
             "CoverageEligibilityResponseAuthSupportCodes",
             "CoverageSelfPayCodes",
             "DataAbsentReason",
             "DataType",
             "DefinitionResourceType",
             "DefinitionStatus",
             "DefinitionTopic",
             "DefinitionUseCodes",
             "DetectedIssueSeverity",
             "DeviceDefinitionParameterGroup",
             "DeviceMetricCalibrationState",
             "DeviceMetricCalibrationType",
             "DeviceMetricCategory",
             "DeviceMetricColor",
             "DeviceMetricOperationalStatus",
             "DeviceUseStatementStatus",
             "DiagnosisRole",
             "DiagnosticReportStatus",
             "Diet",
             "DischargeDisposition",
             "DocumentMode",
             "DocumentReferenceStatus",
             "DocumentRelationshipType",
             "DoseAndRateType",
             "EffectEstimateType",
             "EligibilityRequestPurpose",
             "EligibilityResponsePurpose",
             "EncounterLocationStatus",
             "EncounterStatus",
             "EncounterType",
             "EndpointConnectionType",
             "EndpointPayloadType",
             "EndpointStatus",
             "EnteralFormulaAdditiveTypeCode",
             "EpisodeOfCareStatus",
             "EpisodeOfCareType",
             "EventCapabilityMode",
             "EventResourceType",
             "EventStatus",
             "EventTiming",
             "EvidenceVariableType",
             "EvidenceVariantState",
             "ExampleClaimSubTypeCodes",
             "ExampleCoverageFinancialExceptionCodes",
             "ExampleDiagnosisOnAdmissionCodes",
             "ExampleDiagnosisTypeCodes",
             "ExampleMessageReasonCodes",
             "ExampleOnsetTypeReasonCodes",
             "ExamplePaymentTypeCodes",
             "ExamplePharmacyServiceCodes",
             "ExampleProcedureTypeCodes",
             "ExampleProgramReasonCodes",
             "ExampleRelatedClaimRelationshipCodes",
             "ExampleScenarioActorType",
             "ExampleServiceModifierCodes",
             "ExampleServiceProductCodes",
             "ExampleUseCodesForList",
             "ExampleVisionPrescriptionProductCodes",
             "ExceptionCodes",
             "ExpansionParameterSource",
             "ExpansionProcessingRule",
             "ExplanationOfBenefitStatus",
             "ExposureState",
             "ExpressionLanguage",
             "ExtensionContextType",
             "FailureAction",
             "FamilyHistoryAbsentReason",
             "FamilyHistoryStatus",
             "FeedingDeviceCodes",
             "FHIRDefinedConceptProperties",
             "FHIRDeviceStatusReason",
             "FHIRRestfulInteractions",
             "FinancialResourceStatusCodes",
             "FinancialTaskCodes",
             "FinancialTaskInputTypeCodes",
             "FlagCategory",
             "FlagPriorityCodes",
             "FlagStatus",
             "GenderIdentity",
             "GenderStatus",
             "GoalAcceptanceStatus",
             "GoalAchievementStatus",
             "GoalCategory",
             "GoalLifecycleStatus",
             "GoalPriority",
             "GoalRelationshipType",
             "GoalStatusReason",
             "GraphCompartmentRule",
             "GraphCompartmentUse",
             "GroupMeasure",
             "GroupType",
             "GuidanceResponseStatus",
             "GuidePageGeneration",
             "GuideParameterCode",
             "HandlingConditionSet",
             "HL7Workgroup",
             "HTTPVerb",
             "HumanNameAssemblyOrder",
             "IdentityAssuranceLevel",
             "ImagingStudyStatus",
             "ImmunizationEvaluationDoseStatusCodes",
             "ImmunizationEvaluationDoseStatusReasonCodes",
             "ImmunizationFundingSource",
             "ImmunizationOriginCodes",
             "ImmunizationProgramEligibility",
             "ImmunizationRecommendationStatusCodes",
             "ImmunizationSubpotentReason",
             "ImplantStatus",
             "Indicator",
             "InterventionCodes",
             "InvoicePriceComponentType",
             "InvoiceStatus",
             "ISO210892017HealthRecordLifecycleEvents",
             "IssueSeverity",
             "IssueType",
             "KnowledgeResourceType",
             "LanguagePreferenceType",
             "LibraryType",
             "LinkageType",
             "ListEmptyReasons",
             "ListMode",
             "ListOrderCodes",
             "ListStatus",
             "LocationMode",
             "LocationStatus",
             "LocationType",
             "MatchGrade",
             "MaxOccurs",
             "MeasureDataUsage",
             "MeasureImprovementNotation",
             "MeasurePopulationType",
             "MeasureReportStatus",
             "MeasureReportType",
             "MeasureScoring",
             "MeasureType",
             "MediaModality",
             "MediaType",
             "MedicationAdministrationCategoryCodes",
             "MedicationAdministrationPerformerFunctionCodes",
             "MedicationAdministrationStatusCodes",
             "MedicationDispenseCategoryCodes",
             "MedicationDispensePerformerFunctionCodes",
             "MedicationDispenseStatusCodes",
             "MedicationDispenseStatusReasonCodes",
             "MedicationKnowledgeCharacteristicCodes",
             "MedicationKnowledgePackageTypeCodes",
             "MedicationKnowledgeStatusCodes",
             "MedicationRequestCategoryCodes",
             "MedicationRequestCourseOfTherapyCodes",
             "MedicationRequestIntent",
             "MedicationrequestStatus",
             "MedicationRequestStatusReasonCodes",
             "MedicationStatementStatusCodes",
             "MedicationStatusCodes",
             "MedicationUsageCategoryCodes",
             "MessageheaderResponseRequest",
             "MessageSignificanceCategory",
             "MessageTransport",
             "MissingToothReasonCodes",
             "ModifierTypeCodes",
             "NamingSystemIdentifierType",
             "NamingSystemType",
             "Need",
             "NetworkTypeCodes",
             "NHINPurposeOfUse",
             "NoteType",
             "ObservationCategoryCodes",
             "ObservationDataType",
             "ObservationRangeCategory",
             "ObservationReferenceRangeMeaningCodes",
             "OperationKind",
             "OperationOutcomeCodes",
             "OrganizationAffiliationRole",
             "OrganizationType",
             "OrientationType",
             "ParticipantRequired",
             "ParticipantType",
             "ParticipationStatus",
             "PayeeResourceType",
             "PaymentAdjustmentReasonCodes",
             "PaymentStatusCodes",
             "PaymentTypeCodes",
             "PerformerRoleCodes",
             "PlanDefinitionType",
             "PractitionerRole",
             "PractitionerSpecialty",
             "PrecisionEstimateType",
             "PrimarySourceType",
             "ProcedureDeviceActionCodes",
             "ProcedureProgressStatusCodes",
             "ProcessPriorityCodes",
             "ProvenanceParticipantRole",
             "ProvenanceParticipantType",
             "PushTypeAvailable",
             "QualityOfEvidenceRating",
             "QualityType",
             "QuestionnaireItemUIControlCodes",
             "QuestionnaireItemUsageMode",
             "QuestionnaireTextCategories",
             "ReasonMedicationGivenCodes",
             "ReferenceHandlingPolicy",
             "ReferralMethod",
             "RejectionCriterion",
             "RepositoryType",
             "RequestResourceType",
             "ResearchElementType",
             "ResearchStudyObjectiveType",
             "ResearchStudyPhase",
             "ResearchStudyPrimaryPurposeType",
             "ResearchStudyReasonStopped",
             "ResearchStudyStatus",
             "ResearchSubjectStatus",
             "ResourceSecurityCategory",
             "ResourceValidationMode",
             "ResourceVersionPolicy",
             "ResponseType",
             "RestfulCapabilityMode",
             "RestfulSecurityService",
             "RiskEstimateType",
             "RiskProbability",
             "SearchComparator",
             "SearchEntryMode",
             "SearchModifierCode",
             "SearchParamType",
             "SequenceStatus",
             "SequenceType",
             "ServiceProvisionConditions",
             "SlotStatus",
             "SmartCapabilities",
             "SNOMEDCTReasonMedicationNotGivenCodes",
             "SpecialArrangements",
             "SpecialValues",
             "SpecimenContainedPreference",
             "StandardsStatus",
             "Status",
             "StrandType",
             "StrengthOfRecommendationRating",
             "StructureDefinitionKind",
             "StructureMapContextType",
             "StructureMapGroupTypeMode",
             "StructureMapInputMode",
             "StructureMapModelMode",
             "StructureMapSourceListMode",
             "StructureMapTargetListMode",
             "StructureMapTransform",
             "StudyType",
             "SubscriberRelationshipCodes",
             "SubscriptionChannelType",
             "SubscriptionStatus",
             "SubscriptionTag",
             "SubstanceCategoryCodes",
             "SupplyDeliveryStatus",
             "SupplyItemType",
             "SupplyRequestReason",
             "SupplyRequestStatus",
             "SupplyType",
             "SurfaceCodes",
             "SynthesisType",
             "TaskCode",
             "TaskIntent",
             "TaskStatus",
             "TemplateStatusCodeLifeCycle",
             "TestReportActionResult",
             "TestReportParticipantType",
             "TestReportResult",
             "TestReportStatus",
             "TestScriptOperationCode",
             "TestScriptProfileDestinationType",
             "TestScriptProfileOriginType",
             "TestScriptRequestMethodCode",
             "TransactionMode",
             "TypeDerivationRule",
             "UDICodes",
             "UnitTypeCodes",
             "UnknownContentCode",
             "UsageContextType",
             "Use",
             "ValidationProcess",
             "ValidationStatus",
             "ValidationType",
             "VerificationresultCommunicationMethod",
             "VisionBase",
             "VisionEyes",
             "XPathUsageType",
        ),
    ),
}

fun staticReplacementMap(fhirVersion: FhirVersion) = when (fhirVersion) {
    FhirVersion.FHIR4 -> mapOf(
        "MedicationStatementStatusCodes.kt" to targetCodesystems(fhirVersion),
        "MedicationStatementFhirTest.kt" to targetTests(fhirVersion),
        "MedicationStatement.kt" to targetModels(fhirVersion),
    )
    FhirVersion.FHIR4_D4L_APP -> mapOf(
        "MedicationStatementStatusCodes.kt" to targetCodesystems(fhirVersion),
    )
    FhirVersion.FHIR3 -> mapOf()
    FhirVersion.FHIR3_D4L_APP -> mapOf()
}

fun sourceParserConfig(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/parser/config"

fun sourceParserTemplates(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/parser/templates"

fun sourceParserStatics(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/parser/statics"

val parserPath = "fhir-spec-parser"
val sourceCodesystems = "$parserPath/codesystems"
val sourceModels = "$parserPath/models"
val sourceTests = "$parserPath/tests"
val sourceTestJsons = "$parserPath/downloads"

fun targetCodesystems(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/commonMain/kotlin/care/data4life/hl7/fhir/${fhirVersion.versionName}/codesystem"

fun targetModels(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/commonMain/kotlin/care/data4life/hl7/fhir/${fhirVersion.versionName}/model"

fun targetTests(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/jvmTest/kotlin/care/data4life/hl7/fhir/${fhirVersion.versionName}/model"

fun targetTestJsons(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/jvmTest/resources/${fhirVersion.versionName}"

var fhirVersions = listOf(
    FhirVersion.FHIR4,
    FhirVersion.FHIR4_D4L_APP,
    FhirVersion.FHIR3,
    FhirVersion.FHIR3_D4L_APP,
)

if (args.isNotEmpty()) {
    when (args[0]) {
        "fhir4" -> fhirVersions = listOf(FhirVersion.FHIR4)
        "fhir4-d4l-app" -> fhirVersions = listOf(FhirVersion.FHIR4_D4L_APP)
        "fhir3" -> fhirVersions = listOf(FhirVersion.FHIR3)
        "fhir3-d4l-app" -> fhirVersions = listOf(FhirVersion.FHIR3_D4L_APP)
        "all" -> {
        }
        "-h", "--help" -> printUsage()
        else -> {
            println("Sorry I didn't understand ${args[0]}")
            printUsage()
            exitProcess(1)
        }
    }
}

fun printUsage() {
    println(
        """
            Usage: ./generateFhir.main.kts [<option>]
                all             Generates all FHIR versions. Default is <all>.
                fhir3           Generate FHIR3 sources and tests
                fhir4           Generate FHIR4 sources and tests
                fhir4-d4l-app   Generate FHIR4 sources and tests for the D4L App
        """.trimIndent()
    )
}

if (!File(parserPath).exists()) {
    println(
        """
        This script depends on the fhir parser: https://github.com/gesundheitscloud/fhir-parser/
        
        Please call git submodule update --init --recursive to ensure it's available.
        """.trimIndent()
    )
    exitProcess(1)
}

for (fhirVersion in fhirVersions) {
    println("Start to generate ${fhirVersion.versionName}")
    cleanup()
    generateFhirModels(fhirVersion)
    integrateFhirModels(fhirVersion)
    integrateStatics(fhirVersion)
    cleanup()
    formatCode()
}

fun generateFhirModels(fhirVersion: FhirVersion) {
    println("Copy FHIR parser configuration")

    File(sourceParserConfig(fhirVersion)).walk()
        .filter { !it.isDirectory }
        .forEach { it.copyTo(File("$parserPath/${it.name}")) }
    File(sourceParserTemplates(fhirVersion)).walk()
        .filter { !it.isDirectory }
        .forEach { it.copyTo(File("$parserPath/templates/${it.name}")) }

    println("Copy FHIR specification")
    cmd("mkdir $parserPath/downloads")
    cmd("cp -a $fhirSpecPath/hl7.org/fhir/${fhirVersion.versionName}/version.info $parserPath/downloads/")
    cmd("unzip -o $fhirSpecPath/hl7.org/fhir/${fhirVersion.versionName}/examples-json.zip -d $parserPath/downloads/")

    println("Generate FHIR files")
    if (!cmd("test -d venv", parserPath)) {
        if (!cmd("python3 -m venv venv", parserPath)) {
            println("Python virtual environment not present and couldn't be created")
            exitProcess(1)
        }
    }

    cmd("venv/bin/pip install --upgrade pip", parserPath)
    cmd("venv/bin/pip install -Ur requirements.txt", parserPath)
    cmd("venv/bin/python generate.py --cache-only", parserPath)

    println(" ✅ Done generating ${fhirVersion.versionName} model")
}

fun integrateFhirModels(fhirVersion: FhirVersion) {
    val targetCodesystems = targetCodesystems(fhirVersion)
    val targetModels = targetModels(fhirVersion)
    val targetTests = targetTests(fhirVersion)
    val targetTestJsons = targetTestJsons(fhirVersion)

    // Remove old models
    cmd("rm -rf $targetCodesystems")
    cmd("rm -rf $targetModels")
    cmd("rm -rf $targetTests")
    cmd("rm -rf $targetTestJsons")

    // Move codesystems
    cmd("mkdir $targetCodesystems")
    File(sourceCodesystems)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (!fhirVersion.codeSystemExclusions.contains(
                    file.name.replace(".kt", "")
                )
            ) {
                file.copyTo(File("$targetCodesystems/${file.name}"))
            }
        }

    // Move models
    cmd("mkdir $targetModels")
    File(sourceModels)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (!fhirVersion.modelExclusions.contains(
                    file.name.replace(".kt", "")
                )
            ) {
                file.copyTo(File("$targetModels/${file.name}"))
            }
        }

    // Move tests
    cmd("mkdir $targetTests")
    File(sourceTests)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (!fhirVersion.modelExclusions.contains(
                    file.name.replace("FhirTest", "")
                        .replace(".kt", "")
                )
            ) {
                file.copyTo(File("$targetTests/${file.name}"))
            }
        }

    // Move JSON
    cmd("mkdir $targetTestJsons")
    File(sourceTestJsons)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (file.name.contains("example")) {
                file.copyTo(File("$targetTestJsons/${file.name}"))
            }
        }

    println(" ✅ Done integrating $fhirVersion generated codesystems, models and tests")
}

/**
 * Hotfix for https://gesundheitscloud.atlassian.net/browse/SDK-576
 * TODO Remove once the Spec is fixed
 */
fun integrateStatics(fhirVersion: FhirVersion) {
    println("Include static FHIR replacements")

    val source = sourceParserStatics(fhirVersion)

    for ((file, target) in staticReplacementMap(fhirVersion)) {
        cmd("cp $source/$file $target")
    }

    println(" ✅ Done including static FHIR replacements")
}

fun formatCode() {
    cmd("./gradlew spotlessApply")
    println(" ✅ Done formatting generated FHIR code")
}

fun cleanup() {
    println("Start cleanup")

    cmd("rm -rf ${parserPath}/codesystems")
    cmd("rm -rf ${parserPath}/dependencies.json")
    cmd("rm -rf ${parserPath}/downloads")
    cmd("rm -rf ${parserPath}/mappings.py")
    cmd("rm -rf ${parserPath}/models")
    cmd("rm -rf ${parserPath}/settings.py")
    cmd("rm -rf ${parserPath}/templates")
    cmd("rm -rf ${parserPath}/tests")

    println(" ✅ Done cleanup")
}

fun cmd(command: String, path: String = "./"): Boolean {
    val commands = command.split(" ")
    val arguments = commands.subList(1, commands.size)
    val result = ProcessBuilder()
        .directory(File(path))
        .command(commands[0], *arguments.toTypedArray())
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor()
    return result == 0
}
