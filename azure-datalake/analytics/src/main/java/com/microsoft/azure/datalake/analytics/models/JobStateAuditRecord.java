/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics U-SQL job state audit records for tracking the
 * lifecycle of a job.
 */
public class JobStateAuditRecord {
    /**
     * Gets the new state the job is in.
     */
    @JsonProperty(value = "newState", access = JsonProperty.Access.WRITE_ONLY)
    private String newState;

    /**
     * Gets the time stamp that the state change took place.
     */
    @JsonProperty(value = "timeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timeStamp;

    /**
     * Gets the user who requests the change.
     */
    @JsonProperty(value = "requestedByUser", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedByUser;

    /**
     * Gets  the details of the audit log.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /**
     * Get gets the new state the job is in.
     *
     * @return the newState value
     */
    public String newState() {
        return this.newState;
    }

    /**
     * Get gets the time stamp that the state change took place.
     *
     * @return the timeStamp value
     */
    public DateTime timeStamp() {
        return this.timeStamp;
    }

    /**
     * Get gets the user who requests the change.
     *
     * @return the requestedByUser value
     */
    public String requestedByUser() {
        return this.requestedByUser;
    }

    /**
     * Get gets  the details of the audit log.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

}
