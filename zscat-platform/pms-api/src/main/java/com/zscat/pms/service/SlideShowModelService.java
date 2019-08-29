package com.zscat.pms.service;

import com.zscat.core.model.PmsStoreMerchant;
import com.zscat.pms.dto.SlideShowVO;

import java.util.List;

public interface SlideShowModelService {
    /**
     * 根据店铺列表返回首页轮播
     * @param pmsStoreMerchants
     * @return
     */
    List<SlideShowVO> querySlideByPmsStoreMerchantList(List<PmsStoreMerchant> pmsStoreMerchants);
}
