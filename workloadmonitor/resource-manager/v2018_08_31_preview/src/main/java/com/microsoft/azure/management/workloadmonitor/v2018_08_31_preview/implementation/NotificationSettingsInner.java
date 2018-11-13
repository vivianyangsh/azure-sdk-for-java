/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NotificationSettings.
 */
public class NotificationSettingsInner {
    /** The Retrofit service to perform REST calls. */
    private NotificationSettingsService service;
    /** The service client containing this operation class. */
    private WorkloadMonitorAPIImpl client;

    /**
     * Initializes an instance of NotificationSettingsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NotificationSettingsInner(Retrofit retrofit, WorkloadMonitorAPIImpl client) {
        this.service = retrofit.create(NotificationSettingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NotificationSettings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NotificationSettingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.NotificationSettings listByResource" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceNamespace}/{resourceType}/{resourceName}/providers/Microsoft.WorkloadMonitor/notificationSettings")
        Observable<Response<ResponseBody>> listByResource(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceNamespace") String resourceNamespace, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.NotificationSettings update" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceNamespace}/{resourceType}/{resourceName}/providers/Microsoft.WorkloadMonitor/notificationSettings")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceNamespace") String resourceNamespace, @Path("resourceType") String resourceType, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body NotificationSettingInner body, @Header("User-Agent") String userAgent);

    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NotificationSettingsCollectionInner object if successful.
     */
    public NotificationSettingsCollectionInner listByResource(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        return listByResourceWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName).toBlocking().single().body();
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NotificationSettingsCollectionInner> listByResourceAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName, final ServiceCallback<NotificationSettingsCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName), serviceCallback);
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NotificationSettingsCollectionInner object
     */
    public Observable<NotificationSettingsCollectionInner> listByResourceAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        return listByResourceWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName).map(new Func1<ServiceResponse<NotificationSettingsCollectionInner>, NotificationSettingsCollectionInner>() {
            @Override
            public NotificationSettingsCollectionInner call(ServiceResponse<NotificationSettingsCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get list of notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NotificationSettingsCollectionInner object
     */
    public Observable<ServiceResponse<NotificationSettingsCollectionInner>> listByResourceWithServiceResponseAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceNamespace is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        return service.listByResource(this.client.subscriptionId(), resourceGroupName, resourceNamespace, resourceType, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NotificationSettingsCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<NotificationSettingsCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NotificationSettingsCollectionInner> clientResponse = listByResourceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NotificationSettingsCollectionInner> listByResourceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NotificationSettingsCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NotificationSettingsCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NotificationSettingsCollectionInner object if successful.
     */
    public NotificationSettingsCollectionInner update(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName).toBlocking().single().body();
    }

    /**
     * Update notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NotificationSettingsCollectionInner> updateAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName, final ServiceCallback<NotificationSettingsCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName), serviceCallback);
    }

    /**
     * Update notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NotificationSettingsCollectionInner object
     */
    public Observable<NotificationSettingsCollectionInner> updateAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceNamespace, resourceType, resourceName).map(new Func1<ServiceResponse<NotificationSettingsCollectionInner>, NotificationSettingsCollectionInner>() {
            @Override
            public NotificationSettingsCollectionInner call(ServiceResponse<NotificationSettingsCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update notification settings for a resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceNamespace The Namespace of the resource.
     * @param resourceType The type of the resource.
     * @param resourceName Name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NotificationSettingsCollectionInner object
     */
    public Observable<ServiceResponse<NotificationSettingsCollectionInner>> updateWithServiceResponseAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceNamespace is required and cannot be null.");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("Parameter resourceType is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        return service.update(this.client.subscriptionId(), resourceGroupName, resourceNamespace, resourceType, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), body, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NotificationSettingsCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<NotificationSettingsCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NotificationSettingsCollectionInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NotificationSettingsCollectionInner> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NotificationSettingsCollectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NotificationSettingsCollectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
