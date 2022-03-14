package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class subRequestScreen extends Base  {
	@AndroidFindBy (xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")
	private MobileElement NormalTowing;

	public void SelectNormalTowing() {
		// TODO Auto-generated method stub
		NormalTowing.click();
	}

}
