/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext;

import com.microsoft.azure.cognitiveservices.translatortext.models.DictionaryExampleSuccessItem;
import com.microsoft.azure.cognitiveservices.translatortext.models.DictionaryExampleTextInput;
import com.microsoft.azure.cognitiveservices.translatortext.models.ErrorMessageException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DictionaryExamples.
 */
public interface DictionaryExamples {
    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DictionaryExampleSuccessItem&gt; object if successful.
     */
    List<DictionaryExampleSuccessItem> examplesPost(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text);

    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DictionaryExampleSuccessItem>> examplesPostAsync(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text, final ServiceCallback<List<DictionaryExampleSuccessItem>> serviceCallback);

    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DictionaryExampleSuccessItem&gt; object
     */
    Observable<List<DictionaryExampleSuccessItem>> examplesPostAsync(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text);

    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DictionaryExampleSuccessItem&gt; object
     */
    Observable<ServiceResponse<List<DictionaryExampleSuccessItem>>> examplesPostWithServiceResponseAsync(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text);
    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorMessageException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DictionaryExampleSuccessItem&gt; object if successful.
     */
    List<DictionaryExampleSuccessItem> examplesPost(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text, String xClientTraceId);

    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<DictionaryExampleSuccessItem>> examplesPostAsync(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text, String xClientTraceId, final ServiceCallback<List<DictionaryExampleSuccessItem>> serviceCallback);

    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DictionaryExampleSuccessItem&gt; object
     */
    Observable<List<DictionaryExampleSuccessItem>> examplesPostAsync(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text, String xClientTraceId);

    /**
     * Provides examples that show how terms in the dictionary are used in context. This operation is used in tandem with `Dictionary lookup`.
     *
     * @param apiVersion Version of the API requested by the client. Value must be **3.0**.
     * @param from Specifies the language of the input text. The source language must be one of the supported languages included in the `dictionary` scope.
     * @param to Specifies the language of the output text. The target language must be one of the supported languages included in the `dictionary` scope.
     * @param text # Request body
     The body of the request is a JSON array. Each array element is a JSON object with the following properties:
     * `Text-` A string specifying the term to lookup. This should be the value of a `normalizedText` field from the back-translations of a previous Dictionary lookup request. It can also be the value of the `normalizedSource` field.
     * `Translation-` A string specifying the translated text previously returned by the Dictionary lookup operation. This should be the value from the `normalizedTarget` field in the `translations` list of the Dictionary lookup response. The service will return examples for the specific source-target word-pair.
     The following limitations apply:
     * The array can have at most 10 elements.
     * The text value of an array element cannot exceed 100 characters including spaces.
     # Response body
     A successful response is a JSON array with one result for each string in the input array. A result object includes the following properties:
     * `normalizedSource-` A string giving the normalized form of the source term. Generally, this should be identical to the value of the `Text` field at the matching list index in the body of the request.
     * `normalizedTarget-` A string giving the normalized form of the target term. Generally, this should be identical to the value of the `Translation` field at the matching list index in the body of the request.
     * `examples-` A list of examples for the (source term, target term) pair. Each element of the list is an object with the following properties:
       * `sourcePrefix-` The string to concatenate before the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `sourceTerm-` A string equal to the actual term looked up. The string is added with `sourcePrefix` and `sourceSuffix` to form the complete example. Its value is separated so it can be marked in a user interface, e.g., by bolding it.
       * `sourceSuffix-` The string to concatenate after the value of `sourceTerm` to form a complete example. Do not add a space character, since it is already there when it should be. This value may be an empty string.
       * `targetPrefix-` A string similar to `sourcePrefix` but for the target.
       * `targetTerm-` A string similar to `sourceTerm` but for the target.
       * `targetSuffix-` A string similar to `sourceSuffix` but for the target.
     # Response Header
     X-RequestId - Value generated by the service to identify the request. It is used for troubleshooting purposes.
     NOTE - If there are no examples in the dictionary, the response is 200 (OK) but the `examples` list is an empty list.
     * @param xClientTraceId A client-generated GUID to uniquely identify the request. Note that you can omit this header if you include the trace ID in the query string using a query parameter named ClientTraceId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DictionaryExampleSuccessItem&gt; object
     */
    Observable<ServiceResponse<List<DictionaryExampleSuccessItem>>> examplesPostWithServiceResponseAsync(String apiVersion, String from, String to, List<DictionaryExampleTextInput> text, String xClientTraceId);

}
