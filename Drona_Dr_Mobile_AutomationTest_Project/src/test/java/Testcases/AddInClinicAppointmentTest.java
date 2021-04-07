package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.AddInClinicAppointment;
import com.qa.pages.LoginPage;

public class AddInClinicAppointmentTest extends BasePage {
	
	
	LoginPage loginPage;
	AddInClinicAppointment AddClinic;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AddInClinicAppointmentTest)
		@Test(priority = 1 ,enabled = true , description = "Add in Clinic Appointment")
		public void SetInClinicTimingsTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			AddClinic= new AddInClinicAppointment(); 
			loginPage.loginByMobileNumber();
			AddClinic.AddInClinicAppointments();		
		}


}
