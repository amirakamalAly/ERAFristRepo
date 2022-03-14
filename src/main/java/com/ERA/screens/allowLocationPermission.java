package com.ERA.screens;
import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class allowLocationPermission extends Base{
	//@AndroidFindBy (id="com.android.packageinstaller:id/permission_allow_button")
	@AndroidFindBy (id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private MobileElement allowLocation;

     public void ClickallowLocation()
{
	   allowLocation.click();	

}


}


