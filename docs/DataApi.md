# DataApi

All URIs are relative to *https://api-sbx.42videobricks.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataVideoUsage**](DataApi.md#getDataVideoUsage) | **GET** /data/videos/usage | List Video Usage KPIs |


<a id="getDataVideoUsage"></a>
# **getDataVideoUsage**
> DataVideoUsageList getDataVideoUsage(limit, offset, interval, startDate, endDate)

List Video Usage KPIs

Return the usage of the platform ressources.  By default, it returns monthly usage but unit (dayly|week|month) can be defined. For current period, usage is calculated until current time. Start and end dates can be also optionaly defined to filter results.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.DataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    DataApi apiInstance = new DataApi(defaultClient);
    Integer limit = 56; // Integer | Number of elements to return (default=10)
    Integer offset = 56; // Integer | offset for pagination
    String interval = "day"; // String | Period unit (day|week|month)
    String startDate = "{{starDate}}"; // String | Start date for the period
    String endDate = "{{endDate}}"; // String | End date for the period
    try {
      DataVideoUsageList result = apiInstance.getDataVideoUsage(limit, offset, interval, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataApi#getDataVideoUsage");
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
| **interval** | **String**| Period unit (day|week|month) | [optional] [enum: day, week, month] |
| **startDate** | **String**| Start date for the period | [optional] |
| **endDate** | **String**| End date for the period | [optional] |

### Return type

[**DataVideoUsageList**](DataVideoUsageList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of monthly usage KPIs |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

