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

import care.data4life.hl7.fhir.stu3.primitive.*
import care.data4life.hl7.fhir.stu3.codesystem.*
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

{%set resource_list = [
        "DomainResource",
        "Resource"
] %}

{%- set superclass_name = klass.superclass.name|default('Stu3') %}

interface Fhir{{ klass.name }} : Fhir{{ superclass_name }} {
        {% for prop in klass.properties -%}
        {%- if prop.enum %}
        // {{ prop.formal }}
        {%- if prop.enum.restricted_to %}
        // Only use: {{ prop.enum.restricted_to }}
        {%- endif %}
        {%- else %}
        // {{ prop.short }}.
        {%- endif %}
        val {{ prop.name }}: {% if prop.is_array %}List<{% endif %}{% if prop.enum %}{{ prop.enum.name }}{% else %}{% if prop.class_name in resource_list %}Fhir{% endif %}{{ prop.class_name }}{% endif %}{% if prop.is_array %}>{% endif %}{%- if (not prop.nonoptional) or prop.one_of_many %}?{% endif %}
        {%- endfor %}
}


/**
 * ClassName: {{ klass.name }}
 *
 * SourceFileName: {{ profile.targetname }}.kt
 *
 * {%- if klass.formal %}
 * {{ klass.formal }}
 * {%- else  %}{%- if klass.short %}
 * {{ klass.short }}
 * {% endif %}{%- endif %}
 * @see <a href="{{ profile.url }}">{{ klass.name }}</a>
 *
 * Generated from FHIR {{ info.version }} ({{ profile.url }})
 */
@Serializable
@SerialName("{{ klass.name }}")
data class {{ klass.name }}(
        {% for prop in klass.properties -%}
        {%- if prop.enum %}
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
        {%- for prop in sclass.properties -%}
        {%- if prop.enum %}
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

{% endfor %}
