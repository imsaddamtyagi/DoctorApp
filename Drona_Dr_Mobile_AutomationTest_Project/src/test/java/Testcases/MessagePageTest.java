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
		@Test(priority = 1 ,enabled = true , description = "Message Section Test")
		public void SendEmailInMessageSection() throws InterruptedException {
			
			loginPage = new LoginPage();
			message= new MessagePage(); 
			loginPage.loginByMobileNumber();
			message.SendEmailInMessageSection();		
		}


}
