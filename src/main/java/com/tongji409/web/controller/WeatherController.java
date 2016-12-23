package com.tongji409.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lijiechu
 * @create on 16/12/23
 * @description
 */
@RestController
public class WeatherController {

    public RestTemplate restTemplate = new RestTemplate();

    String host = "http://ali-weather.showapi.com";
    String path = "/spot-to-weather";
    String params = "?area=欢乐谷";

    HttpHeaders headers = new HttpHeaders();

    @RequestMapping(value = "/forecast", method= RequestMethod.GET)
    @ResponseBody
    public String weatherForecast(){
        headers.add("Authorization","APPCODE 1ba3625d041d48fc99010a5e1d757f69");
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<JSONObject> re = restTemplate.exchange(host+path+params, HttpMethod.GET, entity, JSONObject.class);
        String jsonStr = re.getBody().toJSONString();
        JSONObject json = JSONObject.parseObject(jsonStr);

        return re.getBody().toJSONString();
    }
}
