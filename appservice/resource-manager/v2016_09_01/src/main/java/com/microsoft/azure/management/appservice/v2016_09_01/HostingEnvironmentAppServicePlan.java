/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.AppServicePlanInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.WebManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing HostingEnvironmentAppServicePlan.
 */
public interface HostingEnvironmentAppServicePlan extends HasInner<AppServicePlanInner>, HasManager<WebManager> {
    /**
     * @return the adminSiteName value.
     */
    String adminSiteName();

    /**
     * @return the appServicePlanName value.
     */
    String appServicePlanName();

    /**
     * @return the geoRegion value.
     */
    String geoRegion();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isSpot value.
     */
    Boolean isSpot();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maximumNumberOfWorkers value.
     */
    Integer maximumNumberOfWorkers();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the numberOfSites value.
     */
    Integer numberOfSites();

    /**
     * @return the perSiteScaling value.
     */
    Boolean perSiteScaling();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * @return the spotExpirationTime value.
     */
    DateTime spotExpirationTime();

    /**
     * @return the status value.
     */
    StatusOptions status();

    /**
     * @return the subscription value.
     */
    String subscription();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetWorkerCount value.
     */
    Integer targetWorkerCount();

    /**
     * @return the targetWorkerSizeId value.
     */
    Integer targetWorkerSizeId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the workerTierName value.
     */
    String workerTierName();

}
