package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsRechargeRecord;
import com.yskc.pms.entity.PmsRechargeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRechargeRecordMapper {
    int countByExample(PmsRechargeRecordExample example);

    int deleteByExample(PmsRechargeRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRechargeRecord record);

    int insertSelective(PmsRechargeRecord record);

    List<PmsRechargeRecord> selectByExample(PmsRechargeRecordExample example);

    PmsRechargeRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRechargeRecord record, @Param("example") PmsRechargeRecordExample example);

    int updateByExample(@Param("record") PmsRechargeRecord record, @Param("example") PmsRechargeRecordExample example);

    int updateByPrimaryKeySelective(PmsRechargeRecord record);

    int updateByPrimaryKey(PmsRechargeRecord record);
}