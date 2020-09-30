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


import javax.annotation.Generated

import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.test.util.FileHelper.loadAsString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.modules.SerializersModule

import kotlin.test.assertEquals

/**
 * {{ class.name }}Test.java
 *
 * {{ class.short }}.
 * {%- if class.formal %}
 * {{ class.formal }}
 * {%- endif %}
 */
@Generated("Generated from FHIR {{ info.version }} on {{ info.date }}")
class {{ class.name }}Test {

	val parser = FhirStu3Parser()

	{% for tcase in tests %}

	@Test
	fun test{{ class.name }}{{ loop.index }}() {
		val sourceJson = loadAsString("{{ tcase.filename }}")

		val data = parser.toFhir({{ class.name }}::class, sourceJson)

		{% for test in tcase.tests -%}
		{%- if test.enum %}
		assertEquals(data.{{ test.path }}, {{ test.enum }}.
		{%- if test.value == "=" -%}
		EQUAL
		{%- else -%}
		{%- if test.value == "<" -%}
		LESS_THAN
		{%- else -%}
		{%- if test.value == "<=" -%}
		LESS_OR_EQUAL
		{%- else -%}
		{%- if test.value == ">" -%}
		GREATER_THAN
		{%- else -%}
		{%- if test.value == ">=" -%}
		GREATER_OR_EQUAL
		{%- else -%}
		{%- if test.value == "*" -%}
		MAX
		{%- else -%}
		{{ test.value.upper()|replace('-', '_') }}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %}
		{%- endif %})
		{%- else %}{% if "String" == test.klass.name %}
		assertEquals(data.{{ test.path }}, String("{{ test.value|replace('"', '\\"') }}"))
		{%- else %}{% if "Decimal" == test.klass.name %}
		assertEquals(data.{{ test.path }}.toString(), "{{ test.value }}")
		{%- else %}{% if "Double" == test.klass.name %}
		assertEquals(data.{{ test.path }}{{ test.value }}d)
		{%- else %}{% if "Integer" == test.klass.name %}
		assertEquals(data.{{ test.path }}, Integer({{ test.value }}), "{{ test.value }}")
		{%- else %}{% if "Boolean" == test.klass.name %}
		assertEquals(data.{{ test.path }}, Boolean({% if test.value %}true{% else %}false{% endif %}))
		{%- else %}{% if "Date" == test.klass.name %}
		assertEquals(data.{{ test.path }}{% if not test.array_item %}?{% endif %}.toString(), "{{ test.value }}")
		{%- else %}{% if "DateTime" == test.klass.name %}
		assertEquals(data.{{ test.path }}{% if not test.array_item %}?{% endif %}.toString(), "{{ test.value }}")
		{%- else %}{% if "Instant" == test.klass.name %}
		assertEquals(data.{{ test.path }}{% if not test.array_item %}?{% endif %}.toString(), "{{ test.value }}")
		{%- else %}{% if "Time" == test.klass.name %}
		assertEquals(data.{{ test.path }}{% if not test.array_item %}?{% endif %}.toString(), "{{ test.value }}")
		{%- else %}{% if "URL" == test.klass.name %}
		assertEquals(data.{{ test.path }}.toString(), "{{ test.value }}")
		{%- else %}{% if "Base64Binary" == test.klass.name %}
		assertEquals(data.{{ test.path }}, Base64Binary(value: "{{ test.value }}"))
		{%- else %}
		//FIXME Don't know how to create unit test for "{{ test.path }}", which is a {{ test.klass.name }}
		{%- endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}
		{%- endfor %}

		val json = parser.fromFhir({{ class.name }}::class, data)

		JSONAssert.assertEquals(sourceJson, json, false)
	}
	{%- endfor %}
}



