/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.OperationResultInfoBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.OperationWorkerResponse;

/**
 * Base class for operation result info.
 */
public class OperationResultInfoBaseResourceInner extends OperationWorkerResponse {
    /**
     * OperationResultInfoBaseResource operation.
     */
    @JsonProperty(value = "operation")
    private OperationResultInfoBase operation;

    /**
     * Get operationResultInfoBaseResource operation.
     *
     * @return the operation value
     */
    public OperationResultInfoBase operation() {
        return this.operation;
    }

    /**
     * Set operationResultInfoBaseResource operation.
     *
     * @param operation the operation value to set
     * @return the OperationResultInfoBaseResourceInner object itself.
     */
    public OperationResultInfoBaseResourceInner withOperation(OperationResultInfoBase operation) {
        this.operation = operation;
        return this;
    }

}
