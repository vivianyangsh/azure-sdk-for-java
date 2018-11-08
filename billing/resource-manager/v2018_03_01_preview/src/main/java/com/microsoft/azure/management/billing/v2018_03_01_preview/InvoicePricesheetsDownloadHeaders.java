/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Download operation.
 */
public class InvoicePricesheetsDownloadHeaders {
    /**
     * GET this URL to retrieve the status of the asynchronous operation.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * The amount of delay to use while the status of the operation is checked.
     * The value is expressed in seconds.
     */
    @JsonProperty(value = "Retry-After")
    private String retryAfter;

    /**
     * To get the progress of the operation, call GET operation on the URL in
     * Azure-AsyncOperation header field.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * The operation entity Id GUID.
     */
    @JsonProperty(value = "OData-EntityId")
    private String oDataEntityId;

    /**
     * Get gET this URL to retrieve the status of the asynchronous operation.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set gET this URL to retrieve the status of the asynchronous operation.
     *
     * @param location the location value to set
     * @return the InvoicePricesheetsDownloadHeaders object itself.
     */
    public InvoicePricesheetsDownloadHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the amount of delay to use while the status of the operation is checked. The value is expressed in seconds.
     *
     * @return the retryAfter value
     */
    public String retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the amount of delay to use while the status of the operation is checked. The value is expressed in seconds.
     *
     * @param retryAfter the retryAfter value to set
     * @return the InvoicePricesheetsDownloadHeaders object itself.
     */
    public InvoicePricesheetsDownloadHeaders withRetryAfter(String retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

    /**
     * Get to get the progress of the operation, call GET operation on the URL in Azure-AsyncOperation header field.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set to get the progress of the operation, call GET operation on the URL in Azure-AsyncOperation header field.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the InvoicePricesheetsDownloadHeaders object itself.
     */
    public InvoicePricesheetsDownloadHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get the operation entity Id GUID.
     *
     * @return the oDataEntityId value
     */
    public String oDataEntityId() {
        return this.oDataEntityId;
    }

    /**
     * Set the operation entity Id GUID.
     *
     * @param oDataEntityId the oDataEntityId value to set
     * @return the InvoicePricesheetsDownloadHeaders object itself.
     */
    public InvoicePricesheetsDownloadHeaders withODataEntityId(String oDataEntityId) {
        this.oDataEntityId = oDataEntityId;
        return this;
    }

}
