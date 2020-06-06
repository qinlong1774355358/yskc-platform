package com.zscat.core.server;


import com.yskc.pms.entity.PmsAdmin;
import com.yskc.pms.entity.Pmslogin;

/**
 * @ClassName: PmsRegisterService
 * @Description: 用户名注册登录
 * @author： zhangguliang
 * @date 2020年3月24日
 */
public interface PmsRegisterService {

    /**
     * 后台用户检查注册
     * @param pmsAdmin 用户信息
     * @return
     */
    String checkPmsRegister(PmsAdmin pmsAdmin);

    /**
     * 后台用户注册
     * @param pmsAdmin 用户信息表
     * @return
     */
    boolean savePmsRegister(PmsAdmin pmsAdmin);
    /**
     * 后台登录状态检查
     * @param pmsLogin 后台用户检查登录
     * @return
     */
    Pmslogin checkstate(Pmslogin pmsLogin);

    /**
     * 后台登录
     * @param pmslogin  登录表
     * @return
     */
    boolean saveLogin(Pmslogin pmslogin);

    /**
     * 后台退出登录
     * @param toke 动态个人信息编码
     * @return
     */
    boolean exitLogin(String toke);

    /**
     * 密码设置
     * @param pmslogin 登录表
     * @param newPassword 新密码
     * @param oldPassword 旧密码
     * @return
     */
    boolean setPassWord(Pmslogin pmslogin,String newPassword,String oldPassword);

    /**
     * 个人信息查询
     * @param toke 动态个人信息编码
     * @return
     */
    PmsAdmin queryPmsAdmin(String toke);
}
