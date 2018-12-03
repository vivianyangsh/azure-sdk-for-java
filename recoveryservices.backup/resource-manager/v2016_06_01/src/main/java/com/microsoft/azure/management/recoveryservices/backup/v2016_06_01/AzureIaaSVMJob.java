/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.JobInner;

/**
 * The Azure IaaS VM workload-specific job object.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("AzureIaaSVMJob")
public class AzureIaaSVMJob extends JobInner {
    /**
     * The time that elapsed during the execution of this job.
     */
    @JsonProperty(value = "duration")
    private Period duration;

    /**
     * Gets or sets the state, or actions, applicable on this job. Examples of
     * the actions are: Cancel or Retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /**
     * Error details about this job.
     */
    @JsonProperty(value = "errorDetails")
    private List<AzureIaaSVMErrorInfo> errorDetails;

    /**
     * Specifies whether the backup item is a Classic VM or a Resource Manager
     * VM.
     */
    @JsonProperty(value = "virtualMachineVersion")
    private String virtualMachineVersion;

    /**
     * Additional information for this job.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureIaaSVMJobExtendedInfo extendedInfo;

    /**
     * Get the time that elapsed during the execution of this job.
     *
     * @return the duration value
     */
    public Period duration() {
        return this.duration;
    }

    /**
     * Set the time that elapsed during the execution of this job.
     *
     * @param duration the duration value to set
     * @return the AzureIaaSVMJob object itself.
     */
    public AzureIaaSVMJob withDuration(Period duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get gets or sets the state, or actions, applicable on this job. Examples of the actions are: Cancel or Retry.
     *
     * @return the actionsInfo value
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set gets or sets the state, or actions, applicable on this job. Examples of the actions are: Cancel or Retry.
     *
     * @param actionsInfo the actionsInfo value to set
     * @return the AzureIaaSVMJob object itself.
     */
    public AzureIaaSVMJob withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get error details about this job.
     *
     * @return the errorDetails value
     */
    public List<AzureIaaSVMErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set error details about this job.
     *
     * @param errorDetails the errorDetails value to set
     * @return the AzureIaaSVMJob object itself.
     */
    public AzureIaaSVMJob withErrorDetails(List<AzureIaaSVMErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get specifies whether the backup item is a Classic VM or a Resource Manager VM.
     *
     * @return the virtualMachineVersion value
     */
    public String virtualMachineVersion() {
        return this.virtualMachineVersion;
    }

    /**
     * Set specifies whether the backup item is a Classic VM or a Resource Manager VM.
     *
     * @param virtualMachineVersion the virtualMachineVersion value to set
     * @return the AzureIaaSVMJob object itself.
     */
    public AzureIaaSVMJob withVirtualMachineVersion(String virtualMachineVersion) {
        this.virtualMachineVersion = virtualMachineVersion;
        return this;
    }

    /**
     * Get additional information for this job.
     *
     * @return the extendedInfo value
     */
    public AzureIaaSVMJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for this job.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the AzureIaaSVMJob object itself.
     */
    public AzureIaaSVMJob withExtendedInfo(AzureIaaSVMJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
