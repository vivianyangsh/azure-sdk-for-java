/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A landmark recognized in the image.
 */
public class LandmarksModel {
    /**
     * Name of the landmark.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Confidence level for the landmark recognition.
     */
    @JsonProperty(value = "confidence")
    private double confidence;

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
     * @return the LandmarksModel object itself.
     */
    public LandmarksModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence value.
     *
     * @param confidence the confidence value to set
     * @return the LandmarksModel object itself.
     */
    public LandmarksModel withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

}
