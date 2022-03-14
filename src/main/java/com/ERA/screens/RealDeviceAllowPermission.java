package com.ERA.screens;
import com.ERA.base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RealDeviceAllowPermission extends Base{

	
		@AndroidFindBy (id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
		private MobileElement allow;

	     public void RealDeviceAllowLocation()
	{
		   allow.click();	

	}
	
	
	
	
	
	
	
	
	
	
}
