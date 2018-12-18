/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DictionaryLookupSuccessItemTranslationsItem model.
 */
public class DictionaryLookupSuccessItemTranslationsItem {
    /**
     * The normalizedTarget property.
     */
    @JsonProperty(value = "normalizedTarget")
    private String normalizedTarget;

    /**
     * The displayTarget property.
     */
    @JsonProperty(value = "displayTarget")
    private String displayTarget;

    /**
     * The posTag property.
     */
    @JsonProperty(value = "posTag")
    private String posTag;

    /**
     * The confidence property.
     */
    @JsonProperty(value = "confidence")
    private Double confidence;

    /**
     * The prefixWord property.
     */
    @JsonProperty(value = "prefixWord")
    private String prefixWord;

    /**
     * The backTranslations property.
     */
    @JsonProperty(value = "backTranslations")
    private List<DictionaryLookupSuccessItemTranslationsItemBackTranslationsItem> backTranslations;

    /**
     * Get the normalizedTarget value.
     *
     * @return the normalizedTarget value
     */
    public String normalizedTarget() {
        return this.normalizedTarget;
    }

    /**
     * Set the normalizedTarget value.
     *
     * @param normalizedTarget the normalizedTarget value to set
     * @return the DictionaryLookupSuccessItemTranslationsItem object itself.
     */
    public DictionaryLookupSuccessItemTranslationsItem withNormalizedTarget(String normalizedTarget) {
        this.normalizedTarget = normalizedTarget;
        return this;
    }

    /**
     * Get the displayTarget value.
     *
     * @return the displayTarget value
     */
    public String displayTarget() {
        return this.displayTarget;
    }

    /**
     * Set the displayTarget value.
     *
     * @param displayTarget the displayTarget value to set
     * @return the DictionaryLookupSuccessItemTranslationsItem object itself.
     */
    public DictionaryLookupSuccessItemTranslationsItem withDisplayTarget(String displayTarget) {
        this.displayTarget = displayTarget;
        return this;
    }

    /**
     * Get the posTag value.
     *
     * @return the posTag value
     */
    public String posTag() {
        return this.posTag;
    }

    /**
     * Set the posTag value.
     *
     * @param posTag the posTag value to set
     * @return the DictionaryLookupSuccessItemTranslationsItem object itself.
     */
    public DictionaryLookupSuccessItemTranslationsItem withPosTag(String posTag) {
        this.posTag = posTag;
        return this;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value
     */
    public Double confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence value.
     *
     * @param confidence the confidence value to set
     * @return the DictionaryLookupSuccessItemTranslationsItem object itself.
     */
    public DictionaryLookupSuccessItemTranslationsItem withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the prefixWord value.
     *
     * @return the prefixWord value
     */
    public String prefixWord() {
        return this.prefixWord;
    }

    /**
     * Set the prefixWord value.
     *
     * @param prefixWord the prefixWord value to set
     * @return the DictionaryLookupSuccessItemTranslationsItem object itself.
     */
    public DictionaryLookupSuccessItemTranslationsItem withPrefixWord(String prefixWord) {
        this.prefixWord = prefixWord;
        return this;
    }

    /**
     * Get the backTranslations value.
     *
     * @return the backTranslations value
     */
    public List<DictionaryLookupSuccessItemTranslationsItemBackTranslationsItem> backTranslations() {
        return this.backTranslations;
    }

    /**
     * Set the backTranslations value.
     *
     * @param backTranslations the backTranslations value to set
     * @return the DictionaryLookupSuccessItemTranslationsItem object itself.
     */
    public DictionaryLookupSuccessItemTranslationsItem withBackTranslations(List<DictionaryLookupSuccessItemTranslationsItemBackTranslationsItem> backTranslations) {
        this.backTranslations = backTranslations;
        return this;
    }

}
