/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * NetworkSecurityGroup resource.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkSecurityGroupInner extends Resource {
    /**
     * A collection of security rules of the network security group.
     */
    @JsonProperty(value = "properties.securityRules")
    private List<SecurityRuleInner> securityRules;

    /**
     * The default security rules of network security group.
     */
    @JsonProperty(value = "properties.defaultSecurityRules")
    private List<SecurityRuleInner> defaultSecurityRules;

    /**
     * A collection of references to network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceInner> networkInterfaces;

    /**
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /**
     * The resource GUID property of the network security group resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get a collection of security rules of the network security group.
     *
     * @return the securityRules value
     */
    public List<SecurityRuleInner> securityRules() {
        return this.securityRules;
    }

    /**
     * Set a collection of security rules of the network security group.
     *
     * @param securityRules the securityRules value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Get the default security rules of network security group.
     *
     * @return the defaultSecurityRules value
     */
    public List<SecurityRuleInner> defaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Set the default security rules of network security group.
     *
     * @param defaultSecurityRules the defaultSecurityRules value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules) {
        this.defaultSecurityRules = defaultSecurityRules;
        return this;
    }

    /**
     * Get a collection of references to network interfaces.
     *
     * @return the networkInterfaces value
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get a collection of references to subnets.
     *
     * @return the subnets value
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the resource GUID property of the network security group resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resource GUID property of the network security group resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the NetworkSecurityGroupInner object itself.
     */
    public NetworkSecurityGroupInner withId(String id) {
        this.id = id;
        return this;
    }

}
