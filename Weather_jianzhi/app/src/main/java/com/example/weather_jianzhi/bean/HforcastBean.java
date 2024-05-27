package com.example.weather_jianzhi.bean;
/*
* {
                "condition": "中到大雨",
                "hour": "13",
                "temperature": "24",
                "weather_icon_id": "9",
                "wind_direction": "NE",
                "wind_level": "7.88"
            }
* */
public class HforcastBean {
    private String condition;
    private String hour;
    private String temperature;
    private String weather_icon_id;
    private String wind_direction;
    private String wind_level;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
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
        return "HforcastBean{" +
                "condition='" + condition + '\'' +
                ", hour='" + hour + '\'' +
                ", temperature='" + temperature + '\'' +
                ", weather_icon_id='" + weather_icon_id + '\'' +
                ", wind_direction='" + wind_direction + '\'' +
                ", wind_level='" + wind_level + '\'' +
                '}';
    }
}
