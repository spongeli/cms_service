package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsNews;
import com.spongeli.service.pojo.model.CmsNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsNewsMapper {
    long countByExample(CmsNewsExample example);

    int deleteByExample(CmsNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsNews record);

    int insertSelective(CmsNews record);

    List<CmsNews> selectByExampleWithBLOBs(CmsNewsExample example);

    List<CmsNews> selectByExample(CmsNewsExample example);

    CmsNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsNews record, @Param("example") CmsNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsNews record, @Param("example") CmsNewsExample example);

    int updateByExample(@Param("record") CmsNews record, @Param("example") CmsNewsExample example);

    int updateByPrimaryKeySelective(CmsNews record);

    int updateByPrimaryKeyWithBLOBs(CmsNews record);

    int updateByPrimaryKey(CmsNews record);
}