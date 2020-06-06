package com.zscat.core.server;


import com.yskc.pms.entity.*;

import java.util.List;

/**
 * @ClassName: PmsVideoService
 * @Description: 视频功能
 * @author： zhangguliang
 * @date 2019年11月10日
 */
public interface PmsVideoService {

    /**
     * 查询视频列表状态
     * @param pmsVideoControlRecord
     * @return
     */
    List<PmsVideoControlRecord> queryPmsVideoControlRecord(PmsVideoControlRecord pmsVideoControlRecord, int pageSize, int startRow);

    /**
     * 查询视频播放列表状态
     * @param pmsVoidePlay
     * @return
     */
    List<PmsVoidePlay> queryPmsVoidePlay(PmsVoidePlay pmsVoidePlay, int pageSize, int startRow);

    /**
     * 查询视频直播列表状态
     * @param pmsLiveRecord
     * @return
     */
    List<PmsLiveRecord> queryPmsLiveRecord(PmsLiveRecord pmsLiveRecord, int pageSize, int startRow);

    /**
     * 查询视频录播列表状态
     * @param pmsRecordedRecord
     * @return
     */
    List<PmsRecordedRecord> queryPmsRecordedRecord(PmsRecordedRecord pmsRecordedRecord, int pageSize, int startRow);

    /**
     * 查询视频插播列表状态
     * @param pmsBreakingRecords
     * @return
     */
    List<PmsBreakingRecords> queryPmsBreakingRecords(PmsBreakingRecords pmsBreakingRecords, int pageSize, int startRow);

    /**
     * 查询视频点播列表状态
     * @param pmsDemandRecords
     * @return
     */
    List<PmsDemandRecords> queryPmsDemandRecords(PmsDemandRecords pmsDemandRecords, int pageSize, int startRow);
}
