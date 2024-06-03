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
        if(loggerUtil == null){
            loggerUtil = new LoggerUtil();
        }
        View view = inflater.inflate(R.layout.tianqi_item,container,false);
        if(gsonBean != null && gsonBean.getResult() != null){
            TextView textView = (TextView) view.findViewById(R.id.city);
            TextView current_temperature = (TextView) view.findViewById(R.id.current_temperature);
            TextView temp_msg = (TextView) view.findViewById(R.id.temp_msg);
            LinearLayout mForcastBean = (LinearLayout) view.findViewById(R.id.mForcastBean);
            LinearLayout mFFHorcastBean = (LinearLayout) view.findViewById(R.id.mFFHorcastBean);
            textView.setText(gsonBean.getResult().getCity_name());
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showDialog();
                }
            });
            current_temperature.setText(gsonBean.getResult().getCurrent_temperature()+"℃");
            temp_msg.setText(gsonBean.getResult().getCurrent_condition()+" "
                    +gsonBean.getResult().getDat_low_temperature()+" / "
                    +gsonBean.getResult().getDat_high_temperature()+" "
                    +getResources().getString(R.string.quality_level)
                    +gsonBean.getResult().getQuality_level()+" "
                    +gsonBean.getResult().getDay_condition());
            LinearLayout.LayoutParams linear_hour_item = new LinearLayout.LayoutParams(
                    (mWidth/5),LinearLayout.LayoutParams.WRAP_CONTENT);
            linear_hour_item.gravity = Gravity.CENTER;
            for(HforcastBean hforcastBean : gsonBean.getResult().getHourly_forecast()){
                View viewer = LayoutInflater.from(getContext()).inflate(R.layout.tianqi_hour_item,null);
                TextView weather_date = viewer.findViewById(R.id.weather_date);
                TextView weather_temp_lower = viewer.findViewById(R.id.weather_temp_lower);
                TextView weather_temp_higher = viewer.findViewById(R.id.weather_temp_higher);
                weather_date.setText(hforcastBean.getHour()+":00");
                weather_temp_lower.setText(hforcastBean.getTemperature()+"℃");
                weather_temp_higher.setText(hforcastBean.getCondition());
                mForcastBean.addView(viewer,linear_hour_item);
            }
            LinearLayout.LayoutParams linear_forast_item = new LinearLayout.LayoutParams(mWidth,120);
            for(ForcastBean forcastBean:gsonBean.getResult().getForecast_list()){
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
            ResultBean resultBean = gsonBean.getResult();
            LinearLayout alerts = (LinearLayout) view.findViewById(R.id.alerts);
            if(resultBean != null){
                List<AlertBean> alertBeans = resultBean.getAlert();
                if(alertBeans != null) {
                    alerts.setVisibility(View.VISIBLE);
                    for (AlertBean customAlertbean : alertBeans) {
                        TextView mTextView = new TextView(getActivity());
                        mTextView.setGravity(Gravity.CENTER_HORIZONTAL);
                        mTextView.setText(customAlertbean.getTitle()
                                + "\n" + customAlertbean.getPub_time());
                        mCityMessager += customAlertbean.getTitle()
                                + "\n" + customAlertbean.getPub_time()
                                + "\n" + customAlertbean.getContent()+"\n";
                        alerts.addView(mTextView);
                    }
                    alerts.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            showAlertsDialog(mCityMessager);
                        }
                    });
                }else{
                    alerts.setVisibility(View.GONE);
                }
            }
        }
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        loggerUtil.debug("onDestroyView==============");
        mCityMessager = "";
    }

    private LoggerUtil loggerUtil;
    private String mCityMessager = "";
    private GsonBean gsonBean;
    private int mWidth = 0;
    private int mHeight = 0;
    public BaseFragment(GsonBean gsonBean,int mWidth,int mHeight) {
        this.gsonBean = gsonBean;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    private AlertDialog.Builder cityDialog;
    private String[] mCitys = new String[]{
    "深圳","沈阳","安庆","鞍山","安阳","阿坝州","安顺","阿克苏","阿勒泰","北京","保定","包头",
    "成都","长沙","长春","沧州","常州","滁州","巢湖","承德","赤峰","大连","东莞","大庆","丹东","大同",
    "鄂尔多斯","恩施","福州","阜阳","抚顺","抚州","广州","贵阳","桂林","赣州","甘南州","甘孜州","果洛州",
    "杭州","合肥","哈尔滨","海口","呼和浩特","衡水","邯郸","菏泽","黄石","黄冈","怀化","汉中","济南","江门",
    "济宁","吉林市","锦州","晋城","晋中","景德镇","荆门","荆州","南京","宁波","南宁","南昌","乌海",
    "昆明","开封","兰州","洛阳","临汾","廊坊","乐山","凉山州","聊城","辽阳","绵阳","马鞍山","牡丹江",
    "莆田","盘锦","青岛","秦皇岛","齐齐哈尔","日照","上海","石家庄","苏州","三亚","汕头","蚌埠","本溪",
    "天津","太原","唐山","武汉","无锡","乌鲁木齐","威海","芜湖","潍坊","温州","文山","梧州","吴忠","五家渠",
    "西安","西宁","徐州","邢台","孝感","忻州","兴安盟","新余","许昌","锡林郭勒盟","仙桃","兴化","襄阳",
    "烟台","延边朝鲜族","宜昌","银川","运城","岳阳","益阳","扬州","鹰潭","宜宾","玉林","伊犁哈萨克","玉溪","雅安",
    "郑州","张家口","镇江","漳州","枣庄","中山","珠海","长治","肇庆","湛江","自贡","资阳","攀枝花","张家界","泸州","淄博",
    "达州","德阳","德州","滨州","白城","白山","巴彦淖尔","巴音郭楞州","博尔塔拉州","白银","宝鸡","保山","重庆","信阳"};

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
