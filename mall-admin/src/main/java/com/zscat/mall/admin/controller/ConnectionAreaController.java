package com.zscat.mall.admin.controller;

import com.yskc.pms.entity.PmsConnectionArea;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsConnectionAreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ConnectionAreaController
 * @Description: 人脉商圈
 * @author： luoli
 */
@RestController
@RequestMapping("/connection")
public class ConnectionAreaController {

    @Resource
    private PmsConnectionAreaService pmsConnectionAreaService;

    @GetMapping(value = "/list")
    public CommonResult list(PmsConnectionArea pmsConnectionArea,
                                     @RequestParam(value = "pageNum",defaultValue = "1",required = false) Integer pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "10",required = false) Integer pageSize){
        if (null == pmsConnectionArea.getUserAccount()) {
            pmsConnectionArea.setUserAccount("");
        }
        List<PmsConnectionArea> list = pmsConnectionAreaService.queryPmsConnectionArea(pmsConnectionArea, pageNum, pageSize);
        CommonResult result = new CommonResult();
        return result.success(list);
    }

    /**
     *
     * 删除违规内容
     * @param id 人脉商圈列表对象id
     */
    @GetMapping(value = "/del/text")
    public CommonResult delIllegalText(@RequestParam(value = "id") Integer id){

        return pmsConnectionAreaService.delIllegalText(id);
    }

    /**
     *
     * 封号
     * @param id 人脉商圈列表对象id
     */
    @GetMapping(value = "/close")
    public CommonResult closeAccount(@RequestParam(value = "id") Integer id){

        return pmsConnectionAreaService.closeAccount(id);
    }

}
