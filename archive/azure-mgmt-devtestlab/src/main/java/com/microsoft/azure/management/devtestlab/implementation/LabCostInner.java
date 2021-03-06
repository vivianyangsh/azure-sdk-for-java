/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import com.microsoft.azure.management.devtestlab.TargetCostProperties;
import com.microsoft.azure.management.devtestlab.LabCostSummaryProperties;
import java.util.List;
import com.microsoft.azure.management.devtestlab.LabCostDetailsProperties;
import com.microsoft.azure.management.devtestlab.LabResourceCostProperties;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A cost item.
 */
@JsonFlatten
public class LabCostInner extends Resource {
    /**
     * The target cost properties.
     */
    @JsonProperty(value = "properties.targetCost")
    private TargetCostProperties targetCost;

    /**
     * The lab cost summary component of the cost data.
     */
    @JsonProperty(value = "properties.labCostSummary", access = JsonProperty.Access.WRITE_ONLY)
    private LabCostSummaryProperties labCostSummary;

    /**
     * The lab cost details component of the cost data.
     */
    @JsonProperty(value = "properties.labCostDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<LabCostDetailsProperties> labCostDetails;

    /**
     * The resource cost component of the cost data.
     */
    @JsonProperty(value = "properties.resourceCosts", access = JsonProperty.Access.WRITE_ONLY)
    private List<LabResourceCostProperties> resourceCosts;

    /**
     * The currency code of the cost.
     */
    @JsonProperty(value = "properties.currencyCode")
    private String currencyCode;

    /**
     * The start time of the cost data.
     */
    @JsonProperty(value = "properties.startDateTime")
    private DateTime startDateTime;

    /**
     * The end time of the cost data.
     */
    @JsonProperty(value = "properties.endDateTime")
    private DateTime endDateTime;

    /**
     * The creation date of the cost.
     */
    @JsonProperty(value = "properties.createdDate")
    private DateTime createdDate;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the targetCost value.
     *
     * @return the targetCost value
     */
    public TargetCostProperties targetCost() {
        return this.targetCost;
    }

    /**
     * Set the targetCost value.
     *
     * @param targetCost the targetCost value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withTargetCost(TargetCostProperties targetCost) {
        this.targetCost = targetCost;
        return this;
    }

    /**
     * Get the labCostSummary value.
     *
     * @return the labCostSummary value
     */
    public LabCostSummaryProperties labCostSummary() {
        return this.labCostSummary;
    }

    /**
     * Get the labCostDetails value.
     *
     * @return the labCostDetails value
     */
    public List<LabCostDetailsProperties> labCostDetails() {
        return this.labCostDetails;
    }

    /**
     * Get the resourceCosts value.
     *
     * @return the resourceCosts value
     */
    public List<LabResourceCostProperties> resourceCosts() {
        return this.resourceCosts;
    }

    /**
     * Get the currencyCode value.
     *
     * @return the currencyCode value
     */
    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Set the currencyCode value.
     *
     * @param currencyCode the currencyCode value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get the startDateTime value.
     *
     * @return the startDateTime value
     */
    public DateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime value.
     *
     * @param startDateTime the startDateTime value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the endDateTime value.
     *
     * @return the endDateTime value
     */
    public DateTime endDateTime() {
        return this.endDateTime;
    }

    /**
     * Set the endDateTime value.
     *
     * @param endDateTime the endDateTime value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withEndDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Get the createdDate value.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the createdDate value.
     *
     * @param createdDate the createdDate value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier value.
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier value.
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the LabCostInner object itself.
     */
    public LabCostInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
