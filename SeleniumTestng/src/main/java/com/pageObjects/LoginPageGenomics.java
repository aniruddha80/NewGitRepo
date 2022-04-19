package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.action.Action;
import com.base.BaseClass;

public class LoginPageGenomics extends BaseClass{
	
	Action action = new Action();
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickNext;
	@FindBy(xpath="(//div[contains(text(),'Sales Mobile Tool')])[1]")
	private WebElement selectSalesMobile;
	
	
	public LoginPageGenomics() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void login(String UserName,String Password) throws InterruptedException {
		Thread.sleep(5000);
		action.enterValue(email, UserName);
		action.clickanyElement(clickNext);
		Thread.sleep(5000);
		action.enterValue(password,Password);
		action.clickanyElement(clickNext);
		action.clickanyElement(clickNext);
		//Thread.sleep(10000);
		getDriver().navigate().to("https://genomichealth-dev.crm.dynamics.com/main.aspx?appid=e466a8a3-7226-488d-94e2-8b143eeb5dd7&forceUCI=1&pagetype=entitylist&etn=account&viewid=562f6626-7516-ea11-a811-000d3a593813&viewType=1039");
	}

}
