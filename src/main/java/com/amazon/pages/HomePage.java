package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.amazon.generic.AutoConstants;
import com.amazon.generic.ExeclRead;
import com.amazon.generic.Utilities;

public class HomePage {
	SoftAssert sAssert = new SoftAssert();

	String etitle;
	@FindBy(css = "div[id='nav-tools']>a:first-child")
	private WebElement moveToSignin;
	@FindBy(xpath = "//div[@class='nav-flyout-content']/a/span")
	private WebElement signin;
//UserName and Continue
	@FindBy(xpath = "//input[@type='email']")
	private WebElement usernameEntry;
	@FindBy(id = "continue")
	private WebElement continueUn;
//Password and Login
	@FindBy(id = "ap_password")
	private WebElement passwordEnter;
	@FindBy(id = "signInSubmit")
	private WebElement login;
	@FindBy(css = "a[id='nav-item-signout']>span")
	private WebElement logout;
	@FindBy(css = "a[id='nav-link-yourAccount']>span:first-child")
	private WebElement moveToElementAfterLogin;

	public void getTitleAndVerify(WebDriver driver) {
		// TODO Auto-generated method stub
		String aTitle = driver.getTitle();
		etitle = AutoConstants.config.getProperty("eTitle");
		sAssert.assertEquals(aTitle, etitle);
		sAssert.assertAll();
	}

	public void moveToElement_Signin(WebDriver driver) throws InterruptedException {
		Utilities.actionsClass(driver, moveToSignin, signin);
	}

	public void loginWithEmail() {
		// TODO Auto-generated method stub
		String username = ExeclRead.getData("Sheet1", 1, 0);
		System.out.println("username:" + username);
		usernameEntry.sendKeys(username);
		continueUn.click();
		String password = ExeclRead.getData("Sheet1", 1, 1);
		System.out.println("Password:" + password);
		passwordEnter.sendKeys(password);
		login.submit();

	}

	public void moveToElement_lagout(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		Utilities.actionsClass(driver, moveToElementAfterLogin, logout);

	}

	public void loginWithPhone() {
		// TODO Auto-generated method stub
		String username = ExeclRead.getData("Sheet1", 2, 0);
		System.out.println("username:" + username);
		usernameEntry.sendKeys(username);
		continueUn.click();
		String password = ExeclRead.getData("Sheet1", 2, 1);
		System.out.println("Password:" + password);
		passwordEnter.sendKeys(password);
		login.submit();
	}

}
