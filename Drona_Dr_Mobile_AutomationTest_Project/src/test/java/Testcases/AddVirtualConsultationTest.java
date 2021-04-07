package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.AddVirtualConsultation;
import com.qa.pages.LoginPage;

public class AddVirtualConsultationTest extends BasePage {
	
	
	LoginPage loginPage;
	AddVirtualConsultation AddVirtual;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AddVirtualConsultationTest)
		@Test(priority = 1 ,enabled = true , description = "Add Virtual consultation Appointment")
		public void SetVirtualConsultationTimingsTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			AddVirtual= new AddVirtualConsultation(); 
			loginPage.loginByMobileNumber();
			AddVirtual.AddVirtualConsultationAppointments();		
		}
	
	

}
