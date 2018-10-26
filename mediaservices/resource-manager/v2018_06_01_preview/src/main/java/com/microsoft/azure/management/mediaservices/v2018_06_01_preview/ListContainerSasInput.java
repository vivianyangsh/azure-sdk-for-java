/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters to the list SAS requet.
 */
public class ListContainerSasInput {
    /**
     * The permissions to set on the SAS URL. Possible values include: 'Read',
     * 'ReadWrite', 'ReadWriteDelete'.
     */
    @JsonProperty(value = "permissions")
    private AssetContainerPermission permissions;

    /**
     * The SAS URL expiration time.  This must be less than 24 hours from the
     * current time.
     */
    @JsonProperty(value = "expiryTime")
    private DateTime expiryTime;

    /**
     * Get the permissions to set on the SAS URL. Possible values include: 'Read', 'ReadWrite', 'ReadWriteDelete'.
     *
     * @return the permissions value
     */
    public AssetContainerPermission permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions to set on the SAS URL. Possible values include: 'Read', 'ReadWrite', 'ReadWriteDelete'.
     *
     * @param permissions the permissions value to set
     * @return the ListContainerSasInput object itself.
     */
    public ListContainerSasInput withPermissions(AssetContainerPermission permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the SAS URL expiration time.  This must be less than 24 hours from the current time.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the SAS URL expiration time.  This must be less than 24 hours from the current time.
     *
     * @param expiryTime the expiryTime value to set
     * @return the ListContainerSasInput object itself.
     */
    public ListContainerSasInput withExpiryTime(DateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

}
