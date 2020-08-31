package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsNavigation;
import com.spongeli.service.pojo.model.CmsNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsNavigationMapper {
    long countByExample(CmsNavigationExample example);

    int deleteByExample(CmsNavigationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsNavigation record);

    int insertSelective(CmsNavigation record);

    List<CmsNavigation> selectByExample(CmsNavigationExample example);

    CmsNavigation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsNavigation record, @Param("example") CmsNavigationExample example);

    int updateByExample(@Param("record") CmsNavigation record, @Param("example") CmsNavigationExample example);

    int updateByPrimaryKeySelective(CmsNavigation record);

    int updateByPrimaryKey(CmsNavigation record);
}