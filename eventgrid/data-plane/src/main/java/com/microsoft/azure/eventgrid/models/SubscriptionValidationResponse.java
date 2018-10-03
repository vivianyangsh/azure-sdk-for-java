/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * To complete an event subscription validation handshake, a subscriber can use
 * either the validationCode or the validationUrl received in a
 * SubscriptionValidationEvent. When the validationCode is used, the
 * SubscriptionValidationResponse can be used to build the response.
 */
public class SubscriptionValidationResponse {
    /**
     * The validation response sent by the subscriber to Azure Event Grid to
     * complete the validation of an event subscription.
     */
    @JsonProperty(value = "validationResponse")
    private String validationResponse;

    /**
     * Get the validation response sent by the subscriber to Azure Event Grid to complete the validation of an event subscription.
     *
     * @return the validationResponse value
     */
    public String validationResponse() {
        return this.validationResponse;
    }

    /**
     * Set the validation response sent by the subscriber to Azure Event Grid to complete the validation of an event subscription.
     *
     * @param validationResponse the validationResponse value to set
     * @return the SubscriptionValidationResponse object itself.
     */
    public SubscriptionValidationResponse withValidationResponse(String validationResponse) {
        this.validationResponse = validationResponse;
        return this;
    }

}
