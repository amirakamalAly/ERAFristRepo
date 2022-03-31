package com.ERA.screens.profile;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class profiletabFromMenu extends Base{

@AndroidFindBy(id = "com.eci.era:id/itemNavProfile")
	private MobileElement profile;

	
	public void clickprofiletabFromMenu() {
		// TODO Auto-generated method stub
		profile.click();
	}
}
