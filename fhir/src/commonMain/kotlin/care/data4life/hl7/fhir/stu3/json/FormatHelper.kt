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

package care.data4life.hl7.fhir.stu3.json

/**
 * Returns a String representation prepended with zeros until given [length]
 *
 * Example:
 *
 * length = 2 and values 0,1,11 -> 00, 01, 11
 * length = 3 and values 0,1,11 -> 000, 001, 011
 * length = 3 and values 0,1,11 -> 0000, 0001, 0011
 *
 * @param length the desired length
 */
fun Int.padStartZero(length: Int): String = toString().padStart(length, '0')
