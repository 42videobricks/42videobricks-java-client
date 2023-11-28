# PlaylistsApi

All URIs are relative to *https://api-sbx.42videobricks.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPlaylist**](PlaylistsApi.md#addPlaylist) | **POST** /playlists | Add a new playlist |
| [**deletePlaylistById**](PlaylistsApi.md#deletePlaylistById) | **DELETE** /playlists/{playlistId} | Delete a playlist |
| [**getPlaylistById**](PlaylistsApi.md#getPlaylistById) | **GET** /playlists/{playlistId} | Retun a single playlist |
| [**getPlaylists**](PlaylistsApi.md#getPlaylists) | **GET** /playlists | List playlists |
| [**updatePlaylistById**](PlaylistsApi.md#updatePlaylistById) | **PUT** /playlists/{playlistId} | Update an existing playlist |


<a id="addPlaylist"></a>
# **addPlaylist**
> Playlist addPlaylist(playlistProperties)

Add a new playlist

Create a new playlist.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    PlaylistProperties playlistProperties = new PlaylistProperties(); // PlaylistProperties | 
    try {
      Playlist result = apiInstance.addPlaylist(playlistProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#addPlaylist");
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
| **playlistProperties** | [**PlaylistProperties**](PlaylistProperties.md)|  | |

### Return type

[**Playlist**](Playlist.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Playlist Created |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

<a id="deletePlaylistById"></a>
# **deletePlaylistById**
> deletePlaylistById(playlistId)

Delete a playlist

Delete a playlist.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "{{playlistId}}"; // String | Id of the playlist
    try {
      apiInstance.deletePlaylistById(playlistId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#deletePlaylistById");
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
| **playlistId** | **String**| Id of the playlist | |

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
| **204** | Playlist Deleted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getPlaylistById"></a>
# **getPlaylistById**
> Playlist getPlaylistById(playlistId)

Retun a single playlist

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "{{playlistId}}"; // String | Id of the playlist
    try {
      Playlist result = apiInstance.getPlaylistById(playlistId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylistById");
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
| **playlistId** | **String**| Id of the playlist | |

### Return type

[**Playlist**](Playlist.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested playlist |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getPlaylists"></a>
# **getPlaylists**
> PlaylistList getPlaylists(limit, offset, search, sort)

List playlists

Return the list of playlist.  Return an empty list it there is no playlist to return.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    Integer limit = 56; // Integer | Number of elements to return (default=10)
    Integer offset = 56; // Integer | offset for pagination
    String search = "{{search}}"; // String | Keywords search in all indexed fields
    String sort = "ctime:asc"; // String | Sorting results
    try {
      PlaylistList result = apiInstance.getPlaylists(limit, offset, search, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#getPlaylists");
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

[**PlaylistList**](PlaylistList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of playlists |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

<a id="updatePlaylistById"></a>
# **updatePlaylistById**
> updatePlaylistById(playlistId, playlistProperties)

Update an existing playlist

Update a existing playlist.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.PlaylistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    PlaylistsApi apiInstance = new PlaylistsApi(defaultClient);
    String playlistId = "{{playlistId}}"; // String | Id of the playlist
    PlaylistProperties playlistProperties = new PlaylistProperties(); // PlaylistProperties | 
    try {
      apiInstance.updatePlaylistById(playlistId, playlistProperties);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlaylistsApi#updatePlaylistById");
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
| **playlistId** | **String**| Id of the playlist | |
| **playlistProperties** | [**PlaylistProperties**](PlaylistProperties.md)|  | |

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

