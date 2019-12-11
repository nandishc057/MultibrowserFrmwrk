package com.amazon.generic;

import java.util.Properties;

public interface AutoConstants {
	String geckoKey = "webdriver.gecko.driver";
	String geckoValue = "./src/main/resources/geckodriver.exe";
	String chromeKey = "webdriver.chrome.driver";
	String chromeValue = "./src/main/resources/chromedriver.exe";
	String execlReadFilePath = "./src/test/resources/com/amazon/testResources/input.xlsx";
	String configFilePath = "./src/test/resources/com/amazon/testResources/config.properties";
	Properties config = new Properties();
}
