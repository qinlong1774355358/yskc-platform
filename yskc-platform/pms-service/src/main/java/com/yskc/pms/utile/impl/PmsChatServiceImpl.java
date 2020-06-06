package com.yskc.pms.utile.impl;

import com.yskc.pms.entity.*;
import com.yskc.pms.mapper.PmsChatControlRecordMapper;
import com.yskc.pms.mapper.PmsChatRecordMapper;
import com.yskc.pms.mapper.PmsGroupManagementMapper;

import com.zscat.core.server.PmsChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PmsChatService
 * @Description: 聊天功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
@Service("pmsChatService")
public class PmsChatServiceImpl implements PmsChatService {
    @Autowired
	private PmsChatControlRecordMapper pmsChatControlRecordMapper;
    @Autowired
	private PmsGroupManagementMapper pmsGroupManagementMapper;
    @Autowired
	private PmsChatRecordMapper pmsChatRecordMapper;

    /**
     * 功能：聊天列表
     * @return
     */
    @Override
    public List<PmsChatControlRecord> queryPmsChatControlRecord() {
        PmsChatControlRecordExample example = new PmsChatControlRecordExample();
//        PmsChatControlRecordExample.Criteria criteria = example.createCriteria();
//        example.setOrderByClause("age asc");
//        example.setDistinct(false);
//        criteria.andUserAccountEqualTo(account);
        return pmsChatControlRecordMapper.selectByExample(example);
    }

    /**
    * 姓名：张古良
    * 查询群管理列表
    */
    @Override
    public List<PmsGroupManagement> queryHotPmsGroupManagement() {
        PmsGroupManagementExample example = new PmsGroupManagementExample();
        return pmsGroupManagementMapper.selectByExample(example);
    }

   /**
    * 姓名：张古良
    * 聊天记录查询
    * 修改时间：2019.7.14
    */
	@Override
	public List<PmsChatRecord> queryHotPmsChatRecord() {
        PmsChatRecordExample example = new PmsChatRecordExample();
		return pmsChatRecordMapper.selectByExample(example);
	}
//	/**
//	 * 姓名：张古良
//	 * 根据菜名对象查询菜品
//	 * 修改时间：2019.7.28
//	 */
//	@Override
//	public List<PmsMerchandise> queryHotqueryPmsMerchandiseList(PmsMerchandise pmsMerchandise) {
//		return pmsMerchandiseMapper.queryPmsMerchandiseList(pmsMerchandise);
//	}
//	/**
//	 * 姓名：张古良
//	 * 根据菜名对象修改菜品
//	 * 修改时间：2019.7.28
//	 */
//	@Override
//	public int updatePmsMerchandise(PmsMerchandise pms) {
//		return pmsMerchandiseMapper.updateByPrimaryKey(pms);
//
//	}
//	/**
//	 * 姓名：张古良
//	 * 根据菜名id删除菜品
//	 * 修改时间：2019.7.29
//	 */
//	@Override
//	public int deletePmsMerchandiseById(Integer id) {
//		return pmsMerchandiseMapper.deleteByPrimaryKey(id);
//
//	}
//	/**
//	 * 姓名：张古良
//	 * 增加菜品
//	 * 修改时间：2019.7.29
//	 */
//	@Override
//	public int insertPmsMerchandise(PmsMerchandise pms) {
//		return pmsMerchandiseMapper.insertSelective(pms);
//
//	}
//
//	@Override
//	public List<String> queryFoodClassfiyList(Integer storeId) {
//		PmsMerchandiseExample example = new PmsMerchandiseExample();
//		PmsMerchandiseExample.Criteria criteria = example.createCriteria();
//		criteria.andStoreMerchandiseIdEqualTo(storeId);
//		Stream<String> distinct = pmsMerchandiseMapper.selectByExample(example).stream().map(PmsMerchandise::getClassificationOfFood).distinct();
//		return distinct.collect(Collectors.toList());
//	}
//
//	@Override
//	public int queryHotPmsMerchandiseCountByExample() {
//		return pmsMerchandiseMapper.countByExample(null);
//	}
}
