/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network adapter position.
 */
public class NetworkAdapterPosition {
    /**
     * The network group. Possible values include: 'None', 'NonRDMA', 'RDMA'.
     */
    @JsonProperty(value = "networkGroup", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkGroup networkGroup;

    /**
     * The port.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /**
     * Get the network group. Possible values include: 'None', 'NonRDMA', 'RDMA'.
     *
     * @return the networkGroup value
     */
    public NetworkGroup networkGroup() {
        return this.networkGroup;
    }

    /**
     * Get the port.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

}
