/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.autosuggest.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SearchKind.
 */
public final class SearchKind extends ExpandableStringEnum<SearchKind> {
    /** Static value WebSearch for SearchKind. */
    public static final SearchKind WEB_SEARCH = fromString("WebSearch");

    /** Static value HistorySearch for SearchKind. */
    public static final SearchKind HISTORY_SEARCH = fromString("HistorySearch");

    /** Static value DocumentSearch for SearchKind. */
    public static final SearchKind DOCUMENT_SEARCH = fromString("DocumentSearch");

    /** Static value TagSearch for SearchKind. */
    public static final SearchKind TAG_SEARCH = fromString("TagSearch");

    /** Static value LocationSearch for SearchKind. */
    public static final SearchKind LOCATION_SEARCH = fromString("LocationSearch");

    /** Static value CustomSearch for SearchKind. */
    public static final SearchKind CUSTOM_SEARCH = fromString("CustomSearch");

    /**
     * Creates or finds a SearchKind from its string representation.
     * @param name a name to look for
     * @return the corresponding SearchKind
     */
    @JsonCreator
    public static SearchKind fromString(String name) {
        return fromString(name, SearchKind.class);
    }

    /**
     * @return known SearchKind values
     */
    public static Collection<SearchKind> values() {
        return values(SearchKind.class);
    }
}
