package com.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.DOMConfiguration;

import com.utilities.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	@BeforeSuite
	public void loadConfig() {
		ExtentManager.setExtent();
		// DOMConfigurator.configure("log4j.xml");
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public void launchApp(String browserName) {
		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			getDriver().get("https://opensource-demo.orangehrmlive.com/");
		}
	}

	@AfterSuite
	public void extentReportEnd() {
		ExtentManager.endReport();
	}

}
