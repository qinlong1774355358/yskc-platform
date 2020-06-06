package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsSupportRecord;
import com.yskc.pms.entity.PmsSupportRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSupportRecordMapper {
    int countByExample(PmsSupportRecordExample example);

    int deleteByExample(PmsSupportRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSupportRecord record);

    int insertSelective(PmsSupportRecord record);

    List<PmsSupportRecord> selectByExample(PmsSupportRecordExample example);

    PmsSupportRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSupportRecord record, @Param("example") PmsSupportRecordExample example);

    int updateByExample(@Param("record") PmsSupportRecord record, @Param("example") PmsSupportRecordExample example);

    int updateByPrimaryKeySelective(PmsSupportRecord record);

    int updateByPrimaryKey(PmsSupportRecord record);
}