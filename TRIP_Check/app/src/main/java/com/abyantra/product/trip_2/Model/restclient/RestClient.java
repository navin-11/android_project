package com.abyantra.product.trip_2.Model.restclient;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by narayanb on 22-May-17.
 */

public class RestClient {
    private static final String TAG = RestClient.class.getSimpleName() + "--->";
    protected void initRetrofit(String url, Gson gsonBuilder) {
        if (builder == null) {
            builder = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create(gsonBuilder));
        }
        if (retrofit == null) {
            if (!httpClient.interceptors().contains(logging)) {
                httpClient.addInterceptor(logging);
                builder.client(httpClient.build());
            }
            retrofit = builder.build();
        }
    }

    protected void initRetrofitMedia (String url, Gson gsonBuilder) {
    //To increase connection time out limit for response from server when huge files are sent over HTTPClient
        // medium.com/programming-lite/retrofit-2-handling-some-cases-4f4c8e09f5a2

        httpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(false);

        if (builder == null) {
            builder = new Retrofit.Builder()
                    .baseUrl(url)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create(gsonBuilder));
        }
        if (retrofit == null) {
            if (!httpClient.interceptors().contains(logging)) {
                httpClient.addInterceptor(logging);
                builder.client(httpClient.build());
            }
            retrofit = builder.build();
        }
    }

    Retrofit.Builder builder = null;
    Retrofit retrofit = null;

    private HttpLoggingInterceptor logging =
            new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.NONE);

    private OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder().retryOnConnectionFailure(false);

    public <S> S createService(
            Class<S> serviceClass) {
        /*if (retrofit == null) {
            retrofit = builder.build();
        }
        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
            builder.client(httpClient.build());
            retrofit = builder.build();
        }*/

        if (retrofit == null) {
            if (!httpClient.interceptors().contains(logging)) {
                httpClient.addInterceptor(logging);
                builder.client(httpClient.build());
            }
            retrofit = builder.build();
        }

        return retrofit.create(serviceClass);
    }

}
