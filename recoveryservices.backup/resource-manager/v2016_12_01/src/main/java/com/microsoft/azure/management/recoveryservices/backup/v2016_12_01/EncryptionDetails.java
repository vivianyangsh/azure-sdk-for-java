/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details needed if the VM was encrypted at the time of backup.
 */
public class EncryptionDetails {
    /**
     * Identifies whether this backup copy represents an encrypted VM at the
     * time of backup.
     */
    @JsonProperty(value = "encryptionEnabled")
    private Boolean encryptionEnabled;

    /**
     * Key Url.
     */
    @JsonProperty(value = "kekUrl")
    private String kekUrl;

    /**
     * Secret Url.
     */
    @JsonProperty(value = "secretKeyUrl")
    private String secretKeyUrl;

    /**
     * ID of Key Vault where KEK is stored.
     */
    @JsonProperty(value = "kekVaultId")
    private String kekVaultId;

    /**
     * ID of Key Vault where Secret is stored.
     */
    @JsonProperty(value = "secretKeyVaultId")
    private String secretKeyVaultId;

    /**
     * Get identifies whether this backup copy represents an encrypted VM at the time of backup.
     *
     * @return the encryptionEnabled value
     */
    public Boolean encryptionEnabled() {
        return this.encryptionEnabled;
    }

    /**
     * Set identifies whether this backup copy represents an encrypted VM at the time of backup.
     *
     * @param encryptionEnabled the encryptionEnabled value to set
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withEncryptionEnabled(Boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
        return this;
    }

    /**
     * Get key Url.
     *
     * @return the kekUrl value
     */
    public String kekUrl() {
        return this.kekUrl;
    }

    /**
     * Set key Url.
     *
     * @param kekUrl the kekUrl value to set
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekUrl(String kekUrl) {
        this.kekUrl = kekUrl;
        return this;
    }

    /**
     * Get secret Url.
     *
     * @return the secretKeyUrl value
     */
    public String secretKeyUrl() {
        return this.secretKeyUrl;
    }

    /**
     * Set secret Url.
     *
     * @param secretKeyUrl the secretKeyUrl value to set
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withSecretKeyUrl(String secretKeyUrl) {
        this.secretKeyUrl = secretKeyUrl;
        return this;
    }

    /**
     * Get iD of Key Vault where KEK is stored.
     *
     * @return the kekVaultId value
     */
    public String kekVaultId() {
        return this.kekVaultId;
    }

    /**
     * Set iD of Key Vault where KEK is stored.
     *
     * @param kekVaultId the kekVaultId value to set
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withKekVaultId(String kekVaultId) {
        this.kekVaultId = kekVaultId;
        return this;
    }

    /**
     * Get iD of Key Vault where Secret is stored.
     *
     * @return the secretKeyVaultId value
     */
    public String secretKeyVaultId() {
        return this.secretKeyVaultId;
    }

    /**
     * Set iD of Key Vault where Secret is stored.
     *
     * @param secretKeyVaultId the secretKeyVaultId value to set
     * @return the EncryptionDetails object itself.
     */
    public EncryptionDetails withSecretKeyVaultId(String secretKeyVaultId) {
        this.secretKeyVaultId = secretKeyVaultId;
        return this;
    }

}
