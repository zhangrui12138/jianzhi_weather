package com.example.weather_jianzhi.bean;
/*
* {
                "condition": "小到中雨转雷阵雨",
                "date": "2024-05-20",
                "high_temperature": "27",
                "low_temperature": "23",
                "weather_icon_id": "7",
                "wind_direction": "北风",
                "wind_level": "1"
            }
* */
public class ForcastBean {
    private String condition;
    private String date;
    private String high_temperature;
    private String low_temperature;
    private String weather_icon_id;
    private String wind_direction;
    private String wind_level;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHigh_temperature() {
        return high_temperature;
    }

    public void setHigh_temperature(String high_temperature) {
        this.high_temperature = high_temperature;
    }

    public String getLow_temperature() {
        return low_temperature;
    }

    public void setLow_temperature(String low_temperature) {
        this.low_temperature = low_temperature;
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

    public String getWind_level() {
        return wind_level;
    }

    public void setWind_level(String wind_level) {
        this.wind_level = wind_level;
    }

    @Override
    public String toString() {
        return "ForcastBean{" +
                "condition='" + condition + '\'' +
                ", date='" + date + '\'' +
                ", high_temperature='" + high_temperature + '\'' +
                ", low_temperature='" + low_temperature + '\'' +
                ", weather_icon_id='" + weather_icon_id + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_level='" + wind_level + '\'' +
                '}';
    }
}
