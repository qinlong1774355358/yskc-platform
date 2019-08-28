package com.zscat.pms.mapper;

import com.zscat.core.model.PmsStoreMerchant;
import com.zscat.core.model.PmsStoreMerchantExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PmsStoreMerchantMapper {
    int countByExample(PmsStoreMerchantExample example);

    int deleteByExample(PmsStoreMerchantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsStoreMerchant record);

    int insertSelective(PmsStoreMerchant record);

    List<PmsStoreMerchant> selectByExample(PmsStoreMerchantExample example);

    PmsStoreMerchant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsStoreMerchant record, @Param("example") PmsStoreMerchantExample example);

    int updateByExample(@Param("record") PmsStoreMerchant record, @Param("example") PmsStoreMerchantExample example);

    int updateByPrimaryKeySelective(PmsStoreMerchant record);

    int updateByPrimaryKey(PmsStoreMerchant record);

    /**
     *  根据经纬度查询最近的店铺列表
     * */
    List<PmsStoreMerchant> selectByLoction(Map<String,Object> params);
}