package com.ERA.testcases;



import java.io.IOException;

import org.testng.annotations.Test;
import com.ERA.base.Base;

import com.ERA.screens.ClickloginbuttonfromHomescreen;
import com.ERA.screens.GetOtpScreen;


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

	@Test(dataProvider ="loginUsers",priority = 7)
	
	public void addMobileNumber(String Name,String MobileNumber)

	{
		System.out.println("entring  mobile number from excel sheet to mobile number verfication screen  "+ MobileNumber );
		ClickloginbuttonfromHomescreen MobileNumberq = new ClickloginbuttonfromHomescreen();
		MobileNumberq.AddMobileNumberScreen(Name,MobileNumber);

	}

	@Test(priority = 8)
	public void clickContinue()

	{
		ClickloginbuttonfromHomescreen continueBtn = new ClickloginbuttonfromHomescreen();
		continueBtn.continueBtnclk();

	}
	
	@Test(dataProvider ="loginUsers",priority = 9)
public void getotp(String Name,String MobileNumber) throws IOException 
	
{
		System.out.println("get otp for mobile number from excel sheet "+ MobileNumber );
	
		String numberr = "20"+MobileNumber;
		
		String getotp=(String) new GetOtpTest().getotp(Name, numberr);
		
		
		
		
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
        
      //  System.out.println(AA+"eeeeeeeeeee");
        GetOtpScreen addOtp = new GetOtpScreen();
        addOtp.addMobile(AA, BB, CC, DD);
        
        
}}
