package com.jason.funForFido.webservice;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.io.IOException;
import java.net.URISyntaxException;


/**
 * @author jjjasonm
 *         Created on 4/28/16.
 */
public class GooglePlacesClient
{
    private static final String GOOGLE_API_KEY  = "";

    //private final HttpClient client = new HttpClient();

    public static void main(final String[] args) throws ParseException, IOException, URISyntaxException
    {
        new GooglePlacesClient().performSearch("dog park", 8.6668310, 50.1093060);
    }

    public void performSearch(final String types, final double lon, final double lat) throws ParseException, IOException, URISyntaxException
    {
//        final URIBuilder builder = new URIBuilder().setScheme("https").setHost("maps.googleapis.com").setPath("/maps/api/place/search/json");
//
//        builder.addParameter("location", lat + "," + lon);
//        builder.addParameter("radius", "5");
//        builder.addParameter("types", types);
//        builder.addParameter("sensor", "true");
//        builder.addParameter("key", GooglePlacesClient.GOOGLE_API_KEY);
//
//        final HttpUriRequest request = new HttpGet(builder.build());
//
//        final HttpResponse execute = this.client.execute(request);

//        final String response = EntityUtils.toString(execute.getEntity());

        //System.out.println(response);
    }

}