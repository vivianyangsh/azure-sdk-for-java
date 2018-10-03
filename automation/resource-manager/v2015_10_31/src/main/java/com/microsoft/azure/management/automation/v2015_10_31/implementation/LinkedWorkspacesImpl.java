/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.LinkedWorkspaces;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.LinkedWorkspace;

class LinkedWorkspacesImpl extends WrapperImpl<LinkedWorkspacesInner> implements LinkedWorkspaces {
    private final AutomationManager manager;

    LinkedWorkspacesImpl(AutomationManager manager) {
        super(manager.inner().linkedWorkspaces());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LinkedWorkspace> getAsync(String resourceGroupName, String automationAccountName) {
        LinkedWorkspacesInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName)
        .map(new Func1<LinkedWorkspaceInner, LinkedWorkspace>() {
            @Override
            public LinkedWorkspace call(LinkedWorkspaceInner inner) {
                return new LinkedWorkspaceImpl(inner, manager());
            }
        });
    }

}
