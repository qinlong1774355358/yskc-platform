package com.yskc.pms.utile.impl;

import com.yskc.pms.entity.PmsAdmin;
import com.yskc.pms.entity.PmsAdminExample;
import com.yskc.pms.entity.Pmslogin;
import com.yskc.pms.entity.PmsloginExample;
import com.yskc.pms.mapper.PmsAdminMapper;
import com.yskc.pms.mapper.PmsloginMapper;
import com.zscat.core.server.PmsRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PmsRegisterService
 * @Description: 用户名注册登录
 * @author： zhangguliang
 * @date 2020年3月24日
 */
@Service("pmsRegisterService")
public class PmsRegisterServiceImpl implements PmsRegisterService {

    @Autowired
    private PmsAdminMapper pmsAdminMapper;

    @Autowired
    private PmsloginMapper pmsloginMapper;

    /**
     * 后台用户检查注册
     * @param pmsAdmin 用户信息
     * @return
     */
    @Override
    public String checkPmsRegister(PmsAdmin pmsAdmin) {
        PmsAdminExample example = new PmsAdminExample();
        PmsAdminExample.Criteria criteria = example.createCriteria();
        criteria.andPhonEqualTo(pmsAdmin.getPhon());
        List<PmsAdmin> list = pmsAdminMapper.selectByExample(example);
        System.out.println("**************"+list);
        if (list.size()>0){
            return "注册失败，手机已注册";
        }
        PmsAdminExample example1 = new  PmsAdminExample();
        PmsAdminExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andEmailEqualTo(pmsAdmin.getEmail());
        List<PmsAdmin> list1 = pmsAdminMapper.selectByExample(example1);
        System.out.println("**************"+list1);
        if(list1.size()>0){
            return "注册失败，邮箱已注册";
        }
        return null;
    }

    /**
     * 用户注册
     * @param pmsAdmin 用户信息
     * @return
     */
    @Override
    public boolean savePmsRegister(PmsAdmin pmsAdmin) {
        int size = pmsAdminMapper.insertSelective(pmsAdmin);
        if (size>0){
            return true;
        }
        return false;
    }

    /**
     * 用户后台登录状态检查
     * @param pmsLogin
     * @return
     */
    @Override
    public Pmslogin checkstate(Pmslogin pmsLogin) {
        PmsloginExample example = new PmsloginExample();
        PmsloginExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(pmsLogin.getAccount());
        criteria.andPasswordEqualTo(pmsLogin.getPassword());
        List<Pmslogin> list = pmsloginMapper.selectByExample(example);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }

    /**
     * 用户登录
     * @param pmslogin  登录表
     * @return
     */
    @Override
    public boolean saveLogin(Pmslogin pmslogin) {
        System.out.println("44444");
        if(checkstate(pmslogin)!=null){
            System.out.println("55555");
            Pmslogin pmslogin1 = new Pmslogin();
            pmslogin1.setId(checkstate(pmslogin).getId());
            pmslogin1.setToken(pmslogin.getToken());
            pmsloginMapper.updateByPrimaryKeySelective(pmslogin1);
            System.out.println("666666");
            return true;
        }
        System.out.println("7777777");
        PmsAdminExample example = new PmsAdminExample();
        PmsAdminExample.Criteria criteria = example.createCriteria();
        if(pmslogin.getAccounttype()==1){
            criteria.andPhonEqualTo(pmslogin.getAccount());
        }
        else if(pmslogin.getAccounttype()==2){
            criteria.andAccountEqualTo(pmslogin.getAccount());
        }
        else if(pmslogin.getAccounttype()==3){
            criteria.andEmailEqualTo(pmslogin.getAccount());
        }
        System.out.println("8888888");
        criteria.andPasswordEqualTo(pmslogin.getPassword());
        List<PmsAdmin> list = pmsAdminMapper.selectByExample(example);
        if (list.size()>0){
            System.out.println("9999999");
            pmslogin.setPmsAdminId(list.get(0).getId());
            pmsloginMapper.insertSelective(pmslogin);
            return true;
        }
        System.out.println("1010101010");
        return false;
    }

    /**
     * 退出登录
     * @param toke 动态个人信息编码
     * @return
     */
    @Override
    public boolean exitLogin(String toke) {
        PmsloginExample example = new PmsloginExample();
        PmsloginExample.Criteria criteria = example.createCriteria();
        criteria.andTokenEqualTo(toke);
         int size =pmsloginMapper.deleteByExample(example);
        if (size>0){
            return true;
        }
        return false;
    }

    /**
     * 密码修改
     * @param pmslogin 登录表
     * @param newPassword 新密码
     * @param oldPassword 旧密码
     * @return
     */
    @Override
    public boolean setPassWord(Pmslogin pmslogin,String newPassword,String oldPassword) {

        pmslogin.setPassword(oldPassword);
       if(saveLogin(pmslogin)){
           pmslogin = checkstate(pmslogin);
           PmsAdmin pmsAdmin = new PmsAdmin();
           pmsAdmin.setId(pmslogin.getPmsAdminId());
           pmsAdmin.setPassword(newPassword);
           pmslogin.setPassword(newPassword);
           pmsAdminMapper.updateByPrimaryKeySelective(pmsAdmin);
           pmsloginMapper.updateByPrimaryKeySelective(pmslogin);
           return true;
        }
        return false;
    }
    /**
     * 个人信息查询
     * @param toke 动态个人信息编码
     * @return
     */
    @Override
    public PmsAdmin queryPmsAdmin(String toke) {
        PmsAdmin pmsAdmin =null;
        PmsloginExample example = new PmsloginExample();
        PmsloginExample.Criteria criteria = example.createCriteria();
        criteria.andTokenEqualTo(toke);
       List<Pmslogin> list =  pmsloginMapper.selectByExample(example);
       if(list.size()>0){
           pmsAdmin = pmsAdminMapper.selectByPrimaryKey(list.get(0).getPmsAdminId());
           pmsAdmin.setPassword("");
       }
        return pmsAdmin;
    }

}
