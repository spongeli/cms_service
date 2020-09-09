package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsScaningHistroy;
import com.spongeli.service.pojo.model.CmsScaningHistroyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsScaningHistroyMapper {
    long countByExample(CmsScaningHistroyExample example);

    int deleteByExample(CmsScaningHistroyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsScaningHistroy record);

    int insertSelective(CmsScaningHistroy record);

    List<CmsScaningHistroy> selectByExample(CmsScaningHistroyExample example);

    CmsScaningHistroy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsScaningHistroy record, @Param("example") CmsScaningHistroyExample example);

    int updateByExample(@Param("record") CmsScaningHistroy record, @Param("example") CmsScaningHistroyExample example);

    int updateByPrimaryKeySelective(CmsScaningHistroy record);

    int updateByPrimaryKey(CmsScaningHistroy record);
}