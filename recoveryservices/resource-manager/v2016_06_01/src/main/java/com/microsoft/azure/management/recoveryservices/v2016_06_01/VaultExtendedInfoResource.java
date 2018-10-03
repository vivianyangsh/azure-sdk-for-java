/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation.RecoveryServicesManager;
import com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation.VaultExtendedInfoResourceInner;

/**
 * Type representing VaultExtendedInfoResource.
 */
public interface VaultExtendedInfoResource extends HasInner<VaultExtendedInfoResourceInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the algorithm value.
     */
    String algorithm();

    /**
     * @return the encryptionKey value.
     */
    String encryptionKey();

    /**
     * @return the encryptionKeyThumbprint value.
     */
    String encryptionKeyThumbprint();

    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the integrityKey value.
     */
    String integrityKey();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}
