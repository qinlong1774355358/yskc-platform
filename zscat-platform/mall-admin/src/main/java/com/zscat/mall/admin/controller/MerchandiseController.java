package com.zscat.mall.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zscat.core.model.PmsMerchandise;
import com.zscat.pms.service.PmsMerchandiseService;

import springfox.documentation.annotations.ApiIgnore;

/**
 * 菜品管理
 */
@Controller
@ApiIgnore
@RequestMapping("/adm/merchandise")
public class MerchandiseController {
	
	@Autowired
    private PmsMerchandiseService pmsMerchandiseService;
	
    @RequestMapping("/list")
    public String list(Model model,PmsMerchandise pmsMerchandise,String offsets){
    	int offset = 1;
    	//分页查询
    	if(StringUtils.isNumeric(offsets)) {
    		offset=Integer.parseInt(offsets);
    	}
    	int number = ((offset-1)*10);
    	HashMap<String, Object> map = new HashMap<String, Object>();
    	map.put("number", number);
    	map.put("count", 10);
    	pmsMerchandise.setMap(map);
    	List<PmsMerchandise> list=  pmsMerchandiseService.queryHotqueryPmsMerchandiseList(pmsMerchandise);
    	int sum =  pmsMerchandiseService.queryHotPmsMerchandiseCountByExample();
    	map.put("current", offset);
    	map.put("total", sum);
    	
    	System.out.println(list);
    	model.addAttribute("array", list);
    	model.addAttribute("page", map);
        return "admin/merchandise/list";
    }
    

	/*
     * 根据id修改商品信息
     * */
     @RequestMapping("/updateform")
     public String updete(Model model,String id){
    	 PmsMerchandise pmsMerchandise = new PmsMerchandise();
    	 pmsMerchandise.setId(Integer.parseInt(id));
    	 List<PmsMerchandise> list=  pmsMerchandiseService.queryHotqueryPmsMerchandiseList(pmsMerchandise);
    	 model.addAttribute("entity", list.get(0));
    	 System.out.println(list);
     	 model.addAttribute("page", list.size());
    	 return "admin/merchandise/updateform";
     }
     /*
      * 增加商品信息
      * 姓名:张古良
      * 添加时间：2019.7.29
      * */
     @RequestMapping("/addform")
     public String addform(){
    	 return "admin/merchandise/addform";
     }
     
}
