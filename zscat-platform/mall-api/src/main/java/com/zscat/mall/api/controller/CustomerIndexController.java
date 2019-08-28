package com.zscat.mall.api.controller;

import com.alibaba.fastjson.JSON;
import com.zscat.common.result.CommonResult;
import com.zscat.common.util.EncodUtil;
import com.zscat.core.model.PmsMerchandise;
import com.zscat.core.model.PmsStoreMerchant;
import com.zscat.pms.dto.SlideShowVO;
import com.zscat.pms.service.PmsMerchandiseService;
import com.zscat.pms.service.PmsStoreMerchantService;
import com.zscat.pms.service.SlideShowModelService;
import com.zscat.ums.model.UmsAdmin;
import com.zscat.ums.service.UmsAdminService;
import org.apache.commons.lang3.math.NumberUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.util.EncodingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Array;
import java.util.List;

/**
 * 客户端首页查询
 */
@RestController
@Api(tags = "CustomerIndexController", description = "客户端首页查询")
@RequestMapping("/search")
public class CustomerIndexController {

    @Autowired
    private PmsMerchandiseService pmsMerchandiseService;
    @Autowired
    private PmsStoreMerchantService pmsStoreMerchantService;
    @Autowired
    private SlideShowModelService slideShowModelService;
    @Autowired
    private UmsAdminService umsAdminService;
    
    /**
     * 杨鹏飞
     * 修改人：张古良
     * 修改时间:2019.8.3
     * @return
     */
    @ApiOperation(value = "经纬度/位置返回距离用户最近的店铺")
    @RequestMapping(value = "/getFoodList", method = RequestMethod.POST)
    public CommonResult getFoodList(String longitude, String latitude, String limit) {
    	Double longitudes = 0.0;
    	Double latitudes = 0.0;
    	Integer limits = 10;
    	//判断经度是否为空或为double类型
    	if(NumberUtils.isNumber(longitude)) {
    		longitudes = Double.parseDouble(longitude);
    	}
    	//判断违度是否为空或为double类型
    	if(NumberUtils.isNumber(latitude)) {
    		latitudes = Double.parseDouble(latitude);    		
    	}
    	//判断条数是否为空或为Integer类型
    	if(StringUtils.isNumeric(limit)) {
    		limits = Integer.parseInt(limit);    		
    	}
    	List<PmsStoreMerchant> list = pmsStoreMerchantService.queryPmsStoreMerchantByLocation(longitudes, latitudes, limits);
        CommonResult result = new CommonResult();
        return result.success(list);
    }

    /**
     * 张古良
     * @return
     */
    @ApiOperation(value = "用户搜索内容返回搜索")
    @RequestMapping(value = "/searchFoodList", method = RequestMethod.GET)
    public CommonResult searchFoodList(String name) {
    	List<PmsMerchandise> list=  pmsMerchandiseService.queryHotPmsMerchandiseName(name);
    	CommonResult result = new CommonResult();
        return result.success(list);
    }

    /**
     * 张亮
     * @return
     */
    @ApiOperation(value = "用户位置获得附近的店铺，默认坐标北京")
    @RequestMapping(value = "/getSlideshow", method = RequestMethod.GET)
    public CommonResult getSlideshow(@RequestParam(required = false,defaultValue  = "116.46")double longitude, @RequestParam(required = false,defaultValue  = "117.1")double latitude, @RequestParam(required = false,defaultValue  = "10" )int limit ) {
        CommonResult result = new CommonResult();
        List<PmsStoreMerchant> pmsStoreMerchants = pmsStoreMerchantService.queryPmsStoreMerchantByLocation(longitude, latitude, limit);
        List<SlideShowVO> slideShows =  slideShowModelService.querySlideByPmsStoreMerchantList(pmsStoreMerchants);
        return result.success(slideShows);
    }
    
    /**
	    * 张古良
	     * 根据用户名密码跨域获取数据
     * @return
     * @throws Exception 
     * @throws  
     */
    @ApiOperation(value = "后台登录")
    @RequestMapping(value = "/api/login/login", method = RequestMethod.POST)
    public CommonResult chack(String username,String password) throws Exception {
    	String list= "2";
    	System.out.println(username);
    	System.out.println(password);
    	if(username==null||username.equals("")) {
    		
    	}else if (password==null||password.equals("")) {
			
		}else {
			list=  umsAdminService.login(username,EncodUtil.EncoderByMd5(password));			
		}
    	CommonResult result = new CommonResult();
        return result.success(list);
    }
}
