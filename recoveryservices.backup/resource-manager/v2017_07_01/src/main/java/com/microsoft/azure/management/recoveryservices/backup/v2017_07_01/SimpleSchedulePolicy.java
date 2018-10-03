/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Simple policy schedule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "schedulePolicyType")
@JsonTypeName("SimpleSchedulePolicy")
public class SimpleSchedulePolicy extends SchedulePolicy {
    /**
     * Frequency of the schedule operation of this policy. Possible values
     * include: 'Invalid', 'Daily', 'Weekly'.
     */
    @JsonProperty(value = "scheduleRunFrequency")
    private ScheduleRunType scheduleRunFrequency;

    /**
     * List of days of week this schedule has to be run.
     */
    @JsonProperty(value = "scheduleRunDays")
    private List<DayOfWeek> scheduleRunDays;

    /**
     * List of times of day this schedule has to be run.
     */
    @JsonProperty(value = "scheduleRunTimes")
    private List<DateTime> scheduleRunTimes;

    /**
     * At every number weeks this schedule has to be run.
     */
    @JsonProperty(value = "scheduleWeeklyFrequency")
    private Integer scheduleWeeklyFrequency;

    /**
     * Get frequency of the schedule operation of this policy. Possible values include: 'Invalid', 'Daily', 'Weekly'.
     *
     * @return the scheduleRunFrequency value
     */
    public ScheduleRunType scheduleRunFrequency() {
        return this.scheduleRunFrequency;
    }

    /**
     * Set frequency of the schedule operation of this policy. Possible values include: 'Invalid', 'Daily', 'Weekly'.
     *
     * @param scheduleRunFrequency the scheduleRunFrequency value to set
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleRunFrequency(ScheduleRunType scheduleRunFrequency) {
        this.scheduleRunFrequency = scheduleRunFrequency;
        return this;
    }

    /**
     * Get list of days of week this schedule has to be run.
     *
     * @return the scheduleRunDays value
     */
    public List<DayOfWeek> scheduleRunDays() {
        return this.scheduleRunDays;
    }

    /**
     * Set list of days of week this schedule has to be run.
     *
     * @param scheduleRunDays the scheduleRunDays value to set
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleRunDays(List<DayOfWeek> scheduleRunDays) {
        this.scheduleRunDays = scheduleRunDays;
        return this;
    }

    /**
     * Get list of times of day this schedule has to be run.
     *
     * @return the scheduleRunTimes value
     */
    public List<DateTime> scheduleRunTimes() {
        return this.scheduleRunTimes;
    }

    /**
     * Set list of times of day this schedule has to be run.
     *
     * @param scheduleRunTimes the scheduleRunTimes value to set
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleRunTimes(List<DateTime> scheduleRunTimes) {
        this.scheduleRunTimes = scheduleRunTimes;
        return this;
    }

    /**
     * Get at every number weeks this schedule has to be run.
     *
     * @return the scheduleWeeklyFrequency value
     */
    public Integer scheduleWeeklyFrequency() {
        return this.scheduleWeeklyFrequency;
    }

    /**
     * Set at every number weeks this schedule has to be run.
     *
     * @param scheduleWeeklyFrequency the scheduleWeeklyFrequency value to set
     * @return the SimpleSchedulePolicy object itself.
     */
    public SimpleSchedulePolicy withScheduleWeeklyFrequency(Integer scheduleWeeklyFrequency) {
        this.scheduleWeeklyFrequency = scheduleWeeklyFrequency;
        return this;
    }

}
