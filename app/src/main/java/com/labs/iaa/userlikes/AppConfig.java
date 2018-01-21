package com.labs.iaa.userlikes;

import com.google.gson.JsonElement;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;

public class AppConfig {

    public interface post_submit {
        @FormUrlEncoded
        @POST("/userlikes")
        void post_likes(
                @Field("name") String name,
                @Field("likes") String likes,
                Callback<Response> callback);
    }

    public interface get_submit {
        @GET("/userlikes")
        void get_likes(Callback<JsonElement> callback);


    }

    public interface led {
        @FormUrlEncoded
        @PUT("/led_data/58e6eee3f36d2834e13a1bca")
        void ledData(
                @Field("token") String token,
                @Field("led") Boolean led,
                Callback<Response> callback);
    }
}

