package com.amazon.tests;

public class Test {
    @Test
    public void priCondition() {
		 webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		 webDriver.manage().window().maximize();
		 webDriver.manage().deleteAllCookies();
		  String title = webDriver.getTitle();
        assertEquals( "ARR", title);
    }
}
