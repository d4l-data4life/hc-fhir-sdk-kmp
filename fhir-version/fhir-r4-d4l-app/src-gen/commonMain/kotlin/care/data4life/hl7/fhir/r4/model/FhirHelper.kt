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

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlin.reflect.KClass

object FhirHelper {

    object FhirSerializationModule {
        fun module(): SerializersModule {
            return SerializersModule {
                polymorphic(FhirR4::class) {
                    subclass(Address::class)
                    subclass(Age::class)
                    subclass(Annotation::class)
                    subclass(Attachment::class)
                    subclass(BackboneElement::class)
                    subclass(CodeableConcept::class)
                    subclass(Coding::class)
                    subclass(ContactDetail::class)
                    subclass(ContactPoint::class)
                    subclass(Contributor::class)
                    subclass(Count::class)
                    subclass(DataRequirement::class)
                    subclass(DataRequirementCodeFilter::class)
                    subclass(DataRequirementDateFilter::class)
                    subclass(DataRequirementSort::class)
                    subclass(Device::class)
                    subclass(DeviceDeviceName::class)
                    subclass(DeviceProperty::class)
                    subclass(DeviceSpecialization::class)
                    subclass(DeviceUdiCarrier::class)
                    subclass(DeviceVersion::class)
                    subclass(Distance::class)
                    subclass(DomainResource::class)
                    subclass(Dosage::class)
                    subclass(DosageDoseAndRate::class)
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
                    subclass(Expression::class)
                    subclass(Extension::class)
                    subclass(HumanName::class)
                    subclass(Identifier::class)
                    subclass(MarketingStatus::class)
                    subclass(Meta::class)
                    subclass(MetadataResource::class)
                    subclass(Money::class)
                    subclass(Narrative::class)
                    subclass(Observation::class)
                    subclass(ObservationComponent::class)
                    subclass(ObservationReferenceRange::class)
                    subclass(ParameterDefinition::class)
                    subclass(Period::class)
                    subclass(Population::class)
                    subclass(ProdCharacteristic::class)
                    subclass(ProductShelfLife::class)
                    subclass(Quantity::class)
                    subclass(Quantity::class)
                    subclass(Questionnaire::class)
                    subclass(QuestionnaireItem::class)
                    subclass(QuestionnaireItemAnswerOption::class)
                    subclass(QuestionnaireItemEnableWhen::class)
                    subclass(QuestionnaireItemInitial::class)
                    subclass(QuestionnaireResponse::class)
                    subclass(QuestionnaireResponseItem::class)
                    subclass(QuestionnaireResponseItemAnswer::class)
                    subclass(Range::class)
                    subclass(Ratio::class)
                    subclass(Reference::class)
                    subclass(RelatedArtifact::class)
                    subclass(Resource::class)
                    subclass(SampledData::class)
                    subclass(Signature::class)
                    subclass(Timing::class)
                    subclass(TimingRepeat::class)
                    subclass(TriggerDefinition::class)
                    subclass(UsageContext::class)
                }
                polymorphic(FhirResource::class) {
                    subclass(Device::class)
                    subclass(DomainResource::class)
                    subclass(Observation::class)
                    subclass(Questionnaire::class)
                    subclass(QuestionnaireResponse::class)
                    subclass(Resource::class)
                }
            }
        }
    }

    object FhirElementFactory {

        fun <T : FhirR4> getFhirResourceType(klass: KClass<T>): String? {
            return when (klass) {
                Device::class -> Device.resourceType()
                DomainResource::class -> DomainResource.resourceType()
                Observation::class -> Observation.resourceType()
                Questionnaire::class -> Questionnaire.resourceType()
                QuestionnaireResponse::class -> QuestionnaireResponse.resourceType()
                Resource::class -> Resource.resourceType()
                else -> null
            }
        }

        fun getFhirClass(resourceType: String): KClass<*>? {
            return when (resourceType.lowercase()) {
                "device" -> Device::class
                "domainresource" -> DomainResource::class
                "observation" -> Observation::class
                "questionnaire" -> Questionnaire::class
                "questionnaireresponse" -> QuestionnaireResponse::class
                "resource" -> Resource::class
                else -> null
            }
        }
    }
}
