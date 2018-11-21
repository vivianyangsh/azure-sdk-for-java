/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A lab.
 */
@JsonFlatten
public class LabFragment extends UpdateResource {
    /**
     * Type of storage used by the lab. It can be either Premium or Standard.
     * Default is Premium. Possible values include: 'Standard', 'Premium'.
     */
    @JsonProperty(value = "properties.labStorageType")
    private StorageType labStorageType;

    /**
     * The ordered list of artifact resource IDs that should be applied on all
     * Linux VM creations by default, prior to the artifacts specified by the
     * user.
     */
    @JsonProperty(value = "properties.mandatoryArtifactsResourceIdsLinux")
    private List<String> mandatoryArtifactsResourceIdsLinux;

    /**
     * The ordered list of artifact resource IDs that should be applied on all
     * Windows VM creations by default, prior to the artifacts specified by the
     * user.
     */
    @JsonProperty(value = "properties.mandatoryArtifactsResourceIdsWindows")
    private List<String> mandatoryArtifactsResourceIdsWindows;

    /**
     * The setting to enable usage of premium data disks.
     * When its value is 'Enabled', creation of standard or premium data disks
     * is allowed.
     * When its value is 'Disabled', only creation of standard data disks is
     * allowed. Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "properties.premiumDataDisks")
    private PremiumDataDisk premiumDataDisks;

    /**
     * The access rights to be granted to the user when provisioning an
     * environment. Possible values include: 'Reader', 'Contributor'.
     */
    @JsonProperty(value = "properties.environmentPermission")
    private EnvironmentPermission environmentPermission;

    /**
     * The properties of any lab announcement associated with this lab.
     */
    @JsonProperty(value = "properties.announcement")
    private LabAnnouncementPropertiesFragment announcement;

    /**
     * The properties of any lab support message associated with this lab.
     */
    @JsonProperty(value = "properties.support")
    private LabSupportPropertiesFragment support;

    /**
     * Extended properties of the lab used for experimental features.
     */
    @JsonProperty(value = "properties.extendedProperties")
    private Map<String, String> extendedProperties;

    /**
     * Get type of storage used by the lab. It can be either Premium or Standard. Default is Premium. Possible values include: 'Standard', 'Premium'.
     *
     * @return the labStorageType value
     */
    public StorageType labStorageType() {
        return this.labStorageType;
    }

    /**
     * Set type of storage used by the lab. It can be either Premium or Standard. Default is Premium. Possible values include: 'Standard', 'Premium'.
     *
     * @param labStorageType the labStorageType value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withLabStorageType(StorageType labStorageType) {
        this.labStorageType = labStorageType;
        return this;
    }

    /**
     * Get the ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     *
     * @return the mandatoryArtifactsResourceIdsLinux value
     */
    public List<String> mandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux;
    }

    /**
     * Set the ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     *
     * @param mandatoryArtifactsResourceIdsLinux the mandatoryArtifactsResourceIdsLinux value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withMandatoryArtifactsResourceIdsLinux(List<String> mandatoryArtifactsResourceIdsLinux) {
        this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
        return this;
    }

    /**
     * Get the ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     *
     * @return the mandatoryArtifactsResourceIdsWindows value
     */
    public List<String> mandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows;
    }

    /**
     * Set the ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     *
     * @param mandatoryArtifactsResourceIdsWindows the mandatoryArtifactsResourceIdsWindows value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withMandatoryArtifactsResourceIdsWindows(List<String> mandatoryArtifactsResourceIdsWindows) {
        this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
        return this;
    }

    /**
     * Get the setting to enable usage of premium data disks.
     When its value is 'Enabled', creation of standard or premium data disks is allowed.
     When its value is 'Disabled', only creation of standard data disks is allowed. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the premiumDataDisks value
     */
    public PremiumDataDisk premiumDataDisks() {
        return this.premiumDataDisks;
    }

    /**
     * Set the setting to enable usage of premium data disks.
     When its value is 'Enabled', creation of standard or premium data disks is allowed.
     When its value is 'Disabled', only creation of standard data disks is allowed. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param premiumDataDisks the premiumDataDisks value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withPremiumDataDisks(PremiumDataDisk premiumDataDisks) {
        this.premiumDataDisks = premiumDataDisks;
        return this;
    }

    /**
     * Get the access rights to be granted to the user when provisioning an environment. Possible values include: 'Reader', 'Contributor'.
     *
     * @return the environmentPermission value
     */
    public EnvironmentPermission environmentPermission() {
        return this.environmentPermission;
    }

    /**
     * Set the access rights to be granted to the user when provisioning an environment. Possible values include: 'Reader', 'Contributor'.
     *
     * @param environmentPermission the environmentPermission value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withEnvironmentPermission(EnvironmentPermission environmentPermission) {
        this.environmentPermission = environmentPermission;
        return this;
    }

    /**
     * Get the properties of any lab announcement associated with this lab.
     *
     * @return the announcement value
     */
    public LabAnnouncementPropertiesFragment announcement() {
        return this.announcement;
    }

    /**
     * Set the properties of any lab announcement associated with this lab.
     *
     * @param announcement the announcement value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withAnnouncement(LabAnnouncementPropertiesFragment announcement) {
        this.announcement = announcement;
        return this;
    }

    /**
     * Get the properties of any lab support message associated with this lab.
     *
     * @return the support value
     */
    public LabSupportPropertiesFragment support() {
        return this.support;
    }

    /**
     * Set the properties of any lab support message associated with this lab.
     *
     * @param support the support value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withSupport(LabSupportPropertiesFragment support) {
        this.support = support;
        return this;
    }

    /**
     * Get extended properties of the lab used for experimental features.
     *
     * @return the extendedProperties value
     */
    public Map<String, String> extendedProperties() {
        return this.extendedProperties;
    }

    /**
     * Set extended properties of the lab used for experimental features.
     *
     * @param extendedProperties the extendedProperties value to set
     * @return the LabFragment object itself.
     */
    public LabFragment withExtendedProperties(Map<String, String> extendedProperties) {
        this.extendedProperties = extendedProperties;
        return this;
    }

}
