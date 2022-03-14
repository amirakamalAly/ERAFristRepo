package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmDestinationScreen  extends Base {
	@AndroidFindBy (id="com.eci.era:id/btnDropOff")
	private MobileElement confirmButton;
	
	
	public void ConfirmDestination() {
		// TODO Auto-generated method stub
		 confirmButton.click();
	}
}