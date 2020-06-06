package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsVoidePlay;
import com.yskc.pms.entity.PmsVoidePlayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsVoidePlayMapper {
    int countByExample(PmsVoidePlayExample example);

    int deleteByExample(PmsVoidePlayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsVoidePlay record);

    int insertSelective(PmsVoidePlay record);

    List<PmsVoidePlay> selectByExample(PmsVoidePlayExample example);

    PmsVoidePlay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsVoidePlay record, @Param("example") PmsVoidePlayExample example);

    int updateByExample(@Param("record") PmsVoidePlay record, @Param("example") PmsVoidePlayExample example);

    int updateByPrimaryKeySelective(PmsVoidePlay record);

    int updateByPrimaryKey(PmsVoidePlay record);
}