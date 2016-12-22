package com.tongji409.web.resultdomain;

import java.util.Date;

/**
 * @author lijiechu
 * @create on 16/12/22
 * @description getRecentRecommendInfo()封装结果类
 * @see com.tongji409.web.dao.RecommendInfoMapper
 */
public class RecommendResult {

    //推荐景点的名称
    private String name;

    //推荐景点的地址
    private String address;

    //推荐景点的描述
    private String description;

    //推荐景点的图片Url
    private String pic;

    //推荐日期
    private Date date;

    //推荐情感值指数
    private float result;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
