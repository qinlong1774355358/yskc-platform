package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsFriendCircle;
import com.yskc.pms.entity.PmsFriendCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsFriendCircleMapper {
    int countByExample(PmsFriendCircleExample example);

    int deleteByExample(PmsFriendCircleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsFriendCircle record);

    int insertSelective(PmsFriendCircle record);

    List<PmsFriendCircle> selectByExample(PmsFriendCircleExample example);

    PmsFriendCircle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsFriendCircle record, @Param("example") PmsFriendCircleExample example);

    int updateByExample(@Param("record") PmsFriendCircle record, @Param("example") PmsFriendCircleExample example);

    int updateByPrimaryKeySelective(PmsFriendCircle record);

    int updateByPrimaryKey(PmsFriendCircle record);
}