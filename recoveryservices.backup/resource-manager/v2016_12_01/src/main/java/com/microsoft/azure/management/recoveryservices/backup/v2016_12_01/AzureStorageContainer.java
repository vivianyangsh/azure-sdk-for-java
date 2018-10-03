/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.ProtectionContainerInner;

/**
 * Azure Storage Account workload-specific container.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType")
@JsonTypeName("StorageContainer")
public class AzureStorageContainer extends ProtectionContainerInner {
    /**
     * Fully qualified ARM url.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /**
     * Storage account version.
     */
    @JsonProperty(value = "storageAccountVersion")
    private String storageAccountVersion;

    /**
     * Resource group name of Recovery Services Vault.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Number of items backed up in this container.
     */
    @JsonProperty(value = "protectedItemCount")
    private Long protectedItemCount;

    /**
     * Get fully qualified ARM url.
     *
     * @return the sourceResourceId value
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set fully qualified ARM url.
     *
     * @param sourceResourceId the sourceResourceId value to set
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get storage account version.
     *
     * @return the storageAccountVersion value
     */
    public String storageAccountVersion() {
        return this.storageAccountVersion;
    }

    /**
     * Set storage account version.
     *
     * @param storageAccountVersion the storageAccountVersion value to set
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withStorageAccountVersion(String storageAccountVersion) {
        this.storageAccountVersion = storageAccountVersion;
        return this;
    }

    /**
     * Get resource group name of Recovery Services Vault.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set resource group name of Recovery Services Vault.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get number of items backed up in this container.
     *
     * @return the protectedItemCount value
     */
    public Long protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set number of items backed up in this container.
     *
     * @param protectedItemCount the protectedItemCount value to set
     * @return the AzureStorageContainer object itself.
     */
    public AzureStorageContainer withProtectedItemCount(Long protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

}
