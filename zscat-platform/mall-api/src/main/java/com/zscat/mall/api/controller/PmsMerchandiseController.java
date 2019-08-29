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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.apache.http.util.EncodingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 客户端首页查询
 */
@RestController
@Api(tags = "PmsMerchandiseController", description = "菜品列表")
@RequestMapping("/api/admin/save")
public class PmsMerchandiseController {

    @Autowired
    private PmsMerchandiseService pmsMerchandiseService;

    /**
     * 张古良
     * 添加时间:2019.7.28
     * 修改菜品
     * @return
     */
    @ApiOperation(value = "修改菜品列表")
    @RequestMapping(value = "/merchandise/edit", method = RequestMethod.POST)
    public CommonResult update(PmsMerchandise pmsMerchandise) {
    	CommonResult result = new CommonResult();
    	int updateBoot = pmsMerchandiseService.updatePmsMerchandise(pmsMerchandise);
    	return result.success(updateBoot);
    }
    
    /**
     * 张古良
     * 添加时间:2019.7.29
     * 删除菜品
     * @return
     */
    @ApiOperation(value = "删除菜品")
    @RequestMapping(value = "/merchandise/deleteform", method = RequestMethod.GET)
    public CommonResult deleteform(String id) {
    	System.out.println("11111111111111111222222222222222222");
    	CommonResult result = new CommonResult();
    	int updateBoot = pmsMerchandiseService.deletePmsMerchandiseById(Integer.parseInt(id));
    	return result.success(updateBoot);
    }
    
    /**
     * 张古良
     * 添加时间:2019.7.29
     * 增加菜品
     * @return
     */
    @ApiOperation(value = "增加菜品")
    @RequestMapping(value = "/merchandise/add", method = RequestMethod.POST)
    public CommonResult insert(PmsMerchandise pmsMerchandise) {
    	CommonResult result = new CommonResult();
    	Date date = new Date();
    	SimpleDateFormat sim = new SimpleDateFormat("yyyyMMddHHmmss");
    	pmsMerchandise.setProductId(sim.format(date));
    	pmsMerchandise.setCreateDate(date);
    	int updateBoot = pmsMerchandiseService.insertPmsMerchandise(pmsMerchandise);
    	return result.success(updateBoot);
    }
}
