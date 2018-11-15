/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.RequestHistoryListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class RequestHistoryListResultImpl extends WrapperImpl<RequestHistoryListResultInner> implements RequestHistoryListResult {
    private final LogicManager manager;
    RequestHistoryListResultImpl(RequestHistoryListResultInner inner, LogicManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<RequestHistoryInner> value() {
        return this.inner().value();
    }

}
