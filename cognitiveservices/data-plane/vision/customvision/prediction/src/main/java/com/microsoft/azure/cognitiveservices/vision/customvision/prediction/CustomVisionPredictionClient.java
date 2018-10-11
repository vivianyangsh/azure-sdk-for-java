/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models.ImagePrediction;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.UUID;
import rx.Observable;

/**
 * The interface for CustomVisionPredictionClient class.
 */
public interface CustomVisionPredictionClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets .
     *
     * @return the apiKey value.
     */
    String apiKey();

    /**
     * Sets .
     *
     * @param apiKey the apiKey value.
     * @return the service client itself
     */
    CustomVisionPredictionClient withApiKey(String apiKey);

    /**
     * Gets Supported Cognitive Services endpoints.
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints.
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    CustomVisionPredictionClient withEndpoint(String endpoint);

    /**
     * Gets The preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets The preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    CustomVisionPredictionClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    CustomVisionPredictionClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    CustomVisionPredictionClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImageUrl(UUID projectId);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageUrlAsync(UUID projectId, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageUrlAsync(UUID projectId);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageUrlWithServiceResponseAsync(UUID projectId);
    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImageUrl(UUID projectId, UUID iterationId, String application, String url);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageUrlAsync(UUID projectId, UUID iterationId, String application, String url, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageUrlAsync(UUID projectId, UUID iterationId, String application, String url);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageUrlWithServiceResponseAsync(UUID projectId, UUID iterationId, String application, String url);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImage(UUID projectId, byte[] imageData);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageAsync(UUID projectId, byte[] imageData, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageAsync(UUID projectId, byte[] imageData);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageWithServiceResponseAsync(UUID projectId, byte[] imageData);
    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImage(UUID projectId, byte[] imageData, UUID iterationId, String application);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageAsync(UUID projectId, byte[] imageData, UUID iterationId, String application, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageAsync(UUID projectId, byte[] imageData, UUID iterationId, String application);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageWithServiceResponseAsync(UUID projectId, byte[] imageData, UUID iterationId, String application);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImageUrlWithNoStore(UUID projectId);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageUrlWithNoStoreAsync(UUID projectId, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageUrlWithNoStoreAsync(UUID projectId);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageUrlWithNoStoreWithServiceResponseAsync(UUID projectId);
    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImageUrlWithNoStore(UUID projectId, UUID iterationId, String application, String url);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageUrlWithNoStoreAsync(UUID projectId, UUID iterationId, String application, String url, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageUrlWithNoStoreAsync(UUID projectId, UUID iterationId, String application, String url);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param url the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageUrlWithNoStoreWithServiceResponseAsync(UUID projectId, UUID iterationId, String application, String url);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImageWithNoStore(UUID projectId, byte[] imageData);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageWithNoStoreAsync(UUID projectId, byte[] imageData, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageWithNoStoreAsync(UUID projectId, byte[] imageData);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageWithNoStoreWithServiceResponseAsync(UUID projectId, byte[] imageData);
    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    ImagePrediction predictImageWithNoStore(UUID projectId, byte[] imageData, UUID iterationId, String application);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImagePrediction> predictImageWithNoStoreAsync(UUID projectId, byte[] imageData, UUID iterationId, String application, final ServiceCallback<ImagePrediction> serviceCallback);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ImagePrediction> predictImageWithNoStoreAsync(UUID projectId, byte[] imageData, UUID iterationId, String application);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id
     * @param imageData the InputStream value
     * @param iterationId Optional. Specifies the id of a particular iteration to evaluate against.
                 The default iteration for the project will be used when not specified
     * @param application Optional. Specifies the name of application using the endpoint
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    Observable<ServiceResponse<ImagePrediction>> predictImageWithNoStoreWithServiceResponseAsync(UUID projectId, byte[] imageData, UUID iterationId, String application);

}
