package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {
	
	public static AppiumDriver<MobileElement> driver; 
	public static Properties prop;
	
	@BeforeMethod
	public void setUp() {
			
		
		 File classpathRoot = new File(System.getProperty("user.dir")); File app = new
		 File(classpathRoot, "//app//DoctorApp_Staging.apk");
		 

		try {
			DesiredCapabilities caps = new DesiredCapabilities();			
			String platform = "android";			
			if(platform.equalsIgnoreCase("android")) {		
				
				caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
				caps.setCapability("autoAcceptAlerts", true);
				caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath()); 

			}
	
			
			
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url, caps);
		
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        
			
			
			}catch(Exception exp) {
				System.out.println("Cause is : "+exp.getCause());
				System.out.println("Message is : "+exp.getMessage());
				exp.printStackTrace();
				
			}
			
		}
	public void initProp() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com" + "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
		

		
		/*
		 * @AfterSuite public void teardown() {
		 * 
		 * driver.quit(); }
		 */
	}

