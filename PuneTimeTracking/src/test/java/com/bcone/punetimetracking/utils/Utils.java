package com.bcone.punetimetracking.utils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Utils {

	public static WebDriver driver;

	public static WebDriver startBrowser(String browser) {
	
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			return driver;
		} 
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} 
		else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		} 
		else return null;
	}

	public void impliciteWait(int timeInsec) {
		Reporter.log("---  Waiting for page to load  ---", true);
		try {
			driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
			Reporter.log("Page is loaded");
		} catch (Throwable error) {
			System.out.println("Timeout for page load after" + timeInsec + "seconds");
			Assert.assertTrue(false, "Timeout for page load request after" + timeInsec + "seconds");
		}
	}

}
