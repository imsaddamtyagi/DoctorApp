package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MedicalHistoryPage;

public class MedicalHistoryPageTest extends BasePage {
	
	LoginPage loginPage;
	MedicalHistoryPage History;
	static long startTime;
	static long endTime;
	
	

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.MedicalHistoryPageTest)
	@Test(priority = 1 ,enabled = true , description = "Add Medical History in Appointment")
	public void AddMedicalHistoryTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		History= new MedicalHistoryPage(); 
		loginPage.loginByMobileNumber();
		History.AddMedicalHistory();
	}
	
	

}
