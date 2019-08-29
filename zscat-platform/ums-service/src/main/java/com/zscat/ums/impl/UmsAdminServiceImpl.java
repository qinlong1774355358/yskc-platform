package com.zscat.ums.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zscat.ums.mapper.UmsAdminMapper;
import com.zscat.ums.model.UmsAdmin;
import com.zscat.ums.model.UmsPermission;
import com.zscat.ums.model.UmsRole;
import com.zscat.ums.service.UmsAdminService;
@Service("umsAdminService")
public class UmsAdminServiceImpl implements UmsAdminService{
	
	@Autowired
	private UmsAdminMapper umsAdminMapper;
	@Override
	public UmsAdmin getAdminByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UmsAdmin register(UmsAdmin umsAdminParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String login(String username, String password) {		
		List<UmsAdmin> umsAdmin =umsAdminMapper.queryumsAdmin(username,password);
		System.out.println("1111111111111a"+umsAdmin);
		if(umsAdmin.size()>0) {
			return "1";
		}
		return "2";
	}

	@Override
	public String refreshToken(String oldToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UmsAdmin getItem(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UmsAdmin> list(String name, Integer pageSize, Integer pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Long id, UmsAdmin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateRole(Long adminId, List<Long> roleIds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UmsRole> getRoleList(Long adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePermission(Long adminId, List<Long> permissionIds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UmsPermission> getPermissionList(Long adminId) {
		// TODO Auto-generated method stub
		return null;
	}

}
