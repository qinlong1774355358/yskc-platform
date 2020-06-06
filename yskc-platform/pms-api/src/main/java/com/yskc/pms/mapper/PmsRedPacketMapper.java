package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsRedPacket;
import com.yskc.pms.entity.PmsRedPacketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRedPacketMapper {
    int countByExample(PmsRedPacketExample example);

    int deleteByExample(PmsRedPacketExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRedPacket record);

    int insertSelective(PmsRedPacket record);

    List<PmsRedPacket> selectByExample(PmsRedPacketExample example);

    PmsRedPacket selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRedPacket record, @Param("example") PmsRedPacketExample example);

    int updateByExample(@Param("record") PmsRedPacket record, @Param("example") PmsRedPacketExample example);

    int updateByPrimaryKeySelective(PmsRedPacket record);

    int updateByPrimaryKey(PmsRedPacket record);
}