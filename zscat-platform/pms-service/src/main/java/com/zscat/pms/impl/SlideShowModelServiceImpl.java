package com.zscat.pms.impl;

import com.zscat.core.model.PmsStoreMerchant;
import com.zscat.pms.dto.SlideShowVO;
import com.zscat.pms.service.SlideShowModelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("slideShowModelService")
public class SlideShowModelServiceImpl implements SlideShowModelService {

    @Override
    public List<SlideShowVO> querySlideByPmsStoreMerchantList(List<PmsStoreMerchant> pmsStoreMerchants) {
        List<SlideShowVO> slideShowModels = new ArrayList<>();
        for (PmsStoreMerchant pmsStoreMerchant: pmsStoreMerchants) {
            SlideShowVO slideShowModel =new SlideShowVO();
            slideShowModel.setStoreId(pmsStoreMerchant.getId()).setImgUrl(pmsStoreMerchant.getPicture());
            slideShowModels.add(slideShowModel);
        }
        return slideShowModels;
    }
}
