package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsVideoControlRecord;
import com.yskc.pms.entity.PmsVideoControlRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsVideoControlRecordMapper {
    int countByExample(PmsVideoControlRecordExample example);

    int deleteByExample(PmsVideoControlRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsVideoControlRecord record);

    int insertSelective(PmsVideoControlRecord record);

    List<PmsVideoControlRecord> selectByExample(PmsVideoControlRecordExample example);

    PmsVideoControlRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsVideoControlRecord record, @Param("example") PmsVideoControlRecordExample example);

    int updateByExample(@Param("record") PmsVideoControlRecord record, @Param("example") PmsVideoControlRecordExample example);

    int updateByPrimaryKeySelective(PmsVideoControlRecord record);

    int updateByPrimaryKey(PmsVideoControlRecord record);
}