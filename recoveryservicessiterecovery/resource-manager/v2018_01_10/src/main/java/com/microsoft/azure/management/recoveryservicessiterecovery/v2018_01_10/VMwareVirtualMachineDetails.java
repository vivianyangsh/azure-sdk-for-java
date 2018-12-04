/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMware provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareVirtualMachine")
public class VMwareVirtualMachineDetails extends ConfigurationSettings {
    /**
     * The ID generated by the InMage agent after it gets installed on guest.
     * This is the ID to be used during InMage CreateProtection.
     */
    @JsonProperty(value = "agentGeneratedId")
    private String agentGeneratedId;

    /**
     * The value indicating if InMage scout agent is installed on guest.
     */
    @JsonProperty(value = "agentInstalled")
    private String agentInstalled;

    /**
     * The OsType installed on VM.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /**
     * The agent version.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /**
     * The IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The value indicating whether VM is powered on.
     */
    @JsonProperty(value = "poweredOn")
    private String poweredOn;

    /**
     * The VCenter infrastructure Id.
     */
    @JsonProperty(value = "vCenterInfrastructureId")
    private String vCenterInfrastructureId;

    /**
     * A value indicating the discovery type of the machine. Value can be
     * vCenter or physical.
     */
    @JsonProperty(value = "discoveryType")
    private String discoveryType;

    /**
     * The disk details.
     */
    @JsonProperty(value = "diskDetails")
    private List<InMageDiskDetails> diskDetails;

    /**
     * The validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /**
     * Get the ID generated by the InMage agent after it gets installed on guest. This is the ID to be used during InMage CreateProtection.
     *
     * @return the agentGeneratedId value
     */
    public String agentGeneratedId() {
        return this.agentGeneratedId;
    }

    /**
     * Set the ID generated by the InMage agent after it gets installed on guest. This is the ID to be used during InMage CreateProtection.
     *
     * @param agentGeneratedId the agentGeneratedId value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withAgentGeneratedId(String agentGeneratedId) {
        this.agentGeneratedId = agentGeneratedId;
        return this;
    }

    /**
     * Get the value indicating if InMage scout agent is installed on guest.
     *
     * @return the agentInstalled value
     */
    public String agentInstalled() {
        return this.agentInstalled;
    }

    /**
     * Set the value indicating if InMage scout agent is installed on guest.
     *
     * @param agentInstalled the agentInstalled value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withAgentInstalled(String agentInstalled) {
        this.agentInstalled = agentInstalled;
        return this;
    }

    /**
     * Get the OsType installed on VM.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OsType installed on VM.
     *
     * @param osType the osType value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the agent version.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agent version.
     *
     * @param agentVersion the agentVersion value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the IP address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address.
     *
     * @param ipAddress the ipAddress value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the value indicating whether VM is powered on.
     *
     * @return the poweredOn value
     */
    public String poweredOn() {
        return this.poweredOn;
    }

    /**
     * Set the value indicating whether VM is powered on.
     *
     * @param poweredOn the poweredOn value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withPoweredOn(String poweredOn) {
        this.poweredOn = poweredOn;
        return this;
    }

    /**
     * Get the VCenter infrastructure Id.
     *
     * @return the vCenterInfrastructureId value
     */
    public String vCenterInfrastructureId() {
        return this.vCenterInfrastructureId;
    }

    /**
     * Set the VCenter infrastructure Id.
     *
     * @param vCenterInfrastructureId the vCenterInfrastructureId value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withVCenterInfrastructureId(String vCenterInfrastructureId) {
        this.vCenterInfrastructureId = vCenterInfrastructureId;
        return this;
    }

    /**
     * Get a value indicating the discovery type of the machine. Value can be vCenter or physical.
     *
     * @return the discoveryType value
     */
    public String discoveryType() {
        return this.discoveryType;
    }

    /**
     * Set a value indicating the discovery type of the machine. Value can be vCenter or physical.
     *
     * @param discoveryType the discoveryType value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withDiscoveryType(String discoveryType) {
        this.discoveryType = discoveryType;
        return this;
    }

    /**
     * Get the disk details.
     *
     * @return the diskDetails value
     */
    public List<InMageDiskDetails> diskDetails() {
        return this.diskDetails;
    }

    /**
     * Set the disk details.
     *
     * @param diskDetails the diskDetails value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withDiskDetails(List<InMageDiskDetails> diskDetails) {
        this.diskDetails = diskDetails;
        return this;
    }

    /**
     * Get the validation errors.
     *
     * @return the validationErrors value
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validation errors.
     *
     * @param validationErrors the validationErrors value to set
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

}
