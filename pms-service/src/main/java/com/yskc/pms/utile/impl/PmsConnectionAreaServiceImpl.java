package com.yskc.pms.utile.impl;

import com.yskc.pms.entity.PmsConnectionArea;
import com.yskc.pms.entity.PmsConnectionAreaExample;
import com.yskc.pms.mapper.PmsConnectionAreaMapper;
import com.zscat.common.exception.BusinessException;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsConnectionAreaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
/**
 * @ClassName: PmsConnectionAreaServiceImpl
 * @Description: 人脉商圈
 * @author： luoli
 */
@Slf4j
@Service("pmsConnectionAreaService")
public class PmsConnectionAreaServiceImpl implements PmsConnectionAreaService {
    @Resource
    private PmsConnectionAreaMapper pmsConnectionAreaMapper;

    /**
     * 分页查询人脉商圈列表记录
     *
     * @param pmsConnectionArea 人脉商圈列表对象
     * @return
     */
    @Override
    public List<PmsConnectionArea> queryPmsConnectionArea(PmsConnectionArea pmsConnectionArea,Integer pageNum,Integer pageSize) {
        PmsConnectionAreaExample example = new PmsConnectionAreaExample();
        PmsConnectionAreaExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%" + pmsConnectionArea.getUserAccount() + "%");
        example.setStartRow(pageNum);
        example.setPageSize(pageSize);

        return pmsConnectionAreaMapper.selectByExample(example);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public CommonResult delIllegalText(Integer id) {
        PmsConnectionArea pmsConnectionArea = pmsConnectionAreaMapper.selectByPrimaryKey(id);
        if (pmsConnectionArea == null) {
            log.info("没有该条人脉商圈");
            throw new BusinessException("没有该条人脉商圈");
        }
        if (pmsConnectionArea.getIllegal()==1) {
            log.info("该条人脉商圈没有违规内容");
            throw new BusinessException("该条人脉商圈没有违规内容");
        }
        pmsConnectionArea.setIllegalContext("");
        pmsConnectionArea.setOperation(Byte.valueOf("3"));
        CommonResult result = new CommonResult();
        int res = pmsConnectionAreaMapper.updateByPrimaryKeySelective(pmsConnectionArea);
        if (res == 0) {
            log.info("删除内容失败,id:[{}]", id);
            return result.failed();
        }
        return result.success("操作成功");
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public CommonResult closeAccount(Integer id) {
        PmsConnectionArea pmsConnectionArea = pmsConnectionAreaMapper.selectByPrimaryKey(id);
        if (pmsConnectionArea == null) {
            log.info("没有该条人脉商圈");
            throw new BusinessException("没有该条人脉商圈");
        }
        pmsConnectionArea.setOperation(Byte.valueOf("2"));
        CommonResult result = new CommonResult();
        int res = pmsConnectionAreaMapper.updateByPrimaryKeySelective(pmsConnectionArea);
        if (res == 0) {
            log.info("封号失败,id:[{}]", id);
            return result.failed();
        }
        return result.success("封号成功");
    }

}
