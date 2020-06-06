package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsWithdrawDepositRecord;
import com.yskc.pms.entity.PmsWithdrawDepositRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsWithdrawDepositRecordMapper {
    int countByExample(PmsWithdrawDepositRecordExample example);

    int deleteByExample(PmsWithdrawDepositRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsWithdrawDepositRecord record);

    int insertSelective(PmsWithdrawDepositRecord record);

    List<PmsWithdrawDepositRecord> selectByExample(PmsWithdrawDepositRecordExample example);

    PmsWithdrawDepositRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsWithdrawDepositRecord record, @Param("example") PmsWithdrawDepositRecordExample example);

    int updateByExample(@Param("record") PmsWithdrawDepositRecord record, @Param("example") PmsWithdrawDepositRecordExample example);

    int updateByPrimaryKeySelective(PmsWithdrawDepositRecord record);

    int updateByPrimaryKey(PmsWithdrawDepositRecord record);
}