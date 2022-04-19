package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.dataprovider.DataProviders;
import com.pageObjects.LoginPage;




public class LoginPageTest extends BaseClass{
	
	
    @BeforeMethod
    @Parameters("browser")
	public void setUp(String browser) {
    	 try {
		launchApp(browser);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
	}
     @Test(dataProvider="credentials", dataProviderClass = DataProviders.class)
     public void signIn(String userName,String password) {
    	LoginPage loginPage = new LoginPage();
    	loginPage.Login(userName,password);
     }

}
