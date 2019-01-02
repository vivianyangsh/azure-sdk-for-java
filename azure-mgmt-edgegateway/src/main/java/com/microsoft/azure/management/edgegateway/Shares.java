/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.edgegateway.implementation.SharesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Shares.
 */
public interface Shares extends SupportsCreating<Share.DefinitionStages.Blank>, HasInner<SharesInner> {
    /**
     * Triggers a manual refresh of the share metadata with the actual cloud storage account.
     *
     * @param deviceName Name of the device.
     * @param name Name of the share.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable refreshAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Returns a particular share by name.
     *
     * @param deviceName Name of the device.
     * @param name Name of the share.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Share> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Lists all the shares in a data box edge/gateway device.
     *
     * @param deviceName Name of the device.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Share> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the share on the data box edge/gateway device.
     *
     * @param deviceName Name of the device.
     * @param name Name of the share which needs to be deleted.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}
