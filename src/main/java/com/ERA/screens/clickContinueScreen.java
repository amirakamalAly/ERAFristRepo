package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class clickContinueScreen extends Base{
	
	
	@AndroidFindBy (id="com.eci.era:id/continueBtn")
	private MobileElement continueBtn;

	public void continueBtnclk() {
		continueBtn.click();	
	
	}

}
