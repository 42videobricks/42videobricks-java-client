# WebhooksApi

All URIs are relative to *https://api-sbx.42videobricks.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addWebhook**](WebhooksApi.md#addWebhook) | **POST** /webhooks | Add a new webhook |
| [**deleteWebhookById**](WebhooksApi.md#deleteWebhookById) | **DELETE** /webhooks/{webhookId} | Delete a webhook |
| [**getWebhookById**](WebhooksApi.md#getWebhookById) | **GET** /webhooks/{webhookId} | Retun a single webhook |
| [**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /webhooks | List webhooks |
| [**updateWebhookById**](WebhooksApi.md#updateWebhookById) | **PUT** /webhooks/{webhookId} | Update an existing webhook |


<a id="addWebhook"></a>
# **addWebhook**
> Webhook addWebhook(webhookProperties)

Add a new webhook

Create a new webhook to configure notification.  Only one hook per url

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    WebhookProperties webhookProperties = new WebhookProperties(); // WebhookProperties | 
    try {
      Webhook result = apiInstance.addWebhook(webhookProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#addWebhook");
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
| **webhookProperties** | [**WebhookProperties**](WebhookProperties.md)|  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Webhook Created |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteWebhookById"></a>
# **deleteWebhookById**
> deleteWebhookById(webhookId)

Delete a webhook

Delete a webhook.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "{{webhookId}}"; // String | Id of the webhook
    try {
      apiInstance.deleteWebhookById(webhookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#deleteWebhookById");
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
| **webhookId** | **String**| Id of the webhook | |

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
| **204** | Webhook Deleted |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getWebhookById"></a>
# **getWebhookById**
> Webhook getWebhookById(webhookId)

Retun a single webhook

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "{{webhookId}}"; // String | Id of the webhook
    try {
      Webhook result = apiInstance.getWebhookById(webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhookById");
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
| **webhookId** | **String**| Id of the webhook | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Requested webhook |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getWebhooks"></a>
# **getWebhooks**
> WebhookList getWebhooks(limit, offset)

List webhooks

Return the list of webhooks.  Return an empty list it there are no webhook to return.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer limit = 56; // Integer | Number of elements to return (default=10)
    Integer offset = 56; // Integer | offset for pagination
    try {
      WebhookList result = apiInstance.getWebhooks(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#getWebhooks");
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

### Return type

[**WebhookList**](WebhookList.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of webhooks |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateWebhookById"></a>
# **updateWebhookById**
> Webhook updateWebhookById(webhookId, webhookProperties)

Update an existing webhook

Update a existing webhooks.

### Example
```java
// Import classes:
import com.api42videobricks.client.ApiClient;
import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.Configuration;
import com.api42videobricks.client.auth.*;
import com.api42videobricks.client.models.*;
import com.api42videobricks.client.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-sbx.42videobricks.com");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    String webhookId = "{{webhookId}}"; // String | Id of the webhook
    WebhookProperties webhookProperties = new WebhookProperties(); // WebhookProperties | 
    try {
      Webhook result = apiInstance.updateWebhookById(webhookId, webhookProperties);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#updateWebhookById");
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
| **webhookId** | **String**| Id of the webhook | |
| **webhookProperties** | [**WebhookProperties**](WebhookProperties.md)|  | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook Updated |  -  |
| **400** | The request is invalid or incomplete |  -  |
| **404** | The specified resource was not found |  -  |
| **500** | Internal Server Error |  -  |

