package com.zscat.mall.admin.controller;

import com.yskc.pms.entity.*;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsFinancialService;
import com.zscat.core.server.PmsVideoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: FinancialController
 * @Description: 财务管理
 * @author： zhangguliang
 * @date 2020年6月3日
 */
@RestController()
@RequestMapping("/financial")
public class FinancialController {
	
	@Autowired
    private PmsFinancialService pmsFinancialService;

	/**
	 * 功能：财务管理列表
	 * @param pmsFinancialManagement 后台财务管理记录表
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
	@GetMapping(value = "/selectFinancialManagementList")
    public CommonResult selectFinancialManagementList(PmsFinancialManagement pmsFinancialManagement, String offsets,String pageSizes){
		if(null==pmsFinancialManagement.getUserAccount()){
			pmsFinancialManagement.setUserAccount("");
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
    	List<PmsFinancialManagement> list=  pmsFinancialService.queryPmsFinancialManagement(pmsFinancialManagement,pageNo,pageSize);
		System.out.println("list=="+list);
    	CommonResult result = new CommonResult();
        return result.success(list);
    }

    /**
	 * 功能：红包列表
	 * @param pmsRedPacket 后台红包列表
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
	@GetMapping(value = "/selectRedPacket")
    public CommonResult selectRedPacket(PmsRedPacket pmsRedPacket, String offsets,String pageSizes){
		if(null==pmsRedPacket.getUserAccount()){
			pmsRedPacket.setUserAccount("");
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
    	List<PmsRedPacket> list=  pmsFinancialService.queryPmsRedPacket(pmsRedPacket,pageNo,pageSize);
		System.out.println("list=="+list);
    	CommonResult result = new CommonResult();
        return result.success(list);
    }

	/**
	 * 功能：红包领取记录查询列表
	 * @param pmsGetRedPackage 红包领取记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectGetRedPackage")
     public CommonResult selectGetRedPackage(PmsGetRedPackage pmsGetRedPackage,String offsets,String pageSizes){
		 if(null==pmsGetRedPackage.getUserAccount()){
			 pmsGetRedPackage.setUserAccount("");
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
		 List<PmsGetRedPackage> list=pmsFinancialService.queryPmsGetRedPackage(pmsGetRedPackage,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：钱包管理列表
	 * @param pmsWalletManagement 钱包管理记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectWalletManagement")
     public CommonResult selectPmsRecordedRecord(PmsWalletManagement pmsWalletManagement, String offsets, String pageSizes){
		 if(null==pmsWalletManagement.getUserAccount()){
			 pmsWalletManagement.setUserAccount("");
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
		 List<PmsWalletManagement> list=pmsFinancialService.queryPmsWalletManagement(pmsWalletManagement,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：钱包充值记录列表
	 * @param pmsRechargeRecord 充值记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectRechargeRecord")
     public CommonResult selectPmsRechargeRecord(PmsRechargeRecord pmsRechargeRecord, String offsets, String pageSizes){
		 if(null==pmsRechargeRecord.getUserAccount()){
			 pmsRechargeRecord.setUserAccount("");
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
		 List<PmsRechargeRecord> list=pmsFinancialService.queryPmsRechargeRecord(pmsRechargeRecord,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：提现记录查询列表
	 * @param pmsWithdrawRecord 提现记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectWithdrawRecord")
     public CommonResult selectWithdrawRecord(PmsWithdrawRecord pmsWithdrawRecord, String offsets, String pageSizes){
		 if(null==pmsWithdrawRecord.getUserAccount()){
			 pmsWithdrawRecord.setUserAccount("");
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
		 List<PmsWithdrawRecord> list=pmsFinancialService.queryPmsWithdrawRecord(pmsWithdrawRecord,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：收入记录查询列表
	 * @param pmsIncomeRecords 收入记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectIncomeRecords")
     public CommonResult selectIncomeRecords(PmsIncomeRecords pmsIncomeRecords, String offsets, String pageSizes){
		 if(null==pmsIncomeRecords.getUserAccount()){
			 pmsIncomeRecords.setUserAccount("");
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
		 List<PmsIncomeRecords> list=pmsFinancialService.queryPmsIncomeRecords(pmsIncomeRecords,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：支出记录查询列表
	 * @param pmsSupportRecord 支出记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectSupportRecord")
     public CommonResult selectSupportRecord(PmsSupportRecord pmsSupportRecord, String offsets, String pageSizes){
		 if(null==pmsSupportRecord.getUserAccount()){
			 pmsSupportRecord.setUserAccount("");
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
		 List<PmsSupportRecord> list=pmsFinancialService.queryPmsSupportRecord(pmsSupportRecord,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：提现审核管理查询列表
	 * @param pmsWithdrawCheckManagement 提现审核管理
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectWithdrawCheckManagement")
     public CommonResult selectWithdrawCheckManagement(PmsWithdrawCheckManagement pmsWithdrawCheckManagement, String offsets, String pageSizes){
		 if(null==pmsWithdrawCheckManagement.getUserAccount()){
			 pmsWithdrawCheckManagement.setUserAccount("");
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
		 List<PmsWithdrawCheckManagement> list=pmsFinancialService.queryWithdrawCheckManagement(pmsWithdrawCheckManagement,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }

     /**
	 * 功能：提现审核记录查询列表
	 * @param pmsWithdrawDepositRecord 提现审核记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectWithdrawDepositRecord")
     public CommonResult selectWithdrawDepositRecord(PmsWithdrawDepositRecord pmsWithdrawDepositRecord, String offsets, String pageSizes){
		 if(null==pmsWithdrawDepositRecord.getUserAccount()){
			 pmsWithdrawDepositRecord.setUserAccount("");
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
		 List<PmsWithdrawDepositRecord> list=pmsFinancialService.queryWithdrawDepositRecord(pmsWithdrawDepositRecord,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }
}
