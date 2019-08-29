package com.zscat.pms.service;

import com.zscat.core.model.PmsMerchandise;

import java.util.List;

/**
 * 菜品服务
 */
public interface PmsMerchandiseService {

    /**
     * 查询商家热门菜品
     * @param storeId
     * @return
     */
    List<PmsMerchandise> queryHotPmsMerchandiseByStoreId(Integer storeId);
    
    /**
     * 姓名:张古良
     * 修改时间：2019.7.30
     * 查询菜品总数量
     * @param storeId
     * @return
     */
    int queryHotPmsMerchandiseCountByExample();
    
    /**
     * 姓名：张古良
     * 修改时间：2019.7.14
     * 根据菜名查询菜品
     * @param 菜品名称
     * @return 所有菜品
     */
    List<PmsMerchandise> queryHotPmsMerchandiseName(String name);
    
    /**
     * 姓名：张古良
     * 修改时间：2019.7.28
     * 根据菜名对象查询菜品
     * @param 菜品对象
     * @return 所有菜品
     */
    List<PmsMerchandise> queryHotqueryPmsMerchandiseList(PmsMerchandise pmsMerchandise);

    /**
     * 姓名：张古良
     * 修改时间：2019.7.28
     * 根据菜名修改菜品
     * @param 菜品列表
     */
    int updatePmsMerchandise(PmsMerchandise pms);

    /**
     * 姓名：张古良
     * 修改时间：2019.7.28
     * 根据id删除菜品
     * @param 菜品列表
     */
    int deletePmsMerchandiseById(Integer id);
    
    /**
     * 姓名：张古良
     * 修改时间：2019.7.28
     * 添加菜品
     * @param 菜品列表
     */
    int insertPmsMerchandise(PmsMerchandise pms);

    /**
     * 查询某店铺的菜品分类
     * @param storeId
     * @return
     */
    List<String> queryFoodClassfiyList(Integer storeId);
}
