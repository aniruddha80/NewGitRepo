package com.test;

import org.testng.annotations.Test;

import com.pageObjects.AdminPage;

public class AdminPageTest {
	@Test
	public void clickAdmin() throws InterruptedException {
		AdminPage adminPage = new AdminPage();
		adminPage.clickonAdmin();
	}

}
