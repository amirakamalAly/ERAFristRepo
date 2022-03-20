package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CancelFuelRequestScreen extends Base {

	@AndroidFindBy (id="com.eci.era:id/tvCancelRequest")
	private MobileElement clickCancel;

	public void confirmCancelFuelRequest() {
   
		clickCancel.click();
	}
	
	
	
	@AndroidFindBy (id="com.eci.era:id/btnCancel")
	private MobileElement clickCancelBn;

	public void ClickCancelFuelRequest() {
		// TODO Auto-generated method stub
    

		clickCancelBn.click();
	}	
}
