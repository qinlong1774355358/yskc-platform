package com.zscat.ums.service;


import java.util.List;

import com.zscat.ums.model.Area;

/**
 * 
 *地区服务
 */
public interface AreaService { 
    int createArea(Area area);
    
    int updateArea(Long id, Area area);

    int deleteArea(Long id); 

    List<Area> listArea(Area area, int pageNum, int pageSize);

    Area getArea(Long id);

   
}
