package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.DecouplingPage;
import com.qa.pages.LoginPage;

public class DecouplingPageTest extends BasePage {
	
	
	LoginPage loginPage;
	DecouplingPage  Couple;
	static long startTime;
	static long endTime;
	
	

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.DecouplingPageTest)
	@Test(priority = 1 ,enabled = true , description = "Search Patient in the list")
	public void SearchPatientList() throws InterruptedException {
		
		loginPage = new LoginPage();
		Couple= new DecouplingPage(); 
		loginPage.loginByMobileNumber();
		Couple.SearchPatient();
	}
    

}
