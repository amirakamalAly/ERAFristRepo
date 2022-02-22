package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddMobileNumberScreen extends Base{
	@AndroidFindBy (id="com.eci.era:id/phoneEdt")
	private MobileElement addMobile;

	
	
	public void addMobile( String Name,String  mobileNumber) {
		
		System.out.println(mobileNumber);
		// TODO Auto-generated method stub
		addMobile.sendKeys("mobileNumber");
	}
	

}
