/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error Detail class which encapsulates Code, Message and Recommendations.
 */
public class ErrorDetail {
    /**
     * Error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Error Message related to the Code.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * List of recommendation strings.
     */
    @JsonProperty(value = "recommendations")
    private List<String> recommendations;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code.
     *
     * @param code the code value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get error Message related to the Code.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error Message related to the Code.
     *
     * @param message the message value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get list of recommendation strings.
     *
     * @return the recommendations value
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Set list of recommendation strings.
     *
     * @param recommendations the recommendations value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

}
