/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Update operation.
 */
public class ProjectsUpdateHeaders {
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
     * @return the ProjectsUpdateHeaders object itself.
     */
    public ProjectsUpdateHeaders withLocation(String location) {
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
     * @return the ProjectsUpdateHeaders object itself.
     */
    public ProjectsUpdateHeaders withRetryAfter(String retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
