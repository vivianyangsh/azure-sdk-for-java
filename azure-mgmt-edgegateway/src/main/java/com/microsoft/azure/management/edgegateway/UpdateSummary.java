/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.implementation.DataBoxEdgeManager;
import com.microsoft.azure.management.edgegateway.implementation.UpdateSummaryInner;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing UpdateSummary.
 */
public interface UpdateSummary extends HasInner<UpdateSummaryInner>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the deviceLastScannedDateTime value.
     */
    DateTime deviceLastScannedDateTime();

    /**
     * @return the deviceVersionNumber value.
     */
    String deviceVersionNumber();

    /**
     * @return the friendlyDeviceVersionName value.
     */
    String friendlyDeviceVersionName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the inProgressDownloadJobId value.
     */
    String inProgressDownloadJobId();

    /**
     * @return the inProgressDownloadJobStartedDateTime value.
     */
    DateTime inProgressDownloadJobStartedDateTime();

    /**
     * @return the inProgressInstallJobId value.
     */
    String inProgressInstallJobId();

    /**
     * @return the inProgressInstallJobStartedDateTime value.
     */
    DateTime inProgressInstallJobStartedDateTime();

    /**
     * @return the lastCompletedDownloadJobDateTime value.
     */
    DateTime lastCompletedDownloadJobDateTime();

    /**
     * @return the lastCompletedInstallJobDateTime value.
     */
    DateTime lastCompletedInstallJobDateTime();

    /**
     * @return the lastCompletedScanJobDateTime value.
     */
    DateTime lastCompletedScanJobDateTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the ongoingUpdateOperation value.
     */
    UpdateOperation ongoingUpdateOperation();

    /**
     * @return the rebootBehavior value.
     */
    InstallRebootBehavior rebootBehavior();

    /**
     * @return the totalNumberOfUpdatesAvailable value.
     */
    Integer totalNumberOfUpdatesAvailable();

    /**
     * @return the totalNumberOfUpdatesPendingDownload value.
     */
    Integer totalNumberOfUpdatesPendingDownload();

    /**
     * @return the totalNumberOfUpdatesPendingInstall value.
     */
    Integer totalNumberOfUpdatesPendingInstall();

    /**
     * @return the totalUpdateSizeInBytes value.
     */
    Double totalUpdateSizeInBytes();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the updateTitles value.
     */
    List<String> updateTitles();

}
