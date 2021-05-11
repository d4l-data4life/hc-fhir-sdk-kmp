/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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

object FhirSerializationModule {

    fun module(): SerializersModule {
        return SerializersModule {
            polymorphic(FhirStu3::class) {
                subclass(Address::class)
                subclass(Age::class)
                subclass(Annotation::class)
                subclass(Attachment::class)
                subclass(BackboneElement::class)
                subclass(CarePlan::class)
                subclass(CareTeam::class)
                subclass(CodeSystem::class)
                subclass(CodeableConcept::class)
                subclass(Coding::class)
                subclass(Condition::class)
                subclass(ContactDetail::class)
                subclass(ContactPoint::class)
                subclass(Count::class)
                subclass(DiagnosticReport::class)
                subclass(Distance::class)
                subclass(DocumentReference::class)
                subclass(DomainResource::class)
                subclass(Dosage::class)
                subclass(Duration::class)
                subclass(Element::class)
                subclass(Extension::class)
                subclass(FamilyMemberHistory::class)
                subclass(Goal::class)
                subclass(HumanName::class)
                subclass(Identifier::class)
                subclass(Medication::class)
                subclass(MedicationRequest::class)
                subclass(Meta::class)
                subclass(Money::class)
                subclass(Narrative::class)
                subclass(Observation::class)
                subclass(Organization::class)
                subclass(Patient::class)
                subclass(Period::class)
                subclass(Practitioner::class)
                subclass(Procedure::class)
                subclass(ProcedureRequest::class)
                subclass(Provenance::class)
                subclass(Quantity::class)
                subclass(Questionnaire::class)
                subclass(QuestionnaireResponse::class)
                subclass(Range::class)
                subclass(Ratio::class)
                subclass(Reference::class)
                subclass(ReferralRequest::class)
                subclass(Resource::class)
                subclass(SampledData::class)
                subclass(Signature::class)
                subclass(Specimen::class)
                subclass(Substance::class)
                subclass(Timing::class)
                subclass(UsageContext::class)
                subclass(ValueSet::class)
            }
            polymorphic(FhirResource::class) {
                subclass(CarePlan::class)
                subclass(CareTeam::class)
                subclass(CodeSystem::class)
                subclass(Condition::class)
                subclass(DiagnosticReport::class)
                subclass(DocumentReference::class)
                subclass(DomainResource::class)
                subclass(FamilyMemberHistory::class)
                subclass(Goal::class)
                subclass(Medication::class)
                subclass(MedicationRequest::class)
                subclass(Observation::class)
                subclass(Organization::class)
                subclass(Patient::class)
                subclass(Practitioner::class)
                subclass(Procedure::class)
                subclass(ProcedureRequest::class)
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
