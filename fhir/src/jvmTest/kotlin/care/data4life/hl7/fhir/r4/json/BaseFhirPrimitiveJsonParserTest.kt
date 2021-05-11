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

package care.data4life.hl7.fhir.r4.json

import care.data4life.hl7.fhir.r4.model.FhirR4
import care.data4life.hl7.fhir.r4.model.FhirSerializationModule
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.plus
import kotlinx.serialization.modules.polymorphic
import kotlin.test.BeforeTest

abstract class BaseFhirPrimitiveJsonParserTest {

    lateinit var parser: FhirR4JsonParser

    abstract fun PolymorphicModuleBuilder<FhirR4>.addTestSubclass()

    @BeforeTest
    fun setup() {
        val fhirTestSerializersModule = SerializersModule {
            polymorphic(FhirR4::class) {
                addTestSubclass()
            }
        }

        val reader = FhirR4JsonParser.defaultJsonReader(
            (FhirSerializationModule.module() + fhirTestSerializersModule)
        )

        parser = FhirR4JsonParser(reader)
    }
}
