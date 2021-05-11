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

/**
 * This is an example value set defined by the FHIR project, that could be used to represent possible connection type profile values.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/endpoint-connection-type">EndpointConnectionType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/endpoint-connection-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EndpointConnectionType {
    /**
     * IHE Cross Community Patient Discovery Profile (XCPD) - http://wiki.ihe.net/index.php/Cross-Community_Patient_Discovery
     */
    @SerialName("ihe-xcpd")
    IHE_XCPD,

    /**
     * IHE Cross Community Access Profile (XCA) - http://wiki.ihe.net/index.php/Cross-Community_Access
     */
    @SerialName("ihe-xca")
    IHE_XCA,

    /**
     * IHE Cross-Enterprise Document Reliable Exchange (XDR) - http://wiki.ihe.net/index.php/Cross-enterprise_Document_Reliable_Interchange
     */
    @SerialName("ihe-xdr")
    IHE_XDR,

    /**
     * IHE Cross-Enterprise Document Sharing (XDS) - http://wiki.ihe.net/index.php/Cross-Enterprise_Document_Sharing
     */
    @SerialName("ihe-xds")
    IHE_XDS,

    /**
     * IHE Invoke Image Display (IID) - http://wiki.ihe.net/index.php/Invoke_Image_Display
     */
    @SerialName("ihe-iid")
    IHE_IID,

    /**
     * DICOMweb RESTful Image Retrieve - http://dicom.nema.org/medical/dicom/current/output/chtml/part18/sect_6.5.html
     */
    @SerialName("dicom-wado-rs")
    DICOM_WADO_RS,

    /**
     * DICOMweb RESTful Image query - http://dicom.nema.org/medical/dicom/current/output/chtml/part18/sect_6.7.html
     */
    @SerialName("dicom-qido-rs")
    DICOM_QIDO_RS,

    /**
     * DICOMweb RESTful image sending and storage - http://dicom.nema.org/medical/dicom/current/output/chtml/part18/sect_6.6.html
     */
    @SerialName("dicom-stow-rs")
    DICOM_STOW_RS,

    /**
     * DICOMweb Image Retrieve - http://dicom.nema.org/dicom/2013/output/chtml/part18/sect_6.3.html
     */
    @SerialName("dicom-wado-uri")
    DICOM_WADO_URI,

    /**
     * Interact with the server interface using FHIR's RESTful interface. For details on its version/capabilities you should connect the value in Endpoint.address and retrieve the FHIR CapabilityStatement.
     */
    @SerialName("hl7-fhir-rest")
    HL7_FHIR_REST,

    /**
     * Use the servers FHIR Messaging interface. Details can be found on the messaging.html page in the FHIR Specification. The FHIR server's base address is specified in the Endpoint.address property.
     */
    @SerialName("hl7-fhir-msg")
    HL7_FHIR_MSG,

    /**
     * HL7v2 messages over an LLP TCP connection
     */
    @SerialName("hl7v2-mllp")
    HL7V2_MLLP,

    /**
     * Email delivery using a digital certificate to encrypt the content using the public key, receiver must have the private key to decrypt the content
     */
    @SerialName("secure-email")
    SECURE_EMAIL,

    /**
     * Direct Project information - http://wiki.directproject.org/
     */
    @SerialName("direct-project")
    DIRECT_PROJECT
}
