package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass {

IndexPage indexpage;
	
@BeforeMethod
public void setup() {
launchApp();
}
	
@AfterMethod
public void tearDown() {
getDriver().quit();
}
	
@Test
public void verifyTitle() {
IndexPage indexpage = new IndexPage();
boolean result=indexpage.validatelogo();
Assert.assertTrue(result);
}

}
