package com.zscat.core.server;


import com.yskc.pms.entity.PmsConnectionArea;
import com.yskc.pms.entity.PmsFriendCircle;
import com.zscat.common.result.CommonResult;

import java.util.List;

/**
 * @ClassName: PmsFriendCircleService
 * @Description: 朋友圈
 * @author： luoli
 */
public interface PmsFriendCircleService {

    /**
     * 分页查询朋友圈列表记录
     *
     * @param pmsFriendCircle 朋友圈对象
     * @return
     */
    List<PmsFriendCircle> queryPmsFriendCircle(PmsFriendCircle pmsFriendCircle, Integer pageNum, Integer pageSize);

    /**
     * 添加朋友圈
     *
     * @param pmsFriendCircle 朋友圈对象
     * @return
     */
    boolean addAd(PmsFriendCircle pmsFriendCircle);
    /**
     * 下架广告
     *
     * @param  id 朋友圈id
     * @return
     */
    boolean takeOff(Integer id);
}