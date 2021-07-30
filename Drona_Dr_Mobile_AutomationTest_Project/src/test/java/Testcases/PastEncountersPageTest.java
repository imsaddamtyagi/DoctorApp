package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PastEncountersPage;

public class PastEncountersPageTest extends BasePage {
	
	
	LoginPage loginPage;
	PastEncountersPage Encounters;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.PastEncountersPageTest)
		@Test(priority = 1 ,enabled = true , description = "Duplicate Rx in Past Encounter")
		public void DuplicateRxTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			Encounters= new PastEncountersPage(); 
			loginPage.loginByMobileNumber();
			Encounters.DuplicateRx();	
		}



}
