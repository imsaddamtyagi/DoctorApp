package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.FilesPage;
import com.qa.pages.LoginPage;

public class FilesPageTest extends BasePage {

	LoginPage loginPage;
	FilesPage Files;
	static long startTime;
	static long endTime;
	
	
	
    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.FilesPageTest)
	@Test(priority = 1 ,enabled = true , description = "Add a File")
	public void AddFileTest() throws InterruptedException {
		
		loginPage = new LoginPage();
		Files= new FilesPage(); 
		loginPage.loginByMobileNumber();
		Files.AddNewFile();
	}
    

}
