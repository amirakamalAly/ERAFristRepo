package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class MenuScreen extends Base{
	@AndroidFindBy(id = "com.eci.era:id/btnMenu")
	private MobileElement MenuIcon;

	public void ClickMenuIcon() {
		// TODO Auto-generated method stub
		MenuIcon.click();
	}
}