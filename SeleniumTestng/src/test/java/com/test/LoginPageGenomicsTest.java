package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.dataprovider.DataProviders;
import com.pageObjects.LoginPageGenomics;


public class LoginPageGenomicsTest extends  BaseClass{
	
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
	     public void signIn(String userName,String password) throws InterruptedException {
	    	 LoginPageGenomics loginPageGeno = new LoginPageGenomics();
	    	loginPageGeno.login(userName, password);
	     }

}
