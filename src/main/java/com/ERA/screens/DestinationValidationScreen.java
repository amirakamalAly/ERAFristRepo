package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DestinationValidationScreen  extends Base {

	@AndroidFindBy (id="com.eci.era:id/tvAddress")
	private MobileElement Dest;

	public void DestinationSearch() {
		// TODO Auto-generated method stub
		Dest.click();
	}

}
