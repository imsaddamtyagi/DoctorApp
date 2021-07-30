package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.ECardsPage;
import com.qa.pages.LoginPage;

public class ECardsPageTest extends BasePage {
	
	LoginPage loginPage;
	ECardsPage Ecard;
	static long startTime;
	static long endTime;
	
	
            @FrameworkAnnotation(author= {"Husain"},category = CategoryType.ECardsPageTest)
			@Test(priority = 1 ,enabled = false, description ="Share E Cards With your Patients")
			public void ShareECardTest() throws InterruptedException {
				
				loginPage = new LoginPage();
				Ecard= new ECardsPage();
				loginPage.loginByMobileNumber();			
				Ecard.ShareECard();
			}	
		    
                    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.ECardsPageTest)
         			@Test(priority = 2 ,enabled = true, description ="Download E Card")
         			public void DownloadECardTest() throws InterruptedException  {
         				
         				loginPage = new LoginPage();
         				Ecard= new ECardsPage();
         				loginPage.loginByMobileNumber();			
         				Ecard.DownloadECard();
         			}	
         		    
            
            
}
