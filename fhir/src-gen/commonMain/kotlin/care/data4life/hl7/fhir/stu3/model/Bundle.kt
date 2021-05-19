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

import care.data4life.hl7.fhir.stu3.codesystem.BundleType
import care.data4life.hl7.fhir.stu3.codesystem.HTTPVerb
import care.data4life.hl7.fhir.stu3.codesystem.SearchEntryMode
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Instant
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirBundle
 *
 * A container for a collection of resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">Bundle</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
interface FhirBundle : FhirResource {

    /**
     * Persistent identifier for the bundle.
     */
    val identifier: Identifier?

    /**
     * Indicates the purpose of this bundle - how it was intended to be used.
     */
    val type: BundleType

    /**
     * If search, the total number of matches.
     */
    val total: UnsignedInteger?

    /**
     * Links related to this Bundle.
     */
    val link: kotlin.collections.List<BundleLink>?

    /**
     * Entry in the bundle - will have a resource, or information.
     */
    val entry: kotlin.collections.List<BundleEntry>?

    /**
     * Digital Signature.
     */
    val signature: Signature?
}

/**
 * Bundle
 *
 * A container for a collection of resources.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">Bundle</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
@Serializable
@SerialName("Bundle")
data class Bundle(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("type")
    override val type: BundleType,

    @SerialName("total")
    override val total: UnsignedInteger? = null,

    @SerialName("link")
    override val link: kotlin.collections.List<BundleLink>? = null,

    @SerialName("entry")
    override val entry: kotlin.collections.List<BundleEntry>? = null,

    @SerialName("signature")
    override val signature: Signature? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirBundle {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Bundle"
    }
}

/**
 * FhirBundleEntry
 *
 * An entry in a bundle resource - will either contain a resource, or information about a resource
 * (transactions and history only).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntry</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
interface FhirBundleEntry : FhirBackboneElement {

    /**
     * Links related to this entry.
     */
    val link: kotlin.collections.List<BundleLink>?

    /**
     * Absolute URL for resource (server address, or UUID/OID).
     */
    val fullUrl: String?

    /**
     * A resource in the bundle.
     */
    val resource: FhirResource?

    /**
     * Search related information.
     */
    val search: BundleEntrySearch?

    /**
     * Transaction Related Information.
     */
    val request: BundleEntryRequest?

    /**
     * Transaction Related Information.
     */
    val response: BundleEntryResponse?
}

/**
 * BundleEntry
 *
 * An entry in a bundle resource - will either contain a resource, or information about a resource
 * (transactions and history only).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntry</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
@Serializable
@SerialName("BundleEntry")
data class BundleEntry(

    @SerialName("link")
    override val link: kotlin.collections.List<BundleLink>? = null,

    @SerialName("fullUrl")
    override val fullUrl: String? = null,

    @SerialName("resource")
    override val resource: FhirResource? = null,

    @SerialName("search")
    override val search: BundleEntrySearch? = null,

    @SerialName("request")
    override val request: BundleEntryRequest? = null,

    @SerialName("response")
    override val response: BundleEntryResponse? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBundleEntry {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "BundleEntry"
    }
}

/**
 * FhirBundleEntryRequest
 *
 * Additional information about how this entry should be processed as part of a transaction.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntryRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
interface FhirBundleEntryRequest : FhirBackboneElement {

    /**
     * The HTTP verb for this entry in either a change history, or a transaction/
     * transaction response.
     */
    val method: HTTPVerb

    /**
     * URL for HTTP equivalent of this entry.
     */
    val url: String

    /**
     * For managing cache currency.
     */
    val ifNoneMatch: String?

    /**
     * For managing update contention.
     */
    val ifModifiedSince: Instant?

    /**
     * For managing update contention.
     */
    val ifMatch: String?

    /**
     * For conditional creates.
     */
    val ifNoneExist: String?
}

/**
 * BundleEntryRequest
 *
 * Additional information about how this entry should be processed as part of a transaction.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntryRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
@Serializable
@SerialName("BundleEntryRequest")
data class BundleEntryRequest(

    @SerialName("method")
    override val method: HTTPVerb,

    @SerialName("url")
    override val url: String,

    @SerialName("ifNoneMatch")
    override val ifNoneMatch: String? = null,

    @SerialName("ifModifiedSince")
    override val ifModifiedSince: Instant? = null,

    @SerialName("ifMatch")
    override val ifMatch: String? = null,

    @SerialName("ifNoneExist")
    override val ifNoneExist: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBundleEntryRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "BundleEntryRequest"
    }
}

/**
 * FhirBundleEntryResponse
 *
 * Additional information about how this entry should be processed as part of a transaction.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntryResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
interface FhirBundleEntryResponse : FhirBackboneElement {

    /**
     * Status response code (text optional).
     */
    val status: String

    /**
     * The location, if the operation returns a location.
     */
    val location: String?

    /**
     * The etag for the resource (if relevant).
     */
    val etag: String?

    /**
     * Server's date time modified.
     */
    val lastModified: Instant?

    /**
     * OperationOutcome with hints and warnings (for batch/transaction).
     */
    val outcome: FhirResource?
}

/**
 * BundleEntryResponse
 *
 * Additional information about how this entry should be processed as part of a transaction.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntryResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
@Serializable
@SerialName("BundleEntryResponse")
data class BundleEntryResponse(

    @SerialName("status")
    override val status: String,

    @SerialName("location")
    override val location: String? = null,

    @SerialName("etag")
    override val etag: String? = null,

    @SerialName("lastModified")
    override val lastModified: Instant? = null,

    @SerialName("outcome")
    override val outcome: FhirResource? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBundleEntryResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "BundleEntryResponse"
    }
}

/**
 * FhirBundleEntrySearch
 *
 * Information about the search process that lead to the creation of this entry.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntrySearch</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
interface FhirBundleEntrySearch : FhirBackboneElement {

    /**
     * Why this entry is in the result set - whether it's included as a match or
     * because of an _include requirement.
     */
    val mode: SearchEntryMode?

    /**
     * Search ranking (between 0 and 1).
     */
    val score: Decimal?
}

/**
 * BundleEntrySearch
 *
 * Information about the search process that lead to the creation of this entry.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleEntrySearch</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
@Serializable
@SerialName("BundleEntrySearch")
data class BundleEntrySearch(

    @SerialName("mode")
    override val mode: SearchEntryMode? = null,

    @SerialName("score")
    override val score: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBundleEntrySearch {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "BundleEntrySearch"
    }
}

/**
 * FhirBundleLink
 *
 * A series of links that provide context to this bundle.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
interface FhirBundleLink : FhirBackboneElement {

    /**
     * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-
     * relations-1.
     */
    val relation: String

    /**
     * Reference details for the link.
     */
    val url: String
}

/**
 * BundleLink
 *
 * A series of links that provide context to this bundle.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Bundle">BundleLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Bundle)
 */
@Serializable
@SerialName("BundleLink")
data class BundleLink(

    @SerialName("relation")
    override val relation: String,

    @SerialName("url")
    override val url: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirBundleLink {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "BundleLink"
    }
}
