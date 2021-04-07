package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.About;
import com.qa.pages.LoginPage;

 class AboutPageTest extends BasePage {
	
	
	LoginPage loginPage;
	About about;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AboutPageTest)
		@Test(priority = 1 ,enabled = true , description = "About Drona Page Test")
		public void AboutDronaPageTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			about= new About(); 
			loginPage.loginByMobileNumber();
			about.AboutDrona();		
		}
	    
	     
	    
	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AboutPageTest)
		@Test(priority = 2 ,enabled = true , description = "Privacy Policy Page Test")
		public void PrivacyPolicyPageTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			about= new About(); 
			loginPage.loginByMobileNumber();
			about.PrivacyPolicy();		
		}
    
	    
	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.AboutPageTest)
		@Test(priority = 3 ,enabled = true , description = "Terms of use Page Test")
		public void TermsOfUsePageTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			about= new About(); 
			loginPage.loginByMobileNumber();
			about.TermsOfUse();		
		}

	    


}
