package com.zscat.mall.admin.controller;


import com.yskc.pms.entity.PmsAdmin;
import com.yskc.pms.entity.Pmslogin;
import com.zscat.common.result.CommonResult;

import com.zscat.common.util.EncodUtil;
import com.zscat.core.server.PmsRegisterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @ClassName: RegisterController
 * @Description: 注册功能
 * @author： zhangguliang
 * @date 2020年3月24日
 */
@RestController()
@RequestMapping(value = "/app")
public class RegisterController {

	@Autowired
	private PmsRegisterService pmsRegisterService;
	/**
	 * 功能：用户注册数据添加
	 * @param pmsAdmin 用户注册对象
	 * @return
	 */
	@PostMapping("/register")
	public CommonResult saveRegister(PmsAdmin pmsAdmin, Pmslogin pmslogin) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		CommonResult result = new CommonResult();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMDDHHmmss");
		String account = simpleDateFormat.format(new Date());
		pmsAdmin.setAccount(account);

		System.out.println("111111"+pmsAdmin);
		if(pmslogin.getType()==null||pmslogin.getType().equals("")){
			return result.failed("类型不能为空");
		}
		if (pmslogin.getSign()==null||pmslogin.getSign().equals("")){
			return result.failed("签名不能为空");
		}
		if (pmsAdmin.getPhon()==null||pmsAdmin.getPhon().equals("")){
			return result.failed("手机号不能为空");
		}
		if (pmsAdmin.getEmail()==null||pmsAdmin.getEmail().equals("")){
			return result.failed("邮箱不能为空");
		}
		if (pmsAdmin.getPassword()==null||pmsAdmin.getPassword().equals("")){
			return result.failed("密码不能为空");
		}
		pmsAdmin.setPassword(EncodUtil.EncoderByMd5(pmsAdmin.getPassword()));
		pmslogin.setToken(EncodUtil.TokeByMd5());
		pmsAdmin.setCreateTime(new Date());
		pmsAdmin.setLoginTime(new Date());
		if (pmsRegisterService.checkPmsRegister(pmsAdmin)!=null){
			return result.failed(pmsRegisterService.checkPmsRegister(pmsAdmin));
		}

		if(pmsRegisterService.savePmsRegister(pmsAdmin)){
			pmslogin.setAccounttype(1);
			pmslogin.setAccount(pmsAdmin.getPhon());
			pmslogin.setLoginmethod(1);
			pmslogin.setPassword(pmsAdmin.getPassword());
			System.out.println("111111111111"+pmslogin);
			if(pmsRegisterService.saveLogin(pmslogin)){
				System.out.println("222222");
				HashMap map = new HashMap();
				map.put("toke",pmslogin.getToken());
				return result.success(map);
			}
		}
		System.out.println("333");
		return result.failed();
	}

	/**
	 * 功能：用户登录
	 * @param pmslogin
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 */
	@PostMapping("/login")
	public CommonResult saveLogin(Pmslogin pmslogin) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		CommonResult result = new CommonResult();

		if(pmslogin.getAccounttype()==null||pmslogin.getAccounttype().equals("")){
			return result.failed("请选择账号类型");
		}
		if(pmslogin.getLoginmethod()==null||pmslogin.getLoginmethod().equals("")){
			return result.failed("请选择登录方式");
		}
		if(pmslogin.getType()==null||pmslogin.getType().equals("")){
			return result.failed("类型不能为空");
		}
		if (pmslogin.getSign()==null||pmslogin.getSign().equals("")){
			return result.failed("签名不能为空");
		}

		if (pmslogin.getPassword()==null||pmslogin.getPassword().equals("")){
			return result.failed("密码不能为空");
		}
		pmslogin.setPassword(EncodUtil.EncoderByMd5(pmslogin.getPassword()));
		pmslogin.setToken(EncodUtil.TokeByMd5());
		if(pmsRegisterService.saveLogin(pmslogin)){
			HashMap map = new HashMap();
			map.put("toke",pmslogin.getToken());
			return result.success(map);
		}
		return result.failed();
	}
	/**
	 * 功能：用户退出登录
	 * @param toke
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 */
	@PostMapping("/exitLogin")
	public CommonResult exitLogin(String toke) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		CommonResult result = new CommonResult();
		if(pmsRegisterService.exitLogin(toke)){
			return result.success(null);
		}
		return result.failed();
	}

	/**
	 * 功能：用户密码修改
	 * @param pmslogin
	 * @param newPassword
	 * @param oldPassword
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 */
	@PostMapping("/setPassword")
	public CommonResult setPassword(Pmslogin pmslogin,String newPassword,String oldPassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		CommonResult result = new CommonResult();
		pmslogin.setPassword(EncodUtil.EncoderByMd5(oldPassword));
		if(pmslogin.getAccounttype()==null||pmslogin.getAccounttype().equals("")){
			return result.failed("请选择账号类型");
		}
		if(pmslogin.getType()==null||pmslogin.getType().equals("")){
			return result.failed("类型不能为空");
		}
		if (pmslogin.getSign()==null||pmslogin.getSign().equals("")){
			return result.failed("签名不能为空");
		}

		if (pmslogin.getPassword()==null||pmslogin.getPassword().equals("")){
			return result.failed("密码不能为空");
		}
		System.out.println("111111"+pmslogin);
		newPassword = EncodUtil.EncoderByMd5(newPassword);
		oldPassword = pmslogin.getPassword();
		pmslogin.setToken(EncodUtil.TokeByMd5());
		if(pmsRegisterService.setPassWord(pmslogin,newPassword,oldPassword)){
			HashMap map = new HashMap();
			map.put("toke",pmslogin.getToken());
			return result.success(map);
		}
		return result.failed();
	}

	/**
	 * 用户个人信息查询
	 * @param toke
	 * @return
	 */
	@GetMapping("/selectUserMessage")
	public CommonResult selectUserMessage(String toke){
		CommonResult result = new CommonResult();
		PmsAdmin pmsRegister = pmsRegisterService.queryPmsAdmin(toke);
		if(pmsRegister==null){
			return result.failed("输入错误！");
		}else{
			return result.success(pmsRegister);
		}
	}

}
