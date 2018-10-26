/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.LiveOutputInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.MediaManager;
import org.joda.time.Period;
import org.joda.time.DateTime;

/**
 * Type representing LiveOutput.
 */
public interface LiveOutput extends HasInner<LiveOutputInner>, Indexable, Refreshable<LiveOutput>, Updatable<LiveOutput.Update>, HasManager<MediaManager> {
    /**
     * @return the archiveWindowLength value.
     */
    Period archiveWindowLength();

    /**
     * @return the assetName value.
     */
    String assetName();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the hls value.
     */
    Hls hls();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the manifestName value.
     */
    String manifestName();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outputSnapTime value.
     */
    Long outputSnapTime();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceState value.
     */
    LiveOutputResourceState resourceState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the LiveOutput definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLiveEvent, DefinitionStages.WithArchiveWindowLength, DefinitionStages.WithAssetName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LiveOutput definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LiveOutput definition.
         */
        interface Blank extends WithLiveEvent {
        }

        /**
         * The stage of the liveoutput definition allowing to specify LiveEvent.
         */
        interface WithLiveEvent {
           /**
            * Specifies resourceGroupName, accountName, liveEventName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @param liveEventName The name of the Live Event
            * @return the next definition stage
            */
            WithArchiveWindowLength withExistingLiveEvent(String resourceGroupName, String accountName, String liveEventName);
        }

        /**
         * The stage of the liveoutput definition allowing to specify ArchiveWindowLength.
         */
        interface WithArchiveWindowLength {
           /**
            * Specifies archiveWindowLength.
            * @param archiveWindowLength ISO 8601 timespan duration of the archive window length. This is duration that customer want to retain the recorded content
            * @return the next definition stage
            */
            WithAssetName withArchiveWindowLength(Period archiveWindowLength);
        }

        /**
         * The stage of the liveoutput definition allowing to specify AssetName.
         */
        interface WithAssetName {
           /**
            * Specifies assetName.
            * @param assetName The asset name
            * @return the next definition stage
            */
            WithCreate withAssetName(String assetName);
        }

        /**
         * The stage of the liveoutput definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the Live Output
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the liveoutput definition allowing to specify Hls.
         */
        interface WithHls {
            /**
             * Specifies hls.
             * @param hls The HLS configuration
             * @return the next definition stage
             */
            WithCreate withHls(Hls hls);
        }

        /**
         * The stage of the liveoutput definition allowing to specify ManifestName.
         */
        interface WithManifestName {
            /**
             * Specifies manifestName.
             * @param manifestName The manifest file name.  If not provided, the service will generate one automatically
             * @return the next definition stage
             */
            WithCreate withManifestName(String manifestName);
        }

        /**
         * The stage of the liveoutput definition allowing to specify OutputSnapTime.
         */
        interface WithOutputSnapTime {
            /**
             * Specifies outputSnapTime.
             * @param outputSnapTime The output snapshot time
             * @return the next definition stage
             */
            WithCreate withOutputSnapTime(Long outputSnapTime);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LiveOutput>, DefinitionStages.WithDescription, DefinitionStages.WithHls, DefinitionStages.WithManifestName, DefinitionStages.WithOutputSnapTime {
        }
    }
    /**
     * The template for a LiveOutput update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LiveOutput>, UpdateStages.WithDescription, UpdateStages.WithHls, UpdateStages.WithManifestName, UpdateStages.WithOutputSnapTime {
    }

    /**
     * Grouping of LiveOutput update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the liveoutput update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of the Live Output
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the liveoutput update allowing to specify Hls.
         */
        interface WithHls {
            /**
             * Specifies hls.
             * @param hls The HLS configuration
             * @return the next update stage
             */
            Update withHls(Hls hls);
        }

        /**
         * The stage of the liveoutput update allowing to specify ManifestName.
         */
        interface WithManifestName {
            /**
             * Specifies manifestName.
             * @param manifestName The manifest file name.  If not provided, the service will generate one automatically
             * @return the next update stage
             */
            Update withManifestName(String manifestName);
        }

        /**
         * The stage of the liveoutput update allowing to specify OutputSnapTime.
         */
        interface WithOutputSnapTime {
            /**
             * Specifies outputSnapTime.
             * @param outputSnapTime The output snapshot time
             * @return the next update stage
             */
            Update withOutputSnapTime(Long outputSnapTime);
        }

    }
}
