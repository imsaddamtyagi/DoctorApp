package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.ChangePasswordPage;
import com.qa.pages.LoginPage;

public class ChangePasswordTest extends BasePage {
	

	LoginPage loginPage;
	ChangePasswordPage Pass;
	static long startTime;
	static long endTime;
	
	
	
    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.ChangePasswordTest)
	@Test(priority = 1 ,enabled = true , description = "Change password for user")
	public void ChangePasswordForUser() throws InterruptedException {
		
		loginPage = new LoginPage();
		Pass= new ChangePasswordPage(); 
		loginPage.loginByMobileNumber();
		Pass.ChangePassword();
	}
    

}
