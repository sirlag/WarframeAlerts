package me.sirlag.WarframeAlerts;

import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;

/**
 * @author Pieter Knickerbocker
 * @since 04/25/2015 21:45EST
 * Class to connect via HTTP and access website RSS feed, and modify it appropriately.
 */
final class WebInterface {
    private String url;
    private HttpEntity entity;
    //Put some variables here (InputStream, et cetera)
    WebInterface(String s) { url = s; }

    private InputStream getInputStream() throws IOException {
        HttpClient httpClient = HttpClientBuilder.create()
                .setUserAgent("https://github.com/sirlag/WarframeAlerts")
                .setMaxConnPerRoute(4)
                .build();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGet);
        entity = response.getEntity();
        return entity.getContent();
    }
    private String getStringFromInputStream() throws IOException {
        Charset charSet = Charset.forName(entity.getContentEncoding().toString());
        StringWriter writer = new StringWriter();
        IOUtils.copy(getInputStream(), writer, charSet);
        return writer.toString();
   }
    @Override
    public String toString() {
        try {
            return getStringFromInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

