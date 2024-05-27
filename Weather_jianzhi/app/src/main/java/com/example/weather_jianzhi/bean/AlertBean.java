package com.example.weather_jianzhi.bean;
/*
* {
                "content": "【深圳市扩展分区暴雨黄色预警信号】宝安区未来1小时内降雨加强，小时雨强20-30毫米，但6小时累计雨量将达到暴雨，深圳市气象台2024年05月21日13时45分将分区暴雨黄色预警信号扩展至上述区域，全市处于暴雨戒备状态。目前宝安、南山、福田、龙华、罗湖、龙岗西部、珠江口和深圳湾暴雨黄色预警信号生效中，请注意防御暴雨可能引发的局部内涝、山洪等灾害。（预警信息来源：国家预警信息发布中心）",
                "infoid": 38,
                "level": "黄色",
                "name": "暴雨",
                "pub_time": "2024-05-21 13:46:00",
                "title": "深圳市气象台发布暴雨黄色预警[III级/较重]",
                "type": "暴雨",
                "update_time": "2024-05-21 13:48:13"
    }
* */
public class AlertBean {
    private String content;
    private int infoid;
    private String level;
    private String name;
    private String pub_time;
    private String title;
    private String type;
    private String update_time;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPub_time() {
        return pub_time;
    }

    public void setPub_time(String pub_time) {
        this.pub_time = pub_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "AlertBean{" +
                "content='" + content + '\'' +
                ", infoid=" + infoid +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", pub_time='" + pub_time + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
