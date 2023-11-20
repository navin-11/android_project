package com.abyantra.product.trip_2.Model.restclient;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by narayanb on 02-Jun-17.
 */

public class MessengerRestClient extends RestClient {
    private static final String TAG = MessengerRestClient.class.getSimpleName() + "--->";

    //ta2 server
    static final String BASE_URL_REST = "http://172.104.56.206:9062/#/header/createTask";

    public static Gson gson = new GsonBuilder()
            //       .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ") //faced problem with TZ 05:30
            //.registerTypeAdapter(Date.class, new Iso8601DateAdapter())
            .create();

    @SuppressWarnings("unused")
    private MessengerRestClient() {
    }

    private MessengerRestClient(String url, Gson gsonBuilder) {
        initRetrofit(url, gsonBuilder);
    }

    public static MessengerRestClient Get() {
        /*clientObj = null;
        clientObj = new MessengerRestClient(BASE_URL_REST, gson);*/
        return new MessengerRestClient(BASE_URL_REST, gson);
    }

    //private static MessengerRestClient clientObj = null;


}
