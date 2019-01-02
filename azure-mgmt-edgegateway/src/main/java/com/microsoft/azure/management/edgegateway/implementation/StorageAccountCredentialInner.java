/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.implementation;

import com.microsoft.azure.management.edgegateway.AsymmetricEncryptedSecret;
import com.microsoft.azure.management.edgegateway.SSLStatus;
import com.microsoft.azure.management.edgegateway.AccountType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.edgegateway.ARMBaseModel;

/**
 * The storage account credential.
 */
@JsonFlatten
public class StorageAccountCredentialInner extends ARMBaseModel {
    /**
     * Alias for the storage account.
     */
    @JsonProperty(value = "properties.alias", required = true)
    private String alias;

    /**
     * UserName for the storage account.
     */
    @JsonProperty(value = "properties.userName")
    private String userName;

    /**
     * Encrypted storage key.
     */
    @JsonProperty(value = "properties.accountKey")
    private AsymmetricEncryptedSecret accountKey;

    /**
     * ConnectionString for the storage account. This needs to be specified if
     * UserName/AccountKey are not specified.
     */
    @JsonProperty(value = "properties.connectionString")
    private String connectionString;

    /**
     * Signifies whether SSL needs to be enabled or not. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.sslStatus", required = true)
    private SSLStatus sslStatus;

    /**
     * Blob end point for private clouds.
     */
    @JsonProperty(value = "properties.blobDomainName")
    private String blobDomainName;

    /**
     * Type of storage accessed on the storage account. Possible values
     * include: 'GeneralPurposeStorage', 'BlobStorage'.
     */
    @JsonProperty(value = "properties.accountType", required = true)
    private AccountType accountType;

    /**
     * Get alias for the storage account.
     *
     * @return the alias value
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Set alias for the storage account.
     *
     * @param alias the alias value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get userName for the storage account.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set userName for the storage account.
     *
     * @param userName the userName value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get encrypted storage key.
     *
     * @return the accountKey value
     */
    public AsymmetricEncryptedSecret accountKey() {
        return this.accountKey;
    }

    /**
     * Set encrypted storage key.
     *
     * @param accountKey the accountKey value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAccountKey(AsymmetricEncryptedSecret accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get connectionString for the storage account. This needs to be specified if UserName/AccountKey are not specified.
     *
     * @return the connectionString value
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set connectionString for the storage account. This needs to be specified if UserName/AccountKey are not specified.
     *
     * @param connectionString the connectionString value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get signifies whether SSL needs to be enabled or not. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the sslStatus value
     */
    public SSLStatus sslStatus() {
        return this.sslStatus;
    }

    /**
     * Set signifies whether SSL needs to be enabled or not. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param sslStatus the sslStatus value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withSslStatus(SSLStatus sslStatus) {
        this.sslStatus = sslStatus;
        return this;
    }

    /**
     * Get blob end point for private clouds.
     *
     * @return the blobDomainName value
     */
    public String blobDomainName() {
        return this.blobDomainName;
    }

    /**
     * Set blob end point for private clouds.
     *
     * @param blobDomainName the blobDomainName value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withBlobDomainName(String blobDomainName) {
        this.blobDomainName = blobDomainName;
        return this;
    }

    /**
     * Get type of storage accessed on the storage account. Possible values include: 'GeneralPurposeStorage', 'BlobStorage'.
     *
     * @return the accountType value
     */
    public AccountType accountType() {
        return this.accountType;
    }

    /**
     * Set type of storage accessed on the storage account. Possible values include: 'GeneralPurposeStorage', 'BlobStorage'.
     *
     * @param accountType the accountType value to set
     * @return the StorageAccountCredentialInner object itself.
     */
    public StorageAccountCredentialInner withAccountType(AccountType accountType) {
        this.accountType = accountType;
        return this;
    }

}
