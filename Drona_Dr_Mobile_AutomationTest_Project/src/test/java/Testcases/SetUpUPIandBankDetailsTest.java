package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SetUpUPIandBankDetails;

public class SetUpUPIandBankDetailsTest extends BasePage  {
	
	LoginPage loginPage;
	SetUpUPIandBankDetails SetUpBankUPI;

	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.SetUpUPIandBankDetailsTest)
		@Test(priority = 1 ,enabled = true , description = "Set Up Bank Details")
		public void SetInClinicTimingsTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			SetUpBankUPI= new SetUpUPIandBankDetails();
			loginPage.loginByMobileNumber();
			SetUpBankUPI.AddBankDetails();

		}
	    

	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.SetUpUPIandBankDetailsTest)
		@Test(priority =2,enabled = true , description = "Set Up UPI details ")
		public void SetUPIdetailsTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			SetUpBankUPI= new SetUpUPIandBankDetails();
			loginPage.loginByMobileNumber();
			SetUpBankUPI.AddUPIdetails();

		}
	    
	    
	
	
	
	

}
