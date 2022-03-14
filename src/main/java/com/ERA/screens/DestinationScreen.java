package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DestinationScreen extends Base {

	@AndroidFindBy (id="com.eci.era:id/tvYourDestination")
	private MobileElement DEST;

	public void Destinationbox() {
		// TODO Auto-generated method stub
		DEST.click();
	}

}