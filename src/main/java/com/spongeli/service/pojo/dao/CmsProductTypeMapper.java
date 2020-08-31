package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsProductType;
import com.spongeli.service.pojo.model.CmsProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsProductTypeMapper {
    long countByExample(CmsProductTypeExample example);

    int deleteByExample(CmsProductTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsProductType record);

    int insertSelective(CmsProductType record);

    List<CmsProductType> selectByExample(CmsProductTypeExample example);

    CmsProductType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsProductType record, @Param("example") CmsProductTypeExample example);

    int updateByExample(@Param("record") CmsProductType record, @Param("example") CmsProductTypeExample example);

    int updateByPrimaryKeySelective(CmsProductType record);

    int updateByPrimaryKey(CmsProductType record);
}