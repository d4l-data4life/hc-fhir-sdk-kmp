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
{%- set enum_replacement_dict = {
    '=':'EQUAL',
    '!=':'NOT_EQUAL',
    '<':'LESS_THAN',
    '<=':'LESS_OR_EQUAL',
    '>':'GREATER_THAN',
    '>=':'GREATER_OR_EQUAL',
    '>=':'GREATER_OR_EQUAL',
    '*':'MAX',
} %}

/**
 * Code System: {{ system.name }}
 *
 * {{ system.definition.description | replace('   ',' ') | replace('  ',' ') | replace('\n',' ') | replace('\n\n','\n') | wordwrap(100) | replace('\n', '\n * ') }}
 *
 * @see <a href="{{ system.url }}">{{ system.name }}</a>
{%- if system.definition.valueSet %}
 * @see <a href="{{ system.definition.valueSet }}">ValueSet</a>
{%- endif %}
 *
 * Generated from FHIR {{ info.version }}
 */
@Serializable
enum class {{ system.name }} {
{%- for code in system.codes %}

    /**
     * {{ code.definition | replace('   ',' ') | replace('  ',' ') | replace('\n',' ') | replace('\n\n','\n') | wordwrap(80) | replace('\n\n','\n') | replace('\n', '\n     * ') }}
     */
    @SerialName("{{code.code}}")
{%- if code.code in enum_replacement_dict %}
    {{ enum_replacement_dict.get(code.code) }},
{%- else %}
    {{ code.code.upper() | replace('-', '_') | replace('/', '_') | replace('.', '_') }},
{%- endif %}
{%- endfor %}
}
{% if True %}{# ensure empty line at end of file #}{% endif %}
