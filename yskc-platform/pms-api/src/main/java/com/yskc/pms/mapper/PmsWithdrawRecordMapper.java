package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsWithdrawRecord;
import com.yskc.pms.entity.PmsWithdrawRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsWithdrawRecordMapper {
    int countByExample(PmsWithdrawRecordExample example);

    int deleteByExample(PmsWithdrawRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsWithdrawRecord record);

    int insertSelective(PmsWithdrawRecord record);

    List<PmsWithdrawRecord> selectByExample(PmsWithdrawRecordExample example);

    PmsWithdrawRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsWithdrawRecord record, @Param("example") PmsWithdrawRecordExample example);

    int updateByExample(@Param("record") PmsWithdrawRecord record, @Param("example") PmsWithdrawRecordExample example);

    int updateByPrimaryKeySelective(PmsWithdrawRecord record);

    int updateByPrimaryKey(PmsWithdrawRecord record);
}