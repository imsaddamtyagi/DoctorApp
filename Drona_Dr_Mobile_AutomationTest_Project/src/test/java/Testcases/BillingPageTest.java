package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.BillingPage;
import com.qa.pages.LoginPage;

public class BillingPageTest extends BasePage {
	

	
	LoginPage loginPage;
	BillingPage Billing;
	static long startTime;
	static long endTime;
	
	
	
    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.BillingPageTest)
	@Test(priority = 2 ,enabled = true , description = "Add a new Bill")
	public void AddBillTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		Billing= new BillingPage(); 
		loginPage.loginByMobileNumber();
		Billing.AddNewBill();
	}
    
    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.BillingPageTest)
	@Test(priority = 1,enabled = true , description = "Cancel a Bill")
	public void CancelBillTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		Billing= new BillingPage(); 
		loginPage.loginByMobileNumber();
		Billing.CancelBill();
	}
    
    
    
	
}
