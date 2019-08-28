package com.zscat.ums.service;

import com.zscat.ums.model.UmsMember;
import com.zscat.ums.model.UmsMemberExample;

import java.util.List;

/**
 * 会员管理Service 
 */
public interface UmsMemberService {

    int countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    int deleteByPrimaryKey(Long id);
    
    List<UmsMember> listAllMember();
    
    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    List<UmsMember> selectByExample(UmsMemberExample example);

    UmsMember selectByPrimaryKey(Long id);

    int updateByExampleSelective( UmsMember record,UmsMemberExample example);

    int updateByExample(UmsMember record,  UmsMemberExample example);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    UmsMember queryByOpenId(String openId);
    
    UmsMember getByUsername(String username);
    
    void updateIntegration(Long id, Integer integration); 

    int deleteMember(List<Long> ids);

    List<UmsMember> listMember(String keyword, int pageNum, int pageSize);

}
