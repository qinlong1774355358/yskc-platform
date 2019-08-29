package com.zscat.pms.impl;

import com.zscat.core.model.PmsMerchandise;
import com.zscat.core.model.PmsMerchandiseExample;
import com.zscat.pms.mapper.PmsMerchandiseMapper;
import com.zscat.pms.service.PmsMerchandiseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("pmsMerchandiseService")
public class PmsMerchandiseServiceImpl implements PmsMerchandiseService {
	@Autowired
	private PmsMerchandiseMapper pmsMerchandiseMapper;
    @Override
    public List<PmsMerchandise> queryHotPmsMerchandiseByStoreId(Integer storeId) {
        return null;
    }
   /**
    * 姓名：张古良
    * 根据菜名查询菜品
    * 修改时间：2019.7.14
    */
	@Override
	public List<PmsMerchandise> queryHotPmsMerchandiseName(String name) {
		// TODO Auto-generated method stub
		return pmsMerchandiseMapper.queryPmsMerchandise(name);
	}
	/**
	 * 姓名：张古良
	 * 根据菜名对象查询菜品
	 * 修改时间：2019.7.28
	 */
	@Override
	public List<PmsMerchandise> queryHotqueryPmsMerchandiseList(PmsMerchandise pmsMerchandise) {
		return pmsMerchandiseMapper.queryPmsMerchandiseList(pmsMerchandise);
	}
	/**
	 * 姓名：张古良
	 * 根据菜名对象修改菜品
	 * 修改时间：2019.7.28
	 */
	@Override
	public int updatePmsMerchandise(PmsMerchandise pms) {
		return pmsMerchandiseMapper.updateByPrimaryKey(pms);
		
	}
	/**
	 * 姓名：张古良
	 * 根据菜名id删除菜品
	 * 修改时间：2019.7.29
	 */
	@Override
	public int deletePmsMerchandiseById(Integer id) {
		return pmsMerchandiseMapper.deleteByPrimaryKey(id);
		
	}
	/**
	 * 姓名：张古良
	 * 增加菜品
	 * 修改时间：2019.7.29
	 */
	@Override
	public int insertPmsMerchandise(PmsMerchandise pms) {
		return pmsMerchandiseMapper.insertSelective(pms);
		
	}

	@Override
	public List<String> queryFoodClassfiyList(Integer storeId) {
		PmsMerchandiseExample example = new PmsMerchandiseExample();
		PmsMerchandiseExample.Criteria criteria = example.createCriteria();
		criteria.andStoreMerchandiseIdEqualTo(storeId);
		Stream<String> distinct = pmsMerchandiseMapper.selectByExample(example).stream().map(PmsMerchandise::getClassificationOfFood).distinct();
		return distinct.collect(Collectors.toList());
	}

	@Override
	public int queryHotPmsMerchandiseCountByExample() {
		return pmsMerchandiseMapper.countByExample(null);
	}
}
