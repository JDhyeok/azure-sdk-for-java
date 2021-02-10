/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The AzureActiveDirectoryRegistration model.
 */
@JsonFlatten
public class AzureActiveDirectoryRegistration extends ProxyOnlyResource {
    /**
     * The openIdIssuer property.
     */
    @JsonProperty(value = "properties.openIdIssuer")
    private String openIdIssuer;

    /**
     * The clientId property.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /**
     * The clientSecretSettingName property.
     */
    @JsonProperty(value = "properties.clientSecretSettingName")
    private String clientSecretSettingName;

    /**
     * The clientSecretCertificateThumbprint property.
     */
    @JsonProperty(value = "properties.clientSecretCertificateThumbprint")
    private String clientSecretCertificateThumbprint;

    /**
     * Get the openIdIssuer value.
     *
     * @return the openIdIssuer value
     */
    public String openIdIssuer() {
        return this.openIdIssuer;
    }

    /**
     * Set the openIdIssuer value.
     *
     * @param openIdIssuer the openIdIssuer value to set
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withOpenIdIssuer(String openIdIssuer) {
        this.openIdIssuer = openIdIssuer;
        return this;
    }

    /**
     * Get the clientId value.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId value.
     *
     * @param clientId the clientId value to set
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecretSettingName value.
     *
     * @return the clientSecretSettingName value
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName value.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
        return this;
    }

    /**
     * Get the clientSecretCertificateThumbprint value.
     *
     * @return the clientSecretCertificateThumbprint value
     */
    public String clientSecretCertificateThumbprint() {
        return this.clientSecretCertificateThumbprint;
    }

    /**
     * Set the clientSecretCertificateThumbprint value.
     *
     * @param clientSecretCertificateThumbprint the clientSecretCertificateThumbprint value to set
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientSecretCertificateThumbprint(String clientSecretCertificateThumbprint) {
        this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
        return this;
    }

}