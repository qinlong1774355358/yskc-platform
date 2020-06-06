package com.zscat.core.server;


import com.yskc.pms.entity.*;

import java.util.List;

/**
 * @ClassName: PmsFinancialService
 * @Description: 财务管理
 * @author： zhangguliang
 * @date 2020年6月3日
 */
public interface PmsFinancialService {

    /**
     * 查询财务管理列表状态
     * @param pmsFinancialManagement
     * @return
     */
    List<PmsFinancialManagement> queryPmsFinancialManagement(PmsFinancialManagement pmsFinancialManagement, int startRow, int pageSize);

    /**
     * 查询红包列表状态
     * @param pmsRedPacket
     * @return
     */
    List<PmsRedPacket> queryPmsRedPacket(PmsRedPacket pmsRedPacket, int startRow, int pageSize);

    /**
     * 查询红包领取记录表状态
     * @param pmsGetRedPackage
     * @return
     */
    List<PmsGetRedPackage> queryPmsGetRedPackage(PmsGetRedPackage pmsGetRedPackage, int startRow, int pageSize);

    /**
     * 查询钱包管理列表状态
     * @param pmsWalletManagement
     * @return
     */
    List<PmsWalletManagement> queryPmsWalletManagement(PmsWalletManagement pmsWalletManagement, int startRow, int pageSize);

    /**
     * 充值记录列表状态
     * @param pmsRechargeRecord
     * @return
     */
    List<PmsRechargeRecord> queryPmsRechargeRecord(PmsRechargeRecord pmsRechargeRecord, int startRow, int pageSize);

    /**
     * 提现记录列表状态
     * @param pmsWithdrawRecord
     * @return
     */
    List<PmsWithdrawRecord> queryPmsWithdrawRecord(PmsWithdrawRecord pmsWithdrawRecord, int startRow, int pageSize);
    /**
     * 收入记录列表状态
     * @param pmsIncomeRecords
     * @return
     */
    List<PmsIncomeRecords> queryPmsIncomeRecords(PmsIncomeRecords pmsIncomeRecords, int startRow, int pageSize);

    /**
     * 支出记录列表状态
     * @param pmsSupportRecord
     * @return
     */
    List<PmsSupportRecord> queryPmsSupportRecord(PmsSupportRecord pmsSupportRecord, int startRow, int pageSize);

    /**
     * 提现审核管理列表状态
     * @param pmsWithdrawCheckManagement
     * @return
     */
    List<PmsWithdrawCheckManagement> queryWithdrawCheckManagement(PmsWithdrawCheckManagement pmsWithdrawCheckManagement, int startRow, int pageSize);

    /**
     * 提现审核记录列表状态
     * @param pmsWithdrawDepositRecord
     * @return
     */
    List<PmsWithdrawDepositRecord> queryWithdrawDepositRecord(PmsWithdrawDepositRecord pmsWithdrawDepositRecord, int startRow, int pageSize);
}
