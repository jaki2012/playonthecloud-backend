package com.tongji409.web.dao;

import com.tongji409.web.resultdomain.RecommendResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lijiechu
 * @create on 16/12/22
 * @description
 */
@Mapper
public interface RecommendInfoMapper {
    @Select("Select b.Name, b.Address, b.Description, b.pic, a.Date, a.result from RecommendInfo a left join ScenicSpot b on a.SSID=b.ID order by result desc limit 3")
    List<RecommendResult> getRecentRecommendInfo();
}
