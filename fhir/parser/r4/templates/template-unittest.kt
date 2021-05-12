/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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


import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Ignore

import kotlin.test.assertEquals

/**
 * {{ class.name }}Test.java
 *
 * {{ class.short }}.
 * {%- if class.formal %}
 * {{ class.formal }}
 * {%- endif %}
 *
 * Generated from FHIR {{ info.version }})
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class {{ class.name }}Test {

	val parser = FhirR4Parser()

	{% for tcase in tests %}

	{%- if tcase.filename == "patient-example-b.json" %}
	@Ignore
	{%- endif %}
	{%- if tcase.filename == "patient-example.json" %}
	@Ignore
	{%- endif %}
	@Test
	fun test{{ class.name }}{{ loop.index }}() {
		val sourceJson = loadAsString("r4/{{ tcase.filename }}")

		val data = parser.toFhir({{ class.name }}::class, sourceJson)

		{% for test in tcase.tests -%}
		{%- if test.enum %}
		assertEquals({{ test.enum }}.
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
		{%- endif %}, data.{{ test.path }})
		{%- else %}{% if "String" == test.klass.name %}
		assertEquals("{{ test.value|replace('"', '\\"') }}", data.{{ test.path }})
		{%- else %}{% if "Decimal" == test.klass.name %}
		assertEquals("{{ test.value }}".toDouble(), data.{{ test.path }}?.value)
		{%- else %}{% if "Integer" == test.klass.name %}
		assertEquals("{{ test.value }}".toInt(), data.{{ test.path }}?.value)
		{%- else %}{% if "PositiveInteger" == test.klass.name %}
		assertEquals("{{ test.value }}".toLong(), data.{{ test.path }}?.value)
		{%- else %}{% if "UnsignedInteger" == test.klass.name %}
		assertEquals("{{ test.value }}".toLong(), data.{{ test.path }}?.value)
		{%- else %}{% if "Bool" == test.klass.name %}
		assertEquals("{{ test.value }}".toBoolean(), data.{{ test.path }}?.value)
		{%- else %}{% if "Date" == test.klass.name %}
		assertEquals("{{ test.value }}", data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString())
		{%- else %}{% if "DateTime" == test.klass.name %}
		assertEquals("{{ test.value }}", data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString(), )
		{%- else %}{% if "Instant" == test.klass.name %}
		assertEquals("{{ test.value }}", data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString(), )
		{%- else %}{% if "Time" == test.klass.name %}
		assertEquals("{{ test.value }}", data.{{ test.path }}{% if not test.array_item %}?{% endif %}.value.toString())
		{%- else %}
		//FIXME Don't know how to create unit test for "{{ test.path }}", which is a {{ test.klass.name }}
		{%- endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}{% endif %}
		{%- endfor %}

		val json = parser.fromFhir(data)

		JSONAssert.assertEquals(sourceJson, json, true)
	}
	{%- endfor %}
}



