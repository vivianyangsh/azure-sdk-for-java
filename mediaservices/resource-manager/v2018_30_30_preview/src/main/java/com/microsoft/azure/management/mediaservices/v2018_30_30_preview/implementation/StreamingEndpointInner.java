/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.StreamingEndpointAccessControl;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.StreamingEndpointResourceState;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.CrossSiteAccessPolicies;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The StreamingEndpoint.
 */
@JsonFlatten
@SkipParentValidation
public class StreamingEndpointInner extends Resource {
    /**
     * The StreamingEndpoint description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The number of scale units.
     */
    @JsonProperty(value = "properties.scaleUnits")
    private int scaleUnits;

    /**
     * AvailabilitySet name.
     */
    @JsonProperty(value = "properties.availabilitySetName")
    private String availabilitySetName;

    /**
     * The access control definition of the StreamingEndpoint.
     */
    @JsonProperty(value = "properties.accessControl")
    private StreamingEndpointAccessControl accessControl;

    /**
     * Max cache age.
     */
    @JsonProperty(value = "properties.maxCacheAge")
    private Long maxCacheAge;

    /**
     * The custom host names of the StreamingEndpoint.
     */
    @JsonProperty(value = "properties.customHostNames")
    private List<String> customHostNames;

    /**
     * The StreamingEndpoint host name.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostName;

    /**
     * The CDN enabled flag.
     */
    @JsonProperty(value = "properties.cdnEnabled")
    private Boolean cdnEnabled;

    /**
     * The CDN provider name.
     */
    @JsonProperty(value = "properties.cdnProvider")
    private String cdnProvider;

    /**
     * The CDN profile name.
     */
    @JsonProperty(value = "properties.cdnProfile")
    private String cdnProfile;

    /**
     * The provisioning state of the StreamingEndpoint.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The resource state of the StreamingEndpoint. Possible values include:
     * 'Stopped', 'Starting', 'Running', 'Stopping', 'Deleting', 'Scaling'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private StreamingEndpointResourceState resourceState;

    /**
     * The StreamingEndpoint access policies.
     */
    @JsonProperty(value = "properties.crossSiteAccessPolicies")
    private CrossSiteAccessPolicies crossSiteAccessPolicies;

    /**
     * The free trial expiration time.
     */
    @JsonProperty(value = "properties.freeTrialEndTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime freeTrialEndTime;

    /**
     * The exact time the StreamingEndpoint was created.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The exact time the StreamingEndpoint was last modified.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * Get the StreamingEndpoint description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the StreamingEndpoint description.
     *
     * @param description the description value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the number of scale units.
     *
     * @return the scaleUnits value
     */
    public int scaleUnits() {
        return this.scaleUnits;
    }

    /**
     * Set the number of scale units.
     *
     * @param scaleUnits the scaleUnits value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withScaleUnits(int scaleUnits) {
        this.scaleUnits = scaleUnits;
        return this;
    }

    /**
     * Get availabilitySet name.
     *
     * @return the availabilitySetName value
     */
    public String availabilitySetName() {
        return this.availabilitySetName;
    }

    /**
     * Set availabilitySet name.
     *
     * @param availabilitySetName the availabilitySetName value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withAvailabilitySetName(String availabilitySetName) {
        this.availabilitySetName = availabilitySetName;
        return this;
    }

    /**
     * Get the access control definition of the StreamingEndpoint.
     *
     * @return the accessControl value
     */
    public StreamingEndpointAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the access control definition of the StreamingEndpoint.
     *
     * @param accessControl the accessControl value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withAccessControl(StreamingEndpointAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get max cache age.
     *
     * @return the maxCacheAge value
     */
    public Long maxCacheAge() {
        return this.maxCacheAge;
    }

    /**
     * Set max cache age.
     *
     * @param maxCacheAge the maxCacheAge value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withMaxCacheAge(Long maxCacheAge) {
        this.maxCacheAge = maxCacheAge;
        return this;
    }

    /**
     * Get the custom host names of the StreamingEndpoint.
     *
     * @return the customHostNames value
     */
    public List<String> customHostNames() {
        return this.customHostNames;
    }

    /**
     * Set the custom host names of the StreamingEndpoint.
     *
     * @param customHostNames the customHostNames value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCustomHostNames(List<String> customHostNames) {
        this.customHostNames = customHostNames;
        return this;
    }

    /**
     * Get the StreamingEndpoint host name.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Get the CDN enabled flag.
     *
     * @return the cdnEnabled value
     */
    public Boolean cdnEnabled() {
        return this.cdnEnabled;
    }

    /**
     * Set the CDN enabled flag.
     *
     * @param cdnEnabled the cdnEnabled value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCdnEnabled(Boolean cdnEnabled) {
        this.cdnEnabled = cdnEnabled;
        return this;
    }

    /**
     * Get the CDN provider name.
     *
     * @return the cdnProvider value
     */
    public String cdnProvider() {
        return this.cdnProvider;
    }

    /**
     * Set the CDN provider name.
     *
     * @param cdnProvider the cdnProvider value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCdnProvider(String cdnProvider) {
        this.cdnProvider = cdnProvider;
        return this;
    }

    /**
     * Get the CDN profile name.
     *
     * @return the cdnProfile value
     */
    public String cdnProfile() {
        return this.cdnProfile;
    }

    /**
     * Set the CDN profile name.
     *
     * @param cdnProfile the cdnProfile value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCdnProfile(String cdnProfile) {
        this.cdnProfile = cdnProfile;
        return this;
    }

    /**
     * Get the provisioning state of the StreamingEndpoint.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resource state of the StreamingEndpoint. Possible values include: 'Stopped', 'Starting', 'Running', 'Stopping', 'Deleting', 'Scaling'.
     *
     * @return the resourceState value
     */
    public StreamingEndpointResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the StreamingEndpoint access policies.
     *
     * @return the crossSiteAccessPolicies value
     */
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies;
    }

    /**
     * Set the StreamingEndpoint access policies.
     *
     * @param crossSiteAccessPolicies the crossSiteAccessPolicies value to set
     * @return the StreamingEndpointInner object itself.
     */
    public StreamingEndpointInner withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        return this;
    }

    /**
     * Get the free trial expiration time.
     *
     * @return the freeTrialEndTime value
     */
    public DateTime freeTrialEndTime() {
        return this.freeTrialEndTime;
    }

    /**
     * Get the exact time the StreamingEndpoint was created.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the exact time the StreamingEndpoint was last modified.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

}
