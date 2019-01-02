/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.implementation;

import com.microsoft.azure.management.edgegateway.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.edgegateway.OperationDisplay;
import com.microsoft.azure.management.edgegateway.ServiceSpecification;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final DataBoxEdgeManager manager;
    OperationImpl(OperationInner inner, DataBoxEdgeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public ServiceSpecification serviceSpecification() {
        return this.inner().serviceSpecification();
    }

}
