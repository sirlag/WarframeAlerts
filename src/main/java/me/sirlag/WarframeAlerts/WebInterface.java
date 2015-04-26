package me.sirlag.WarframeAlerts;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.InputStream;
import java.io.IOException;

/**
 * @author Pieter Knickerbocker
 * @since 04/25/2015 21:45EST
 * Class to connect via HTTP and access website RSS feed, and modify it appropriately.
 */
public final class WebInterface {
    private String url;

    public WebInterface(String s) {
        url = s;
    }

    private InputStream getInputStream() throws IOException {
        HttpClient httpClient = HttpClientBuilder.create()
                .setUserAgent("https://github.com/sirlag/WarframeAlerts")
                .setMaxConnPerRoute(4)
                .build();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();

        return entity.getContent();
    }
}

