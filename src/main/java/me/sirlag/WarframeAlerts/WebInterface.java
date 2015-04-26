package me.sirlag.WarframeAlerts;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

/**
 * @author Pieter Knickerbocker
 * @since 04/25/2015 21:45EST
 * Class to connect via HTTP and access website RSS feed, and modify it appropriately.
 */
public class WebInterface {
    private String url;

    public WebInterface(String s) {
        url = s;
    }

    public void getRawData() {
        HttpClient httpClient = HttpClientBuilder.create()
                .setUserAgent("https://github.com/sirlag/WarframeAlerts")
                .setMaxConnPerRoute(4)
                .build();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert response != null;
        HttpEntity entity = response.getEntity();
        System.out.println(ContentType.getOrDefault(entity));

        //Intended to return String later
    }
}

