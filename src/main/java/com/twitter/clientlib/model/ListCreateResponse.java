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


package com.twitter.clientlib.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.twitter.clientlib.model.ListCreateResponseData;
import com.twitter.clientlib.model.Problem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * ListCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListCreateResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ListCreateResponseData data;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = null;

  public ListCreateResponse() { 
  }

  public ListCreateResponse data(ListCreateResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListCreateResponseData getData() {
    return data;
  }


  public void setData(ListCreateResponseData data) {
    this.data = data;
  }


  public ListCreateResponse errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public ListCreateResponse addErrorsItem(Problem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Problem> getErrors() {
    return errors;
  }


  public void setErrors(List<Problem> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCreateResponse listCreateResponse = (ListCreateResponse) o;
    return Objects.equals(this.data, listCreateResponse.data) &&
        Objects.equals(this.errors, listCreateResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCreateResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListCreateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (ListCreateResponse.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in ListCreateResponse is not found in the empty JSON string", ListCreateResponse.openapiRequiredFields.toString()));
     //   }
     // }

      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        ListCreateResponseData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      if (jsonArrayerrors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("errors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
        }

        // validate the optional field `errors` (array)
        for (int i = 0; i < jsonArrayerrors.size(); i++) {
          Problem.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCreateResponse>() {
           @Override
           public void write(JsonWriter out, ListCreateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCreateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListCreateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListCreateResponse
  * @throws IOException if the JSON string is invalid with respect to ListCreateResponse
  */
  public static ListCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCreateResponse.class);
  }

 /**
  * Convert an instance of ListCreateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

