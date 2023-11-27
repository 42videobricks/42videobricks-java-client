# TagsApi

All URIs are relative to *https://api-sbx.42videobricks.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTags**](TagsApi.md#getTags) | **GET** /tags | List Video Tags |


<a id="getTags"></a>
# **getTags**
> TagList getTags(limit, offset, partial)

List Video Tags

Return the list of tags created and set to videos

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.TagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    TagsApi apiInstance = new TagsApi(defaultClient);
    Integer limit = 56; // Integer | Number of elements to return (default=10)
    Integer offset = 56; // Integer | offset for pagination
    String partial = "{{partial}}"; // String | \\'partial\\' string to filter list
    try {
      TagList result = apiInstance.getTags(limit, offset, partial);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getTags");
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
| **partial** | **String**| \\&#39;partial\\&#39; string to filter list | [optional] |

### Return type

[**TagList**](TagList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of video tags |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

