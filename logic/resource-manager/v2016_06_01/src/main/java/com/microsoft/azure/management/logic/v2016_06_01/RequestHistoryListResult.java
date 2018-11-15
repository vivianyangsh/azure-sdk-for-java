/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.LogicManager;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.RequestHistoryListResultInner;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.RequestHistoryInner;
import java.util.List;

/**
 * Type representing RequestHistoryListResult.
 */
public interface RequestHistoryListResult extends HasInner<RequestHistoryListResultInner>, HasManager<LogicManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<RequestHistoryInner> value();

}
