package Testcases;


import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.TestBase;
import com.qa.pages.DronaLoginPage;

	public class DronaLoginPageTest extends TestBase{
		
		DronaLoginPage loginPage;
		
		public DronaLoginPageTest() {
			
			initProp();
		}
		 
		
		
		@FrameworkAnnotation(author= {"Praveen"},category = CategoryType.DronaLoginPageTest)
		@Test(priority = 3 ,enabled = true , description = "Verify mobile login functionality.")
		public void loginMobileNumberTest() {
			
			loginPage = new DronaLoginPage();
			loginPage.loginByMobileNumber();
		}
	    
		@FrameworkAnnotation(author= {"Praveen"},category = CategoryType.DronaLoginPageTest)
		@Test(priority = 2 ,enabled = true , description = "Verify mobile Number signup functionality.")
		public void MobileNoSignUpTest() {
			
			loginPage = new DronaLoginPage();
			loginPage.loginByUserName("9557694534");
			loginPage.mobileSignup();		
		}
		
		@FrameworkAnnotation(author= {"Praveen"},category = CategoryType.DronaLoginPageTest)
		@Test(priority = 1 ,enabled = true , description = "Verify Email signup functionality.")
		public void EmailIdSignUpTest() {
			
			loginPage = new DronaLoginPage();
			loginPage.getStartedClick();
			loginPage.emailSignUp();		
		}
		
		@FrameworkAnnotation(author= {"Praveen"},category = CategoryType.DronaLoginPageTest)
		@Test(priority = 4 ,enabled = true , description = "Verify Email login functionality.")
		public void loginEmailIdTest() {
			
			loginPage = new DronaLoginPage();
			loginPage.loginByEmailID();
		}
	}
	


