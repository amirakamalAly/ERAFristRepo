package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectCountyCodeScreen  extends Base{
	@AndroidFindBy (id="com.eci.era:id/countryCodePickerContainer")
	private MobileElement countrycode ;

	public void Clickcounrtycode() {
		countrycode.click();	
		
	}

}
