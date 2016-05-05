/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import org.joda.time.DateTime;
import java.util.List;

/**
 * An Azure Batch job.
 */
public class CloudJobInner {
    /**
     * Gets or sets a string that uniquely identifies the job within the
     * account. The id can contain any combination of alphanumeric characters
     * including hyphens and underscores, and cannot contain more than 64
     * characters. It is common to use a GUID for the id.
     */
    private String id;

    /**
     * Gets or sets the display name for the job.
     */
    private String displayName;

    /**
     * Gets or sets the flag that determines if this job will use tasks with
     * dependencies.
     */
    private Boolean usesTaskDependencies;

    /**
     * Gets or sets the URL of the job.
     */
    private String url;

    /**
     * Gets or sets the ETag of the job.
     */
    private String eTag;

    /**
     * Gets or sets the last modified time of the job.
     */
    private DateTime lastModified;

    /**
     * Gets or sets the creation time of the job.
     */
    private DateTime creationTime;

    /**
     * Gets or sets the current state of the job. Possible values include:
     * 'active', 'disabling', 'disabled', 'enabling', 'terminating',
     * 'completed', 'deleting'.
     */
    private JobState state;

    /**
     * Gets or sets the time at which the job entered its current state.
     */
    private DateTime stateTransitionTime;

    /**
     * Gets or sets the previous state of the job. This property is not set if
     * the job is in its initial Active state. Possible values include:
     * 'active', 'disabling', 'disabled', 'enabling', 'terminating',
     * 'completed', 'deleting'.
     */
    private JobState previousState;

    /**
     * Gets or sets the time at which the job entered its previous state. This
     * property is not set if the job is in its initial Active state.
     */
    private DateTime previousStateTransitionTime;

    /**
     * Gets or sets the priority of the job. Priority values can range from
     * -1000 to 1000, with -1000 being the lowest priority and 1000 being the
     * highest priority. The default value is 0.
     */
    private Integer priority;

    /**
     * Gets or sets the execution constraints for the job.
     */
    private JobConstraints constraints;

    /**
     * Gets or sets details of a Job Manager task to be launched when the job
     * is started.
     */
    private JobManagerTask jobManagerTask;

    /**
     * Gets or sets the Job Preparation task.
     */
    private JobPreparationTask jobPreparationTask;

    /**
     * Gets or sets the Job Release task.
     */
    private JobReleaseTask jobReleaseTask;

    /**
     * Gets or sets the list of common environment variable settings.  These
     * environment variables are set for all tasks in the job (including the
     * Job Manager, Job Preparation and Job Release tasks).
     */
    private List<EnvironmentSetting> commonEnvironmentSettings;

    /**
     * Gets or sets the pool on which the Batch service runs the job’s tasks.
     */
    private PoolInformation poolInfo;

    /**
     * Gets or sets a list of name-value pairs associated with the job as
     * metadata.
     */
    private List<MetadataItem> metadata;

    /**
     * Gets or sets the execution information for the job.
     */
    private JobExecutionInformation executionInfo;

    /**
     * Gets or sets resource usage statistics for the entire lifetime of the
     * job.
     */
    private JobStatisticsInner stats;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the usesTaskDependencies value.
     *
     * @return the usesTaskDependencies value
     */
    public Boolean usesTaskDependencies() {
        return this.usesTaskDependencies;
    }

    /**
     * Set the usesTaskDependencies value.
     *
     * @param usesTaskDependencies the usesTaskDependencies value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setUsesTaskDependencies(Boolean usesTaskDependencies) {
        this.usesTaskDependencies = usesTaskDependencies;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setState(JobState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateTransitionTime value.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the stateTransitionTime value.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get the previousState value.
     *
     * @return the previousState value
     */
    public JobState previousState() {
        return this.previousState;
    }

    /**
     * Set the previousState value.
     *
     * @param previousState the previousState value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setPreviousState(JobState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get the previousStateTransitionTime value.
     *
     * @return the previousStateTransitionTime value
     */
    public DateTime previousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Set the previousStateTransitionTime value.
     *
     * @param previousStateTransitionTime the previousStateTransitionTime value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setPreviousStateTransitionTime(DateTime previousStateTransitionTime) {
        this.previousStateTransitionTime = previousStateTransitionTime;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the constraints value.
     *
     * @return the constraints value
     */
    public JobConstraints constraints() {
        return this.constraints;
    }

    /**
     * Set the constraints value.
     *
     * @param constraints the constraints value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setConstraints(JobConstraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Get the jobManagerTask value.
     *
     * @return the jobManagerTask value
     */
    public JobManagerTask jobManagerTask() {
        return this.jobManagerTask;
    }

    /**
     * Set the jobManagerTask value.
     *
     * @param jobManagerTask the jobManagerTask value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setJobManagerTask(JobManagerTask jobManagerTask) {
        this.jobManagerTask = jobManagerTask;
        return this;
    }

    /**
     * Get the jobPreparationTask value.
     *
     * @return the jobPreparationTask value
     */
    public JobPreparationTask jobPreparationTask() {
        return this.jobPreparationTask;
    }

    /**
     * Set the jobPreparationTask value.
     *
     * @param jobPreparationTask the jobPreparationTask value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setJobPreparationTask(JobPreparationTask jobPreparationTask) {
        this.jobPreparationTask = jobPreparationTask;
        return this;
    }

    /**
     * Get the jobReleaseTask value.
     *
     * @return the jobReleaseTask value
     */
    public JobReleaseTask jobReleaseTask() {
        return this.jobReleaseTask;
    }

    /**
     * Set the jobReleaseTask value.
     *
     * @param jobReleaseTask the jobReleaseTask value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setJobReleaseTask(JobReleaseTask jobReleaseTask) {
        this.jobReleaseTask = jobReleaseTask;
        return this;
    }

    /**
     * Get the commonEnvironmentSettings value.
     *
     * @return the commonEnvironmentSettings value
     */
    public List<EnvironmentSetting> commonEnvironmentSettings() {
        return this.commonEnvironmentSettings;
    }

    /**
     * Set the commonEnvironmentSettings value.
     *
     * @param commonEnvironmentSettings the commonEnvironmentSettings value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setCommonEnvironmentSettings(List<EnvironmentSetting> commonEnvironmentSettings) {
        this.commonEnvironmentSettings = commonEnvironmentSettings;
        return this;
    }

    /**
     * Get the poolInfo value.
     *
     * @return the poolInfo value
     */
    public PoolInformation poolInfo() {
        return this.poolInfo;
    }

    /**
     * Set the poolInfo value.
     *
     * @param poolInfo the poolInfo value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setPoolInfo(PoolInformation poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public List<MetadataItem> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the executionInfo value.
     *
     * @return the executionInfo value
     */
    public JobExecutionInformation executionInfo() {
        return this.executionInfo;
    }

    /**
     * Set the executionInfo value.
     *
     * @param executionInfo the executionInfo value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setExecutionInfo(JobExecutionInformation executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

    /**
     * Get the stats value.
     *
     * @return the stats value
     */
    public JobStatisticsInner stats() {
        return this.stats;
    }

    /**
     * Set the stats value.
     *
     * @param stats the stats value to set
     * @return the CloudJobInner object itself.
     */
    public CloudJobInner setStats(JobStatisticsInner stats) {
        this.stats = stats;
        return this;
    }

}