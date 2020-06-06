package com.yskc.pms.mapper;

import com.yskc.pms.entity.Pmslogin;
import com.yskc.pms.entity.PmsloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsloginMapper {
    int countByExample(PmsloginExample example);

    int deleteByExample(PmsloginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pmslogin record);

    int insertSelective(Pmslogin record);

    List<Pmslogin> selectByExample(PmsloginExample example);

    Pmslogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pmslogin record, @Param("example") PmsloginExample example);

    int updateByExample(@Param("record") Pmslogin record, @Param("example") PmsloginExample example);

    int updateByPrimaryKeySelective(Pmslogin record);

    int updateByPrimaryKey(Pmslogin record);
}