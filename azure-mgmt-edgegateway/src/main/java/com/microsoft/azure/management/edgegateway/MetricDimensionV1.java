/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric Dimension v1.
 */
public class MetricDimensionV1 {
    /**
     * Name of the metrics dimension.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Display name of the metrics dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * To be exported to shoe box.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get name of the metrics dimension.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the metrics dimension.
     *
     * @param name the name value to set
     * @return the MetricDimensionV1 object itself.
     */
    public MetricDimensionV1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get display name of the metrics dimension.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display name of the metrics dimension.
     *
     * @param displayName the displayName value to set
     * @return the MetricDimensionV1 object itself.
     */
    public MetricDimensionV1 withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get to be exported to shoe box.
     *
     * @return the toBeExportedForShoebox value
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set to be exported to shoe box.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set
     * @return the MetricDimensionV1 object itself.
     */
    public MetricDimensionV1 withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
        return this;
    }

}
