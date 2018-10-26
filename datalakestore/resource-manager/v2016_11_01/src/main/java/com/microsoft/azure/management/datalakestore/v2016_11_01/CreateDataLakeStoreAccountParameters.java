/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The CreateDataLakeStoreAccountParameters model.
 */
@JsonFlatten
public class CreateDataLakeStoreAccountParameters {
    /**
     * The resource location.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The Key Vault encryption identity, if any.
     */
    @JsonProperty(value = "identity")
    private EncryptionIdentity identity;

    /**
     * The default owner group for all new folders and files created in the
     * Data Lake Store account.
     */
    @JsonProperty(value = "properties.defaultGroup")
    private String defaultGroup;

    /**
     * The Key Vault encryption configuration.
     */
    @JsonProperty(value = "properties.encryptionConfig")
    private EncryptionConfig encryptionConfig;

    /**
     * The current state of encryption for this Data Lake Store account.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.encryptionState")
    private EncryptionState encryptionState;

    /**
     * The list of firewall rules associated with this Data Lake Store account.
     */
    @JsonProperty(value = "properties.firewallRules")
    private List<CreateFirewallRuleWithAccountParameters> firewallRules;

    /**
     * The list of virtual network rules associated with this Data Lake Store
     * account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules;

    /**
     * The current state of the IP address firewall for this Data Lake Store
     * account. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallState")
    private FirewallState firewallState;

    /**
     * The current state of allowing or disallowing IPs originating within
     * Azure through the firewall. If the firewall is disabled, this is not
     * enforced. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /**
     * The list of trusted identity providers associated with this Data Lake
     * Store account.
     */
    @JsonProperty(value = "properties.trustedIdProviders")
    private List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders;

    /**
     * The current state of the trusted identity provider feature for this Data
     * Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.trustedIdProviderState")
    private TrustedIdProviderState trustedIdProviderState;

    /**
     * The commitment tier to use for next month. Possible values include:
     * 'Consumption', 'Commitment_1TB', 'Commitment_10TB', 'Commitment_100TB',
     * 'Commitment_500TB', 'Commitment_1PB', 'Commitment_5PB'.
     */
    @JsonProperty(value = "properties.newTier")
    private TierType newTier;

    /**
     * Get the resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the resource location.
     *
     * @param location the location value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the resource tags.
     *
     * @param tags the tags value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the Key Vault encryption identity, if any.
     *
     * @return the identity value
     */
    public EncryptionIdentity identity() {
        return this.identity;
    }

    /**
     * Set the Key Vault encryption identity, if any.
     *
     * @param identity the identity value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withIdentity(EncryptionIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the default owner group for all new folders and files created in the Data Lake Store account.
     *
     * @return the defaultGroup value
     */
    public String defaultGroup() {
        return this.defaultGroup;
    }

    /**
     * Set the default owner group for all new folders and files created in the Data Lake Store account.
     *
     * @param defaultGroup the defaultGroup value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withDefaultGroup(String defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * Get the Key Vault encryption configuration.
     *
     * @return the encryptionConfig value
     */
    public EncryptionConfig encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Set the Key Vault encryption configuration.
     *
     * @param encryptionConfig the encryptionConfig value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    /**
     * Get the current state of encryption for this Data Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the encryptionState value
     */
    public EncryptionState encryptionState() {
        return this.encryptionState;
    }

    /**
     * Set the current state of encryption for this Data Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param encryptionState the encryptionState value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withEncryptionState(EncryptionState encryptionState) {
        this.encryptionState = encryptionState;
        return this;
    }

    /**
     * Get the list of firewall rules associated with this Data Lake Store account.
     *
     * @return the firewallRules value
     */
    public List<CreateFirewallRuleWithAccountParameters> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Set the list of firewall rules associated with this Data Lake Store account.
     *
     * @param firewallRules the firewallRules value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withFirewallRules(List<CreateFirewallRuleWithAccountParameters> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    /**
     * Get the list of virtual network rules associated with this Data Lake Store account.
     *
     * @return the virtualNetworkRules value
     */
    public List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the list of virtual network rules associated with this Data Lake Store account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withVirtualNetworkRules(List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the current state of the IP address firewall for this Data Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the firewallState value
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the current state of the IP address firewall for this Data Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param firewallState the firewallState value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the firewallAllowAzureIps value
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

    /**
     * Get the list of trusted identity providers associated with this Data Lake Store account.
     *
     * @return the trustedIdProviders value
     */
    public List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders() {
        return this.trustedIdProviders;
    }

    /**
     * Set the list of trusted identity providers associated with this Data Lake Store account.
     *
     * @param trustedIdProviders the trustedIdProviders value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withTrustedIdProviders(List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders) {
        this.trustedIdProviders = trustedIdProviders;
        return this;
    }

    /**
     * Get the current state of the trusted identity provider feature for this Data Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the trustedIdProviderState value
     */
    public TrustedIdProviderState trustedIdProviderState() {
        return this.trustedIdProviderState;
    }

    /**
     * Set the current state of the trusted identity provider feature for this Data Lake Store account. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param trustedIdProviderState the trustedIdProviderState value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withTrustedIdProviderState(TrustedIdProviderState trustedIdProviderState) {
        this.trustedIdProviderState = trustedIdProviderState;
        return this;
    }

    /**
     * Get the commitment tier to use for next month. Possible values include: 'Consumption', 'Commitment_1TB', 'Commitment_10TB', 'Commitment_100TB', 'Commitment_500TB', 'Commitment_1PB', 'Commitment_5PB'.
     *
     * @return the newTier value
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the commitment tier to use for next month. Possible values include: 'Consumption', 'Commitment_1TB', 'Commitment_10TB', 'Commitment_100TB', 'Commitment_500TB', 'Commitment_1PB', 'Commitment_5PB'.
     *
     * @param newTier the newTier value to set
     * @return the CreateDataLakeStoreAccountParameters object itself.
     */
    public CreateDataLakeStoreAccountParameters withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

}
