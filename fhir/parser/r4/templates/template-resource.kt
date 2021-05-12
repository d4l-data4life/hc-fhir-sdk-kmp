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
{% set resource_list = [
    "DomainResource",
    "Resource"
] %}
{%- set primitives_list = [
    "Bool",
    "Date",
    "DateTime",
    "Decimal",
    "Instant",
    "Integer",
    "PositiveInteger",
    "Time",
    "UnsignedInteger"
] %}
{%- set allsuperclasses = {} %}
{%- set codesystems = {} %}
{%- set primitives = {} %}

{%- for klass in classes %}
{%- set ns = namespace(sclass=klass) %}
{%- for number in range(1, 10) %}
{%- if ns.sclass.superclass %}
{%- set ns.sclass = ns.sclass.superclass %}
{%- set _ = allsuperclasses.update({ns.sclass.name:ns.sclass}) %}
{%- endif %}
{%- endfor %}
{%- endfor %}

{%- for klass in classes %}
{%- for prop in klass.properties %}
{%- if prop.enum %}
{%- set _ = codesystems.update({ prop.enum.name:prop.enum.name }) %}
{%- endif %}
{%- if prop.class_name in primitives_list %}
{%- set _ = primitives.update({ prop.class_name:prop.class_name }) %}
{%- endif %}
{%- endfor %}
{%- for _, sclass in allsuperclasses.items() %}
{%- for prop in sclass.properties %}
{%- if prop.enum %}
{%- set _ = codesystems.update({ prop.enum.name:prop.enum.name }) %}
{%- endif %}
{%- if prop.class_name in primitives_list %}
{%- set _ = primitives.update({ prop.class_name:prop.class_name }) %}
{%- endif %}
{%- endfor %}
{%- endfor %}
{%- endfor %}

{%- for _, codesystem in codesystems.items() | sort %}
import care.data4life.hl7.fhir.r4.codesystem.{{ codesystem }}
{%- endfor %}
{%- for _, primitive in primitives.items() | sort %}
import care.data4life.hl7.fhir.r4.primitive.{{ primitive }}
{%- endfor %}
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

{%- for klass in classes %}
{%- set superclasses = {} %}
{%- set ns = namespace(sclass=klass) %}
{%- for number in range(1, 10) %}
{%- if ns.sclass.superclass %}
{%- set ns.sclass = ns.sclass.superclass %}
{%- set _ = superclasses.update({ns.sclass.name:ns.sclass}) %}
{%- endif %}
{%- endfor %}
{% set superclass_name = klass.superclass.name|default('R4') %}
interface Fhir{{ klass.name }} : Fhir{{ superclass_name }}{% if klass.properties %} {
{%- for prop in klass.properties %}
{% if prop.enum %}
    // {{ prop.formal }}
{%- if prop.enum.restricted_to %}
    // Only use: {{ prop.enum.restricted_to }}
{%- endif %}
{%- else %}
    // {{ prop.short }}.
{%- endif %}
    val {{ prop.name }}: {% if prop.is_array %}List<{% endif %}{% if prop.enum %}{{ prop.enum.name }}{% else %}{% if prop.class_name in resource_list %}Fhir{% endif %}{{ prop.class_name }}{% endif %}{% if prop.is_array %}>{% endif %}{% if (not prop.nonoptional) or prop.one_of_many %}?{% endif %}
{%- endfor %}
}
{%- endif %}

/**
 * ClassName: {{ klass.name }}
 *
 * SourceFileName: {{ profile.targetname }}.kt
 *
{%- if klass.formal %}
 * {{ klass.formal | replace('  ',' ') | replace('\n',' ') | wordwrap(100) | replace('\n', '\n * ') }}
{%- else  %}{% if klass.short %}
 * {{ klass.short | replace('  ',' ') | replace('\n',' ') | wordwrap(100) | replace('\n', '\n * ') }}
{%- endif %}{% endif %}
 *
 * @see <a href="{{ profile.url }}">{{ klass.name }}</a>
 *
 * Generated from FHIR {{ info.version }} ({{ profile.url }})
 */
@Serializable
@SerialName("{{ klass.name }}")
data class {{ klass.name }}(
{%- for prop in klass.properties %}
{% if prop.enum %}
    // {{ prop.formal }}
{%- if prop.enum.restricted_to %}
    // Only use: {{ prop.enum.restricted_to }}
{%- endif %}
{%- else %}
    // {{ prop.short }}.
{%- endif %}
    @SerialName("{{prop.orig_name}}")
    override val {{ prop.name }}: {% if prop.is_array %}List<{% endif %}{% if prop.enum %}{{ prop.enum.name }}{% else %}{% if prop.class_name in resource_list %}Fhir{% endif %}{{ prop.class_name }}{% endif %}{% if prop.is_array %}>{% endif %}{%- if (not prop.nonoptional) or prop.one_of_many  %}? = null{% endif %}{%- if klass.superclass %},{% else %}{% if not loop.last %},{% endif %}{% endif %}
{%- endfor %}
{%- for _, sclass in superclasses.items() %}

    // # {{ sclass.name }}
{%- for prop in sclass.properties %}
{% if prop.enum %}
    // {{ prop.formal }}
{%- if prop.enum.restricted_to %}
    // Only use: {{ prop.enum.restricted_to }}
{%- endif %}
{%- else %}
    // {{ prop.short }}.
{%- endif %}
    @SerialName("{{prop.orig_name}}")
    override val {{ prop.name }}: {% if prop.is_array %}List<{% endif %}{% if prop.enum %}{{ prop.enum.name }}{% else %}{% if prop.class_name in resource_list %}Fhir{% endif %}{{ prop.class_name }}{% endif %}{% if prop.is_array %}>{% endif %}{%- if (not prop.nonoptional) or prop.one_of_many %}? = null{% endif %}{%- if sclass.superclass %},{% else %}{% if not loop.last %},{% endif %}{% endif %}
{%- endfor %}
{%- endfor %}
) : Fhir{{ klass.name }} {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "{{ klass.name }}"
    }
}
{%- endfor %}
{% if True %}{% endif %}
