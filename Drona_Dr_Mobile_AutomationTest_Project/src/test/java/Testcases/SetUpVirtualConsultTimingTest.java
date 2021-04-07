package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SetUpVirtualConsultTiming;

public class SetUpVirtualConsultTimingTest extends BasePage {
	
	LoginPage loginPage;
	SetUpVirtualConsultTiming SetUpVirtual;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.SetUpVirtualConsultTimingTest)
		@Test(priority = 1 ,enabled = true , description = "Set Up Virtual Consult Timings")
		public void SetUpVirtualConsultTimingsTest() throws InterruptedException {
			
			loginPage = new LoginPage();
			SetUpVirtual= new SetUpVirtualConsultTiming(); 
			loginPage.loginByMobileNumber();
			SetUpVirtual.SetUpVirtualConsultingTimings();		
		}
	
	

}
