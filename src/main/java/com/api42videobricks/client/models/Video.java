/*
 * 42videobricks
 * 42videobricks is a Video Platform As A Service (VPaaS)
 *
 * The version of the OpenAPI document: 1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.api42videobricks.client.models;

import java.util.Objects;
import com.api42videobricks.client.models.VideoAssets;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Video Object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T13:34:32.692073Z[Etc/UTC]")
public class Video {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PUBLIC = "public";
  @SerializedName(SERIALIZED_NAME_PUBLIC)
  private Boolean _public;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Status of the video : * &#39;REQUESTED&#39;: video as been submited, waiting for its creation * &#39;CREATED&#39;: video has been created and file can be uploaded          * &#39;TRANSCODING&#39;: video is unvailable because still in the creation  &amp; in encoding process * &#39;AVAILABLE&#39;: video is ready to be stream
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    REQUESTED("REQUESTED"),
    
    CREATED("CREATED"),
    
    TRANSCODING("TRANSCODING"),
    
    AVAILABLE("AVAILABLE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_CTIME = "ctime";
  @SerializedName(SERIALIZED_NAME_CTIME)
  private Integer ctime;

  public static final String SERIALIZED_NAME_MTIME = "mtime";
  @SerializedName(SERIALIZED_NAME_MTIME)
  private Integer mtime;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private VideoAssets assets;

  public static final String SERIALIZED_NAME_METAS = "metas";
  @SerializedName(SERIALIZED_NAME_METAS)
  private Map<String, Object> metas = new HashMap<>();

  public Video() {
  }

  public Video title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * title of the video
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Video description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description of the video
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Video _public(Boolean _public) {
    
    this._public = _public;
    return this;
  }

   /**
   * Define if the video is public (it can be accessible by anybody with the video url). Default &#x3D; tue
   * @return _public
  **/
  @javax.annotation.Nullable
  public Boolean getPublic() {
    return _public;
  }


  public void setPublic(Boolean _public) {
    this._public = _public;
  }


  public Video tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Video addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * tags list linked to video
   * @return tags
  **/
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Video id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * id of the video (null when adding a new video)
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Video status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the video : * &#39;REQUESTED&#39;: video as been submited, waiting for its creation * &#39;CREATED&#39;: video has been created and file can be uploaded          * &#39;TRANSCODING&#39;: video is unvailable because still in the creation  &amp; in encoding process * &#39;AVAILABLE&#39;: video is ready to be stream
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Video duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * video duration in second
   * @return duration
  **/
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public Video ctime(Integer ctime) {
    
    this.ctime = ctime;
    return this;
  }

   /**
   * Creation date (timestamp)
   * @return ctime
  **/
  @javax.annotation.Nullable
  public Integer getCtime() {
    return ctime;
  }


  public void setCtime(Integer ctime) {
    this.ctime = ctime;
  }


  public Video mtime(Integer mtime) {
    
    this.mtime = mtime;
    return this;
  }

   /**
   * Modification date (timestamp)
   * @return mtime
  **/
  @javax.annotation.Nullable
  public Integer getMtime() {
    return mtime;
  }


  public void setMtime(Integer mtime) {
    this.mtime = mtime;
  }


  public Video assets(VideoAssets assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  public VideoAssets getAssets() {
    return assets;
  }


  public void setAssets(VideoAssets assets) {
    this.assets = assets;
  }


  public Video metas(Map<String, Object> metas) {
    
    this.metas = metas;
    return this;
  }

  public Video putMetasItem(String key, Object metasItem) {
    if (this.metas == null) {
      this.metas = new HashMap<>();
    }
    this.metas.put(key, metasItem);
    return this;
  }

   /**
   * metas data  free-form object: refere to the documentation
   * @return metas
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getMetas() {
    return metas;
  }


  public void setMetas(Map<String, Object> metas) {
    this.metas = metas;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Video video = (Video) o;
    return Objects.equals(this.title, video.title) &&
        Objects.equals(this.description, video.description) &&
        Objects.equals(this._public, video._public) &&
        Objects.equals(this.tags, video.tags) &&
        Objects.equals(this.id, video.id) &&
        Objects.equals(this.status, video.status) &&
        Objects.equals(this.duration, video.duration) &&
        Objects.equals(this.ctime, video.ctime) &&
        Objects.equals(this.mtime, video.mtime) &&
        Objects.equals(this.assets, video.assets) &&
        Objects.equals(this.metas, video.metas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, _public, tags, id, status, duration, ctime, mtime, assets, metas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Video {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    metas: ").append(toIndentedString(metas)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("public");
    openapiFields.add("tags");
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("duration");
    openapiFields.add("ctime");
    openapiFields.add("mtime");
    openapiFields.add("assets");
    openapiFields.add("metas");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Video
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Video.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Video is not found in the empty JSON string", Video.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Video.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Video` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Video.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        VideoAssets.validateJsonElement(jsonObj.get("assets"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Video.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Video' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Video> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Video.class));

       return (TypeAdapter<T>) new TypeAdapter<Video>() {
           @Override
           public void write(JsonWriter out, Video value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Video read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Video given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Video
  * @throws IOException if the JSON string is invalid with respect to Video
  */
  public static Video fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Video.class);
  }

 /**
  * Convert an instance of Video to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

