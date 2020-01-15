package com.yskc.pms.utile.impl;

import com.yskc.pms.entity.PmsConnectionArea;
import com.yskc.pms.entity.PmsConnectionAreaExample;
import com.yskc.pms.entity.PmsFriendCircle;
import com.yskc.pms.entity.PmsFriendCircleExample;
import com.yskc.pms.mapper.PmsConnectionAreaMapper;
import com.yskc.pms.mapper.PmsFriendCircleMapper;
import com.zscat.common.exception.BusinessException;
import com.zscat.common.result.CommonResult;
import com.zscat.core.constant.FriendCircleAdStatus;
import com.zscat.core.server.PmsConnectionAreaService;
import com.zscat.core.server.PmsFriendCircleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: PmsFriendCircleServiceImpl
 * @Description: 朋友圈
 * @author： luoli
 */
@Slf4j
@Service("pmsFriendCircleService")
public class PmsFriendCircleServiceImpl implements PmsFriendCircleService {
    @Resource
    private PmsFriendCircleMapper pmsFriendCircleMapper;

    /**
     * 分页查询人脉商圈列表记录
     *
     * @param pmsFriendCircle 朋友圈对象
     * @return
     */
    @Override
    public List<PmsFriendCircle> queryPmsFriendCircle(PmsFriendCircle pmsFriendCircle, Integer pageNum, Integer pageSize) {
        PmsFriendCircleExample example = new PmsFriendCircleExample();
        PmsFriendCircleExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%" + pmsFriendCircle.getUserAccount() + "%");
        example.setStartRow(pageNum);
        example.setPageSize(pageSize);

        return pmsFriendCircleMapper.selectByExample(example);
    }

    @Override
    public boolean addAd(PmsFriendCircle pmsFriendCircle) {
        pmsFriendCircle.setAdStatus(FriendCircleAdStatus.UP);
        pmsFriendCircle.setCreateTime(new Date());
        int count = pmsFriendCircleMapper.insertSelective(pmsFriendCircle);
        return count > 0;
    }

    @Override
    public boolean takeOff(Integer id) {
        PmsFriendCircle pmsFriendCircle = pmsFriendCircleMapper.selectByPrimaryKey(id);
        if (pmsFriendCircle == null) {
            throw new BusinessException("没有该朋友圈");
        }
        pmsFriendCircle.setAdStatus(FriendCircleAdStatus.DOWN);
        pmsFriendCircle.setUpdateTime(new Date());
        int count = pmsFriendCircleMapper.updateByPrimaryKey(pmsFriendCircle);
        return count > 0;
    }
}