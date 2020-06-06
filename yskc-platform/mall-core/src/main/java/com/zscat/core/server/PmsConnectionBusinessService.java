package com.zscat.core.server;


import com.yskc.pms.entity.*;

import java.util.List;

/**
 * @ClassName: PmsConnectionBusinessService
 * @Description: 人脉商圈功能
 * @author： zhangguliang
 * @date 2020年6月3日
 */
public interface PmsConnectionBusinessService {

    /**
     * 查询人脉商圈列表状态
     * @param pmsConnectionArea
     * @return
     */
    List<PmsConnectionArea> queryPmsConnectionArea(PmsConnectionArea pmsConnectionArea, int pageSize, int startRow);

    /**
     * 查询商圈列表状态
     * @param pmsTradeArea
     * @return
     */
    List<PmsTradeArea> queryPmsTradeArea(PmsTradeArea pmsTradeArea, int pageSize, int startRow);

    /**
     * 查询朋友圈列表状态
     * @param pmsFriendCircle
     * @return
     */
    List<PmsFriendCircle> queryPmsFriendCircle(PmsFriendCircle pmsFriendCircle, int pageSize, int startRow);

}
