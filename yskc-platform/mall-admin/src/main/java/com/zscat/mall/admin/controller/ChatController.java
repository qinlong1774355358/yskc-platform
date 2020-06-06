package com.zscat.mall.admin.controller;


import com.yskc.pms.entity.PmsChatControlRecord;
import com.yskc.pms.entity.PmsChatRecord;
import com.yskc.pms.entity.PmsGroupManagement;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ChatController
 * @Description: 聊天功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
@RestController()
@RequestMapping(value = "/chat")
public class ChatController {
	@Autowired
	private PmsChatService pmsChatService;
	/**
	 * 功能：聊天列表
	 * @return
	 */
	@GetMapping(value = "/getCharquery")
    public CommonResult getcharquery(){
		System.out.println("123456");
		List<PmsChatControlRecord> list = pmsChatService.queryPmsChatControlRecord();
		CommonResult result = new CommonResult();
		return result.success(list);
    }
    /**
	 * 功能：群管理列表
	 * @return
	 */
	@GetMapping(value = "/getGroupquery")
    public CommonResult getGroupquery(){
		List<PmsGroupManagement> list = pmsChatService.queryHotPmsGroupManagement();
		CommonResult result = new CommonResult();
		return result.success(list);
    }
    /**
	 * 功能：聊天记录列表
	 * @return
	 */
	@GetMapping(value = "/getChatRecord")
    public CommonResult getChatRecord(){
		List<PmsChatRecord> list = pmsChatService.queryHotPmsChatRecord();
		CommonResult result = new CommonResult();
		return result.success(list);
    }
}
