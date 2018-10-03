/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImagePrediction model.
 */
public class ImagePrediction {
    /**
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * The project property.
     */
    @JsonProperty(value = "project", access = JsonProperty.Access.WRITE_ONLY)
    private UUID project;

    /**
     * The iteration property.
     */
    @JsonProperty(value = "iteration", access = JsonProperty.Access.WRITE_ONLY)
    private UUID iteration;

    /**
     * The created property.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The predictions property.
     */
    @JsonProperty(value = "predictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<Prediction> predictions;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the project value.
     *
     * @return the project value
     */
    public UUID project() {
        return this.project;
    }

    /**
     * Get the iteration value.
     *
     * @return the iteration value
     */
    public UUID iteration() {
        return this.iteration;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the predictions value.
     *
     * @return the predictions value
     */
    public List<Prediction> predictions() {
        return this.predictions;
    }

}
