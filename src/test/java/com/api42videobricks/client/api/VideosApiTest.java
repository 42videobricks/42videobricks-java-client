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


package com.api42videobricks.client.api;

import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.models.Error;
import java.io.File;
import com.api42videobricks.client.models.Video;
import com.api42videobricks.client.models.VideoAttachmentList;
import com.api42videobricks.client.models.VideoList;
import com.api42videobricks.client.models.VideoMultipartUploadFinalize;
import com.api42videobricks.client.models.VideoMultipartUploadInit;
import com.api42videobricks.client.models.VideoMultipartUploadInitResponse;
import com.api42videobricks.client.models.VideoProperties;
import com.api42videobricks.client.models.VideoStatus;
import com.api42videobricks.client.models.VideoUploadInitResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosApi
 */
@Disabled
public class VideosApiTest {

    private final VideosApi api = new VideosApi();

    /**
     * Upload an attachement
     *
     * Upload an attachement file and attached it to a video Currently: - attachement file type is limited to \&quot;subtitle\&quot; and \&quot;caption\&quot; (close caption) - supported file types: SRT (text/plain), VTT (text/vtt)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAttachmentByVideoIdTest() throws ApiException {
        String videoId = null;
        String attachmentType = null;
        String locale = null;
        File _file = null;
        api.addAttachmentByVideoId(videoId, attachmentType, locale, _file);
        // TODO: test validations
    }

    /**
     * Upload a thumbnail
     *
     * Upload an image file and set it as Thumbnail to the video
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addThumbnailByVideoIdTest() throws ApiException {
        String videoId = null;
        File _file = null;
        api.addThumbnailByVideoId(videoId, _file);
        // TODO: test validations
    }

    /**
     * Add a new video
     *
     * You can create a video object by using this endpoint.  Once the video is created you can then upload the video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addVideoTest() throws ApiException {
        VideoProperties videoProperties = null;
        Video response = api.addVideo(videoProperties);
        // TODO: test validations
    }

    /**
     * Delete an attachment
     *
     * Delete an attachment (and the attached file)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAttachmentByVideoIdTest() throws ApiException {
        String videoId = null;
        String attachmentType = null;
        String locale = null;
        api.deleteAttachmentByVideoId(videoId, attachmentType, locale);
        // TODO: test validations
    }

    /**
     * Delete a thumbnail
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteThumbnailByVideoIdTest() throws ApiException {
        String videoId = null;
        api.deleteThumbnailByVideoId(videoId);
        // TODO: test validations
    }

    /**
     * Delete a video
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVideoByIdTest() throws ApiException {
        String videoId = null;
        api.deleteVideoById(videoId);
        // TODO: test validations
    }

    /**
     * Multipart upload finalization
     *
     * Once video parts are uploaded, finalize the upload by requesting to transcode the file.  New video file is replacing previous video file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void finalizeMultipartUploadVideoByIdTest() throws ApiException {
        String videoId = null;
        VideoMultipartUploadFinalize videoMultipartUploadFinalize = null;
        api.finalizeMultipartUploadVideoById(videoId, videoMultipartUploadFinalize);
        // TODO: test validations
    }

    /**
     * Single file upload finalization
     *
     * Once video file is uploaded, finalize the upload by requesting to transcode the file. Finalize apply to the last signedurl provided by the upload initialization.  New video file is replacing previous video file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void finalizeUploadVideoByIdTest() throws ApiException {
        String videoId = null;
        api.finalizeUploadVideoById(videoId);
        // TODO: test validations
    }

    /**
     * Get the attachment
     *
     * Get a video attachement object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttachmentByVideoIdTest() throws ApiException {
        String videoId = null;
        String attachmentType = null;
        String locale = null;
        api.getAttachmentByVideoId(videoId, attachmentType, locale);
        // TODO: test validations
    }

    /**
     * Get attachement file
     *
     * Get the attachement file Currently only text/plain files are handled.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttachmentFileByVideoIdTest() throws ApiException {
        String videoId = null;
        String attachmentType = null;
        String locale = null;
        api.getAttachmentFileByVideoId(videoId, attachmentType, locale);
        // TODO: test validations
    }

    /**
     * List of attachments
     *
     * Return a list of attachments to a videos
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttachmentsByVideoIdTest() throws ApiException {
        String videoId = null;
        String attachmentType = null;
        String locale = null;
        Integer limit = null;
        Integer offset = null;
        VideoAttachmentList response = api.getAttachmentsByVideoId(videoId, attachmentType, locale, limit, offset);
        // TODO: test validations
    }

    /**
     * Retun a single video
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVideoByIdTest() throws ApiException {
        String videoId = null;
        Boolean token = null;
        Video response = api.getVideoById(videoId, token);
        // TODO: test validations
    }

    /**
     * Retun the detailed status of the video
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVideoStatusByIdTest() throws ApiException {
        String videoId = null;
        VideoStatus response = api.getVideoStatusById(videoId);
        // TODO: test validations
    }

    /**
     * List videos
     *
     * Return the list of videos.  Return an empty list it there is no video to return.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVideosTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        String search = null;
        String sort = null;
        VideoList response = api.getVideos(limit, offset, search, sort);
        // TODO: test validations
    }

    /**
     * Multipart upload intialization
     *
     * Get signed urls to upload a big file split in multiparts Once the video is uploaded, do not forget to call the multipart upload finalize  New video file is replacing previous video file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initMultipartUploadVideoByIdTest() throws ApiException {
        String videoId = null;
        VideoMultipartUploadInit videoMultipartUploadInit = null;
        VideoMultipartUploadInitResponse response = api.initMultipartUploadVideoById(videoId, videoMultipartUploadInit);
        // TODO: test validations
    }

    /**
     * Single file upload intialization
     *
     * Get a single signed url to upload a file Once the video is uploaded, do not forget to call the single upload finalize  File formats currently supported: avi, mov, mp4, mpeg, mpg, mxf, ts. New video file is replacing previous video file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void initUploadVideoByIdTest() throws ApiException {
        String videoId = null;
        VideoUploadInitResponse response = api.initUploadVideoById(videoId);
        // TODO: test validations
    }

    /**
     * Update an existing video
     *
     * Update video properties  Only properties provided are updated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVideoByIdTest() throws ApiException {
        String videoId = null;
        VideoProperties videoProperties = null;
        api.updateVideoById(videoId, videoProperties);
        // TODO: test validations
    }

}
