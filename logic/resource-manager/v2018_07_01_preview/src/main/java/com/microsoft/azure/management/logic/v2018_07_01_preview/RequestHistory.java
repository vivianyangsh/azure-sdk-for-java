/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.LogicManager;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.RequestHistoryInner;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing RequestHistory.
 */
public interface RequestHistory extends HasInner<RequestHistoryInner>, HasManager<LogicManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the request value.
     */
    Request request();

    /**
     * @return the response value.
     */
    Response response();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
