package com.tongji409.web.service;

import com.tongji409.web.dao.RecommendInfoMapper;
import com.tongji409.web.resultdomain.RecommendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lijiechu
 * @create on 16/12/22
 * @description
 */

@Service
@Scope("prototype")
public class RecommendInfoService {

    @Autowired
    private RecommendInfoMapper recommendInfoMapper;

    public List<RecommendResult> getRecentRecommendInfo(){
        return recommendInfoMapper.getRecentRecommendInfo();
    }
}
