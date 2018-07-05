package com.baoko.web.page;

import org.openqa.selenium.WebElement;

import com.baoko.web.base.DriverBase;
import com.baoko.web.util.GetByLocator;

public class WhiteHoleLoginPage extends BasePage{

	public WhiteHoleLoginPage(DriverBase driver) {
		super(driver);
	}
	
	/**
	 * 获取用户名输入框
	 * */
	public WebElement getUserElement(){
		return element(GetByLocator.getLocator("username"));
	}
	
	/**
	 * 获取密码输入框Element
	 * */
	public WebElement getPasswordElement(){
		return element(GetByLocator.getLocator("password"));
	}
	/**
	 * 获取登陆按钮  element
	 * */
	public WebElement getLoginButtonElement(){
		return element(GetByLocator.getLocator("loginbutton"));
	}
	
	
}
