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
 * Defines the type of structure that a definition is describing.
 *
 * @see <a href="http://hl7.org/fhir/structure-definition-kind">StructureDefinitionKind</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/structure-definition-kind">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class StructureDefinitionKind {

    /**
     * A primitive type that has a value and an extension. These can be used throughout complex datatype, Resource and extension definitions. Only the base specification can define primitive types.
     */
    @SerialName("primitive-type")
    PRIMITIVE_TYPE,

    /**
     * A  complex structure that defines a set of data elements that is suitable for use in 'resources'. The base specification defines a number of complex types, and other specifications can define additional types. These structures do not have a maintained identity.
     */
    @SerialName("complex-type")
    COMPLEX_TYPE,

    /**
     * A 'resource' - a directed acyclic graph of elements that aggregrates other types into an identifiable entity. The base FHIR resources are defined by the FHIR specification itself but other 'resources' can be defined in additional specifications (though these will not be recognised as 'resources' by the FHIR specification (i.e. they do not get end-points etc, or act as the targets of references in FHIR defined resources - though other specificatiosn can treat them this way).
     */
    @SerialName("resource")
    RESOURCE,

    /**
     * A pattern or a template that is not intended to be a real resource or complex type.
     */
    @SerialName("logical")
    LOGICAL
}
