package com.yskc.pms.utile.impl;


import com.yskc.pms.entity.*;
import com.yskc.pms.mapper.*;
import com.zscat.core.server.PmsVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PmsVideoService
 * @Description: 视频功能
 * @author： zhangguliang
 * @date 2019年11月10日
 */
@Service("pmsVideoService")
public class PmsVideoServiceImpl implements PmsVideoService {

    /**
     * 后台视频控制记录表
     */
    @Autowired
    private PmsVideoControlRecordMapper pmsVideoControlRecordMapper;

    /**
     * 后台视频播放表
     */
    @Autowired
    private PmsVoidePlayMapper pmsVoidePlayMapper;
    /**
     * 后台直播记录表
     */
    @Autowired
    private PmsLiveRecordMapper pmsLiveRecordMapper;

    /**
     * 后台录播记录表
     */
    @Autowired
    private PmsRecordedRecordMapper pmsRecordedRecordMapper;

    /**
     * 后台插播记录表
     */
    @Autowired
    private PmsBreakingRecordsMapper pmsBreakingRecordsMapper;

    /**
     * 后台点播记录表
     */
    @Autowired
    private PmsDemandRecordsMapper pmsDemandRecordsMapper;

    /**
     * 视频列表
     * @param pmsVideoControlRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsVideoControlRecord> queryPmsVideoControlRecord(PmsVideoControlRecord pmsVideoControlRecord,int startRow,int pageSize) {
        System.out.println("PmsVideoControlRecord=="+pmsVideoControlRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsVideoControlRecordExample example = new PmsVideoControlRecordExample();
        PmsVideoControlRecordExample.Criteria criteria = example.createCriteria();
        /*criteria.andUserAccountEqualTo(pmsVideoControlRecord.getUserAccount());*/
        criteria.andUserAccountLike("%"+pmsVideoControlRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsVideoControlRecordMapper.selectByExample(example);
    }

    /**
     * 视频播放列表
     * @param pmsVoidePlay
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsVoidePlay> queryPmsVoidePlay(PmsVoidePlay pmsVoidePlay, int startRow, int pageSize) {
        System.out.println("pmsVoidePlay=="+pmsVoidePlay);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsVoidePlayExample example = new PmsVoidePlayExample();
        PmsVoidePlayExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsVoidePlay.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsVoidePlayMapper.selectByExample(example);
    }
    /**
     * 视频直播列表
     * @param pmsLiveRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsLiveRecord> queryPmsLiveRecord(PmsLiveRecord pmsLiveRecord, int startRow, int pageSize) {
        System.out.println("pmsLiveRecord=="+pmsLiveRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsLiveRecordExample example = new PmsLiveRecordExample();
        PmsLiveRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsLiveRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsLiveRecordMapper.selectByExample(example);
    }

    /**
     * 视频录播列表
     * @param pmsRecordedRecord
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsRecordedRecord> queryPmsRecordedRecord(PmsRecordedRecord pmsRecordedRecord, int startRow, int pageSize) {
        System.out.println("pmsRecordedRecord=="+pmsRecordedRecord);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsRecordedRecordExample example = new PmsRecordedRecordExample();
        PmsRecordedRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsRecordedRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsRecordedRecordMapper.selectByExample(example);
    }
    /**
     * 视频录播列表
     * @param pmsBreakingRecords
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsBreakingRecords> queryPmsBreakingRecords(PmsBreakingRecords pmsBreakingRecords, int startRow, int pageSize) {
        System.out.println("pmsBreakingRecords=="+pmsBreakingRecords);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsBreakingRecordsExample example = new PmsBreakingRecordsExample();
        PmsBreakingRecordsExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsBreakingRecords.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsBreakingRecordsMapper.selectByExample(example);
    }
    /**
     * 视频录播列表
     * @param pmsDemandRecords
     * @param startRow
     * @param pageSize
     * @return
     */
    @Override
    public List<PmsDemandRecords> queryPmsDemandRecords(PmsDemandRecords pmsDemandRecords, int startRow, int pageSize) {
        System.out.println("pmsDemandRecords=="+pmsDemandRecords);
        System.out.println("pageSize=="+pageSize);
        System.out.println("startRow=="+startRow);
        PmsDemandRecordsExample example = new PmsDemandRecordsExample();
        PmsDemandRecordsExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsDemandRecords.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsDemandRecordsMapper.selectByExample(example);
    }
}
