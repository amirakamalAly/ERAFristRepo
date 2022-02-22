package com.ERA.screens;
import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClickloginbuttonfromHomescreen extends Base {
	
	@AndroidFindBy (id="com.eci.era:id/loginBtnMain")
	private MobileElement clcikLogin;

     public void Clickloginbutton()
{
	   clcikLogin.click();	

}
}
