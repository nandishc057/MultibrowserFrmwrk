package com.amazon.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.amazon.generic.BaseTest;

public class TestClass extends BaseTest {
	@Test
	void testMethods() throws IOException, InterruptedException{
//		String username = ExeclRead.getData("Sheet1", 1, 0);
//		System.out.println("username:" + username);
//		String pass = ExeclRead.getData("Sheet1", 1, 1);
//		System.out.println("pass:" + pass);
//TakesScreenshot tt= TakesScreenshot;sssssssssssssss
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/com/amazon/testResources/Screenshot");
		FileHandler.copy(src, dest);
		
		
	}
	

}
