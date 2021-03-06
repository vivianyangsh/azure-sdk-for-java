/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request from client to check resource name availability.
 */
public class NameAvailabilityRequest {
    /**
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Resource type used for verification.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the NameAvailabilityRequest object itself.
     */
    public NameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the NameAvailabilityRequest object itself.
     */
    public NameAvailabilityRequest withType(String type) {
        this.type = type;
        return this;
    }

}
