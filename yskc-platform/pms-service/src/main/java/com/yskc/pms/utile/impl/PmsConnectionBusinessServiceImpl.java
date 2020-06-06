package com.yskc.pms.utile.impl;

import com.yskc.pms.entity.*;
import com.yskc.pms.mapper.PmsConnectionAreaMapper;
import com.yskc.pms.mapper.PmsFriendCircleMapper;
import com.yskc.pms.mapper.PmsTradeAreaMapper;
import com.zscat.core.server.PmsConnectionBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName PmsConnectionBusinessServiceImpl
 * @Description: 人脉商圈
 * @Author 张古良
 * @Date 2020/6/3 10:42
 **/
@Service("pmsConnectionBusinessService")
public class PmsConnectionBusinessServiceImpl implements PmsConnectionBusinessService {

    /**
     * 后台人脉商圈记录表
     */
    @Autowired
    private PmsConnectionAreaMapper pmsConnectionAreaMapper;

    /**
     * 后台商圈记录表
     */
    @Autowired
    private PmsTradeAreaMapper pmsTradeAreaMapper;

    /**
     * 后台朋友圈记录表
     */
    @Autowired
    private PmsFriendCircleMapper pmsFriendCircleMapper;

    /**
     * 人脉商圈列表
     * @param pmsConnectionArea
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsConnectionArea> queryPmsConnectionArea(PmsConnectionArea pmsConnectionArea, int startRow, int pageSize) {
        System.out.println("pmsConnectionArea=="+pmsConnectionArea);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsConnectionAreaExample example = new PmsConnectionAreaExample();
        PmsConnectionAreaExample.Criteria criteria = example.createCriteria();
        /*criteria.andUserAccountEqualTo(pmsVideoControlRecord.getUserAccount());*/
        criteria.andUserAccountLike("%"+pmsConnectionArea.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsConnectionAreaMapper.selectByExample(example);
    }

    /**
     * 商圈列表
     * @param pmsTradeArea
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsTradeArea> queryPmsTradeArea(PmsTradeArea pmsTradeArea, int startRow, int pageSize) {
        System.out.println("pmsTradeArea=="+pmsTradeArea);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsTradeAreaExample example = new PmsTradeAreaExample();
        PmsTradeAreaExample.Criteria criteria = example.createCriteria();
        /*criteria.andUserAccountEqualTo(pmsVideoControlRecord.getUserAccount());*/
        criteria.andUserAccountLike("%"+pmsTradeArea.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsTradeAreaMapper.selectByExample(example);
    }

    /**
     * 朋友圈列表
     * @param pmsFriendCircle
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsFriendCircle> queryPmsFriendCircle(PmsFriendCircle pmsFriendCircle, int startRow, int pageSize) {
        System.out.println("pmsFriendCircle=="+pmsFriendCircle);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsFriendCircleExample example = new PmsFriendCircleExample();
        PmsFriendCircleExample.Criteria criteria = example.createCriteria();
        /*criteria.andUserAccountEqualTo(pmsVideoControlRecord.getUserAccount());*/
        criteria.andUserAccountLike("%"+pmsFriendCircle.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsFriendCircleMapper.selectByExample(example);
    }
}
