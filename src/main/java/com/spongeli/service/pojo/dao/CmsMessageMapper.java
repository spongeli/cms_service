package com.spongeli.service.pojo.dao;

import com.spongeli.service.pojo.model.CmsMessage;
import com.spongeli.service.pojo.model.CmsMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMessageMapper {
    long countByExample(CmsMessageExample example);

    int deleteByExample(CmsMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMessage record);

    int insertSelective(CmsMessage record);

    List<CmsMessage> selectByExampleWithBLOBs(CmsMessageExample example);

    List<CmsMessage> selectByExample(CmsMessageExample example);

    CmsMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsMessage record, @Param("example") CmsMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsMessage record, @Param("example") CmsMessageExample example);

    int updateByExample(@Param("record") CmsMessage record, @Param("example") CmsMessageExample example);

    int updateByPrimaryKeySelective(CmsMessage record);

    int updateByPrimaryKeyWithBLOBs(CmsMessage record);

    int updateByPrimaryKey(CmsMessage record);
}