package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsConnectionArea;
import com.yskc.pms.entity.PmsConnectionAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsConnectionAreaMapper {
    int countByExample(PmsConnectionAreaExample example);

    int deleteByExample(PmsConnectionAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsConnectionArea record);

    int insertSelective(PmsConnectionArea record);

    List<PmsConnectionArea> selectByExample(PmsConnectionAreaExample example);

    PmsConnectionArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsConnectionArea record, @Param("example") PmsConnectionAreaExample example);

    int updateByExample(@Param("record") PmsConnectionArea record, @Param("example") PmsConnectionAreaExample example);

    int updateByPrimaryKeySelective(PmsConnectionArea record);

    int updateByPrimaryKey(PmsConnectionArea record);
}