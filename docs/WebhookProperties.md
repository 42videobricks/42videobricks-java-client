

# WebhookProperties

Webhook properties object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | Url of the application wich is receiving Notifications |  |
|**token** | **String** | Optionnal Secret token to validate notifications. Sent with the request in the X-Vpass-Token HTTP header. |  [optional] |
|**eventType** | [**Set&lt;EventTypeEnum&gt;**](#Set&lt;EventTypeEnum&gt;) | List of event to be notified:   * VIDEO_STATUS: Get Video object status modification notifications   Status values: REQUESTED, CREATED, TRANSCODING, TRANSCODING_ERROR, AVAILABLE, DELETED   * VIDEO_TRANSCODING_PROGRESS: Get transcoding progression notifications |  |



## Enum: Set&lt;EventTypeEnum&gt;

| Name | Value |
|---- | -----|
| STATUS | &quot;VIDEO_STATUS&quot; |
| TRANSCODING_PROGRESS | &quot;VIDEO_TRANSCODING_PROGRESS&quot; |



