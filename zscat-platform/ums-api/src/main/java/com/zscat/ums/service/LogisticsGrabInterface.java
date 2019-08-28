package com.zscat.ums.service;


import com.zscat.ums.model.WaybillGrabResult;

public interface LogisticsGrabInterface {
	
	/**
	 * 物流抓取
	 * @param logisticsCompanyCode
	 * @param waybillNum
	 * @return
	 * @throws Exception
	 */
	WaybillGrabResult queryWayBillDetail(String logisticsCompanyCode, String waybillNum) throws Exception;
}
