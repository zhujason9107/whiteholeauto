package com.baoko.web.testcase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baoko.web.base.DriverBase;
import com.baoko.web.business.WhiteHolePro;
import com.baoko.web.util.ExcelUtil;

public class LoginTest extends CaseBase{
	public DriverBase driver;
	public WhiteHolePro whiteHolePro;
	
	@BeforeClass
	@Parameters(value= {"browserType","loginPage"})
	public void loginTest(String browserType,String url){
		this.driver = InitDriver(browserType);
		driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		whiteHolePro=new WhiteHolePro(driver);
	}
	
	@Test(dataProvider="datas")
	public void test(String username,String password,String expectvale){
		
		whiteHolePro.login(username, password);
		System.out.println("username333:"+username+"_______password"+password);
		WebElement tips=driver.findElement(By.xpath("//*[contains(text(),"+expectvale+")]"));
		Assert.assertNotNull(tips);
	}
	
	@DataProvider
	public Object[][] datas(){
		Object[][] datas=ExcelUtil.read("/baidonglogin.xlsx",1,1,1,3);
		return datas;
	}

}
