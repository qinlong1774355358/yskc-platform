package com.zscat.ums.service;


import java.util.List;
import java.util.Set;

import com.zscat.common.bo.Tree;
import com.zscat.ums.dto.UmsPermissionNode;
import com.zscat.ums.model.UmsPermission;

/**
 * 后台用户权限管理Service
 * Created by zscat on 2018/9/29.
 */
public interface UmsPermissionService {
    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id, UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();

    List<Tree<UmsPermission>> getPermissionsByUserId(Long id);

    Set<String> listPerms(Long userId);

    UmsPermission getItem(Long id);
}
