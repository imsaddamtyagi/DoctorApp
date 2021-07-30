package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.AddVital;
import com.qa.pages.LoginPage;

public class AddVitalsTest extends BasePage {
	
	LoginPage loginPage;
	AddVital vital;
	static long startTime;
	static long endTime;
	
	

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AddVitalsTest)
	@Test(priority = 1 ,enabled = true , description = "Add vitals in Appointment")
	public void AddVitalInAppointmentTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		vital= new AddVital(); 
		loginPage.loginByMobileNumber();
		vital.AddVitalInAppointment();
	}
	
	

}
