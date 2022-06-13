/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.api;

import com.twitter.clientlib.ApiCallback;
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.ApiResponse;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.Pair;
import com.twitter.clientlib.ProgressRequestBody;
import com.twitter.clientlib.ProgressResponseBody;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.io.InputStream;
import javax.ws.rs.core.GenericType;

import org.apache.commons.lang3.StringUtils;

public class GeneralApi extends ApiCommon {

    /**
     * Build call for getOpenApiSpec
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOpenApiSpecCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2/openapi.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOpenApiSpecValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getOpenApiSpecCall(_callback);
        return localVarCall;

    }

    /**
     * Returns the OpenAPI Specification document.
     * Full OpenAPI Specification in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
     </table>
     */
    public Object getOpenApiSpec() throws ApiException {
      ApiResponse<Object> localVarResp = getOpenApiSpecWithHttpInfo();
      return localVarResp != null ? localVarResp.getData() : null;
    }

   /**
    * Calls the API using a retry mechanism to handle rate limits errors.
    *
    */
    public Object getOpenApiSpec(Integer retries) throws ApiException {
        Object localVarResp;
        try{
          localVarResp = getOpenApiSpec();
        } catch (ApiException e) {
          if(handleRateLimit(e, retries)) {
            return getOpenApiSpec(retries - 1);
          } else {
            throw e;
          }
        }
        return localVarResp;
    }

    /**
     * Returns the OpenAPI Specification document.
     * Full OpenAPI Specification in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getOpenApiSpecWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getOpenApiSpecValidateBeforeCall(null);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            throw e;
        }
    }

    /**
     * Returns the OpenAPI Specification document. (asynchronously)
     * Full OpenAPI Specification in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOpenApiSpecAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOpenApiSpecValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
