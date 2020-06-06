package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsFinancialManagement;
import com.yskc.pms.entity.PmsFinancialManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFinancialManagementMapper {
    int countByExample(PmsFinancialManagementExample example);

    int deleteByExample(PmsFinancialManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsFinancialManagement record);

    int insertSelective(PmsFinancialManagement record);

    List<PmsFinancialManagement> selectByExample(PmsFinancialManagementExample example);

    PmsFinancialManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsFinancialManagement record, @Param("example") PmsFinancialManagementExample example);

    int updateByExample(@Param("record") PmsFinancialManagement record, @Param("example") PmsFinancialManagementExample example);

    int updateByPrimaryKeySelective(PmsFinancialManagement record);

    int updateByPrimaryKey(PmsFinancialManagement record);
}