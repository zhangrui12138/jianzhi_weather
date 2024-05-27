package com.example.weather_jianzhi.network;

import com.example.weather_jianzhi.bean.GsonBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IGsonBeanService {
    /**
     * GET请求
     */
    @GET("city_name")
    Call<GsonBean> getUser(@Query("city_name") String city_name);

    /**
     * POST请求
     */
    @FormUrlEncoded
    @POST("UserServlet")
    Call<GsonBean> postUser(@Field("name") String name, @Field("email") String email);
}
