

# Video

Video Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | title of the video |  [optional] |
|**description** | **String** | description of the video |  [optional] |
|**_public** | **Boolean** | Define if the video is public (it can be accessible by anybody with the video url). Default &#x3D; tue |  [optional] |
|**tags** | **List&lt;String&gt;** | tags list linked to video |  [optional] |
|**id** | **String** | id of the video (null when adding a new video) |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the video : * &#39;REQUESTED&#39;: video as been submited, waiting for its creation * &#39;CREATED&#39;: video has been created and file can be uploaded          * &#39;TRANSCODING&#39;: video is unvailable because still in the creation  &amp; in encoding process * &#39;TRANSCODING_ERROR&#39;: video is unvailable because the encoding failed  * &#39;AVAILABLE&#39;: video is ready to be stream |  [optional] |
|**duration** | **Integer** | video duration in second |  [optional] |
|**ctime** | **Integer** | Creation date (timestamp) |  [optional] |
|**mtime** | **Integer** | Modification date (timestamp) |  [optional] |
|**assets** | [**VideoAssets**](VideoAssets.md) |  |  [optional] |
|**metas** | **Map&lt;String, Object&gt;** | metas data  free-form object: refere to the documentation |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;REQUESTED&quot; |
| CREATED | &quot;CREATED&quot; |
| TRANSCODING | &quot;TRANSCODING&quot; |
| TRANSCODING_ERROR | &quot;TRANSCODING_ERROR&quot; |
| AVAILABLE | &quot;AVAILABLE&quot; |



