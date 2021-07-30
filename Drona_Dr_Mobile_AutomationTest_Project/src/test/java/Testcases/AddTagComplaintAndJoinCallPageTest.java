package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.AddTagComplaintAndJoinCallPage;
import com.qa.pages.LoginPage;

public class AddTagComplaintAndJoinCallPageTest extends BasePage {
	
	LoginPage loginPage;
	AddTagComplaintAndJoinCallPage AddTag;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AddTagComplaintAndJoinCallPageTest)
		@Test(priority = 1 ,enabled = true , description = "Add Tag,Complaint and Join Twilio Call")
		public void AddTagComplaintAndJoinCall() throws InterruptedException {
			
			loginPage = new LoginPage();
			AddTag= new AddTagComplaintAndJoinCallPage(); 
			loginPage.loginByMobileNumber();
			AddTag.AddTagComplaintAndJoinCall();		
		}


}


