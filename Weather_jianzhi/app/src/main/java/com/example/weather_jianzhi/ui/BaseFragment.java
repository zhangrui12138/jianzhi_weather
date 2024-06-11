package com.example.weather_jianzhi.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.weather_jianzhi.R;
import com.example.weather_jianzhi.bean.AlertBean;
import com.example.weather_jianzhi.bean.ForcastBean;
import com.example.weather_jianzhi.bean.GsonBean;
import com.example.weather_jianzhi.bean.HforcastBean;
import com.example.weather_jianzhi.bean.ResultBean;
import com.example.weather_jianzhi.util.LoggerUtil;

import java.util.List;

public class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mCitys = getActivity().getResources().getStringArray(R.array.weather_list);
        if(loggerUtil == null){
            loggerUtil = new LoggerUtil();
        }
        View view = inflater.inflate(R.layout.tianqi_item,container,false);
        if(gsonBean != null && gsonBean.getResult() != null){
            mResultBean = gsonBean.getResult();
            LinearLayout weather_bg = view.findViewById(R.id.weather_bg);
            TextView textView = (TextView) view.findViewById(R.id.city);
            TextView current_temperature = (TextView) view.findViewById(R.id.current_temperature);
            TextView temp_msg = (TextView) view.findViewById(R.id.temp_msg);
            LinearLayout mForcastBean = (LinearLayout) view.findViewById(R.id.mForcastBean);
            LinearLayout mFFHorcastBean = (LinearLayout) view.findViewById(R.id.mFFHorcastBean);
            textView.setText(mResultBean.getCity_name());
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog();
                }
            });
            current_temperature.setText(mResultBean.getCurrent_temperature()+"℃");
            temp_msg.setText(mResultBean.getCurrent_condition()+" "
                    +mResultBean.getDat_low_temperature()+" / "
                    +mResultBean.getDat_high_temperature()+" "
                    +getResources().getString(R.string.quality_level)
                    +mResultBean.getQuality_level()+" "
                    +mResultBean.getDay_condition());
            int weather_bg_resid = -1;
            if(mResultBean.getDay_condition() != null){
                if(mResultBean.getDay_condition().contains("雨")){
                    weather_bg_resid = R.drawable.rain;
                }else if(mResultBean.getDay_condition().contains("晴")){
                    weather_bg_resid = R.drawable.sun;
                }else if(mResultBean.getDay_condition().contains("雪")){
                    weather_bg_resid = R.drawable.snow;
                }else if(mResultBean.getDay_condition().contains("雷")){
                    weather_bg_resid = R.drawable.thunder;
                }else if(mResultBean.getDay_condition().contains("云")){
                    weather_bg_resid = R.drawable.duoyun1;
                }else if(mResultBean.getDay_condition().contains("雾")){
                    weather_bg_resid = R.drawable.wuqi;
                }
            }
            if(weather_bg_resid != -1) weather_bg.setBackgroundResource(weather_bg_resid);
            LinearLayout.LayoutParams linear_hour_item = new LinearLayout.LayoutParams(
                    (mWidth/5),LinearLayout.LayoutParams.MATCH_PARENT);
            linear_hour_item.gravity = Gravity.CENTER;
            for(HforcastBean hforcastBean : mResultBean.getHourly_forecast()){
                View viewer = LayoutInflater.from(getContext()).inflate(R.layout.tianqi_hour_item,null);
                TextView weather_date = viewer.findViewById(R.id.weather_date);
                TextView weather_temp_lower = viewer.findViewById(R.id.weather_temp_lower);
                TextView weather_temp_higher = viewer.findViewById(R.id.weather_temp_higher);
                MyImageView gifImageView = (MyImageView) viewer.findViewById(R.id.iv_gif);
                weather_date.setText(hforcastBean.getHour()+":00");
                weather_temp_lower.setText(hforcastBean.getTemperature()+"℃");
                weather_temp_higher.setText(hforcastBean.getCondition());
                gifImageView.setImageResource(hforcastBean.getCondition());
                mForcastBean.addView(viewer,linear_hour_item);
            }
            LinearLayout.LayoutParams linear_forast_item = new LinearLayout.LayoutParams(mWidth,120);
            for(ForcastBean forcastBean:mResultBean.getForecast_list()){
                View viewer_forcast = LayoutInflater.from(getContext()).inflate(R.layout.tianqi_forcast_item,null);
                TextView date = viewer_forcast.findViewById(R.id.date);
                TextView condition = viewer_forcast.findViewById(R.id.condition);
                TextView temperature = viewer_forcast.findViewById(R.id.temperature);
                TextView wind_direction = viewer_forcast.findViewById(R.id.wind_direction);
                date.setText(forcastBean.getDate());
                condition.setText(forcastBean.getCondition());
                temperature.setText(forcastBean.getLow_temperature()+"℃/"+forcastBean.getHigh_temperature()+"℃");
                wind_direction.setText(forcastBean.getWind_direction());
                mFFHorcastBean.addView(viewer_forcast,linear_forast_item);
            }
            TextView alerts = (TextView) view.findViewById(R.id.alerts);
            List<AlertBean> alertBeans = mResultBean.getAlert();
            if(alertBeans != null) {
                alerts.setVisibility(View.VISIBLE);
                for (AlertBean customAlertbean : alertBeans) {
                    mCityMessagerTitle += (customAlertbean.getTitle()
                            + "\n" + customAlertbean.getPub_time()+ "\n");
                    mCityMessager += (customAlertbean.getTitle()
                            + "\n" + customAlertbean.getPub_time()
                            + "\n" + customAlertbean.getContent()+"\n");
                }
                alerts.setText(mCityMessagerTitle);
                alerts.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            showAlertsDialog(mCityMessager);
                        }
                });
            }else{
                alerts.setVisibility(View.GONE);
            }
            TextView alertContext0 = (TextView) view.findViewById(R.id.alertContext0);
            TextView alertContext1 = (TextView) view.findViewById(R.id.alertContext1);
            alertContext0.setText(mResultBean.getQuality_level()+" "+mResultBean.getAqi());
            alertContext1.setText(mResultBean.getTips());
        }
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        loggerUtil.debug("onDestroyView==============");
        mCityMessager = "";
        mCityMessagerTitle = "";
    }

    private LoggerUtil loggerUtil;
    private String mCityMessager = "";
    private String mCityMessagerTitle = "";
    private GsonBean gsonBean;
    private ResultBean mResultBean;
    private int mWidth = 0;
    private int mHeight = 0;
    public BaseFragment(GsonBean gsonBean,int mWidth,int mHeight) {
        this.gsonBean = gsonBean;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    private AlertDialog.Builder cityDialog;
    private String[] mCitys;

    private int position = -1;
    private void showDialog(){
        if(cityDialog == null){
            cityDialog = new AlertDialog.Builder(getContext());
            cityDialog.setTitle("城市选择");
            cityDialog.create();
        }
        cityDialog.setSingleChoiceItems(mCitys, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                position = i;
            }
        });
        cityDialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(position != -1) ((BaseActivity)getActivity()).addCityWeather(mCitys[position]);
            }
        });
        cityDialog.show();
    }

    private AlertDialog.Builder alertDialog;
    private void showAlertsDialog(String message){
        if(alertDialog == null){
            alertDialog = new AlertDialog.Builder(getContext());
            alertDialog.setTitle(null);
            alertDialog.create();
        }
        alertDialog.setMessage(message);
        alertDialog.show();
    }

}
