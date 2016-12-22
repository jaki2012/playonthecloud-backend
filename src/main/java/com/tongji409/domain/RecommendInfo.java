package com.tongji409.domain;

import java.util.Date;

/**
 * @author lijiechu
 * @create on 16/12/22
 * @description 推荐信息实体类
 */
public class RecommendInfo {

    private int id;
    //景点id
    private int ssId;
    //天气id
    private int weId;
    private Date date;
    private String time;
    private float result;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSsId() {
        return ssId;
    }

    public void setSsId(int ssId) {
        this.ssId = ssId;
    }

    public int getWeId() {
        return weId;
    }

    public void setWeId(int weId) {
        this.weId = weId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
