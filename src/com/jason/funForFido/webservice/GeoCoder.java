package com.jason.funForFido.webservice;

/**
 * @author jjjasonm
 *         Created on 5/10/16.
 *
 *  /
 *
 */
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class GeoCoder {

    private final Logger log = Logger.getLogger(this.getClass());

    private Gson gson = new Gson();

    private volatile long lastRequest = 0L;

    public GeocodeResponse getLocation(String... addressElements) throws JsonSyntaxException, JsonIOException, MalformedURLException,
            IOException {
        StringBuilder sb = new StringBuilder();
        for (String string : addressElements) {
            if (sb.length() > 0) {
                sb.append('+');
            }
            sb.append(URLEncoder.encode(string.replace(' ', '+'), "UTF-8"));
        }
        String url = "http://maps.googleapis.com/maps/api/geocode/json?sensor=false&address=" + sb.toString();
        // Google limits this web service to 2500/day and 10 requests/s
        synchronized (this) {
            try {
                long elapsed = System.currentTimeMillis() - lastRequest;
                if (elapsed < 100) {
                    try {
                        Thread.sleep(100 - elapsed);
                    } catch (InterruptedException e) {
                    }
                }
                return gson.fromJson(new BufferedReader(new InputStreamReader(new URL(url).openStream())), GeocodeResponse.class);
            } finally {
                lastRequest = System.currentTimeMillis();
            }
        }
    }
}

