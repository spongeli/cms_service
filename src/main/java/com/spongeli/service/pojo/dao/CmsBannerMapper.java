package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsBanner;
import com.spongeli.service.pojo.model.CmsBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsBannerMapper {
    long countByExample(CmsBannerExample example);

    int deleteByExample(CmsBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsBanner record);

    int insertSelective(CmsBanner record);

    List<CmsBanner> selectByExample(CmsBannerExample example);

    CmsBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsBanner record, @Param("example") CmsBannerExample example);

    int updateByExample(@Param("record") CmsBanner record, @Param("example") CmsBannerExample example);

    int updateByPrimaryKeySelective(CmsBanner record);

    int updateByPrimaryKey(CmsBanner record);
}