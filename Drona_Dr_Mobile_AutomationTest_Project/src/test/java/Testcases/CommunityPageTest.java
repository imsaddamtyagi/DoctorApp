package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.CommunityPage;
import com.qa.pages.LoginPage;

public class CommunityPageTest extends BasePage {
	
	
	LoginPage loginPage;
	CommunityPage community;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.CommunityPageTest)
		@Test(priority = 1 ,enabled = true , description = "Pic Topics to Show in Community Section")
		public void PickTopicsToShow() throws InterruptedException {
			
			loginPage = new LoginPage();
			community= new CommunityPage(); 
			loginPage.loginByMobileNumber();
			community.PickTopics();		
		}


}
