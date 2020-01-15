package com.zscat.mall.admin.controller;


import com.yskc.pms.entity.PmsConnectionArea;
import com.yskc.pms.entity.PmsFriendCircle;
import com.yskc.pms.entity.PmsOutsideEvenLink;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsFriendCircleService;
import com.zscat.mall.admin.validator.SCaptchaValidator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName: FriendCircleController
 * @Description: 朋友圈功能
 * @author： luoli
 */
@RestController()
@RequestMapping(value = "/friend")
public class FriendCircleController {

	@Resource
	private PmsFriendCircleService pmsFriendCircleService;

	/**
	 * 查询朋友圈
	 * @param pmsFriendCircle
	 * @return
	 */
	@GetMapping(value = "/list")
	public CommonResult list(PmsFriendCircle pmsFriendCircle,
							 @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
							 @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize) {
		CommonResult result = new CommonResult();
		if (StringUtils.isBlank(pmsFriendCircle.getUserAccount())) {
			return result.success("");
		}
		List<PmsFriendCircle> list = pmsFriendCircleService.queryPmsFriendCircle(pmsFriendCircle, pageNum, pageSize);
		return result.success(list);
	}

	/**
	 * 添加朋友圈
	 * @param pmsFriendCircle
	 * @return
	 */
	@PostMapping("/add")
	public CommonResult addFriendCircle(PmsFriendCircle pmsFriendCircle){
		CommonResult result = new CommonResult();
		if(pmsFriendCircleService.addAd(pmsFriendCircle)){
			return result.success(null);
		}
		return result.failed();
	}

	/**
	 * 下架广告
	 * @param id 朋友圈id
	 * @return
	 */
	@PutMapping("/takeOff")
	public CommonResult takeOff(@RequestParam Integer id){
		CommonResult result = new CommonResult();
		if(pmsFriendCircleService.takeOff(id)){
			return result.success(null);
		}
		return result.failed();
	}
}
