/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Term List  Properties.
 */
public class TermList {
    /**
     * Term list Id.
     */
    @JsonProperty(value = "Id")
    private Integer id;

    /**
     * Term list name.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Description for term list.
     */
    @JsonProperty(value = "Description")
    private String description;

    /**
     * Term list metadata.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get term list Id.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set term list Id.
     *
     * @param id the id value to set
     * @return the TermList object itself.
     */
    public TermList withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get term list name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set term list name.
     *
     * @param name the name value to set
     * @return the TermList object itself.
     */
    public TermList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get description for term list.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description for term list.
     *
     * @param description the description value to set
     * @return the TermList object itself.
     */
    public TermList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get term list metadata.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set term list metadata.
     *
     * @param metadata the metadata value to set
     * @return the TermList object itself.
     */
    public TermList withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

}
