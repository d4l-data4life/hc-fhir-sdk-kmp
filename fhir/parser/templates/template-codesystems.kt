/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model

import kotlinx.serialization.*
import kotlin.jvm.JvmStatic

/**
 * CodeSystems.kt
 */
{% for system in systems %}{% if system.generate_enum %}

/**
 * {{ system.definition.description }}
 *
 * @see <a href="{{ system.url }}">{{ system.name }}</a>
 * {%- if system.definition.valueSet %} @see <a href="{{ system.definition.valueSet }}">ValueSet</a> {%- endif %}
 *
 * Generated from FHIR {{ info.version }} on {{ info.date }}
 */
@Serializable
enum class {{ system.name }} {

	{%- for code in system.codes %}
    /**
     * {{ code.definition }}
     */
    @SerialName("{{code.code}}")
    {%- if code.code == "=" %}
    EQUAL,
    {%- else %}
    {%- if code.code == "<" %}
    LESS_THAN,
    {%- else %}
    {%- if code.code == "<=" %}
    LESS_OR_EQUAL,
    {%- else %}
    {%- if code.code == ">" %}
    GREATER_THAN,
    {%- else %}
    {%- if code.code == ">=" %}
    GREATER_OR_EQUAL,
    {%- else %}
    {%- if code.code == "*" %}
    MAX,
    {%- else %}
    {{ code.code.upper()|replace('-', '_') }},
    {%- endif %}
    {%- endif %}
    {%- endif %}
    {%- endif %}
    {%- endif %}
    {%- endif %}
    {%- endfor %}
    ;
    /*@Serializer(forClass = {{ system.name }}::class)
    companion object {{ system.name }}Serializer : KSerializer<{{ system.name }}> {

        @JvmStatic
        fun resourceType(): kotlin.String = "{{ system.name }}Serializer"

        override fun deserialize(decoder: Decoder): {{ system.name }} {
            return valueOf(decoder.decodeString().toUpperCase().replace("-","_"))
        }
        override fun serialize(encoder: Encoder, obj: {{ system.name }}) {
            encoder.encodeString(obj.name.toLowerCase().replace("_","-"))
        }
    }*/

    override fun toString(): kotlin.String {
        return name.replace("_","-")
    }
}
{% endif %}{% endfor %}
