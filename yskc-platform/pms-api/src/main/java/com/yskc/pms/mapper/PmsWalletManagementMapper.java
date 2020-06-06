package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsWalletManagement;
import com.yskc.pms.entity.PmsWalletManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsWalletManagementMapper {
    int countByExample(PmsWalletManagementExample example);

    int deleteByExample(PmsWalletManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsWalletManagement record);

    int insertSelective(PmsWalletManagement record);

    List<PmsWalletManagement> selectByExample(PmsWalletManagementExample example);

    PmsWalletManagement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsWalletManagement record, @Param("example") PmsWalletManagementExample example);

    int updateByExample(@Param("record") PmsWalletManagement record, @Param("example") PmsWalletManagementExample example);

    int updateByPrimaryKeySelective(PmsWalletManagement record);

    int updateByPrimaryKey(PmsWalletManagement record);
}