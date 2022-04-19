package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.action.Action;
import com.base.BaseClass;

public class AdminPage extends BaseClass {
	Action ac = new Action();
	@FindBy(id = "menu_pim_viewPimModule")
	private WebElement clickonPIM;
	@FindBy(id = "empsearch_employee_status")
	private WebElement EmploymentStatus;
	@FindBy(tagName = "option")
	private WebElement selectDropDownEmploymentStatus;
	@FindBy(id = "searchBtn")
	private WebElement clickonSearchbtn;
	@FindBy(id = "empsearch_job_title")
	private WebElement selectTitle;

	public AdminPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickonAdmin() throws InterruptedException {
		ac.moveToElementandClick(getDriver(), clickonPIM);
		ac.clickanyElement(EmploymentStatus);
		ac.selectValuefromDropDown(getDriver(), EmploymentStatus, "Full-Time Permanent");
		ac.clickanyElement(selectTitle);
		ac.selectValuefromDropDown(getDriver(), selectTitle, "QA Engineer");
		ac.clickanyElement(clickonSearchbtn);
	}

}
