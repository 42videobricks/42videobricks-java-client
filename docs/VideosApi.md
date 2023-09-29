# VideosApi

All URIs are relative to *https://api-sbx.42videobricks.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAttachmentByVideoId**](VideosApi.md#addAttachmentByVideoId) | **POST** /videos/{videoId}/attachments/{attachmentType}/{locale} | Upload an attachement |
| [**addThumbnailByVideoId**](VideosApi.md#addThumbnailByVideoId) | **POST** /videos/{videoId}/thumbnail | Upload a thumbnail |
| [**addVideo**](VideosApi.md#addVideo) | **POST** /videos | Add a new video |
| [**deleteAttachmentByVideoId**](VideosApi.md#deleteAttachmentByVideoId) | **DELETE** /videos/{videoId}/attachments/{attachmentType}/{locale} | Delete an attachment |
| [**deleteThumbnailByVideoId**](VideosApi.md#deleteThumbnailByVideoId) | **DELETE** /videos/{videoId}/thumbnail | Delete a thumbnail |
| [**deleteVideoById**](VideosApi.md#deleteVideoById) | **DELETE** /videos/{videoId} | Delete a video |
| [**finalizeMultipartUploadVideoById**](VideosApi.md#finalizeMultipartUploadVideoById) | **POST** /videos/{videoId}/multipart-upload/finalize | Multipart upload finalization |
| [**finalizeUploadVideoById**](VideosApi.md#finalizeUploadVideoById) | **PUT** /videos/{videoId}/upload/finalize | Single file upload finalization |
| [**getAttachmentByVideoId**](VideosApi.md#getAttachmentByVideoId) | **GET** /videos/{videoId}/attachments/{attachmentType}/{locale} | Get the attachment |
| [**getAttachmentFileByVideoId**](VideosApi.md#getAttachmentFileByVideoId) | **GET** /videos/{videoId}/attachments/{attachmentType}/{locale}/file | Get attachement file |
| [**getAttachmentsByVideoId**](VideosApi.md#getAttachmentsByVideoId) | **GET** /videos/{videoId}/attachments | List of attachments |
| [**getVideoById**](VideosApi.md#getVideoById) | **GET** /videos/{videoId} | Retun a single video |
| [**getVideos**](VideosApi.md#getVideos) | **GET** /videos | List videos |
| [**initMultipartUploadVideoById**](VideosApi.md#initMultipartUploadVideoById) | **POST** /videos/{videoId}/multipart-upload/init | Multipart upload intialization |
| [**initUploadVideoById**](VideosApi.md#initUploadVideoById) | **GET** /videos/{videoId}/upload/init | Single file upload intialization |
| [**updateVideoById**](VideosApi.md#updateVideoById) | **PUT** /videos/{videoId} | Update an existing video |


<a id="addAttachmentByVideoId"></a>
# **addAttachmentByVideoId**
> addAttachmentByVideoId(videoId, attachmentType, locale, _file)

Upload an attachement

Upload an attachement file and attached it to a video Currently: - attachement file type is limited to \&quot;subtitle\&quot; and \&quot;cpation\&quot; (close caption) - supported file types: SRT (text/plain), SCC (text/plain), TTML (application/ttml), VTT (text/vtt)

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    String attachmentType = "caption"; // String | Type of attachment
    String locale = "{{locale}}"; // String | Le locale value of the attachment
    File _file = new File("/path/to/file"); // File | The file to upload
    try {
      apiInstance.addAttachmentByVideoId(videoId, attachmentType, locale, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#addAttachmentByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **attachmentType** | **String**| Type of attachment | [enum: caption, subtitle] |
| **locale** | **String**| Le locale value of the attachment | |
| **_file** | **File**| The file to upload | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | File Accepted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="addThumbnailByVideoId"></a>
# **addThumbnailByVideoId**
> addThumbnailByVideoId(videoId, _file)

Upload a thumbnail

Upload an image file and set it as Thumbnail to the video

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    File _file = new File("/path/to/file"); // File | The file to upload
    try {
      apiInstance.addThumbnailByVideoId(videoId, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#addThumbnailByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **_file** | **File**| The file to upload | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image file accepted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="addVideo"></a>
# **addVideo**
> Video addVideo(videoProperties)

Add a new video

You can create a video object by using this endpoint.  Once the video is created you can then upload the video.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    VideoProperties videoProperties = new VideoProperties(); // VideoProperties | 
    try {
      Video result = apiInstance.addVideo(videoProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#addVideo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoProperties** | [**VideoProperties**](VideoProperties.md)|  | |

### Return type

[**Video**](Video.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Video Created |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteAttachmentByVideoId"></a>
# **deleteAttachmentByVideoId**
> deleteAttachmentByVideoId(videoId, attachmentType, locale)

Delete an attachment

Delete an attachment (and the attached file)

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    String attachmentType = "caption"; // String | Type of attachment
    String locale = "{{locale}}"; // String | Le locale value of the attachment
    try {
      apiInstance.deleteAttachmentByVideoId(videoId, attachmentType, locale);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteAttachmentByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **attachmentType** | **String**| Type of attachment | [enum: caption, subtitle] |
| **locale** | **String**| Le locale value of the attachment | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | empty content |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteThumbnailByVideoId"></a>
# **deleteThumbnailByVideoId**
> deleteThumbnailByVideoId(videoId)

Delete a thumbnail

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    try {
      apiInstance.deleteThumbnailByVideoId(videoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteThumbnailByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Thumbnail deleted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteVideoById"></a>
# **deleteVideoById**
> deleteVideoById(videoId)

Delete a video

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    try {
      apiInstance.deleteVideoById(videoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Video Deleted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="finalizeMultipartUploadVideoById"></a>
# **finalizeMultipartUploadVideoById**
> finalizeMultipartUploadVideoById(videoId, videoMultipartUploadFinalize)

Multipart upload finalization

Once video parts are uploaded, finalize the upload by requesting to transcode the file.  New video file is replacing previous video file.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    VideoMultipartUploadFinalize videoMultipartUploadFinalize = new VideoMultipartUploadFinalize(); // VideoMultipartUploadFinalize | 
    try {
      apiInstance.finalizeMultipartUploadVideoById(videoId, videoMultipartUploadFinalize);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#finalizeMultipartUploadVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **videoMultipartUploadFinalize** | [**VideoMultipartUploadFinalize**](VideoMultipartUploadFinalize.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Upload Accepted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="finalizeUploadVideoById"></a>
# **finalizeUploadVideoById**
> finalizeUploadVideoById(videoId)

Single file upload finalization

Once video file is uploaded, finalize the upload by requesting to transcode the file. Finalize apply to the last signedurl provided by the upload initialization.  New video file is replacing previous video file.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    try {
      apiInstance.finalizeUploadVideoById(videoId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#finalizeUploadVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Upload Accepted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAttachmentByVideoId"></a>
# **getAttachmentByVideoId**
> getAttachmentByVideoId(videoId, attachmentType, locale)

Get the attachment

Get a video attachement object

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    String attachmentType = "caption"; // String | Type of attachment
    String locale = "{{locale}}"; // String | Le locale value of the attachment
    try {
      apiInstance.getAttachmentByVideoId(videoId, attachmentType, locale);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getAttachmentByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **attachmentType** | **String**| Type of attachment | [enum: caption, subtitle] |
| **locale** | **String**| Le locale value of the attachment | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | video attachement object |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAttachmentFileByVideoId"></a>
# **getAttachmentFileByVideoId**
> getAttachmentFileByVideoId(videoId, attachmentType, locale)

Get attachement file

Get the attachement file Currently only text/plain files are handled.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    String attachmentType = "caption"; // String | Type of attachment
    String locale = "{{locale}}"; // String | Le locale value of the attachment
    try {
      apiInstance.getAttachmentFileByVideoId(videoId, attachmentType, locale);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getAttachmentFileByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **attachmentType** | **String**| Type of attachment | [enum: caption, subtitle] |
| **locale** | **String**| Le locale value of the attachment | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attachement file |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAttachmentsByVideoId"></a>
# **getAttachmentsByVideoId**
> VideoAttachmentList getAttachmentsByVideoId(videoId, attachmentType, locale, limit, offset)

List of attachments

Return a list of attachments to a videos

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    String attachmentType = "caption"; // String | The type of attachments
    String locale = "locale_example"; // String | The locale
    Integer limit = 56; // Integer | Number of elements to return (default=10)
    Integer offset = 56; // Integer | offset for pagination
    try {
      VideoAttachmentList result = apiInstance.getAttachmentsByVideoId(videoId, attachmentType, locale, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getAttachmentsByVideoId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **attachmentType** | **String**| The type of attachments | [optional] [enum: caption, subtitle] |
| **locale** | **String**| The locale | [optional] |
| **limit** | **Integer**| Number of elements to return (default&#x3D;10) | [optional] |
| **offset** | **Integer**| offset for pagination | [optional] |

### Return type

[**VideoAttachmentList**](VideoAttachmentList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of attachments |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVideoById"></a>
# **getVideoById**
> Video getVideoById(videoId, token)

Retun a single video

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    Boolean token = true; // Boolean | add a token to assets to alloaw access to private video
    try {
      Video result = apiInstance.getVideoById(videoId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **token** | **Boolean**| add a token to assets to alloaw access to private video | [optional] |

### Return type

[**Video**](Video.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested Video |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVideos"></a>
# **getVideos**
> VideoList getVideos(limit, offset, search, sort)

List videos

Return the list of videos.  Optionnal: Title is used to filter video: only video containing  this string ware returned.  Return an empty list it there is no video to return.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    Integer limit = 56; // Integer | Number of elements to return (default=10)
    Integer offset = 56; // Integer | offset for pagination
    String search = "{{search}}"; // String | Keywords search in all indexed fields
    String sort = "title:desc,ctime:asc"; // String | Sorting results
    try {
      VideoList result = apiInstance.getVideos(limit, offset, search, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getVideos");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of elements to return (default&#x3D;10) | [optional] |
| **offset** | **Integer**| offset for pagination | [optional] |
| **search** | **String**| Keywords search in all indexed fields | [optional] |
| **sort** | **String**| Sorting results | [optional] |

### Return type

[**VideoList**](VideoList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Videos |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

<a id="initMultipartUploadVideoById"></a>
# **initMultipartUploadVideoById**
> VideoMultipartUploadInitResponse initMultipartUploadVideoById(videoId, videoMultipartUploadInit)

Multipart upload intialization

Get signed urls to upload a big file split in multiparts Once the video is uploaded, do not forget to call the multipart upload finalize  New video file is replacing previous video file.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    VideoMultipartUploadInit videoMultipartUploadInit = new VideoMultipartUploadInit(); // VideoMultipartUploadInit | 
    try {
      VideoMultipartUploadInitResponse result = apiInstance.initMultipartUploadVideoById(videoId, videoMultipartUploadInit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#initMultipartUploadVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **videoMultipartUploadInit** | [**VideoMultipartUploadInit**](VideoMultipartUploadInit.md)|  | [optional] |

### Return type

[**VideoMultipartUploadInitResponse**](VideoMultipartUploadInitResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of signed urls to post parts of the video to upload |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="initUploadVideoById"></a>
# **initUploadVideoById**
> VideoUploadInitResponse initUploadVideoById(videoId)

Single file upload intialization

Get a single signed url to upload a file Once the video is uploaded, do not forget to call the single upload finalize  File formats currently supported: avi, mov, mp4, mpeg, mpg, mxf, ts. New video file is replacing previous video file.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    try {
      VideoUploadInitResponse result = apiInstance.initUploadVideoById(videoId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#initUploadVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |

### Return type

[**VideoUploadInitResponse**](VideoUploadInitResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Signed url to post the video file to upload |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateVideoById"></a>
# **updateVideoById**
> updateVideoById(videoId, videoProperties)

Update an existing video

Update video properties  Only properties provided are updated.

### Example
```java
// Import classes:
import com.42videobricks.ApiClient;
import com.42videobricks.ApiException;
import com.42videobricks.Configuration;
import com.42videobricks.auth.*;
import com.42videobricks.models.*;
import com.42videobricks.api.VideosApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    VideosApi apiInstance = new VideosApi(defaultClient);
    String videoId = "{{videoId}}"; // String | Id of the video
    VideoProperties videoProperties = new VideoProperties(); // VideoProperties | 
    try {
      apiInstance.updateVideoById(videoId, videoProperties);
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#updateVideoById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **videoId** | **String**| Id of the video | |
| **videoProperties** | [**VideoProperties**](VideoProperties.md)|  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Video update accepted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

