/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The AddImageFileInputOptionalParameter model.
 */
public class AddImageFileInputOptionalParameter {
    /**
     * Tag for the image.
     */
    private Integer tag;

    /**
     * The image label.
     */
    private String label;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the tag value.
     *
     * @return the tag value
     */
    public Integer tag() {
        return this.tag;
    }

    /**
     * Set the tag value.
     *
     * @param tag the tag value to set
     * @return the AddImageFileInputOptionalParameter object itself.
     */
    public AddImageFileInputOptionalParameter withTag(Integer tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the label value.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label value.
     *
     * @param label the label value to set
     * @return the AddImageFileInputOptionalParameter object itself.
     */
    public AddImageFileInputOptionalParameter withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the AddImageFileInputOptionalParameter object itself.
     */
    public AddImageFileInputOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
