/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for updating an existing Pattern feature.
 */
public class PatternUpdateObject {
    /**
     * The Regular Expression to match.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /**
     * Name of the feature.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Indicates if the Pattern feature is enabled.
     */
    @JsonProperty(value = "isActive")
    private Boolean isActive;

    /**
     * Get the pattern value.
     *
     * @return the pattern value
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern value.
     *
     * @param pattern the pattern value to set
     * @return the PatternUpdateObject object itself.
     */
    public PatternUpdateObject withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

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
     * @return the PatternUpdateObject object itself.
     */
    public PatternUpdateObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isActive value.
     *
     * @return the isActive value
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive value.
     *
     * @param isActive the isActive value to set
     * @return the PatternUpdateObject object itself.
     */
    public PatternUpdateObject withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

}
