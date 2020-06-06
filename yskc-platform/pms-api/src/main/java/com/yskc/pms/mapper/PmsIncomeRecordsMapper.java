package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsIncomeRecords;
import com.yskc.pms.entity.PmsIncomeRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsIncomeRecordsMapper {
    int countByExample(PmsIncomeRecordsExample example);

    int deleteByExample(PmsIncomeRecordsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsIncomeRecords record);

    int insertSelective(PmsIncomeRecords record);

    List<PmsIncomeRecords> selectByExample(PmsIncomeRecordsExample example);

    PmsIncomeRecords selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsIncomeRecords record, @Param("example") PmsIncomeRecordsExample example);

    int updateByExample(@Param("record") PmsIncomeRecords record, @Param("example") PmsIncomeRecordsExample example);

    int updateByPrimaryKeySelective(PmsIncomeRecords record);

    int updateByPrimaryKey(PmsIncomeRecords record);
}