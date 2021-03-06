/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.automation.v2015_10_31.DscNodeConfigurationAssociationProperty;
import java.util.List;
import com.microsoft.azure.management.automation.v2015_10_31.DscNodeExtensionHandlerAssociationProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Definition of the dsc node type.
 */
public class DscNodeInner extends ProxyResource {
    /**
     * Gets or sets the last seen time of the node.
     */
    @JsonProperty(value = "lastSeen")
    private DateTime lastSeen;

    /**
     * Gets or sets the registration time of the node.
     */
    @JsonProperty(value = "registrationTime")
    private DateTime registrationTime;

    /**
     * Gets or sets the ip of the node.
     */
    @JsonProperty(value = "ip")
    private String ip;

    /**
     * Gets or sets the account id of the node.
     */
    @JsonProperty(value = "accountId")
    private String accountId;

    /**
     * Gets or sets the configuration of the node.
     */
    @JsonProperty(value = "nodeConfiguration")
    private DscNodeConfigurationAssociationProperty nodeConfiguration;

    /**
     * Gets or sets the status of the node.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Gets or sets the node id.
     */
    @JsonProperty(value = "nodeId")
    private String nodeId;

    /**
     * Gets or sets the etag of the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Gets or sets the list of extensionHandler properties for a Node.
     */
    @JsonProperty(value = "extensionHandler")
    private List<DscNodeExtensionHandlerAssociationProperty> extensionHandler;

    /**
     * Get gets or sets the last seen time of the node.
     *
     * @return the lastSeen value
     */
    public DateTime lastSeen() {
        return this.lastSeen;
    }

    /**
     * Set gets or sets the last seen time of the node.
     *
     * @param lastSeen the lastSeen value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withLastSeen(DateTime lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    /**
     * Get gets or sets the registration time of the node.
     *
     * @return the registrationTime value
     */
    public DateTime registrationTime() {
        return this.registrationTime;
    }

    /**
     * Set gets or sets the registration time of the node.
     *
     * @param registrationTime the registrationTime value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withRegistrationTime(DateTime registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    /**
     * Get gets or sets the ip of the node.
     *
     * @return the ip value
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set gets or sets the ip of the node.
     *
     * @param ip the ip value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get gets or sets the account id of the node.
     *
     * @return the accountId value
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Set gets or sets the account id of the node.
     *
     * @param accountId the accountId value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get gets or sets the configuration of the node.
     *
     * @return the nodeConfiguration value
     */
    public DscNodeConfigurationAssociationProperty nodeConfiguration() {
        return this.nodeConfiguration;
    }

    /**
     * Set gets or sets the configuration of the node.
     *
     * @param nodeConfiguration the nodeConfiguration value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withNodeConfiguration(DscNodeConfigurationAssociationProperty nodeConfiguration) {
        this.nodeConfiguration = nodeConfiguration;
        return this;
    }

    /**
     * Get gets or sets the status of the node.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set gets or sets the status of the node.
     *
     * @param status the status value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get gets or sets the node id.
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set gets or sets the node id.
     *
     * @param nodeId the nodeId value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get gets or sets the etag of the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets or sets the etag of the resource.
     *
     * @param etag the etag value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get gets or sets the list of extensionHandler properties for a Node.
     *
     * @return the extensionHandler value
     */
    public List<DscNodeExtensionHandlerAssociationProperty> extensionHandler() {
        return this.extensionHandler;
    }

    /**
     * Set gets or sets the list of extensionHandler properties for a Node.
     *
     * @param extensionHandler the extensionHandler value to set
     * @return the DscNodeInner object itself.
     */
    public DscNodeInner withExtensionHandler(List<DscNodeExtensionHandlerAssociationProperty> extensionHandler) {
        this.extensionHandler = extensionHandler;
        return this;
    }

}
