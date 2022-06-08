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
import com.twitter.clientlib.model.ContextAnnotationDomainFields;
import com.twitter.clientlib.model.ContextAnnotationEntityFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Annotation inferred from the Tweet text.
 */
@ApiModel(description = "Annotation inferred from the Tweet text.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContextAnnotation {
  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private ContextAnnotationDomainFields domain;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private ContextAnnotationEntityFields entity;

  public ContextAnnotation() { 
  }

  public ContextAnnotation domain(ContextAnnotationDomainFields domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContextAnnotationDomainFields getDomain() {
    return domain;
  }


  public void setDomain(ContextAnnotationDomainFields domain) {
    this.domain = domain;
  }


  public ContextAnnotation entity(ContextAnnotationEntityFields entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContextAnnotationEntityFields getEntity() {
    return entity;
  }


  public void setEntity(ContextAnnotationEntityFields entity) {
    this.entity = entity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextAnnotation contextAnnotation = (ContextAnnotation) o;
    return Objects.equals(this.domain, contextAnnotation.domain) &&
        Objects.equals(this.entity, contextAnnotation.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextAnnotation {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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
    openapiFields.add("domain");
    openapiFields.add("entity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("entity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContextAnnotation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (ContextAnnotation.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in ContextAnnotation is not found in the empty JSON string", ContextAnnotation.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContextAnnotation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `domain`
      if (jsonObj.getAsJsonObject("domain") != null) {
        ContextAnnotationDomainFields.validateJsonObject(jsonObj.getAsJsonObject("domain"));
      }
      // validate the optional field `entity`
      if (jsonObj.getAsJsonObject("entity") != null) {
        ContextAnnotationEntityFields.validateJsonObject(jsonObj.getAsJsonObject("entity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContextAnnotation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContextAnnotation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContextAnnotation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContextAnnotation.class));

       return (TypeAdapter<T>) new TypeAdapter<ContextAnnotation>() {
           @Override
           public void write(JsonWriter out, ContextAnnotation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContextAnnotation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContextAnnotation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContextAnnotation
  * @throws IOException if the JSON string is invalid with respect to ContextAnnotation
  */
  public static ContextAnnotation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContextAnnotation.class);
  }

 /**
  * Convert an instance of ContextAnnotation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

