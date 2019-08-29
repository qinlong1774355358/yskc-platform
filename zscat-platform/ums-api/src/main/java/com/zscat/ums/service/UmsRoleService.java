package com.zscat.ums.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.zscat.ums.model.UmsPermission;
import com.zscat.ums.model.UmsRole;
import com.zscat.ums.model.UmsRolePermissionRelation;

/**
 * 后台角色管理Service 
 */
public interface UmsRoleService {
    /**
     * 添加角色
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     */
    int update(Long id, UmsRole role);

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);

    /**
     * 获取指定角色权限
     */
    List<UmsPermission> getPermissionList(Long roleId);

    /**
     * 修改指定角色的权限
     */
    @Transactional
    int updatePermission(Long roleId, List<Long> permissionIds);

    /**
     * 获取角色列表
     */
    List<UmsRole> list();

    UmsRole getItem(Long id);

	List<UmsRolePermissionRelation> getRolePermission(Long roleId); 
}
