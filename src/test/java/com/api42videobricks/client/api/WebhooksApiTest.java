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


package com.api42videobricks.client.api;

import com.api42videobricks.client.ApiException;
import com.api42videobricks.client.models.Error;
import com.api42videobricks.client.models.Webhook;
import com.api42videobricks.client.models.WebhookList;
import com.api42videobricks.client.models.WebhookProperties;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Add a new webhook
     *
     * Create a new webhook to configure notification.  Only one hook per url
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addWebhookTest() throws ApiException {
        WebhookProperties webhookProperties = null;
        Webhook response = api.addWebhook(webhookProperties);
        // TODO: test validations
    }

    /**
     * Delete a webhook
     *
     * Delete a webhook.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookByIdTest() throws ApiException {
        String webhookId = null;
        api.deleteWebhookById(webhookId);
        // TODO: test validations
    }

    /**
     * Retun a single webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhookByIdTest() throws ApiException {
        String webhookId = null;
        Webhook response = api.getWebhookById(webhookId);
        // TODO: test validations
    }

    /**
     * List webhooks
     *
     * Return the list of webhooks.  Return an empty list it there are no webhook to return.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWebhooksTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        WebhookList response = api.getWebhooks(limit, offset);
        // TODO: test validations
    }

    /**
     * Update an existing webhook
     *
     * Update a existing webhooks.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateWebhookByIdTest() throws ApiException {
        String webhookId = null;
        WebhookProperties webhookProperties = null;
        Webhook response = api.updateWebhookById(webhookId, webhookProperties);
        // TODO: test validations
    }

}
