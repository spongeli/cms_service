package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsAboutMe;
import com.spongeli.service.pojo.model.CmsAboutMeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsAboutMeMapper {
    long countByExample(CmsAboutMeExample example);

    int deleteByExample(CmsAboutMeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsAboutMe record);

    int insertSelective(CmsAboutMe record);

    List<CmsAboutMe> selectByExampleWithBLOBs(CmsAboutMeExample example);

    List<CmsAboutMe> selectByExample(CmsAboutMeExample example);

    CmsAboutMe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsAboutMe record, @Param("example") CmsAboutMeExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsAboutMe record, @Param("example") CmsAboutMeExample example);

    int updateByExample(@Param("record") CmsAboutMe record, @Param("example") CmsAboutMeExample example);

    int updateByPrimaryKeySelective(CmsAboutMe record);

    int updateByPrimaryKeyWithBLOBs(CmsAboutMe record);

    int updateByPrimaryKey(CmsAboutMe record);
}