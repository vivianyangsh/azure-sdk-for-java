/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Description of a NotificationHub BaiduCredential.
 */
@JsonFlatten
public class BaiduCredential {
    /**
     * Baidu Api Key.
     */
    @JsonProperty(value = "properties.baiduApiKey")
    private String baiduApiKey;

    /**
     * Baidu Endpoint.
     */
    @JsonProperty(value = "properties.baiduEndPoint")
    private String baiduEndPoint;

    /**
     * Baidu Secret Key.
     */
    @JsonProperty(value = "properties.baiduSecretKey")
    private String baiduSecretKey;

    /**
     * Get baidu Api Key.
     *
     * @return the baiduApiKey value
     */
    public String baiduApiKey() {
        return this.baiduApiKey;
    }

    /**
     * Set baidu Api Key.
     *
     * @param baiduApiKey the baiduApiKey value to set
     * @return the BaiduCredential object itself.
     */
    public BaiduCredential withBaiduApiKey(String baiduApiKey) {
        this.baiduApiKey = baiduApiKey;
        return this;
    }

    /**
     * Get baidu Endpoint.
     *
     * @return the baiduEndPoint value
     */
    public String baiduEndPoint() {
        return this.baiduEndPoint;
    }

    /**
     * Set baidu Endpoint.
     *
     * @param baiduEndPoint the baiduEndPoint value to set
     * @return the BaiduCredential object itself.
     */
    public BaiduCredential withBaiduEndPoint(String baiduEndPoint) {
        this.baiduEndPoint = baiduEndPoint;
        return this;
    }

    /**
     * Get baidu Secret Key.
     *
     * @return the baiduSecretKey value
     */
    public String baiduSecretKey() {
        return this.baiduSecretKey;
    }

    /**
     * Set baidu Secret Key.
     *
     * @param baiduSecretKey the baiduSecretKey value to set
     * @return the BaiduCredential object itself.
     */
    public BaiduCredential withBaiduSecretKey(String baiduSecretKey) {
        this.baiduSecretKey = baiduSecretKey;
        return this;
    }

}
