/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All possible faces that may qualify.
 */
public class IdentifyCandidate {
    /**
     * Id of candidate.
     */
    @JsonProperty(value = "personId", required = true)
    private UUID personId;

    /**
     * Confidence threshold of identification, used to judge whether one face
     * belong to one person. The range of confidenceThreshold is [0, 1]
     * (default specified by algorithm).
     */
    @JsonProperty(value = "confidence", required = true)
    private double confidence;

    /**
     * Get the personId value.
     *
     * @return the personId value
     */
    public UUID personId() {
        return this.personId;
    }

    /**
     * Set the personId value.
     *
     * @param personId the personId value to set
     * @return the IdentifyCandidate object itself.
     */
    public IdentifyCandidate withPersonId(UUID personId) {
        this.personId = personId;
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
     * @return the IdentifyCandidate object itself.
     */
    public IdentifyCandidate withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

}
