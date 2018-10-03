/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Azure VM workload-specific workload item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "workloadItemType")
@JsonTypeName("AzureVmWorkloadItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SAPHanaDatabase", value = AzureVmWorkloadSAPHanaDatabaseWorkloadItem.class),
    @JsonSubTypes.Type(name = "SAPHanaSystem", value = AzureVmWorkloadSAPHanaSystemWorkloadItem.class),
    @JsonSubTypes.Type(name = "SQLDataBase", value = AzureVmWorkloadSQLDatabaseWorkloadItem.class),
    @JsonSubTypes.Type(name = "SQLInstance", value = AzureVmWorkloadSQLInstanceWorkloadItem.class)
})
public class AzureVmWorkloadItem extends WorkloadItem {
    /**
     * Name for instance or AG.
     */
    @JsonProperty(value = "parentName")
    private String parentName;

    /**
     * Host/Cluster Name for instance or AG.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /**
     * Indicates if workload item is auto-protectable.
     */
    @JsonProperty(value = "isAutoProtectable")
    private Boolean isAutoProtectable;

    /**
     * For instance or AG, indicates number of DB's present.
     */
    @JsonProperty(value = "subinquireditemcount")
    private Integer subinquireditemcount;

    /**
     * For instance or AG, indicates number of DB's to be protected.
     */
    @JsonProperty(value = "subWorkloadItemCount")
    private Integer subWorkloadItemCount;

    /**
     * Get name for instance or AG.
     *
     * @return the parentName value
     */
    public String parentName() {
        return this.parentName;
    }

    /**
     * Set name for instance or AG.
     *
     * @param parentName the parentName value to set
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get host/Cluster Name for instance or AG.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set host/Cluster Name for instance or AG.
     *
     * @param serverName the serverName value to set
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get indicates if workload item is auto-protectable.
     *
     * @return the isAutoProtectable value
     */
    public Boolean isAutoProtectable() {
        return this.isAutoProtectable;
    }

    /**
     * Set indicates if workload item is auto-protectable.
     *
     * @param isAutoProtectable the isAutoProtectable value to set
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withIsAutoProtectable(Boolean isAutoProtectable) {
        this.isAutoProtectable = isAutoProtectable;
        return this;
    }

    /**
     * Get for instance or AG, indicates number of DB's present.
     *
     * @return the subinquireditemcount value
     */
    public Integer subinquireditemcount() {
        return this.subinquireditemcount;
    }

    /**
     * Set for instance or AG, indicates number of DB's present.
     *
     * @param subinquireditemcount the subinquireditemcount value to set
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withSubinquireditemcount(Integer subinquireditemcount) {
        this.subinquireditemcount = subinquireditemcount;
        return this;
    }

    /**
     * Get for instance or AG, indicates number of DB's to be protected.
     *
     * @return the subWorkloadItemCount value
     */
    public Integer subWorkloadItemCount() {
        return this.subWorkloadItemCount;
    }

    /**
     * Set for instance or AG, indicates number of DB's to be protected.
     *
     * @param subWorkloadItemCount the subWorkloadItemCount value to set
     * @return the AzureVmWorkloadItem object itself.
     */
    public AzureVmWorkloadItem withSubWorkloadItemCount(Integer subWorkloadItemCount) {
        this.subWorkloadItemCount = subWorkloadItemCount;
        return this;
    }

}
