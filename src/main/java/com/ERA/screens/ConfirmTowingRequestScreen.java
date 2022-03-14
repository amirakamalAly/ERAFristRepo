package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmTowingRequestScreen extends Base {

	@AndroidFindBy (id="com.eci.era:id/btnConfirmRequest")
	private MobileElement Confirm;

	public void confirmTowingRequest() {
		// TODO Auto-generated method stub
		Confirm.click();
	}

	@AndroidFindBy (id="com.eci.era:id/btnConfirmPayment")
	private MobileElement ConfirmPayment;

	public void confirmPaymrntTowingRequest() {
		// TODO Auto-generated method stub
		ConfirmPayment.click();
	}
	
	
}
