package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsWithdrawCheckManagement;
import com.yskc.pms.entity.PmsWithdrawCheckManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsWithdrawCheckManagementMapper {
    int countByExample(PmsWithdrawCheckManagementExample example);

    int deleteByExample(PmsWithdrawCheckManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsWithdrawCheckManagement record);

    int insertSelective(PmsWithdrawCheckManagement record);

    List<PmsWithdrawCheckManagement> selectByExample(PmsWithdrawCheckManagementExample example);

    PmsWithdrawCheckManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsWithdrawCheckManagement record, @Param("example") PmsWithdrawCheckManagementExample example);

    int updateByExample(@Param("record") PmsWithdrawCheckManagement record, @Param("example") PmsWithdrawCheckManagementExample example);

    int updateByPrimaryKeySelective(PmsWithdrawCheckManagement record);

    int updateByPrimaryKey(PmsWithdrawCheckManagement record);
}