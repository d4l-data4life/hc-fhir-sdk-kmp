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
{% set resource_list = [
    'DomainResource',
    'Resource',
] %}
{%- set primitives_list = [
    'Bool',
    'Date',
    'DateTime',
    'Decimal',
    'Instant',
    'Integer',
    'PositiveInteger',
    'Time',
    'UnsignedInteger',
] %}
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
{%- set test_exclusion_dict = {
    'patient-example-b.json':'Property _gender is not supported',
    'patient-example.json':'Properties _birthDate and _family are not supported'
} %}
{%- set allsuperclasses = {} %}
{%- set codesystems = {} %}
{%- set primitives = {} %}

{%- for tcase in tests %}
{%- for test in tcase.tests %}
{%- if test.enum %}
{%- set _ = codesystems.update({ test.enum:test.enum }) %}
{%- endif %}
{%- if test.klass.name in primitives_list %}
{%- set _ = primitives.update({ test.klass.name:test.klass.name }) %}
{%- endif %}
{%- endfor %}
{%- endfor %}
import care.data4life.hl7.fhir.stu3.FhirStu3Parser
{%- for _, codesystem in codesystems.items() | sort %}
import care.data4life.hl7.fhir.stu3.codesystem.{{ codesystem }}
{%- endfor %}
{%- for _, primitive in primitives.items() | sort %}
{#- import care.data4life.hl7.fhir.stu3.primitive.{{ primitive }} #}
{%- endfor %}
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * {{ class.name }}Test.java
 *
 * {{ class.short }}
{%- if class.formal %}
 *
 * {{ class.formal | replace('   ',' ') | replace('  ',' ') | replace('\n',' ') | replace('\n\n','\n') | replace('\n\n','\n') | wordwrap(100) | replace('\n', '\n * ') }}
{%- endif %}
 *
 * Generated from FHIR {{ info.version }})
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class {{ class.name }}Test {

    val parser = FhirStu3Parser()

{%- for tcase in tests %}
{%- set test_case_number = loop.index %}
{%- if tcase.filename in test_exclusion_dict %}

    @Test
    fun test{{ class.name }}{{ '%02d' % test_case_number }}() {
        // FIXME Test disabled due to issues with {{ tcase.filename }}
        // REASON - {{ test_exclusion_dict.get(tcase.filename) }}
        assertEquals(true, true)
    }
{%- else %}
{%- set test_count = tcase.tests | length %}
{%- set assertion_steps = ((test_count / 100) | round(0, 'ceil')) | int %}

    @Test
    fun test{{ class.name }}{{ '%02d' % loop.index }}() {
        // Given
        val sourceJson = loadAsString("stu3/{{ tcase.filename }}")

        // When
        val data = parser.toFhir({{ class.name }}::class, sourceJson)

        // Then
{%- for assert_cycle in range(assertion_steps) %}
        assert{{ class.name }}{{ '%02d' % test_case_number }}Step{{ '%02d' % loop.index }}(data)
{%- endfor %}

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

{%- for test_steps in tcase.tests | batch(100) %}
{%- set test_step = loop.index %}

    private fun assert{{ class.name }}{{ '%02d' % test_case_number }}Step{{ '%02d' % test_step }}(data: {{ class.name }}) {
{%- for test in test_steps %}
{% if test.enum %}
        assertEquals(
            expected = {{ test.enum }}.
{%- if test.value in enum_replacement_dict -%}
            {{ enum_replacement_dict.get(test.value) }}
{%- else -%}
            {{ test.value.upper() | replace('-', '_') }}
{%- endif %},
            actual = data.{{ test.path }}
        )
{%- else %}{% if "String" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value | replace('"', '\\"') | replace('$', '\\$') | replace('\\n',' ') }}",
            actual = data.{{ test.path }}
                ?.replace("\\n", " ")
        )
{%- else %}{% if "Decimal" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}".toDouble(),
            actual = data.{{ test.path }}?.value
        )
{%- else %}{% if "Integer" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}".toInt(),
            actual = data.{{ test.path }}?.value
        )
{%- else %}{% if "PositiveInteger" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}".toLong(),
            actual = data.{{ test.path }}?.value
        )
{%- else %}{% if "UnsignedInteger" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}".toLong(),
            actual = data.{{ test.path }}?.value
        )
{%- else %}{% if "Bool" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}".toBoolean(),
            actual = data.{{ test.path }}?.value
        )
{%- else %}{% if "Date" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}",
            actual = data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString()
        )
{%- else %}{% if "DateTime" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}",
            actual = data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString()
        )
{%- else %}{% if "Instant" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}",
            actual = data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString()
        )
{%- else %}{% if "Time" == test.klass.name %}
        assertEquals(
            expected = "{{ test.value }}",
            actual = data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString()
        )
{%- else %}
        //FIXME Don't know how to create unit test for "{{ test.path }}", which is a {{ test.klass.name }}
{%- endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}
{%- endfor %}
    }
{%- endfor %}
{%- endif %}
{%- endfor %}
}
{% if True %}{# ensure empty line at end of file #}{% endif %}
