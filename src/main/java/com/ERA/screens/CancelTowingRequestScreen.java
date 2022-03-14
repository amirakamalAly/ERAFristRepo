package com.ERA.screens;

import java.util.concurrent.TimeUnit;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CancelTowingRequestScreen extends Base {

	@AndroidFindBy (id="com.eci.era:id/tvCancelRequest")
	private MobileElement clickCancel;

	public void confirmCancelTowingRequest() {
     

		// TODO Auto-generated method stub
		clickCancel.click();
	}
	
	@AndroidFindBy (id="com.eci.era:id/btnCancel")
	private MobileElement clickCancelBn;

	public void ClickCancelTowingRequest() {
		// TODO Auto-generated method stub
    

		clickCancelBn.click();
	}	
}
