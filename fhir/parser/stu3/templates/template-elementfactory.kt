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

{%- set exclude_resources = [
] %}

{%- set exclusions = [] %}
{%- for klass in classes %}
{%- for exclude in exclude_resources %}
{%- if exclude in klass.name %}
{%- set _ = exclusions.append( klass.name ) %}
{%- endif %}
{%- endfor %}
{%- endfor %}

object FhirHelper {

    object FhirSerializationModule {
        fun module(): SerializersModule {
            return SerializersModule {
                polymorphic(FhirStu3::class) {
{%- for klass in classes %}
{%- if not klass.name in exclusions %}
                    subclass({{ klass.name }}::class)
{%- endif %}
{%- endfor %}
                }
                polymorphic(FhirResource::class) {
{%- for klass in classes %}
{%- if klass.resource_type %}
{%- if not klass.name in exclusions %}
                    subclass({{ klass.name }}::class)
{%- endif %}
{%- endif %}
{%- endfor %}
                }
            }
        }
    }

    object FhirElementFactory {

        fun <T : FhirStu3> getFhirResourceType(klass: KClass<T>): String {
            return when (klass) {
{%- for klass in classes %}
{%- if klass.resource_type %}
{%- if not klass.name in exclusions %}
                {{ klass.name }}::class -> {{ klass.name}}.resourceType()
{%- endif %}
{%- endif %}
{%- endfor %}
                else -> throw IllegalArgumentException("FHIR class unknown: $klass")
            }
        }

        fun getFhirClass(resourceType: String): KClass<*> {
            return when (resourceType) {
{%- for klass in classes %}
{%- if klass.resource_type %}
{%- if not klass.name in exclusions %}
                "{{ klass.name }}" -> {{ klass.name}}::class
{%- endif %}
{%- endif %}
{%- endfor %}
                else -> throw IllegalArgumentException("FHIR resourceType unknown: $resourceType")
            }
        }
    }
}
{% if True %}{# ensure empty line at end of file #}{% endif %}
