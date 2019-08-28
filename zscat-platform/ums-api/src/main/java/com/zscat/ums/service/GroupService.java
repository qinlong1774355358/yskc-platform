package com.zscat.ums.service;


import java.util.List;

import com.zscat.ums.model.SmsGroup;

/**
 *  
 */
public interface GroupService {


    int createGroup(SmsGroup group);
    
    int updateGroup(Long id, SmsGroup group);

    int deleteGroup(Long id);



    List<SmsGroup> listGroup(SmsGroup group, int pageNum, int pageSize);

    SmsGroup getGroup(Long id);

   
}
