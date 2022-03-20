package com.ERA.testcases;

import org.testng.annotations.Test;
import com.ERA.base.Base;

import com.ERA.screens.AssertInvalidOtpScreen;
import com.ERA.screens.ClickloginbuttonfromHomescreen;

public class LoginWithInvalidSmsCodeTest extends Base {

	@Test(priority = 3)
	public void clcikLogin()

	{
		ClickloginbuttonfromHomescreen clicklogin = new ClickloginbuttonfromHomescreen();
		clicklogin.Clickloginbutton();

	}

	@Test(priority = 4)

	public void SelectCountyCode()

	{
		ClickloginbuttonfromHomescreen countrycode = new ClickloginbuttonfromHomescreen();
		countrycode.Clickcounrtycode();

	}

	@Test(priority = 5)

	public void Searchforcounrty()

	{

		ClickloginbuttonfromHomescreen Search = new ClickloginbuttonfromHomescreen();
		Search.Searchcounrtycode();

	}

	@Test(priority = 6)

	public void SelectEgypt()

	{
		ClickloginbuttonfromHomescreen countryEgypt = new ClickloginbuttonfromHomescreen();
		countryEgypt.ClickEgypt();

	}

	@Test(dataProvider = "loginUsers", priority = 7)

	public void addMobileNumber(String Name, String MobileNumber)

	{
		System.out.println(
				"entring  mobile number from excel sheet to mobile number verfication screen  " + MobileNumber);
		ClickloginbuttonfromHomescreen MobileNumberq = new ClickloginbuttonfromHomescreen();
		MobileNumberq.AddMobileNumberScreen(Name, MobileNumber);

	}

	@Test(priority = 8)
	public void clickContinue()

	{
		ClickloginbuttonfromHomescreen continueBtn = new ClickloginbuttonfromHomescreen();
		continueBtn.continueBtnclk();

	}

	@Test(dataProvider = "loginUsers", priority = 9)
	public void getotp(String Name, String MobileNumber)

	{

		ClickloginbuttonfromHomescreen addInvalidOtp = new ClickloginbuttonfromHomescreen();

		String a = null;
		String b = null;
		String c = null;
		String d = null;

		addInvalidOtp.addInvalidOtp(a, b, c, d);

	}

	@Test(priority = 10)
	public void AssertInvalidOtp()

	{
		AssertInvalidOtpScreen Dvw = new AssertInvalidOtpScreen();
		Dvw.AssertInvalidOtp();

	}
	
	
	@Test(priority = 11)
	public void ClickBackArrow()

	{
		ClickloginbuttonfromHomescreen Back = new ClickloginbuttonfromHomescreen();
		Back.ClickBackArrow();
		
}
	
	@Test(priority = 12)
	public void ClickBackTOHome()

	{
		ClickloginbuttonfromHomescreen Back = new ClickloginbuttonfromHomescreen();
		Back.ClickBackHome();
		
}
}
