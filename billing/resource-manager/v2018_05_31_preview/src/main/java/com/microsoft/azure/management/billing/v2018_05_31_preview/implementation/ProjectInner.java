/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A project resource.
 */
@JsonFlatten
public class ProjectInner extends ProxyResource {
    /**
     * The name of the project.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The eligible offers attached to the project.
     */
    @JsonProperty(value = "properties.eligibleOffers")
    private List<EligibleOfferInner> eligibleOffers;

    /**
     * The cost center for the project.
     */
    @JsonProperty(value = "properties.costCenter")
    private String costCenter;

    /**
     * Get the name of the project.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the name of the project.
     *
     * @param displayName the displayName value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the eligible offers attached to the project.
     *
     * @return the eligibleOffers value
     */
    public List<EligibleOfferInner> eligibleOffers() {
        return this.eligibleOffers;
    }

    /**
     * Set the eligible offers attached to the project.
     *
     * @param eligibleOffers the eligibleOffers value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withEligibleOffers(List<EligibleOfferInner> eligibleOffers) {
        this.eligibleOffers = eligibleOffers;
        return this;
    }

    /**
     * Get the cost center for the project.
     *
     * @return the costCenter value
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Set the cost center for the project.
     *
     * @param costCenter the costCenter value to set
     * @return the ProjectInner object itself.
     */
    public ProjectInner withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

}
