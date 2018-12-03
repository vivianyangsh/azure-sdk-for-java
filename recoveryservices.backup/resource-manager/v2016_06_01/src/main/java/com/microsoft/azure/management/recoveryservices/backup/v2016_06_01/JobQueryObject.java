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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The filters to list the jobs.
 */
public class JobQueryObject {
    /**
     * Status of the job. Possible values include: 'Invalid', 'InProgress',
     * 'Completed', 'Failed', 'CompletedWithWarnings', 'Cancelled',
     * 'Cancelling'.
     */
    @JsonProperty(value = "status")
    private JobStatus status;

    /**
     * Type of backup management for the job. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * The type of operation. Possible values include: 'Invalid',
     * 'ConfigureBackup', 'Backup', 'Restore', 'DisableBackup',
     * 'DeleteBackupData'.
     */
    @JsonProperty(value = "operation")
    private JobOperationType operation;

    /**
     * The ID of the job. Each jobID is unique.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * The time when the job starts. The value is in UTC.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The time when the job ends. The value is in UTC.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * Get status of the job. Possible values include: 'Invalid', 'InProgress', 'Completed', 'Failed', 'CompletedWithWarnings', 'Cancelled', 'Cancelling'.
     *
     * @return the status value
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Set status of the job. Possible values include: 'Invalid', 'InProgress', 'Completed', 'Failed', 'CompletedWithWarnings', 'Cancelled', 'Cancelling'.
     *
     * @param status the status value to set
     * @return the JobQueryObject object itself.
     */
    public JobQueryObject withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get type of backup management for the job. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set type of backup management for the job. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the JobQueryObject object itself.
     */
    public JobQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the type of operation. Possible values include: 'Invalid', 'ConfigureBackup', 'Backup', 'Restore', 'DisableBackup', 'DeleteBackupData'.
     *
     * @return the operation value
     */
    public JobOperationType operation() {
        return this.operation;
    }

    /**
     * Set the type of operation. Possible values include: 'Invalid', 'ConfigureBackup', 'Backup', 'Restore', 'DisableBackup', 'DeleteBackupData'.
     *
     * @param operation the operation value to set
     * @return the JobQueryObject object itself.
     */
    public JobQueryObject withOperation(JobOperationType operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the ID of the job. Each jobID is unique.
     *
     * @return the jobId value
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the ID of the job. Each jobID is unique.
     *
     * @param jobId the jobId value to set
     * @return the JobQueryObject object itself.
     */
    public JobQueryObject withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the time when the job starts. The value is in UTC.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the time when the job starts. The value is in UTC.
     *
     * @param startTime the startTime value to set
     * @return the JobQueryObject object itself.
     */
    public JobQueryObject withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time when the job ends. The value is in UTC.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the time when the job ends. The value is in UTC.
     *
     * @param endTime the endTime value to set
     * @return the JobQueryObject object itself.
     */
    public JobQueryObject withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

}
