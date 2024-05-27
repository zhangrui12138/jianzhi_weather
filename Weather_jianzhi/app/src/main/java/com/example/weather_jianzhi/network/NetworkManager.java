package com.example.weather_jianzhi.network;

import com.example.weather_jianzhi.bean.GsonBean;
import com.example.weather_jianzhi.util.LoggerUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkManager {
    private Retrofit mRetrofit;
    private Gson mgson;
    private IGsonBeanService iGsonBeanService;
    public NetworkManager(String baseUrl,getCallBacker getCallBacker) {
        if(mgson == null){
            mgson = new GsonBuilder()
                    .setLenient()
                    .create();
        }
        if(mRetrofit == null){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create(mgson))
                    .build();
        }
        if(iGsonBeanService == null){
            iGsonBeanService = mRetrofit.create(IGsonBeanService.class);
        }
        this.callback = getCallBacker;
    }

    private Call<GsonBean> mCall;
    private LoggerUtil mLoggerUtil;
    public void toNetwork(String cityName){
        if(mCall != null){
            mCall.cancel();
            mCall = null;
        }
         if(mCall == null){
             mCall = iGsonBeanService.getUser(cityName);
         }
         if(mLoggerUtil == null){
             mLoggerUtil = new LoggerUtil();
         }
         mCall.enqueue(new Callback<GsonBean>() {
             @Override
             public void onResponse(Call<GsonBean> call, Response<GsonBean> response) {
                 mLoggerUtil.debug(call.request().toString());
                if(response.isSuccessful() && response.body() != null){
                    mLoggerUtil.debug(response.body().toString());
                    callback.onRequestComplete(response.body());
                }
             }

             @Override
             public void onFailure(Call<GsonBean> call, Throwable t) {

             }
         });
    }

    private getCallBacker callback;

    public interface getCallBacker{
        public void onRequestComplete(GsonBean gsonBean);
    }
}
