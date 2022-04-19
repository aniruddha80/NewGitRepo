package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.action.Action;
import com.base.BaseClass;

public class LoginPage extends BaseClass {
	Action action = new Action();
	@FindBy(id = "txtUsername")
	private WebElement userName;
	@FindBy(id = "txtPassword")
	private WebElement passWord;
	@FindBy(id = "btnLogin")
	private WebElement clickLogin;

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void Login(String UserName, String Password) {
		action.enterValue(userName, UserName);
		action.enterValue(passWord, Password);
		action.clickanyElement(clickLogin);
	}

}
