package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.AddPatientPage;
import com.qa.pages.LoginPage;

public class AddPatientPageTest extends BasePage {
	
	LoginPage loginPage;
	AddPatientPage AddPatient;
	static long startTime;
	static long endTime;
	
	
	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AddPatientPageTest)
		@Test(priority = 1 ,enabled = true , description = "Add Patient")
		public void AddPatientTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			AddPatient= new AddPatientPage(); 
			loginPage.loginByMobileNumber();
			AddPatient.AddAPatient();		
		}
	    
	
	
	

}
