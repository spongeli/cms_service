package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsRecruit;
import com.spongeli.service.pojo.model.CmsRecruitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsRecruitMapper {
    long countByExample(CmsRecruitExample example);

    int deleteByExample(CmsRecruitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsRecruit record);

    int insertSelective(CmsRecruit record);

    List<CmsRecruit> selectByExampleWithBLOBs(CmsRecruitExample example);

    List<CmsRecruit> selectByExample(CmsRecruitExample example);

    CmsRecruit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsRecruit record, @Param("example") CmsRecruitExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsRecruit record, @Param("example") CmsRecruitExample example);

    int updateByExample(@Param("record") CmsRecruit record, @Param("example") CmsRecruitExample example);

    int updateByPrimaryKeySelective(CmsRecruit record);

    int updateByPrimaryKeyWithBLOBs(CmsRecruit record);

    int updateByPrimaryKey(CmsRecruit record);
}