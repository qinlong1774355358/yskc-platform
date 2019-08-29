package com.zscat.mall.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zscat.common.result.CommonResult;
import com.zscat.core.model.PmsStoreMerchant;
import com.zscat.pms.service.PmsStoreMerchantService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("adm/storeMerchant")
/**
 * 店铺管理
 */
public class StoreMerchantController {

    @Autowired
    private PmsStoreMerchantService pmsStoreMerchantService;

    @RequestMapping("list")
    public String list(String offset, Model model){
        int pageNo = 1;
        //分页查询
        if(StringUtils.isNumeric(offset)) {
            pageNo=Integer.parseInt(offset);
        }
        int pageSize = 5;
        PageInfo<PmsStoreMerchant> pageInfo = pmsStoreMerchantService.queryPmsStoreMerchantByPage(pageNo, pageSize);

        model.addAttribute("page", pageInfo);
        return "admin/store/list";
    }

    /**
     *跳转到编辑页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/updateform")
    public String updateform(Model model,String id){
        PmsStoreMerchant pmsStoreMerchant = pmsStoreMerchantService.queryPmsStoreMerchantById(Integer.parseInt(id));
        model.addAttribute("entity", pmsStoreMerchant);
        return "admin/store/updateform";
    }

    /**
     * 跳转到新增页面
     * @param model
     * @return
     */
    @RequestMapping("/addform")
    public String addform(Model model){
        return "admin/store/addform";
    }
    /**
     * 编辑店铺
     * @param pmsStoreMerchant
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public CommonResult edit(PmsStoreMerchant pmsStoreMerchant){
        CommonResult commonResult = new CommonResult();
        if(null != pmsStoreMerchantService.queryPmsStoreMerchantById(pmsStoreMerchant.getId()) && pmsStoreMerchantService.update(pmsStoreMerchant)){
             commonResult.success(null);
        }else {
            commonResult.failed();
        }
        return  commonResult;
    }

    /**
     * 新增店铺
     * @param pmsStoreMerchant
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public CommonResult add(PmsStoreMerchant pmsStoreMerchant){
        pmsStoreMerchant.setCreateDate(new Date());
        pmsStoreMerchant.setEnable(0);
        CommonResult commonResult = new CommonResult();
        return   pmsStoreMerchantService.save(pmsStoreMerchant)?commonResult.success(null):commonResult.failed();
    }

    @RequestMapping("/del")
    @ResponseBody
    public CommonResult del(String id){
        CommonResult commonResult = new CommonResult();
        if( pmsStoreMerchantService.del(Integer.parseInt(id))){
            commonResult.success(null);
        }else {
            commonResult.failed();
        }
        return  commonResult;
    }
}
