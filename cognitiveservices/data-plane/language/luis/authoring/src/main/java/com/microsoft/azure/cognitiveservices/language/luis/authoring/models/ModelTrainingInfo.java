/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model Training Info.
 */
public class ModelTrainingInfo {
    /**
     * The ID (GUID) of the model.
     */
    @JsonProperty(value = "modelId")
    private UUID modelId;

    /**
     * The details property.
     */
    @JsonProperty(value = "details")
    private ModelTrainingDetails details;

    /**
     * Get the modelId value.
     *
     * @return the modelId value
     */
    public UUID modelId() {
        return this.modelId;
    }

    /**
     * Set the modelId value.
     *
     * @param modelId the modelId value to set
     * @return the ModelTrainingInfo object itself.
     */
    public ModelTrainingInfo withModelId(UUID modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public ModelTrainingDetails details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the ModelTrainingInfo object itself.
     */
    public ModelTrainingInfo withDetails(ModelTrainingDetails details) {
        this.details = details;
        return this;
    }

}
