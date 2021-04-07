package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.github.javafaker.Faker;
import com.qa.base.TestBase;
import com.qa.utility.TestUtilNew;

import io.appium.java_client.MobileBy;

public class DronaLoginPage extends TestBase {

	TestUtilNew testUtil;
	Faker fakeData = new Faker();

	private By getStartedBtn = By.xpath( "//android.view.ViewGroup[@index=5]");
	private By loginContinue = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Continue\")"));
	private By usernameTxtBx = MobileBy.AndroidUIAutomator(String.format("new UiSelector().text(\"Email address or phone number\")"));
	private By confirmPassword = By.xpath( "//android.widget.EditText[@index=13]");
	private By FirstNameTxtBx = By.xpath( "//android.widget.EditText[@index=5]");
	private By LastNameTxtBx = By.xpath( "//android.widget.EditText[@index=7]");
	private By emailIDTxtBx = By.xpath( "//android.widget.EditText[@index=9]");
	private By PasswordTxtBx = By.xpath( "//android.widget.EditText[@index=11]");
	private By userSignUpBtn =  MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))."
            + "scrollIntoView(new UiSelector().textContains(\"SIGN UP\"))");	 
	private By permissionAllow = By.id("com.android.permissioncontroller:id/permission_allow_button");
	private By allowOtpPermission = By.id("android:id/button1");
//	private By signupPhoneNo = By.xpath( "//android.widget.EditText[@text='10 digit phone number']");
	private By loginpasswordTxtBx = By.xpath( "//android.widget.EditText[@text='Enter password']");
	private By LoginBtn = By.xpath("//android.view.ViewGroup[@index=8]");
	private By specialityDropDown = By.xpath( "//android.widget.EditText[@text='Select specialty']");
//	private By stateDropDown = By.xpath( "//android.widget.EditText[@text='Select your state']");
//	private By registrationNoTxtBx = By.xpath( "//android.widget.EditText[@text='Enter Registration Number']");



	public DronaLoginPage() {
	initProp() ;
	testUtil = new TestUtilNew();
	}

	public void getStartedClick() {
	WebElement getStartedclk = driver.findElement(getStartedBtn);
	getStartedclk.click();
	}

	
	public void loginByUserName(String username) {

	getStartedClick();
	testUtil.dosendKeys(usernameTxtBx, 10, username ,"Username textbox");
	testUtil.doClick(loginContinue ,"Contniue Button to login");
	}
	public void enterLoginPassword() {

	testUtil.dosendKeys(loginpasswordTxtBx, 10, prop.getProperty("Password") , "User Password");
	}


	public void loginByMobileNumber() {
	getStartedClick();
	String MobileNo = prop.getProperty("LoginMobileNo").replaceAll(" ", "");
	loginByUserName(MobileNo);
	enterLoginPassword();
	testUtil.doClick(LoginBtn , "Login Button");
	}

	public void loginByEmailID() {
	getStartedClick();
	String emailID = prop.getProperty("LoginEmailId").replaceAll(" ", "");
	loginByUserName(emailID);
	enterLoginPassword();
	testUtil.doClick(LoginBtn , "Login Button");
	}
	public void enterProfessionalDetail() {

	testUtil.doClick(specialityDropDown , "speciality DropDown");

	}

	public String userSignUp() {

	String FirstName = fakeData.name().firstName();
	testUtil.staticWait(1000);
	testUtil.dosendKeys(FirstNameTxtBx, 10,FirstName , "FirstName");
	testUtil.dosendKeys(LastNameTxtBx, 10, fakeData.name().lastName() , "LastName");
	testUtil.dosendKeys(PasswordTxtBx, 10,"Kaalo@1234" , "password" );
	testUtil.dosendKeys(confirmPassword, 10,"Kaalo@1234" , "Confirm password");
	return FirstName;
	}
	
	public void allowPermission() {
	testUtil.doClick(permissionAllow , "Allow Permission");
	testUtil.doClick(allowOtpPermission , "Otp Allow Permission");
	}

	public void mobileSignup() {

	String FirstName = userSignUp();
	testUtil.dosendKeys(emailIDTxtBx, 10, FirstName + "@gmail.com" , "Email Id ");
	testUtil.doClick(userSignUpBtn , "User SignUp Button");
	allowPermission();
	}

	public void emailSignUp() {

	loginByUserName(prop.getProperty("SignUpEmailID"));
	/*
	* userSignUp(); testUtil.dosendKeys(signupPhoneNo, 10,
	* prop.getProperty("SignUpEmailMobileNo") , " sign Up Phone Number");
	* testUtil.doClick(userSignUpBtn , "User SignUp Button");
	*/
	//allowPermission();

	testUtil.staticWait(100000);
	enterProfessionalDetail();
	}
	
	
	
	
	
	
}
