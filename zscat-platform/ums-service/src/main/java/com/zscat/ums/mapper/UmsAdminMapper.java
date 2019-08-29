package com.zscat.ums.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zscat.ums.model.UmsAdmin;

public interface UmsAdminMapper {
	List<UmsAdmin> queryumsAdmin(@Param("username")String username,@Param("password")String password);
}
