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

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlin.reflect.KClass

object FhirHelper {

    object FhirSerializationModule {
        fun module(): SerializersModule {
            return SerializersModule {
                polymorphic(FhirStu3::class) {
                    subclass(Address::class)
                    subclass(Age::class)
                    subclass(Annotation::class)
                    subclass(Attachment::class)
                    subclass(BackboneElement::class)
                    subclass(CodeSystem::class)
                    subclass(CodeSystemConcept::class)
                    subclass(CodeSystemConceptDesignation::class)
                    subclass(CodeSystemConceptProperty::class)
                    subclass(CodeSystemFilter::class)
                    subclass(CodeSystemProperty::class)
                    subclass(CodeableConcept::class)
                    subclass(Coding::class)
                    subclass(Condition::class)
                    subclass(ConditionEvidence::class)
                    subclass(ConditionStage::class)
                    subclass(ContactDetail::class)
                    subclass(ContactPoint::class)
                    subclass(Contributor::class)
                    subclass(Count::class)
                    subclass(DataRequirement::class)
                    subclass(DataRequirementCodeFilter::class)
                    subclass(DataRequirementDateFilter::class)
                    subclass(Distance::class)
                    subclass(DomainResource::class)
                    subclass(Dosage::class)
                    subclass(Duration::class)
                    subclass(Element::class)
                    subclass(ElementDefinition::class)
                    subclass(ElementDefinitionBase::class)
                    subclass(ElementDefinitionBinding::class)
                    subclass(ElementDefinitionConstraint::class)
                    subclass(ElementDefinitionExample::class)
                    subclass(ElementDefinitionMapping::class)
                    subclass(ElementDefinitionSlicing::class)
                    subclass(ElementDefinitionSlicingDiscriminator::class)
                    subclass(ElementDefinitionType::class)
                    subclass(Extension::class)
                    subclass(HumanName::class)
                    subclass(Identifier::class)
                    subclass(Meta::class)
                    subclass(MetadataResource::class)
                    subclass(Money::class)
                    subclass(Narrative::class)
                    subclass(ParameterDefinition::class)
                    subclass(Patient::class)
                    subclass(PatientAnimal::class)
                    subclass(PatientContact::class)
                    subclass(PatientLink::class)
                    subclass(Period::class)
                    subclass(Practitioner::class)
                    subclass(PractitionerQualification::class)
                    subclass(Provenance::class)
                    subclass(ProvenanceAgent::class)
                    subclass(ProvenanceEntity::class)
                    subclass(Quantity::class)
                    subclass(Questionnaire::class)
                    subclass(QuestionnaireItem::class)
                    subclass(QuestionnaireItemEnableWhen::class)
                    subclass(QuestionnaireItemOption::class)
                    subclass(QuestionnaireResponse::class)
                    subclass(QuestionnaireResponseItem::class)
                    subclass(QuestionnaireResponseItemAnswer::class)
                    subclass(Range::class)
                    subclass(Ratio::class)
                    subclass(Reference::class)
                    subclass(ReferralRequest::class)
                    subclass(ReferralRequestRequester::class)
                    subclass(RelatedArtifact::class)
                    subclass(Resource::class)
                    subclass(SampledData::class)
                    subclass(Signature::class)
                    subclass(Specimen::class)
                    subclass(SpecimenCollection::class)
                    subclass(SpecimenContainer::class)
                    subclass(SpecimenProcessing::class)
                    subclass(Substance::class)
                    subclass(SubstanceIngredient::class)
                    subclass(SubstanceInstance::class)
                    subclass(Timing::class)
                    subclass(TimingRepeat::class)
                    subclass(TriggerDefinition::class)
                    subclass(UsageContext::class)
                    subclass(ValueSet::class)
                    subclass(ValueSetCompose::class)
                    subclass(ValueSetComposeInclude::class)
                    subclass(ValueSetComposeIncludeConcept::class)
                    subclass(ValueSetComposeIncludeConceptDesignation::class)
                    subclass(ValueSetComposeIncludeFilter::class)
                    subclass(ValueSetExpansion::class)
                    subclass(ValueSetExpansionContains::class)
                    subclass(ValueSetExpansionParameter::class)
                }
                polymorphic(FhirResource::class) {
                    subclass(CodeSystem::class)
                    subclass(Condition::class)
                    subclass(DomainResource::class)
                    subclass(Patient::class)
                    subclass(Practitioner::class)
                    subclass(Provenance::class)
                    subclass(Questionnaire::class)
                    subclass(QuestionnaireResponse::class)
                    subclass(ReferralRequest::class)
                    subclass(Resource::class)
                    subclass(Specimen::class)
                    subclass(Substance::class)
                    subclass(ValueSet::class)
                }
            }
        }
    }

    object FhirElementFactory {

        fun <T : FhirStu3> getFhirResourceType(klass: KClass<T>): String? {
            return when (klass) {
                CodeSystem::class -> CodeSystem.resourceType()
                Condition::class -> Condition.resourceType()
                DomainResource::class -> DomainResource.resourceType()
                Patient::class -> Patient.resourceType()
                Practitioner::class -> Practitioner.resourceType()
                Provenance::class -> Provenance.resourceType()
                Questionnaire::class -> Questionnaire.resourceType()
                QuestionnaireResponse::class -> QuestionnaireResponse.resourceType()
                ReferralRequest::class -> ReferralRequest.resourceType()
                Resource::class -> Resource.resourceType()
                Specimen::class -> Specimen.resourceType()
                Substance::class -> Substance.resourceType()
                ValueSet::class -> ValueSet.resourceType()
                else -> null
            }
        }

        fun getFhirClass(resourceType: String): KClass<*>? {
            return when (resourceType.lowercase()) {
                "codesystem" -> CodeSystem::class
                "condition" -> Condition::class
                "domainresource" -> DomainResource::class
                "patient" -> Patient::class
                "practitioner" -> Practitioner::class
                "provenance" -> Provenance::class
                "questionnaire" -> Questionnaire::class
                "questionnaireresponse" -> QuestionnaireResponse::class
                "referralrequest" -> ReferralRequest::class
                "resource" -> Resource::class
                "specimen" -> Specimen::class
                "substance" -> Substance::class
                "valueset" -> ValueSet::class
                else -> null
            }
        }
    }
}
