package com.baoko.web.business;

import com.baoko.web.base.DriverBase;
import com.baoko.web.handle.WhiteHoleLoginHandle;

public class WhiteHolePro {
	public WhiteHoleLoginHandle whoteHoleLoginHandle;
	public DriverBase driver;
	/**
	 * @param driver
	 */
	public WhiteHolePro(DriverBase driver){
		this.driver = driver;
		whoteHoleLoginHandle = new WhiteHoleLoginHandle(driver);
	}
	/**
	 * @param username
	 * @param password
	 */
	public void login(String username,String password){

		if(whoteHoleLoginHandle.assertLoginPage()){
			whoteHoleLoginHandle.sendKeysUser(username);
			whoteHoleLoginHandle.sendKeysPassword(password);

			whoteHoleLoginHandle.clickLoginButton();
		}else{
			System.out.println("页面不存在或者状态不正确。");
		}
	}
}
