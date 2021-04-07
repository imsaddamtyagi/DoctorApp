package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SetUpInClinicTiming;

public class SetUpInClinicTimingTest extends BasePage {
	
LoginPage loginPage;
SetUpInClinicTiming SetUpTimingPage;
static long startTime;
static long endTime;


    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.SetUpTimingsTest)
	@Test(priority = 1 ,enabled = true , description = "Set In Clinic Timings")
	public void SetInClinicTimingsTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		SetUpTimingPage= new SetUpInClinicTiming(); 
		loginPage.loginByMobileNumber();
		SetUpTimingPage.SetUpInClinicTimings();		
	}



	
	
}
