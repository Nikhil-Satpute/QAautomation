package com.automation.utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pageobjects.HomePage;
import com.automation.pageobjects.IndexPage;
import com.automation.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass {

IndexPage indexpage;
LoginPage loginpage;
HomePage homepage;

@BeforeMethod
public void setup() {
launchApp();	
}
	
//@AfterMethod
//public void teardown() {
//getDriver().quit();
//}
	
@Test
public void LoginTest() {
	
indexpage = new IndexPage();
loginpage = indexpage.clickonsign();
homepage  = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}
			
}
