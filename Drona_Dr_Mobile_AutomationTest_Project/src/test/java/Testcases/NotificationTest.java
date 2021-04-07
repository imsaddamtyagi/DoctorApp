package Testcases;

import org.testng.annotations.Test;
import com.annotations.FrameworkAnnotation;
import com.enums.CategoryType;
import com.qa.base.BasePage;
import com.qa.pages.LoginPage;
import com.qa.pages.Notification;

public class NotificationTest extends BasePage {
	
	LoginPage loginPage;
	Notification notification;
	static long startTime;
	static long endTime;


	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.NotificationTest)
		@Test(priority=1,enabled = true,description="Number of Unread Notifications under bell icon")
		public void UnreadNotification() throws InterruptedException {
			
			loginPage = new LoginPage();
			notification= new Notification(); 
			loginPage.loginByMobileNumber();
			notification.UnReadNotification();		
		}
	    
	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.NotificationTest)
		@Test(priority=2,enabled = true,description="Marking all notification as read")
		public void MarkAllNotificationAsRead() throws InterruptedException {
			
			loginPage = new LoginPage();
			notification= new Notification(); 
			loginPage.loginByMobileNumber();
			notification.MarkAllNotificationAsRead();		
		}
	    
	    @FrameworkAnnotation(author= {"Husain"},category = CategoryType.NotificationTest)
		@Test(priority=3,enabled = true,description="Select a Notification")
		public void SelectNotification() throws InterruptedException {
			
			loginPage = new LoginPage();
			notification= new Notification(); 
			loginPage.loginByMobileNumber();
			notification.SelectNotificationDetails();	
			
	    
	    }
}
