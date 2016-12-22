package com.tongji409.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tongji409.web.service.RecommendInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lijiechu
 * @create on 16/12/22
 * @description
 */
@RestController
public class RecommendInfoController {

    @Autowired
    private RecommendInfoService recommendInfoService;

    @RequestMapping(value = "/recommendinfo", method= RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8200")
    @ResponseBody
    public String getRecentRecommendInfo(){
        String strString = JSON.toJSONString(recommendInfoService.getRecentRecommendInfo(), SerializerFeature.WriteDateUseDateFormat);
        //JSONArray jsonArrayTasks = JSONArray.parseArray(strString);
        return strString;

    }
}
