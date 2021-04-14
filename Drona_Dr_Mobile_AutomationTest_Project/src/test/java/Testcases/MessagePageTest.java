package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MessagePage;

public class MessagePageTest extends BasePage {
	

	LoginPage loginPage;
	MessagePage message;
	static long startTime;
	static long endTime;


    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.MessagePageTest)
	@Test(priority = 1 ,enabled = true , description = "Send Push Notifications to all patients Test")
	public void SendPushNotificationInMessageSection() throws InterruptedException {
		
		loginPage = new LoginPage();
		message= new MessagePage(); 
		loginPage.loginByMobileNumber();
		message.SendPushNotificationInMessageSection();		
	}
	    

	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.MessagePageTest)
		@Test(priority = 2 ,enabled = true , description = "Send SMS to all patients Test")
		public void SendSMSInMessageSection() throws InterruptedException {
			
			loginPage = new LoginPage();
			message= new MessagePage(); 
			loginPage.loginByMobileNumber();
			message.SendSMSInMessageSection();		
		}
	    
	    

	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.MessagePageTest)
		@Test(priority = 3 ,enabled = true , description = "Send Email to all patients Test")
		public void SendEmailInMessageSection() throws InterruptedException {
			
			loginPage = new LoginPage();
			message= new MessagePage(); 
			loginPage.loginByMobileNumber();
			message.SendEmailInMessageSection();		
		}

}
