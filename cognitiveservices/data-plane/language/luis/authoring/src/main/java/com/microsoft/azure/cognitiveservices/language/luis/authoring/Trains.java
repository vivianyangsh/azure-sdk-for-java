/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.EnqueueTrainingResponse;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ModelTrainingInfo;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Trains.
 */
public interface Trains {

    /**
     * Sends a training request for a version of a specified LUIS app. This POST request initiates a
      *  request asynchronously. To determine whether the training request is successful, submit a GET
      *  request to get training status. Note: The application version is not fully trained unless all the
      *  models (intents and entities) are trained successfully or are up to date. To verify training
      *  success, get the training status at least once after training is complete.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnqueueTrainingResponse object if successful.
     */
    EnqueueTrainingResponse trainVersion(UUID appId, String versionId);

    /**
     * Sends a training request for a version of a specified LUIS app. This POST request initiates a
      *  request asynchronously. To determine whether the training request is successful, submit a GET
      *  request to get training status. Note: The application version is not fully trained unless all the
      *  models (intents and entities) are trained successfully or are up to date. To verify training
      *  success, get the training status at least once after training is complete.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnqueueTrainingResponse object
     */
    Observable<EnqueueTrainingResponse> trainVersionAsync(UUID appId, String versionId);



    /**
     * Gets the training status of all models (intents and entities) for the specified LUIS app. You must
      *  call the train API to train the LUIS app before you call this API to get training status. "appID"
      *  specifies the LUIS app ID. "versionId" specifies the version number of the LUIS app. For example,
      *  "0.1".
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ModelTrainingInfo&gt; object if successful.
     */
    List<ModelTrainingInfo> getStatus(UUID appId, String versionId);

    /**
     * Gets the training status of all models (intents and entities) for the specified LUIS app. You must
      *  call the train API to train the LUIS app before you call this API to get training status. "appID"
      *  specifies the LUIS app ID. "versionId" specifies the version number of the LUIS app. For example,
      *  "0.1".
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ModelTrainingInfo&gt; object
     */
    Observable<List<ModelTrainingInfo>> getStatusAsync(UUID appId, String versionId);


}
