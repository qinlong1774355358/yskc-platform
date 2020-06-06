package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsGetRedPackage;
import com.yskc.pms.entity.PmsGetRedPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGetRedPackageMapper {
    int countByExample(PmsGetRedPackageExample example);

    int deleteByExample(PmsGetRedPackageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsGetRedPackage record);

    int insertSelective(PmsGetRedPackage record);

    List<PmsGetRedPackage> selectByExample(PmsGetRedPackageExample example);

    PmsGetRedPackage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsGetRedPackage record, @Param("example") PmsGetRedPackageExample example);

    int updateByExample(@Param("record") PmsGetRedPackage record, @Param("example") PmsGetRedPackageExample example);

    int updateByPrimaryKeySelective(PmsGetRedPackage record);

    int updateByPrimaryKey(PmsGetRedPackage record);
}