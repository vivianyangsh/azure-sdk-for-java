/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.ActivitysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Activitys.
 */
public interface Activitys extends HasInner<ActivitysInner> {
    /**
     * Retrieve the activity in the module identified by module name and activity name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param activityName The name of activity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Activity> getAsync(String resourceGroupName, String automationAccountName, String moduleName, String activityName);

    /**
     * Retrieve a list of activities in the module identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Activity> listByModuleAsync(final String resourceGroupName, final String automationAccountName, final String moduleName);

}
