package com.zscat.core.server;


import com.yskc.pms.entity.PmsConnectionArea;
import com.zscat.common.result.CommonResult;

import java.util.List;

/**
 * @ClassName: PmsConnectionAreaService
 * @Description: 人脉商圈
 * @author： luoli
 */
public interface PmsConnectionAreaService {

    /**
     * 分页查询人脉商圈列表记录
     *
     * @param pmsConnectionArea 人脉商圈对象
     * @return
     */
    List<PmsConnectionArea> queryPmsConnectionArea(PmsConnectionArea pmsConnectionArea, Integer pageNum, Integer pageSize);

    /**
     * 删除内容
     *
     * @param id 人脉商圈对象id
     * @return
     */
    CommonResult delIllegalText(Integer id);

    CommonResult warn(String userAccount);

    /**
     * 封号
     *
     * @param id 人脉商圈对象id
     * @return
     */
    CommonResult closeAccount(Integer id);

}