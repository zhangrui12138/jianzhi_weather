package com.example.weather_jianzhi.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
* "result": {
        "alert": [
            {
                "content": "【深圳市扩展分区暴雨黄色预警信号】宝安区未来1小时内降雨加强，小时雨强20-30毫米，但6小时累计雨量将达到暴雨，深圳市气象台2024年05月21日13时45分将分区暴雨黄色预警信号扩展至上述区域，全市处于暴雨戒备状态。目前宝安、南山、福田、龙华、罗湖、龙岗西部、珠江口和深圳湾暴雨黄色预警信号生效中，请注意防御暴雨可能引发的局部内涝、山洪等灾害。（预警信息来源：国家预警信息发布中心）",
                "infoid": 38,
                "level": "黄色",
                "name": "暴雨",
                "pub_time": "2024-05-21 13:46:00",
                "title": "深圳市气象台发布暴雨黄色预警[III级/较重]",
                "type": "暴雨",
                "update_time": "2024-05-21 13:48:13"
            }
        ],
        "aqi": 14,
        "city_name": "深圳",
        "current_condition": "中到大雨",
        "current_temperature": 25,
        "current_time": 1716271154,
        "dat_condition": "雷阵雨",
        "dat_high_temperature": 28,
        "dat_low_temperature": 24,
        "dat_weather_icon_id": "4",
        "day_condition": "大雨",
        "download_icon": 1,
        "forecast_list": [
            {
                "condition": "小到中雨转雷阵雨",
                "date": "2024-05-20",
                "high_temperature": "27",
                "low_temperature": "23",
                "weather_icon_id": "7",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "大雨转小雨",
                "date": "2024-05-21",
                "high_temperature": "28",
                "low_temperature": "24",
                "weather_icon_id": "9",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "小雨",
                "date": "2024-05-22",
                "high_temperature": "29",
                "low_temperature": "24",
                "weather_icon_id": "7",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "雷阵雨",
                "date": "2024-05-23",
                "high_temperature": "28",
                "low_temperature": "24",
                "weather_icon_id": "4",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "阵雨",
                "date": "2024-05-24",
                "high_temperature": "29",
                "low_temperature": "24",
                "weather_icon_id": "3",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "阵雨转中雨",
                "date": "2024-05-25",
                "high_temperature": "28",
                "low_temperature": "24",
                "weather_icon_id": "3",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "中雨转大雨",
                "date": "2024-05-26",
                "high_temperature": "28",
                "low_temperature": "24",
                "weather_icon_id": "8",
                "wind_direction": "北风",
                "wind_level": "1"
            },
            {
                "condition": "小雨转暴雨",
                "date": "2024-05-27",
                "high_temperature": "31",
                "low_temperature": "25",
                "weather_icon_id": "7",
                "wind_direction": "西南风",
                "wind_level": "3"
            },
            {
                "condition": "小雨",
                "date": "2024-05-28",
                "high_temperature": "28",
                "low_temperature": "24",
                "weather_icon_id": "7",
                "wind_direction": "东风",
                "wind_level": "1"
            },
            {
                "condition": "晴转阴",
                "date": "2024-05-29",
                "high_temperature": "27",
                "low_temperature": "23",
                "weather_icon_id": "0",
                "wind_direction": "东风",
                "wind_level": "1"
            },
            {
                "condition": "多云转小雨",
                "date": "2024-05-30",
                "high_temperature": "26",
                "low_temperature": "24",
                "weather_icon_id": "1",
                "wind_direction": "东风",
                "wind_level": "1"
            },
            {
                "condition": "小雨",
                "date": "2024-05-31",
                "high_temperature": "25",
                "low_temperature": "24",
                "weather_icon_id": "7",
                "wind_direction": "西南风",
                "wind_level": "1"
            },
            {
                "condition": "小雨",
                "date": "2024-06-01",
                "high_temperature": "28",
                "low_temperature": "24",
                "weather_icon_id": "7",
                "wind_direction": "南风",
                "wind_level": "2"
            },
            {
                "condition": "小雨",
                "date": "2024-06-02",
                "high_temperature": "24",
                "low_temperature": "22",
                "weather_icon_id": "7",
                "wind_direction": "东风",
                "wind_level": "2"
            },
            {
                "condition": "小雨转阴",
                "date": "2024-06-03",
                "high_temperature": "23",
                "low_temperature": "20",
                "weather_icon_id": "7",
                "wind_direction": "东北风",
                "wind_level": "2"
            },
            {
                "condition": "小雨转阴",
                "date": "2024-06-04",
                "high_temperature": "22",
                "low_temperature": "21",
                "weather_icon_id": "7",
                "wind_direction": "东风",
                "wind_level": "1"
            }
        ],
        "high_temperature": 28,
        "hourly_forecast": [
            {
                "condition": "中到大雨",
                "hour": "13",
                "temperature": "24",
                "weather_icon_id": "9",
                "wind_direction": "NE",
                "wind_level": "7.88"
            },
            {
                "condition": "阵雨",
                "hour": "14",
                "temperature": "26",
                "weather_icon_id": "3",
                "wind_direction": "SE",
                "wind_level": "13.00"
            },
            {
                "condition": "阵雨",
                "hour": "15",
                "temperature": "27",
                "weather_icon_id": "3",
                "wind_direction": "SE",
                "wind_level": "18.50"
            },
            {
                "condition": "阵雨",
                "hour": "16",
                "temperature": "27",
                "weather_icon_id": "3",
                "wind_direction": "SE",
                "wind_level": "16.70"
            },
            {
                "condition": "阵雨",
                "hour": "17",
                "temperature": "28",
                "weather_icon_id": "3",
                "wind_direction": "SE",
                "wind_level": "13.00"
            },
            {
                "condition": "多云",
                "hour": "18",
                "temperature": "27",
                "weather_icon_id": "1",
                "wind_direction": "SE",
                "wind_level": "16.70"
            },
            {
                "condition": "多云",
                "hour": "19",
                "temperature": "26",
                "weather_icon_id": "31",
                "wind_direction": "SE",
                "wind_level": "11.09"
            },
            {
                "condition": "多云",
                "hour": "20",
                "temperature": "26",
                "weather_icon_id": "31",
                "wind_direction": "SE",
                "wind_level": "9.29"
            },
            {
                "condition": "多云",
                "hour": "21",
                "temperature": "26",
                "weather_icon_id": "31",
                "wind_direction": "SE",
                "wind_level": "9.29"
            },
            {
                "condition": "阴",
                "hour": "22",
                "temperature": "26",
                "weather_icon_id": "2",
                "wind_direction": "SE",
                "wind_level": "9.29"
            },
            {
                "condition": "阵雨",
                "hour": "23",
                "temperature": "26",
                "weather_icon_id": "33",
                "wind_direction": "SE",
                "wind_level": "7.42"
            },
            {
                "condition": "阵雨",
                "hour": "0",
                "temperature": "25",
                "weather_icon_id": "33",
                "wind_direction": "SE",
                "wind_level": "9.29"
            },
            {
                "condition": "阴",
                "hour": "1",
                "temperature": "25",
                "weather_icon_id": "2",
                "wind_direction": "SE",
                "wind_level": "7.42"
            },
            {
                "condition": "多云",
                "hour": "2",
                "temperature": "25",
                "weather_icon_id": "31",
                "wind_direction": "E",
                "wind_level": "5.62"
            },
            {
                "condition": "阴",
                "hour": "3",
                "temperature": "24",
                "weather_icon_id": "2",
                "wind_direction": "E",
                "wind_level": "5.62"
            },
            {
                "condition": "阴",
                "hour": "4",
                "temperature": "24",
                "weather_icon_id": "2",
                "wind_direction": "E",
                "wind_level": "5.62"
            },
            {
                "condition": "阵雨",
                "hour": "5",
                "temperature": "24",
                "weather_icon_id": "33",
                "wind_direction": "E",
                "wind_level": "3.71"
            },
            {
                "condition": "阵雨",
                "hour": "6",
                "temperature": "25",
                "weather_icon_id": "3",
                "wind_direction": "E",
                "wind_level": "5.62"
            },
            {
                "condition": "多云",
                "hour": "7",
                "temperature": "25",
                "weather_icon_id": "1",
                "wind_direction": "E",
                "wind_level": "5.62"
            },
            {
                "condition": "多云",
                "hour": "8",
                "temperature": "25",
                "weather_icon_id": "1",
                "wind_direction": "E",
                "wind_level": "5.62"
            },
            {
                "condition": "多云",
                "hour": "9",
                "temperature": "27",
                "weather_icon_id": "1",
                "wind_direction": "SE",
                "wind_level": "7.42"
            },
            {
                "condition": "阵雨",
                "hour": "10",
                "temperature": "27",
                "weather_icon_id": "3",
                "wind_direction": "SE",
                "wind_level": "7.42"
            },
            {
                "condition": "阵雨",
                "hour": "11",
                "temperature": "28",
                "weather_icon_id": "3",
                "wind_direction": "SE",
                "wind_level": "7.42"
            },
            {
                "condition": "阵雨",
                "hour": "12",
                "temperature": "28",
                "weather_icon_id": "3",
                "wind_direction": "S",
                "wind_level": "9.29"
            },
            {
                "condition": "阵雨",
                "hour": "13",
                "temperature": "28",
                "weather_icon_id": "3",
                "wind_direction": "N",
                "wind_level": "3.20"
            }
        ],
        "low_temperature": 24,
        "moji_city_id": 892,
        "night_condition": "小雨",
        "origin_data": [],
        "quality_level": "优",
        "tips": "略微偏热，注意衣物变化。",
        "tomorrow_aqi": 58,
        "tomorrow_condition": "小雨",
        "tomorrow_high_temperature": 29,
        "tomorrow_low_temperature": 24,
        "tomorrow_quality_level": "良",
        "tomorrow_weather_icon_id": "7",
        "update_time": "2024-05-21 13:31:03",
        "weather_icon_id": "9",
        "wind_direction": "西北风",
        "wind_level": 1
    },
* */
public class ResultBean {
    @SerializedName("alert")
    private List<AlertBean> alert;
    private int aqi;
    private String city_name;
    private String current_condition;
    private int current_temperature;
    private int current_time;
    private String dat_condition;
    private int dat_high_temperature;
    private int dat_low_temperature;
    private String dat_weather_icon_id;
    private String day_condition;
    private int download_icon;
    @SerializedName("forecast_list")
    private List<ForcastBean> forecast_list;
    private int high_temperature;
    @SerializedName("hourly_forecast")
    private List<HforcastBean> hourly_forecast;
    private int low_temperature;
    private int moji_city_id;
    private String night_condition;
    @SerializedName("origin_data")
    private List<originDataBean> origin_data;
    private String quality_level;
    private String tips;
    private int tomorrow_aqi;
    private String tomorrow_condition;
    private int tomorrow_high_temperature;
    private int tomorrow_low_temperature;
    private String tomorrow_quality_level;
    private String tomorrow_weather_icon_id;
    private String update_time;
    private String weather_icon_id;
    private String wind_direction;
    private int wind_level;

    public List<AlertBean> getAlert() {
        return alert;
    }

    public void setAlert(List<AlertBean> alert) {
        this.alert = alert;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCurrent_condition() {
        return current_condition;
    }

    public void setCurrent_condition(String current_condition) {
        this.current_condition = current_condition;
    }

    public int getCurrent_temperature() {
        return current_temperature;
    }

    public void setCurrent_temperature(int current_temperature) {
        this.current_temperature = current_temperature;
    }

    public int getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(int current_time) {
        this.current_time = current_time;
    }

    public String getDat_condition() {
        return dat_condition;
    }

    public void setDat_condition(String dat_condition) {
        this.dat_condition = dat_condition;
    }

    public int getDat_high_temperature() {
        return dat_high_temperature;
    }

    public void setDat_high_temperature(int dat_high_temperature) {
        this.dat_high_temperature = dat_high_temperature;
    }

    public int getDat_low_temperature() {
        return dat_low_temperature;
    }

    public void setDat_low_temperature(int dat_low_temperature) {
        this.dat_low_temperature = dat_low_temperature;
    }

    public String getDat_weather_icon_id() {
        return dat_weather_icon_id;
    }

    public void setDat_weather_icon_id(String dat_weather_icon_id) {
        this.dat_weather_icon_id = dat_weather_icon_id;
    }

    public String getDay_condition() {
        return day_condition;
    }

    public void setDay_condition(String day_condition) {
        this.day_condition = day_condition;
    }

    public int getDownload_icon() {
        return download_icon;
    }

    public void setDownload_icon(int download_icon) {
        this.download_icon = download_icon;
    }

    public List<ForcastBean> getForecast_list() {
        return forecast_list;
    }

    public void setForecast_list(List<ForcastBean> forecast_list) {
        this.forecast_list = forecast_list;
    }

    public int getHigh_temperature() {
        return high_temperature;
    }

    public void setHigh_temperature(int high_temperature) {
        this.high_temperature = high_temperature;
    }

    public List<HforcastBean> getHourly_forecast() {
        return hourly_forecast;
    }

    public void setHourly_forecast(List<HforcastBean> hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }

    public int getLow_temperature() {
        return low_temperature;
    }

    public void setLow_temperature(int low_temperature) {
        this.low_temperature = low_temperature;
    }

    public int getMoji_city_id() {
        return moji_city_id;
    }

    public void setMoji_city_id(int moji_city_id) {
        this.moji_city_id = moji_city_id;
    }

    public String getNight_condition() {
        return night_condition;
    }

    public void setNight_condition(String night_condition) {
        this.night_condition = night_condition;
    }

    public List<originDataBean> getOrigin_data() {
        return origin_data;
    }

    public void setOrigin_data(List<originDataBean> origin_data) {
        this.origin_data = origin_data;
    }

    public String getQuality_level() {
        return quality_level;
    }

    public void setQuality_level(String quality_level) {
        this.quality_level = quality_level;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public int getTomorrow_aqi() {
        return tomorrow_aqi;
    }

    public void setTomorrow_aqi(int tomorrow_aqi) {
        this.tomorrow_aqi = tomorrow_aqi;
    }

    public String getTomorrow_condition() {
        return tomorrow_condition;
    }

    public void setTomorrow_condition(String tomorrow_condition) {
        this.tomorrow_condition = tomorrow_condition;
    }

    public int getTomorrow_high_temperature() {
        return tomorrow_high_temperature;
    }

    public void setTomorrow_high_temperature(int tomorrow_high_temperature) {
        this.tomorrow_high_temperature = tomorrow_high_temperature;
    }

    public int getTomorrow_low_temperature() {
        return tomorrow_low_temperature;
    }

    public void setTomorrow_low_temperature(int tomorrow_low_temperature) {
        this.tomorrow_low_temperature = tomorrow_low_temperature;
    }

    public String getTomorrow_quality_level() {
        return tomorrow_quality_level;
    }

    public void setTomorrow_quality_level(String tomorrow_quality_level) {
        this.tomorrow_quality_level = tomorrow_quality_level;
    }

    public String getTomorrow_weather_icon_id() {
        return tomorrow_weather_icon_id;
    }

    public void setTomorrow_weather_icon_id(String tomorrow_weather_icon_id) {
        this.tomorrow_weather_icon_id = tomorrow_weather_icon_id;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getWeather_icon_id() {
        return weather_icon_id;
    }

    public void setWeather_icon_id(String weather_icon_id) {
        this.weather_icon_id = weather_icon_id;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public int getWind_level() {
        return wind_level;
    }

    public void setWind_level(int wind_level) {
        this.wind_level = wind_level;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "alert=" + alert +
                ", aqi=" + aqi +
                ", city_name='" + city_name + '\'' +
                ", current_condition='" + current_condition + '\'' +
                ", current_temperature=" + current_temperature +
                ", current_time=" + current_time +
                ", dat_condition='" + dat_condition + '\'' +
                ", dat_high_temperature=" + dat_high_temperature +
                ", dat_low_temperature=" + dat_low_temperature +
                ", dat_weather_icon_id='" + dat_weather_icon_id + '\'' +
                ", day_condition='" + day_condition + '\'' +
                ", download_icon=" + download_icon +
                ", forecast_list=" + forecast_list +
                ", high_temperature=" + high_temperature +
                ", hourly_forecast=" + hourly_forecast +
                ", low_temperature=" + low_temperature +
                ", moji_city_id=" + moji_city_id +
                ", night_condition='" + night_condition + '\'' +
                ", origin_data=" + origin_data +
                ", quality_level='" + quality_level + '\'' +
                ", tips='" + tips + '\'' +
                ", tomorrow_aqi=" + tomorrow_aqi +
                ", tomorrow_condition='" + tomorrow_condition + '\'' +
                ", tomorrow_high_temperature=" + tomorrow_high_temperature +
                ", tomorrow_low_temperature=" + tomorrow_low_temperature +
                ", tomorrow_quality_level='" + tomorrow_quality_level + '\'' +
                ", tomorrow_weather_icon_id='" + tomorrow_weather_icon_id + '\'' +
                ", update_time='" + update_time + '\'' +
                ", weather_icon_id='" + weather_icon_id + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_level=" + wind_level +
                '}';
    }
}
