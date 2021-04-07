package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.HelpPage;
import com.qa.pages.LoginPage;

public class HelpPageTest extends BasePage  {

	LoginPage loginPage;
	HelpPage HP;
	static long startTime;
	static long endTime;

	

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.HelpPageTest)
	@Test(priority = 1 ,enabled = true , description = "Call our Support Page Test")
	public void CallOurSupportPageTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		HP= new HelpPage(); 
		loginPage.loginByMobileNumber();
		HP.CallOurSupport();		
	}

    

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.HelpPageTest)
	@Test(priority =2,enabled = true , description = "Send Us Email Page Test")
	public void SendUsEmailPageTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		HP= new HelpPage(); 
		loginPage.loginByMobileNumber();
		HP.SendUsEmail();		
	}

    

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.HelpPageTest)
	@Test(priority =3,enabled = true , description = "View All Question Page Test")
	public void ViewAllFAQTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		HP= new HelpPage(); 
		loginPage.loginByMobileNumber();
		HP.ViewAllQuestions();		
	}


    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.HelpPageTest)
	@Test(priority =4,enabled = true , description = "Search Question article")
	public void SearchQuestionArticleTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		HP= new HelpPage(); 
		loginPage.loginByMobileNumber();
		HP.SearchQuestions();		
	}

	
	
}
