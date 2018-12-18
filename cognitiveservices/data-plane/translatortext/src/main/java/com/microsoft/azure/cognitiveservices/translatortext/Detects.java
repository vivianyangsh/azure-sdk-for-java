/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext;

import com.microsoft.azure.cognitiveservices.translatortext.models.DetectSuccessItem;
import com.microsoft.azure.cognitiveservices.translatortext.models.DetectTextInput;
import com.microsoft.azure.cognitiveservices.translatortext.models.ErrorMessageException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Detects.
 */
public interface Detects {
    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectSuccessItem&gt; object if successful.
     */
    List<DetectSuccessItem> detectPost(String apiVersion, List<DetectTextInput> text);

    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DetectSuccessItem>> detectPostAsync(String apiVersion, List<DetectTextInput> text, final ServiceCallback<List<DetectSuccessItem>> serviceCallback);

    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectSuccessItem&gt; object
     */
    Observable<List<DetectSuccessItem>> detectPostAsync(String apiVersion, List<DetectTextInput> text);

    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectSuccessItem&gt; object
     */
    Observable<ServiceResponse<List<DetectSuccessItem>>> detectPostWithServiceResponseAsync(String apiVersion, List<DetectTextInput> text);
    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectSuccessItem&gt; object if successful.
     */
    List<DetectSuccessItem> detectPost(String apiVersion, List<DetectTextInput> text, String clientTraceId);

    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DetectSuccessItem>> detectPostAsync(String apiVersion, List<DetectTextInput> text, String clientTraceId, final ServiceCallback<List<DetectSuccessItem>> serviceCallback);

    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectSuccessItem&gt; object
     */
    Observable<List<DetectSuccessItem>> detectPostAsync(String apiVersion, List<DetectTextInput> text, String clientTraceId);

    /**
     * Identifies the language of a string of text.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param text # Request Body
     The body of the request is a JSON array. Each array element is a JSON object with a string property named Text. Language detection is applied to the value of the Text property.
     The following limitations apply:
     * The array can have at most 100 elements.
     * The text value of an array element cannot exceed 10,000 characters including spaces.
     * The entire text included in the request cannot exceed 50,000 characters including spaces.
     # Response Body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * language- Code of the detected language.
     * score- A float value indicating the confidence in the result. The score is between zero and one and a low score indicates a low confidence.
     * isTranslationSupported- A boolean value which is true if the detected language is one of the languages supported for text translation. Not all detected languages can be translated by the API.
     * isTransliterationSupported- A boolean value which is true if the detected language is one of the languages supported for transliteration.
     * alternatives- An array of other possible languages. Each element of the array is another object with the same properties listed above- language, score, isTranslationSupported and isTransliterationSupported.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     * @param clientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectSuccessItem&gt; object
     */
    Observable<ServiceResponse<List<DetectSuccessItem>>> detectPostWithServiceResponseAsync(String apiVersion, List<DetectTextInput> text, String clientTraceId);

}
