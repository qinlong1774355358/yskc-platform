package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsTradeArea;
import com.yskc.pms.entity.PmsTradeAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsTradeAreaMapper {
    int countByExample(PmsTradeAreaExample example);

    int deleteByExample(PmsTradeAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsTradeArea record);

    int insertSelective(PmsTradeArea record);

    List<PmsTradeArea> selectByExample(PmsTradeAreaExample example);

    PmsTradeArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsTradeArea record, @Param("example") PmsTradeAreaExample example);

    int updateByExample(@Param("record") PmsTradeArea record, @Param("example") PmsTradeAreaExample example);

    int updateByPrimaryKeySelective(PmsTradeArea record);

    int updateByPrimaryKey(PmsTradeArea record);
}