package com.example.weather_jianzhi.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.weather_jianzhi.Const;
import com.example.weather_jianzhi.R;
import com.example.weather_jianzhi.bean.GsonBean;
import com.example.weather_jianzhi.network.NetworkManager;
import com.example.weather_jianzhi.util.LoggerUtil;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends FragmentActivity implements NetworkManager.getCallBacker {
    private ViewPager viewpager;
    private BaseFragmentAdapter adapter;
    private NetworkManager mNetworkManager;
    private LoggerUtil mLoggerUtil;
    private String currentCity = "深圳";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        mNetworkManager = new NetworkManager(Const.BaseUrl,this);
        mNetworkManager.toNetwork(currentCity);
        if(mLoggerUtil == null){
            mLoggerUtil = new LoggerUtil();
        }
    }
    private int mWidth = 0;
    private int mHeight = 0;
    private List<GsonBean> mGsonBean = new ArrayList<GsonBean>();
    private void getWH(){
        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        mWidth = wm.getDefaultDisplay().getWidth();
        mHeight = wm.getDefaultDisplay().getHeight();
        mLoggerUtil.debug("mWidth="+mWidth+"////mHeight="+mHeight);
    }

    @Override
    public void onRequestComplete(GsonBean gsonBean) {
        mLoggerUtil.debug("gsonBean="+gsonBean.toString());
        mGsonBean.add(gsonBean);
        removeDuplicate(mGsonBean);
        if(gsonBean != null && mGsonBean != null && mGsonBean.size() != 0){
            refresh(mGsonBean);
        }
    }

    private static void removeDuplicate(List<GsonBean> mGsonBean){
        List<GsonBean> result=new ArrayList<GsonBean>(mGsonBean.size());
        for(GsonBean str:mGsonBean){
            if(!result.toString().contains(str.toString())){
                result.add(str);
            }
        }
        mGsonBean.clear();
        mGsonBean.addAll(result);
        if(result != null){
            result.clear();
            result = null;
        }
    }

    private void refresh(List<GsonBean> mGsonBean){
        getWH();
        List<Fragment> fragments = new ArrayList<Fragment>();
        for(GsonBean temp : mGsonBean){
            Fragment fragment1 = new BaseFragment(temp,mWidth,mHeight);
            fragments.add(fragment1);
        }
        adapter = new BaseFragmentAdapter(getSupportFragmentManager(),fragments);
        viewpager.setAdapter(adapter);
    }

    public void addCityWeather(String currentCity){
        if(mNetworkManager != null){
               mNetworkManager.toNetwork(currentCity);
        }
    }
}
