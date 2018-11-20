/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.DtlEnvironmentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.DevTestLabManager;
import java.util.Map;

/**
 * Type representing DtlEnvironment.
 */
public interface DtlEnvironment extends HasInner<DtlEnvironmentInner>, Indexable, Refreshable<DtlEnvironment>, Updatable<DtlEnvironment.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the armTemplateDisplayName value.
     */
    String armTemplateDisplayName();

    /**
     * @return the createdByUser value.
     */
    String createdByUser();

    /**
     * @return the deploymentProperties value.
     */
    EnvironmentDeploymentProperties deploymentProperties();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGroupId value.
     */
    String resourceGroupId();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * The entirety of the DtlEnvironment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithUser, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DtlEnvironment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DtlEnvironment definition.
         */
        interface Blank extends WithUser {
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify User.
         */
        interface WithUser {
           /**
            * Specifies resourceGroupName, labName, userName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @param userName The name of the user profile
            * @return the next definition stage
            */
            WithCreate withExistingUser(String resourceGroupName, String labName, String userName);
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify ArmTemplateDisplayName.
         */
        interface WithArmTemplateDisplayName {
            /**
             * Specifies armTemplateDisplayName.
             * @param armTemplateDisplayName The display name of the Azure Resource Manager template that produced the environment
             * @return the next definition stage
             */
            WithCreate withArmTemplateDisplayName(String armTemplateDisplayName);
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify DeploymentProperties.
         */
        interface WithDeploymentProperties {
            /**
             * Specifies deploymentProperties.
             * @param deploymentProperties The deployment properties of the environment
             * @return the next definition stage
             */
            WithCreate withDeploymentProperties(EnvironmentDeploymentProperties deploymentProperties);
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the dtlenvironment definition allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next definition stage
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DtlEnvironment>, DefinitionStages.WithArmTemplateDisplayName, DefinitionStages.WithDeploymentProperties, DefinitionStages.WithLocation, DefinitionStages.WithProvisioningState, DefinitionStages.WithTags, DefinitionStages.WithUniqueIdentifier {
        }
    }
    /**
     * The template for a DtlEnvironment update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DtlEnvironment>, UpdateStages.WithArmTemplateDisplayName, UpdateStages.WithDeploymentProperties, UpdateStages.WithLocation, UpdateStages.WithProvisioningState, UpdateStages.WithTags, UpdateStages.WithUniqueIdentifier {
    }

    /**
     * Grouping of DtlEnvironment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the dtlenvironment update allowing to specify ArmTemplateDisplayName.
         */
        interface WithArmTemplateDisplayName {
            /**
             * Specifies armTemplateDisplayName.
             * @param armTemplateDisplayName The display name of the Azure Resource Manager template that produced the environment
             * @return the next update stage
             */
            Update withArmTemplateDisplayName(String armTemplateDisplayName);
        }

        /**
         * The stage of the dtlenvironment update allowing to specify DeploymentProperties.
         */
        interface WithDeploymentProperties {
            /**
             * Specifies deploymentProperties.
             * @param deploymentProperties The deployment properties of the environment
             * @return the next update stage
             */
            Update withDeploymentProperties(EnvironmentDeploymentProperties deploymentProperties);
        }

        /**
         * The stage of the dtlenvironment update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the dtlenvironment update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the dtlenvironment update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the dtlenvironment update allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next update stage
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }

    }
}
