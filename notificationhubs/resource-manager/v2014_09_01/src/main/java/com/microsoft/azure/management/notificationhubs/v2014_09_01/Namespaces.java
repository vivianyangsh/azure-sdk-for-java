/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation.NamespacesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Namespaces.
 */
public interface Namespaces extends SupportsCreating<NamespaceResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<NamespaceResource>, SupportsListingByResourceGroup<NamespaceResource>, SupportsListing<NamespaceResource>, HasInner<NamespacesInner> {
    /**
     * Begins definition for a new AuthorizationRule resource.
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    NamespaceSharedAccessAuthorizationRuleResource.DefinitionStages.Blank defineAuthorizationRule(String name);

    /**
     * The Get Operation Status operation returns the status of the specified operation. After calling an asynchronous operation, you can call Get Operation Status to determine whether the operation has succeeded, failed, or is still in progress.
     *
     * @param operationStatusLink Location value returned by the Begin operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getLongRunningOperationStatusAsync(String operationStatusLink);

    /**
     * Gets the authorization rules for a namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NamespaceSharedAccessAuthorizationRuleResource> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Checks the availability of the given service namespace across all Windows Azure subscriptions. This is useful because the domain name is created based on the service namespace name.
     *
     * @param parameters The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckAvailabilityResource> checkAvailabilityAsync(CheckAvailabilityParameters parameters);

    /**
     * Deletes a namespace authorization rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName Authorization Rule Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a namespace by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name
     * @param authorizationRuleName Authorization rule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NamespaceSharedAccessAuthorizationRuleResource> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the Primary and Secondary ConnectionStrings to the namespace.
     *
     * @param resourceGroupName The name of the resource group.
     * @param namespaceName The namespace name.
     * @param authorizationRuleName The connection string of the namespace for the specified authorizationRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

}
