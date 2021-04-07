package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.DoctorProfileDetails;
import com.qa.pages.LoginPage;

public class DoctorProfileDetailsTest extends BasePage {
	
	
	
	LoginPage loginPage;
	DoctorProfileDetails DoctorProfile;
	static long startTime;
	static long endTime;


	  @FrameworkAnnotation(author= {"Husain"},category = CategoryType.DoctorProfileDetailsTest)
			@Test(priority = 1 ,enabled = true, description ="Doctor profile Basic Details Test")
			public void BasicDetailsTest() throws InterruptedException {
				
				loginPage = new LoginPage();
				DoctorProfile= new DoctorProfileDetails();
				loginPage.loginByMobileNumber();			
				DoctorProfile.BasicDetails();
			}	
		    
	
	
	
	
	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.DoctorProfileDetailsTest)
		@Test(priority = 2 ,enabled = true, description ="Doctor profile Addional Details Test")
		public void AdditionalInfoDetailsTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			DoctorProfile= new DoctorProfileDetails();
			loginPage.loginByMobileNumber();			
			DoctorProfile.AdditionalInfoDetails();
		}	
	    
	  
	    
}
