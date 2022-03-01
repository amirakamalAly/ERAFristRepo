package com.ERA.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.AddMobileNumberScreen;
import com.ERA.screens.ClickloginbuttonfromHomescreen;
import com.ERA.screens.GetOtpScreen;
import com.ERA.screens.SearchforcounrtyScreen;
import com.ERA.screens.SelectCountyCodeScreen;
import com.ERA.screens.SelectEgyptScreen;
import com.ERA.screens.clickContinueScreen;

public class ClickloginbuttonfromHomescreenTest extends Base {

	

	@Test(priority = 3)
	public void clcikLogin()

	{
		ClickloginbuttonfromHomescreen clicklogin = new ClickloginbuttonfromHomescreen();
		clicklogin.Clickloginbutton();

	}

	@Test(priority = 4)

	public void SelectCountyCode()

	{
		SelectCountyCodeScreen countrycode = new SelectCountyCodeScreen();
		countrycode.Clickcounrtycode();

	}

	@Test(priority = 5)

	public void Searchforcounrty()

	{

		SearchforcounrtyScreen Search = new SearchforcounrtyScreen();
		Search.Searchcounrtycode();

	}

	@Test(priority = 6)

	public void SelectEgypt()

	{
		SelectEgyptScreen countryEgypt = new SelectEgyptScreen();
		countryEgypt.ClickEgypt();

	}

	@Test(dataProvider ="loginUsers",priority = 7)
	
	public void addMobileNumber(String Name,String MobileNumber)

	{
		AddMobileNumberScreen MobileNumberq = new AddMobileNumberScreen();
		MobileNumberq.AddMobileNumberScreen(Name,MobileNumber);

	}

	@Test(priority = 8)
	public void clickContinue()

	{
		clickContinueScreen continueBtn = new clickContinueScreen();
		continueBtn.continueBtnclk();

	}
	
	@Test(dataProvider ="loginUsers",priority = 9)
public void getotp(String Name,String MobileNumber) 
	
{
	
		String numberr = "20"+MobileNumber;
		System.out.println("otpmobile number"+numberr);
		String getotp=(String) new GetOtpTest().getotp(Name, numberr);
		System.out.print("this call otp "+getotp);
		
        int number1 = Integer.parseInt(getotp);
        int A = 0;int B = 0; int C = 0; int D = 0;
        String number2 = String.valueOf(number1);
        for(int i = 0; i < number2.length(); i++) {
            int j = Character.digit(number2.charAt(i), 10);
            System.out.println("digit: " + j);
             A=Character.digit(number2.charAt(0), 10);
             B=Character.digit(number2.charAt(1), 10);
             C=Character.digit(number2.charAt(2), 10);
             D=Character.digit(number2.charAt(3), 10);
                }
        String AA=String.valueOf(A); 
        String BB=String.valueOf(B);
        String CC=String.valueOf(C);
        String DD=String.valueOf(D);
        
        System.out.println(AA+"eeeeeeeeeee");
        GetOtpScreen addOtp = new GetOtpScreen();
        addOtp.addMobile(AA, BB, CC, DD);
        
        
}}
