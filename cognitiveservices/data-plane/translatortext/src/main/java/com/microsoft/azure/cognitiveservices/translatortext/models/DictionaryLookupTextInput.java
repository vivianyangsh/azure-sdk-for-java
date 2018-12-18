/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Text needed for a dictionary lookup request.
 */
public class DictionaryLookupTextInput {
    /**
     * The text property.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the DictionaryLookupTextInput object itself.
     */
    public DictionaryLookupTextInput withText(String text) {
        this.text = text;
        return this;
    }

}
