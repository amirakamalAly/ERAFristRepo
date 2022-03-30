package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RequestHistoryScreen extends Base{
//	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"طلباتي\")")
@AndroidFindBy(id = "com.eci.era:id/itemNavRequests")
	private MobileElement MenuRequestHistory;

	
	public void MenuRequestHistory() {
		// TODO Auto-generated method stub
		MenuRequestHistory.click();
	}

	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
	private MobileElement FristItemList;
	public void ClickFristItemRequestHistory() {
		// TODO Auto-generated method stub
		FristItemList.click();
	}
}
