package com.automation.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.actiondriver.Action;
import com.automation.base.BaseClass;

public class IndexPage extends BaseClass {

Action action= new Action();

@FindBy(xpath="//a[normalize-space()='Signup / Login']")
WebElement signinbutton;

@FindBy(xpath="//img[@alt='Website for automation practice']")
WebElement logo;


public IndexPage() {
PageFactory.initElements(getDriver(), this);
}
	
	
public LoginPage clickonsign() {
action.click(getDriver(), signinbutton);
return new LoginPage();
}
	
public boolean validatelogo() {
return action.isDisplayed(getDriver(), logo);
}
	
}
