package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.PreviewRxPage;

public class PreviewRxPageTest extends BasePage {
	
	LoginPage loginPage;
	PreviewRxPage preview;
	static long startTime;
	static long endTime;
	

    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.PreviewRxPageTest)
	@Test(priority = 1 ,enabled = true , description = "PreviewRx Page: Mark an appointment as complete")
	public void PreviewRxPage() throws InterruptedException {
		
		loginPage = new LoginPage();
		preview= new PreviewRxPage(); 
		loginPage.loginByMobileNumber();
		preview.MarkComplete();		
	}
    
    
    
    

}
