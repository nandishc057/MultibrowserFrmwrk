package com.amazon.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Utilities extends BaseTest {
	public static void actionsClass(WebDriver driver, WebElement webelement, WebElement subElement) throws InterruptedException {
		Actions act = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Reporter.log("Move to element");
//		Thread.sleep(10000);
//		driver.navigate().refresh();
		act.moveToElement(webelement).perform();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOf(subElement)).click();
	}
	public static void getScreenSheet()
	{
////		TakesScreenshot screeShot= TakesScreenshot;
////		TakesScreenshot screenShot= TakesScreenshot;
////		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		TakesScreenshot t = (TakesScreenshot)driver;
//		File src = t.getScreenshotAs(OutputType.FILE);
//		System.out.println("screenshot");
//		String screenShotName = ExtentManager.currentdate;
//		File dest = new File("./ScreenShot/"+screenShotName+".png");
//		try {
//			FileHandler.copy(src, dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
