package Testcases;
import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends BasePage{
	
	LoginPage loginPage;
	
    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.LoginPageTest)
	@Test(priority = 1 ,enabled = true , description = "Verify mobile login functionality.")
	public void loginMobileNumberTest() {
		
		loginPage = new LoginPage();
		loginPage.loginByMobileNumber();
	}

}
