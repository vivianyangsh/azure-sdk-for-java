/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of JobOutput errors.
 */
public class JobErrorDetail {
    /**
     * Code describing the error detail.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get code describing the error detail.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get a human-readable representation of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
