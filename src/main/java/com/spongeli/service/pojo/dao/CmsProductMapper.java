package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsProduct;
import com.spongeli.service.pojo.model.CmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsProductMapper {
    long countByExample(CmsProductExample example);

    int deleteByExample(CmsProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsProduct record);

    int insertSelective(CmsProduct record);

    List<CmsProduct> selectByExampleWithBLOBs(CmsProductExample example);

    List<CmsProduct> selectByExample(CmsProductExample example);

    CmsProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsProduct record, @Param("example") CmsProductExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsProduct record, @Param("example") CmsProductExample example);

    int updateByExample(@Param("record") CmsProduct record, @Param("example") CmsProductExample example);

    int updateByPrimaryKeySelective(CmsProduct record);

    int updateByPrimaryKeyWithBLOBs(CmsProduct record);

    int updateByPrimaryKey(CmsProduct record);
}