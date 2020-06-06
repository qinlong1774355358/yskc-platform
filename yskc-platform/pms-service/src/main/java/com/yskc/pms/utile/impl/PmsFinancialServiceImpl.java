package com.yskc.pms.utile.impl;


import com.yskc.pms.entity.*;
import com.yskc.pms.mapper.*;
import com.zscat.core.server.PmsFinancialService;
import com.zscat.core.server.PmsVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PmsFinancialService
 * @Description: 财务管理
 * @author： zhangguliang
 * @date 2020年6月3日
 */
@Service("pmsFinancialService")
public class PmsFinancialServiceImpl implements PmsFinancialService {

    /**
     * 后台财务管理记录表
     */
    @Autowired
    private PmsFinancialManagementMapper pmsFinancialManagementMapper;

    /**
     * 后台红包列表
     */
    @Autowired
    private PmsRedPacketMapper pmsRedPacketMapper;
    /**
     * 后台红包领取记录表
     */
    @Autowired
    private PmsGetRedPackageMapper pmsGetRedPackageMapper;

    /**
     * 后台钱包管理表
     */
    @Autowired
    private PmsWalletManagementMapper pmsWalletManagementMapper;

    /**
     * 后台充值记录表
     */
    @Autowired
    private PmsRechargeRecordMapper pmsRechargeRecordMapper;

    /**
     * 后台提现记录表
     */
    @Autowired
    private PmsWithdrawRecordMapper pmsWithdrawRecordMapper;

    /**
     * 后台收入记录表
     */
    @Autowired
    private PmsIncomeRecordsMapper pmsIncomeRecordsMapper;

    /**
     * 后台支出记录表
     */
    @Autowired
    private PmsSupportRecordMapper pmsSupportRecordMapper;

    /**
     * 后台提现审核管理表
     */
    @Autowired
    private PmsWithdrawCheckManagementMapper pmsWithdrawCheckManagementMapper;

    /**
     * 后台提现审核记录表
     */
    @Autowired
    private PmsWithdrawDepositRecordMapper pmsWithdrawDepositRecordMapper;

    /**
     * 财务管理列表
     * @param pmsFinancialManagement
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsFinancialManagement> queryPmsFinancialManagement(PmsFinancialManagement pmsFinancialManagement,int startRow,int pageSize) {
        System.out.println("PmsFinancialManagement=="+pmsFinancialManagement);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsFinancialManagementExample example = new PmsFinancialManagementExample();
        PmsFinancialManagementExample.Criteria criteria = example.createCriteria();
        /*criteria.andUserAccountEqualTo(pmsVideoControlRecord.getUserAccount());*/
        criteria.andUserAccountLike("%"+pmsFinancialManagement.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsFinancialManagementMapper.selectByExample(example);
    }

    /**
     * 红包列表
     * @param pmsRedPacket
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsRedPacket> queryPmsRedPacket(PmsRedPacket pmsRedPacket, int startRow, int pageSize) {
        System.out.println("pmsRedPacket=="+pmsRedPacket);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsRedPacketExample example = new PmsRedPacketExample();
        PmsRedPacketExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsRedPacket.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsRedPacketMapper.selectByExample(example);
    }
    /**
     * 红包领取记录列表
     * @param pmsGetRedPackage
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsGetRedPackage> queryPmsGetRedPackage(PmsGetRedPackage pmsGetRedPackage, int startRow, int pageSize) {
        System.out.println("pmsGetRedPackage=="+pmsGetRedPackage);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsGetRedPackageExample example = new PmsGetRedPackageExample();
        PmsGetRedPackageExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsGetRedPackage.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsGetRedPackageMapper.selectByExample(example);
    }

    /**
     * 钱包管理列表
     * @param pmsWalletManagement
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsWalletManagement> queryPmsWalletManagement(PmsWalletManagement pmsWalletManagement, int startRow, int pageSize) {
        System.out.println("pmsWalletManagement=="+pmsWalletManagement);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsWalletManagementExample example = new PmsWalletManagementExample();
        PmsWalletManagementExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsWalletManagement.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsWalletManagementMapper.selectByExample(example);
    }
    /**
     * 钱包充值记录列表
     * @param pmsRechargeRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsRechargeRecord> queryPmsRechargeRecord(PmsRechargeRecord pmsRechargeRecord, int startRow, int pageSize) {
        System.out.println("pmsRechargeRecord=="+pmsRechargeRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsRechargeRecordExample example = new PmsRechargeRecordExample();
        PmsRechargeRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsRechargeRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsRechargeRecordMapper.selectByExample(example);
    }
    /**
     * 钱包提现记录列表
     * @param pmsWithdrawRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsWithdrawRecord> queryPmsWithdrawRecord(PmsWithdrawRecord pmsWithdrawRecord, int startRow, int pageSize) {
        System.out.println("pmsWithdrawRecord=="+pmsWithdrawRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsWithdrawRecordExample example = new PmsWithdrawRecordExample();
        PmsWithdrawRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsWithdrawRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsWithdrawRecordMapper.selectByExample(example);
    }

    /**
     * 钱包收入记录列表
     * @param pmsIncomeRecords
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsIncomeRecords> queryPmsIncomeRecords(PmsIncomeRecords pmsIncomeRecords, int startRow, int pageSize) {
        System.out.println("pmsIncomeRecords=="+pmsIncomeRecords);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsIncomeRecordsExample example = new PmsIncomeRecordsExample();
        PmsIncomeRecordsExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsIncomeRecords.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsIncomeRecordsMapper.selectByExample(example);
    }

    /**
     * 钱包支出记录列表
     * @param pmsSupportRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsSupportRecord> queryPmsSupportRecord(PmsSupportRecord pmsSupportRecord, int startRow, int pageSize) {
        System.out.println("pmsSupportRecord=="+pmsSupportRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsSupportRecordExample example = new PmsSupportRecordExample();
        PmsSupportRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsSupportRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsSupportRecordMapper.selectByExample(example);
    }

    /**
     * 提现审核管理列表
     * @param pmsWithdrawCheckManagement
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsWithdrawCheckManagement> queryWithdrawCheckManagement(PmsWithdrawCheckManagement pmsWithdrawCheckManagement, int startRow, int pageSize) {
        System.out.println("pmsWithdrawCheckManagement=="+pmsWithdrawCheckManagement);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsWithdrawCheckManagementExample example = new PmsWithdrawCheckManagementExample();
        PmsWithdrawCheckManagementExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsWithdrawCheckManagement.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsWithdrawCheckManagementMapper.selectByExample(example);
    }

    /**
     * 提现审核记录列表
     * @param pmsWithdrawDepositRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsWithdrawDepositRecord> queryWithdrawDepositRecord(PmsWithdrawDepositRecord pmsWithdrawDepositRecord, int startRow, int pageSize) {
        System.out.println("pmsWithdrawDepositRecord=="+pmsWithdrawDepositRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsWithdrawDepositRecordExample example = new PmsWithdrawDepositRecordExample();
        PmsWithdrawDepositRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsWithdrawDepositRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsWithdrawDepositRecordMapper.selectByExample(example);
    }
}
