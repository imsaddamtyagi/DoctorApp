package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.ThreeDotPage;

public class ThreeDotPageTest extends BasePage {
	
	LoginPage loginPage;
	ThreeDotPage ThreeDot;
	static long startTime;
	static long endTime;

	
	        @FrameworkAnnotation(author= {"Husain"},category = CategoryType.ThreeDotPageTest)
			@Test(priority = 1 ,enabled = false , description = "Mark an Appointment as No-Show")
			public void MarkAsNoShow() throws InterruptedException {
				
				loginPage = new LoginPage();
				ThreeDot= new ThreeDotPage(); 
				loginPage.loginByMobileNumber();
				ThreeDot.MarkNoShow();		
			}
	        

	        @FrameworkAnnotation(author= {"Husain"},category = CategoryType.ThreeDotPageTest)
			@Test(priority = 2 ,enabled = false , description = "Cancel an Appointment")
			public void CancelAnAppointment() throws InterruptedException {
				
				loginPage = new LoginPage();
				ThreeDot= new ThreeDotPage(); 
				loginPage.loginByMobileNumber();
				ThreeDot.CancelAppointment();		
			}
		    
	        
	        
	        @FrameworkAnnotation(author= {"Husain"},category = CategoryType.ThreeDotPageTest)
	    	@Test(priority = 2 ,enabled = true , description = "Reschedule Appointment")
	    	public void RescheduleAnAppointment() throws InterruptedException {
	    				
	    				loginPage = new LoginPage();
	    				ThreeDot= new ThreeDotPage(); 
	    				loginPage.loginByMobileNumber();
	    				ThreeDot.RescheduleAppointment();		
	    			}
	        
	        

}
