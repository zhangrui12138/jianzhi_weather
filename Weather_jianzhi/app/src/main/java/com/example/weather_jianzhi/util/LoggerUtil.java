package com.example.weather_jianzhi.util;

import android.util.Log;

import com.example.weather_jianzhi.Const;

public  class LoggerUtil {
    boolean isdebug = false;
    public void debug(String message){
       if(isdebug) Log.d(Const.TAG,"weather_jianzhi_Log:"+message);
    }
}
