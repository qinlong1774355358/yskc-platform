package com.zscat.pms.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zscat.core.model.PmsStoreMerchant;
import com.zscat.core.model.PmsStoreMerchantExample;
import com.zscat.pms.mapper.PmsStoreMerchantMapper;
import com.zscat.pms.service.PmsStoreMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsStoreMerchantService")
public class PmsStoreMerchantServiceImpl implements PmsStoreMerchantService {


    @Autowired
    private PmsStoreMerchantMapper pmsStoreMerchantMapper;

    @Override
    public List<PmsStoreMerchant> queryPmsStoreMerchantByLocation(double longitude, double latitude, int limit) {
        Map<String, Object> params = new HashMap<>();
        params.put("longitude",longitude);
        params.put("latitude",latitude);
        params.put("limit",limit);
        return pmsStoreMerchantMapper.selectByLoction(params);
    }

    @Override
    public PageInfo<PmsStoreMerchant> queryPmsStoreMerchantByPage(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        PmsStoreMerchantExample example = new PmsStoreMerchantExample();
        List<PmsStoreMerchant> pmsStoreMerchants = pmsStoreMerchantMapper.selectByExample(example);
        PageInfo<PmsStoreMerchant> pageInfo = new PageInfo<PmsStoreMerchant>(pmsStoreMerchants);
        return pageInfo;
    }

    @Override
    public PmsStoreMerchant queryPmsStoreMerchantById(int id) {
        return pmsStoreMerchantMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean update(PmsStoreMerchant pmsStoreMerchant) {
       return pmsStoreMerchantMapper.updateByPrimaryKey(pmsStoreMerchant) > 0;
    }

    @Override
    public boolean save(PmsStoreMerchant pmsStoreMerchant) {
        return pmsStoreMerchantMapper.insert(pmsStoreMerchant) > 0;
    }

    @Override
    public boolean del(int id) {
        PmsStoreMerchant pmsStoreMerchant = pmsStoreMerchantMapper.selectByPrimaryKey(id);
        if (null != pmsStoreMerchant){
            Integer enable = pmsStoreMerchant.getEnable();
            enable = 0 == enable? 1 : 0;
            pmsStoreMerchant.setEnable(enable);
            return pmsStoreMerchantMapper.updateByPrimaryKey(pmsStoreMerchant) > 0;
        }
        return false;
    }
}
