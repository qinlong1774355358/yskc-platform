package com.zscat.mall.admin.controller;

import com.yskc.pms.entity.*;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsConnectionBusinessService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ConnectionBusinessController
 * @Description: 人脉商圈功能
 * @author： zhangguliang
 * @date 2020年6月3日
 */
@RestController()
@RequestMapping("/ConnectionBusiness")
public class ConnectionBusinessController {
	
	@Autowired
    private PmsConnectionBusinessService pmsConnectionBusinessService;

	/**
	 * 功能：人脉商圈列表
	 * @param pmsConnectionArea 后台人脉商圈记录表
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
	@GetMapping(value = "/selectConnectionAreaList")
    public CommonResult selectConnectionAreaList(PmsConnectionArea pmsConnectionArea, String offsets,String pageSizes){
		if(null==pmsConnectionArea.getUserAccount()){
			pmsConnectionArea.setUserAccount("");
		}
		int pageNo = 1;
		int pageSize = 10;
		//分页查询
		if(StringUtils.isNumeric(offsets)) {
			pageNo=Integer.parseInt(offsets);
		}
		//条数
		if(StringUtils.isNumeric(pageSizes)){
			pageSize=Integer.parseInt(pageSizes);
		}
    	List<PmsConnectionArea> list=  pmsConnectionBusinessService.queryPmsConnectionArea(pmsConnectionArea,pageNo,pageSize);
		System.out.println("list=="+list);
    	CommonResult result = new CommonResult();
        return result.success(list);
    }

    /**
	 * 功能：商圈
	 * @param pmsTradeArea 后台商圈记录表
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
	@GetMapping(value = "/selectTradeArea")
    public CommonResult selectVoidePlay(PmsTradeArea pmsTradeArea, String offsets,String pageSizes){
		if(null==pmsTradeArea.getUserAccount()){
			pmsTradeArea.setUserAccount("");
		}
		int pageNo = 1;
		int pageSize = 10;
		//分页查询
		if(StringUtils.isNumeric(offsets)) {
			pageNo=Integer.parseInt(offsets);
		}
		//条数
		if(StringUtils.isNumeric(pageSizes)){
			pageSize=Integer.parseInt(pageSizes);
		}
    	List<PmsTradeArea> list=  pmsConnectionBusinessService.queryPmsTradeArea(pmsTradeArea,pageNo,pageSize);
		System.out.println("list=="+list);
    	CommonResult result = new CommonResult();
        return result.success(list);
    }

	/**
	 * 功能：朋友圈查询列表
	 * @param pmsFriendCircle 朋友圈记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectFriendCircle")
     public CommonResult selectLiveRecord(PmsFriendCircle pmsFriendCircle,String offsets,String pageSizes){
		 if(null==pmsFriendCircle.getUserAccount()){
			 pmsFriendCircle.setUserAccount("");
		 }
		 int pageNo = 1;
		 int pageSize=10;
		 //分页查询
		 if(StringUtils.isNumeric(offsets)) {
			 pageNo=Integer.parseInt(offsets);
		 }
		 //条数
		 if(StringUtils.isNumeric(pageSizes)){
			 pageSize=Integer.parseInt(pageSizes);
		 }
		 List<PmsFriendCircle> list=pmsConnectionBusinessService.queryPmsFriendCircle(pmsFriendCircle,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }
}
