/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Effective Route.
 */
public class EffectiveRoute {
    /**
     * The name of the user defined route. This is optional.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Who created the route. Possible values are: 'Unknown', 'User',
     * 'VirtualNetworkGateway', and 'Default'. Possible values include:
     * 'Unknown', 'User', 'VirtualNetworkGateway', 'Default'.
     */
    @JsonProperty(value = "source")
    private EffectiveRouteSource source;

    /**
     * The value of effective route. Possible values are: 'Active' and
     * 'Invalid'. Possible values include: 'Active', 'Invalid'.
     */
    @JsonProperty(value = "state")
    private EffectiveRouteState state;

    /**
     * The address prefixes of the effective routes in CIDR notation.
     */
    @JsonProperty(value = "addressPrefix")
    private List<String> addressPrefix;

    /**
     * The IP address of the next hop of the effective route.
     */
    @JsonProperty(value = "nextHopIpAddress")
    private List<String> nextHopIpAddress;

    /**
     * The type of Azure hop the packet should be sent to. Possible values are:
     * 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance',
     * and 'None'. Possible values include: 'VirtualNetworkGateway',
     * 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     */
    @JsonProperty(value = "nextHopType")
    private RouteNextHopType nextHopType;

    /**
     * Get the name of the user defined route. This is optional.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the user defined route. This is optional.
     *
     * @param name the name value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get who created the route. Possible values are: 'Unknown', 'User', 'VirtualNetworkGateway', and 'Default'. Possible values include: 'Unknown', 'User', 'VirtualNetworkGateway', 'Default'.
     *
     * @return the source value
     */
    public EffectiveRouteSource source() {
        return this.source;
    }

    /**
     * Set who created the route. Possible values are: 'Unknown', 'User', 'VirtualNetworkGateway', and 'Default'. Possible values include: 'Unknown', 'User', 'VirtualNetworkGateway', 'Default'.
     *
     * @param source the source value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withSource(EffectiveRouteSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the value of effective route. Possible values are: 'Active' and 'Invalid'. Possible values include: 'Active', 'Invalid'.
     *
     * @return the state value
     */
    public EffectiveRouteState state() {
        return this.state;
    }

    /**
     * Set the value of effective route. Possible values are: 'Active' and 'Invalid'. Possible values include: 'Active', 'Invalid'.
     *
     * @param state the state value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withState(EffectiveRouteState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the address prefixes of the effective routes in CIDR notation.
     *
     * @return the addressPrefix value
     */
    public List<String> addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the address prefixes of the effective routes in CIDR notation.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withAddressPrefix(List<String> addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the IP address of the next hop of the effective route.
     *
     * @return the nextHopIpAddress value
     */
    public List<String> nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the IP address of the next hop of the effective route.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withNextHopIpAddress(List<String> nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
        return this;
    }

    /**
     * Get the type of Azure hop the packet should be sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', and 'None'. Possible values include: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     *
     * @return the nextHopType value
     */
    public RouteNextHopType nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the type of Azure hop the packet should be sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', and 'None'. Possible values include: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     *
     * @param nextHopType the nextHopType value to set
     * @return the EffectiveRoute object itself.
     */
    public EffectiveRoute withNextHopType(RouteNextHopType nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

}
