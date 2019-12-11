package com.amazon.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.generic.BaseTest;
import com.amazon.pages.HomePage;

public class LoginTest01 extends BaseTest {

	@Test(priority = 0, enabled = true)
	public void titleVerify_TC01() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.getTitleAndVerify(driver);
	}

	@Test(priority = 1, enabled = true)
	public void loginWithEmail_TC02() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.moveToElement_Signin(driver);
		hp.loginWithEmail();
//		hp.getTitleAndVerify(driver);
		hp.moveToElement_lagout(driver);
//		Thread.sleep(5000);
	}
	@Test(priority = 2, enabled = true)
	public void loginWithPhone_TC03() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.loginWithPhone();
//		hp.getTitleAndVerify(driver);
		hp.moveToElement_lagout(driver);

	}
	

}
