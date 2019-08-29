package com.zscat.mall.admin.controller;


import com.zscat.common.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping(value = "/index")
    public CommonResult index(){
		CommonResult result = new CommonResult();
		return result.success(null);
    }
}
