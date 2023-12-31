/*
 * 42videobricks
 * 42videobricks is a Video Platform As A Service (VPaaS)
 *
 * The version of the OpenAPI document: 1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.api42videobricks.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.api42videobricks.client.JSON;

/**
 * Video Single Upload Init response object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:12:12.471947Z[Etc/UTC]")
public class VideoUploadInitResponse {
  public static final String SERIALIZED_NAME_SIGNED_URL = "signedUrl";
  @SerializedName(SERIALIZED_NAME_SIGNED_URL)
  private URI signedUrl;

  public VideoUploadInitResponse() {
  }

  public VideoUploadInitResponse signedUrl(URI signedUrl) {
    this.signedUrl = signedUrl;
    return this;
  }

   /**
   * signed url
   * @return signedUrl
  **/
  @javax.annotation.Nullable
  public URI getSignedUrl() {
    return signedUrl;
  }

  public void setSignedUrl(URI signedUrl) {
    this.signedUrl = signedUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoUploadInitResponse videoUploadInitResponse = (VideoUploadInitResponse) o;
    return Objects.equals(this.signedUrl, videoUploadInitResponse.signedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoUploadInitResponse {\n");
    sb.append("    signedUrl: ").append(toIndentedString(signedUrl)).append("\n");
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
    openapiFields.add("signedUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VideoUploadInitResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VideoUploadInitResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoUploadInitResponse is not found in the empty JSON string", VideoUploadInitResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VideoUploadInitResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VideoUploadInitResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("signedUrl") != null && !jsonObj.get("signedUrl").isJsonNull()) && !jsonObj.get("signedUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signedUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signedUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoUploadInitResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoUploadInitResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoUploadInitResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoUploadInitResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoUploadInitResponse>() {
           @Override
           public void write(JsonWriter out, VideoUploadInitResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VideoUploadInitResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideoUploadInitResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoUploadInitResponse
  * @throws IOException if the JSON string is invalid with respect to VideoUploadInitResponse
  */
  public static VideoUploadInitResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoUploadInitResponse.class);
  }

 /**
  * Convert an instance of VideoUploadInitResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

