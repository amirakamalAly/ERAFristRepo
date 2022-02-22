package com.ERA.screens;
import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClcikUpdateLater extends Base {
	
	
	@AndroidFindBy (id="com.eci.era:id/tvUpdateLater")
	private MobileElement skipupdate;



public void clcikUpdateLaterbu()
{
	skipupdate.click();
	
}
}
