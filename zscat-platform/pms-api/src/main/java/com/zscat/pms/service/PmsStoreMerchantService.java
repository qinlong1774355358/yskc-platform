package com.zscat.pms.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.zscat.core.model.PmsStoreMerchant;

import java.util.List;

/**
 * 店铺服务
 */
public interface PmsStoreMerchantService {

    /**
     * 根据经纬度查询最近的店铺列表(限定limit,默认10条)
     * @param longitude
     * @param latitude
     * @return
     */
    List<PmsStoreMerchant> queryPmsStoreMerchantByLocation(double longitude, double latitude, int limit);

    /**
     * 分页查询店铺列表
     * @param page
     * @param rows
     * @return
     */
    PageInfo<PmsStoreMerchant> queryPmsStoreMerchantByPage(Integer page, Integer rows);

    /**
     * 根据主键查询店铺
     * @param parseInt
     * @return
     */
    PmsStoreMerchant queryPmsStoreMerchantById(int parseInt);

    /**
     * 更新店铺
     * @param pmsStoreMerchant
     */
    boolean update(PmsStoreMerchant pmsStoreMerchant);

    /**
     * 保存店铺
     * @param pmsStoreMerchant
     */
    boolean save(PmsStoreMerchant pmsStoreMerchant);

    /**
     * 删除店铺
     * @param id
     * @return
     */
    boolean del(int id);
}
