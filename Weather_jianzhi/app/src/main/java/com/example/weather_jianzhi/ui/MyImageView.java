package com.example.weather_jianzhi.ui;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.example.weather_jianzhi.R;

import pl.droidsonroids.gif.GifImageView;


public class MyImageView extends GifImageView {
    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setImageResource(String type) {
        int resId = -1;

        switch (type){
            case "晴" :
                resId = R.drawable.qing;
                break;
            case "多云" :
                resId = R.drawable.duoyun;
                break;
            case "阴" :
                resId = R.drawable.yin;
                break;
            case "阵雨" :
                resId = R.drawable.zhenyu;
                break;
            case "雷阵雨" :
                resId = R.drawable.leizhenyu;
                break;
            case "冰雹" :
                resId = R.drawable.leizhenyujiabingbao;
                break;
            case "雷阵雨并伴有冰雹" :
                resId = R.drawable.leizhenyujiabingbao;
                break;
            case "雨加雪" :
                resId = R.drawable.yujiaxue;
                break;
            case "雨" :
                resId = R.drawable.xiaoyu;
                break;
            case "小雨" :
                resId = R.drawable.xiaoyu;
                break;
            case "中雨" :
                resId = R.drawable.zhongyu;
                break;
            case "大雨" :
                resId = R.drawable.dayu;
                break;
            case "暴雨" :
                resId = R.drawable.baoyu;
                break;
            case "大暴雨" :
                resId = R.drawable.dabaoyu;
                break;
            case "特大暴雨" :
                resId = R.drawable.tedabaoyu;
                break;
            case "阵雪" :
                resId = R.drawable.zhenxue;
                break;
            case "小雪" :
                resId = R.drawable.xiaoxue;
                break;
            case "中雪" :
                resId = R.drawable.zhongxue;
                break;
            case "大雪" :
                resId = R.drawable.daxue;
                break;
            case "暴雪" :
                resId = R.drawable.baoxue;
                break;
            case "雾" :
                resId = R.drawable.wu;
                break;
            case "冻雨" :
                resId = R.drawable.dongyu;
                break;
            case "沙尘暴" :
                resId = R.drawable.shachenbao;
                break;
            case "小雨转中雨" :
                resId = R.drawable.xiaoyuzhuanzhongyu;
                break;
            case "中雨转大雨" :
                resId = R.drawable.xiaoyuzhuanzhongyu;
                break;
            case "大雨转暴雨" :
                resId = R.drawable.dayuzhuanbaoyu;
                break;
            case "暴雨转大暴雨" :
                resId = R.drawable.baoyuzhuandabaoyu;
                break;
            case "大暴雨转特大暴雨" :
                resId = R.drawable.dabaoyuzhuantedabaoyu;
                break;
            case "小雪转中雪" :
                resId = R.drawable.xiaoxuezhuanzhongxue;
                break;
            case "中雪转大雪" :
                resId = R.drawable.zhongxuezhuandaxue;
                break;
            case "大雪转暴雪" :
                resId = R.drawable.daxuezhuanbaoxue;
                break;
            case "浮尘" :
                resId = R.drawable.fuchen;
                break;
            case "扬沙" :
                resId = R.drawable.yangsha;
                break;
            case "强沙尘暴" :
                resId = R.drawable.qiangshachenbao;
                break;
            default:
                resId = R.drawable.b_nothing;
                break;
        }
        setImageResource(resId);
    }
}
