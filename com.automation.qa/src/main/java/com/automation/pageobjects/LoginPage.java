package com.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.actiondriver.Action;
import com.automation.base.BaseClass;

public class LoginPage extends BaseClass {

Action action = new Action();

@FindBy(xpath="//input[@data-qa='login-email']")
WebElement username;

@FindBy(xpath="//input[@placeholder='Password']")	
WebElement password;

@FindBy(xpath="//button[normalize-space()='Login']")
WebElement loginbtn;

@FindBy(xpath="//input[@placeholder='Name']")
WebElement namenewsignup;

@FindBy(xpath="//input[@data-qa='signup-email']")
WebElement emailfornewaccount;	

@FindBy(xpath="//button[normalize-space()='Signup']")
WebElement signupbtn;
	

public LoginPage() {
	PageFactory.initElements(getDriver(), this);
}
	
public HomePage login(String uname, String pswd) {
action.type(username, uname);
action.type(password, pswd);
action.click(getDriver(), loginbtn);
return new HomePage();
}
	
public AccountCreationPage createNewAccount(String name, String email) {
action.type(namenewsignup, name);
action.type(emailfornewaccount, email);
action.click(getDriver(), signupbtn);
return new AccountCreationPage();
}










	
}
