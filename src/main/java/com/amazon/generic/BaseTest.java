package com.amazon.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest implements AutoConstants {
	public static WebDriver driver;
	public static FileInputStream fis;
//	For Extent Reports
	public static ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	static {
		System.setProperty(geckoKey, geckoValue);
	}

	@BeforeTest(enabled = false)
	public void init() {

		if (driver == null) {
			try {
				fis = new FileInputStream(configFilePath);
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO: handle exception
			}
			String geckoOrChrome = config.getProperty("browser");
			System.out.println("Config Pro:" + geckoOrChrome);

			if (geckoOrChrome.equals("Firefox")) {
				System.setProperty(geckoKey, geckoValue);
				driver = new FirefoxDriver();

			} else if (geckoOrChrome.equals("chrome")) {
				System.setProperty(chromeKey, chromeValue);
				driver = new ChromeDriver();
			}
		}
		String webUrl = config.getProperty("url");


//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(webUrl);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest(enabled = false)
	public void terminate() {
		// TODO Auto-generated method stub
		if (driver != null) {
			driver.quit();

		}
	}
}
