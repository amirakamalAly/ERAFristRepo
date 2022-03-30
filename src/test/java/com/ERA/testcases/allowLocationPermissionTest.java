package com.ERA.testcases;
import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.RealDeviceAllowPermission;
import com.ERA.screens.allowLocationPermission;

public class allowLocationPermissionTest extends Base {

	@Test(priority = 2)
	public void clcallowLocationPermissionTestikLogin() 
	
	
	{
		
		//for emulator use below 2 commands
		//allowLocationPermission clickallowLocation= new allowLocationPermission();
	   //clickallowLocation.ClickallowLocation();

		
		
		//for real devices 
		
		RealDeviceAllowPermission clickallow =new RealDeviceAllowPermission();
		
		clickallow.RealDeviceAllowLocation();
		
		
			}
}
