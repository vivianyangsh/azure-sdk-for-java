/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.JobAutomationAccountJobStream;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.JobStreamType;
import org.joda.time.DateTime;
import java.util.Map;

class JobAutomationAccountJobStreamImpl extends IndexableRefreshableWrapperImpl<JobAutomationAccountJobStream, JobStreamInner> implements JobAutomationAccountJobStream {
    private final AutomationManager manager;
    private String resourceGroupName;
    private String automationAccountName;
    private String jobId;
    private String jobStreamId;

    JobAutomationAccountJobStreamImpl(JobStreamInner inner,  AutomationManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.automationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "automationAccounts");
        this.jobId = IdParsingUtils.getValueFromIdByName(inner.id(), "jobs");
        this.jobStreamId = IdParsingUtils.getValueFromIdByName(inner.id(), "streams");
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<JobStreamInner> getInnerAsync() {
        JobStreamsInner client = this.manager().inner().jobStreams();
        return client.getAsync(this.resourceGroupName, this.automationAccountName, this.jobId, this.jobStreamId);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String jobStreamId() {
        return this.inner().jobStreamId();
    }

    @Override
    public String streamText() {
        return this.inner().streamText();
    }

    @Override
    public JobStreamType streamType() {
        return this.inner().streamType();
    }

    @Override
    public String summary() {
        return this.inner().summary();
    }

    @Override
    public DateTime time() {
        return this.inner().time();
    }

    @Override
    public Map<String, Object> value() {
        return this.inner().value();
    }

}
