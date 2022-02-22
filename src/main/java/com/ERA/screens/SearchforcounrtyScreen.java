package com.ERA.screens;
import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchforcounrtyScreen extends Base {
	@AndroidFindBy (id="com.eci.era:id/searchview_countryTv")
	private MobileElement serchformuber;

	public void Searchcounrtycode() {
		
		serchformuber.sendKeys("20");
	}
}

