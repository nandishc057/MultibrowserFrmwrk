package com.amazon.generic;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
	public static String currentdate;

	public static ExtentReports getInstance() {
		Date dt = new Date();
		String dateString = dt.toString();
		currentdate = dateString.replace(':', '_').replace(' ', '_');

		if (extent == null) {

			File configLocation = new File("./src/test/resources/com/amazon/ReportsConfig.xml");

			System.out.println(currentdate);
			extent = new ExtentReports("./ScreenShot/" + currentdate + ".html");

			extent.loadConfig(configLocation);

		}
		return extent;

	}

}
